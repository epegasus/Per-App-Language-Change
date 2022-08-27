package dev.pegasus.applanguagechange

import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat
import androidx.core.view.doOnPreDraw
import dev.pegasus.applanguagechange.databinding.ActivityMainBinding
import dev.pegasus.applanguagechange.databinding.StubLanguageDropDownBinding
import dev.pegasus.applanguagechange.helper.dataProvider.DPCountries

const val TAG = "Magic"

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val dpCountries by lazy { DPCountries() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Using 'doOnPreDraw' & 'viewStub' for drop-down to behave normally
        binding.root.doOnPreDraw {
            initExposedDropDown()
        }


        // Use the following line to get applied locale (language code)
        val defaultLanguageCode = AppCompatDelegate.getApplicationLocales().toLanguageTags()
        Log.d(TAG, "onCreate: $defaultLanguageCode")
    }

    private fun initExposedDropDown() {
        val view = binding.vsLanguageMain.inflate()
        val stubBinding = StubLanguageDropDownBinding.bind(view)
        val languageNames = dpCountries.getLanguagesList().map { it.second }
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, languageNames)
        stubBinding.actLanguageMain.setAdapter(arrayAdapter)

        // Item Click Listener
        stubBinding.actLanguageMain.onItemClickListener = AdapterView.OnItemClickListener { _, _, p2, _ ->
            val listItem = dpCountries.getLanguagesList()[p2]
            val appLocale: LocaleListCompat = LocaleListCompat.forLanguageTags(listItem.first)
            AppCompatDelegate.setApplicationLocales(appLocale)
        }
    }
}
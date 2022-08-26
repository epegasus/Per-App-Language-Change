package dev.pegasus.applanguagechange.helper.dataProvider

class DPCountries {

    fun getLanguagesList(): List<Pair<String, String>> {
        val arrayList = ArrayList<Pair<String, String>>()
        arrayList.apply {
            add(Pair("en", "English"))
            add(Pair("zh", "Chinese"))
            add(Pair("de", "German"))
            add(Pair("ur", "Urdu"))
        }
        return arrayList.toList()
    }
}
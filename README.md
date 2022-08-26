# Per-App-Language-Change

Change app language using following steps

Step-1
    In Manifest, add a service

    <!--Must add this service for android 12 or lower && 'autoStoreLocales' means to save value in Shared Preference-->
        <service
            android:name="androidx.appcompat.app.AppLocalesMetadataHolderService"
            android:enabled="false"
            android:exported="false">
            <meta-data
                android:name="autoStoreLocales"
                android:value="true" />
        </service>
    
Step-2
    In Gradle (app), add following
    
      a)
        /* Must update compile SDK & target SDK to 33 for Appcompat 1.6.0-beta01 or higher. */
        compileSdk 33
        targetSdk 33
        
      b)
        /* Must update dependency Appcompat 1.6.0-beta01 or higher. */
        implementation 'androidx.appcompat:appcompat:1.6.0-beta01'
    
Step-3

    Add string.xml for your desired languages
    
Step-4

    //Pass language code to following function to update app locale e.g. "en" for english
      
    val appLocale: LocaleListCompat = LocaleListCompat.forLanguageTags("en")
    AppCompatDelegate.setApplicationLocales(appLocale)
    
Happy Coding!

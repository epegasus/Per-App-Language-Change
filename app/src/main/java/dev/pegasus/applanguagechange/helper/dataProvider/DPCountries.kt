package dev.pegasus.applanguagechange.helper.dataProvider

class DPCountries {

    fun getLanguagesList(): List<Pair<String, String>> {
        val arrayList = ArrayList<Pair<String, String>>()
        arrayList.apply {
            add(Pair("en", "English"))
            add(Pair("af", "Afrikaans"))
            add(Pair("ar", "Arabic"))
            add(Pair("bn", "Bengali"))
            add(Pair("zh", "Chinese"))
            add(Pair("cs", "Czech"))
            add(Pair("da", "Danish"))
            add(Pair("nl", "Dutch"))
            add(Pair("fi", "Finnish"))
            add(Pair("fr", "French"))
            add(Pair("de", "German"))
            add(Pair("hi", "Hindi"))
            add(Pair("in", "Indonesian"))
            add(Pair("it", "Italian"))
            add(Pair("ja", "Japanese"))
            add(Pair("ko", "Korean"))
            add(Pair("ms", "Malay"))
            add(Pair("fa", "Persian"))
            add(Pair("pl", "Polish"))
            add(Pair("pt", "Portuguese"))
            add(Pair("ru", "Russian"))
            add(Pair("es", "Spanish"))
            add(Pair("sv", "Swedish"))
            add(Pair("ta", "Tamil"))
            add(Pair("th", "Thai"))
            add(Pair("tr", "Turkish"))
            add(Pair("uk", "Ukrainian"))
            add(Pair("ur", "Urdu"))
            add(Pair("vi", "Vietnamese"))
        }
        return arrayList.toList()
    }


}
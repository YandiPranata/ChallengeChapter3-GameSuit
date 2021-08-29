package GameSuit

class Proses {

    open val Pemain1:String=""
    open val Pemain2:String=""

    open fun mulaiGame () : String {
        if (Pemain1 == Pemain2) {
            return """
                
                Hasil:
                DRAW""".trimIndent()
        } else {
            return
        }
    }

}
fun lerDouble(mensagem: String): Double {
    print(mensagem)
    return readLine()!!.trim().replace(",", ".").toDouble()
}


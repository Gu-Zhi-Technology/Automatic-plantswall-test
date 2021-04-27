fun main(args: Array<String>) {
    val host = "127.0.0.1"
    val port = 2332
    while (true) {
        var a = ""
        a = ClientSo(host, port).run().toString()
        println(a)
    }
}
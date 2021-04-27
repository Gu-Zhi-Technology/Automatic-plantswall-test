import com.example.myapplication.socket
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.Socket

class ClientSo(host: String, port: Int) : Socket(host, port) {
    var reader = BufferedReader(InputStreamReader(inputStream))
    fun run(): String? {
        while (true) {
            val line = reader.readLine()
            if (line != null)
                return line
        }
    }
}

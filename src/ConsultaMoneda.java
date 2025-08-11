import java.net.URI; // Importa la clase URI para manejar direcciones web
import java.net.http.HttpClient; // Importa HttpClient para hacer solicitudes HTTP
import java.net.http.HttpRequest; // Importa HttpRequest para construir la solicitud HTTP
import java.net.http.HttpResponse; // Importa HttpResponse para manejar la respuesta HTTP
import com.google.gson.Gson; // Importa Gson para convertir JSON a objetos Java y viceversa

public class ConsultaMoneda {
    // Constante que guarda la API Key (clave privada para acceder a la API)
    private static final String API_KEY = "c650ccb0df797c4f5b7d9a8c";

    // URL base para hacer la consulta, que incluye la API Key y la palabra 'latest/'
    private static final String URL_BASE = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    // Metodo publico que recibe un codigo de moneda (por ejemplo, "USD") y devuelve un objeto Moneda con los datos
    // Lanza Exception para ver posibles errores
    public Moneda buscaValor(String moneda) throws Exception {
        // Construye la URI (direccion web) concatenando la base con la moneda a consultar
        URI direccion = URI.create(URL_BASE + moneda);

        // Crea un cliente HTTP para enviar solicitudes a servidores
        HttpClient client = HttpClient.newHttpClient();

        // Construye la solicitud HTTP (GET por defecto) con la URI creada
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        // Envia la solicitud y recibe la respuesta en formato String (el cuerpo de la respuesta)
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Verifica que haya funcionado (codigo 200 significa OK)
        if (response.statusCode() == 200) {
            // Uso Gson para convertir el JSON de la respuesta a un objeto Moneda y lo devuelve
            return new Gson().fromJson(response.body(), Moneda.class);
        } else {
            // Si hubo error (codigo distinto de 200), lanza una excepcion con el codigo de error
            throw new RuntimeException("Error en la consulta de moneda: " + response.statusCode());
        }
    }
}

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



public class ConsultarMoneda {

    public Moneda buscarMoneda(String monedaBase, String monedaAConvertir){

        URI uriDireccion = URI.create("https://v6.exchangerate-api.com/v6/260d3647fbc6a22a79733437/pair/"+monedaBase+"/"+monedaAConvertir);


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(uriDireccion)))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        }catch (Exception e){
            System.out.println("Error en la llamada a la api" + e.getMessage());
        throw new Error("Problema en la llamada a la Api");
        }
    }

}

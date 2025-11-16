package org.example.API;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarApi {


    private String respuesta;
    private String Apikey = "3282738fe8d7291df5ba404b";


    public String AccederApiPorPares(String parametro) {
        String direcccionEnPares = "https://v6.exchangerate-api.com/v6/"+Apikey+"/pair/"+parametro+"/USD";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direcccionEnPares))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            respuesta = response.body();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
            respuesta = null;
        }
        return respuesta;
    }

    public String AccederApi(String parametro) {
        String direcccionEnPares = "https://v6.exchangerate-api.com/v6/"+Apikey+"/pair/USD/"+parametro;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direcccionEnPares))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            respuesta = response.body();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
            respuesta = null;
        }
        return respuesta;
    }

}

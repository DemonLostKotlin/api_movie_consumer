package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        // montar uma conexao http para chamar a api do imdb

        String url = "https://imdb-api.com/";

        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();

        System.out.println(body);

        //buscar os top 250 filmes
        //extrair os dados que nos interessam a partir do response(titulo, poster e rating)
        //exibir e manipular oa dados
    }
}
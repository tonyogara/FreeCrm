package RestAPI_Grp_Id.RestAPI_Art_Id;



import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.io.IOException;

public class RestApiClient {
    public static void main(String[] args) {
        // Create an HttpClient
        HttpClient client = HttpClient.newHttpClient();

        // Define the API URL
        //String apiUrl = "https://jsonplaceholder.typicode.com/posts/1"; // Example API
        String apiUrl = "https://jsonplaceholder.typicode.com/posts/1"; // Example API

        // Create an HttpRequest
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .GET()
                .header("Accept", "application/json") // Set headers
                .build();

        // Send the request and get response
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            
            // Print response details
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

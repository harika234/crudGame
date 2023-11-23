package Fundamentals;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
public class Api {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        String apikey = "1069d1c5349798d4f37c8acdfe4cdae1";
        String url = "https://api.openweathermap.org/data/2.5/weather?q="+name+"&appid="+apikey;
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpClient client = HttpClient.newBuilder().build();
        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());

    }
}


//{
//        "coord": {
//        "lon": 77.2167,
//        "lat": 28.6667
//        },
//        "weather": [
//        {
//        "id": 711,
//        "main": "Smoke",
//        "description": "smoke",
//        "icon": "50d"
//        }
//        ],
//        "base": "stations",
//        "main": {
//        "temp": 299.2,
//        "feels_like": 299.2,
//        "temp_min": 299.2,
//        "temp_max": 299.2,
//        "pressure": 1017,
//        "humidity": 41
//        },
//        "visibility": 1500,
//        "wind": {
//        "speed": 2.06,
//        "deg": 260
//        },
//        "clouds": {
//        "all": 20
//        },
//        "dt": 1700041218,
//        "sys": {
//        "type": 1,
//        "id": 9165,
//        "country": "IN",
//        "sunrise": 1700010808,
//        "sunset": 1700049480
//        },
//        "timezone": 19800,
//        "id": 1273294,
//        "name": "Delhi",
//        "cod": 200
//        }

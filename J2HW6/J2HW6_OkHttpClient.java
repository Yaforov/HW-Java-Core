package J2HW6;
/**
 * Java Core.  Homework 6
 * @author Yaforov Roman
 * @version Date: 01.06.2022 г.
 */

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import java.io.IOException;

public class J2HW6_OkHttpClient {

        private static final String BASE_HOST = "dataservice.accuweather.com";
        private static final String FORECAST = "forecasts";
        private static final String API_VERSION = "v1";
        private static final String FORECAST_TYPE = "daily";
        private static final String FORECAST_PERIOD = "5day";
        private static final String KIROV_KEY = "288509_PC";
        private static final String API_KEY = "BjJg8bbgogBpnDEQ36DwF8OBiENJjsoi";

        public static void main(String[] args) throws IOException {

            OkHttpClient client = new OkHttpClient();

            HttpUrl url = new HttpUrl.Builder()
                    .scheme("http")
                    .host(BASE_HOST)
                    .addPathSegment(FORECAST)
                    .addPathSegment(API_VERSION)
                    .addPathSegment(FORECAST_TYPE)
                    .addPathSegment(FORECAST_PERIOD)
                    .addPathSegment(KIROV_KEY)
                    .addQueryParameter("apikey", API_KEY)
                    .addQueryParameter("language", "ru-ru")
                    .addQueryParameter("metric", "true")
                    .build();

            System.out.println(url.toString());

            Request requesthttp = new Request.Builder()
                    .addHeader("accept", "application/json")
                    .url(url)
                    .build();

            String jsonResponse = client.newCall(requesthttp).execute().body().string();
            System.out.println(jsonResponse);
        }
    }



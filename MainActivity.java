package com.example.asus.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List jsonList = getCreateList();
        Log.e("Liste Size","Size: " + jsonList.size());

        //TextView tv = (TextView) findViewById(R.id.tv);
        //tv.setText("Gelen JsonListe Size : " + jsonList.size());
    }

    public List<Kategori> getCreateList() {
        String jsonData = get();

        List<Kategori> list = new ArrayList<>();

        try {
            JSONArray tokens = new JSONArray(jsonData);
            for (int i = 0; i < tokens.length(); i++) {
                JSONObject jo = tokens.getJSONObject(i);
                int id = jo.getInt("ID");
                int katid = jo.getInt("IDKategori");
                String katbas = jo.getString("KategoriBaslik");
                String katres = jo.getString("KategoriResim");
                int altkat = jo.getInt("AltKategoriSayi");
                Kategori kategori = new Kategori(id, katid, katbas, katres, altkat);
                list.add(kategori);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.e("Size", "Size : " + list.size());

        return list;



    }

    public String get() {
        String str = "";
        try {
            String adr = "http://www.yakinbul.com/_ws/veri.php?data=kategori";
            URL url = new URL(adr);
            HttpURLConnection ucon = (HttpURLConnection) url.openConnection();
            ucon.setDoInput(true);
            ucon.setReadTimeout(30000);
            ucon.setRequestMethod("GET");
            ucon.setRequestProperty("Content-Type", "application/json");
            BufferedReader in = new BufferedReader(new InputStreamReader(ucon.getInputStream()));
            str = in.readLine();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

}






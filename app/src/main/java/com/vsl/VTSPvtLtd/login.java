package com.vsl.VTSPvtLtd;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class login extends AppCompatActivity {


    EditText name, pass;
    Button save;
    String url, nam, pas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name = findViewById(R.id.editName);
        pass = findViewById(R.id.editPass);
        save = findViewById(R.id.LOGIN);

        Toast.makeText(this, "9868389415", Toast.LENGTH_LONG).show();

        save.setOnClickListener(view -> {

            nam = name.getText().toString();
            pas = pass.getText().toString();

            if (TextUtils.isEmpty(nam)) {
                name.setError("Empty");
                name.requestFocus();
            } else if (TextUtils.isEmpty(pas)) {
                pass.setError("Empty");
                pass.requestFocus();
            } else {
                url = "http://103.125.53.126:9222/API/LoadingList?userid=" + nam + "&password=" + pas;
                processData();
            }
        });

    }

    public void processData() {

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    if (response.getString("Result").equals("True")) {
                        Toast.makeText(login.this, "Result is: "+response.getString("Result"), Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(login.this, MainActivity.class));
                    }else{
                        Toast.makeText(login.this, "Result is: "+response.getString("Result"), Toast.LENGTH_SHORT).show();
                        Toast.makeText(login.this, "Enter correct detail", Toast.LENGTH_SHORT).show();
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_LONG).show();

            }
        }
        );

        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        queue.add(jsonObjectRequest);

    }
}
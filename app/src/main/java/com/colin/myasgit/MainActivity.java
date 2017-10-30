package com.colin.myasgit;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_feature_1;
    private Button btn_feature_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_feature_1 = findViewById(R.id.btn_feature_1);
        btn_feature_3 = findViewById(R.id.btn_feature_3);
    }

    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn_feature_1:
                toast(getString(R.string.feature_1));
                break;
            case R.id.btn_feature_3:
                feature3();
                break;
        }
    }

    private void toast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void feature3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        AlertDialog alertDialog = builder.setMessage(getString(R.string.feature_3))
                .create();
        alertDialog.show();
    }
}

package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama, tvnomor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama)
        {
            case "Inayah":
                tvnama.setText("Inayah");
                tvnomor.setText("082222222221");
                break;
            case "Ilham":
                tvnama.setText("Ilham");
                tvnomor.setText("082222222222");
                break;
            case "Eris":
                tvnama.setText("Eris");
                tvnomor.setText("082222222223");
                break;
            case "Fikri":
                tvnama.setText("Fikri");
                tvnomor.setText("082222222224");
                break;
            case "Maul":
                tvnama.setText("Maul");
                tvnomor.setText("082222222225");
                break;
            case "Intan":
                tvnama.setText("Intan");
                tvnomor.setText("082222222221");
                break;
            case "Vina":
                tvnama.setText("Vina");
                tvnomor.setText("082222222222");
                break;
            case "Gita":
                tvnama.setText("Gita");
                tvnomor.setText("082222222223");
                break;
            case "Vian":
                tvnama.setText("Vian");
                tvnomor.setText("082222222224");
                break;
            case "Luthfi":
                tvnama.setText("Luthfi");
                tvnomor.setText("082222222225");
                break;
        }
    }
}
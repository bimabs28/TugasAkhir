package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * main class Skoring
 */
public class Skoring extends AppCompatActivity {


    /**
     * membuat variabel baru
     * menampilkan text pada HasilAkhir
     * Button Submit untuk mensubmit jawaban
     */

    TextView mtvHasilAkhir;
    Button mbtnMenu;

    /**
     * @description method onCreate biasanya untuk menginisialisasi aktivitas
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skoring);

        /**
         * menyambungkan antara variabel Skoring.java dengan id activity_skoring
         */

        mtvHasilAkhir = (TextView) findViewById(R.id.tvSkorAkhir);
        mbtnMenu = (Button) findViewById(R.id.btnMenu);

        /**
         * untuk set konten
         */

        setSkor();

        /**
         * menentukan aksi ketika button submit diklik
         */

        mbtnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //aksinya disini
                //aksinya adalah ketika button tersebut diklik maka
                //akan berpindah pada halaman MainActivity.class

                Intent i = new Intent(Skoring.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    /**
    *method untuk mengatur skor yang akan ditampilkan pada textview
    */
    private void setSkor() {
        /**
        *hasil lemparan (putExtra) dari activity sebelumnya ditampung dalam variabel lokal
        */
        String activity = getIntent().getStringExtra("activity");
        String skorPilGan = getIntent().getStringExtra("skorAkhir");

        if(activity.equals("PilihanGanda")) {
            //jika var activity bernilai PilihanGanda
            //dipastikan activity sebelumnya datang dari kelas PilihanGanda
            //maka skornya diatur dari skorPilGan
            mtvHasilAkhir.setText("SKOR : " + skorPilGan);
        }
    }


    /**
    *Jika akan muncul toast dengan pesan "Tidak bisa kembali, silahkan tekan menu"
    */
    public void onBackPressed(){
        Toast.makeText(this, "Tidak bisa kembali, silahkan tekan menu", Toast.LENGTH_SHORT).show();
        //jadi yang awalnya klik tombol back maka akan kembali ke activity sebelumnya
        //kali ini ketika tombol back diklik maka
        //hanya muncul Toast
    }
}
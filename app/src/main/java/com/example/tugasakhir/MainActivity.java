package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    /**
     * menghubungkan button start dengan mainactivity
     */
    Button mbtnStart;

    /**
     * @description method onCreate biasanya untuk menginisialisasi aktivitas
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * menyambungkan variabel pada MainActivity.java dengan id pada activity_main
         */
        mbtnStart = (Button) findViewById(R.id.btnStart);


        /**
         * memberi aksi ketika di klik
         */
        mbtnStart.setOnClickListener(new View.OnClickListener() {

            /**
             * hasil aksinya ditulis disini (dalam method onClick)
             */
            @Override
            public void onClick(View v) {
                /**
                 * membuat objek baru dari kelas intent,
                 * dari MainActivity akan pindah ke kelas PilihanGanda
                 */
                Intent i = new Intent (MainActivity.this, PilihanGanda.class);
                startActivity(i);
            }
        });
    }
}
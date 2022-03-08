package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * main class PilihanGanda
 */
public class PilihanGanda extends AppCompatActivity {
    /**
     * membuat variabel baru
     * menampilkan text pada Skor dan Soal
     * RadioGroup untuk memilih jawaban
     * RadioButton untuk menulis Pilihan Ganda
     * Button Submit untuk mensubmit jawaban
     */
    TextView mtvSkor, mtvSoal;
    RadioGroup mrgPilihanJawaban;
    RadioButton mrbPilihanJawaban1, mrbPilihanJawaban2, mrbPilihanJawaban3;
    Button mbtnSubmit;
    int skor = 0;
    /**
     * int arr untuk menampunf nilai panjang array
     * int x menunjukkan konten sekarang
     * String jawaban untuk menampung jawaban benar
     */
    int arr;
    int x;
    String jawaban;

    /**
     * membuat objek dari kelas SoalPG.java
     */
    SoalPG soalPG = new SoalPG();

    /**
     * @description method onCreate biasanya untuk menginisialisasi aktivitas
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan_ganda);

        /**
         * menyambungkan antara variabel PilihanGanda.java dengan id activity_pilihan_ganda
         */
        mtvSkor = (TextView) findViewById(R.id.tvSkor);
        mtvSoal = (TextView) findViewById(R.id.tvSoal);
        mrgPilihanJawaban = (RadioGroup) findViewById(R.id.rgPilihanJawaban);
        mrbPilihanJawaban1 = (RadioButton) findViewById(R.id.rbPilihanJawaban1);
        mrbPilihanJawaban2 = (RadioButton) findViewById(R.id.rbPilihanJawaban2);
        mrbPilihanJawaban3 = (RadioButton) findViewById(R.id.rbPilihanJawaban3);
        mbtnSubmit = (Button) findViewById(R.id.btnSubmit);

        /**
         * untuk set konten
         */
        mtvSkor.setText(""+skor);
        setKonten();

        /**
         * menentukan aksi ketika button submit diklik
         */
        mbtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //aksinya disini
                //aksinya adalah ketika button tersebut diklik maka
                //akan mengecek jawaban benar atau salah
                //kemudian konten akan berubah (next konten)
                cekJawaban();
            }
        });
    }

    /**
     * method untuk mengambil dan update konten dari SoalPG.java
     * kemudian disetting atau ditempatkan pada tempat yang telah disediakan
     */
    private void setKonten() {
        mrgPilihanJawaban.clearCheck();
        arr = soalPG.pertanyaan.length;
        /**
        *jika nilai x melebihi nilai arr(panjang array) maka akan pindah activity (kuis selesai)
        */
        if (x >= arr) { 
            /**
             *menjadikan skor menjadi string
             */
            String jumlahSkor = String.valueOf(skor);   
            Intent i = new Intent(PilihanGanda.this, Skoring.class);

            /**
             *waktu pindah activity, sekalian membawa nilai jumlahSkor yang ditampung dengan inisial skorAkhir, singkatnya skorAkhir = jumlahSkor
             */
            i.putExtra("skorAkhir", jumlahSkor);
            i.putExtra("activity", "PilihanGanda");
            startActivity(i);
        } else {
            /**
             *setting text dengan mengambil text dari method getter di kelas SoalPG
             */
            mtvSoal.setText(soalPG.getPertanyaan(x));
            mrbPilihanJawaban1.setText(soalPG.getPilihanJawaban1(x));
            mrbPilihanJawaban2.setText(soalPG.getPilihanJawaban2(x));
            mrbPilihanJawaban3.setText(soalPG.getPilihanJawaban3(x));
            jawaban = soalPG.getJawabanBenar(x);

        }
        x++;
    }

    public void cekJawaban() {
        /**
         *jika radio button 1 diklik
         */
        if (mrbPilihanJawaban1.isChecked()) {
            /**
             *jika text yang tertulis di radio button tsb = nilai dari var jawaban
             */
            if (mrbPilihanJawaban1.getText().toString().equals(jawaban)) {
                skor = skor + 10;
                /**
                 *mtvSkor diset nilainya = var skor
                 */
                mtvSkor.setText("" + skor); 
                /**
                 *keluar notifikasi "Jawaban Benar"
                 */
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();  
                /**
                 *update next konten
                 */ 
                setKonten();     
            } else {
                mtvSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        } else if (mrbPilihanJawaban2.isChecked()) {
            /**
             *jika text yang tertulis di radio button tsb = nilai dari var jawaban
             */
            if (mrbPilihanJawaban2.getText().toString().equals(jawaban)) {
                skor = skor + 10;
                /**
                 *mtvSkor diset nilainya = var skor
                 */
                mtvSkor.setText("" + skor); 
                /**
                 *keluar notifikasi "Jawaban Benar"
                 */
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();   
                /**
                 *update next konten
                 */
                setKonten(); 
            } else {
                mtvSkor.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else if(mrbPilihanJawaban3.isChecked()){
            /**
             *jika text yang tertulis di radio button tsb = nilai dari var jawaban
             */
            if(mrbPilihanJawaban3.getText().toString().equals(jawaban)){
                skor = skor + 10;
                /**
                 *mtvSkor diset nilainya = var skor
                 */
                mtvSkor.setText(""+skor);   
                /**
                 *keluar notifikasi "Jawaban Benar"
                 */
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();   
                setKonten();    //update next konten
            }else{
                mtvSkor.setText(""+skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else{
            /**
             *ini jika belum memilih jawaban tapi sudah di klik next maka muncul notif "Silahkan pilih jawaban dulu!"
             */
            Toast.makeText(this, "Silahkan pilih jawaban dulu!", Toast.LENGTH_SHORT).show();    
        }
    }

    public void onBackPressed(){
        Toast.makeText(this, "Selesaikan kuis", Toast.LENGTH_SHORT).show();
        //jadi yang awalnya klik tombol back maka akan kembali ke activity sebelumnya
        //kali ini ketika tombol back diklik maka
        //hanya muncul Toast
    }
}
package com.example.tugasakhir;

public class SoalPG {

    //membuat array untuk pertanyaan
    public  String pertanyaan[] = {
            "Siapakah Kaprodi dari TI UMY?",
            "Di gedung manakah prodi Teknologi Informasi berada?",
            "Suatu jaringan komputer yang menghubungkan suatu komputer dengan komputer lain dengan jarak yang terbatas disebut dengan?",
            "Sebutkan pengertian dari Jaringan Nirkabel (Wireless Network)?",
            "Sebutkan yang termasuk sistem bilangan?",
            "Bilangan hexa decimal dibawah ini yang benar adalah ...",
            "bilangan octal adalah bilangan yang memiliki basis?",
            "Pihak yang meminta layanan disebut?",
            "Berdasarkan topologi jaringan, jaringan komputer dapat dibedakan menjadi?",
            "Apa yang dimaksud dengan peer to peer?",
    };

    private  String pilihanJawaban [][] = {

            //membuat array untuk pilihan jawaban
            {"Pak Giga ", "Pak Asep Setiawan ", "Bapak Asroni"},
            {"Gedung E7", "Gedung F4", "Gedung G5"},
            {"LAN", "WAN", "PAN"},
            {"menghubungkan satu komputer dengan komputer lain", "Merupakan jaringan dengan medium berupa gelombang elektromagnetik", "Jaringan Perantara"},
            {"Desimal", "Ganjil", "Genap"},
            {"0.1.2.3.4.5.6.7", "0.1.2.3.4.5.6.7.8.9.A.B.C.D.E.F", "0.1.2.3.4.5.6.7.8.9"},
            {"2", "8", "10"},
            {"Server", "Komputer", "Client"},
            {"7", "3", "6"},
            {"Yaitu jaringan komputer dimana setiap host dapat menjadi server dan juga\n" +
                    "menjadi client secara bersamaan.", "jaringan komputer dengan komputer yang didedikasikan khusus sebagai server.", "Akses informasi"},

    };

    private String jawabanBenar [] = {

            //membuat array untuk jawaban benar
            "Bapak Asroni",
            "Gedung F4",
            "LAN",
            "Merupakan jaringan dengan medium berupa gelombang elektromagnetik",
            "Desimal",
            "0.1.2.3.4.5.6.7.8.9.A.B.C.D.E.F",
            "8",
            "Client",
            "6",
            "Yaitu jaringan komputer dimana setiap host dapat menjadi server dan juga\n" +
                    "menjadi client secara bersamaan.",
    };

    public String getPertanyaan(int x){

        //membuat getter untuk mengambil pertanyaan
        String soal = pertanyaan[x];
        return soal;
    }

    public String getPilihanJawaban1(int x) {

        //membuat getter untuk mengambil pilihan jawaban 1
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }
    public String getPilihanJawaban2(int x){

        //membuat getter untuk mengambil pilihan jawaban 2
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    public String getPilihanJawaban3(int x){

        //membuat getter untuk mengambil pilihan jawaban 3
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    public String getJawabanBenar(int x){

        //membuat getter untuk mengambil jawaban benar
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
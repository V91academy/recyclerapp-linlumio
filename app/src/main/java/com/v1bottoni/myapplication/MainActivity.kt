package com.v1bottoni.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.v1bottoni.myapplication.adapter.RecycledAdapter

class MainActivity : AppCompatActivity() {
    lateinit var recycler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val listaString = listOf<String>("Pippo", "Pluto", "Topolino", "Paperino")

        var listaDeiBoomer = listOf(BoomerCard("https://www.kulturjam.it/wp-content/uploads/Il-rito-del-Buongiornissimo-e-il-totem-della-pulizia-contatti-5.jpg", "Titolo prova", "txt1 prova", "txt2 prova"), BoomerCard("https://www.magicobuongiorno.it/wp-content/uploads/2018/10/Buongiornissimo-caffe-immagini-belle-per-Whatsapp-Nuove.jpg", "Macchinetta Strong", "testo-sterone", "pippo"), BoomerCard("https://www.immaginifacebook.it/wp-content/uploads/2019/01/Buongiornissimo-Buon-Luned%C3%AC.jpg", "luigi", "fiori", "datemideisoldi"), BoomerCard("https://play-lh.googleusercontent.com/53J1xHFtSInXGbQDWqaBPy8hAvMPi0G3cM-5mZWYNp71N-mBFta2myxfBIYwsECcrw=w412-h220-rw", "Caffeplano", "cielo", "soloilmeglio"), BoomerCard("https://1.bp.blogspot.com/-3-7bm-KpaNc/XmTlOnWCHjI/AAAAAAAAGPg/_mX2GhnqJ2YkjRd4D745SoqmRBjtfby4QCLcBGAsYHQ/w1200-h630-p-k-no-nu/816-Buongiornissimo-kaff%25C3%25A8-1024x1024.jpg", "happy", "tazzapowa", "sono mio padre"))
        recycler = findViewById(R.id.recycler_view)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = RecycledAdapter(listaDeiBoomer, this)

    }
}
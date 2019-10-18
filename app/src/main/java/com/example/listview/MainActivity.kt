package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        listView = findViewById(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Soekarno",  "18 Agustus 1945 - 12 Maret 1967",  R.drawable.soekarno  ))
        list.add(Model("Soeharto",  "12 Maret 1967 - 21 Mei 1998",  R.drawable.soeharto  ))
        list.add(Model("BJ. Habibie",  "21 Mei 1998 - 20 Oktober 1999",  R.drawable.habibi  ))
        list.add(Model("Abdurrahman Wahid",  "20 Oktober 1999 - 23 Juli 2001",  R.drawable.gusdur  ))
        list.add(Model("Megawati Soekarnoputri", "23 Juli 2001 - 20 Oktober 2004", R.drawable.mega  ))
        list.add(Model("Susilo Bambang Yudhoyono",   "20 Oktober 2004 - 20 Oktober 2014",   R.drawable.sby  ))
        list.add(Model("Joko Widodo",   "20 Oktober 2014 - sekarang",   R.drawable.jokowi  ))

        listView.adapter = MyListAdapter(this,R.layout.row,list)

        listView.setOnItemClickListener{parent, view, position, id ->

            if (position==0){
                Toast.makeText(this@MainActivity, "Presiden Ke-1 RI",   Toast.LENGTH_SHORT).show()
            }
            if (position==1){
                Toast.makeText(this@MainActivity, "Presiden Ke-2 RI",   Toast.LENGTH_SHORT).show()
            }
            if (position==2){
                Toast.makeText(this@MainActivity, "Presiden Ke-3 RI", Toast.LENGTH_SHORT).show()
            }
            if (position==3){
                Toast.makeText(this@MainActivity, "Presiden Ke-4 RI",  Toast.LENGTH_SHORT).show()
            }
            if (position==4){
                Toast.makeText(this@MainActivity, "Presiden Ke-5 R1",  Toast.LENGTH_SHORT).show()
            }
            if (position==5){
                Toast.makeText(this@MainActivity, "Presiden Ke-6 RI",  Toast.LENGTH_SHORT).show()
            }
            if (position==6){
                Toast.makeText(this@MainActivity, "Presiden Ke-7 RI",  Toast.LENGTH_SHORT).show()
            }

        }

    }
}

package com.example.recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.adaptar.CustomAdapter


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var DataSource: ArrayList<MyDataClass>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.MyRecycle)
        loadData()
        initRecyclerView()
        clickListener()
    }

    private fun clickListener() {
        CustomAdapter(DataSource).setOnClickListener(object :CustomAdapter.OnClickListener{
            override fun onClick(position: Int, model: MyDataClass) {
                val intent = Intent(this@MainActivity,SecondActivity::class.java)
                intent.putExtra("name",model.name)
                intent.putExtra("number",model.number)
                intent.putExtra("profile",model.profile)
                //intent.putExtra("location",model.location)
                startActivity(intent)

            }


        })
    }


    private fun initRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = CustomAdapter(DataSource)
        recyclerView.adapter = adapter


    }

    private fun loadData() {
        DataSource = arrayListOf()
        DataSource.add(
            MyDataClass(
            "Abdullah Al Mamun",
            "01735756206",
                "https://scontent.fdac24-3.fna.fbcdn.net/v/t1.6435-9/153213995_2823455684570806_2059540904840535745_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=JqtG_jVraccAX91Ci-w&_nc_ht=scontent.fdac24-3.fna&oh=00_AfB0dVOzy4275q1lJ0qDcqRdz2Tnh_xh2dIdYwjHU2Wokg&oe=647774F4"
            //"Chapai Nawabgonj"
        )
        )
        DataSource.add(MyDataClass(
            "Syed Azmal Hossain",
            "01782589104",
            "https://scontent.fdac24-2.fna.fbcdn.net/v/t1.15752-9/341928676_3388966634748721_3195062739185709600_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=ae9488&_nc_ohc=HoPoVn-J45UAX8yButV&_nc_ht=scontent.fdac24-2.fna&oh=03_AdQDMtJSroPG6v863WQLRE1XQ54yYf_P9zvphozqlbyuQQ&oe=647780A6"
           //"Chapai Nawabgonj"
            ))
        DataSource.add(MyDataClass(
            "Abrar Aziz",
            "01977453160",
            "https://scontent.fdac24-3.fna.fbcdn.net/v/t39.30808-6/330430146_3835570116669622_8060923441727915202_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=xAR8ZP_MhAcAX9PgyXm&_nc_ht=scontent.fdac24-3.fna&oh=00_AfB_LI-WsYdwUxlqIP2ywEHJtlE8djMiGEZVWK9p47FAbw&oe=64552B24"
            //"Chapai Nawabgonj"
            ))
        DataSource.add(MyDataClass(
            "Raihan Naim",
            "01885603359",
            "https://scontent.fdac24-1.fna.fbcdn.net/v/t39.30808-6/343092640_617807910398264_7856845194832666886_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=Fbqeek9jVH0AX_9YK5e&_nc_ht=scontent.fdac24-1.fna&oh=00_AfAVtC7BuLkahZaq9Xse6hCa1ySbh5rpnZHZmP3mnmmeVA&oe=64556164"
            //"Chapai Nawabgonj"
        ))
        DataSource.add(MyDataClass(
            "Saddam Hossen",
            "01749022006",
            "https://scontent.fdac24-3.fna.fbcdn.net/v/t39.30808-6/329809108_891940645344012_1714008653957141563_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=174925&_nc_ohc=YnRv71F-TJkAX-9aJMS&_nc_ht=scontent.fdac24-3.fna&oh=00_AfDZ0JHsoaT2mtBYwxDypHG-ga9ApS2ys8JehUDUJQEWhQ&oe=6455D0E5"
            //"Chapai Nawabgonj"
        ))
        DataSource.add(MyDataClass(
            "Karzai Dewan Mahim",
            "01777190153",
            "https://scontent.fdac24-4.fna.fbcdn.net/v/t39.30808-6/316101741_682905650100456_8935655890014609023_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=174925&_nc_ohc=DP42-uMjJswAX8Y_Crk&_nc_ht=scontent.fdac24-4.fna&oh=00_AfDRiVZR_aWxObAiPNH4I8yn0wkT1aaBeNxMmWte8lkU2A&oe=64547D23"
            //"Dhaka"
        ))
        DataSource.add(MyDataClass(
            "MD Takbir",
            "01762155129",
            "https://scontent.fdac24-3.fna.fbcdn.net/v/t1.6435-9/189346509_1363554277349427_4003315329638052045_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=e3f864&_nc_ohc=O3oBEwHyaqkAX_AjwIc&_nc_ht=scontent.fdac24-3.fna&oh=00_AfC-6rTKEE43cE0etnMdNBKjaSojLXfTEEc4YaPTsTfmdA&oe=64775561"
            //"Rajshahi"
        ))
    }
}
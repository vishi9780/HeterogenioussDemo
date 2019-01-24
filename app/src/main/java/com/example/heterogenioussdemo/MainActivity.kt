package com.example.heterogenioussdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView

import com.example.heterogenioussdemo.adapter.MainAdapter
import com.example.heterogenioussdemo.pojo.SingleHorizontal
import com.example.heterogenioussdemo.pojo.SingleVertical
import com.example.heterogenioussdemo.pojo.TextSingleVertical

import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var rv_mainHetro: RecyclerView
    private val objects = ArrayList<Any>()
    private val `object`: ArrayList<Any>
        get() {
            objects.add(verticalData[0])
            objects.add(verticalDataTxtImg[0])
            objects.add(horizontalData[0])
            return objects
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv_mainHetro = findViewById<RecyclerView>(R.id.rv_mainHetro)
        val adapter = MainAdapter(this, `object`)
        rv_mainHetro.adapter = adapter
    }

    companion object {
        val verticalData: ArrayList<SingleVertical>
            get() {
                val singleVerticals = ArrayList<SingleVertical>()
                singleVerticals.add(SingleVertical("Charlie Chaplin", "Sir Charles Spencer \"Charlie\" Chaplin, KBE was an English comic actor,....", R.mipmap.ic_launcher))
                singleVerticals.add(SingleVertical("Mr.Bean", "Mr. Bean is a British sitcom created by Rowan Atkinson and Richard Curtis, and starring Atkinson as the title character.", R.mipmap.ic_launcher))
                singleVerticals.add(SingleVertical("Jim Carrey", "James Eugene \"Jim\" Carrey is a Canadian-American actor, comedian, impressionist, screenwriter...", R.mipmap.ic_launcher))
                return singleVerticals
            }
        val verticalDataTxtImg: ArrayList<TextSingleVertical>
            get() {
                val singleVerticals = ArrayList<TextSingleVertical>()
                singleVerticals.add(TextSingleVertical(R.mipmap.ic_launcher, "getVerticalDataTxtImg1", "Sir Charles Spencer \"Charlie\" Chaplin, KBE was an English comic actor,...."))
                singleVerticals.add(TextSingleVertical(R.mipmap.ic_launcher, "getVerticalDataTxtImg2", "Mr. Bean is a British sitcom created by Rowan Atkinson and Richard Curtis, and starring Atkinson as the title character."))
                singleVerticals.add(TextSingleVertical(R.mipmap.ic_launcher, "getVerticalDataTxtImg3", "James Eugene \"Jim\" Carrey is a Canadian-American actor, comedian, impressionist, screenwriter..."))
                return singleVerticals
            }
        val horizontalData: ArrayList<SingleHorizontal>
            get() {
                val singleHorizontals = ArrayList<SingleHorizontal>()
                singleHorizontals.add(SingleHorizontal(R.mipmap.ic_launcher, "Charlie Chaplin", "Sir Charles Spencer \"Charlie\" Chaplin, KBE was an English comic actor,....", "2010/2/1"))
                singleHorizontals.add(SingleHorizontal(R.mipmap.ic_launcher, "Mr.Bean", "Mr. Bean is a British sitcom created by Rowan Atkinson and Richard Curtis, and starring Atkinson as the title character.", "2010/2/1"))
                singleHorizontals.add(SingleHorizontal(R.mipmap.ic_launcher, "Jim Carrey", "James Eugene \"Jim\" Carrey is a Canadian-American actor, comedian, impressionist, screenwriter...", "2010/2/1"))
                return singleHorizontals
            }
    }
}

package org.techtown.sungshin3f
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_outsidecate.*
import kotlinx.android.synthetic.main.guidefragment3.*

class GuideFragment3 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.guidefragment3, container, false)

        val view:View=inflater!!.inflate(R.layout.guidefragment3,container,false)

        entrancebtn.setOnClickListener { view->
            startActivity(Intent(activity, MainActivity::class.java))
        }


    }



}
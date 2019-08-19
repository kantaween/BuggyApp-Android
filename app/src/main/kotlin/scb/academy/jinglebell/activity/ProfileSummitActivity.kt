package scb.academy.jinglebell.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_profile_submit.*
import scb.academy.jinglebell.R
import scb.academy.jinglebell.extension.setImageUrl
import scb.academy.jinglebell.model.Song
import java.text.SimpleDateFormat
import java.util.*

class ProfileSummitActivity : AppCompatActivity() {

    companion object {
        private const val EXTRA_PROFILE = "profile"

        fun startActivity(context: Context, name: String){
            var intent = Intent(context, ProfileSummitActivity::class.java)
            intent.putExtra(EXTRA_PROFILE, name)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_submit)

        val name = intent.getStringExtra(EXTRA_PROFILE) ?: return
        submit_name.text = name
    }
}

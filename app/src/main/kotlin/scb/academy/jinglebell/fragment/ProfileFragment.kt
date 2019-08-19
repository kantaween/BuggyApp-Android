package scb.academy.jinglebell.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile.view.*
import scb.academy.jinglebell.R
import scb.academy.jinglebell.activity.ProfileSummitActivity

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val _view = inflater.inflate(R.layout.fragment_profile, container, false)

        _view.profileButton.setOnClickListener {
            val name = _view.profileName.text.toString()
            this.context!!.let {
                ProfileSummitActivity.startActivity(it, name)
            }
        }

        return _view
    }
}

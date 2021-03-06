package codegene.femicodes.fragmenttoolbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : BaseFragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }

//    override fun builder(): FragmentToolbar {
//        return FragmentToolbar.Builder()
//            .withId(R.id.song_toolbar)
//            .withTitle(R.string.second_fragment_label)
//            .setNavigationIcon(R.drawable.ic_baseline_arrow_back_24, object : OnNavigationIconClickListener{
//                override fun onNavIconClick() {
//                    (activity as? MainActivity)?.onBackPressed()
//                }
//            })
//            .build()
//    }
}
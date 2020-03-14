package codegene.femicodes.fragmenttoolbar

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment(){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //ToolbarManager(builder(), view).prepareToolbar()
    }

//    protected abstract fun builder() : FragmentToolbar

}
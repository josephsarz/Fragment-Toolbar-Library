package codegene.femicodes.fragmenttoolbar

import android.view.MenuItem
import androidx.annotation.IdRes
import androidx.annotation.MenuRes
import androidx.annotation.StringRes


class FragmentToolbar(@IdRes val resId: Int,
                      @StringRes val title: Int,
                      val navIcon: Int,
                      val navClickListener: OnNavigationIconClickListener?,
                      @MenuRes val menuId: Int,
                      val menuItems: MutableList<Int>,
                      val menuClicks: MutableList<MenuItem.OnMenuItemClickListener?>) {

    companion object {
        @JvmField val NO_TOOLBAR = -1
    }

    class Builder {
        private var resId: Int = -1
        private var menuId: Int = -1
        private var title: Int = -1
        private var navIcon: Int = -1
        private var navClickListener: OnNavigationIconClickListener? = null
        private var menuItems: MutableList<Int> = mutableListOf()
        private var menuClicks: MutableList<MenuItem.OnMenuItemClickListener?> = mutableListOf()

        fun withId(@IdRes resId: Int) = apply { this.resId = resId }

        fun withTitle(title: Int) = apply { this.title = title }

        fun setNavigationIcon(navIcon : Int, navClickListener: OnNavigationIconClickListener) =  apply {
            this.navIcon = navIcon
            this.navClickListener = navClickListener
        }

        fun withMenu(@MenuRes menuId: Int) = apply { this.menuId = menuId }

        fun withMenuItems(menuItems: MutableList<Int>, menuClicks: MutableList<MenuItem.OnMenuItemClickListener?>) = apply {
            this.menuItems.addAll(menuItems)
            this.menuClicks.addAll(menuClicks)
        }
        fun build() = FragmentToolbar(resId, title, navIcon, navClickListener, menuId, menuItems, menuClicks)
    }
}

interface OnNavigationIconClickListener {
    fun onNavIconClick()
}
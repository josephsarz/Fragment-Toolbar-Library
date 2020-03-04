# Fragment-Toolbar-Library

## Project Setup

### Step 1. Add the JitPack repository to your build file
### Add it in your root build.gradle at the end of repositories:

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

### Step 2. Add the dependency

```
  dependencies {
	        implementation 'com.github.josephsarz:Fragment-Toolbar-Library:0.1.0'
	}
```


## Library Usage

### Step 1. Add this line to your BaseFragment

`ToolbarManager(builder(), view).prepareToolbar()` to the overridden onViewCreated method

### Step 2. Then add an abstract builder method to your BaseFragment

`protected abstract fun builder() : FragmentToolbar`

### Step 3. Your BaseFragment should look something like this
```
abstract class BaseFragment : Fragment(){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ToolbarManager(builder(), view).prepareToolbar()
    }

    protected abstract fun builder() : FragmentToolbar

}
```

### Step 4. Create your custom toolbar in your xml layout file

```
  <androidx.appcompat.widget.Toolbar
        android:id="@+id/toolbar"
        android:layout_width="match_parent"
        android:layout_height="?attr/actionBarSize"
        android:background="@color/colorWhite"
        android:elevation="8dp"
        app:popupTheme="@style/AppTheme.PopupOverlay"/>
        
```

### Step 5. In your MainFragment Class extend the BaseFragment and implement the overridden builder method and link your toolbar

```
class FirstFragment : BaseFragment() 

...

override fun builder(): FragmentToolbar {
        return FragmentToolbar.Builder()
            .withId(R.id.toolbar)
            .withTitle(R.string.first_fragment_label)
                .setNavigationIcon(R.drawable.ic_baseline_arrow_back_24, object : OnNavigationIconClickListener{
                override fun onNavIconClick() {
                    (activity as? MainActivity)?.onBackPressed()
                }
            })
            .build()
    }

```

## Enjoy.










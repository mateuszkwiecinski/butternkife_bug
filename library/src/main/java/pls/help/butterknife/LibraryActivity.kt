package pls.help.butterknife

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import pls.help.butterknife.library.R
import pls.help.butterknife.library.R2

class LibraryActivity : AppCompatActivity() {

    @BindView(R2.id.willWork)
    lateinit var thisNeedsToBeHere: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)
        ButterKnife.bind(this)
    }

    @OnClick(R2.id.btnInLibrary)
    fun start(){
        onBackPressed()
    }

    @OnClick(R2.id.willWork)
    fun start2(){
        onBackPressed()
    }
}

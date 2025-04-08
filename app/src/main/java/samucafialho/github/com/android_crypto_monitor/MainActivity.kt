package samucafialho.github.com.android_crypto_monitor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import samucafialho.github.com.android_crypto_monitor.ui.theme.AndroidcryptomonitorTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbarMain: Toolbar = findViewById(R.id.toolbar_main)
        configureToolbar(toolbarMain)
    }

        private fun configureToolbar(toolbar: Toolbar) {
            setSupportActionBar(toolbar)
            toolbar.setTitleTextColor(getColor(R.color.white))
            supportActionBar?.setTitle(getText(R.string.app_title))
            supportActionBar?.setBackgroundDrawable(getDrawable(R.color.primary))

    }
}
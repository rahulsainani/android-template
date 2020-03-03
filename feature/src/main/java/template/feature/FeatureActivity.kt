package template.feature

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import template.di.AppComponentInjectHelper
import template.feature.di.DaggerFeatureComponent

class FeatureActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel: FeatureViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)

        inject()
        viewModel = ViewModelProvider(this, viewModelFactory)[FeatureViewModel::class.java]
    }

    private fun inject() =
        DaggerFeatureComponent
            .builder()
            .applicationComponent(AppComponentInjectHelper.provideAppComponent(applicationContext))
            .build()
            .inject(this)
}

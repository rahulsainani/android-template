package template.feature

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import javax.inject.Inject
import template.base.di.AppComponentInjectHelper
import template.feature.di.DaggerFeatureComponent

class FeatureActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)

        inject()
        viewModel = ViewModelProviders.of(this, viewModelFactory)[FeatureViewModel::class.java]
    }

    private fun inject() =
        DaggerFeatureComponent
            .builder()
            .applicationComponent(AppComponentInjectHelper.provideAppComponent(applicationContext))
            .build()
            .inject(this)
}

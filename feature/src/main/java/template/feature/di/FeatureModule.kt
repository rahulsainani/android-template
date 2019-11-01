package template.feature.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import template.base.di.ViewModelKey
import template.feature.FeatureViewModel

@Module
object FeatureModule {

    @Module
    abstract class FeatureViewModelModule {
        @Binds
        @IntoMap
        @ViewModelKey(FeatureViewModel::class)
        abstract fun bindViewModel(myViewModel: FeatureViewModel): ViewModel
    }
}

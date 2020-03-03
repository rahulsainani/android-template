package template.di.module

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import template.di.ViewModelFactory

@Module
abstract class ViewModelFactoryModule {

    @Binds
    internal abstract fun bindViewModelFactory(
        viewModelFactory: ViewModelFactory
    ): ViewModelProvider.Factory
}

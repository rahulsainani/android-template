package template.feature.di

import dagger.Component
import template.di.PerActivity
import template.di.component.ApplicationComponent
import template.di.module.ViewModelFactoryModule
import template.feature.FeatureActivity

@PerActivity
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [
        ViewModelFactoryModule::class,
        FeatureModule::class,
        FeatureModule.FeatureViewModelModule::class
    ]
)
interface FeatureComponent {
    fun inject(activity: FeatureActivity)
}

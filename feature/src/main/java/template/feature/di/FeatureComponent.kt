package template.feature.di

import dagger.Component
import template.base.di.PerActivity
import template.base.di.component.ApplicationComponent
import template.base.di.module.ViewModelFactoryModule
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

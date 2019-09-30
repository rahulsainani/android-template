package template.base.di.component

import dagger.Component
import javax.inject.Singleton
import retrofit2.Retrofit
import template.base.data.ApiKey
import template.base.di.module.ApplicationModule
import template.base.di.module.NetworkModule

@Singleton
@Component(modules = [ApplicationModule::class, NetworkModule::class])
interface ApplicationComponent {
    fun retrofit(): Retrofit

    fun apiKey(): ApiKey
}

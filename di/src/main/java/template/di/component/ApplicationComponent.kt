package template.di.component

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton
import retrofit2.Retrofit
import template.base.di.ApplicationContext
import template.di.module.NetworkModule

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    @ApplicationContext
    fun context(): Context

    fun retrofit(): Retrofit

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun applicationContext(@ApplicationContext applicationContext: Context): Builder

        fun build(): ApplicationComponent
    }
}

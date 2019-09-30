package app.droidster

import android.app.Application
import template.base.di.AppComponentProvider
import template.base.di.component.ApplicationComponent
import template.base.di.component.DaggerApplicationComponent
import template.base.di.module.NetworkModule
import timber.log.Timber

class App : Application(), AppComponentProvider {

    private val applicationComponent by lazy {
        DaggerApplicationComponent
            .builder()
            .networkModule(NetworkModule())
            .build()
    }

    override fun provideAppComponent(): ApplicationComponent = applicationComponent

    override fun onCreate() {
        super.onCreate()
        plantTimber()
    }

    private fun plantTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}

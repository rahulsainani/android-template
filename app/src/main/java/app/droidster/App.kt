package app.droidster

import android.app.Application
import template.di.AppComponentProvider
import template.di.component.ApplicationComponent
import template.di.component.DaggerApplicationComponent
import timber.log.Timber

class App : Application(), AppComponentProvider {

    private val applicationComponent by lazy {
        DaggerApplicationComponent
            .builder()
            .applicationContext(this)
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

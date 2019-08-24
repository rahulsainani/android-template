package template.base.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import template.base.di.ApplicationContext
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: Application) {

    @Singleton
    @Provides
    @ApplicationContext
    internal fun provideContext(): Context = application.applicationContext
}

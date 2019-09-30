package template.base.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import template.base.di.ApplicationContext

@Module
class ApplicationModule(private val application: Application) {

    @Singleton
    @Provides
    @ApplicationContext
    internal fun provideContext(): Context = application.applicationContext
}

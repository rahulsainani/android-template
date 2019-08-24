package template.base.di

import android.content.Context
import template.base.di.component.ApplicationComponent

object AppComponentInjectHelper {
    fun provideAppComponent(applicationContext: Context): ApplicationComponent {
        return if (applicationContext is AppComponentProvider) {
            (applicationContext as AppComponentProvider).provideAppComponent()
        } else {
            throw IllegalStateException("The application context you have passed does not implement AppComponentProvider")
        }
    }
}
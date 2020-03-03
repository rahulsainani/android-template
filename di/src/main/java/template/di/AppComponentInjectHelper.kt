package template.di

import android.content.Context
import template.di.component.ApplicationComponent

object AppComponentInjectHelper {
    fun provideAppComponent(applicationContext: Context): ApplicationComponent {
        return if (applicationContext is AppComponentProvider) {
            (applicationContext as AppComponentProvider).provideAppComponent()
        } else {
            throw IllegalStateException(MESSAGE)
        }
    }

    private const val MESSAGE =
        "The application context you have passed does not implement AppComponentProvider"
}

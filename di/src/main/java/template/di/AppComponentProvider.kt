package template.di

import template.di.component.ApplicationComponent

interface AppComponentProvider {
    fun provideAppComponent(): ApplicationComponent
}

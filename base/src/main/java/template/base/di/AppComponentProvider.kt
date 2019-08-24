package template.base.di

import template.base.di.component.ApplicationComponent

interface AppComponentProvider {
    fun provideAppComponent(): ApplicationComponent
}
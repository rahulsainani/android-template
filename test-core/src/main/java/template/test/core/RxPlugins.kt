package template.test.core

import org.junit.jupiter.api.extension.ExtendWith
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
@ExtendWith(RxPluginsExtension::class)
annotation class RxPlugins

package template.test.core

import javax.inject.Qualifier
import org.junit.jupiter.api.extension.ExtendWith

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
@ExtendWith(RxPluginsExtension::class)
annotation class RxPlugins

package template.test.core

import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.jupiter.api.extension.ExtendWith
import javax.inject.Qualifier

@ExperimentalCoroutinesApi
@Qualifier
@Retention(AnnotationRetention.RUNTIME)
@ExtendWith(CoroutinesTestDispatcherExtension::class)
annotation class CoroutinesExtension

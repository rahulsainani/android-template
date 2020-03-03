package template.test.core

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.TestCoroutineScope
import org.junit.jupiter.api.extension.ExtendWith

@ExperimentalCoroutinesApi
@ExtendWith(CoroutinesTestDispatcherExtension::class)
interface CoroutineTest {
    var testScope: TestCoroutineScope
    var dispatcher: TestCoroutineDispatcher
}

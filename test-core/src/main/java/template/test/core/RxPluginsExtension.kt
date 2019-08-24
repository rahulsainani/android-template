package template.test.core

import io.reactivex.plugins.RxJavaPlugins
import io.reactivex.schedulers.Schedulers
import org.junit.jupiter.api.extension.BeforeAllCallback
import org.junit.jupiter.api.extension.ExtensionContext

class RxPluginsExtension : BeforeAllCallback {

    override fun beforeAll(context: ExtensionContext?) {
        RxJavaPlugins.reset()
        RxJavaPlugins.setComputationSchedulerHandler { Schedulers.trampoline() }
        RxJavaPlugins.setIoSchedulerHandler { Schedulers.trampoline() }
        RxJavaPlugins.setSingleSchedulerHandler { Schedulers.trampoline() }
    }
}

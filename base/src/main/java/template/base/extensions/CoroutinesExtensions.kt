package template.base.extensions

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import timber.log.Timber

fun CoroutineScope.launchSafe(
    action: suspend () -> Unit,
    onError: (Throwable) -> Unit = {}
) {
    launch {
        try {
            action()
        } catch (e: CancellationException) {
            Timber.d(e, "Job cancelled")
        } catch (e: Exception) {
            onError(e)
        }
    }
}

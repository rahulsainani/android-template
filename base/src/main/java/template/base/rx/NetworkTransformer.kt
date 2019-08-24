package template.base.rx

import io.reactivex.Single
import io.reactivex.SingleSource
import io.reactivex.SingleTransformer
import io.reactivex.schedulers.Schedulers

class NetworkTransformer<T> : SingleTransformer<T, T> {

    override fun apply(upstream: Single<T>): SingleSource<T> =
        upstream
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.computation())
}

package template.base.rx

import io.reactivex.Completable
import io.reactivex.CompletableSource
import io.reactivex.CompletableTransformer
import io.reactivex.Single
import io.reactivex.SingleSource
import io.reactivex.SingleTransformer
import io.reactivex.schedulers.Schedulers

class NetworkTransformer<T> : SingleTransformer<T, T>, CompletableTransformer {

    override fun apply(upstream: Single<T>): SingleSource<T> =
        upstream
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.computation())

    override fun apply(upstream: Completable): CompletableSource =
        upstream
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.computation())
}

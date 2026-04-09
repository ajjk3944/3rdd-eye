package com.vungle.ads.internal.executor;

import com.vungle.ads.internal.util.k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.l;

/* compiled from: FutureResult.kt */
/* loaded from: classes2.dex */
public final class b<T> implements Future<T> {
    public static final a Companion = new a(null);
    private static final String TAG = b.class.getSimpleName();
    private final Future<T> future;

    /* compiled from: FutureResult.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final String getTAG() {
            return b.TAG;
        }

        private a() {
        }
    }

    public b(Future<T> future) {
        this.future = future;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        Future<T> future = this.future;
        if (future != null) {
            return future.cancel(z10);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get() {
        try {
            Future<T> future = this.future;
            if (future != null) {
                return future.get();
            }
            return null;
        } catch (InterruptedException unused) {
            k.a aVar = k.Companion;
            String TAG2 = TAG;
            l.e(TAG2, "TAG");
            aVar.w(TAG2, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e4) {
            k.a aVar2 = k.Companion;
            String TAG3 = TAG;
            l.e(TAG3, "TAG");
            aVar2.e(TAG3, "error on execution", e4);
            return null;
        }
    }

    public final Future<T> getFuture() {
        return this.future;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        Future<T> future = this.future;
        if (future != null) {
            return future.isCancelled();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Future<T> future = this.future;
        if (future != null) {
            return future.isDone();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get(long j4, TimeUnit unit) {
        l.f(unit, "unit");
        try {
            Future<T> future = this.future;
            if (future != null) {
                return future.get(j4, unit);
            }
            return null;
        } catch (InterruptedException unused) {
            k.a aVar = k.Companion;
            String TAG2 = TAG;
            l.e(TAG2, "TAG");
            aVar.w(TAG2, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e4) {
            k.a aVar2 = k.Companion;
            String TAG3 = TAG;
            l.e(TAG3, "TAG");
            aVar2.e(TAG3, "error on execution", e4);
            return null;
        } catch (TimeoutException e10) {
            k.a aVar3 = k.Companion;
            String TAG4 = TAG;
            l.e(TAG4, "TAG");
            aVar3.e(TAG4, "error on timeout", e10);
            l.e(TAG4, "TAG");
            aVar3.w(TAG4, "future.get() Timeout on Thread " + Thread.currentThread().getName());
            return null;
        }
    }
}

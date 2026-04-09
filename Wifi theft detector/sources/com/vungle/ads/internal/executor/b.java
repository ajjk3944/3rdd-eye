package com.vungle.ads.internal.executor;

import com.vungle.ads.internal.util.p;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class b implements Future {

    @NotNull
    public static final a Companion = new a(null);
    private static final String TAG = b.class.getSimpleName();

    @Nullable
    private final Future<Object> future;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final String getTAG() {
            return b.TAG;
        }

        private a() {
        }
    }

    public b(@Nullable Future<Object> future) {
        this.future = future;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        Future<Object> future = this.future;
        if (future != null) {
            return future.cancel(z10);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public Object get() {
        try {
            Future<Object> future = this.future;
            if (future != null) {
                return future.get();
            }
            return null;
        } catch (InterruptedException unused) {
            p.a aVar = p.Companion;
            String TAG2 = TAG;
            kotlin.jvm.internal.p.d(TAG2, "TAG");
            aVar.w(TAG2, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e10) {
            p.a aVar2 = p.Companion;
            String TAG3 = TAG;
            kotlin.jvm.internal.p.d(TAG3, "TAG");
            aVar2.e(TAG3, "error on execution", e10);
            return null;
        }
    }

    @Nullable
    public final Future<Object> getFuture() {
        return this.future;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        Future<Object> future = this.future;
        if (future != null) {
            return future.isCancelled();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Future<Object> future = this.future;
        if (future != null) {
            return future.isDone();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public Object get(long j10, @NotNull TimeUnit unit) {
        kotlin.jvm.internal.p.e(unit, "unit");
        try {
            Future<Object> future = this.future;
            if (future != null) {
                return future.get(j10, unit);
            }
            return null;
        } catch (InterruptedException unused) {
            p.a aVar = p.Companion;
            String TAG2 = TAG;
            kotlin.jvm.internal.p.d(TAG2, "TAG");
            aVar.w(TAG2, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e10) {
            p.a aVar2 = p.Companion;
            String TAG3 = TAG;
            kotlin.jvm.internal.p.d(TAG3, "TAG");
            aVar2.e(TAG3, "error on execution", e10);
            return null;
        } catch (TimeoutException e11) {
            p.a aVar3 = p.Companion;
            String TAG4 = TAG;
            kotlin.jvm.internal.p.d(TAG4, "TAG");
            aVar3.e(TAG4, "error on timeout", e11);
            kotlin.jvm.internal.p.d(TAG4, "TAG");
            aVar3.w(TAG4, "future.get() Timeout on Thread " + Thread.currentThread().getName());
            return null;
        }
    }
}

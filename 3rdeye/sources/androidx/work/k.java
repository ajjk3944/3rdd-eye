package androidx.work;

import A9.C0599r0;
import K6.C0749p;
import d2.AbstractC4266a;
import d2.C4268c;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: ListenableFuture.kt */
/* loaded from: classes.dex */
public final class k<R> implements A4.a<R> {

    /* renamed from: b, reason: collision with root package name */
    public final C4268c<R> f16945b = new C4268c<>();

    public k(C0599r0 c0599r0) {
        c0599r0.F(new C0749p(this, 7));
    }

    @Override // A4.a
    public final void addListener(Runnable runnable, Executor executor) {
        this.f16945b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f16945b.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        return this.f16945b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f16945b.f37349b instanceof AbstractC4266a.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f16945b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j4, TimeUnit timeUnit) {
        return this.f16945b.get(j4, timeUnit);
    }
}

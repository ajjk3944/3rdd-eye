package w9;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.internal.f0;

/* loaded from: classes4.dex */
public final class a extends ExecutorCoroutineDispatcher implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final a f24842c = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final CoroutineDispatcher f24843d = l.f24863b.a0(f0.e("kotlinx.coroutines.io.parallelism", q9.e.b(64, d0.a()), 0, 0, 12, null));

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void X(kotlin.coroutines.d dVar, Runnable runnable) {
        f24843d.X(dVar, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void Y(kotlin.coroutines.d dVar, Runnable runnable) {
        f24843d.Y(dVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        X(EmptyCoroutineContext.f21979a, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public Executor b0() {
        return this;
    }
}

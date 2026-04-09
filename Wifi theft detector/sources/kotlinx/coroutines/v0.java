package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes4.dex */
public final class v0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineDispatcher f22696a;

    public v0(CoroutineDispatcher coroutineDispatcher) {
        this.f22696a = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        CoroutineDispatcher coroutineDispatcher = this.f22696a;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f21979a;
        if (coroutineDispatcher.Z(emptyCoroutineContext)) {
            this.f22696a.X(emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f22696a.toString();
    }
}

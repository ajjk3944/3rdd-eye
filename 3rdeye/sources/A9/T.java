package A9;

import f9.C4351i;
import java.util.concurrent.Executor;

/* compiled from: Executors.kt */
/* loaded from: classes3.dex */
public final class T implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final A f209b;

    public T(A a10) {
        this.f209b = a10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C4351i c4351i = C4351i.f37871b;
        A a10 = this.f209b;
        if (a10.P0(c4351i)) {
            a10.N0(c4351i, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f209b.toString();
    }
}

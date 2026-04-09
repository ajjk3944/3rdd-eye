package I9;

import A9.A;
import A9.AbstractC0576f0;
import E.u;
import F9.z;
import f9.C4351i;
import f9.InterfaceC4350h;
import java.util.concurrent.Executor;

/* compiled from: Dispatcher.kt */
/* loaded from: classes3.dex */
public final class b extends AbstractC0576f0 implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final b f2623c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final A f2624d;

    static {
        l lVar = l.f2640c;
        int i = z.f1790a;
        if (64 >= i) {
            i = 64;
        }
        f2624d = lVar.Q0(u.P(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // A9.A
    public final void N0(InterfaceC4350h interfaceC4350h, Runnable runnable) {
        f2624d.N0(interfaceC4350h, runnable);
    }

    @Override // A9.A
    public final void O0(InterfaceC4350h interfaceC4350h, Runnable runnable) {
        f2624d.O0(interfaceC4350h, runnable);
    }

    @Override // A9.A
    public final A Q0(int i) {
        return l.f2640c.Q0(1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        N0(C4351i.f37871b, runnable);
    }

    @Override // A9.A
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // A9.AbstractC0576f0
    public final Executor R0() {
        return this;
    }
}

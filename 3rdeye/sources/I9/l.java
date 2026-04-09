package I9;

import A9.A;
import A9.I;
import f9.InterfaceC4350h;

/* compiled from: Dispatcher.kt */
/* loaded from: classes3.dex */
public final class l extends A {

    /* renamed from: c, reason: collision with root package name */
    public static final l f2640c = new l();

    @Override // A9.A
    public final void N0(InterfaceC4350h interfaceC4350h, Runnable runnable) {
        c cVar = c.f2625d;
        cVar.f2627c.c(runnable, k.f2639h, false);
    }

    @Override // A9.A
    public final void O0(InterfaceC4350h interfaceC4350h, Runnable runnable) {
        c cVar = c.f2625d;
        cVar.f2627c.c(runnable, k.f2639h, true);
    }

    @Override // A9.A
    public final A Q0(int i) {
        I.n(i);
        return i >= k.f2635d ? this : super.Q0(i);
    }
}

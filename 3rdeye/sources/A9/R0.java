package A9;

import f9.InterfaceC4350h;

/* compiled from: Unconfined.kt */
/* loaded from: classes3.dex */
public final class R0 extends A {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f206c = 0;

    static {
        new R0();
    }

    @Override // A9.A
    public final void N0(InterfaceC4350h interfaceC4350h, Runnable runnable) {
        V0 v02 = (V0) interfaceC4350h.get(V0.f214c);
        if (v02 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        v02.f215b = true;
    }

    @Override // A9.A
    public final A Q0(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // A9.A
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}

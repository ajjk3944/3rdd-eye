package Ii;

import dh.InterfaceC5384i;

/* loaded from: classes4.dex */
public final class X0 extends J {

    /* renamed from: c, reason: collision with root package name */
    public static final X0 f9294c = new X0();

    private X0() {
    }

    @Override // Ii.J
    public void Y(InterfaceC5384i interfaceC5384i, Runnable runnable) {
        b1 b1Var = (b1) interfaceC5384i.get(b1.f9300c);
        if (b1Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        b1Var.f9301b = true;
    }

    @Override // Ii.J
    public boolean m0(InterfaceC5384i interfaceC5384i) {
        return false;
    }

    @Override // Ii.J
    public J n0(int i10, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // Ii.J
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}

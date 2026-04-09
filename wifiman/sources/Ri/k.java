package Ri;

import Ii.J;
import Ni.AbstractC3409k;
import dh.InterfaceC5384i;

/* loaded from: classes4.dex */
final class k extends J {

    /* renamed from: c, reason: collision with root package name */
    public static final k f19995c = new k();

    private k() {
    }

    @Override // Ii.J
    public void Y(InterfaceC5384i interfaceC5384i, Runnable runnable) {
        c.f19979i.q0(runnable, true, false);
    }

    @Override // Ii.J
    public void b0(InterfaceC5384i interfaceC5384i, Runnable runnable) {
        c.f19979i.q0(runnable, true, true);
    }

    @Override // Ii.J
    public J n0(int i10, String str) {
        AbstractC3409k.a(i10);
        return i10 >= j.f19992d ? AbstractC3409k.b(this, str) : super.n0(i10, str);
    }

    @Override // Ii.J
    public String toString() {
        return "Dispatchers.IO";
    }
}

package Ii;

import Yg.u;

/* loaded from: classes4.dex */
final class N0 extends C0 {

    /* renamed from: e, reason: collision with root package name */
    private final C3073p f9277e;

    public N0(C3073p c3073p) {
        this.f9277e = c3073p;
    }

    @Override // Ii.C0
    public boolean u() {
        return false;
    }

    @Override // Ii.C0
    public void v(Throwable th2) {
        Object objY = t().Y();
        if (objY instanceof C) {
            C3073p c3073p = this.f9277e;
            u.a aVar = Yg.u.f25017b;
            c3073p.resumeWith(Yg.u.c(Yg.v.a(((C) objY).f9236a)));
        } else {
            C3073p c3073p2 = this.f9277e;
            u.a aVar2 = Yg.u.f25017b;
            c3073p2.resumeWith(Yg.u.c(E0.h(objY)));
        }
    }
}

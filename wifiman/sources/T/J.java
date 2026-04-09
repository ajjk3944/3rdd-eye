package T;

import mh.InterfaceC6835l;

/* loaded from: classes.dex */
final class J implements S0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f20878a;

    /* renamed from: b, reason: collision with root package name */
    private K f20879b;

    public J(InterfaceC6835l interfaceC6835l) {
        this.f20878a = interfaceC6835l;
    }

    @Override // T.S0
    public void b() {
    }

    @Override // T.S0
    public void c() {
        K k10 = this.f20879b;
        if (k10 != null) {
            k10.dispose();
        }
        this.f20879b = null;
    }

    @Override // T.S0
    public void d() {
        this.f20879b = (K) this.f20878a.invoke(O.f20968a);
    }
}

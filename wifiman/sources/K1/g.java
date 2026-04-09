package k1;

import k1.f;

/* loaded from: classes.dex */
class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f51056m;

    g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f51048e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f51048e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // k1.f
    public void d(int i10) {
        if (this.f51053j) {
            return;
        }
        this.f51053j = true;
        this.f51050g = i10;
        for (InterfaceC6358d interfaceC6358d : this.f51054k) {
            interfaceC6358d.a(interfaceC6358d);
        }
    }
}

package k1;

import j1.C6241a;
import java.util.Iterator;
import k1.f;

/* loaded from: classes.dex */
class k extends p {
    k(j1.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f51094h.f51054k.add(fVar);
        fVar.f51055l.add(this.f51094h);
    }

    @Override // k1.p, k1.InterfaceC6358d
    public void a(InterfaceC6358d interfaceC6358d) {
        C6241a c6241a = (C6241a) this.f51088b;
        int iF1 = c6241a.f1();
        Iterator it = this.f51094h.f51055l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((f) it.next()).f51050g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iF1 == 0 || iF1 == 2) {
            this.f51094h.d(i11 + c6241a.g1());
        } else {
            this.f51094h.d(i10 + c6241a.g1());
        }
    }

    @Override // k1.p
    void d() {
        j1.e eVar = this.f51088b;
        if (eVar instanceof C6241a) {
            this.f51094h.f51045b = true;
            C6241a c6241a = (C6241a) eVar;
            int iF1 = c6241a.f1();
            boolean zE1 = c6241a.e1();
            int i10 = 0;
            if (iF1 == 0) {
                this.f51094h.f51048e = f.a.LEFT;
                while (i10 < c6241a.f50028L0) {
                    j1.e eVar2 = c6241a.f50027K0[i10];
                    if (zE1 || eVar2.N() != 8) {
                        f fVar = eVar2.f49900e.f51094h;
                        fVar.f51054k.add(this.f51094h);
                        this.f51094h.f51055l.add(fVar);
                    }
                    i10++;
                }
                q(this.f51088b.f49900e.f51094h);
                q(this.f51088b.f49900e.f51095i);
                return;
            }
            if (iF1 == 1) {
                this.f51094h.f51048e = f.a.RIGHT;
                while (i10 < c6241a.f50028L0) {
                    j1.e eVar3 = c6241a.f50027K0[i10];
                    if (zE1 || eVar3.N() != 8) {
                        f fVar2 = eVar3.f49900e.f51095i;
                        fVar2.f51054k.add(this.f51094h);
                        this.f51094h.f51055l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f51088b.f49900e.f51094h);
                q(this.f51088b.f49900e.f51095i);
                return;
            }
            if (iF1 == 2) {
                this.f51094h.f51048e = f.a.TOP;
                while (i10 < c6241a.f50028L0) {
                    j1.e eVar4 = c6241a.f50027K0[i10];
                    if (zE1 || eVar4.N() != 8) {
                        f fVar3 = eVar4.f49902f.f51094h;
                        fVar3.f51054k.add(this.f51094h);
                        this.f51094h.f51055l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f51088b.f49902f.f51094h);
                q(this.f51088b.f49902f.f51095i);
                return;
            }
            if (iF1 != 3) {
                return;
            }
            this.f51094h.f51048e = f.a.BOTTOM;
            while (i10 < c6241a.f50028L0) {
                j1.e eVar5 = c6241a.f50027K0[i10];
                if (zE1 || eVar5.N() != 8) {
                    f fVar4 = eVar5.f49902f.f51095i;
                    fVar4.f51054k.add(this.f51094h);
                    this.f51094h.f51055l.add(fVar4);
                }
                i10++;
            }
            q(this.f51088b.f49902f.f51094h);
            q(this.f51088b.f49902f.f51095i);
        }
    }

    @Override // k1.p
    public void e() {
        j1.e eVar = this.f51088b;
        if (eVar instanceof C6241a) {
            int iF1 = ((C6241a) eVar).f1();
            if (iF1 == 0 || iF1 == 1) {
                this.f51088b.V0(this.f51094h.f51050g);
            } else {
                this.f51088b.W0(this.f51094h.f51050g);
            }
        }
    }

    @Override // k1.p
    void f() {
        this.f51089c = null;
        this.f51094h.c();
    }

    @Override // k1.p
    boolean m() {
        return false;
    }
}

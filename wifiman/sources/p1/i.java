package p1;

import java.util.Iterator;
import o1.C7045a;
import o1.C7049e;
import p1.f;

/* loaded from: classes.dex */
class i extends m {
    public i(C7049e c7049e) {
        super(c7049e);
    }

    private void q(f fVar) {
        this.f57505h.f57482k.add(fVar);
        fVar.f57483l.add(this.f57505h);
    }

    @Override // p1.m, p1.d
    public void a(d dVar) {
        C7045a c7045a = (C7045a) this.f57499b;
        int iL0 = c7045a.L0();
        Iterator it = this.f57505h.f57483l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((f) it.next()).f57478g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iL0 == 0 || iL0 == 2) {
            this.f57505h.d(i11 + c7045a.M0());
        } else {
            this.f57505h.d(i10 + c7045a.M0());
        }
    }

    @Override // p1.m
    void d() {
        C7049e c7049e = this.f57499b;
        if (c7049e instanceof C7045a) {
            this.f57505h.f57473b = true;
            C7045a c7045a = (C7045a) c7049e;
            int iL0 = c7045a.L0();
            boolean zK0 = c7045a.K0();
            int i10 = 0;
            if (iL0 == 0) {
                this.f57505h.f57476e = f.a.LEFT;
                while (i10 < c7045a.f55230x0) {
                    C7049e c7049e2 = c7045a.f55229w0[i10];
                    if (zK0 || c7049e2.O() != 8) {
                        f fVar = c7049e2.f55115e.f57505h;
                        fVar.f57482k.add(this.f57505h);
                        this.f57505h.f57483l.add(fVar);
                    }
                    i10++;
                }
                q(this.f57499b.f55115e.f57505h);
                q(this.f57499b.f55115e.f57506i);
                return;
            }
            if (iL0 == 1) {
                this.f57505h.f57476e = f.a.RIGHT;
                while (i10 < c7045a.f55230x0) {
                    C7049e c7049e3 = c7045a.f55229w0[i10];
                    if (zK0 || c7049e3.O() != 8) {
                        f fVar2 = c7049e3.f55115e.f57506i;
                        fVar2.f57482k.add(this.f57505h);
                        this.f57505h.f57483l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f57499b.f55115e.f57505h);
                q(this.f57499b.f55115e.f57506i);
                return;
            }
            if (iL0 == 2) {
                this.f57505h.f57476e = f.a.TOP;
                while (i10 < c7045a.f55230x0) {
                    C7049e c7049e4 = c7045a.f55229w0[i10];
                    if (zK0 || c7049e4.O() != 8) {
                        f fVar3 = c7049e4.f55117f.f57505h;
                        fVar3.f57482k.add(this.f57505h);
                        this.f57505h.f57483l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f57499b.f55117f.f57505h);
                q(this.f57499b.f55117f.f57506i);
                return;
            }
            if (iL0 != 3) {
                return;
            }
            this.f57505h.f57476e = f.a.BOTTOM;
            while (i10 < c7045a.f55230x0) {
                C7049e c7049e5 = c7045a.f55229w0[i10];
                if (zK0 || c7049e5.O() != 8) {
                    f fVar4 = c7049e5.f55117f.f57506i;
                    fVar4.f57482k.add(this.f57505h);
                    this.f57505h.f57483l.add(fVar4);
                }
                i10++;
            }
            q(this.f57499b.f55117f.f57505h);
            q(this.f57499b.f55117f.f57506i);
        }
    }

    @Override // p1.m
    public void e() {
        C7049e c7049e = this.f57499b;
        if (c7049e instanceof C7045a) {
            int iL0 = ((C7045a) c7049e).L0();
            if (iL0 == 0 || iL0 == 1) {
                this.f57499b.F0(this.f57505h.f57478g);
            } else {
                this.f57499b.G0(this.f57505h.f57478g);
            }
        }
    }

    @Override // p1.m
    void f() {
        this.f57500c = null;
        this.f57505h.c();
    }

    @Override // p1.m
    boolean m() {
        return false;
    }
}

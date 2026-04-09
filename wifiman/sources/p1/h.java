package p1;

import o1.C7049e;
import o1.C7052h;

/* loaded from: classes.dex */
class h extends m {
    public h(C7049e c7049e) {
        super(c7049e);
        c7049e.f55115e.f();
        c7049e.f55117f.f();
        this.f57503f = ((C7052h) c7049e).K0();
    }

    private void q(f fVar) {
        this.f57505h.f57482k.add(fVar);
        fVar.f57483l.add(this.f57505h);
    }

    @Override // p1.m, p1.d
    public void a(d dVar) {
        f fVar = this.f57505h;
        if (fVar.f57474c && !fVar.f57481j) {
            this.f57505h.d((int) ((((f) fVar.f57483l.get(0)).f57478g * ((C7052h) this.f57499b).N0()) + 0.5f));
        }
    }

    @Override // p1.m
    void d() {
        C7052h c7052h = (C7052h) this.f57499b;
        int iL0 = c7052h.L0();
        int iM0 = c7052h.M0();
        c7052h.N0();
        if (c7052h.K0() == 1) {
            if (iL0 != -1) {
                this.f57505h.f57483l.add(this.f57499b.f55094N.f55115e.f57505h);
                this.f57499b.f55094N.f55115e.f57505h.f57482k.add(this.f57505h);
                this.f57505h.f57477f = iL0;
            } else if (iM0 != -1) {
                this.f57505h.f57483l.add(this.f57499b.f55094N.f55115e.f57506i);
                this.f57499b.f55094N.f55115e.f57506i.f57482k.add(this.f57505h);
                this.f57505h.f57477f = -iM0;
            } else {
                f fVar = this.f57505h;
                fVar.f57473b = true;
                fVar.f57483l.add(this.f57499b.f55094N.f55115e.f57506i);
                this.f57499b.f55094N.f55115e.f57506i.f57482k.add(this.f57505h);
            }
            q(this.f57499b.f55115e.f57505h);
            q(this.f57499b.f55115e.f57506i);
            return;
        }
        if (iL0 != -1) {
            this.f57505h.f57483l.add(this.f57499b.f55094N.f55117f.f57505h);
            this.f57499b.f55094N.f55117f.f57505h.f57482k.add(this.f57505h);
            this.f57505h.f57477f = iL0;
        } else if (iM0 != -1) {
            this.f57505h.f57483l.add(this.f57499b.f55094N.f55117f.f57506i);
            this.f57499b.f55094N.f55117f.f57506i.f57482k.add(this.f57505h);
            this.f57505h.f57477f = -iM0;
        } else {
            f fVar2 = this.f57505h;
            fVar2.f57473b = true;
            fVar2.f57483l.add(this.f57499b.f55094N.f55117f.f57506i);
            this.f57499b.f55094N.f55117f.f57506i.f57482k.add(this.f57505h);
        }
        q(this.f57499b.f55117f.f57505h);
        q(this.f57499b.f55117f.f57506i);
    }

    @Override // p1.m
    public void e() {
        if (((C7052h) this.f57499b).K0() == 1) {
            this.f57499b.F0(this.f57505h.f57478g);
        } else {
            this.f57499b.G0(this.f57505h.f57478g);
        }
    }

    @Override // p1.m
    void f() {
        this.f57505h.c();
    }

    @Override // p1.m
    boolean m() {
        return false;
    }
}

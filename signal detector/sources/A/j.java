package A;

/* loaded from: classes.dex */
public final class j extends p {
    @Override // A.d
    public final void a(d dVar) {
        g gVar = this.f50h;
        if (gVar.f21c && !gVar.f27j) {
            gVar.d((int) ((((g) gVar.f29l.get(0)).f25g * ((z.h) this.f44b).f24430q0) + 0.5f));
        }
    }

    @Override // A.p
    public final void d() {
        z.d dVar = this.f44b;
        z.h hVar = (z.h) dVar;
        int i = hVar.f24431r0;
        int i3 = hVar.f24432s0;
        int i6 = hVar.f24434u0;
        g gVar = this.f50h;
        if (i6 == 1) {
            if (i != -1) {
                gVar.f29l.add(dVar.f24310T.f24322d.f50h);
                this.f44b.f24310T.f24322d.f50h.f28k.add(gVar);
                gVar.f24f = i;
            } else if (i3 != -1) {
                gVar.f29l.add(dVar.f24310T.f24322d.i);
                this.f44b.f24310T.f24322d.i.f28k.add(gVar);
                gVar.f24f = -i3;
            } else {
                gVar.f20b = true;
                gVar.f29l.add(dVar.f24310T.f24322d.i);
                this.f44b.f24310T.f24322d.i.f28k.add(gVar);
            }
            m(this.f44b.f24322d.f50h);
            m(this.f44b.f24322d.i);
            return;
        }
        if (i != -1) {
            gVar.f29l.add(dVar.f24310T.f24324e.f50h);
            this.f44b.f24310T.f24324e.f50h.f28k.add(gVar);
            gVar.f24f = i;
        } else if (i3 != -1) {
            gVar.f29l.add(dVar.f24310T.f24324e.i);
            this.f44b.f24310T.f24324e.i.f28k.add(gVar);
            gVar.f24f = -i3;
        } else {
            gVar.f20b = true;
            gVar.f29l.add(dVar.f24310T.f24324e.i);
            this.f44b.f24310T.f24324e.i.f28k.add(gVar);
        }
        m(this.f44b.f24324e.f50h);
        m(this.f44b.f24324e.i);
    }

    @Override // A.p
    public final void e() {
        z.d dVar = this.f44b;
        int i = ((z.h) dVar).f24434u0;
        g gVar = this.f50h;
        if (i == 1) {
            dVar.f24315Y = gVar.f25g;
        } else {
            dVar.f24316Z = gVar.f25g;
        }
    }

    @Override // A.p
    public final void f() {
        this.f50h.c();
    }

    @Override // A.p
    public final boolean k() {
        return false;
    }

    public final void m(g gVar) {
        g gVar2 = this.f50h;
        gVar2.f28k.add(gVar);
        gVar.f29l.add(gVar2);
    }
}

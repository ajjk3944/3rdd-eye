package k1;

/* loaded from: classes.dex */
class j extends p {
    j(j1.e eVar) {
        super(eVar);
        eVar.f49900e.f();
        eVar.f49902f.f();
        this.f51092f = ((j1.h) eVar).b1();
    }

    private void q(f fVar) {
        this.f51094h.f51054k.add(fVar);
        fVar.f51055l.add(this.f51094h);
    }

    @Override // k1.p, k1.InterfaceC6358d
    public void a(InterfaceC6358d interfaceC6358d) {
        f fVar = this.f51094h;
        if (fVar.f51046c && !fVar.f51053j) {
            this.f51094h.d((int) ((((f) fVar.f51055l.get(0)).f51050g * ((j1.h) this.f51088b).e1()) + 0.5f));
        }
    }

    @Override // k1.p
    void d() {
        j1.h hVar = (j1.h) this.f51088b;
        int iC1 = hVar.c1();
        int iD1 = hVar.d1();
        hVar.e1();
        if (hVar.b1() == 1) {
            if (iC1 != -1) {
                this.f51094h.f51055l.add(this.f51088b.f49891Z.f49900e.f51094h);
                this.f51088b.f49891Z.f49900e.f51094h.f51054k.add(this.f51094h);
                this.f51094h.f51049f = iC1;
            } else if (iD1 != -1) {
                this.f51094h.f51055l.add(this.f51088b.f49891Z.f49900e.f51095i);
                this.f51088b.f49891Z.f49900e.f51095i.f51054k.add(this.f51094h);
                this.f51094h.f51049f = -iD1;
            } else {
                f fVar = this.f51094h;
                fVar.f51045b = true;
                fVar.f51055l.add(this.f51088b.f49891Z.f49900e.f51095i);
                this.f51088b.f49891Z.f49900e.f51095i.f51054k.add(this.f51094h);
            }
            q(this.f51088b.f49900e.f51094h);
            q(this.f51088b.f49900e.f51095i);
            return;
        }
        if (iC1 != -1) {
            this.f51094h.f51055l.add(this.f51088b.f49891Z.f49902f.f51094h);
            this.f51088b.f49891Z.f49902f.f51094h.f51054k.add(this.f51094h);
            this.f51094h.f51049f = iC1;
        } else if (iD1 != -1) {
            this.f51094h.f51055l.add(this.f51088b.f49891Z.f49902f.f51095i);
            this.f51088b.f49891Z.f49902f.f51095i.f51054k.add(this.f51094h);
            this.f51094h.f51049f = -iD1;
        } else {
            f fVar2 = this.f51094h;
            fVar2.f51045b = true;
            fVar2.f51055l.add(this.f51088b.f49891Z.f49902f.f51095i);
            this.f51088b.f49891Z.f49902f.f51095i.f51054k.add(this.f51094h);
        }
        q(this.f51088b.f49902f.f51094h);
        q(this.f51088b.f49902f.f51095i);
    }

    @Override // k1.p
    public void e() {
        if (((j1.h) this.f51088b).b1() == 1) {
            this.f51088b.V0(this.f51094h.f51050g);
        } else {
            this.f51088b.W0(this.f51094h.f51050g);
        }
    }

    @Override // k1.p
    void f() {
        this.f51094h.c();
    }

    @Override // k1.p
    boolean m() {
        return false;
    }
}

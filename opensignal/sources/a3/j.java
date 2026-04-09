package a3;

/* loaded from: classes.dex */
public final class j extends t {
    @Override // a3.d
    public final void a(d dVar) {
        g gVar = this.f82h;
        if (gVar.f53c && !gVar.j) {
            gVar.d((int) ((((g) gVar.f60l.get(0)).f57g * ((z2.l) this.f76b).f26613q0) + 0.5f));
        }
    }

    @Override // a3.t
    public final void d() {
        z2.g gVar = this.f76b;
        z2.l lVar = (z2.l) gVar;
        int i10 = lVar.f26614r0;
        int i11 = lVar.f26615s0;
        int i12 = lVar.f26617u0;
        g gVar2 = this.f82h;
        if (i12 == 1) {
            if (i10 != -1) {
                gVar2.f60l.add(gVar.U.f26542d.f82h);
                this.f76b.U.f26542d.f82h.k.add(gVar2);
                gVar2.f56f = i10;
            } else if (i11 != -1) {
                gVar2.f60l.add(gVar.U.f26542d.f83i);
                this.f76b.U.f26542d.f83i.k.add(gVar2);
                gVar2.f56f = -i11;
            } else {
                gVar2.f52b = true;
                gVar2.f60l.add(gVar.U.f26542d.f83i);
                this.f76b.U.f26542d.f83i.k.add(gVar2);
            }
            m(this.f76b.f26542d.f82h);
            m(this.f76b.f26542d.f83i);
            return;
        }
        if (i10 != -1) {
            gVar2.f60l.add(gVar.U.f26544e.f82h);
            this.f76b.U.f26544e.f82h.k.add(gVar2);
            gVar2.f56f = i10;
        } else if (i11 != -1) {
            gVar2.f60l.add(gVar.U.f26544e.f83i);
            this.f76b.U.f26544e.f83i.k.add(gVar2);
            gVar2.f56f = -i11;
        } else {
            gVar2.f52b = true;
            gVar2.f60l.add(gVar.U.f26544e.f83i);
            this.f76b.U.f26544e.f83i.k.add(gVar2);
        }
        m(this.f76b.f26544e.f82h);
        m(this.f76b.f26544e.f83i);
    }

    @Override // a3.t
    public final void e() {
        z2.g gVar = this.f76b;
        int i10 = ((z2.l) gVar).f26617u0;
        g gVar2 = this.f82h;
        if (i10 == 1) {
            gVar.Z = gVar2.f57g;
        } else {
            gVar.f26537a0 = gVar2.f57g;
        }
    }

    @Override // a3.t
    public final void f() {
        this.f82h.c();
    }

    @Override // a3.t
    public final boolean k() {
        return false;
    }

    public final void m(g gVar) {
        g gVar2 = this.f82h;
        gVar2.k.add(gVar);
        gVar.f60l.add(gVar2);
    }
}

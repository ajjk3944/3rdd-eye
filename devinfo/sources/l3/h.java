package l3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends n {
    @Override // l3.d
    public final void a(d dVar) {
        e eVar = this.f28586h;
        if (eVar.f28559c && !eVar.j) {
            eVar.d((int) ((((e) eVar.f28566l.get(0)).g * ((k3.h) this.f28581b).f27915q0) + 0.5f));
        }
    }

    @Override // l3.n
    public final void d() {
        k3.d dVar = this.f28581b;
        k3.h hVar = (k3.h) dVar;
        int i4 = hVar.f27916r0;
        int i10 = hVar.f27917s0;
        int i11 = hVar.f27919u0;
        e eVar = this.f28586h;
        if (i11 == 1) {
            if (i4 != -1) {
                eVar.f28566l.add(dVar.T.f27845d.f28586h);
                this.f28581b.T.f27845d.f28586h.f28565k.add(eVar);
                eVar.f28562f = i4;
            } else if (i10 != -1) {
                eVar.f28566l.add(dVar.T.f27845d.f28587i);
                this.f28581b.T.f27845d.f28587i.f28565k.add(eVar);
                eVar.f28562f = -i10;
            } else {
                eVar.f28558b = true;
                eVar.f28566l.add(dVar.T.f27845d.f28587i);
                this.f28581b.T.f27845d.f28587i.f28565k.add(eVar);
            }
            m(this.f28581b.f27845d.f28586h);
            m(this.f28581b.f27845d.f28587i);
            return;
        }
        if (i4 != -1) {
            eVar.f28566l.add(dVar.T.f27847e.f28586h);
            this.f28581b.T.f27847e.f28586h.f28565k.add(eVar);
            eVar.f28562f = i4;
        } else if (i10 != -1) {
            eVar.f28566l.add(dVar.T.f27847e.f28587i);
            this.f28581b.T.f27847e.f28587i.f28565k.add(eVar);
            eVar.f28562f = -i10;
        } else {
            eVar.f28558b = true;
            eVar.f28566l.add(dVar.T.f27847e.f28587i);
            this.f28581b.T.f27847e.f28587i.f28565k.add(eVar);
        }
        m(this.f28581b.f27847e.f28586h);
        m(this.f28581b.f27847e.f28587i);
    }

    @Override // l3.n
    public final void e() {
        k3.d dVar = this.f28581b;
        int i4 = ((k3.h) dVar).f27919u0;
        e eVar = this.f28586h;
        if (i4 == 1) {
            dVar.Y = eVar.g;
        } else {
            dVar.Z = eVar.g;
        }
    }

    @Override // l3.n
    public final void f() {
        this.f28586h.c();
    }

    @Override // l3.n
    public final boolean k() {
        return false;
    }

    public final void m(e eVar) {
        e eVar2 = this.f28586h;
        eVar2.f28565k.add(eVar);
        eVar.f28566l.add(eVar2);
    }
}

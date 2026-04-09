package l3;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i extends n {
    @Override // l3.d
    public final void a(d dVar) {
        k3.a aVar = (k3.a) this.f28581b;
        int i4 = aVar.f27812s0;
        e eVar = this.f28586h;
        ArrayList arrayList = eVar.f28566l;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            int i13 = ((e) obj).g;
            if (i11 == -1 || i13 < i11) {
                i11 = i13;
            }
            if (i10 < i13) {
                i10 = i13;
            }
        }
        if (i4 == 0 || i4 == 2) {
            eVar.d(i11 + aVar.f27814u0);
        } else {
            eVar.d(i10 + aVar.f27814u0);
        }
    }

    @Override // l3.n
    public final void d() {
        k3.d dVar = this.f28581b;
        if (dVar instanceof k3.a) {
            e eVar = this.f28586h;
            eVar.f28558b = true;
            ArrayList arrayList = eVar.f28566l;
            k3.a aVar = (k3.a) dVar;
            int i4 = aVar.f27812s0;
            boolean z3 = aVar.f27813t0;
            int i10 = 0;
            if (i4 == 0) {
                eVar.f28561e = 4;
                while (i10 < aVar.f27922r0) {
                    k3.d dVar2 = aVar.f27921q0[i10];
                    if (z3 || dVar2.f27851g0 != 8) {
                        e eVar2 = dVar2.f27845d.f28586h;
                        eVar2.f28565k.add(eVar);
                        arrayList.add(eVar2);
                    }
                    i10++;
                }
                m(this.f28581b.f27845d.f28586h);
                m(this.f28581b.f27845d.f28587i);
                return;
            }
            if (i4 == 1) {
                eVar.f28561e = 5;
                while (i10 < aVar.f27922r0) {
                    k3.d dVar3 = aVar.f27921q0[i10];
                    if (z3 || dVar3.f27851g0 != 8) {
                        e eVar3 = dVar3.f27845d.f28587i;
                        eVar3.f28565k.add(eVar);
                        arrayList.add(eVar3);
                    }
                    i10++;
                }
                m(this.f28581b.f27845d.f28586h);
                m(this.f28581b.f27845d.f28587i);
                return;
            }
            if (i4 == 2) {
                eVar.f28561e = 6;
                while (i10 < aVar.f27922r0) {
                    k3.d dVar4 = aVar.f27921q0[i10];
                    if (z3 || dVar4.f27851g0 != 8) {
                        e eVar4 = dVar4.f27847e.f28586h;
                        eVar4.f28565k.add(eVar);
                        arrayList.add(eVar4);
                    }
                    i10++;
                }
                m(this.f28581b.f27847e.f28586h);
                m(this.f28581b.f27847e.f28587i);
                return;
            }
            if (i4 != 3) {
                return;
            }
            eVar.f28561e = 7;
            while (i10 < aVar.f27922r0) {
                k3.d dVar5 = aVar.f27921q0[i10];
                if (z3 || dVar5.f27851g0 != 8) {
                    e eVar5 = dVar5.f27847e.f28587i;
                    eVar5.f28565k.add(eVar);
                    arrayList.add(eVar5);
                }
                i10++;
            }
            m(this.f28581b.f27847e.f28586h);
            m(this.f28581b.f27847e.f28587i);
        }
    }

    @Override // l3.n
    public final void e() {
        k3.d dVar = this.f28581b;
        if (dVar instanceof k3.a) {
            int i4 = ((k3.a) dVar).f27812s0;
            e eVar = this.f28586h;
            if (i4 == 0 || i4 == 1) {
                dVar.Y = eVar.g;
            } else {
                dVar.Z = eVar.g;
            }
        }
    }

    @Override // l3.n
    public final void f() {
        this.f28582c = null;
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

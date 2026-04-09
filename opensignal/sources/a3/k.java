package a3;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k extends t {
    @Override // a3.d
    public final void a(d dVar) {
        z2.a aVar = (z2.a) this.f76b;
        int i10 = aVar.f26507s0;
        g gVar = this.f82h;
        Iterator it = gVar.f60l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((g) it.next()).f57g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 == 0 || i10 == 2) {
            gVar.d(i12 + aVar.f26509u0);
        } else {
            gVar.d(i11 + aVar.f26509u0);
        }
    }

    @Override // a3.t
    public final void d() {
        z2.g gVar = this.f76b;
        if (gVar instanceof z2.a) {
            g gVar2 = this.f82h;
            gVar2.f52b = true;
            ArrayList arrayList = gVar2.f60l;
            z2.a aVar = (z2.a) gVar;
            int i10 = aVar.f26507s0;
            boolean z10 = aVar.f26508t0;
            int i11 = 0;
            if (i10 == 0) {
                gVar2.f55e = f.LEFT;
                while (i11 < aVar.f26620r0) {
                    z2.g gVar3 = aVar.f26619q0[i11];
                    if (z10 || gVar3.f26551h0 != 8) {
                        g gVar4 = gVar3.f26542d.f82h;
                        gVar4.k.add(gVar2);
                        arrayList.add(gVar4);
                    }
                    i11++;
                }
                m(this.f76b.f26542d.f82h);
                m(this.f76b.f26542d.f83i);
                return;
            }
            if (i10 == 1) {
                gVar2.f55e = f.RIGHT;
                while (i11 < aVar.f26620r0) {
                    z2.g gVar5 = aVar.f26619q0[i11];
                    if (z10 || gVar5.f26551h0 != 8) {
                        g gVar6 = gVar5.f26542d.f83i;
                        gVar6.k.add(gVar2);
                        arrayList.add(gVar6);
                    }
                    i11++;
                }
                m(this.f76b.f26542d.f82h);
                m(this.f76b.f26542d.f83i);
                return;
            }
            if (i10 == 2) {
                gVar2.f55e = f.TOP;
                while (i11 < aVar.f26620r0) {
                    z2.g gVar7 = aVar.f26619q0[i11];
                    if (z10 || gVar7.f26551h0 != 8) {
                        g gVar8 = gVar7.f26544e.f82h;
                        gVar8.k.add(gVar2);
                        arrayList.add(gVar8);
                    }
                    i11++;
                }
                m(this.f76b.f26544e.f82h);
                m(this.f76b.f26544e.f83i);
                return;
            }
            if (i10 != 3) {
                return;
            }
            gVar2.f55e = f.BOTTOM;
            while (i11 < aVar.f26620r0) {
                z2.g gVar9 = aVar.f26619q0[i11];
                if (z10 || gVar9.f26551h0 != 8) {
                    g gVar10 = gVar9.f26544e.f83i;
                    gVar10.k.add(gVar2);
                    arrayList.add(gVar10);
                }
                i11++;
            }
            m(this.f76b.f26544e.f82h);
            m(this.f76b.f26544e.f83i);
        }
    }

    @Override // a3.t
    public final void e() {
        z2.g gVar = this.f76b;
        if (gVar instanceof z2.a) {
            int i10 = ((z2.a) gVar).f26507s0;
            g gVar2 = this.f82h;
            if (i10 == 0 || i10 == 1) {
                gVar.Z = gVar2.f57g;
            } else {
                gVar.f26537a0 = gVar2.f57g;
            }
        }
    }

    @Override // a3.t
    public final void f() {
        this.f77c = null;
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

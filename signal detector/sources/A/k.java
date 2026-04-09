package A;

import java.util.ArrayList;
import z.C3013a;

/* loaded from: classes.dex */
public final class k extends p {
    @Override // A.d
    public final void a(d dVar) {
        C3013a c3013a = (C3013a) this.f44b;
        int i = c3013a.f24265s0;
        g gVar = this.f50h;
        ArrayList arrayList = gVar.f29l;
        int size = arrayList.size();
        int i3 = 0;
        int i6 = -1;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            int i8 = ((g) obj).f25g;
            if (i6 == -1 || i8 < i6) {
                i6 = i8;
            }
            if (i3 < i8) {
                i3 = i8;
            }
        }
        if (i == 0 || i == 2) {
            gVar.d(i6 + c3013a.f24267u0);
        } else {
            gVar.d(i3 + c3013a.f24267u0);
        }
    }

    @Override // A.p
    public final void d() {
        z.d dVar = this.f44b;
        if (dVar instanceof C3013a) {
            g gVar = this.f50h;
            gVar.f20b = true;
            C3013a c3013a = (C3013a) dVar;
            int i = c3013a.f24265s0;
            boolean z6 = c3013a.f24266t0;
            int i3 = 0;
            if (i == 0) {
                gVar.f23e = 4;
                while (i3 < c3013a.f24436r0) {
                    z.d dVar2 = c3013a.f24435q0[i3];
                    if (z6 || dVar2.f24329g0 != 8) {
                        g gVar2 = dVar2.f24322d.f50h;
                        gVar2.f28k.add(gVar);
                        gVar.f29l.add(gVar2);
                    }
                    i3++;
                }
                m(this.f44b.f24322d.f50h);
                m(this.f44b.f24322d.i);
                return;
            }
            if (i == 1) {
                gVar.f23e = 5;
                while (i3 < c3013a.f24436r0) {
                    z.d dVar3 = c3013a.f24435q0[i3];
                    if (z6 || dVar3.f24329g0 != 8) {
                        g gVar3 = dVar3.f24322d.i;
                        gVar3.f28k.add(gVar);
                        gVar.f29l.add(gVar3);
                    }
                    i3++;
                }
                m(this.f44b.f24322d.f50h);
                m(this.f44b.f24322d.i);
                return;
            }
            if (i == 2) {
                gVar.f23e = 6;
                while (i3 < c3013a.f24436r0) {
                    z.d dVar4 = c3013a.f24435q0[i3];
                    if (z6 || dVar4.f24329g0 != 8) {
                        g gVar4 = dVar4.f24324e.f50h;
                        gVar4.f28k.add(gVar);
                        gVar.f29l.add(gVar4);
                    }
                    i3++;
                }
                m(this.f44b.f24324e.f50h);
                m(this.f44b.f24324e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            gVar.f23e = 7;
            while (i3 < c3013a.f24436r0) {
                z.d dVar5 = c3013a.f24435q0[i3];
                if (z6 || dVar5.f24329g0 != 8) {
                    g gVar5 = dVar5.f24324e.i;
                    gVar5.f28k.add(gVar);
                    gVar.f29l.add(gVar5);
                }
                i3++;
            }
            m(this.f44b.f24324e.f50h);
            m(this.f44b.f24324e.i);
        }
    }

    @Override // A.p
    public final void e() {
        z.d dVar = this.f44b;
        if (dVar instanceof C3013a) {
            int i = ((C3013a) dVar).f24265s0;
            g gVar = this.f50h;
            if (i == 0 || i == 1) {
                dVar.f24315Y = gVar.f25g;
            } else {
                dVar.f24316Z = gVar.f25g;
            }
        }
    }

    @Override // A.p
    public final void f() {
        this.f45c = null;
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

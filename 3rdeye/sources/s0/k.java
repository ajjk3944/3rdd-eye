package s0;

import java.util.Iterator;
import r0.C5504a;
import r0.C5508e;
import s0.f;

/* compiled from: HelperReferences.java */
/* loaded from: classes.dex */
public final class k extends p {
    @Override // s0.p, s0.d
    public final void a(d dVar) {
        C5504a c5504a = (C5504a) this.f45947b;
        int i = c5504a.f45486t0;
        f fVar = this.f45953h;
        Iterator it = fVar.f45930l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((f) it.next()).f45926g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (i == 0 || i == 2) {
            fVar.d(i11 + c5504a.f45488v0);
        } else {
            fVar.d(i10 + c5504a.f45488v0);
        }
    }

    @Override // s0.p
    public final void d() {
        C5508e c5508e = this.f45947b;
        if (c5508e instanceof C5504a) {
            f fVar = this.f45953h;
            fVar.f45921b = true;
            C5504a c5504a = (C5504a) c5508e;
            int i = c5504a.f45486t0;
            boolean z10 = c5504a.f45487u0;
            int i10 = 0;
            if (i == 0) {
                fVar.f45924e = f.a.LEFT;
                while (i10 < c5504a.f45654s0) {
                    C5508e c5508e2 = c5504a.f45653r0[i10];
                    if (z10 || c5508e2.f45557i0 != 8) {
                        f fVar2 = c5508e2.f45547d.f45953h;
                        fVar2.f45929k.add(fVar);
                        fVar.f45930l.add(fVar2);
                    }
                    i10++;
                }
                m(this.f45947b.f45547d.f45953h);
                m(this.f45947b.f45547d.i);
                return;
            }
            if (i == 1) {
                fVar.f45924e = f.a.RIGHT;
                while (i10 < c5504a.f45654s0) {
                    C5508e c5508e3 = c5504a.f45653r0[i10];
                    if (z10 || c5508e3.f45557i0 != 8) {
                        f fVar3 = c5508e3.f45547d.i;
                        fVar3.f45929k.add(fVar);
                        fVar.f45930l.add(fVar3);
                    }
                    i10++;
                }
                m(this.f45947b.f45547d.f45953h);
                m(this.f45947b.f45547d.i);
                return;
            }
            if (i == 2) {
                fVar.f45924e = f.a.TOP;
                while (i10 < c5504a.f45654s0) {
                    C5508e c5508e4 = c5504a.f45653r0[i10];
                    if (z10 || c5508e4.f45557i0 != 8) {
                        f fVar4 = c5508e4.f45549e.f45953h;
                        fVar4.f45929k.add(fVar);
                        fVar.f45930l.add(fVar4);
                    }
                    i10++;
                }
                m(this.f45947b.f45549e.f45953h);
                m(this.f45947b.f45549e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            fVar.f45924e = f.a.BOTTOM;
            while (i10 < c5504a.f45654s0) {
                C5508e c5508e5 = c5504a.f45653r0[i10];
                if (z10 || c5508e5.f45557i0 != 8) {
                    f fVar5 = c5508e5.f45549e.i;
                    fVar5.f45929k.add(fVar);
                    fVar.f45930l.add(fVar5);
                }
                i10++;
            }
            m(this.f45947b.f45549e.f45953h);
            m(this.f45947b.f45549e.i);
        }
    }

    @Override // s0.p
    public final void e() {
        C5508e c5508e = this.f45947b;
        if (c5508e instanceof C5504a) {
            int i = ((C5504a) c5508e).f45486t0;
            f fVar = this.f45953h;
            if (i == 0 || i == 1) {
                c5508e.f45542a0 = fVar.f45926g;
            } else {
                c5508e.f45544b0 = fVar.f45926g;
            }
        }
    }

    @Override // s0.p
    public final void f() {
        this.f45948c = null;
        this.f45953h.c();
    }

    @Override // s0.p
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f45953h;
        fVar2.f45929k.add(fVar);
        fVar.f45930l.add(fVar2);
    }
}

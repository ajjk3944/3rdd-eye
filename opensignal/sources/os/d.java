package os;

import rs.p;
import rs.x;

/* loaded from: classes.dex */
public final class d extends rs.k implements x {
    public c B;

    /* renamed from: d, reason: collision with root package name */
    public int f19747d;

    /* renamed from: g, reason: collision with root package name */
    public b f19748g;

    /* renamed from: r, reason: collision with root package name */
    public c f19749r;

    /* renamed from: x, reason: collision with root package name */
    public c f19750x;

    /* renamed from: y, reason: collision with root package name */
    public c f19751y;

    public static d g() {
        d dVar = new d();
        dVar.f19748g = b.B;
        c cVar = c.B;
        dVar.f19749r = cVar;
        dVar.f19750x = cVar;
        dVar.f19751y = cVar;
        dVar.B = cVar;
        return dVar;
    }

    @Override // rs.k
    public final rs.b c() {
        e eVarF = f();
        eVarF.b();
        return eVarF;
    }

    public final Object clone() {
        d dVarG = g();
        dVarG.h(f());
        return dVarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // rs.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final rs.k d(f5.u r3, rs.g r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            ls.a r1 = os.e.G     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            os.e r1 = new os.e     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> Lf
            os.e r4 = (os.e) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.h(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: os.d.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(p pVar) {
        h((e) pVar);
        return this;
    }

    public final e f() {
        e eVar = new e(this);
        int i10 = this.f19747d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        eVar.f19754g = this.f19748g;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        eVar.f19755r = this.f19749r;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        eVar.f19756x = this.f19750x;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        eVar.f19757y = this.f19751y;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        eVar.B = this.B;
        eVar.f19753d = i11;
        return eVar;
    }

    public final void h(e eVar) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        b bVar;
        if (eVar == e.F) {
            return;
        }
        if ((eVar.f19753d & 1) == 1) {
            b bVar2 = eVar.f19754g;
            if ((this.f19747d & 1) != 1 || (bVar = this.f19748g) == b.B) {
                this.f19748g = bVar2;
            } else {
                a aVar = new a(0);
                aVar.h(bVar);
                aVar.h(bVar2);
                this.f19748g = aVar.f();
            }
            this.f19747d |= 1;
        }
        if ((eVar.f19753d & 2) == 2) {
            c cVar5 = eVar.f19755r;
            if ((this.f19747d & 2) != 2 || (cVar4 = this.f19749r) == c.B) {
                this.f19749r = cVar5;
            } else {
                a aVarI = c.i(cVar4);
                aVarI.i(cVar5);
                this.f19749r = aVarI.g();
            }
            this.f19747d |= 2;
        }
        if ((eVar.f19753d & 4) == 4) {
            c cVar6 = eVar.f19756x;
            if ((this.f19747d & 4) != 4 || (cVar3 = this.f19750x) == c.B) {
                this.f19750x = cVar6;
            } else {
                a aVarI2 = c.i(cVar3);
                aVarI2.i(cVar6);
                this.f19750x = aVarI2.g();
            }
            this.f19747d |= 4;
        }
        if ((eVar.f19753d & 8) == 8) {
            c cVar7 = eVar.f19757y;
            if ((this.f19747d & 8) != 8 || (cVar2 = this.f19751y) == c.B) {
                this.f19751y = cVar7;
            } else {
                a aVarI3 = c.i(cVar2);
                aVarI3.i(cVar7);
                this.f19751y = aVarI3.g();
            }
            this.f19747d |= 8;
        }
        if ((eVar.f19753d & 16) == 16) {
            c cVar8 = eVar.B;
            if ((this.f19747d & 16) != 16 || (cVar = this.B) == c.B) {
                this.B = cVar8;
            } else {
                a aVarI4 = c.i(cVar);
                aVarI4.i(cVar8);
                this.B = aVarI4.g();
            }
            this.f19747d |= 16;
        }
        this.f21763a = this.f21763a.b(eVar.f19752a);
    }
}

package ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends rs.k implements rs.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15768d;

    /* renamed from: g, reason: collision with root package name */
    public int f15769g;

    /* renamed from: r, reason: collision with root package name */
    public Object f15770r;

    /* renamed from: x, reason: collision with root package name */
    public int f15771x;

    public /* synthetic */ f(int i10) {
        this.f15768d = i10;
    }

    public static f i() {
        f fVar = new f(1);
        fVar.f15770r = Collections.EMPTY_LIST;
        fVar.f15771x = -1;
        return fVar;
    }

    @Override // rs.k
    public final rs.b c() {
        switch (this.f15768d) {
            case 0:
                g gVarG = g();
                if (gVarG.b()) {
                    return gVarG;
                }
                throw new bf.n();
            case 1:
                w0 w0VarH = h();
                if (w0VarH.b()) {
                    return w0VarH;
                }
                throw new bf.n();
            default:
                e eVarF = f();
                if (eVarF.b()) {
                    return eVarF;
                }
                throw new bf.n();
        }
    }

    public final Object clone() {
        switch (this.f15768d) {
            case 0:
                f fVar = new f(0);
                fVar.f15770r = Collections.EMPTY_LIST;
                fVar.k(g());
                return fVar;
            case 1:
                f fVarI = i();
                fVarI.l(h());
                return fVarI;
            default:
                f fVar2 = new f(2);
                fVar2.f15770r = d.L;
                fVar2.j(f());
                return fVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005c  */
    @Override // rs.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final rs.k d(f5.u r3, rs.g r4) throws java.lang.Throwable {
        /*
            r2 = this;
            int r0 = r2.f15768d
            switch(r0) {
                case 0: goto L43;
                case 1: goto L24;
                default: goto L5;
            }
        L5:
            r0 = 0
            ls.a r1 = ls.e.D     // Catch: java.lang.Throwable -> L14 rs.t -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L14 rs.t -> L16
            ls.e r1 = new ls.e     // Catch: java.lang.Throwable -> L14 rs.t -> L16
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L14 rs.t -> L16
            r2.j(r1)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> L14
            ls.e r4 = (ls.e) r4     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r0 = r4
        L1e:
            if (r0 == 0) goto L23
            r2.j(r0)
        L23:
            throw r3
        L24:
            r0 = 0
            ls.a r1 = ls.w0.D     // Catch: java.lang.Throwable -> L33 rs.t -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L33 rs.t -> L35
            ls.w0 r1 = new ls.w0     // Catch: java.lang.Throwable -> L33 rs.t -> L35
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33 rs.t -> L35
            r2.l(r1)
            return r2
        L33:
            r3 = move-exception
            goto L3d
        L35:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> L33
            ls.w0 r4 = (ls.w0) r4     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            r0 = r4
        L3d:
            if (r0 == 0) goto L42
            r2.l(r0)
        L42:
            throw r3
        L43:
            r0 = 0
            ls.a r1 = ls.g.D     // Catch: java.lang.Throwable -> L50 rs.t -> L52
            java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> L50 rs.t -> L52
            ls.g r3 = (ls.g) r3     // Catch: java.lang.Throwable -> L50 rs.t -> L52
            r2.k(r3)
            return r2
        L50:
            r3 = move-exception
            goto L5a
        L52:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> L50
            ls.g r4 = (ls.g) r4     // Catch: java.lang.Throwable -> L50
            throw r3     // Catch: java.lang.Throwable -> L58
        L58:
            r3 = move-exception
            r0 = r4
        L5a:
            if (r0 == 0) goto L5f
            r2.k(r0)
        L5f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.f.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(rs.p pVar) {
        switch (this.f15768d) {
            case 0:
                k((g) pVar);
                break;
            case 1:
                l((w0) pVar);
                break;
            default:
                j((e) pVar);
                break;
        }
        return this;
    }

    public e f() {
        e eVar = new e(this);
        int i10 = this.f15769g;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        eVar.f15759g = this.f15771x;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        eVar.f15760r = (d) this.f15770r;
        eVar.f15758d = i11;
        return eVar;
    }

    public g g() {
        g gVar = new g(this);
        int i10 = this.f15769g;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        gVar.f15777g = this.f15771x;
        if ((i10 & 2) == 2) {
            this.f15770r = Collections.unmodifiableList((List) this.f15770r);
            this.f15769g &= -3;
        }
        gVar.f15778r = (List) this.f15770r;
        gVar.f15776d = i11;
        return gVar;
    }

    public w0 h() {
        w0 w0Var = new w0(this);
        int i10 = this.f15769g;
        if ((i10 & 1) == 1) {
            this.f15770r = Collections.unmodifiableList((List) this.f15770r);
            this.f15769g &= -2;
        }
        w0Var.f15905g = (List) this.f15770r;
        int i11 = (i10 & 2) != 2 ? 0 : 1;
        w0Var.f15906r = this.f15771x;
        w0Var.f15904d = i11;
        return w0Var;
    }

    public void j(e eVar) {
        d dVar;
        if (eVar == e.B) {
            return;
        }
        int i10 = eVar.f15758d;
        if ((i10 & 1) == 1) {
            int i11 = eVar.f15759g;
            this.f15769g = 1 | this.f15769g;
            this.f15771x = i11;
        }
        if ((i10 & 2) == 2) {
            d dVar2 = eVar.f15760r;
            if ((this.f15769g & 2) != 2 || (dVar = (d) this.f15770r) == d.L) {
                this.f15770r = dVar2;
            } else {
                b bVarG = b.g();
                bVarG.h(dVar);
                bVarG.h(dVar2);
                this.f15770r = bVarG.f();
            }
            this.f15769g |= 2;
        }
        this.f21763a = this.f21763a.b(eVar.f15757a);
    }

    public void k(g gVar) {
        if (gVar == g.B) {
            return;
        }
        if ((gVar.f15776d & 1) == 1) {
            int i10 = gVar.f15777g;
            this.f15769g = 1 | this.f15769g;
            this.f15771x = i10;
        }
        if (!gVar.f15778r.isEmpty()) {
            if (((List) this.f15770r).isEmpty()) {
                this.f15770r = gVar.f15778r;
                this.f15769g &= -3;
            } else {
                if ((this.f15769g & 2) != 2) {
                    this.f15770r = new ArrayList((List) this.f15770r);
                    this.f15769g |= 2;
                }
                ((List) this.f15770r).addAll(gVar.f15778r);
            }
        }
        this.f21763a = this.f21763a.b(gVar.f15775a);
    }

    public void l(w0 w0Var) {
        if (w0Var == w0.B) {
            return;
        }
        if (!w0Var.f15905g.isEmpty()) {
            if (((List) this.f15770r).isEmpty()) {
                this.f15770r = w0Var.f15905g;
                this.f15769g &= -2;
            } else {
                if ((this.f15769g & 1) != 1) {
                    this.f15770r = new ArrayList((List) this.f15770r);
                    this.f15769g |= 1;
                }
                ((List) this.f15770r).addAll(w0Var.f15905g);
            }
        }
        if ((w0Var.f15904d & 1) == 1) {
            int i10 = w0Var.f15906r;
            this.f15769g |= 2;
            this.f15771x = i10;
        }
        this.f21763a = this.f21763a.b(w0Var.f15903a);
    }
}

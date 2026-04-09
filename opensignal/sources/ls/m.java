package ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends rs.k implements rs.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15831d;

    /* renamed from: g, reason: collision with root package name */
    public int f15832g;

    /* renamed from: r, reason: collision with root package name */
    public List f15833r;

    public /* synthetic */ m(int i10) {
        this.f15831d = i10;
    }

    @Override // rs.k
    public final rs.b c() {
        switch (this.f15831d) {
            case 0:
                n nVarF = f();
                if (nVarF.b()) {
                    return nVarF;
                }
                throw new bf.n();
            case 1:
                k0 k0VarG = g();
                if (k0VarG.b()) {
                    return k0VarG;
                }
                throw new bf.n();
            case 2:
                d1 d1VarI = i();
                d1VarI.b();
                return d1VarI;
            default:
                l0 l0VarH = h();
                l0VarH.b();
                return l0VarH;
        }
    }

    public final Object clone() {
        switch (this.f15831d) {
            case 0:
                m mVar = new m(0);
                mVar.f15833r = Collections.EMPTY_LIST;
                mVar.j(f());
                return mVar;
            case 1:
                m mVar2 = new m(1);
                mVar2.f15833r = Collections.EMPTY_LIST;
                mVar2.k(g());
                return mVar2;
            case 2:
                m mVar3 = new m(2);
                mVar3.f15833r = Collections.EMPTY_LIST;
                mVar3.m(i());
                return mVar3;
            default:
                m mVar4 = new m(3);
                mVar4.f15833r = rs.u.f21777d;
                mVar4.l(h());
                return mVar4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007d  */
    @Override // rs.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final rs.k d(f5.u r3, rs.g r4) throws java.lang.Throwable {
        /*
            r2 = this;
            int r0 = r2.f15831d
            switch(r0) {
                case 0: goto L62;
                case 1: goto L43;
                case 2: goto L24;
                default: goto L5;
            }
        L5:
            r4 = 0
            ls.a r0 = ls.l0.f15826y     // Catch: java.lang.Throwable -> L14 rs.t -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L14 rs.t -> L16
            ls.l0 r0 = new ls.l0     // Catch: java.lang.Throwable -> L14 rs.t -> L16
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L14 rs.t -> L16
            r2.l(r0)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            rs.b r0 = r3.f21776a     // Catch: java.lang.Throwable -> L14
            ls.l0 r0 = (ls.l0) r0     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r4 = r0
        L1e:
            if (r4 == 0) goto L23
            r2.l(r4)
        L23:
            throw r3
        L24:
            r0 = 0
            ls.a r1 = ls.d1.f15752y     // Catch: java.lang.Throwable -> L33 rs.t -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L33 rs.t -> L35
            ls.d1 r1 = new ls.d1     // Catch: java.lang.Throwable -> L33 rs.t -> L35
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33 rs.t -> L35
            r2.m(r1)
            return r2
        L33:
            r3 = move-exception
            goto L3d
        L35:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> L33
            ls.d1 r4 = (ls.d1) r4     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            r0 = r4
        L3d:
            if (r0 == 0) goto L42
            r2.m(r0)
        L42:
            throw r3
        L43:
            r0 = 0
            ls.a r1 = ls.k0.f15815y     // Catch: java.lang.Throwable -> L52 rs.t -> L54
            r1.getClass()     // Catch: java.lang.Throwable -> L52 rs.t -> L54
            ls.k0 r1 = new ls.k0     // Catch: java.lang.Throwable -> L52 rs.t -> L54
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L52 rs.t -> L54
            r2.k(r1)
            return r2
        L52:
            r3 = move-exception
            goto L5c
        L54:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> L52
            ls.k0 r4 = (ls.k0) r4     // Catch: java.lang.Throwable -> L52
            throw r3     // Catch: java.lang.Throwable -> L5a
        L5a:
            r3 = move-exception
            r0 = r4
        L5c:
            if (r0 == 0) goto L61
            r2.k(r0)
        L61:
            throw r3
        L62:
            r0 = 0
            ls.a r1 = ls.n.f15839y     // Catch: java.lang.Throwable -> L71 rs.t -> L73
            r1.getClass()     // Catch: java.lang.Throwable -> L71 rs.t -> L73
            ls.n r1 = new ls.n     // Catch: java.lang.Throwable -> L71 rs.t -> L73
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L71 rs.t -> L73
            r2.j(r1)
            return r2
        L71:
            r3 = move-exception
            goto L7b
        L73:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> L71
            ls.n r4 = (ls.n) r4     // Catch: java.lang.Throwable -> L71
            throw r3     // Catch: java.lang.Throwable -> L79
        L79:
            r3 = move-exception
            r0 = r4
        L7b:
            if (r0 == 0) goto L80
            r2.j(r0)
        L80:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.m.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(rs.p pVar) {
        switch (this.f15831d) {
            case 0:
                j((n) pVar);
                break;
            case 1:
                k((k0) pVar);
                break;
            case 2:
                m((d1) pVar);
                break;
            default:
                l((l0) pVar);
                break;
        }
        return this;
    }

    public n f() {
        n nVar = new n(this);
        if ((this.f15832g & 1) == 1) {
            this.f15833r = Collections.unmodifiableList(this.f15833r);
            this.f15832g &= -2;
        }
        nVar.f15841d = this.f15833r;
        return nVar;
    }

    public k0 g() {
        k0 k0Var = new k0(this);
        if ((this.f15832g & 1) == 1) {
            this.f15833r = Collections.unmodifiableList(this.f15833r);
            this.f15832g &= -2;
        }
        k0Var.f15817d = this.f15833r;
        return k0Var;
    }

    public l0 h() {
        l0 l0Var = new l0(this);
        if ((this.f15832g & 1) == 1) {
            this.f15833r = ((rs.v) this.f15833r).L();
            this.f15832g &= -2;
        }
        l0Var.f15828d = (rs.v) this.f15833r;
        return l0Var;
    }

    public d1 i() {
        d1 d1Var = new d1(this);
        if ((this.f15832g & 1) == 1) {
            this.f15833r = Collections.unmodifiableList(this.f15833r);
            this.f15832g &= -2;
        }
        d1Var.f15754d = this.f15833r;
        return d1Var;
    }

    public void j(n nVar) {
        if (nVar == n.f15838x) {
            return;
        }
        if (!nVar.f15841d.isEmpty()) {
            if (this.f15833r.isEmpty()) {
                this.f15833r = nVar.f15841d;
                this.f15832g &= -2;
            } else {
                if ((this.f15832g & 1) != 1) {
                    this.f15833r = new ArrayList(this.f15833r);
                    this.f15832g |= 1;
                }
                this.f15833r.addAll(nVar.f15841d);
            }
        }
        this.f21763a = this.f21763a.b(nVar.f15840a);
    }

    public void k(k0 k0Var) {
        if (k0Var == k0.f15814x) {
            return;
        }
        if (!k0Var.f15817d.isEmpty()) {
            if (this.f15833r.isEmpty()) {
                this.f15833r = k0Var.f15817d;
                this.f15832g &= -2;
            } else {
                if ((this.f15832g & 1) != 1) {
                    this.f15833r = new ArrayList(this.f15833r);
                    this.f15832g |= 1;
                }
                this.f15833r.addAll(k0Var.f15817d);
            }
        }
        this.f21763a = this.f21763a.b(k0Var.f15816a);
    }

    public void l(l0 l0Var) {
        if (l0Var == l0.f15825x) {
            return;
        }
        if (!l0Var.f15828d.isEmpty()) {
            if (((rs.v) this.f15833r).isEmpty()) {
                this.f15833r = l0Var.f15828d;
                this.f15832g &= -2;
            } else {
                if ((this.f15832g & 1) != 1) {
                    this.f15833r = new rs.u((rs.v) this.f15833r);
                    this.f15832g |= 1;
                }
                ((rs.v) this.f15833r).addAll(l0Var.f15828d);
            }
        }
        this.f21763a = this.f21763a.b(l0Var.f15827a);
    }

    public void m(d1 d1Var) {
        if (d1Var == d1.f15751x) {
            return;
        }
        if (!d1Var.f15754d.isEmpty()) {
            if (this.f15833r.isEmpty()) {
                this.f15833r = d1Var.f15754d;
                this.f15832g &= -2;
            } else {
                if ((this.f15832g & 1) != 1) {
                    this.f15833r = new ArrayList(this.f15833r);
                    this.f15832g |= 1;
                }
                this.f15833r.addAll(d1Var.f15754d);
            }
        }
        this.f21763a = this.f21763a.b(d1Var.f15753a);
    }
}

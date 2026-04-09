package ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class t0 extends rs.l {
    public boolean B;
    public u0 D;
    public List E;
    public List F;

    /* renamed from: r, reason: collision with root package name */
    public int f15884r;

    /* renamed from: x, reason: collision with root package name */
    public int f15885x;

    /* renamed from: y, reason: collision with root package name */
    public int f15886y;

    public static t0 h() {
        t0 t0Var = new t0();
        t0Var.D = u0.INV;
        List list = Collections.EMPTY_LIST;
        t0Var.E = list;
        t0Var.F = list;
        return t0Var;
    }

    @Override // rs.k
    public final rs.b c() {
        v0 v0VarG = g();
        if (v0VarG.b()) {
            return v0VarG;
        }
        throw new bf.n();
    }

    public final Object clone() {
        t0 t0VarH = h();
        t0VarH.i(g());
        return t0VarH;
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
            ls.a r1 = ls.v0.J     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            ls.v0 r1 = new ls.v0     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> Lf
            ls.v0 r4 = (ls.v0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.i(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.t0.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(rs.p pVar) {
        i((v0) pVar);
        return this;
    }

    public final v0 g() {
        v0 v0Var = new v0(this);
        int i10 = this.f15884r;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        v0Var.f15894r = this.f15885x;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        v0Var.f15895x = this.f15886y;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        v0Var.f15896y = this.B;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        v0Var.B = this.D;
        if ((i10 & 16) == 16) {
            this.E = Collections.unmodifiableList(this.E);
            this.f15884r &= -17;
        }
        v0Var.D = this.E;
        if ((this.f15884r & 32) == 32) {
            this.F = Collections.unmodifiableList(this.F);
            this.f15884r &= -33;
        }
        v0Var.E = this.F;
        v0Var.f15893g = i11;
        return v0Var;
    }

    public final void i(v0 v0Var) {
        if (v0Var == v0.I) {
            return;
        }
        int i10 = v0Var.f15893g;
        if ((i10 & 1) == 1) {
            int i11 = v0Var.f15894r;
            this.f15884r = 1 | this.f15884r;
            this.f15885x = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = v0Var.f15895x;
            this.f15884r = 2 | this.f15884r;
            this.f15886y = i12;
        }
        if ((i10 & 4) == 4) {
            boolean z10 = v0Var.f15896y;
            this.f15884r = 4 | this.f15884r;
            this.B = z10;
        }
        if ((i10 & 8) == 8) {
            u0 u0Var = v0Var.B;
            u0Var.getClass();
            this.f15884r = 8 | this.f15884r;
            this.D = u0Var;
        }
        if (!v0Var.D.isEmpty()) {
            if (this.E.isEmpty()) {
                this.E = v0Var.D;
                this.f15884r &= -17;
            } else {
                if ((this.f15884r & 16) != 16) {
                    this.E = new ArrayList(this.E);
                    this.f15884r |= 16;
                }
                this.E.addAll(v0Var.D);
            }
        }
        if (!v0Var.E.isEmpty()) {
            if (this.F.isEmpty()) {
                this.F = v0Var.E;
                this.f15884r &= -33;
            } else {
                if ((this.f15884r & 32) != 32) {
                    this.F = new ArrayList(this.F);
                    this.f15884r |= 32;
                }
                this.F.addAll(v0Var.E);
            }
        }
        f(v0Var);
        this.f21763a = this.f21763a.b(v0Var.f15892d);
    }
}

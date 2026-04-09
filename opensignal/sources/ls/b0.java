package ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b0 extends rs.l {
    public List B;
    public w0 D;
    public d1 E;

    /* renamed from: r, reason: collision with root package name */
    public int f15728r;

    /* renamed from: x, reason: collision with root package name */
    public List f15729x;

    /* renamed from: y, reason: collision with root package name */
    public List f15730y;

    public static b0 h() {
        b0 b0Var = new b0();
        List list = Collections.EMPTY_LIST;
        b0Var.f15729x = list;
        b0Var.f15730y = list;
        b0Var.B = list;
        b0Var.D = w0.B;
        b0Var.E = d1.f15751x;
        return b0Var;
    }

    @Override // rs.k
    public final rs.b c() {
        c0 c0VarG = g();
        if (c0VarG.b()) {
            return c0VarG;
        }
        throw new bf.n();
    }

    public final Object clone() {
        b0 b0VarH = h();
        b0VarH.i(g());
        return b0VarH;
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
            ls.a r1 = ls.c0.H     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            ls.c0 r1 = new ls.c0     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> Lf
            ls.c0 r4 = (ls.c0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: ls.b0.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(rs.p pVar) {
        i((c0) pVar);
        return this;
    }

    public final c0 g() {
        c0 c0Var = new c0(this);
        int i10 = this.f15728r;
        if ((i10 & 1) == 1) {
            this.f15729x = Collections.unmodifiableList(this.f15729x);
            this.f15728r &= -2;
        }
        c0Var.f15733r = this.f15729x;
        if ((this.f15728r & 2) == 2) {
            this.f15730y = Collections.unmodifiableList(this.f15730y);
            this.f15728r &= -3;
        }
        c0Var.f15734x = this.f15730y;
        if ((this.f15728r & 4) == 4) {
            this.B = Collections.unmodifiableList(this.B);
            this.f15728r &= -5;
        }
        c0Var.f15735y = this.B;
        int i11 = (i10 & 8) != 8 ? 0 : 1;
        c0Var.B = this.D;
        if ((i10 & 16) == 16) {
            i11 |= 2;
        }
        c0Var.D = this.E;
        c0Var.f15732g = i11;
        return c0Var;
    }

    public final void i(c0 c0Var) {
        d1 d1Var;
        w0 w0Var;
        if (c0Var == c0.G) {
            return;
        }
        if (!c0Var.f15733r.isEmpty()) {
            if (this.f15729x.isEmpty()) {
                this.f15729x = c0Var.f15733r;
                this.f15728r &= -2;
            } else {
                if ((this.f15728r & 1) != 1) {
                    this.f15729x = new ArrayList(this.f15729x);
                    this.f15728r |= 1;
                }
                this.f15729x.addAll(c0Var.f15733r);
            }
        }
        if (!c0Var.f15734x.isEmpty()) {
            if (this.f15730y.isEmpty()) {
                this.f15730y = c0Var.f15734x;
                this.f15728r &= -3;
            } else {
                if ((this.f15728r & 2) != 2) {
                    this.f15730y = new ArrayList(this.f15730y);
                    this.f15728r |= 2;
                }
                this.f15730y.addAll(c0Var.f15734x);
            }
        }
        if (!c0Var.f15735y.isEmpty()) {
            if (this.B.isEmpty()) {
                this.B = c0Var.f15735y;
                this.f15728r &= -5;
            } else {
                if ((this.f15728r & 4) != 4) {
                    this.B = new ArrayList(this.B);
                    this.f15728r |= 4;
                }
                this.B.addAll(c0Var.f15735y);
            }
        }
        if ((c0Var.f15732g & 1) == 1) {
            w0 w0Var2 = c0Var.B;
            if ((this.f15728r & 8) != 8 || (w0Var = this.D) == w0.B) {
                this.D = w0Var2;
            } else {
                f fVarI = w0.i(w0Var);
                fVarI.l(w0Var2);
                this.D = fVarI.h();
            }
            this.f15728r |= 8;
        }
        if ((c0Var.f15732g & 2) == 2) {
            d1 d1Var2 = c0Var.D;
            if ((this.f15728r & 16) != 16 || (d1Var = this.E) == d1.f15751x) {
                this.E = d1Var2;
            } else {
                m mVar = new m(2);
                mVar.f15833r = Collections.EMPTY_LIST;
                mVar.m(d1Var);
                mVar.m(d1Var2);
                this.E = mVar.i();
            }
            this.f15728r |= 16;
        }
        f(c0Var);
        this.f21763a = this.f21763a.b(c0Var.f15731d);
    }
}

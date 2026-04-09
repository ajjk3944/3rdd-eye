package ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class r0 extends rs.l {
    public List B;
    public q0 D;
    public int E;
    public q0 F;
    public int G;
    public List H;
    public List I;

    /* renamed from: r, reason: collision with root package name */
    public int f15869r;

    /* renamed from: x, reason: collision with root package name */
    public int f15870x;

    /* renamed from: y, reason: collision with root package name */
    public int f15871y;

    public static r0 h() {
        r0 r0Var = new r0();
        r0Var.f15870x = 6;
        List list = Collections.EMPTY_LIST;
        r0Var.B = list;
        q0 q0Var = q0.P;
        r0Var.D = q0Var;
        r0Var.F = q0Var;
        r0Var.H = list;
        r0Var.I = list;
        return r0Var;
    }

    @Override // rs.k
    public final rs.b c() {
        s0 s0VarG = g();
        if (s0VarG.b()) {
            return s0VarG;
        }
        throw new bf.n();
    }

    public final Object clone() {
        r0 r0VarH = h();
        r0VarH.i(g());
        return r0VarH;
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
            ls.a r1 = ls.s0.L     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            ls.s0 r1 = new ls.s0     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> Lf
            ls.s0 r4 = (ls.s0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: ls.r0.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(rs.p pVar) {
        i((s0) pVar);
        return this;
    }

    public final s0 g() {
        s0 s0Var = new s0(this);
        int i10 = this.f15869r;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        s0Var.f15876r = this.f15870x;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        s0Var.f15877x = this.f15871y;
        if ((i10 & 4) == 4) {
            this.B = Collections.unmodifiableList(this.B);
            this.f15869r &= -5;
        }
        s0Var.f15878y = this.B;
        if ((i10 & 8) == 8) {
            i11 |= 4;
        }
        s0Var.B = this.D;
        if ((i10 & 16) == 16) {
            i11 |= 8;
        }
        s0Var.D = this.E;
        if ((i10 & 32) == 32) {
            i11 |= 16;
        }
        s0Var.E = this.F;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        s0Var.F = this.G;
        if ((this.f15869r & 128) == 128) {
            this.H = Collections.unmodifiableList(this.H);
            this.f15869r &= -129;
        }
        s0Var.G = this.H;
        if ((this.f15869r & 256) == 256) {
            this.I = Collections.unmodifiableList(this.I);
            this.f15869r &= -257;
        }
        s0Var.H = this.I;
        s0Var.f15875g = i11;
        return s0Var;
    }

    public final void i(s0 s0Var) {
        q0 q0Var;
        q0 q0Var2;
        if (s0Var == s0.K) {
            return;
        }
        int i10 = s0Var.f15875g;
        if ((i10 & 1) == 1) {
            int i11 = s0Var.f15876r;
            this.f15869r = 1 | this.f15869r;
            this.f15870x = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = s0Var.f15877x;
            this.f15869r = 2 | this.f15869r;
            this.f15871y = i12;
        }
        if (!s0Var.f15878y.isEmpty()) {
            if (this.B.isEmpty()) {
                this.B = s0Var.f15878y;
                this.f15869r &= -5;
            } else {
                if ((this.f15869r & 4) != 4) {
                    this.B = new ArrayList(this.B);
                    this.f15869r |= 4;
                }
                this.B.addAll(s0Var.f15878y);
            }
        }
        if ((s0Var.f15875g & 4) == 4) {
            q0 q0Var3 = s0Var.B;
            if ((this.f15869r & 8) != 8 || (q0Var2 = this.D) == q0.P) {
                this.D = q0Var3;
            } else {
                p0 p0VarR = q0.r(q0Var2);
                p0VarR.i(q0Var3);
                this.D = p0VarR.g();
            }
            this.f15869r |= 8;
        }
        int i13 = s0Var.f15875g;
        if ((i13 & 8) == 8) {
            int i14 = s0Var.D;
            this.f15869r |= 16;
            this.E = i14;
        }
        if ((i13 & 16) == 16) {
            q0 q0Var4 = s0Var.E;
            if ((this.f15869r & 32) != 32 || (q0Var = this.F) == q0.P) {
                this.F = q0Var4;
            } else {
                p0 p0VarR2 = q0.r(q0Var);
                p0VarR2.i(q0Var4);
                this.F = p0VarR2.g();
            }
            this.f15869r |= 32;
        }
        if ((s0Var.f15875g & 32) == 32) {
            int i15 = s0Var.F;
            this.f15869r |= 64;
            this.G = i15;
        }
        if (!s0Var.G.isEmpty()) {
            if (this.H.isEmpty()) {
                this.H = s0Var.G;
                this.f15869r &= -129;
            } else {
                if ((this.f15869r & 128) != 128) {
                    this.H = new ArrayList(this.H);
                    this.f15869r |= 128;
                }
                this.H.addAll(s0Var.G);
            }
        }
        if (!s0Var.H.isEmpty()) {
            if (this.I.isEmpty()) {
                this.I = s0Var.H;
                this.f15869r &= -257;
            } else {
                if ((this.f15869r & 256) != 256) {
                    this.I = new ArrayList(this.I);
                    this.f15869r |= 256;
                }
                this.I.addAll(s0Var.H);
            }
        }
        f(s0Var);
        this.f21763a = this.f21763a.b(s0Var.f15874d);
    }
}

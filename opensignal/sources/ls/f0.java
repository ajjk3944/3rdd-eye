package ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 extends rs.l {
    public int B;
    public q0 D;
    public int E;
    public List F;
    public q0 G;
    public int H;
    public List I;
    public List J;
    public y0 K;
    public int L;
    public int M;
    public List N;

    /* renamed from: r, reason: collision with root package name */
    public int f15772r;

    /* renamed from: x, reason: collision with root package name */
    public int f15773x;

    /* renamed from: y, reason: collision with root package name */
    public int f15774y;

    public static f0 h() {
        f0 f0Var = new f0();
        f0Var.f15773x = 518;
        f0Var.f15774y = 2054;
        q0 q0Var = q0.P;
        f0Var.D = q0Var;
        List list = Collections.EMPTY_LIST;
        f0Var.F = list;
        f0Var.G = q0Var;
        f0Var.I = list;
        f0Var.J = list;
        f0Var.K = y0.H;
        f0Var.N = list;
        return f0Var;
    }

    @Override // rs.k
    public final rs.b c() {
        g0 g0VarG = g();
        if (g0VarG.b()) {
            return g0VarG;
        }
        throw new bf.n();
    }

    public final Object clone() {
        f0 f0VarH = h();
        f0VarH.i(g());
        return f0VarH;
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
            ls.a r1 = ls.g0.R     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            ls.g0 r1 = new ls.g0     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> Lf
            ls.g0 r4 = (ls.g0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: ls.f0.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(rs.p pVar) {
        i((g0) pVar);
        return this;
    }

    public final g0 g() {
        g0 g0Var = new g0(this);
        int i10 = this.f15772r;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        g0Var.f15783r = this.f15773x;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        g0Var.f15784x = this.f15774y;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        g0Var.f15785y = this.B;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        g0Var.B = this.D;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        g0Var.D = this.E;
        if ((i10 & 32) == 32) {
            this.F = Collections.unmodifiableList(this.F);
            this.f15772r &= -33;
        }
        g0Var.E = this.F;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        g0Var.F = this.G;
        if ((i10 & 128) == 128) {
            i11 |= 64;
        }
        g0Var.G = this.H;
        if ((this.f15772r & 256) == 256) {
            this.I = Collections.unmodifiableList(this.I);
            this.f15772r &= -257;
        }
        g0Var.H = this.I;
        if ((this.f15772r & 512) == 512) {
            this.J = Collections.unmodifiableList(this.J);
            this.f15772r &= -513;
        }
        g0Var.I = this.J;
        if ((i10 & 1024) == 1024) {
            i11 |= 128;
        }
        g0Var.K = this.K;
        if ((i10 & 2048) == 2048) {
            i11 |= 256;
        }
        g0Var.L = this.L;
        if ((i10 & 4096) == 4096) {
            i11 |= 512;
        }
        g0Var.M = this.M;
        if ((this.f15772r & 8192) == 8192) {
            this.N = Collections.unmodifiableList(this.N);
            this.f15772r &= -8193;
        }
        g0Var.N = this.N;
        g0Var.f15782g = i11;
        return g0Var;
    }

    public final void i(g0 g0Var) {
        y0 y0Var;
        q0 q0Var;
        q0 q0Var2;
        if (g0Var == g0.Q) {
            return;
        }
        int i10 = g0Var.f15782g;
        if ((i10 & 1) == 1) {
            int i11 = g0Var.f15783r;
            this.f15772r = 1 | this.f15772r;
            this.f15773x = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = g0Var.f15784x;
            this.f15772r = 2 | this.f15772r;
            this.f15774y = i12;
        }
        if ((i10 & 4) == 4) {
            int i13 = g0Var.f15785y;
            this.f15772r = 4 | this.f15772r;
            this.B = i13;
        }
        if ((i10 & 8) == 8) {
            q0 q0Var3 = g0Var.B;
            if ((this.f15772r & 8) != 8 || (q0Var2 = this.D) == q0.P) {
                this.D = q0Var3;
            } else {
                p0 p0VarR = q0.r(q0Var2);
                p0VarR.i(q0Var3);
                this.D = p0VarR.g();
            }
            this.f15772r |= 8;
        }
        if ((g0Var.f15782g & 16) == 16) {
            int i14 = g0Var.D;
            this.f15772r = 16 | this.f15772r;
            this.E = i14;
        }
        if (!g0Var.E.isEmpty()) {
            if (this.F.isEmpty()) {
                this.F = g0Var.E;
                this.f15772r &= -33;
            } else {
                if ((this.f15772r & 32) != 32) {
                    this.F = new ArrayList(this.F);
                    this.f15772r |= 32;
                }
                this.F.addAll(g0Var.E);
            }
        }
        if ((g0Var.f15782g & 32) == 32) {
            q0 q0Var4 = g0Var.F;
            if ((this.f15772r & 64) != 64 || (q0Var = this.G) == q0.P) {
                this.G = q0Var4;
            } else {
                p0 p0VarR2 = q0.r(q0Var);
                p0VarR2.i(q0Var4);
                this.G = p0VarR2.g();
            }
            this.f15772r |= 64;
        }
        if ((g0Var.f15782g & 64) == 64) {
            int i15 = g0Var.G;
            this.f15772r |= 128;
            this.H = i15;
        }
        if (!g0Var.H.isEmpty()) {
            if (this.I.isEmpty()) {
                this.I = g0Var.H;
                this.f15772r &= -257;
            } else {
                if ((this.f15772r & 256) != 256) {
                    this.I = new ArrayList(this.I);
                    this.f15772r |= 256;
                }
                this.I.addAll(g0Var.H);
            }
        }
        if (!g0Var.I.isEmpty()) {
            if (this.J.isEmpty()) {
                this.J = g0Var.I;
                this.f15772r &= -513;
            } else {
                if ((this.f15772r & 512) != 512) {
                    this.J = new ArrayList(this.J);
                    this.f15772r |= 512;
                }
                this.J.addAll(g0Var.I);
            }
        }
        if ((g0Var.f15782g & 128) == 128) {
            y0 y0Var2 = g0Var.K;
            if ((this.f15772r & 1024) != 1024 || (y0Var = this.K) == y0.H) {
                this.K = y0Var2;
            } else {
                x0 x0Var = new x0();
                q0 q0Var5 = q0.P;
                x0Var.B = q0Var5;
                x0Var.E = q0Var5;
                x0Var.h(y0Var);
                x0Var.h(y0Var2);
                this.K = x0Var.g();
            }
            this.f15772r |= 1024;
        }
        int i16 = g0Var.f15782g;
        if ((i16 & 256) == 256) {
            int i17 = g0Var.L;
            this.f15772r |= 2048;
            this.L = i17;
        }
        if ((i16 & 512) == 512) {
            int i18 = g0Var.M;
            this.f15772r |= 4096;
            this.M = i18;
        }
        if (!g0Var.N.isEmpty()) {
            if (this.N.isEmpty()) {
                this.N = g0Var.N;
                this.f15772r &= -8193;
            } else {
                if ((this.f15772r & 8192) != 8192) {
                    this.N = new ArrayList(this.N);
                    this.f15772r |= 8192;
                }
                this.N.addAll(g0Var.N);
            }
        }
        f(g0Var);
        this.f21763a = this.f21763a.b(g0Var.f15781d);
    }
}

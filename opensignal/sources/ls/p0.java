package ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class p0 extends rs.l {
    public int B;
    public q0 D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public q0 J;
    public int K;
    public q0 L;
    public int M;
    public int N;

    /* renamed from: r, reason: collision with root package name */
    public int f15855r;

    /* renamed from: x, reason: collision with root package name */
    public List f15856x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f15857y;

    public static p0 h() {
        p0 p0Var = new p0();
        p0Var.f15856x = Collections.EMPTY_LIST;
        q0 q0Var = q0.P;
        p0Var.D = q0Var;
        p0Var.J = q0Var;
        p0Var.L = q0Var;
        return p0Var;
    }

    @Override // rs.k
    public final rs.b c() {
        q0 q0VarG = g();
        if (q0VarG.b()) {
            return q0VarG;
        }
        throw new bf.n();
    }

    public final Object clone() {
        p0 p0VarH = h();
        p0VarH.i(g());
        return p0VarH;
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
            ls.a r1 = ls.q0.Q     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            ls.q0 r1 = new ls.q0     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> Lf
            ls.q0 r4 = (ls.q0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: ls.p0.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(rs.p pVar) {
        i((q0) pVar);
        return this;
    }

    public final q0 g() {
        q0 q0Var = new q0(this);
        int i10 = this.f15855r;
        if ((i10 & 1) == 1) {
            this.f15856x = Collections.unmodifiableList(this.f15856x);
            this.f15855r &= -2;
        }
        q0Var.f15860r = this.f15856x;
        int i11 = (i10 & 2) != 2 ? 0 : 1;
        q0Var.f15861x = this.f15857y;
        if ((i10 & 4) == 4) {
            i11 |= 2;
        }
        q0Var.f15862y = this.B;
        if ((i10 & 8) == 8) {
            i11 |= 4;
        }
        q0Var.B = this.D;
        if ((i10 & 16) == 16) {
            i11 |= 8;
        }
        q0Var.D = this.E;
        if ((i10 & 32) == 32) {
            i11 |= 16;
        }
        q0Var.E = this.F;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        q0Var.F = this.G;
        if ((i10 & 128) == 128) {
            i11 |= 64;
        }
        q0Var.G = this.H;
        if ((i10 & 256) == 256) {
            i11 |= 128;
        }
        q0Var.H = this.I;
        if ((i10 & 512) == 512) {
            i11 |= 256;
        }
        q0Var.I = this.J;
        if ((i10 & 1024) == 1024) {
            i11 |= 512;
        }
        q0Var.J = this.K;
        if ((i10 & 2048) == 2048) {
            i11 |= 1024;
        }
        q0Var.K = this.L;
        if ((i10 & 4096) == 4096) {
            i11 |= 2048;
        }
        q0Var.L = this.M;
        if ((i10 & 8192) == 8192) {
            i11 |= 4096;
        }
        q0Var.M = this.N;
        q0Var.f15859g = i11;
        return q0Var;
    }

    public final p0 i(q0 q0Var) {
        q0 q0Var2;
        q0 q0Var3;
        q0 q0Var4;
        q0 q0Var5 = q0.P;
        if (q0Var == q0Var5) {
            return this;
        }
        if (!q0Var.f15860r.isEmpty()) {
            if (this.f15856x.isEmpty()) {
                this.f15856x = q0Var.f15860r;
                this.f15855r &= -2;
            } else {
                if ((this.f15855r & 1) != 1) {
                    this.f15856x = new ArrayList(this.f15856x);
                    this.f15855r |= 1;
                }
                this.f15856x.addAll(q0Var.f15860r);
            }
        }
        int i10 = q0Var.f15859g;
        if ((i10 & 1) == 1) {
            boolean z10 = q0Var.f15861x;
            this.f15855r |= 2;
            this.f15857y = z10;
        }
        if ((i10 & 2) == 2) {
            int i11 = q0Var.f15862y;
            this.f15855r |= 4;
            this.B = i11;
        }
        if ((i10 & 4) == 4) {
            q0 q0Var6 = q0Var.B;
            if ((this.f15855r & 8) != 8 || (q0Var4 = this.D) == q0Var5) {
                this.D = q0Var6;
            } else {
                p0 p0VarR = q0.r(q0Var4);
                p0VarR.i(q0Var6);
                this.D = p0VarR.g();
            }
            this.f15855r |= 8;
        }
        if ((q0Var.f15859g & 8) == 8) {
            int i12 = q0Var.D;
            this.f15855r |= 16;
            this.E = i12;
        }
        if (q0Var.p()) {
            int i13 = q0Var.E;
            this.f15855r |= 32;
            this.F = i13;
        }
        int i14 = q0Var.f15859g;
        if ((i14 & 32) == 32) {
            int i15 = q0Var.F;
            this.f15855r |= 64;
            this.G = i15;
        }
        if ((i14 & 64) == 64) {
            int i16 = q0Var.G;
            this.f15855r |= 128;
            this.H = i16;
        }
        if ((i14 & 128) == 128) {
            int i17 = q0Var.H;
            this.f15855r |= 256;
            this.I = i17;
        }
        if ((i14 & 256) == 256) {
            q0 q0Var7 = q0Var.I;
            if ((this.f15855r & 512) != 512 || (q0Var3 = this.J) == q0Var5) {
                this.J = q0Var7;
            } else {
                p0 p0VarR2 = q0.r(q0Var3);
                p0VarR2.i(q0Var7);
                this.J = p0VarR2.g();
            }
            this.f15855r |= 512;
        }
        int i18 = q0Var.f15859g;
        if ((i18 & 512) == 512) {
            int i19 = q0Var.J;
            this.f15855r |= 1024;
            this.K = i19;
        }
        if ((i18 & 1024) == 1024) {
            q0 q0Var8 = q0Var.K;
            if ((this.f15855r & 2048) != 2048 || (q0Var2 = this.L) == q0Var5) {
                this.L = q0Var8;
            } else {
                p0 p0VarR3 = q0.r(q0Var2);
                p0VarR3.i(q0Var8);
                this.L = p0VarR3.g();
            }
            this.f15855r |= 2048;
        }
        int i20 = q0Var.f15859g;
        if ((i20 & 2048) == 2048) {
            int i21 = q0Var.L;
            this.f15855r |= 4096;
            this.M = i21;
        }
        if ((i20 & 4096) == 4096) {
            int i22 = q0Var.M;
            this.f15855r |= 8192;
            this.N = i22;
        }
        f(q0Var);
        this.f21763a = this.f21763a.b(q0Var.f15858d);
        return this;
    }
}

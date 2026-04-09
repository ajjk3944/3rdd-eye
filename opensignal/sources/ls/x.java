package ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class x extends rs.l {
    public int B;
    public q0 D;
    public int E;
    public List F;
    public q0 G;
    public int H;
    public List I;
    public List J;
    public List K;
    public w0 L;
    public List M;
    public n N;

    /* renamed from: r, reason: collision with root package name */
    public int f15909r;

    /* renamed from: x, reason: collision with root package name */
    public int f15910x;

    /* renamed from: y, reason: collision with root package name */
    public int f15911y;

    public static x h() {
        x xVar = new x();
        xVar.f15910x = 6;
        xVar.f15911y = 6;
        q0 q0Var = q0.P;
        xVar.D = q0Var;
        List list = Collections.EMPTY_LIST;
        xVar.F = list;
        xVar.G = q0Var;
        xVar.I = list;
        xVar.J = list;
        xVar.K = list;
        xVar.L = w0.B;
        xVar.M = list;
        xVar.N = n.f15838x;
        return xVar;
    }

    @Override // rs.k
    public final rs.b c() {
        y yVarG = g();
        if (yVarG.b()) {
            return yVarG;
        }
        throw new bf.n();
    }

    public final Object clone() {
        x xVarH = h();
        xVarH.i(g());
        return xVarH;
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
            ls.a r1 = ls.y.R     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            ls.y r1 = new ls.y     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> Lf
            ls.y r4 = (ls.y) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: ls.x.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(rs.p pVar) {
        i((y) pVar);
        return this;
    }

    public final y g() {
        y yVar = new y(this);
        int i10 = this.f15909r;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        yVar.f15917r = this.f15910x;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        yVar.f15918x = this.f15911y;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        yVar.f15919y = this.B;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        yVar.B = this.D;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        yVar.D = this.E;
        if ((i10 & 32) == 32) {
            this.F = Collections.unmodifiableList(this.F);
            this.f15909r &= -33;
        }
        yVar.E = this.F;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        yVar.F = this.G;
        if ((i10 & 128) == 128) {
            i11 |= 64;
        }
        yVar.G = this.H;
        if ((this.f15909r & 256) == 256) {
            this.I = Collections.unmodifiableList(this.I);
            this.f15909r &= -257;
        }
        yVar.H = this.I;
        if ((this.f15909r & 512) == 512) {
            this.J = Collections.unmodifiableList(this.J);
            this.f15909r &= -513;
        }
        yVar.I = this.J;
        if ((this.f15909r & 1024) == 1024) {
            this.K = Collections.unmodifiableList(this.K);
            this.f15909r &= -1025;
        }
        yVar.K = this.K;
        if ((i10 & 2048) == 2048) {
            i11 |= 128;
        }
        yVar.L = this.L;
        if ((this.f15909r & 4096) == 4096) {
            this.M = Collections.unmodifiableList(this.M);
            this.f15909r &= -4097;
        }
        yVar.M = this.M;
        if ((i10 & 8192) == 8192) {
            i11 |= 256;
        }
        yVar.N = this.N;
        yVar.f15916g = i11;
        return yVar;
    }

    public final void i(y yVar) {
        n nVar;
        w0 w0Var;
        q0 q0Var;
        q0 q0Var2;
        if (yVar == y.Q) {
            return;
        }
        int i10 = yVar.f15916g;
        if ((i10 & 1) == 1) {
            int i11 = yVar.f15917r;
            this.f15909r = 1 | this.f15909r;
            this.f15910x = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = yVar.f15918x;
            this.f15909r = 2 | this.f15909r;
            this.f15911y = i12;
        }
        if ((i10 & 4) == 4) {
            int i13 = yVar.f15919y;
            this.f15909r = 4 | this.f15909r;
            this.B = i13;
        }
        if ((i10 & 8) == 8) {
            q0 q0Var3 = yVar.B;
            if ((this.f15909r & 8) != 8 || (q0Var2 = this.D) == q0.P) {
                this.D = q0Var3;
            } else {
                p0 p0VarR = q0.r(q0Var2);
                p0VarR.i(q0Var3);
                this.D = p0VarR.g();
            }
            this.f15909r |= 8;
        }
        if ((yVar.f15916g & 16) == 16) {
            int i14 = yVar.D;
            this.f15909r = 16 | this.f15909r;
            this.E = i14;
        }
        if (!yVar.E.isEmpty()) {
            if (this.F.isEmpty()) {
                this.F = yVar.E;
                this.f15909r &= -33;
            } else {
                if ((this.f15909r & 32) != 32) {
                    this.F = new ArrayList(this.F);
                    this.f15909r |= 32;
                }
                this.F.addAll(yVar.E);
            }
        }
        if ((yVar.f15916g & 32) == 32) {
            q0 q0Var4 = yVar.F;
            if ((this.f15909r & 64) != 64 || (q0Var = this.G) == q0.P) {
                this.G = q0Var4;
            } else {
                p0 p0VarR2 = q0.r(q0Var);
                p0VarR2.i(q0Var4);
                this.G = p0VarR2.g();
            }
            this.f15909r |= 64;
        }
        if ((yVar.f15916g & 64) == 64) {
            int i15 = yVar.G;
            this.f15909r |= 128;
            this.H = i15;
        }
        if (!yVar.H.isEmpty()) {
            if (this.I.isEmpty()) {
                this.I = yVar.H;
                this.f15909r &= -257;
            } else {
                if ((this.f15909r & 256) != 256) {
                    this.I = new ArrayList(this.I);
                    this.f15909r |= 256;
                }
                this.I.addAll(yVar.H);
            }
        }
        if (!yVar.I.isEmpty()) {
            if (this.J.isEmpty()) {
                this.J = yVar.I;
                this.f15909r &= -513;
            } else {
                if ((this.f15909r & 512) != 512) {
                    this.J = new ArrayList(this.J);
                    this.f15909r |= 512;
                }
                this.J.addAll(yVar.I);
            }
        }
        if (!yVar.K.isEmpty()) {
            if (this.K.isEmpty()) {
                this.K = yVar.K;
                this.f15909r &= -1025;
            } else {
                if ((this.f15909r & 1024) != 1024) {
                    this.K = new ArrayList(this.K);
                    this.f15909r |= 1024;
                }
                this.K.addAll(yVar.K);
            }
        }
        if ((yVar.f15916g & 128) == 128) {
            w0 w0Var2 = yVar.L;
            if ((this.f15909r & 2048) != 2048 || (w0Var = this.L) == w0.B) {
                this.L = w0Var2;
            } else {
                f fVarI = w0.i(w0Var);
                fVarI.l(w0Var2);
                this.L = fVarI.h();
            }
            this.f15909r |= 2048;
        }
        if (!yVar.M.isEmpty()) {
            if (this.M.isEmpty()) {
                this.M = yVar.M;
                this.f15909r &= -4097;
            } else {
                if ((this.f15909r & 4096) != 4096) {
                    this.M = new ArrayList(this.M);
                    this.f15909r |= 4096;
                }
                this.M.addAll(yVar.M);
            }
        }
        if ((yVar.f15916g & 256) == 256) {
            n nVar2 = yVar.N;
            if ((this.f15909r & 8192) != 8192 || (nVar = this.N) == n.f15838x) {
                this.N = nVar2;
            } else {
                m mVar = new m(0);
                mVar.f15833r = Collections.EMPTY_LIST;
                mVar.j(nVar);
                mVar.j(nVar2);
                this.N = mVar.f();
            }
            this.f15909r |= 8192;
        }
        f(yVar);
        this.f21763a = this.f21763a.b(yVar.f15915d);
    }
}

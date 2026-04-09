package ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends rs.l {
    public int B;
    public List D;
    public List E;
    public List F;
    public List G;
    public List H;
    public List I;
    public List J;
    public List K;
    public List L;
    public List M;
    public List N;
    public List O;
    public int P;
    public q0 Q;
    public int R;
    public List S;
    public List T;
    public List U;
    public w0 V;
    public List W;
    public d1 X;

    /* renamed from: r, reason: collision with root package name */
    public int f15786r;

    /* renamed from: x, reason: collision with root package name */
    public int f15787x;

    /* renamed from: y, reason: collision with root package name */
    public int f15788y;

    public static h h() {
        h hVar = new h();
        hVar.f15787x = 6;
        List list = Collections.EMPTY_LIST;
        hVar.D = list;
        hVar.E = list;
        hVar.F = list;
        hVar.G = list;
        hVar.H = list;
        hVar.I = list;
        hVar.J = list;
        hVar.K = list;
        hVar.L = list;
        hVar.M = list;
        hVar.N = list;
        hVar.O = list;
        hVar.Q = q0.P;
        hVar.S = list;
        hVar.T = list;
        hVar.U = list;
        hVar.V = w0.B;
        hVar.W = list;
        hVar.X = d1.f15751x;
        return hVar;
    }

    @Override // rs.k
    public final rs.b c() {
        j jVarG = g();
        if (jVarG.b()) {
            return jVarG;
        }
        throw new bf.n();
    }

    public final Object clone() {
        h hVarH = h();
        hVarH.i(g());
        return hVarH;
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
            ls.a r1 = ls.j.f15794g0     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            ls.j r1 = new ls.j     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> Lf
            ls.j r4 = (ls.j) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: ls.h.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(rs.p pVar) {
        i((j) pVar);
        return this;
    }

    public final j g() {
        j jVar = new j(this);
        int i10 = this.f15786r;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        jVar.f15802r = this.f15787x;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        jVar.f15803x = this.f15788y;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        jVar.f15804y = this.B;
        if ((i10 & 8) == 8) {
            this.D = Collections.unmodifiableList(this.D);
            this.f15786r &= -9;
        }
        jVar.B = this.D;
        if ((this.f15786r & 16) == 16) {
            this.E = Collections.unmodifiableList(this.E);
            this.f15786r &= -17;
        }
        jVar.D = this.E;
        if ((this.f15786r & 32) == 32) {
            this.F = Collections.unmodifiableList(this.F);
            this.f15786r &= -33;
        }
        jVar.E = this.F;
        if ((this.f15786r & 64) == 64) {
            this.G = Collections.unmodifiableList(this.G);
            this.f15786r &= -65;
        }
        jVar.G = this.G;
        if ((this.f15786r & 128) == 128) {
            this.H = Collections.unmodifiableList(this.H);
            this.f15786r &= -129;
        }
        jVar.I = this.H;
        if ((this.f15786r & 256) == 256) {
            this.I = Collections.unmodifiableList(this.I);
            this.f15786r &= -257;
        }
        jVar.J = this.I;
        if ((this.f15786r & 512) == 512) {
            this.J = Collections.unmodifiableList(this.J);
            this.f15786r &= -513;
        }
        jVar.L = this.J;
        if ((this.f15786r & 1024) == 1024) {
            this.K = Collections.unmodifiableList(this.K);
            this.f15786r &= -1025;
        }
        jVar.M = this.K;
        if ((this.f15786r & 2048) == 2048) {
            this.L = Collections.unmodifiableList(this.L);
            this.f15786r &= -2049;
        }
        jVar.N = this.L;
        if ((this.f15786r & 4096) == 4096) {
            this.M = Collections.unmodifiableList(this.M);
            this.f15786r &= -4097;
        }
        jVar.O = this.M;
        if ((this.f15786r & 8192) == 8192) {
            this.N = Collections.unmodifiableList(this.N);
            this.f15786r &= -8193;
        }
        jVar.P = this.N;
        if ((this.f15786r & 16384) == 16384) {
            this.O = Collections.unmodifiableList(this.O);
            this.f15786r &= -16385;
        }
        jVar.Q = this.O;
        if ((i10 & 32768) == 32768) {
            i11 |= 8;
        }
        jVar.S = this.P;
        if ((i10 & 65536) == 65536) {
            i11 |= 16;
        }
        jVar.T = this.Q;
        if ((i10 & 131072) == 131072) {
            i11 |= 32;
        }
        jVar.U = this.R;
        if ((this.f15786r & 262144) == 262144) {
            this.S = Collections.unmodifiableList(this.S);
            this.f15786r &= -262145;
        }
        jVar.V = this.S;
        if ((this.f15786r & 524288) == 524288) {
            this.T = Collections.unmodifiableList(this.T);
            this.f15786r &= -524289;
        }
        jVar.X = this.T;
        if ((this.f15786r & 1048576) == 1048576) {
            this.U = Collections.unmodifiableList(this.U);
            this.f15786r &= -1048577;
        }
        jVar.Y = this.U;
        if ((i10 & 2097152) == 2097152) {
            i11 |= 64;
        }
        jVar.f15795a0 = this.V;
        if ((this.f15786r & 4194304) == 4194304) {
            this.W = Collections.unmodifiableList(this.W);
            this.f15786r &= -4194305;
        }
        jVar.f15796b0 = this.W;
        if ((i10 & 8388608) == 8388608) {
            i11 |= 128;
        }
        jVar.f15797c0 = this.X;
        jVar.f15801g = i11;
        return jVar;
    }

    public final void i(j jVar) {
        d1 d1Var;
        w0 w0Var;
        q0 q0Var;
        if (jVar == j.f15793f0) {
            return;
        }
        int i10 = jVar.f15801g;
        if ((i10 & 1) == 1) {
            int i11 = jVar.f15802r;
            this.f15786r = 1 | this.f15786r;
            this.f15787x = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = jVar.f15803x;
            this.f15786r = 2 | this.f15786r;
            this.f15788y = i12;
        }
        if ((i10 & 4) == 4) {
            int i13 = jVar.f15804y;
            this.f15786r = 4 | this.f15786r;
            this.B = i13;
        }
        if (!jVar.B.isEmpty()) {
            if (this.D.isEmpty()) {
                this.D = jVar.B;
                this.f15786r &= -9;
            } else {
                if ((this.f15786r & 8) != 8) {
                    this.D = new ArrayList(this.D);
                    this.f15786r |= 8;
                }
                this.D.addAll(jVar.B);
            }
        }
        if (!jVar.D.isEmpty()) {
            if (this.E.isEmpty()) {
                this.E = jVar.D;
                this.f15786r &= -17;
            } else {
                if ((this.f15786r & 16) != 16) {
                    this.E = new ArrayList(this.E);
                    this.f15786r |= 16;
                }
                this.E.addAll(jVar.D);
            }
        }
        if (!jVar.E.isEmpty()) {
            if (this.F.isEmpty()) {
                this.F = jVar.E;
                this.f15786r &= -33;
            } else {
                if ((this.f15786r & 32) != 32) {
                    this.F = new ArrayList(this.F);
                    this.f15786r |= 32;
                }
                this.F.addAll(jVar.E);
            }
        }
        if (!jVar.G.isEmpty()) {
            if (this.G.isEmpty()) {
                this.G = jVar.G;
                this.f15786r &= -65;
            } else {
                if ((this.f15786r & 64) != 64) {
                    this.G = new ArrayList(this.G);
                    this.f15786r |= 64;
                }
                this.G.addAll(jVar.G);
            }
        }
        if (!jVar.I.isEmpty()) {
            if (this.H.isEmpty()) {
                this.H = jVar.I;
                this.f15786r &= -129;
            } else {
                if ((this.f15786r & 128) != 128) {
                    this.H = new ArrayList(this.H);
                    this.f15786r |= 128;
                }
                this.H.addAll(jVar.I);
            }
        }
        if (!jVar.J.isEmpty()) {
            if (this.I.isEmpty()) {
                this.I = jVar.J;
                this.f15786r &= -257;
            } else {
                if ((this.f15786r & 256) != 256) {
                    this.I = new ArrayList(this.I);
                    this.f15786r |= 256;
                }
                this.I.addAll(jVar.J);
            }
        }
        if (!jVar.L.isEmpty()) {
            if (this.J.isEmpty()) {
                this.J = jVar.L;
                this.f15786r &= -513;
            } else {
                if ((this.f15786r & 512) != 512) {
                    this.J = new ArrayList(this.J);
                    this.f15786r |= 512;
                }
                this.J.addAll(jVar.L);
            }
        }
        if (!jVar.M.isEmpty()) {
            if (this.K.isEmpty()) {
                this.K = jVar.M;
                this.f15786r &= -1025;
            } else {
                if ((this.f15786r & 1024) != 1024) {
                    this.K = new ArrayList(this.K);
                    this.f15786r |= 1024;
                }
                this.K.addAll(jVar.M);
            }
        }
        if (!jVar.N.isEmpty()) {
            if (this.L.isEmpty()) {
                this.L = jVar.N;
                this.f15786r &= -2049;
            } else {
                if ((this.f15786r & 2048) != 2048) {
                    this.L = new ArrayList(this.L);
                    this.f15786r |= 2048;
                }
                this.L.addAll(jVar.N);
            }
        }
        if (!jVar.O.isEmpty()) {
            if (this.M.isEmpty()) {
                this.M = jVar.O;
                this.f15786r &= -4097;
            } else {
                if ((this.f15786r & 4096) != 4096) {
                    this.M = new ArrayList(this.M);
                    this.f15786r |= 4096;
                }
                this.M.addAll(jVar.O);
            }
        }
        if (!jVar.P.isEmpty()) {
            if (this.N.isEmpty()) {
                this.N = jVar.P;
                this.f15786r &= -8193;
            } else {
                if ((this.f15786r & 8192) != 8192) {
                    this.N = new ArrayList(this.N);
                    this.f15786r |= 8192;
                }
                this.N.addAll(jVar.P);
            }
        }
        if (!jVar.Q.isEmpty()) {
            if (this.O.isEmpty()) {
                this.O = jVar.Q;
                this.f15786r &= -16385;
            } else {
                if ((this.f15786r & 16384) != 16384) {
                    this.O = new ArrayList(this.O);
                    this.f15786r |= 16384;
                }
                this.O.addAll(jVar.Q);
            }
        }
        int i14 = jVar.f15801g;
        if ((i14 & 8) == 8) {
            int i15 = jVar.S;
            this.f15786r |= 32768;
            this.P = i15;
        }
        if ((i14 & 16) == 16) {
            q0 q0Var2 = jVar.T;
            if ((this.f15786r & 65536) != 65536 || (q0Var = this.Q) == q0.P) {
                this.Q = q0Var2;
            } else {
                p0 p0VarR = q0.r(q0Var);
                p0VarR.i(q0Var2);
                this.Q = p0VarR.g();
            }
            this.f15786r |= 65536;
        }
        if ((jVar.f15801g & 32) == 32) {
            int i16 = jVar.U;
            this.f15786r |= 131072;
            this.R = i16;
        }
        if (!jVar.V.isEmpty()) {
            if (this.S.isEmpty()) {
                this.S = jVar.V;
                this.f15786r &= -262145;
            } else {
                if ((this.f15786r & 262144) != 262144) {
                    this.S = new ArrayList(this.S);
                    this.f15786r |= 262144;
                }
                this.S.addAll(jVar.V);
            }
        }
        if (!jVar.X.isEmpty()) {
            if (this.T.isEmpty()) {
                this.T = jVar.X;
                this.f15786r &= -524289;
            } else {
                if ((this.f15786r & 524288) != 524288) {
                    this.T = new ArrayList(this.T);
                    this.f15786r |= 524288;
                }
                this.T.addAll(jVar.X);
            }
        }
        if (!jVar.Y.isEmpty()) {
            if (this.U.isEmpty()) {
                this.U = jVar.Y;
                this.f15786r &= -1048577;
            } else {
                if ((this.f15786r & 1048576) != 1048576) {
                    this.U = new ArrayList(this.U);
                    this.f15786r |= 1048576;
                }
                this.U.addAll(jVar.Y);
            }
        }
        if ((jVar.f15801g & 64) == 64) {
            w0 w0Var2 = jVar.f15795a0;
            if ((this.f15786r & 2097152) != 2097152 || (w0Var = this.V) == w0.B) {
                this.V = w0Var2;
            } else {
                f fVarI = w0.i(w0Var);
                fVarI.l(w0Var2);
                this.V = fVarI.h();
            }
            this.f15786r |= 2097152;
        }
        if (!jVar.f15796b0.isEmpty()) {
            if (this.W.isEmpty()) {
                this.W = jVar.f15796b0;
                this.f15786r &= -4194305;
            } else {
                if ((this.f15786r & 4194304) != 4194304) {
                    this.W = new ArrayList(this.W);
                    this.f15786r |= 4194304;
                }
                this.W.addAll(jVar.f15796b0);
            }
        }
        if ((jVar.f15801g & 128) == 128) {
            d1 d1Var2 = jVar.f15797c0;
            if ((this.f15786r & 8388608) != 8388608 || (d1Var = this.X) == d1.f15751x) {
                this.X = d1Var2;
            } else {
                m mVar = new m(2);
                mVar.f15833r = Collections.EMPTY_LIST;
                mVar.m(d1Var);
                mVar.m(d1Var2);
                this.X = mVar.i();
            }
            this.f15786r |= 8388608;
        }
        f(jVar);
        this.f21763a = this.f21763a.b(jVar.f15798d);
    }
}

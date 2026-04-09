package ls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g0 extends rs.m {
    public static final g0 Q;
    public static final a R = new a(12);
    public q0 B;
    public int D;
    public List E;
    public q0 F;
    public int G;
    public List H;
    public List I;
    public int J;
    public y0 K;
    public int L;
    public int M;
    public List N;
    public byte O;
    public int P;

    /* renamed from: d, reason: collision with root package name */
    public final rs.e f15781d;

    /* renamed from: g, reason: collision with root package name */
    public int f15782g;

    /* renamed from: r, reason: collision with root package name */
    public int f15783r;

    /* renamed from: x, reason: collision with root package name */
    public int f15784x;

    /* renamed from: y, reason: collision with root package name */
    public int f15785y;

    static {
        g0 g0Var = new g0();
        Q = g0Var;
        g0Var.p();
    }

    public g0(f0 f0Var) {
        super(f0Var);
        this.J = -1;
        this.O = (byte) -1;
        this.P = -1;
        this.f15781d = f0Var.f21763a;
    }

    @Override // rs.x
    public final rs.b a() {
        return Q;
    }

    @Override // rs.x
    public final boolean b() {
        byte b2 = this.O;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i10 = this.f15782g;
        if ((i10 & 4) != 4) {
            this.O = (byte) 0;
            return false;
        }
        if ((i10 & 8) == 8 && !this.B.b()) {
            this.O = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            if (!((v0) this.E.get(i11)).b()) {
                this.O = (byte) 0;
                return false;
            }
        }
        if ((this.f15782g & 32) == 32 && !this.F.b()) {
            this.O = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < this.H.size(); i12++) {
            if (!((q0) this.H.get(i12)).b()) {
                this.O = (byte) 0;
                return false;
            }
        }
        if ((this.f15782g & 128) == 128 && !this.K.b()) {
            this.O = (byte) 0;
            return false;
        }
        if (i()) {
            this.O = (byte) 1;
            return true;
        }
        this.O = (byte) 0;
        return false;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.P;
        if (i10 != -1) {
            return i10;
        }
        int iL = (this.f15782g & 2) == 2 ? b5.m.l(1, this.f15784x) : 0;
        if ((this.f15782g & 4) == 4) {
            iL += b5.m.l(2, this.f15785y);
        }
        if ((this.f15782g & 8) == 8) {
            iL += b5.m.n(3, this.B);
        }
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            iL += b5.m.n(4, (rs.b) this.E.get(i11));
        }
        if ((this.f15782g & 32) == 32) {
            iL += b5.m.n(5, this.F);
        }
        if ((this.f15782g & 128) == 128) {
            iL += b5.m.n(6, this.K);
        }
        if ((this.f15782g & 256) == 256) {
            iL += b5.m.l(7, this.L);
        }
        if ((this.f15782g & 512) == 512) {
            iL += b5.m.l(8, this.M);
        }
        if ((this.f15782g & 16) == 16) {
            iL += b5.m.l(9, this.D);
        }
        if ((this.f15782g & 64) == 64) {
            iL += b5.m.l(10, this.G);
        }
        if ((this.f15782g & 1) == 1) {
            iL += b5.m.l(11, this.f15783r);
        }
        for (int i12 = 0; i12 < this.H.size(); i12++) {
            iL += b5.m.n(12, (rs.b) this.H.get(i12));
        }
        int iM = 0;
        for (int i13 = 0; i13 < this.I.size(); i13++) {
            iM += b5.m.m(((Integer) this.I.get(i13)).intValue());
        }
        int iM2 = iL + iM;
        if (!this.I.isEmpty()) {
            iM2 = iM2 + 1 + b5.m.m(iM);
        }
        this.J = iM;
        int iM3 = 0;
        for (int i14 = 0; i14 < this.N.size(); i14++) {
            iM3 += b5.m.m(((Integer) this.N.get(i14)).intValue());
        }
        int size = this.f15781d.size() + j() + (this.N.size() * 2) + iM2 + iM3;
        this.P = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        return f0.h();
    }

    @Override // rs.b
    public final rs.k e() {
        f0 f0VarH = f0.h();
        f0VarH.i(this);
        return f0VarH;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        om.f fVar = new om.f(this);
        if ((this.f15782g & 2) == 2) {
            mVar.M(1, this.f15784x);
        }
        if ((this.f15782g & 4) == 4) {
            mVar.M(2, this.f15785y);
        }
        if ((this.f15782g & 8) == 8) {
            mVar.O(3, this.B);
        }
        for (int i10 = 0; i10 < this.E.size(); i10++) {
            mVar.O(4, (rs.b) this.E.get(i10));
        }
        if ((this.f15782g & 32) == 32) {
            mVar.O(5, this.F);
        }
        if ((this.f15782g & 128) == 128) {
            mVar.O(6, this.K);
        }
        if ((this.f15782g & 256) == 256) {
            mVar.M(7, this.L);
        }
        if ((this.f15782g & 512) == 512) {
            mVar.M(8, this.M);
        }
        if ((this.f15782g & 16) == 16) {
            mVar.M(9, this.D);
        }
        if ((this.f15782g & 64) == 64) {
            mVar.M(10, this.G);
        }
        if ((this.f15782g & 1) == 1) {
            mVar.M(11, this.f15783r);
        }
        for (int i11 = 0; i11 < this.H.size(); i11++) {
            mVar.O(12, (rs.b) this.H.get(i11));
        }
        if (this.I.size() > 0) {
            mVar.V(106);
            mVar.V(this.J);
        }
        for (int i12 = 0; i12 < this.I.size(); i12++) {
            mVar.N(((Integer) this.I.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.N.size(); i13++) {
            mVar.M(31, ((Integer) this.N.get(i13)).intValue());
        }
        fVar.y(19000, mVar);
        mVar.R(this.f15781d);
    }

    public final void p() {
        this.f15783r = 518;
        this.f15784x = 2054;
        this.f15785y = 0;
        q0 q0Var = q0.P;
        this.B = q0Var;
        this.D = 0;
        List list = Collections.EMPTY_LIST;
        this.E = list;
        this.F = q0Var;
        this.G = 0;
        this.H = list;
        this.I = list;
        this.K = y0.H;
        this.L = 0;
        this.M = 0;
        this.N = list;
    }

    public g0() {
        this.J = -1;
        this.O = (byte) -1;
        this.P = -1;
        this.f15781d = rs.e.f21745a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public g0(f5.u uVar, rs.g gVar) {
        this.J = -1;
        this.O = (byte) -1;
        this.P = -1;
        p();
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        boolean z10 = false;
        char c4 = 0;
        while (true) {
            ?? N = 256;
            if (!z10) {
                try {
                    try {
                        try {
                            int iT = uVar.t();
                            p0 p0VarR = null;
                            x0 x0Var = null;
                            p0 p0VarR2 = null;
                            switch (iT) {
                                case 0:
                                    z10 = true;
                                case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                                    this.f15782g |= 2;
                                    this.f15784x = uVar.q();
                                case 16:
                                    this.f15782g |= 4;
                                    this.f15785y = uVar.q();
                                case 26:
                                    if ((this.f15782g & 8) == 8) {
                                        q0 q0Var = this.B;
                                        q0Var.getClass();
                                        p0VarR = q0.r(q0Var);
                                    }
                                    q0 q0Var2 = (q0) uVar.m(q0.Q, gVar);
                                    this.B = q0Var2;
                                    if (p0VarR != null) {
                                        p0VarR.i(q0Var2);
                                        this.B = p0VarR.g();
                                    }
                                    this.f15782g |= 8;
                                case 34:
                                    int i10 = (c4 == true ? 1 : 0) & 32;
                                    c4 = c4;
                                    if (i10 != 32) {
                                        this.E = new ArrayList();
                                        c4 = (c4 == true ? 1 : 0) | ' ';
                                    }
                                    this.E.add(uVar.m(v0.J, gVar));
                                case 42:
                                    if ((this.f15782g & 32) == 32) {
                                        q0 q0Var3 = this.F;
                                        q0Var3.getClass();
                                        p0VarR2 = q0.r(q0Var3);
                                    }
                                    q0 q0Var4 = (q0) uVar.m(q0.Q, gVar);
                                    this.F = q0Var4;
                                    if (p0VarR2 != null) {
                                        p0VarR2.i(q0Var4);
                                        this.F = p0VarR2.g();
                                    }
                                    this.f15782g |= 32;
                                case 50:
                                    if ((this.f15782g & 128) == 128) {
                                        y0 y0Var = this.K;
                                        y0Var.getClass();
                                        x0Var = new x0();
                                        q0 q0Var5 = q0.P;
                                        x0Var.B = q0Var5;
                                        x0Var.E = q0Var5;
                                        x0Var.h(y0Var);
                                    }
                                    y0 y0Var2 = (y0) uVar.m(y0.I, gVar);
                                    this.K = y0Var2;
                                    if (x0Var != null) {
                                        x0Var.h(y0Var2);
                                        this.K = x0Var.g();
                                    }
                                    this.f15782g |= 128;
                                case 56:
                                    this.f15782g |= 256;
                                    this.L = uVar.q();
                                case 64:
                                    this.f15782g |= 512;
                                    this.M = uVar.q();
                                case 72:
                                    this.f15782g |= 16;
                                    this.D = uVar.q();
                                case 80:
                                    this.f15782g |= 64;
                                    this.G = uVar.q();
                                case 88:
                                    this.f15782g |= 1;
                                    this.f15783r = uVar.q();
                                case 98:
                                    int i11 = (c4 == true ? 1 : 0) & 256;
                                    c4 = c4;
                                    if (i11 != 256) {
                                        this.H = new ArrayList();
                                        c4 = (c4 == true ? 1 : 0) | 256;
                                    }
                                    this.H.add(uVar.m(q0.Q, gVar));
                                case 104:
                                    int i12 = (c4 == true ? 1 : 0) & 512;
                                    c4 = c4;
                                    if (i12 != 512) {
                                        this.I = new ArrayList();
                                        c4 = (c4 == true ? 1 : 0) | 512;
                                    }
                                    this.I.add(Integer.valueOf(uVar.q()));
                                case 106:
                                    int iJ = uVar.j(uVar.q());
                                    int i13 = (c4 == true ? 1 : 0) & 512;
                                    c4 = c4;
                                    if (i13 != 512) {
                                        c4 = c4;
                                        if (uVar.g() > 0) {
                                            this.I = new ArrayList();
                                            c4 = (c4 == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (uVar.g() > 0) {
                                        this.I.add(Integer.valueOf(uVar.q()));
                                    }
                                    uVar.i(iJ);
                                case 248:
                                    int i14 = (c4 == true ? 1 : 0) & 8192;
                                    c4 = c4;
                                    if (i14 != 8192) {
                                        this.N = new ArrayList();
                                        c4 = (c4 == true ? 1 : 0) | 8192;
                                    }
                                    this.N.add(Integer.valueOf(uVar.q()));
                                case 250:
                                    int iJ2 = uVar.j(uVar.q());
                                    int i15 = (c4 == true ? 1 : 0) & 8192;
                                    c4 = c4;
                                    if (i15 != 8192) {
                                        c4 = c4;
                                        if (uVar.g() > 0) {
                                            this.N = new ArrayList();
                                            c4 = (c4 == true ? 1 : 0) | 8192;
                                        }
                                    }
                                    while (uVar.g() > 0) {
                                        this.N.add(Integer.valueOf(uVar.q()));
                                    }
                                    uVar.i(iJ2);
                                default:
                                    N = n(uVar, mVarZ, gVar, iT);
                                    if (N == 0) {
                                        z10 = true;
                                    }
                            }
                        } catch (rs.t e4) {
                            e4.f21776a = this;
                            throw e4;
                        }
                    } catch (IOException e10) {
                        rs.t tVar = new rs.t(e10.getMessage());
                        tVar.f21776a = this;
                        throw tVar;
                    }
                } catch (Throwable th2) {
                    if (((c4 == true ? 1 : 0) & 32) == 32) {
                        this.E = Collections.unmodifiableList(this.E);
                    }
                    if (((c4 == true ? 1 : 0) & 256) == N) {
                        this.H = Collections.unmodifiableList(this.H);
                    }
                    if (((c4 == true ? 1 : 0) & 512) == 512) {
                        this.I = Collections.unmodifiableList(this.I);
                    }
                    if (((c4 == true ? 1 : 0) & 8192) == 8192) {
                        this.N = Collections.unmodifiableList(this.N);
                    }
                    try {
                        mVarZ.x();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f15781d = dVar.h();
                        throw th3;
                    }
                    this.f15781d = dVar.h();
                    m();
                    throw th2;
                }
            } else {
                if (((c4 == true ? 1 : 0) & 32) == 32) {
                    this.E = Collections.unmodifiableList(this.E);
                }
                if (((c4 == true ? 1 : 0) & 256) == 256) {
                    this.H = Collections.unmodifiableList(this.H);
                }
                if (((c4 == true ? 1 : 0) & 512) == 512) {
                    this.I = Collections.unmodifiableList(this.I);
                }
                if (((c4 == true ? 1 : 0) & 8192) == 8192) {
                    this.N = Collections.unmodifiableList(this.N);
                }
                try {
                    mVarZ.x();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f15781d = dVar.h();
                    throw th4;
                }
                this.f15781d = dVar.h();
                m();
                return;
            }
        }
    }
}

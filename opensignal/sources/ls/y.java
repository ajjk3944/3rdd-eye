package ls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class y extends rs.m {
    public static final y Q;
    public static final a R = new a(9);
    public q0 B;
    public int D;
    public List E;
    public q0 F;
    public int G;
    public List H;
    public List I;
    public int J;
    public List K;
    public w0 L;
    public List M;
    public n N;
    public byte O;
    public int P;

    /* renamed from: d, reason: collision with root package name */
    public final rs.e f15915d;

    /* renamed from: g, reason: collision with root package name */
    public int f15916g;

    /* renamed from: r, reason: collision with root package name */
    public int f15917r;

    /* renamed from: x, reason: collision with root package name */
    public int f15918x;

    /* renamed from: y, reason: collision with root package name */
    public int f15919y;

    static {
        y yVar = new y();
        Q = yVar;
        yVar.p();
    }

    public y(x xVar) {
        super(xVar);
        this.J = -1;
        this.O = (byte) -1;
        this.P = -1;
        this.f15915d = xVar.f21763a;
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
        int i10 = this.f15916g;
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
        if ((this.f15916g & 32) == 32 && !this.F.b()) {
            this.O = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < this.H.size(); i12++) {
            if (!((q0) this.H.get(i12)).b()) {
                this.O = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.K.size(); i13++) {
            if (!((y0) this.K.get(i13)).b()) {
                this.O = (byte) 0;
                return false;
            }
        }
        if ((this.f15916g & 128) == 128 && !this.L.b()) {
            this.O = (byte) 0;
            return false;
        }
        if ((this.f15916g & 256) == 256 && !this.N.b()) {
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
        int iL = (this.f15916g & 2) == 2 ? b5.m.l(1, this.f15918x) : 0;
        if ((this.f15916g & 4) == 4) {
            iL += b5.m.l(2, this.f15919y);
        }
        if ((this.f15916g & 8) == 8) {
            iL += b5.m.n(3, this.B);
        }
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            iL += b5.m.n(4, (rs.b) this.E.get(i11));
        }
        if ((this.f15916g & 32) == 32) {
            iL += b5.m.n(5, this.F);
        }
        for (int i12 = 0; i12 < this.K.size(); i12++) {
            iL += b5.m.n(6, (rs.b) this.K.get(i12));
        }
        if ((this.f15916g & 16) == 16) {
            iL += b5.m.l(7, this.D);
        }
        if ((this.f15916g & 64) == 64) {
            iL += b5.m.l(8, this.G);
        }
        if ((this.f15916g & 1) == 1) {
            iL += b5.m.l(9, this.f15917r);
        }
        for (int i13 = 0; i13 < this.H.size(); i13++) {
            iL += b5.m.n(10, (rs.b) this.H.get(i13));
        }
        int iM = 0;
        for (int i14 = 0; i14 < this.I.size(); i14++) {
            iM += b5.m.m(((Integer) this.I.get(i14)).intValue());
        }
        int iN = iL + iM;
        if (!this.I.isEmpty()) {
            iN = iN + 1 + b5.m.m(iM);
        }
        this.J = iM;
        if ((this.f15916g & 128) == 128) {
            iN += b5.m.n(30, this.L);
        }
        int iM2 = 0;
        for (int i15 = 0; i15 < this.M.size(); i15++) {
            iM2 += b5.m.m(((Integer) this.M.get(i15)).intValue());
        }
        int size = (this.M.size() * 2) + iN + iM2;
        if ((this.f15916g & 256) == 256) {
            size += b5.m.n(32, this.N);
        }
        int size2 = this.f15915d.size() + j() + size;
        this.P = size2;
        return size2;
    }

    @Override // rs.b
    public final rs.k d() {
        return x.h();
    }

    @Override // rs.b
    public final rs.k e() {
        x xVarH = x.h();
        xVarH.i(this);
        return xVarH;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        om.f fVar = new om.f(this);
        if ((this.f15916g & 2) == 2) {
            mVar.M(1, this.f15918x);
        }
        if ((this.f15916g & 4) == 4) {
            mVar.M(2, this.f15919y);
        }
        if ((this.f15916g & 8) == 8) {
            mVar.O(3, this.B);
        }
        for (int i10 = 0; i10 < this.E.size(); i10++) {
            mVar.O(4, (rs.b) this.E.get(i10));
        }
        if ((this.f15916g & 32) == 32) {
            mVar.O(5, this.F);
        }
        for (int i11 = 0; i11 < this.K.size(); i11++) {
            mVar.O(6, (rs.b) this.K.get(i11));
        }
        if ((this.f15916g & 16) == 16) {
            mVar.M(7, this.D);
        }
        if ((this.f15916g & 64) == 64) {
            mVar.M(8, this.G);
        }
        if ((this.f15916g & 1) == 1) {
            mVar.M(9, this.f15917r);
        }
        for (int i12 = 0; i12 < this.H.size(); i12++) {
            mVar.O(10, (rs.b) this.H.get(i12));
        }
        if (this.I.size() > 0) {
            mVar.V(90);
            mVar.V(this.J);
        }
        for (int i13 = 0; i13 < this.I.size(); i13++) {
            mVar.N(((Integer) this.I.get(i13)).intValue());
        }
        if ((this.f15916g & 128) == 128) {
            mVar.O(30, this.L);
        }
        for (int i14 = 0; i14 < this.M.size(); i14++) {
            mVar.M(31, ((Integer) this.M.get(i14)).intValue());
        }
        if ((this.f15916g & 256) == 256) {
            mVar.O(32, this.N);
        }
        fVar.y(19000, mVar);
        mVar.R(this.f15915d);
    }

    public final void p() {
        this.f15917r = 6;
        this.f15918x = 6;
        this.f15919y = 0;
        q0 q0Var = q0.P;
        this.B = q0Var;
        this.D = 0;
        List list = Collections.EMPTY_LIST;
        this.E = list;
        this.F = q0Var;
        this.G = 0;
        this.H = list;
        this.I = list;
        this.K = list;
        this.L = w0.B;
        this.M = list;
        this.N = n.f15838x;
    }

    public y() {
        this.J = -1;
        this.O = (byte) -1;
        this.P = -1;
        this.f15915d = rs.e.f21745a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public y(f5.u uVar, rs.g gVar) {
        this.J = -1;
        this.O = (byte) -1;
        this.P = -1;
        p();
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        boolean z10 = false;
        char c4 = 0;
        while (true) {
            ?? N = 1024;
            if (!z10) {
                try {
                    try {
                        int iT = uVar.t();
                        p0 p0VarR = null;
                        m mVar = null;
                        f fVarI = null;
                        p0 p0VarR2 = null;
                        switch (iT) {
                            case 0:
                                z10 = true;
                            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                                this.f15916g |= 2;
                                this.f15918x = uVar.q();
                            case 16:
                                this.f15916g |= 4;
                                this.f15919y = uVar.q();
                            case 26:
                                if ((this.f15916g & 8) == 8) {
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
                                this.f15916g |= 8;
                            case 34:
                                int i10 = (c4 == true ? 1 : 0) & 32;
                                c4 = c4;
                                if (i10 != 32) {
                                    this.E = new ArrayList();
                                    c4 = (c4 == true ? 1 : 0) | ' ';
                                }
                                this.E.add(uVar.m(v0.J, gVar));
                            case 42:
                                if ((this.f15916g & 32) == 32) {
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
                                this.f15916g |= 32;
                            case 50:
                                int i11 = (c4 == true ? 1 : 0) & 1024;
                                c4 = c4;
                                if (i11 != 1024) {
                                    this.K = new ArrayList();
                                    c4 = (c4 == true ? 1 : 0) | 1024;
                                }
                                this.K.add(uVar.m(y0.I, gVar));
                            case 56:
                                this.f15916g |= 16;
                                this.D = uVar.q();
                            case 64:
                                this.f15916g |= 64;
                                this.G = uVar.q();
                            case 72:
                                this.f15916g |= 1;
                                this.f15917r = uVar.q();
                            case 82:
                                int i12 = (c4 == true ? 1 : 0) & 256;
                                c4 = c4;
                                if (i12 != 256) {
                                    this.H = new ArrayList();
                                    c4 = (c4 == true ? 1 : 0) | 256;
                                }
                                this.H.add(uVar.m(q0.Q, gVar));
                            case 88:
                                int i13 = (c4 == true ? 1 : 0) & 512;
                                c4 = c4;
                                if (i13 != 512) {
                                    this.I = new ArrayList();
                                    c4 = (c4 == true ? 1 : 0) | 512;
                                }
                                this.I.add(Integer.valueOf(uVar.q()));
                            case 90:
                                int iJ = uVar.j(uVar.q());
                                int i14 = (c4 == true ? 1 : 0) & 512;
                                c4 = c4;
                                if (i14 != 512) {
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
                            case 242:
                                if ((this.f15916g & 128) == 128) {
                                    w0 w0Var = this.L;
                                    w0Var.getClass();
                                    fVarI = w0.i(w0Var);
                                }
                                w0 w0Var2 = (w0) uVar.m(w0.D, gVar);
                                this.L = w0Var2;
                                if (fVarI != null) {
                                    fVarI.l(w0Var2);
                                    this.L = fVarI.h();
                                }
                                this.f15916g |= 128;
                            case 248:
                                int i15 = (c4 == true ? 1 : 0) & 4096;
                                c4 = c4;
                                if (i15 != 4096) {
                                    this.M = new ArrayList();
                                    c4 = (c4 == true ? 1 : 0) | 4096;
                                }
                                this.M.add(Integer.valueOf(uVar.q()));
                            case 250:
                                int iJ2 = uVar.j(uVar.q());
                                int i16 = (c4 == true ? 1 : 0) & 4096;
                                c4 = c4;
                                if (i16 != 4096) {
                                    c4 = c4;
                                    if (uVar.g() > 0) {
                                        this.M = new ArrayList();
                                        c4 = (c4 == true ? 1 : 0) | 4096;
                                    }
                                }
                                while (uVar.g() > 0) {
                                    this.M.add(Integer.valueOf(uVar.q()));
                                }
                                uVar.i(iJ2);
                            case 258:
                                if ((this.f15916g & 256) == 256) {
                                    n nVar = this.N;
                                    nVar.getClass();
                                    mVar = new m(0);
                                    mVar.f15833r = Collections.EMPTY_LIST;
                                    mVar.j(nVar);
                                }
                                n nVar2 = (n) uVar.m(n.f15839y, gVar);
                                this.N = nVar2;
                                if (mVar != null) {
                                    mVar.j(nVar2);
                                    this.N = mVar.f();
                                }
                                this.f15916g |= 256;
                            default:
                                N = n(uVar, mVarZ, gVar, iT);
                                if (N == 0) {
                                    z10 = true;
                                }
                        }
                    } catch (rs.t e4) {
                        e4.f21776a = this;
                        throw e4;
                    } catch (IOException e10) {
                        rs.t tVar = new rs.t(e10.getMessage());
                        tVar.f21776a = this;
                        throw tVar;
                    }
                } catch (Throwable th2) {
                    if (((c4 == true ? 1 : 0) & 32) == 32) {
                        this.E = Collections.unmodifiableList(this.E);
                    }
                    if (((c4 == true ? 1 : 0) & 1024) == N) {
                        this.K = Collections.unmodifiableList(this.K);
                    }
                    if (((c4 == true ? 1 : 0) & 256) == 256) {
                        this.H = Collections.unmodifiableList(this.H);
                    }
                    if (((c4 == true ? 1 : 0) & 512) == 512) {
                        this.I = Collections.unmodifiableList(this.I);
                    }
                    if (((c4 == true ? 1 : 0) & 4096) == 4096) {
                        this.M = Collections.unmodifiableList(this.M);
                    }
                    try {
                        mVarZ.x();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f15915d = dVar.h();
                        throw th3;
                    }
                    this.f15915d = dVar.h();
                    m();
                    throw th2;
                }
            } else {
                if (((c4 == true ? 1 : 0) & 32) == 32) {
                    this.E = Collections.unmodifiableList(this.E);
                }
                if (((c4 == true ? 1 : 0) & 1024) == 1024) {
                    this.K = Collections.unmodifiableList(this.K);
                }
                if (((c4 == true ? 1 : 0) & 256) == 256) {
                    this.H = Collections.unmodifiableList(this.H);
                }
                if (((c4 == true ? 1 : 0) & 512) == 512) {
                    this.I = Collections.unmodifiableList(this.I);
                }
                if (((c4 == true ? 1 : 0) & 4096) == 4096) {
                    this.M = Collections.unmodifiableList(this.M);
                }
                try {
                    mVarZ.x();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f15915d = dVar.h();
                    throw th4;
                }
                this.f15915d = dVar.h();
                m();
                return;
            }
        }
    }
}

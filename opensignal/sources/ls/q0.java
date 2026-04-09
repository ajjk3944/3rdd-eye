package ls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class q0 extends rs.m {
    public static final q0 P;
    public static final a Q = new a(16);
    public q0 B;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public q0 I;
    public int J;
    public q0 K;
    public int L;
    public int M;
    public byte N;
    public int O;

    /* renamed from: d, reason: collision with root package name */
    public final rs.e f15858d;

    /* renamed from: g, reason: collision with root package name */
    public int f15859g;

    /* renamed from: r, reason: collision with root package name */
    public List f15860r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f15861x;

    /* renamed from: y, reason: collision with root package name */
    public int f15862y;

    static {
        q0 q0Var = new q0();
        P = q0Var;
        q0Var.q();
    }

    public q0(p0 p0Var) {
        super(p0Var);
        this.N = (byte) -1;
        this.O = -1;
        this.f15858d = p0Var.f21763a;
    }

    public static p0 r(q0 q0Var) {
        p0 p0VarH = p0.h();
        p0VarH.i(q0Var);
        return p0VarH;
    }

    @Override // rs.x
    public final rs.b a() {
        return P;
    }

    @Override // rs.x
    public final boolean b() {
        byte b2 = this.N;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f15860r.size(); i10++) {
            if (!((o0) this.f15860r.get(i10)).b()) {
                this.N = (byte) 0;
                return false;
            }
        }
        if ((this.f15859g & 4) == 4 && !this.B.b()) {
            this.N = (byte) 0;
            return false;
        }
        if ((this.f15859g & 256) == 256 && !this.I.b()) {
            this.N = (byte) 0;
            return false;
        }
        if ((this.f15859g & 1024) == 1024 && !this.K.b()) {
            this.N = (byte) 0;
            return false;
        }
        if (i()) {
            this.N = (byte) 1;
            return true;
        }
        this.N = (byte) 0;
        return false;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.O;
        if (i10 != -1) {
            return i10;
        }
        int iL = (this.f15859g & 4096) == 4096 ? b5.m.l(1, this.M) : 0;
        for (int i11 = 0; i11 < this.f15860r.size(); i11++) {
            iL += b5.m.n(2, (rs.b) this.f15860r.get(i11));
        }
        if ((this.f15859g & 1) == 1) {
            iL += b5.m.r(3) + 1;
        }
        if ((this.f15859g & 2) == 2) {
            iL += b5.m.l(4, this.f15862y);
        }
        if ((this.f15859g & 4) == 4) {
            iL += b5.m.n(5, this.B);
        }
        if ((this.f15859g & 16) == 16) {
            iL += b5.m.l(6, this.E);
        }
        if ((this.f15859g & 32) == 32) {
            iL += b5.m.l(7, this.F);
        }
        if ((this.f15859g & 8) == 8) {
            iL += b5.m.l(8, this.D);
        }
        if ((this.f15859g & 64) == 64) {
            iL += b5.m.l(9, this.G);
        }
        if ((this.f15859g & 256) == 256) {
            iL += b5.m.n(10, this.I);
        }
        if ((this.f15859g & 512) == 512) {
            iL += b5.m.l(11, this.J);
        }
        if ((this.f15859g & 128) == 128) {
            iL += b5.m.l(12, this.H);
        }
        if ((this.f15859g & 1024) == 1024) {
            iL += b5.m.n(13, this.K);
        }
        if ((this.f15859g & 2048) == 2048) {
            iL += b5.m.l(14, this.L);
        }
        int size = this.f15858d.size() + j() + iL;
        this.O = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        return p0.h();
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        om.f fVar = new om.f(this);
        if ((this.f15859g & 4096) == 4096) {
            mVar.M(1, this.M);
        }
        for (int i10 = 0; i10 < this.f15860r.size(); i10++) {
            mVar.O(2, (rs.b) this.f15860r.get(i10));
        }
        if ((this.f15859g & 1) == 1) {
            boolean z10 = this.f15861x;
            mVar.X(3, 0);
            mVar.Q(z10 ? 1 : 0);
        }
        if ((this.f15859g & 2) == 2) {
            mVar.M(4, this.f15862y);
        }
        if ((this.f15859g & 4) == 4) {
            mVar.O(5, this.B);
        }
        if ((this.f15859g & 16) == 16) {
            mVar.M(6, this.E);
        }
        if ((this.f15859g & 32) == 32) {
            mVar.M(7, this.F);
        }
        if ((this.f15859g & 8) == 8) {
            mVar.M(8, this.D);
        }
        if ((this.f15859g & 64) == 64) {
            mVar.M(9, this.G);
        }
        if ((this.f15859g & 256) == 256) {
            mVar.O(10, this.I);
        }
        if ((this.f15859g & 512) == 512) {
            mVar.M(11, this.J);
        }
        if ((this.f15859g & 128) == 128) {
            mVar.M(12, this.H);
        }
        if ((this.f15859g & 1024) == 1024) {
            mVar.O(13, this.K);
        }
        if ((this.f15859g & 2048) == 2048) {
            mVar.M(14, this.L);
        }
        fVar.y(200, mVar);
        mVar.R(this.f15858d);
    }

    public final boolean p() {
        return (this.f15859g & 16) == 16;
    }

    public final void q() {
        this.f15860r = Collections.EMPTY_LIST;
        this.f15861x = false;
        this.f15862y = 0;
        q0 q0Var = P;
        this.B = q0Var;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = q0Var;
        this.J = 0;
        this.K = q0Var;
        this.L = 0;
        this.M = 0;
    }

    @Override // rs.b
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final p0 e() {
        return r(this);
    }

    public q0() {
        this.N = (byte) -1;
        this.O = -1;
        this.f15858d = rs.e.f21745a;
    }

    public q0(f5.u uVar, rs.g gVar) {
        this.N = (byte) -1;
        this.O = -1;
        q();
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iT = uVar.t();
                    a aVar = Q;
                    p0 p0VarR = null;
                    switch (iT) {
                        case 0:
                            break;
                        case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                            this.f15859g |= 4096;
                            this.M = uVar.q();
                            continue;
                        case 18:
                            if (!z11) {
                                this.f15860r = new ArrayList();
                                z11 = true;
                            }
                            this.f15860r.add(uVar.m(o0.E, gVar));
                            continue;
                        case 24:
                            this.f15859g |= 1;
                            this.f15861x = uVar.r() != 0;
                            continue;
                        case 32:
                            this.f15859g |= 2;
                            this.f15862y = uVar.q();
                            continue;
                        case 42:
                            if ((this.f15859g & 4) == 4) {
                                q0 q0Var = this.B;
                                q0Var.getClass();
                                p0VarR = r(q0Var);
                            }
                            q0 q0Var2 = (q0) uVar.m(aVar, gVar);
                            this.B = q0Var2;
                            if (p0VarR != null) {
                                p0VarR.i(q0Var2);
                                this.B = p0VarR.g();
                            }
                            this.f15859g |= 4;
                            continue;
                        case 48:
                            this.f15859g |= 16;
                            this.E = uVar.q();
                            continue;
                        case 56:
                            this.f15859g |= 32;
                            this.F = uVar.q();
                            continue;
                        case 64:
                            this.f15859g |= 8;
                            this.D = uVar.q();
                            continue;
                        case 72:
                            this.f15859g |= 64;
                            this.G = uVar.q();
                            continue;
                        case 82:
                            if ((this.f15859g & 256) == 256) {
                                q0 q0Var3 = this.I;
                                q0Var3.getClass();
                                p0VarR = r(q0Var3);
                            }
                            q0 q0Var4 = (q0) uVar.m(aVar, gVar);
                            this.I = q0Var4;
                            if (p0VarR != null) {
                                p0VarR.i(q0Var4);
                                this.I = p0VarR.g();
                            }
                            this.f15859g |= 256;
                            continue;
                        case 88:
                            this.f15859g |= 512;
                            this.J = uVar.q();
                            continue;
                        case 96:
                            this.f15859g |= 128;
                            this.H = uVar.q();
                            continue;
                        case 106:
                            if ((this.f15859g & 1024) == 1024) {
                                q0 q0Var5 = this.K;
                                q0Var5.getClass();
                                p0VarR = r(q0Var5);
                            }
                            q0 q0Var6 = (q0) uVar.m(aVar, gVar);
                            this.K = q0Var6;
                            if (p0VarR != null) {
                                p0VarR.i(q0Var6);
                                this.K = p0VarR.g();
                            }
                            this.f15859g |= 1024;
                            continue;
                        case 112:
                            this.f15859g |= 2048;
                            this.L = uVar.q();
                            continue;
                        default:
                            if (!n(uVar, mVarZ, gVar, iT)) {
                                break;
                            }
                    }
                    z10 = true;
                } catch (rs.t e4) {
                    e4.f21776a = this;
                    throw e4;
                } catch (IOException e10) {
                    rs.t tVar = new rs.t(e10.getMessage());
                    tVar.f21776a = this;
                    throw tVar;
                }
            } catch (Throwable th2) {
                if (z11) {
                    this.f15860r = Collections.unmodifiableList(this.f15860r);
                }
                try {
                    mVarZ.x();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f15858d = dVar.h();
                    throw th3;
                }
                this.f15858d = dVar.h();
                m();
                throw th2;
            }
        }
        if (z11) {
            this.f15860r = Collections.unmodifiableList(this.f15860r);
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f15858d = dVar.h();
            throw th4;
        }
        this.f15858d = dVar.h();
        m();
    }
}

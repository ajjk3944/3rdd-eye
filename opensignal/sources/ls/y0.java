package ls;

import java.io.IOException;

/* loaded from: classes.dex */
public final class y0 extends rs.m {
    public static final y0 H;
    public static final a I = new a(21);
    public int B;
    public q0 D;
    public int E;
    public byte F;
    public int G;

    /* renamed from: d, reason: collision with root package name */
    public final rs.e f15920d;

    /* renamed from: g, reason: collision with root package name */
    public int f15921g;

    /* renamed from: r, reason: collision with root package name */
    public int f15922r;

    /* renamed from: x, reason: collision with root package name */
    public int f15923x;

    /* renamed from: y, reason: collision with root package name */
    public q0 f15924y;

    static {
        y0 y0Var = new y0();
        H = y0Var;
        y0Var.f15922r = 0;
        y0Var.f15923x = 0;
        q0 q0Var = q0.P;
        y0Var.f15924y = q0Var;
        y0Var.B = 0;
        y0Var.D = q0Var;
        y0Var.E = 0;
    }

    public y0(x0 x0Var) {
        super(x0Var);
        this.F = (byte) -1;
        this.G = -1;
        this.f15920d = x0Var.f21763a;
    }

    @Override // rs.x
    public final rs.b a() {
        return H;
    }

    @Override // rs.x
    public final boolean b() {
        byte b2 = this.F;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i10 = this.f15921g;
        if ((i10 & 2) != 2) {
            this.F = (byte) 0;
            return false;
        }
        if ((i10 & 4) == 4 && !this.f15924y.b()) {
            this.F = (byte) 0;
            return false;
        }
        if ((this.f15921g & 16) == 16 && !this.D.b()) {
            this.F = (byte) 0;
            return false;
        }
        if (i()) {
            this.F = (byte) 1;
            return true;
        }
        this.F = (byte) 0;
        return false;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.G;
        if (i10 != -1) {
            return i10;
        }
        int iL = (this.f15921g & 1) == 1 ? b5.m.l(1, this.f15922r) : 0;
        if ((this.f15921g & 2) == 2) {
            iL += b5.m.l(2, this.f15923x);
        }
        if ((this.f15921g & 4) == 4) {
            iL += b5.m.n(3, this.f15924y);
        }
        if ((this.f15921g & 16) == 16) {
            iL += b5.m.n(4, this.D);
        }
        if ((this.f15921g & 8) == 8) {
            iL += b5.m.l(5, this.B);
        }
        if ((this.f15921g & 32) == 32) {
            iL += b5.m.l(6, this.E);
        }
        int size = this.f15920d.size() + j() + iL;
        this.G = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        x0 x0Var = new x0();
        q0 q0Var = q0.P;
        x0Var.B = q0Var;
        x0Var.E = q0Var;
        return x0Var;
    }

    @Override // rs.b
    public final rs.k e() {
        x0 x0Var = new x0();
        q0 q0Var = q0.P;
        x0Var.B = q0Var;
        x0Var.E = q0Var;
        x0Var.h(this);
        return x0Var;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        om.f fVar = new om.f(this);
        if ((this.f15921g & 1) == 1) {
            mVar.M(1, this.f15922r);
        }
        if ((this.f15921g & 2) == 2) {
            mVar.M(2, this.f15923x);
        }
        if ((this.f15921g & 4) == 4) {
            mVar.O(3, this.f15924y);
        }
        if ((this.f15921g & 16) == 16) {
            mVar.O(4, this.D);
        }
        if ((this.f15921g & 8) == 8) {
            mVar.M(5, this.B);
        }
        if ((this.f15921g & 32) == 32) {
            mVar.M(6, this.E);
        }
        fVar.y(200, mVar);
        mVar.R(this.f15920d);
    }

    public y0() {
        this.F = (byte) -1;
        this.G = -1;
        this.f15920d = rs.e.f21745a;
    }

    public y0(f5.u uVar, rs.g gVar) {
        this.F = (byte) -1;
        this.G = -1;
        boolean z10 = false;
        this.f15922r = 0;
        this.f15923x = 0;
        q0 q0Var = q0.P;
        this.f15924y = q0Var;
        this.B = 0;
        this.D = q0Var;
        this.E = 0;
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        while (!z10) {
            try {
                try {
                    int iT = uVar.t();
                    if (iT != 0) {
                        if (iT == 8) {
                            this.f15921g |= 1;
                            this.f15922r = uVar.q();
                        } else if (iT != 16) {
                            p0 p0VarR = null;
                            if (iT == 26) {
                                if ((this.f15921g & 4) == 4) {
                                    q0 q0Var2 = this.f15924y;
                                    q0Var2.getClass();
                                    p0VarR = q0.r(q0Var2);
                                }
                                q0 q0Var3 = (q0) uVar.m(q0.Q, gVar);
                                this.f15924y = q0Var3;
                                if (p0VarR != null) {
                                    p0VarR.i(q0Var3);
                                    this.f15924y = p0VarR.g();
                                }
                                this.f15921g |= 4;
                            } else if (iT == 34) {
                                if ((this.f15921g & 16) == 16) {
                                    q0 q0Var4 = this.D;
                                    q0Var4.getClass();
                                    p0VarR = q0.r(q0Var4);
                                }
                                q0 q0Var5 = (q0) uVar.m(q0.Q, gVar);
                                this.D = q0Var5;
                                if (p0VarR != null) {
                                    p0VarR.i(q0Var5);
                                    this.D = p0VarR.g();
                                }
                                this.f15921g |= 16;
                            } else if (iT == 40) {
                                this.f15921g |= 8;
                                this.B = uVar.q();
                            } else if (iT != 48) {
                                if (!n(uVar, mVarZ, gVar, iT)) {
                                }
                            } else {
                                this.f15921g |= 32;
                                this.E = uVar.q();
                            }
                        } else {
                            this.f15921g |= 2;
                            this.f15923x = uVar.q();
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
                try {
                    mVarZ.x();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f15920d = dVar.h();
                    throw th3;
                }
                this.f15920d = dVar.h();
                m();
                throw th2;
            }
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f15920d = dVar.h();
            throw th4;
        }
        this.f15920d = dVar.h();
        m();
    }
}

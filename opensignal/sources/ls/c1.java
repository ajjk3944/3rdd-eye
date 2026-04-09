package ls;

import java.io.IOException;

/* loaded from: classes.dex */
public final class c1 extends rs.p {
    public static final c1 G;
    public static final a H = new a(22);
    public int B;
    public b1 D;
    public byte E;
    public int F;

    /* renamed from: a, reason: collision with root package name */
    public final rs.e f15736a;

    /* renamed from: d, reason: collision with root package name */
    public int f15737d;

    /* renamed from: g, reason: collision with root package name */
    public int f15738g;

    /* renamed from: r, reason: collision with root package name */
    public int f15739r;

    /* renamed from: x, reason: collision with root package name */
    public a1 f15740x;

    /* renamed from: y, reason: collision with root package name */
    public int f15741y;

    static {
        c1 c1Var = new c1();
        G = c1Var;
        c1Var.f15738g = 0;
        c1Var.f15739r = 0;
        c1Var.f15740x = a1.ERROR;
        c1Var.f15741y = 0;
        c1Var.B = 0;
        c1Var.D = b1.LANGUAGE_VERSION;
    }

    public c1() {
        this.E = (byte) -1;
        this.F = -1;
        this.f15736a = rs.e.f21745a;
    }

    @Override // rs.x
    public final boolean b() {
        if (this.E == 1) {
            return true;
        }
        this.E = (byte) 1;
        return true;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.F;
        if (i10 != -1) {
            return i10;
        }
        int iL = (this.f15737d & 1) == 1 ? b5.m.l(1, this.f15738g) : 0;
        if ((this.f15737d & 2) == 2) {
            iL += b5.m.l(2, this.f15739r);
        }
        if ((this.f15737d & 4) == 4) {
            iL += b5.m.k(3, this.f15740x.getNumber());
        }
        if ((this.f15737d & 8) == 8) {
            iL += b5.m.l(4, this.f15741y);
        }
        if ((this.f15737d & 16) == 16) {
            iL += b5.m.l(5, this.B);
        }
        if ((this.f15737d & 32) == 32) {
            iL += b5.m.k(6, this.D.getNumber());
        }
        int size = this.f15736a.size() + iL;
        this.F = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        return z0.g();
    }

    @Override // rs.b
    public final rs.k e() {
        z0 z0VarG = z0.g();
        z0VarG.h(this);
        return z0VarG;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        if ((this.f15737d & 1) == 1) {
            mVar.M(1, this.f15738g);
        }
        if ((this.f15737d & 2) == 2) {
            mVar.M(2, this.f15739r);
        }
        if ((this.f15737d & 4) == 4) {
            mVar.L(3, this.f15740x.getNumber());
        }
        if ((this.f15737d & 8) == 8) {
            mVar.M(4, this.f15741y);
        }
        if ((this.f15737d & 16) == 16) {
            mVar.M(5, this.B);
        }
        if ((this.f15737d & 32) == 32) {
            mVar.L(6, this.D.getNumber());
        }
        mVar.R(this.f15736a);
    }

    public c1(f5.u uVar) {
        this.E = (byte) -1;
        this.F = -1;
        boolean z10 = false;
        this.f15738g = 0;
        this.f15739r = 0;
        this.f15740x = a1.ERROR;
        this.f15741y = 0;
        this.B = 0;
        this.D = b1.LANGUAGE_VERSION;
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        while (!z10) {
            try {
                try {
                    int iT = uVar.t();
                    if (iT != 0) {
                        if (iT == 8) {
                            this.f15737d |= 1;
                            this.f15738g = uVar.q();
                        } else if (iT == 16) {
                            this.f15737d |= 2;
                            this.f15739r = uVar.q();
                        } else if (iT == 24) {
                            int iQ = uVar.q();
                            a1 a1VarValueOf = a1.valueOf(iQ);
                            if (a1VarValueOf == null) {
                                mVarZ.V(iT);
                                mVarZ.V(iQ);
                            } else {
                                this.f15737d |= 4;
                                this.f15740x = a1VarValueOf;
                            }
                        } else if (iT == 32) {
                            this.f15737d |= 8;
                            this.f15741y = uVar.q();
                        } else if (iT == 40) {
                            this.f15737d |= 16;
                            this.B = uVar.q();
                        } else if (iT != 48) {
                            if (!uVar.w(iT, mVarZ)) {
                            }
                        } else {
                            int iQ2 = uVar.q();
                            b1 b1VarValueOf = b1.valueOf(iQ2);
                            if (b1VarValueOf == null) {
                                mVarZ.V(iT);
                                mVarZ.V(iQ2);
                            } else {
                                this.f15737d |= 32;
                                this.D = b1VarValueOf;
                            }
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
                    this.f15736a = dVar.h();
                    throw th3;
                }
                this.f15736a = dVar.h();
                throw th2;
            }
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f15736a = dVar.h();
            throw th4;
        }
        this.f15736a = dVar.h();
    }

    public c1(z0 z0Var) {
        this.E = (byte) -1;
        this.F = -1;
        this.f15736a = z0Var.f21763a;
    }
}

package ls;

import java.io.IOException;

/* loaded from: classes.dex */
public final class o0 extends rs.p {
    public static final o0 D;
    public static final a E = new a(17);
    public int B;

    /* renamed from: a, reason: collision with root package name */
    public final rs.e f15849a;

    /* renamed from: d, reason: collision with root package name */
    public int f15850d;

    /* renamed from: g, reason: collision with root package name */
    public n0 f15851g;

    /* renamed from: r, reason: collision with root package name */
    public q0 f15852r;

    /* renamed from: x, reason: collision with root package name */
    public int f15853x;

    /* renamed from: y, reason: collision with root package name */
    public byte f15854y;

    static {
        o0 o0Var = new o0();
        D = o0Var;
        o0Var.f15851g = n0.INV;
        o0Var.f15852r = q0.P;
        o0Var.f15853x = 0;
    }

    public o0() {
        this.f15854y = (byte) -1;
        this.B = -1;
        this.f15849a = rs.e.f21745a;
    }

    @Override // rs.x
    public final boolean b() {
        byte b2 = this.f15854y;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.f15850d & 2) != 2 || this.f15852r.b()) {
            this.f15854y = (byte) 1;
            return true;
        }
        this.f15854y = (byte) 0;
        return false;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.B;
        if (i10 != -1) {
            return i10;
        }
        int iK = (this.f15850d & 1) == 1 ? b5.m.k(1, this.f15851g.getNumber()) : 0;
        if ((this.f15850d & 2) == 2) {
            iK += b5.m.n(2, this.f15852r);
        }
        if ((this.f15850d & 4) == 4) {
            iK += b5.m.l(3, this.f15853x);
        }
        int size = this.f15849a.size() + iK;
        this.B = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        return m0.g();
    }

    @Override // rs.b
    public final rs.k e() {
        m0 m0VarG = m0.g();
        m0VarG.h(this);
        return m0VarG;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        if ((this.f15850d & 1) == 1) {
            mVar.L(1, this.f15851g.getNumber());
        }
        if ((this.f15850d & 2) == 2) {
            mVar.O(2, this.f15852r);
        }
        if ((this.f15850d & 4) == 4) {
            mVar.M(3, this.f15853x);
        }
        mVar.R(this.f15849a);
    }

    public o0(f5.u uVar, rs.g gVar) {
        p0 p0VarR;
        this.f15854y = (byte) -1;
        this.B = -1;
        this.f15851g = n0.INV;
        this.f15852r = q0.P;
        boolean z10 = false;
        this.f15853x = 0;
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        while (!z10) {
            try {
                try {
                    int iT = uVar.t();
                    if (iT != 0) {
                        if (iT == 8) {
                            int iQ = uVar.q();
                            n0 n0VarValueOf = n0.valueOf(iQ);
                            if (n0VarValueOf == null) {
                                mVarZ.V(iT);
                                mVarZ.V(iQ);
                            } else {
                                this.f15850d |= 1;
                                this.f15851g = n0VarValueOf;
                            }
                        } else if (iT == 18) {
                            if ((this.f15850d & 2) == 2) {
                                q0 q0Var = this.f15852r;
                                q0Var.getClass();
                                p0VarR = q0.r(q0Var);
                            } else {
                                p0VarR = null;
                            }
                            q0 q0Var2 = (q0) uVar.m(q0.Q, gVar);
                            this.f15852r = q0Var2;
                            if (p0VarR != null) {
                                p0VarR.i(q0Var2);
                                this.f15852r = p0VarR.g();
                            }
                            this.f15850d |= 2;
                        } else if (iT != 24) {
                            if (!uVar.w(iT, mVarZ)) {
                            }
                        } else {
                            this.f15850d |= 4;
                            this.f15853x = uVar.q();
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
                    this.f15849a = dVar.h();
                    throw th3;
                }
                this.f15849a = dVar.h();
                throw th2;
            }
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f15849a = dVar.h();
            throw th4;
        }
        this.f15849a = dVar.h();
    }

    public o0(m0 m0Var) {
        this.f15854y = (byte) -1;
        this.B = -1;
        this.f15849a = m0Var.f21763a;
    }
}

package ls;

import java.io.IOException;

/* loaded from: classes.dex */
public final class j0 extends rs.p {
    public static final j0 D;
    public static final a E = new a(14);
    public int B;

    /* renamed from: a, reason: collision with root package name */
    public final rs.e f15805a;

    /* renamed from: d, reason: collision with root package name */
    public int f15806d;

    /* renamed from: g, reason: collision with root package name */
    public int f15807g;

    /* renamed from: r, reason: collision with root package name */
    public int f15808r;

    /* renamed from: x, reason: collision with root package name */
    public i0 f15809x;

    /* renamed from: y, reason: collision with root package name */
    public byte f15810y;

    static {
        j0 j0Var = new j0();
        D = j0Var;
        j0Var.f15807g = -1;
        j0Var.f15808r = 0;
        j0Var.f15809x = i0.PACKAGE;
    }

    public j0() {
        this.f15810y = (byte) -1;
        this.B = -1;
        this.f15805a = rs.e.f21745a;
    }

    @Override // rs.x
    public final boolean b() {
        byte b2 = this.f15810y;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.f15806d & 2) == 2) {
            this.f15810y = (byte) 1;
            return true;
        }
        this.f15810y = (byte) 0;
        return false;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.B;
        if (i10 != -1) {
            return i10;
        }
        int iL = (this.f15806d & 1) == 1 ? b5.m.l(1, this.f15807g) : 0;
        if ((this.f15806d & 2) == 2) {
            iL += b5.m.l(2, this.f15808r);
        }
        if ((this.f15806d & 4) == 4) {
            iL += b5.m.k(3, this.f15809x.getNumber());
        }
        int size = this.f15805a.size() + iL;
        this.B = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        return h0.g();
    }

    @Override // rs.b
    public final rs.k e() {
        h0 h0VarG = h0.g();
        h0VarG.h(this);
        return h0VarG;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        if ((this.f15806d & 1) == 1) {
            mVar.M(1, this.f15807g);
        }
        if ((this.f15806d & 2) == 2) {
            mVar.M(2, this.f15808r);
        }
        if ((this.f15806d & 4) == 4) {
            mVar.L(3, this.f15809x.getNumber());
        }
        mVar.R(this.f15805a);
    }

    public j0(f5.u uVar) {
        this.f15810y = (byte) -1;
        this.B = -1;
        this.f15807g = -1;
        boolean z10 = false;
        this.f15808r = 0;
        this.f15809x = i0.PACKAGE;
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        while (!z10) {
            try {
                try {
                    int iT = uVar.t();
                    if (iT != 0) {
                        if (iT == 8) {
                            this.f15806d |= 1;
                            this.f15807g = uVar.q();
                        } else if (iT == 16) {
                            this.f15806d |= 2;
                            this.f15808r = uVar.q();
                        } else if (iT != 24) {
                            if (!uVar.w(iT, mVarZ)) {
                            }
                        } else {
                            int iQ = uVar.q();
                            i0 i0VarValueOf = i0.valueOf(iQ);
                            if (i0VarValueOf == null) {
                                mVarZ.V(iT);
                                mVarZ.V(iQ);
                            } else {
                                this.f15806d |= 4;
                                this.f15809x = i0VarValueOf;
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
                    this.f15805a = dVar.h();
                    throw th3;
                }
                this.f15805a = dVar.h();
                throw th2;
            }
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f15805a = dVar.h();
            throw th4;
        }
        this.f15805a = dVar.h();
    }

    public j0(h0 h0Var) {
        this.f15810y = (byte) -1;
        this.B = -1;
        this.f15805a = h0Var.f21763a;
    }
}

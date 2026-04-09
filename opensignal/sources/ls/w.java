package ls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class w extends rs.p {
    public static final w H;
    public static final a I = new a(8);
    public int B;
    public List D;
    public List E;
    public byte F;
    public int G;

    /* renamed from: a, reason: collision with root package name */
    public final rs.e f15897a;

    /* renamed from: d, reason: collision with root package name */
    public int f15898d;

    /* renamed from: g, reason: collision with root package name */
    public int f15899g;

    /* renamed from: r, reason: collision with root package name */
    public int f15900r;

    /* renamed from: x, reason: collision with root package name */
    public v f15901x;

    /* renamed from: y, reason: collision with root package name */
    public q0 f15902y;

    static {
        w wVar = new w();
        H = wVar;
        wVar.f15899g = 0;
        wVar.f15900r = 0;
        wVar.f15901x = v.TRUE;
        wVar.f15902y = q0.P;
        wVar.B = 0;
        List list = Collections.EMPTY_LIST;
        wVar.D = list;
        wVar.E = list;
    }

    public w() {
        this.F = (byte) -1;
        this.G = -1;
        this.f15897a = rs.e.f21745a;
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
        if ((this.f15898d & 8) == 8 && !this.f15902y.b()) {
            this.F = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.D.size(); i10++) {
            if (!((w) this.D.get(i10)).b()) {
                this.F = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            if (!((w) this.E.get(i11)).b()) {
                this.F = (byte) 0;
                return false;
            }
        }
        this.F = (byte) 1;
        return true;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.G;
        if (i10 != -1) {
            return i10;
        }
        int iL = (this.f15898d & 1) == 1 ? b5.m.l(1, this.f15899g) : 0;
        if ((this.f15898d & 2) == 2) {
            iL += b5.m.l(2, this.f15900r);
        }
        if ((this.f15898d & 4) == 4) {
            iL += b5.m.k(3, this.f15901x.getNumber());
        }
        if ((this.f15898d & 8) == 8) {
            iL += b5.m.n(4, this.f15902y);
        }
        if ((this.f15898d & 16) == 16) {
            iL += b5.m.l(5, this.B);
        }
        for (int i11 = 0; i11 < this.D.size(); i11++) {
            iL += b5.m.n(6, (rs.b) this.D.get(i11));
        }
        for (int i12 = 0; i12 < this.E.size(); i12++) {
            iL += b5.m.n(7, (rs.b) this.E.get(i12));
        }
        int size = this.f15897a.size() + iL;
        this.G = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        return u.g();
    }

    @Override // rs.b
    public final rs.k e() {
        u uVarG = u.g();
        uVarG.h(this);
        return uVarG;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        if ((this.f15898d & 1) == 1) {
            mVar.M(1, this.f15899g);
        }
        if ((this.f15898d & 2) == 2) {
            mVar.M(2, this.f15900r);
        }
        if ((this.f15898d & 4) == 4) {
            mVar.L(3, this.f15901x.getNumber());
        }
        if ((this.f15898d & 8) == 8) {
            mVar.O(4, this.f15902y);
        }
        if ((this.f15898d & 16) == 16) {
            mVar.M(5, this.B);
        }
        for (int i10 = 0; i10 < this.D.size(); i10++) {
            mVar.O(6, (rs.b) this.D.get(i10));
        }
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            mVar.O(7, (rs.b) this.E.get(i11));
        }
        mVar.R(this.f15897a);
    }

    public w(f5.u uVar, rs.g gVar) {
        p0 p0VarR;
        this.F = (byte) -1;
        this.G = -1;
        boolean z10 = false;
        this.f15899g = 0;
        this.f15900r = 0;
        this.f15901x = v.TRUE;
        this.f15902y = q0.P;
        this.B = 0;
        List list = Collections.EMPTY_LIST;
        this.D = list;
        this.E = list;
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iT = uVar.t();
                    if (iT != 0) {
                        if (iT == 8) {
                            this.f15898d |= 1;
                            this.f15899g = uVar.q();
                        } else if (iT == 16) {
                            this.f15898d |= 2;
                            this.f15900r = uVar.q();
                        } else if (iT == 24) {
                            int iQ = uVar.q();
                            v vVarValueOf = v.valueOf(iQ);
                            if (vVarValueOf == null) {
                                mVarZ.V(iT);
                                mVarZ.V(iQ);
                            } else {
                                this.f15898d |= 4;
                                this.f15901x = vVarValueOf;
                            }
                        } else if (iT == 34) {
                            if ((this.f15898d & 8) == 8) {
                                q0 q0Var = this.f15902y;
                                q0Var.getClass();
                                p0VarR = q0.r(q0Var);
                            } else {
                                p0VarR = null;
                            }
                            q0 q0Var2 = (q0) uVar.m(q0.Q, gVar);
                            this.f15902y = q0Var2;
                            if (p0VarR != null) {
                                p0VarR.i(q0Var2);
                                this.f15902y = p0VarR.g();
                            }
                            this.f15898d |= 8;
                        } else if (iT != 40) {
                            a aVar = I;
                            if (iT == 50) {
                                if ((i10 & 32) != 32) {
                                    this.D = new ArrayList();
                                    i10 |= 32;
                                }
                                this.D.add(uVar.m(aVar, gVar));
                            } else if (iT != 58) {
                                if (!uVar.w(iT, mVarZ)) {
                                }
                            } else {
                                if ((i10 & 64) != 64) {
                                    this.E = new ArrayList();
                                    i10 |= 64;
                                }
                                this.E.add(uVar.m(aVar, gVar));
                            }
                        } else {
                            this.f15898d |= 16;
                            this.B = uVar.q();
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
                if ((i10 & 32) == 32) {
                    this.D = Collections.unmodifiableList(this.D);
                }
                if ((i10 & 64) == 64) {
                    this.E = Collections.unmodifiableList(this.E);
                }
                try {
                    mVarZ.x();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f15897a = dVar.h();
                    throw th3;
                }
                this.f15897a = dVar.h();
                throw th2;
            }
        }
        if ((i10 & 32) == 32) {
            this.D = Collections.unmodifiableList(this.D);
        }
        if ((i10 & 64) == 64) {
            this.E = Collections.unmodifiableList(this.E);
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f15897a = dVar.h();
            throw th4;
        }
        this.f15897a = dVar.h();
    }

    public w(u uVar) {
        this.F = (byte) -1;
        this.G = -1;
        this.f15897a = uVar.f21763a;
    }
}

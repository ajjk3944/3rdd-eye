package ls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class v0 extends rs.m {
    public static final v0 I;
    public static final a J = new a(19);
    public u0 B;
    public List D;
    public List E;
    public int F;
    public byte G;
    public int H;

    /* renamed from: d, reason: collision with root package name */
    public final rs.e f15892d;

    /* renamed from: g, reason: collision with root package name */
    public int f15893g;

    /* renamed from: r, reason: collision with root package name */
    public int f15894r;

    /* renamed from: x, reason: collision with root package name */
    public int f15895x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f15896y;

    static {
        v0 v0Var = new v0();
        I = v0Var;
        v0Var.f15894r = 0;
        v0Var.f15895x = 0;
        v0Var.f15896y = false;
        v0Var.B = u0.INV;
        List list = Collections.EMPTY_LIST;
        v0Var.D = list;
        v0Var.E = list;
    }

    public v0(t0 t0Var) {
        super(t0Var);
        this.F = -1;
        this.G = (byte) -1;
        this.H = -1;
        this.f15892d = t0Var.f21763a;
    }

    @Override // rs.x
    public final rs.b a() {
        return I;
    }

    @Override // rs.x
    public final boolean b() {
        byte b2 = this.G;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i10 = this.f15893g;
        if ((i10 & 1) != 1) {
            this.G = (byte) 0;
            return false;
        }
        if ((i10 & 2) != 2) {
            this.G = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.D.size(); i11++) {
            if (!((q0) this.D.get(i11)).b()) {
                this.G = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.G = (byte) 1;
            return true;
        }
        this.G = (byte) 0;
        return false;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.H;
        if (i10 != -1) {
            return i10;
        }
        int iL = (this.f15893g & 1) == 1 ? b5.m.l(1, this.f15894r) : 0;
        if ((this.f15893g & 2) == 2) {
            iL += b5.m.l(2, this.f15895x);
        }
        if ((this.f15893g & 4) == 4) {
            iL += b5.m.r(3) + 1;
        }
        if ((this.f15893g & 8) == 8) {
            iL += b5.m.k(4, this.B.getNumber());
        }
        for (int i11 = 0; i11 < this.D.size(); i11++) {
            iL += b5.m.n(5, (rs.b) this.D.get(i11));
        }
        int iM = 0;
        for (int i12 = 0; i12 < this.E.size(); i12++) {
            iM += b5.m.m(((Integer) this.E.get(i12)).intValue());
        }
        int iM2 = iL + iM;
        if (!this.E.isEmpty()) {
            iM2 = iM2 + 1 + b5.m.m(iM);
        }
        this.F = iM;
        int size = this.f15892d.size() + j() + iM2;
        this.H = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        return t0.h();
    }

    @Override // rs.b
    public final rs.k e() {
        t0 t0VarH = t0.h();
        t0VarH.i(this);
        return t0VarH;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        om.f fVar = new om.f(this);
        if ((this.f15893g & 1) == 1) {
            mVar.M(1, this.f15894r);
        }
        if ((this.f15893g & 2) == 2) {
            mVar.M(2, this.f15895x);
        }
        if ((this.f15893g & 4) == 4) {
            boolean z10 = this.f15896y;
            mVar.X(3, 0);
            mVar.Q(z10 ? 1 : 0);
        }
        if ((this.f15893g & 8) == 8) {
            mVar.L(4, this.B.getNumber());
        }
        for (int i10 = 0; i10 < this.D.size(); i10++) {
            mVar.O(5, (rs.b) this.D.get(i10));
        }
        if (this.E.size() > 0) {
            mVar.V(50);
            mVar.V(this.F);
        }
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            mVar.N(((Integer) this.E.get(i11)).intValue());
        }
        fVar.y(1000, mVar);
        mVar.R(this.f15892d);
    }

    public v0() {
        this.F = -1;
        this.G = (byte) -1;
        this.H = -1;
        this.f15892d = rs.e.f21745a;
    }

    public v0(f5.u uVar, rs.g gVar) {
        this.F = -1;
        this.G = (byte) -1;
        this.H = -1;
        this.f15894r = 0;
        this.f15895x = 0;
        this.f15896y = false;
        this.B = u0.INV;
        List list = Collections.EMPTY_LIST;
        this.D = list;
        this.E = list;
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iT = uVar.t();
                        if (iT != 0) {
                            if (iT == 8) {
                                this.f15893g |= 1;
                                this.f15894r = uVar.q();
                            } else if (iT == 16) {
                                this.f15893g |= 2;
                                this.f15895x = uVar.q();
                            } else if (iT == 24) {
                                this.f15893g |= 4;
                                this.f15896y = uVar.r() != 0;
                            } else if (iT == 32) {
                                int iQ = uVar.q();
                                u0 u0VarValueOf = u0.valueOf(iQ);
                                if (u0VarValueOf == null) {
                                    mVarZ.V(iT);
                                    mVarZ.V(iQ);
                                } else {
                                    this.f15893g |= 8;
                                    this.B = u0VarValueOf;
                                }
                            } else if (iT == 42) {
                                if ((i10 & 16) != 16) {
                                    this.D = new ArrayList();
                                    i10 |= 16;
                                }
                                this.D.add(uVar.m(q0.Q, gVar));
                            } else if (iT == 48) {
                                if ((i10 & 32) != 32) {
                                    this.E = new ArrayList();
                                    i10 |= 32;
                                }
                                this.E.add(Integer.valueOf(uVar.q()));
                            } else if (iT != 50) {
                                if (!n(uVar, mVarZ, gVar, iT)) {
                                }
                            } else {
                                int iJ = uVar.j(uVar.q());
                                if ((i10 & 32) != 32 && uVar.g() > 0) {
                                    this.E = new ArrayList();
                                    i10 |= 32;
                                }
                                while (uVar.g() > 0) {
                                    this.E.add(Integer.valueOf(uVar.q()));
                                }
                                uVar.i(iJ);
                            }
                        }
                        z10 = true;
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
                if ((i10 & 16) == 16) {
                    this.D = Collections.unmodifiableList(this.D);
                }
                if ((i10 & 32) == 32) {
                    this.E = Collections.unmodifiableList(this.E);
                }
                try {
                    mVarZ.x();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f15892d = dVar.h();
                    throw th3;
                }
                this.f15892d = dVar.h();
                m();
                throw th2;
            }
        }
        if ((i10 & 16) == 16) {
            this.D = Collections.unmodifiableList(this.D);
        }
        if ((i10 & 32) == 32) {
            this.E = Collections.unmodifiableList(this.E);
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f15892d = dVar.h();
            throw th4;
        }
        this.f15892d = dVar.h();
        m();
    }
}

package ls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class e0 extends rs.m {
    public static final e0 F;
    public static final a G = new a(11);
    public List B;
    public byte D;
    public int E;

    /* renamed from: d, reason: collision with root package name */
    public final rs.e f15763d;

    /* renamed from: g, reason: collision with root package name */
    public int f15764g;

    /* renamed from: r, reason: collision with root package name */
    public l0 f15765r;

    /* renamed from: x, reason: collision with root package name */
    public k0 f15766x;

    /* renamed from: y, reason: collision with root package name */
    public c0 f15767y;

    static {
        e0 e0Var = new e0();
        F = e0Var;
        e0Var.f15765r = l0.f15825x;
        e0Var.f15766x = k0.f15814x;
        e0Var.f15767y = c0.G;
        e0Var.B = Collections.EMPTY_LIST;
    }

    public e0(d0 d0Var) {
        super(d0Var);
        this.D = (byte) -1;
        this.E = -1;
        this.f15763d = d0Var.f21763a;
    }

    @Override // rs.x
    public final rs.b a() {
        return F;
    }

    @Override // rs.x
    public final boolean b() {
        byte b2 = this.D;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.f15764g & 2) == 2 && !this.f15766x.b()) {
            this.D = (byte) 0;
            return false;
        }
        if ((this.f15764g & 4) == 4 && !this.f15767y.b()) {
            this.D = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.B.size(); i10++) {
            if (!((j) this.B.get(i10)).b()) {
                this.D = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.D = (byte) 1;
            return true;
        }
        this.D = (byte) 0;
        return false;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.E;
        if (i10 != -1) {
            return i10;
        }
        int iN = (this.f15764g & 1) == 1 ? b5.m.n(1, this.f15765r) : 0;
        if ((this.f15764g & 2) == 2) {
            iN += b5.m.n(2, this.f15766x);
        }
        if ((this.f15764g & 4) == 4) {
            iN += b5.m.n(3, this.f15767y);
        }
        for (int i11 = 0; i11 < this.B.size(); i11++) {
            iN += b5.m.n(4, (rs.b) this.B.get(i11));
        }
        int size = this.f15763d.size() + j() + iN;
        this.E = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        return d0.h();
    }

    @Override // rs.b
    public final rs.k e() {
        d0 d0VarH = d0.h();
        d0VarH.i(this);
        return d0VarH;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        om.f fVar = new om.f(this);
        if ((this.f15764g & 1) == 1) {
            mVar.O(1, this.f15765r);
        }
        if ((this.f15764g & 2) == 2) {
            mVar.O(2, this.f15766x);
        }
        if ((this.f15764g & 4) == 4) {
            mVar.O(3, this.f15767y);
        }
        for (int i10 = 0; i10 < this.B.size(); i10++) {
            mVar.O(4, (rs.b) this.B.get(i10));
        }
        fVar.y(200, mVar);
        mVar.R(this.f15763d);
    }

    public e0() {
        this.D = (byte) -1;
        this.E = -1;
        this.f15763d = rs.e.f21745a;
    }

    public e0(f5.u uVar, rs.g gVar) {
        this.D = (byte) -1;
        this.E = -1;
        this.f15765r = l0.f15825x;
        this.f15766x = k0.f15814x;
        this.f15767y = c0.G;
        this.B = Collections.EMPTY_LIST;
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        boolean z10 = false;
        char c4 = 0;
        while (!z10) {
            try {
                try {
                    int iT = uVar.t();
                    if (iT != 0) {
                        b0 b0VarH = null;
                        m mVar = null;
                        m mVar2 = null;
                        if (iT == 10) {
                            if ((this.f15764g & 1) == 1) {
                                l0 l0Var = this.f15765r;
                                l0Var.getClass();
                                mVar = new m(3);
                                mVar.f15833r = rs.u.f21777d;
                                mVar.l(l0Var);
                            }
                            l0 l0Var2 = (l0) uVar.m(l0.f15826y, gVar);
                            this.f15765r = l0Var2;
                            if (mVar != null) {
                                mVar.l(l0Var2);
                                this.f15765r = mVar.h();
                            }
                            this.f15764g |= 1;
                        } else if (iT == 18) {
                            if ((this.f15764g & 2) == 2) {
                                k0 k0Var = this.f15766x;
                                k0Var.getClass();
                                mVar2 = new m(1);
                                mVar2.f15833r = Collections.EMPTY_LIST;
                                mVar2.k(k0Var);
                            }
                            k0 k0Var2 = (k0) uVar.m(k0.f15815y, gVar);
                            this.f15766x = k0Var2;
                            if (mVar2 != null) {
                                mVar2.k(k0Var2);
                                this.f15766x = mVar2.g();
                            }
                            this.f15764g |= 2;
                        } else if (iT == 26) {
                            if ((this.f15764g & 4) == 4) {
                                c0 c0Var = this.f15767y;
                                c0Var.getClass();
                                b0VarH = b0.h();
                                b0VarH.i(c0Var);
                            }
                            c0 c0Var2 = (c0) uVar.m(c0.H, gVar);
                            this.f15767y = c0Var2;
                            if (b0VarH != null) {
                                b0VarH.i(c0Var2);
                                this.f15767y = b0VarH.g();
                            }
                            this.f15764g |= 4;
                        } else if (iT != 34) {
                            if (!n(uVar, mVarZ, gVar, iT)) {
                            }
                        } else {
                            int i10 = (c4 == true ? 1 : 0) & '\b';
                            c4 = c4;
                            if (i10 != 8) {
                                this.B = new ArrayList();
                                c4 = '\b';
                            }
                            this.B.add(uVar.m(j.f15794g0, gVar));
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
                if (((c4 == true ? 1 : 0) & '\b') == 8) {
                    this.B = Collections.unmodifiableList(this.B);
                }
                try {
                    mVarZ.x();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f15763d = dVar.h();
                    throw th3;
                }
                this.f15763d = dVar.h();
                m();
                throw th2;
            }
        }
        if (((c4 == true ? 1 : 0) & '\b') == 8) {
            this.B = Collections.unmodifiableList(this.B);
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f15763d = dVar.h();
            throw th4;
        }
        this.f15763d = dVar.h();
        m();
    }
}

package ls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c0 extends rs.m {
    public static final c0 G;
    public static final a H = new a(10);
    public w0 B;
    public d1 D;
    public byte E;
    public int F;

    /* renamed from: d, reason: collision with root package name */
    public final rs.e f15731d;

    /* renamed from: g, reason: collision with root package name */
    public int f15732g;

    /* renamed from: r, reason: collision with root package name */
    public List f15733r;

    /* renamed from: x, reason: collision with root package name */
    public List f15734x;

    /* renamed from: y, reason: collision with root package name */
    public List f15735y;

    static {
        c0 c0Var = new c0();
        G = c0Var;
        List list = Collections.EMPTY_LIST;
        c0Var.f15733r = list;
        c0Var.f15734x = list;
        c0Var.f15735y = list;
        c0Var.B = w0.B;
        c0Var.D = d1.f15751x;
    }

    public c0(b0 b0Var) {
        super(b0Var);
        this.E = (byte) -1;
        this.F = -1;
        this.f15731d = b0Var.f21763a;
    }

    @Override // rs.x
    public final rs.b a() {
        return G;
    }

    @Override // rs.x
    public final boolean b() {
        byte b2 = this.E;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f15733r.size(); i10++) {
            if (!((y) this.f15733r.get(i10)).b()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f15734x.size(); i11++) {
            if (!((g0) this.f15734x.get(i11)).b()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f15735y.size(); i12++) {
            if (!((s0) this.f15735y.get(i12)).b()) {
                this.E = (byte) 0;
                return false;
            }
        }
        if ((this.f15732g & 1) == 1 && !this.B.b()) {
            this.E = (byte) 0;
            return false;
        }
        if (i()) {
            this.E = (byte) 1;
            return true;
        }
        this.E = (byte) 0;
        return false;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.F;
        if (i10 != -1) {
            return i10;
        }
        int iN = 0;
        for (int i11 = 0; i11 < this.f15733r.size(); i11++) {
            iN += b5.m.n(3, (rs.b) this.f15733r.get(i11));
        }
        for (int i12 = 0; i12 < this.f15734x.size(); i12++) {
            iN += b5.m.n(4, (rs.b) this.f15734x.get(i12));
        }
        for (int i13 = 0; i13 < this.f15735y.size(); i13++) {
            iN += b5.m.n(5, (rs.b) this.f15735y.get(i13));
        }
        if ((this.f15732g & 1) == 1) {
            iN += b5.m.n(30, this.B);
        }
        if ((this.f15732g & 2) == 2) {
            iN += b5.m.n(32, this.D);
        }
        int size = this.f15731d.size() + j() + iN;
        this.F = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        return b0.h();
    }

    @Override // rs.b
    public final rs.k e() {
        b0 b0VarH = b0.h();
        b0VarH.i(this);
        return b0VarH;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        om.f fVar = new om.f(this);
        for (int i10 = 0; i10 < this.f15733r.size(); i10++) {
            mVar.O(3, (rs.b) this.f15733r.get(i10));
        }
        for (int i11 = 0; i11 < this.f15734x.size(); i11++) {
            mVar.O(4, (rs.b) this.f15734x.get(i11));
        }
        for (int i12 = 0; i12 < this.f15735y.size(); i12++) {
            mVar.O(5, (rs.b) this.f15735y.get(i12));
        }
        if ((this.f15732g & 1) == 1) {
            mVar.O(30, this.B);
        }
        if ((this.f15732g & 2) == 2) {
            mVar.O(32, this.D);
        }
        fVar.y(200, mVar);
        mVar.R(this.f15731d);
    }

    public c0() {
        this.E = (byte) -1;
        this.F = -1;
        this.f15731d = rs.e.f21745a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public c0(f5.u uVar, rs.g gVar) {
        this.E = (byte) -1;
        this.F = -1;
        List list = Collections.EMPTY_LIST;
        this.f15733r = list;
        this.f15734x = list;
        this.f15735y = list;
        this.B = w0.B;
        this.D = d1.f15751x;
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        boolean z10 = false;
        char c4 = 0;
        while (!z10) {
            try {
                try {
                    int iT = uVar.t();
                    if (iT != 0) {
                        if (iT == 26) {
                            int i10 = (c4 == true ? 1 : 0) & 1;
                            c4 = c4;
                            if (i10 != 1) {
                                this.f15733r = new ArrayList();
                                c4 = (c4 == true ? 1 : 0) | 1;
                            }
                            this.f15733r.add(uVar.m(y.R, gVar));
                        } else if (iT == 34) {
                            int i11 = (c4 == true ? 1 : 0) & 2;
                            c4 = c4;
                            if (i11 != 2) {
                                this.f15734x = new ArrayList();
                                c4 = (c4 == true ? 1 : 0) | 2;
                            }
                            this.f15734x.add(uVar.m(g0.R, gVar));
                        } else if (iT != 42) {
                            m mVar = null;
                            f fVarI = null;
                            if (iT == 242) {
                                if ((this.f15732g & 1) == 1) {
                                    w0 w0Var = this.B;
                                    w0Var.getClass();
                                    fVarI = w0.i(w0Var);
                                }
                                w0 w0Var2 = (w0) uVar.m(w0.D, gVar);
                                this.B = w0Var2;
                                if (fVarI != null) {
                                    fVarI.l(w0Var2);
                                    this.B = fVarI.h();
                                }
                                this.f15732g |= 1;
                            } else if (iT != 258) {
                                if (!n(uVar, mVarZ, gVar, iT)) {
                                }
                            } else {
                                if ((this.f15732g & 2) == 2) {
                                    d1 d1Var = this.D;
                                    d1Var.getClass();
                                    mVar = new m(2);
                                    mVar.f15833r = Collections.EMPTY_LIST;
                                    mVar.m(d1Var);
                                }
                                d1 d1Var2 = (d1) uVar.m(d1.f15752y, gVar);
                                this.D = d1Var2;
                                if (mVar != null) {
                                    mVar.m(d1Var2);
                                    this.D = mVar.i();
                                }
                                this.f15732g |= 2;
                            }
                        } else {
                            int i12 = (c4 == true ? 1 : 0) & 4;
                            c4 = c4;
                            if (i12 != 4) {
                                this.f15735y = new ArrayList();
                                c4 = (c4 == true ? 1 : 0) | 4;
                            }
                            this.f15735y.add(uVar.m(s0.L, gVar));
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
                if (((c4 == true ? 1 : 0) & 1) == 1) {
                    this.f15733r = Collections.unmodifiableList(this.f15733r);
                }
                if (((c4 == true ? 1 : 0) & 2) == 2) {
                    this.f15734x = Collections.unmodifiableList(this.f15734x);
                }
                if (((c4 == true ? 1 : 0) & 4) == 4) {
                    this.f15735y = Collections.unmodifiableList(this.f15735y);
                }
                try {
                    mVarZ.x();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f15731d = dVar.h();
                    throw th3;
                }
                this.f15731d = dVar.h();
                m();
                throw th2;
            }
        }
        if (((c4 == true ? 1 : 0) & 1) == 1) {
            this.f15733r = Collections.unmodifiableList(this.f15733r);
        }
        if (((c4 == true ? 1 : 0) & 2) == 2) {
            this.f15734x = Collections.unmodifiableList(this.f15734x);
        }
        if (((c4 == true ? 1 : 0) & 4) == 4) {
            this.f15735y = Collections.unmodifiableList(this.f15735y);
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f15731d = dVar.h();
            throw th4;
        }
        this.f15731d = dVar.h();
        m();
    }
}

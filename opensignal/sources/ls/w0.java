package ls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class w0 extends rs.p {
    public static final w0 B;
    public static final a D = new a(20);

    /* renamed from: a, reason: collision with root package name */
    public final rs.e f15903a;

    /* renamed from: d, reason: collision with root package name */
    public int f15904d;

    /* renamed from: g, reason: collision with root package name */
    public List f15905g;

    /* renamed from: r, reason: collision with root package name */
    public int f15906r;

    /* renamed from: x, reason: collision with root package name */
    public byte f15907x;

    /* renamed from: y, reason: collision with root package name */
    public int f15908y;

    static {
        w0 w0Var = new w0();
        B = w0Var;
        w0Var.f15905g = Collections.EMPTY_LIST;
        w0Var.f15906r = -1;
    }

    public w0() {
        this.f15907x = (byte) -1;
        this.f15908y = -1;
        this.f15903a = rs.e.f21745a;
    }

    public static f i(w0 w0Var) {
        f fVarI = f.i();
        fVarI.l(w0Var);
        return fVarI;
    }

    @Override // rs.x
    public final boolean b() {
        byte b2 = this.f15907x;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f15905g.size(); i10++) {
            if (!((q0) this.f15905g.get(i10)).b()) {
                this.f15907x = (byte) 0;
                return false;
            }
        }
        this.f15907x = (byte) 1;
        return true;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.f15908y;
        if (i10 != -1) {
            return i10;
        }
        int iL = 0;
        for (int i11 = 0; i11 < this.f15905g.size(); i11++) {
            iL += b5.m.n(1, (rs.b) this.f15905g.get(i11));
        }
        if ((this.f15904d & 1) == 1) {
            iL += b5.m.l(2, this.f15906r);
        }
        int size = this.f15903a.size() + iL;
        this.f15908y = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        return f.i();
    }

    @Override // rs.b
    public final rs.k e() {
        return i(this);
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        for (int i10 = 0; i10 < this.f15905g.size(); i10++) {
            mVar.O(1, (rs.b) this.f15905g.get(i10));
        }
        if ((this.f15904d & 1) == 1) {
            mVar.M(2, this.f15906r);
        }
        mVar.R(this.f15903a);
    }

    public final f j() {
        return i(this);
    }

    public w0(f5.u uVar, rs.g gVar) {
        this.f15907x = (byte) -1;
        this.f15908y = -1;
        this.f15905g = Collections.EMPTY_LIST;
        this.f15906r = -1;
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iT = uVar.t();
                        if (iT != 0) {
                            if (iT == 10) {
                                if (!z11) {
                                    this.f15905g = new ArrayList();
                                    z11 = true;
                                }
                                this.f15905g.add(uVar.m(q0.Q, gVar));
                            } else if (iT != 16) {
                                if (!uVar.w(iT, mVarZ)) {
                                }
                            } else {
                                this.f15904d |= 1;
                                this.f15906r = uVar.q();
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
                if (z11) {
                    this.f15905g = Collections.unmodifiableList(this.f15905g);
                }
                try {
                    mVarZ.x();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f15903a = dVar.h();
                    throw th3;
                }
                this.f15903a = dVar.h();
                throw th2;
            }
        }
        if (z11) {
            this.f15905g = Collections.unmodifiableList(this.f15905g);
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f15903a = dVar.h();
            throw th4;
        }
        this.f15903a = dVar.h();
    }

    public w0(f fVar) {
        this.f15907x = (byte) -1;
        this.f15908y = -1;
        this.f15903a = fVar.f21763a;
    }
}

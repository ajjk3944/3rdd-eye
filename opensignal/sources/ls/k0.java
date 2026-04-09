package ls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k0 extends rs.p {

    /* renamed from: x, reason: collision with root package name */
    public static final k0 f15814x;

    /* renamed from: y, reason: collision with root package name */
    public static final a f15815y = new a(13);

    /* renamed from: a, reason: collision with root package name */
    public final rs.e f15816a;

    /* renamed from: d, reason: collision with root package name */
    public List f15817d;

    /* renamed from: g, reason: collision with root package name */
    public byte f15818g;

    /* renamed from: r, reason: collision with root package name */
    public int f15819r;

    static {
        k0 k0Var = new k0();
        f15814x = k0Var;
        k0Var.f15817d = Collections.EMPTY_LIST;
    }

    public k0() {
        this.f15818g = (byte) -1;
        this.f15819r = -1;
        this.f15816a = rs.e.f21745a;
    }

    @Override // rs.x
    public final boolean b() {
        byte b2 = this.f15818g;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f15817d.size(); i10++) {
            if (!((j0) this.f15817d.get(i10)).b()) {
                this.f15818g = (byte) 0;
                return false;
            }
        }
        this.f15818g = (byte) 1;
        return true;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.f15819r;
        if (i10 != -1) {
            return i10;
        }
        int iN = 0;
        for (int i11 = 0; i11 < this.f15817d.size(); i11++) {
            iN += b5.m.n(1, (rs.b) this.f15817d.get(i11));
        }
        int size = this.f15816a.size() + iN;
        this.f15819r = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        m mVar = new m(1);
        mVar.f15833r = Collections.EMPTY_LIST;
        return mVar;
    }

    @Override // rs.b
    public final rs.k e() {
        m mVar = new m(1);
        mVar.f15833r = Collections.EMPTY_LIST;
        mVar.k(this);
        return mVar;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        for (int i10 = 0; i10 < this.f15817d.size(); i10++) {
            mVar.O(1, (rs.b) this.f15817d.get(i10));
        }
        mVar.R(this.f15816a);
    }

    public k0(f5.u uVar, rs.g gVar) {
        this.f15818g = (byte) -1;
        this.f15819r = -1;
        this.f15817d = Collections.EMPTY_LIST;
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iT = uVar.t();
                    if (iT != 0) {
                        if (iT != 10) {
                            if (!uVar.w(iT, mVarZ)) {
                            }
                        } else {
                            if (!z11) {
                                this.f15817d = new ArrayList();
                                z11 = true;
                            }
                            this.f15817d.add(uVar.m(j0.E, gVar));
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
                    this.f15817d = Collections.unmodifiableList(this.f15817d);
                }
                try {
                    mVarZ.x();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f15816a = dVar.h();
                    throw th3;
                }
                this.f15816a = dVar.h();
                throw th2;
            }
        }
        if (z11) {
            this.f15817d = Collections.unmodifiableList(this.f15817d);
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f15816a = dVar.h();
            throw th4;
        }
        this.f15816a = dVar.h();
    }

    public k0(m mVar) {
        this.f15818g = (byte) -1;
        this.f15819r = -1;
        this.f15816a = mVar.f21763a;
    }
}

package ls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends rs.p {

    /* renamed from: x, reason: collision with root package name */
    public static final n f15838x;

    /* renamed from: y, reason: collision with root package name */
    public static final a f15839y = new a(5);

    /* renamed from: a, reason: collision with root package name */
    public final rs.e f15840a;

    /* renamed from: d, reason: collision with root package name */
    public List f15841d;

    /* renamed from: g, reason: collision with root package name */
    public byte f15842g;

    /* renamed from: r, reason: collision with root package name */
    public int f15843r;

    static {
        n nVar = new n();
        f15838x = nVar;
        nVar.f15841d = Collections.EMPTY_LIST;
    }

    public n() {
        this.f15842g = (byte) -1;
        this.f15843r = -1;
        this.f15840a = rs.e.f21745a;
    }

    @Override // rs.x
    public final boolean b() {
        byte b2 = this.f15842g;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f15841d.size(); i10++) {
            if (!((r) this.f15841d.get(i10)).b()) {
                this.f15842g = (byte) 0;
                return false;
            }
        }
        this.f15842g = (byte) 1;
        return true;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.f15843r;
        if (i10 != -1) {
            return i10;
        }
        int iN = 0;
        for (int i11 = 0; i11 < this.f15841d.size(); i11++) {
            iN += b5.m.n(1, (rs.b) this.f15841d.get(i11));
        }
        int size = this.f15840a.size() + iN;
        this.f15843r = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        m mVar = new m(0);
        mVar.f15833r = Collections.EMPTY_LIST;
        return mVar;
    }

    @Override // rs.b
    public final rs.k e() {
        m mVar = new m(0);
        mVar.f15833r = Collections.EMPTY_LIST;
        mVar.j(this);
        return mVar;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        for (int i10 = 0; i10 < this.f15841d.size(); i10++) {
            mVar.O(1, (rs.b) this.f15841d.get(i10));
        }
        mVar.R(this.f15840a);
    }

    public n(f5.u uVar, rs.g gVar) {
        this.f15842g = (byte) -1;
        this.f15843r = -1;
        this.f15841d = Collections.EMPTY_LIST;
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
                                this.f15841d = new ArrayList();
                                z11 = true;
                            }
                            this.f15841d.add(uVar.m(r.F, gVar));
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
                    this.f15841d = Collections.unmodifiableList(this.f15841d);
                }
                try {
                    mVarZ.x();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f15840a = dVar.h();
                    throw th3;
                }
                this.f15840a = dVar.h();
                throw th2;
            }
        }
        if (z11) {
            this.f15841d = Collections.unmodifiableList(this.f15841d);
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f15840a = dVar.h();
            throw th4;
        }
        this.f15840a = dVar.h();
    }

    public n(m mVar) {
        this.f15842g = (byte) -1;
        this.f15843r = -1;
        this.f15840a = mVar.f21763a;
    }
}

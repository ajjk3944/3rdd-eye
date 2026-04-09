package ls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d1 extends rs.p {

    /* renamed from: x, reason: collision with root package name */
    public static final d1 f15751x;

    /* renamed from: y, reason: collision with root package name */
    public static final a f15752y = new a(23);

    /* renamed from: a, reason: collision with root package name */
    public final rs.e f15753a;

    /* renamed from: d, reason: collision with root package name */
    public List f15754d;

    /* renamed from: g, reason: collision with root package name */
    public byte f15755g;

    /* renamed from: r, reason: collision with root package name */
    public int f15756r;

    static {
        d1 d1Var = new d1();
        f15751x = d1Var;
        d1Var.f15754d = Collections.EMPTY_LIST;
    }

    public d1() {
        this.f15755g = (byte) -1;
        this.f15756r = -1;
        this.f15753a = rs.e.f21745a;
    }

    @Override // rs.x
    public final boolean b() {
        if (this.f15755g == 1) {
            return true;
        }
        this.f15755g = (byte) 1;
        return true;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.f15756r;
        if (i10 != -1) {
            return i10;
        }
        int iN = 0;
        for (int i11 = 0; i11 < this.f15754d.size(); i11++) {
            iN += b5.m.n(1, (rs.b) this.f15754d.get(i11));
        }
        int size = this.f15753a.size() + iN;
        this.f15756r = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        m mVar = new m(2);
        mVar.f15833r = Collections.EMPTY_LIST;
        return mVar;
    }

    @Override // rs.b
    public final rs.k e() {
        m mVar = new m(2);
        mVar.f15833r = Collections.EMPTY_LIST;
        mVar.m(this);
        return mVar;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        for (int i10 = 0; i10 < this.f15754d.size(); i10++) {
            mVar.O(1, (rs.b) this.f15754d.get(i10));
        }
        mVar.R(this.f15753a);
    }

    public final m i() {
        m mVar = new m(2);
        mVar.f15833r = Collections.EMPTY_LIST;
        mVar.m(this);
        return mVar;
    }

    public d1(f5.u uVar, rs.g gVar) {
        this.f15755g = (byte) -1;
        this.f15756r = -1;
        this.f15754d = Collections.EMPTY_LIST;
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
                                this.f15754d = new ArrayList();
                                z11 = true;
                            }
                            this.f15754d.add(uVar.m(c1.H, gVar));
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
                    this.f15754d = Collections.unmodifiableList(this.f15754d);
                }
                try {
                    mVarZ.x();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f15753a = dVar.h();
                    throw th3;
                }
                this.f15753a = dVar.h();
                throw th2;
            }
        }
        if (z11) {
            this.f15754d = Collections.unmodifiableList(this.f15754d);
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f15753a = dVar.h();
            throw th4;
        }
        this.f15753a = dVar.h();
    }

    public d1(m mVar) {
        this.f15755g = (byte) -1;
        this.f15756r = -1;
        this.f15753a = mVar.f21763a;
    }
}

package ls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends rs.p {
    public static final g B;
    public static final a D = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public final rs.e f15775a;

    /* renamed from: d, reason: collision with root package name */
    public int f15776d;

    /* renamed from: g, reason: collision with root package name */
    public int f15777g;

    /* renamed from: r, reason: collision with root package name */
    public List f15778r;

    /* renamed from: x, reason: collision with root package name */
    public byte f15779x;

    /* renamed from: y, reason: collision with root package name */
    public int f15780y;

    static {
        g gVar = new g();
        B = gVar;
        gVar.f15777g = 0;
        gVar.f15778r = Collections.EMPTY_LIST;
    }

    public g() {
        this.f15779x = (byte) -1;
        this.f15780y = -1;
        this.f15775a = rs.e.f21745a;
    }

    @Override // rs.x
    public final boolean b() {
        byte b2 = this.f15779x;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.f15776d & 1) != 1) {
            this.f15779x = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f15778r.size(); i10++) {
            if (!((e) this.f15778r.get(i10)).b()) {
                this.f15779x = (byte) 0;
                return false;
            }
        }
        this.f15779x = (byte) 1;
        return true;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.f15780y;
        if (i10 != -1) {
            return i10;
        }
        int iL = (this.f15776d & 1) == 1 ? b5.m.l(1, this.f15777g) : 0;
        for (int i11 = 0; i11 < this.f15778r.size(); i11++) {
            iL += b5.m.n(2, (rs.b) this.f15778r.get(i11));
        }
        int size = this.f15775a.size() + iL;
        this.f15780y = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        f fVar = new f(0);
        fVar.f15770r = Collections.EMPTY_LIST;
        return fVar;
    }

    @Override // rs.b
    public final rs.k e() {
        f fVar = new f(0);
        fVar.f15770r = Collections.EMPTY_LIST;
        fVar.k(this);
        return fVar;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        if ((this.f15776d & 1) == 1) {
            mVar.M(1, this.f15777g);
        }
        for (int i10 = 0; i10 < this.f15778r.size(); i10++) {
            mVar.O(2, (rs.b) this.f15778r.get(i10));
        }
        mVar.R(this.f15775a);
    }

    public g(f5.u uVar, rs.g gVar) {
        this.f15779x = (byte) -1;
        this.f15780y = -1;
        boolean z10 = false;
        this.f15777g = 0;
        this.f15778r = Collections.EMPTY_LIST;
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        char c4 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iT = uVar.t();
                        if (iT != 0) {
                            if (iT == 8) {
                                this.f15776d |= 1;
                                this.f15777g = uVar.q();
                            } else if (iT != 18) {
                                if (!uVar.w(iT, mVarZ)) {
                                }
                            } else {
                                if ((c4 & 2) != 2) {
                                    this.f15778r = new ArrayList();
                                    c4 = 2;
                                }
                                this.f15778r.add(uVar.m(e.D, gVar));
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
                if ((c4 & 2) == 2) {
                    this.f15778r = Collections.unmodifiableList(this.f15778r);
                }
                try {
                    mVarZ.x();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f15775a = dVar.h();
                    throw th3;
                }
                this.f15775a = dVar.h();
                throw th2;
            }
        }
        if ((c4 & 2) == 2) {
            this.f15778r = Collections.unmodifiableList(this.f15778r);
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f15775a = dVar.h();
            throw th4;
        }
        this.f15775a = dVar.h();
    }

    public g(f fVar) {
        this.f15779x = (byte) -1;
        this.f15780y = -1;
        this.f15775a = fVar.f21763a;
    }
}

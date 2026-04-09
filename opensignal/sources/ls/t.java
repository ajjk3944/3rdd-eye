package ls;

import java.io.IOException;

/* loaded from: classes.dex */
public final class t extends rs.m {
    public static final t B;
    public static final a D = new a(7);

    /* renamed from: d, reason: collision with root package name */
    public final rs.e f15879d;

    /* renamed from: g, reason: collision with root package name */
    public int f15880g;

    /* renamed from: r, reason: collision with root package name */
    public int f15881r;

    /* renamed from: x, reason: collision with root package name */
    public byte f15882x;

    /* renamed from: y, reason: collision with root package name */
    public int f15883y;

    static {
        t tVar = new t();
        B = tVar;
        tVar.f15881r = 0;
    }

    public t(s sVar) {
        super(sVar);
        this.f15882x = (byte) -1;
        this.f15883y = -1;
        this.f15879d = sVar.f21763a;
    }

    @Override // rs.x
    public final rs.b a() {
        return B;
    }

    @Override // rs.x
    public final boolean b() {
        byte b2 = this.f15882x;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (i()) {
            this.f15882x = (byte) 1;
            return true;
        }
        this.f15882x = (byte) 0;
        return false;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.f15883y;
        if (i10 != -1) {
            return i10;
        }
        int size = this.f15879d.size() + j() + ((this.f15880g & 1) == 1 ? b5.m.l(1, this.f15881r) : 0);
        this.f15883y = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        return new s();
    }

    @Override // rs.b
    public final rs.k e() {
        s sVar = new s();
        sVar.g(this);
        return sVar;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        om.f fVar = new om.f(this);
        if ((this.f15880g & 1) == 1) {
            mVar.M(1, this.f15881r);
        }
        fVar.y(200, mVar);
        mVar.R(this.f15879d);
    }

    public t() {
        this.f15882x = (byte) -1;
        this.f15883y = -1;
        this.f15879d = rs.e.f21745a;
    }

    public t(f5.u uVar, rs.g gVar) {
        this.f15882x = (byte) -1;
        this.f15883y = -1;
        boolean z10 = false;
        this.f15881r = 0;
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        while (!z10) {
            try {
                try {
                    int iT = uVar.t();
                    if (iT != 0) {
                        if (iT != 8) {
                            if (!n(uVar, mVarZ, gVar, iT)) {
                            }
                        } else {
                            this.f15880g |= 1;
                            this.f15881r = uVar.q();
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
                    this.f15879d = dVar.h();
                    throw th3;
                }
                this.f15879d = dVar.h();
                m();
                throw th2;
            }
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f15879d = dVar.h();
            throw th4;
        }
        this.f15879d = dVar.h();
        m();
    }
}

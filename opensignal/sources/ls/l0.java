package ls;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l0 extends rs.p {

    /* renamed from: x, reason: collision with root package name */
    public static final l0 f15825x;

    /* renamed from: y, reason: collision with root package name */
    public static final a f15826y = new a(15);

    /* renamed from: a, reason: collision with root package name */
    public final rs.e f15827a;

    /* renamed from: d, reason: collision with root package name */
    public rs.v f15828d;

    /* renamed from: g, reason: collision with root package name */
    public byte f15829g;

    /* renamed from: r, reason: collision with root package name */
    public int f15830r;

    static {
        l0 l0Var = new l0();
        f15825x = l0Var;
        l0Var.f15828d = rs.u.f21777d;
    }

    public l0() {
        this.f15829g = (byte) -1;
        this.f15830r = -1;
        this.f15827a = rs.e.f21745a;
    }

    @Override // rs.x
    public final boolean b() {
        if (this.f15829g == 1) {
            return true;
        }
        this.f15829g = (byte) 1;
        return true;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.f15830r;
        if (i10 != -1) {
            return i10;
        }
        int size = 0;
        for (int i11 = 0; i11 < this.f15828d.size(); i11++) {
            rs.e eVarY = this.f15828d.y(i11);
            size += eVarY.size() + b5.m.p(eVarY.size());
        }
        int size2 = this.f15827a.size() + this.f15828d.size() + size;
        this.f15830r = size2;
        return size2;
    }

    @Override // rs.b
    public final rs.k d() {
        m mVar = new m(3);
        mVar.f15833r = rs.u.f21777d;
        return mVar;
    }

    @Override // rs.b
    public final rs.k e() {
        m mVar = new m(3);
        mVar.f15833r = rs.u.f21777d;
        mVar.l(this);
        return mVar;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        for (int i10 = 0; i10 < this.f15828d.size(); i10++) {
            rs.e eVarY = this.f15828d.y(i10);
            mVar.X(1, 2);
            mVar.V(eVarY.size());
            mVar.R(eVarY);
        }
        mVar.R(this.f15827a);
    }

    public l0(f5.u uVar) {
        this.f15829g = (byte) -1;
        this.f15830r = -1;
        this.f15828d = rs.u.f21777d;
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
                            rs.w wVarK = uVar.k();
                            if (!z11) {
                                this.f15828d = new rs.u();
                                z11 = true;
                            }
                            this.f15828d.h(wVarK);
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
                    this.f15828d = this.f15828d.L();
                }
                try {
                    mVarZ.x();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f15827a = dVar.h();
                    throw th3;
                }
                this.f15827a = dVar.h();
                throw th2;
            }
        }
        if (z11) {
            this.f15828d = this.f15828d.L();
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f15827a = dVar.h();
            throw th4;
        }
        this.f15827a = dVar.h();
    }

    public l0(m mVar) {
        this.f15829g = (byte) -1;
        this.f15830r = -1;
        this.f15827a = mVar.f21763a;
    }
}

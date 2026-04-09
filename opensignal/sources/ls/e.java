package ls;

import java.io.IOException;

/* loaded from: classes.dex */
public final class e extends rs.p {
    public static final e B;
    public static final a D = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final rs.e f15757a;

    /* renamed from: d, reason: collision with root package name */
    public int f15758d;

    /* renamed from: g, reason: collision with root package name */
    public int f15759g;

    /* renamed from: r, reason: collision with root package name */
    public d f15760r;

    /* renamed from: x, reason: collision with root package name */
    public byte f15761x;

    /* renamed from: y, reason: collision with root package name */
    public int f15762y;

    static {
        e eVar = new e();
        B = eVar;
        eVar.f15759g = 0;
        eVar.f15760r = d.L;
    }

    public e() {
        this.f15761x = (byte) -1;
        this.f15762y = -1;
        this.f15757a = rs.e.f21745a;
    }

    @Override // rs.x
    public final boolean b() {
        byte b2 = this.f15761x;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i10 = this.f15758d;
        if ((i10 & 1) != 1) {
            this.f15761x = (byte) 0;
            return false;
        }
        if ((i10 & 2) != 2) {
            this.f15761x = (byte) 0;
            return false;
        }
        if (this.f15760r.b()) {
            this.f15761x = (byte) 1;
            return true;
        }
        this.f15761x = (byte) 0;
        return false;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.f15762y;
        if (i10 != -1) {
            return i10;
        }
        int iL = (this.f15758d & 1) == 1 ? b5.m.l(1, this.f15759g) : 0;
        if ((this.f15758d & 2) == 2) {
            iL += b5.m.n(2, this.f15760r);
        }
        int size = this.f15757a.size() + iL;
        this.f15762y = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        f fVar = new f(2);
        fVar.f15770r = d.L;
        return fVar;
    }

    @Override // rs.b
    public final rs.k e() {
        f fVar = new f(2);
        fVar.f15770r = d.L;
        fVar.j(this);
        return fVar;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        if ((this.f15758d & 1) == 1) {
            mVar.M(1, this.f15759g);
        }
        if ((this.f15758d & 2) == 2) {
            mVar.O(2, this.f15760r);
        }
        mVar.R(this.f15757a);
    }

    public e(f5.u uVar, rs.g gVar) {
        b bVarG;
        this.f15761x = (byte) -1;
        this.f15762y = -1;
        boolean z10 = false;
        this.f15759g = 0;
        this.f15760r = d.L;
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        while (!z10) {
            try {
                try {
                    try {
                        int iT = uVar.t();
                        if (iT != 0) {
                            if (iT == 8) {
                                this.f15758d |= 1;
                                this.f15759g = uVar.q();
                            } else if (iT != 18) {
                                if (!uVar.w(iT, mVarZ)) {
                                }
                            } else {
                                if ((this.f15758d & 2) == 2) {
                                    d dVar2 = this.f15760r;
                                    dVar2.getClass();
                                    bVarG = b.g();
                                    bVarG.h(dVar2);
                                } else {
                                    bVarG = null;
                                }
                                d dVar3 = (d) uVar.m(d.M, gVar);
                                this.f15760r = dVar3;
                                if (bVarG != null) {
                                    bVarG.h(dVar3);
                                    this.f15760r = bVarG.f();
                                }
                                this.f15758d |= 2;
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
                try {
                    mVarZ.x();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f15757a = dVar.h();
                    throw th3;
                }
                this.f15757a = dVar.h();
                throw th2;
            }
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f15757a = dVar.h();
            throw th4;
        }
        this.f15757a = dVar.h();
    }

    public e(f fVar) {
        this.f15761x = (byte) -1;
        this.f15762y = -1;
        this.f15757a = fVar.f21763a;
    }
}

package os;

import b5.m;
import f5.u;
import java.io.IOException;
import rs.p;
import rs.t;

/* loaded from: classes.dex */
public final class c extends p {
    public static final c B;
    public static final ls.a D = new ls.a(25);

    /* renamed from: a, reason: collision with root package name */
    public final rs.e f19741a;

    /* renamed from: d, reason: collision with root package name */
    public int f19742d;

    /* renamed from: g, reason: collision with root package name */
    public int f19743g;

    /* renamed from: r, reason: collision with root package name */
    public int f19744r;

    /* renamed from: x, reason: collision with root package name */
    public byte f19745x;

    /* renamed from: y, reason: collision with root package name */
    public int f19746y;

    static {
        c cVar = new c();
        B = cVar;
        cVar.f19743g = 0;
        cVar.f19744r = 0;
    }

    public c() {
        this.f19745x = (byte) -1;
        this.f19746y = -1;
        this.f19741a = rs.e.f21745a;
    }

    public static a i(c cVar) {
        a aVar = new a(1);
        aVar.i(cVar);
        return aVar;
    }

    @Override // rs.x
    public final boolean b() {
        if (this.f19745x == 1) {
            return true;
        }
        this.f19745x = (byte) 1;
        return true;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.f19746y;
        if (i10 != -1) {
            return i10;
        }
        int iL = (this.f19742d & 1) == 1 ? m.l(1, this.f19743g) : 0;
        if ((this.f19742d & 2) == 2) {
            iL += m.l(2, this.f19744r);
        }
        int size = this.f19741a.size() + iL;
        this.f19746y = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        return new a(1);
    }

    @Override // rs.b
    public final rs.k e() {
        return i(this);
    }

    @Override // rs.b
    public final void f(m mVar) throws IOException {
        c();
        if ((this.f19742d & 1) == 1) {
            mVar.M(1, this.f19743g);
        }
        if ((this.f19742d & 2) == 2) {
            mVar.M(2, this.f19744r);
        }
        mVar.R(this.f19741a);
    }

    public c(u uVar) {
        this.f19745x = (byte) -1;
        this.f19746y = -1;
        boolean z10 = false;
        this.f19743g = 0;
        this.f19744r = 0;
        rs.d dVar = new rs.d();
        m mVarZ = m.z(dVar, 1);
        while (!z10) {
            try {
                try {
                    int iT = uVar.t();
                    if (iT != 0) {
                        if (iT == 8) {
                            this.f19742d |= 1;
                            this.f19743g = uVar.q();
                        } else if (iT != 16) {
                            if (!uVar.w(iT, mVarZ)) {
                            }
                        } else {
                            this.f19742d |= 2;
                            this.f19744r = uVar.q();
                        }
                    }
                    z10 = true;
                } catch (t e4) {
                    e4.f21776a = this;
                    throw e4;
                } catch (IOException e10) {
                    t tVar = new t(e10.getMessage());
                    tVar.f21776a = this;
                    throw tVar;
                }
            } catch (Throwable th2) {
                try {
                    mVarZ.x();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f19741a = dVar.h();
                    throw th3;
                }
                this.f19741a = dVar.h();
                throw th2;
            }
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f19741a = dVar.h();
            throw th4;
        }
        this.f19741a = dVar.h();
    }

    public c(a aVar) {
        this.f19745x = (byte) -1;
        this.f19746y = -1;
        this.f19741a = aVar.f21763a;
    }
}

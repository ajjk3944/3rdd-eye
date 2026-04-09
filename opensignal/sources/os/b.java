package os;

import b5.m;
import f5.u;
import java.io.IOException;
import rs.p;
import rs.t;

/* loaded from: classes.dex */
public final class b extends p {
    public static final b B;
    public static final ls.a D = new ls.a(24);

    /* renamed from: a, reason: collision with root package name */
    public final rs.e f19735a;

    /* renamed from: d, reason: collision with root package name */
    public int f19736d;

    /* renamed from: g, reason: collision with root package name */
    public int f19737g;

    /* renamed from: r, reason: collision with root package name */
    public int f19738r;

    /* renamed from: x, reason: collision with root package name */
    public byte f19739x;

    /* renamed from: y, reason: collision with root package name */
    public int f19740y;

    static {
        b bVar = new b();
        B = bVar;
        bVar.f19737g = 0;
        bVar.f19738r = 0;
    }

    public b() {
        this.f19739x = (byte) -1;
        this.f19740y = -1;
        this.f19735a = rs.e.f21745a;
    }

    @Override // rs.x
    public final boolean b() {
        if (this.f19739x == 1) {
            return true;
        }
        this.f19739x = (byte) 1;
        return true;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.f19740y;
        if (i10 != -1) {
            return i10;
        }
        int iL = (this.f19736d & 1) == 1 ? m.l(1, this.f19737g) : 0;
        if ((this.f19736d & 2) == 2) {
            iL += m.l(2, this.f19738r);
        }
        int size = this.f19735a.size() + iL;
        this.f19740y = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        return new a(0);
    }

    @Override // rs.b
    public final rs.k e() {
        a aVar = new a(0);
        aVar.h(this);
        return aVar;
    }

    @Override // rs.b
    public final void f(m mVar) throws IOException {
        c();
        if ((this.f19736d & 1) == 1) {
            mVar.M(1, this.f19737g);
        }
        if ((this.f19736d & 2) == 2) {
            mVar.M(2, this.f19738r);
        }
        mVar.R(this.f19735a);
    }

    public b(u uVar) {
        this.f19739x = (byte) -1;
        this.f19740y = -1;
        boolean z10 = false;
        this.f19737g = 0;
        this.f19738r = 0;
        rs.d dVar = new rs.d();
        m mVarZ = m.z(dVar, 1);
        while (!z10) {
            try {
                try {
                    int iT = uVar.t();
                    if (iT != 0) {
                        if (iT == 8) {
                            this.f19736d |= 1;
                            this.f19737g = uVar.q();
                        } else if (iT != 16) {
                            if (!uVar.w(iT, mVarZ)) {
                            }
                        } else {
                            this.f19736d |= 2;
                            this.f19738r = uVar.q();
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
                    this.f19735a = dVar.h();
                    throw th3;
                }
                this.f19735a = dVar.h();
                throw th2;
            }
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f19735a = dVar.h();
            throw th4;
        }
        this.f19735a = dVar.h();
    }

    public b(a aVar) {
        this.f19739x = (byte) -1;
        this.f19740y = -1;
        this.f19735a = aVar.f21763a;
    }
}

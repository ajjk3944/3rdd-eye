package o4;

import A4.A;
import A4.C;
import A4.I;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final C.b f55291a;

    private o(C.b bVar) {
        this.f55291a = bVar;
    }

    private synchronized C.c c(A4.y yVar, I i10) {
        int iG;
        iG = g();
        if (i10 == I.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (C.c) C.c.d0().t(yVar).u(iG).x(A4.z.ENABLED).w(i10).i();
    }

    private synchronized boolean e(int i10) {
        Iterator it = this.f55291a.x().iterator();
        while (it.hasNext()) {
            if (((C.c) it.next()).Z() == i10) {
                return true;
            }
        }
        return false;
    }

    private synchronized C.c f(A a10) {
        return c(x.k(a10), a10.Y());
    }

    private synchronized int g() {
        int iC;
        iC = v4.s.c();
        while (e(iC)) {
            iC = v4.s.c();
        }
        return iC;
    }

    public static o i() {
        return new o(C.c0());
    }

    public static o j(n nVar) {
        return new o((C.b) nVar.h().S());
    }

    public synchronized o a(l lVar) {
        b(lVar.b(), false);
        return this;
    }

    public synchronized int b(A a10, boolean z10) {
        C.c cVarF;
        try {
            cVarF = f(a10);
            this.f55291a.t(cVarF);
            if (z10) {
                this.f55291a.z(cVarF.Z());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return cVarF.Z();
    }

    public synchronized n d() {
        return n.e((C) this.f55291a.i());
    }

    public synchronized o h(int i10) {
        for (int i11 = 0; i11 < this.f55291a.w(); i11++) {
            C.c cVarU = this.f55291a.u(i11);
            if (cVarU.Z() == i10) {
                if (!cVarU.b0().equals(A4.z.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i10);
                }
                this.f55291a.z(i10);
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
        return this;
    }
}

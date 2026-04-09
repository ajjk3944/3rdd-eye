package y0;

import o.C7007F;
import o.C7028t;

/* renamed from: y0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8591l {

    /* renamed from: b, reason: collision with root package name */
    public static final int f66300b = V.b.f22937d;

    /* renamed from: a, reason: collision with root package name */
    private final V.b f66301a = new V.b(new C8590k[16], 0);

    public boolean a(C7028t c7028t, C0.r rVar, C8585f c8585f, boolean z10) {
        V.b bVar = this.f66301a;
        int iO = bVar.o();
        if (iO <= 0) {
            return false;
        }
        Object[] objArrM = bVar.m();
        int i10 = 0;
        boolean z11 = false;
        do {
            z11 = ((C8590k) objArrM[i10]).a(c7028t, rVar, c8585f, z10) || z11;
            i10++;
        } while (i10 < iO);
        return z11;
    }

    public void b(C8585f c8585f) {
        int iO = this.f66301a.o();
        while (true) {
            iO--;
            if (-1 >= iO) {
                return;
            }
            if (((C8590k) this.f66301a.m()[iO]).l().g()) {
                this.f66301a.z(iO);
            }
        }
    }

    public final void c() {
        this.f66301a.h();
    }

    public void d() {
        V.b bVar = this.f66301a;
        int iO = bVar.o();
        if (iO > 0) {
            Object[] objArrM = bVar.m();
            int i10 = 0;
            do {
                ((C8590k) objArrM[i10]).d();
                i10++;
            } while (i10 < iO);
        }
    }

    public boolean e(C8585f c8585f) {
        V.b bVar = this.f66301a;
        int iO = bVar.o();
        boolean z10 = false;
        if (iO > 0) {
            Object[] objArrM = bVar.m();
            int i10 = 0;
            boolean z11 = false;
            do {
                z11 = ((C8590k) objArrM[i10]).e(c8585f) || z11;
                i10++;
            } while (i10 < iO);
            z10 = z11;
        }
        b(c8585f);
        return z10;
    }

    public boolean f(C7028t c7028t, C0.r rVar, C8585f c8585f, boolean z10) {
        V.b bVar = this.f66301a;
        int iO = bVar.o();
        if (iO <= 0) {
            return false;
        }
        Object[] objArrM = bVar.m();
        int i10 = 0;
        boolean z11 = false;
        do {
            z11 = ((C8590k) objArrM[i10]).f(c7028t, rVar, c8585f, z10) || z11;
            i10++;
        } while (i10 < iO);
        return z11;
    }

    public final V.b g() {
        return this.f66301a;
    }

    public final void h() {
        int i10 = 0;
        while (i10 < this.f66301a.o()) {
            C8590k c8590k = (C8590k) this.f66301a.m()[i10];
            if (c8590k.k().k2()) {
                i10++;
                c8590k.h();
            } else {
                c8590k.d();
                this.f66301a.z(i10);
            }
        }
    }

    public void i(long j10, C7007F c7007f) {
        V.b bVar = this.f66301a;
        int iO = bVar.o();
        if (iO > 0) {
            Object[] objArrM = bVar.m();
            int i10 = 0;
            do {
                ((C8590k) objArrM[i10]).i(j10, c7007f);
                i10++;
            } while (i10 < iO);
        }
    }
}

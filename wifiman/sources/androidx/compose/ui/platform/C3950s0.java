package androidx.compose.ui.platform;

import Q0.v;
import Q0.w;
import Y0.v;
import Y0.x;
import android.os.Parcel;
import android.util.Base64;
import l0.C6531g;
import m0.C6733v0;

/* renamed from: androidx.compose.ui.platform.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3950s0 {

    /* renamed from: a, reason: collision with root package name */
    private Parcel f29586a = Parcel.obtain();

    public final void a(byte b10) {
        this.f29586a.writeByte(b10);
    }

    public final void b(float f10) {
        this.f29586a.writeFloat(f10);
    }

    public final void c(int i10) {
        this.f29586a.writeInt(i10);
    }

    public final void d(L0.D d10) {
        long jG = d10.g();
        C6733v0.a aVar = C6733v0.f52951b;
        if (!C6733v0.m(jG, aVar.e())) {
            a((byte) 1);
            m(d10.g());
        }
        long jK = d10.k();
        v.a aVar2 = Y0.v.f24549b;
        if (!Y0.v.e(jK, aVar2.a())) {
            a((byte) 2);
            j(d10.k());
        }
        Q0.A aN = d10.n();
        if (aN != null) {
            a((byte) 3);
            e(aN);
        }
        Q0.v vVarL = d10.l();
        if (vVarL != null) {
            int i10 = vVarL.i();
            a((byte) 4);
            o(i10);
        }
        Q0.w wVarM = d10.m();
        if (wVarM != null) {
            int iM = wVarM.m();
            a((byte) 5);
            l(iM);
        }
        String strJ = d10.j();
        if (strJ != null) {
            a((byte) 6);
            h(strJ);
        }
        if (!Y0.v.e(d10.o(), aVar2.a())) {
            a((byte) 7);
            j(d10.o());
        }
        W0.a aVarE = d10.e();
        if (aVarE != null) {
            float fH = aVarE.h();
            a((byte) 8);
            k(fH);
        }
        W0.o oVarU = d10.u();
        if (oVarU != null) {
            a((byte) 9);
            g(oVarU);
        }
        if (!C6733v0.m(d10.d(), aVar.e())) {
            a((byte) 10);
            m(d10.d());
        }
        W0.k kVarS = d10.s();
        if (kVarS != null) {
            a((byte) 11);
            f(kVarS);
        }
        m0.g1 g1VarR = d10.r();
        if (g1VarR != null) {
            a((byte) 12);
            i(g1VarR);
        }
    }

    public final void e(Q0.A a10) {
        c(a10.p());
    }

    public final void f(W0.k kVar) {
        c(kVar.e());
    }

    public final void g(W0.o oVar) {
        b(oVar.b());
        b(oVar.c());
    }

    public final void h(String str) {
        this.f29586a.writeString(str);
    }

    public final void i(m0.g1 g1Var) {
        m(g1Var.c());
        b(C6531g.m(g1Var.d()));
        b(C6531g.n(g1Var.d()));
        b(g1Var.b());
    }

    public final void j(long j10) {
        long jG = Y0.v.g(j10);
        x.a aVar = Y0.x.f24553b;
        byte b10 = 0;
        if (!Y0.x.g(jG, aVar.c())) {
            if (Y0.x.g(jG, aVar.b())) {
                b10 = 1;
            } else if (Y0.x.g(jG, aVar.a())) {
                b10 = 2;
            }
        }
        a(b10);
        if (Y0.x.g(Y0.v.g(j10), aVar.c())) {
            return;
        }
        b(Y0.v.h(j10));
    }

    public final void k(float f10) {
        b(f10);
    }

    public final void l(int i10) {
        w.a aVar = Q0.w.f19104b;
        byte b10 = 0;
        if (!Q0.w.h(i10, aVar.b())) {
            if (Q0.w.h(i10, aVar.a())) {
                b10 = 1;
            } else if (Q0.w.h(i10, aVar.d())) {
                b10 = 2;
            } else if (Q0.w.h(i10, aVar.c())) {
                b10 = 3;
            }
        }
        a(b10);
    }

    public final void m(long j10) {
        n(j10);
    }

    public final void n(long j10) {
        this.f29586a.writeLong(j10);
    }

    public final void o(int i10) {
        v.a aVar = Q0.v.f19100b;
        byte b10 = 0;
        if (!Q0.v.f(i10, aVar.b()) && Q0.v.f(i10, aVar.a())) {
            b10 = 1;
        }
        a(b10);
    }

    public final String p() {
        return Base64.encodeToString(this.f29586a.marshall(), 0);
    }

    public final void q() {
        this.f29586a.recycle();
        this.f29586a = Parcel.obtain();
    }
}

package U0;

import L0.D;
import Q0.A;
import Q0.AbstractC3434k;
import Q0.w;
import T0.g;
import W0.o;
import W0.s;
import Y0.v;
import Y0.x;
import android.graphics.Typeface;
import kotlin.jvm.internal.AbstractC6492s;
import l0.C6537m;
import m0.C6733v0;
import mh.r;

/* loaded from: classes.dex */
public abstract class d {
    public static final D a(g gVar, D d10, r rVar, Y0.d dVar, boolean z10) {
        long jG = v.g(d10.k());
        x.a aVar = x.f24553b;
        if (x.g(jG, aVar.b())) {
            gVar.setTextSize(dVar.N1(d10.k()));
        } else if (x.g(jG, aVar.a())) {
            gVar.setTextSize(gVar.getTextSize() * v.h(d10.k()));
        }
        if (d(d10)) {
            AbstractC3434k abstractC3434kI = d10.i();
            A aN = d10.n();
            if (aN == null) {
                aN = A.f18971b.e();
            }
            Q0.v vVarL = d10.l();
            Q0.v vVarC = Q0.v.c(vVarL != null ? vVarL.i() : Q0.v.f19100b.b());
            w wVarM = d10.m();
            gVar.setTypeface((Typeface) rVar.y(abstractC3434kI, aN, vVarC, w.e(wVarM != null ? wVarM.m() : w.f19104b.a())));
        }
        if (d10.p() != null && !AbstractC6492s.d(d10.p(), S0.e.f20216c.a())) {
            a.f22115a.b(gVar, d10.p());
        }
        if (d10.j() != null && !AbstractC6492s.d(d10.j(), "")) {
            gVar.setFontFeatureSettings(d10.j());
        }
        if (d10.u() != null && !AbstractC6492s.d(d10.u(), o.f23550c.a())) {
            gVar.setTextScaleX(gVar.getTextScaleX() * d10.u().b());
            gVar.setTextSkewX(gVar.getTextSkewX() + d10.u().c());
        }
        gVar.f(d10.g());
        gVar.e(d10.f(), C6537m.f52356b.a(), d10.c());
        gVar.h(d10.r());
        gVar.i(d10.s());
        gVar.g(d10.h());
        if (x.g(v.g(d10.o()), aVar.b()) && v.h(d10.o()) != 0.0f) {
            float textSize = gVar.getTextSize() * gVar.getTextScaleX();
            float fN1 = dVar.N1(d10.o());
            if (textSize != 0.0f) {
                gVar.setLetterSpacing(fN1 / textSize);
            }
        } else if (x.g(v.g(d10.o()), aVar.a())) {
            gVar.setLetterSpacing(v.h(d10.o()));
        }
        return c(d10.o(), z10, d10.d(), d10.e());
    }

    public static final float b(float f10) {
        if (f10 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f10;
    }

    private static final D c(long j10, boolean z10, long j11, W0.a aVar) {
        long jE = j11;
        boolean z11 = false;
        boolean z12 = z10 && x.g(v.g(j10), x.f24553b.b()) && v.h(j10) != 0.0f;
        C6733v0.a aVar2 = C6733v0.f52951b;
        boolean z13 = (C6733v0.m(jE, aVar2.e()) || C6733v0.m(jE, aVar2.d())) ? false : true;
        if (aVar != null) {
            if (!W0.a.e(aVar.h(), W0.a.f23475b.a())) {
                z11 = true;
            }
        }
        if (!z12 && !z13 && !z11) {
            return null;
        }
        long jA = z12 ? j10 : v.f24549b.a();
        if (!z13) {
            jE = aVar2.e();
        }
        return new D(0L, 0L, null, null, null, null, null, jA, z11 ? aVar : null, null, null, jE, null, null, null, null, 63103, null);
    }

    public static final boolean d(D d10) {
        return (d10.i() == null && d10.l() == null && d10.n() == null) ? false : true;
    }

    public static final void e(g gVar, s sVar) {
        if (sVar == null) {
            sVar = s.f23558c.a();
        }
        gVar.setFlags(sVar.c() ? gVar.getFlags() | 128 : gVar.getFlags() & (-129));
        int iB = sVar.b();
        s.b.a aVar = s.b.f23563a;
        if (s.b.e(iB, aVar.b())) {
            gVar.setFlags(gVar.getFlags() | 64);
            gVar.setHinting(0);
        } else if (s.b.e(iB, aVar.a())) {
            gVar.getFlags();
            gVar.setHinting(1);
        } else if (!s.b.e(iB, aVar.c())) {
            gVar.getFlags();
        } else {
            gVar.getFlags();
            gVar.setHinting(0);
        }
    }
}

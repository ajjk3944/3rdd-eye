package C0;

import E0.AbstractC2624c0;
import l0.AbstractC6532h;
import l0.C6531g;
import l0.C6533i;

/* renamed from: C0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2538s {
    public static final C6533i a(r rVar) {
        C6533i c6533iC0;
        r rVarA0 = rVar.a0();
        return (rVarA0 == null || (c6533iC0 = r.c0(rVarA0, rVar, false, 2, null)) == null) ? new C6533i(0.0f, 0.0f, Y0.r.g(rVar.h()), Y0.r.f(rVar.h())) : c6533iC0;
    }

    public static final C6533i b(r rVar) {
        return r.c0(d(rVar), rVar, false, 2, null);
    }

    public static final C6533i c(r rVar) {
        r rVarD = d(rVar);
        float fG = Y0.r.g(rVarD.h());
        float f10 = Y0.r.f(rVarD.h());
        C6533i c6533iB = b(rVar);
        float fK = c6533iB.k();
        if (fK < 0.0f) {
            fK = 0.0f;
        }
        if (fK > fG) {
            fK = fG;
        }
        float fN = c6533iB.n();
        if (fN < 0.0f) {
            fN = 0.0f;
        }
        if (fN > f10) {
            fN = f10;
        }
        float fL = c6533iB.l();
        if (fL < 0.0f) {
            fL = 0.0f;
        }
        if (fL <= fG) {
            fG = fL;
        }
        float fE = c6533iB.e();
        float f11 = fE >= 0.0f ? fE : 0.0f;
        if (f11 <= f10) {
            f10 = f11;
        }
        if (fK == fG || fN == f10) {
            return C6533i.f52340e.a();
        }
        long jA = rVarD.A(AbstractC6532h.a(fK, fN));
        long jA2 = rVarD.A(AbstractC6532h.a(fG, fN));
        long jA3 = rVarD.A(AbstractC6532h.a(fG, f10));
        long jA4 = rVarD.A(AbstractC6532h.a(fK, f10));
        float fM = C6531g.m(jA);
        float fM2 = C6531g.m(jA2);
        float fM3 = C6531g.m(jA4);
        float fM4 = C6531g.m(jA3);
        float fMin = Math.min(fM, Math.min(fM2, Math.min(fM3, fM4)));
        float fMax = Math.max(fM, Math.max(fM2, Math.max(fM3, fM4)));
        float fN2 = C6531g.n(jA);
        float fN3 = C6531g.n(jA2);
        float fN4 = C6531g.n(jA4);
        float fN5 = C6531g.n(jA3);
        return new C6533i(fMin, Math.min(fN2, Math.min(fN3, Math.min(fN4, fN5))), fMax, Math.max(fN2, Math.max(fN3, Math.max(fN4, fN5))));
    }

    public static final r d(r rVar) {
        r rVar2;
        r rVarA0 = rVar.a0();
        while (true) {
            r rVar3 = rVarA0;
            rVar2 = rVar;
            rVar = rVar3;
            if (rVar == null) {
                break;
            }
            rVarA0 = rVar.a0();
        }
        AbstractC2624c0 abstractC2624c0 = rVar2 instanceof AbstractC2624c0 ? (AbstractC2624c0) rVar2 : null;
        if (abstractC2624c0 == null) {
            return rVar2;
        }
        AbstractC2624c0 abstractC2624c0I2 = abstractC2624c0.I2();
        while (true) {
            AbstractC2624c0 abstractC2624c02 = abstractC2624c0I2;
            AbstractC2624c0 abstractC2624c03 = abstractC2624c0;
            abstractC2624c0 = abstractC2624c02;
            if (abstractC2624c0 == null) {
                return abstractC2624c03;
            }
            abstractC2624c0I2 = abstractC2624c0.I2();
        }
    }

    public static final long e(r rVar) {
        return rVar.o0(C6531g.f52335b.c());
    }

    public static final long f(r rVar) {
        return rVar.A(C6531g.f52335b.c());
    }
}

package n0;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.AbstractC6857b;
import n0.C6863h;

/* renamed from: n0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6859d {
    public static final double a(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(o(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static final double b(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(q(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static final AbstractC6858c c(AbstractC6858c abstractC6858c, z zVar, AbstractC6856a abstractC6856a) {
        if (!AbstractC6857b.e(abstractC6858c.e(), AbstractC6857b.f54104a.b())) {
            return abstractC6858c;
        }
        AbstractC6492s.g(abstractC6858c, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        x xVar = (x) abstractC6858c;
        if (f(xVar.N(), zVar)) {
            return abstractC6858c;
        }
        return new x(xVar, l(e(abstractC6856a.b(), xVar.N().c(), zVar.c()), xVar.M()), zVar);
    }

    public static /* synthetic */ AbstractC6858c d(AbstractC6858c abstractC6858c, z zVar, AbstractC6856a abstractC6856a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            abstractC6856a = AbstractC6856a.f54099b.a();
        }
        return c(abstractC6858c, zVar, abstractC6856a);
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrN = n(fArr, fArr2);
        float[] fArrN2 = n(fArr, fArr3);
        return l(k(fArr), m(new float[]{fArrN2[0] / fArrN[0], fArrN2[1] / fArrN[1], fArrN2[2] / fArrN[2]}, fArr));
    }

    public static final boolean f(z zVar, z zVar2) {
        if (zVar == zVar2) {
            return true;
        }
        return Math.abs(zVar.a() - zVar2.a()) < 0.001f && Math.abs(zVar.b() - zVar2.b()) < 0.001f;
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Float.compare(fArr[i10], fArr2[i10]) != 0 && Math.abs(fArr[i10] - fArr2[i10]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final C6863h h(AbstractC6858c abstractC6858c, AbstractC6858c abstractC6858c2, int i10) {
        int iB = abstractC6858c.b();
        int iB2 = abstractC6858c2.b();
        if ((iB | iB2) < 0) {
            return j(abstractC6858c, abstractC6858c2, i10);
        }
        o.z zVarA = AbstractC6864i.a();
        int i11 = iB | (iB2 << 6) | (i10 << 12);
        Object objC = zVarA.c(i11);
        if (objC == null) {
            objC = j(abstractC6858c, abstractC6858c2, i10);
            zVarA.t(i11, objC);
        }
        return (C6863h) objC;
    }

    public static /* synthetic */ C6863h i(AbstractC6858c abstractC6858c, AbstractC6858c abstractC6858c2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC6858c2 = C6862g.f54113a.w();
        }
        if ((i11 & 2) != 0) {
            i10 = n.f54165a.b();
        }
        return h(abstractC6858c, abstractC6858c2, i10);
    }

    private static final C6863h j(AbstractC6858c abstractC6858c, AbstractC6858c abstractC6858c2, int i10) {
        C6863h c6863h;
        if (abstractC6858c == abstractC6858c2) {
            return C6863h.f54137g.c(abstractC6858c);
        }
        long jE = abstractC6858c.e();
        AbstractC6857b.a aVar = AbstractC6857b.f54104a;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (AbstractC6857b.e(jE, aVar.b()) && AbstractC6857b.e(abstractC6858c2.e(), aVar.b())) {
            AbstractC6492s.g(abstractC6858c, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            AbstractC6492s.g(abstractC6858c2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            c6863h = new C6863h.b((x) abstractC6858c, (x) abstractC6858c2, i10, defaultConstructorMarker);
        } else {
            c6863h = new C6863h(abstractC6858c, abstractC6858c2, i10, defaultConstructorMarker);
        }
        return c6863h;
    }

    public static final float[] k(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = fArr[2];
        float f17 = fArr[5];
        float f18 = fArr[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f10 * f19) + (f11 * f20) + (f12 * f21);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f19 / f22;
        fArr2[1] = f20 / f22;
        fArr2[2] = f21 / f22;
        fArr2[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr2[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr2[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr2[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr2[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr2[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr2;
    }

    public static final float[] l(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0];
        float f12 = fArr[3];
        float f13 = fArr2[1];
        float f14 = fArr[6];
        float f15 = fArr2[2];
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = fArr[1];
        float f18 = fArr[4];
        float f19 = fArr[7];
        float f20 = (f17 * f11) + (f18 * f13) + (f19 * f15);
        float f21 = fArr[2];
        float f22 = fArr[5];
        float f23 = fArr[8];
        float f24 = (f11 * f21) + (f13 * f22) + (f15 * f23);
        float f25 = fArr2[3];
        float f26 = fArr2[4];
        float f27 = fArr2[5];
        float f28 = (f10 * f25) + (f12 * f26) + (f14 * f27);
        float f29 = (f17 * f25) + (f18 * f26) + (f19 * f27);
        float f30 = (f25 * f21) + (f26 * f22) + (f27 * f23);
        float f31 = fArr2[6];
        float f32 = fArr2[7];
        float f33 = (f10 * f31) + (f12 * f32);
        float f34 = fArr2[8];
        return new float[]{f16, f20, f24, f28, f29, f30, f33 + (f14 * f34), (f17 * f31) + (f18 * f32) + (f19 * f34), (f21 * f31) + (f22 * f32) + (f23 * f34)};
    }

    public static final float[] m(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0] * f10;
        float f12 = fArr[1];
        float f13 = fArr2[1] * f12;
        float f14 = fArr[2];
        return new float[]{f11, f13, fArr2[2] * f14, fArr2[3] * f10, fArr2[4] * f12, fArr2[5] * f14, f10 * fArr2[6], f12 * fArr2[7], f14 * fArr2[8]};
    }

    public static final float[] n(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12);
        fArr2[1] = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12);
        fArr2[2] = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
        return fArr2;
    }

    public static final double o(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 * d13 ? (Math.pow(d10, 1.0d / d15) - d12) / d11 : d10 / d13;
    }

    public static final double p(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 * d13 ? (Math.pow(d10 - d15, 1.0d / d17) - d12) / d11 : (d10 - d16) / d13;
    }

    public static final double q(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d15) : d10 * d13;
    }

    public static final double r(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d17) + d15 : (d13 * d10) + d16;
    }
}

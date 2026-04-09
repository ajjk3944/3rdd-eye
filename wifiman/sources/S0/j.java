package s0;

import java.util.List;
import m0.U0;
import s0.AbstractC7871g;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final float[] f60956a = new float[0];

    private static final void a(U0 u02, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        double d19 = d12;
        double d20 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d18 * d20) / 3.141592653589793d));
        double dCos = Math.cos(d16);
        double dSin = Math.sin(d16);
        double dCos2 = Math.cos(d17);
        double dSin2 = Math.sin(d17);
        double d21 = -d19;
        double d22 = d21 * dCos;
        double d23 = d13 * dSin;
        double d24 = (d22 * dSin2) - (d23 * dCos2);
        double d25 = d21 * dSin;
        double d26 = d13 * dCos;
        double d27 = (dSin2 * d25) + (dCos2 * d26);
        double d28 = d18 / iCeil;
        double d29 = d14;
        double d30 = d27;
        double d31 = d24;
        int i10 = 0;
        double d32 = d15;
        double d33 = d17;
        while (i10 < iCeil) {
            double d34 = d33 + d28;
            double dSin3 = Math.sin(d34);
            double dCos3 = Math.cos(d34);
            int i11 = iCeil;
            double d35 = (d10 + ((d19 * dCos) * dCos3)) - (d23 * dSin3);
            double d36 = d11 + (d19 * dSin * dCos3) + (d26 * dSin3);
            double d37 = (d22 * dSin3) - (d23 * dCos3);
            double d38 = (dSin3 * d25) + (dCos3 * d26);
            double d39 = d34 - d33;
            double dTan = Math.tan(d39 / 2);
            double dSin4 = (Math.sin(d39) * (Math.sqrt(d20 + ((3.0d * dTan) * dTan)) - 1)) / 3;
            u02.o((float) (d29 + (d31 * dSin4)), (float) (d32 + (d30 * dSin4)), (float) (d35 - (dSin4 * d37)), (float) (d36 - (dSin4 * d38)), (float) d35, (float) d36);
            i10++;
            d28 = d28;
            dSin = dSin;
            d29 = d35;
            d25 = d25;
            d33 = d34;
            d30 = d38;
            d20 = d20;
            d31 = d37;
            dCos = dCos;
            iCeil = i11;
            d32 = d36;
            d19 = d12;
        }
    }

    private static final void b(U0 u02, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17;
        double d18;
        double d19 = (d16 / 180) * 3.141592653589793d;
        double dCos = Math.cos(d19);
        double dSin = Math.sin(d19);
        double d20 = ((d10 * dCos) + (d11 * dSin)) / d14;
        double d21 = (((-d10) * dSin) + (d11 * dCos)) / d15;
        double d22 = ((d12 * dCos) + (d13 * dSin)) / d14;
        double d23 = (((-d12) * dSin) + (d13 * dCos)) / d15;
        double d24 = d20 - d22;
        double d25 = d21 - d23;
        double d26 = 2;
        double d27 = (d20 + d22) / d26;
        double d28 = (d21 + d23) / d26;
        double d29 = (d24 * d24) + (d25 * d25);
        if (d29 == 0.0d) {
            return;
        }
        double d30 = (1.0d / d29) - 0.25d;
        if (d30 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d29) / 1.99999d);
            b(u02, d10, d11, d12, d13, d14 * dSqrt, d15 * dSqrt, d16, z10, z11);
            return;
        }
        double dSqrt2 = Math.sqrt(d30);
        double d31 = d24 * dSqrt2;
        double d32 = dSqrt2 * d25;
        if (z10 == z11) {
            d17 = d27 - d32;
            d18 = d28 + d31;
        } else {
            d17 = d27 + d32;
            d18 = d28 - d31;
        }
        double dAtan2 = Math.atan2(d21 - d18, d20 - d17);
        double dAtan22 = Math.atan2(d23 - d18, d22 - d17) - dAtan2;
        if (z11 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d33 = d17 * d14;
        double d34 = d18 * d15;
        a(u02, (d33 * dCos) - (d34 * dSin), (d33 * dSin) + (d34 * dCos), d14, d15, d10, d11, d19, dAtan2, dAtan22);
    }

    public static final U0 c(List list, U0 u02) {
        AbstractC7871g abstractC7871g;
        float f10;
        int i10;
        int i11;
        float f11;
        float f12;
        float fC;
        float fE;
        float fD;
        float fD2;
        float f13;
        float f14;
        float f15;
        float f16;
        float fE2;
        float fD3;
        float f17;
        float f18;
        float f19;
        List list2 = list;
        U0 u03 = u02;
        int iL = u02.l();
        u02.q();
        u03.h(iL);
        AbstractC7871g abstractC7871g2 = list.isEmpty() ? AbstractC7871g.b.f60903c : (AbstractC7871g) list2.get(0);
        int size = list.size();
        float f20 = 0.0f;
        int i12 = 0;
        float fC2 = 0.0f;
        float fD4 = 0.0f;
        float fC3 = 0.0f;
        float fD5 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        while (i12 < size) {
            AbstractC7871g abstractC7871g3 = (AbstractC7871g) list2.get(i12);
            if (abstractC7871g3 instanceof AbstractC7871g.b) {
                u02.close();
                abstractC7871g = abstractC7871g3;
                f10 = f20;
                i10 = i12;
                i11 = size;
                fC2 = f21;
                fC3 = fC2;
                fD4 = f22;
                fD5 = fD4;
            } else {
                if (abstractC7871g3 instanceof AbstractC7871g.n) {
                    AbstractC7871g.n nVar = (AbstractC7871g.n) abstractC7871g3;
                    fC3 += nVar.c();
                    fD5 += nVar.d();
                    u03.e(nVar.c(), nVar.d());
                    f21 = fC3;
                } else if (abstractC7871g3 instanceof AbstractC7871g.f) {
                    AbstractC7871g.f fVar = (AbstractC7871g.f) abstractC7871g3;
                    float fC4 = fVar.c();
                    float fD6 = fVar.d();
                    u03.n(fVar.c(), fVar.d());
                    fC3 = fC4;
                    f21 = fC3;
                    fD5 = fD6;
                } else {
                    if (abstractC7871g3 instanceof AbstractC7871g.m) {
                        AbstractC7871g.m mVar = (AbstractC7871g.m) abstractC7871g3;
                        u03.s(mVar.c(), mVar.d());
                        fC3 += mVar.c();
                        f14 = mVar.d();
                    } else {
                        if (abstractC7871g3 instanceof AbstractC7871g.e) {
                            AbstractC7871g.e eVar = (AbstractC7871g.e) abstractC7871g3;
                            u03.u(eVar.c(), eVar.d());
                            fD2 = eVar.c();
                            f13 = eVar.d();
                        } else {
                            if (abstractC7871g3 instanceof AbstractC7871g.l) {
                                AbstractC7871g.l lVar = (AbstractC7871g.l) abstractC7871g3;
                                u03.s(lVar.c(), f20);
                                fC3 += lVar.c();
                            } else if (abstractC7871g3 instanceof AbstractC7871g.d) {
                                AbstractC7871g.d dVar = (AbstractC7871g.d) abstractC7871g3;
                                u03.u(dVar.c(), fD5);
                                fC3 = dVar.c();
                            } else if (abstractC7871g3 instanceof AbstractC7871g.r) {
                                AbstractC7871g.r rVar = (AbstractC7871g.r) abstractC7871g3;
                                u03.s(f20, rVar.c());
                                f14 = rVar.c();
                            } else if (abstractC7871g3 instanceof AbstractC7871g.s) {
                                AbstractC7871g.s sVar = (AbstractC7871g.s) abstractC7871g3;
                                u03.u(fC3, sVar.c());
                                fD5 = sVar.c();
                            } else {
                                if (abstractC7871g3 instanceof AbstractC7871g.k) {
                                    AbstractC7871g.k kVar = (AbstractC7871g.k) abstractC7871g3;
                                    u02.f(kVar.c(), kVar.f(), kVar.d(), kVar.g(), kVar.e(), kVar.h());
                                    fC = kVar.d() + fC3;
                                    fE = kVar.g() + fD5;
                                    fC3 += kVar.e();
                                    fD = kVar.h();
                                } else {
                                    if (abstractC7871g3 instanceof AbstractC7871g.c) {
                                        AbstractC7871g.c cVar = (AbstractC7871g.c) abstractC7871g3;
                                        u02.o(cVar.c(), cVar.f(), cVar.d(), cVar.g(), cVar.e(), cVar.h());
                                        fC = cVar.d();
                                        fE2 = cVar.g();
                                        fD3 = cVar.e();
                                        f17 = cVar.h();
                                    } else if (abstractC7871g3 instanceof AbstractC7871g.p) {
                                        if (abstractC7871g2.a()) {
                                            f19 = fD5 - fD4;
                                            f18 = fC3 - fC2;
                                        } else {
                                            f18 = f20;
                                            f19 = f18;
                                        }
                                        AbstractC7871g.p pVar = (AbstractC7871g.p) abstractC7871g3;
                                        u02.f(f18, f19, pVar.c(), pVar.e(), pVar.d(), pVar.f());
                                        fC = pVar.c() + fC3;
                                        fE = pVar.e() + fD5;
                                        fC3 += pVar.d();
                                        fD = pVar.f();
                                    } else if (abstractC7871g3 instanceof AbstractC7871g.h) {
                                        if (abstractC7871g2.a()) {
                                            float f23 = 2;
                                            f16 = (f23 * fD5) - fD4;
                                            f15 = (fC3 * f23) - fC2;
                                        } else {
                                            f15 = fC3;
                                            f16 = fD5;
                                        }
                                        AbstractC7871g.h hVar = (AbstractC7871g.h) abstractC7871g3;
                                        u02.o(f15, f16, hVar.c(), hVar.e(), hVar.d(), hVar.f());
                                        fC = hVar.c();
                                        fE2 = hVar.e();
                                        fD3 = hVar.d();
                                        f17 = hVar.f();
                                    } else if (abstractC7871g3 instanceof AbstractC7871g.o) {
                                        AbstractC7871g.o oVar = (AbstractC7871g.o) abstractC7871g3;
                                        u03.b(oVar.c(), oVar.e(), oVar.d(), oVar.f());
                                        fC2 = oVar.c() + fC3;
                                        fD4 = oVar.e() + fD5;
                                        fC3 += oVar.d();
                                        f14 = oVar.f();
                                    } else if (abstractC7871g3 instanceof AbstractC7871g.C2129g) {
                                        AbstractC7871g.C2129g c2129g = (AbstractC7871g.C2129g) abstractC7871g3;
                                        u03.j(c2129g.c(), c2129g.e(), c2129g.d(), c2129g.f());
                                        fC2 = c2129g.c();
                                        fD4 = c2129g.e();
                                        fD2 = c2129g.d();
                                        f13 = c2129g.f();
                                    } else if (abstractC7871g3 instanceof AbstractC7871g.q) {
                                        if (abstractC7871g2.b()) {
                                            f11 = fC3 - fC2;
                                            f12 = fD5 - fD4;
                                        } else {
                                            f11 = f20;
                                            f12 = f11;
                                        }
                                        AbstractC7871g.q qVar = (AbstractC7871g.q) abstractC7871g3;
                                        u03.b(f11, f12, qVar.c(), qVar.d());
                                        fC = f11 + fC3;
                                        fE = f12 + fD5;
                                        fC3 += qVar.c();
                                        fD = qVar.d();
                                    } else if (abstractC7871g3 instanceof AbstractC7871g.i) {
                                        if (abstractC7871g2.b()) {
                                            float f24 = 2;
                                            fC3 = (fC3 * f24) - fC2;
                                            fD5 = (f24 * fD5) - fD4;
                                        }
                                        AbstractC7871g.i iVar = (AbstractC7871g.i) abstractC7871g3;
                                        u03.j(fC3, fD5, iVar.c(), iVar.d());
                                        float fC5 = iVar.c();
                                        fD4 = fD5;
                                        abstractC7871g = abstractC7871g3;
                                        f10 = f20;
                                        i10 = i12;
                                        i11 = size;
                                        fD5 = iVar.d();
                                        float f25 = fC3;
                                        fC3 = fC5;
                                        fC2 = f25;
                                    } else if (abstractC7871g3 instanceof AbstractC7871g.j) {
                                        AbstractC7871g.j jVar = (AbstractC7871g.j) abstractC7871g3;
                                        float fC6 = jVar.c() + fC3;
                                        float fD7 = jVar.d() + fD5;
                                        abstractC7871g = abstractC7871g3;
                                        i10 = i12;
                                        f10 = 0.0f;
                                        i11 = size;
                                        b(u02, fC3, fD5, fC6, fD7, jVar.e(), jVar.g(), jVar.f(), jVar.h(), jVar.i());
                                        fD4 = fD7;
                                        fD5 = fD4;
                                        fC2 = fC6;
                                        fC3 = fC2;
                                    } else {
                                        abstractC7871g = abstractC7871g3;
                                        f10 = f20;
                                        i10 = i12;
                                        i11 = size;
                                        if (abstractC7871g instanceof AbstractC7871g.a) {
                                            AbstractC7871g.a aVar = (AbstractC7871g.a) abstractC7871g;
                                            b(u02, fC3, fD5, aVar.c(), aVar.d(), aVar.e(), aVar.g(), aVar.f(), aVar.h(), aVar.i());
                                            fC3 = aVar.c();
                                            fD4 = aVar.d();
                                            fD5 = fD4;
                                            fC2 = fC3;
                                        }
                                    }
                                    fC3 = fD3;
                                    fD5 = f17;
                                    abstractC7871g = abstractC7871g3;
                                    f10 = f20;
                                    i10 = i12;
                                    i11 = size;
                                    fD4 = fE2;
                                    fC2 = fC;
                                }
                                fD5 += fD;
                                fD4 = fE;
                                abstractC7871g = abstractC7871g3;
                                f10 = f20;
                                i10 = i12;
                                i11 = size;
                                fC2 = fC;
                            }
                            abstractC7871g = abstractC7871g3;
                            f10 = f20;
                            i10 = i12;
                            i11 = size;
                        }
                        fD5 = f13;
                        fC3 = fD2;
                        abstractC7871g = abstractC7871g3;
                        f10 = f20;
                        i10 = i12;
                        i11 = size;
                    }
                    fD5 += f14;
                    abstractC7871g = abstractC7871g3;
                    f10 = f20;
                    i10 = i12;
                    i11 = size;
                }
                f22 = fD5;
                abstractC7871g = abstractC7871g3;
                f10 = f20;
                i10 = i12;
                i11 = size;
            }
            i12 = i10 + 1;
            u03 = u02;
            abstractC7871g2 = abstractC7871g;
            f20 = f10;
            size = i11;
            list2 = list;
        }
        return u02;
    }
}

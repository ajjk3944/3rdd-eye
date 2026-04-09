package m0;

import a1.AbstractC3751b;
import kotlin.jvm.internal.AbstractC6492s;
import n0.AbstractC6857b;
import n0.AbstractC6858c;
import n0.C6862g;
import n0.InterfaceC6865j;

/* renamed from: m0.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6737x0 {
    /* JADX WARN: Removed duplicated region for block: B:112:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long a(float r20, float r21, float r22, float r23, n0.AbstractC6858c r24) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.AbstractC6737x0.a(float, float, float, float, n0.c):long");
    }

    public static final long b(int i10) {
        return C6733v0.h(Yg.E.b(Yg.E.b(i10) << 32));
    }

    public static final long c(int i10, int i11, int i12, int i13) {
        return b(((i10 & 255) << 16) | ((i13 & 255) << 24) | ((i11 & 255) << 8) | (i12 & 255));
    }

    public static final long d(long j10) {
        return C6733v0.h(Yg.E.b(j10 << 32));
    }

    public static /* synthetic */ long e(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 255;
        }
        return c(i10, i11, i12, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long f(float r17, float r18, float r19, float r20, n0.AbstractC6858c r21) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.AbstractC6737x0.f(float, float, float, float, n0.c):long");
    }

    public static final long g(long j10, long j11) {
        long jI = C6733v0.i(j10, C6733v0.p(j11));
        float fN = C6733v0.n(j11);
        float fN2 = C6733v0.n(jI);
        float f10 = 1.0f - fN2;
        float f11 = (fN * f10) + fN2;
        return f(f11 == 0.0f ? 0.0f : ((C6733v0.r(jI) * fN2) + ((C6733v0.r(j11) * fN) * f10)) / f11, f11 == 0.0f ? 0.0f : ((C6733v0.q(jI) * fN2) + ((C6733v0.q(j11) * fN) * f10)) / f11, f11 != 0.0f ? ((C6733v0.o(jI) * fN2) + ((C6733v0.o(j11) * fN) * f10)) / f11 : 0.0f, f11, C6733v0.p(j11));
    }

    public static final long h(long j10, long j11, float f10) {
        AbstractC6858c abstractC6858cT = C6862g.f54113a.t();
        long jI = C6733v0.i(j10, abstractC6858cT);
        long jI2 = C6733v0.i(j11, abstractC6858cT);
        float fN = C6733v0.n(jI);
        float fR = C6733v0.r(jI);
        float fQ = C6733v0.q(jI);
        float fO = C6733v0.o(jI);
        float fN2 = C6733v0.n(jI2);
        float fR2 = C6733v0.r(jI2);
        float fQ2 = C6733v0.q(jI2);
        float fO2 = C6733v0.o(jI2);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return C6733v0.i(f(AbstractC3751b.b(fR, fR2, f10), AbstractC3751b.b(fQ, fQ2, f10), AbstractC3751b.b(fO, fO2, f10), AbstractC3751b.b(fN, fN2, f10), abstractC6858cT), C6733v0.p(j11));
    }

    public static final float i(long j10) {
        AbstractC6858c abstractC6858cP = C6733v0.p(j10);
        if (!AbstractC6857b.e(abstractC6858cP.e(), AbstractC6857b.f54104a.b())) {
            M0.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC6857b.h(abstractC6858cP.e())));
        }
        AbstractC6492s.g(abstractC6858cP, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        InterfaceC6865j interfaceC6865jE = ((n0.x) abstractC6858cP).E();
        float fA = (float) ((interfaceC6865jE.a(C6733v0.r(j10)) * 0.2126d) + (interfaceC6865jE.a(C6733v0.q(j10)) * 0.7152d) + (interfaceC6865jE.a(C6733v0.o(j10)) * 0.0722d));
        if (fA < 0.0f) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            return 1.0f;
        }
        return fA;
    }

    public static final int j(long j10) {
        return (int) Yg.E.b(C6733v0.i(j10, C6862g.f54113a.w()) >>> 32);
    }
}

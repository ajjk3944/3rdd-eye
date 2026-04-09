package m0;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6532h;
import l0.C6529e;
import l0.C6531g;

/* loaded from: classes.dex */
public final class O0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f52835b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final float[] f52836a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ O0(float[] fArr) {
        this.f52836a = fArr;
    }

    public static final /* synthetic */ O0 a(float[] fArr) {
        return new O0(fArr);
    }

    public static float[] b(float[] fArr) {
        return fArr;
    }

    public static /* synthetic */ float[] c(float[] fArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return b(fArr);
    }

    public static boolean d(float[] fArr, Object obj) {
        return (obj instanceof O0) && AbstractC6492s.d(fArr, ((O0) obj).r());
    }

    public static int e(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final long f(float[] fArr, long j10) {
        float fM = C6531g.m(j10);
        float fN = C6531g.n(j10);
        float f10 = 1 / (((fArr[3] * fM) + (fArr[7] * fN)) + fArr[15]);
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            f10 = 0.0f;
        }
        return AbstractC6532h.a(((fArr[0] * fM) + (fArr[4] * fN) + fArr[12]) * f10, f10 * ((fArr[1] * fM) + (fArr[5] * fN) + fArr[13]));
    }

    public static final void g(float[] fArr, C6529e c6529e) {
        long jF = f(fArr, AbstractC6532h.a(c6529e.b(), c6529e.d()));
        long jF2 = f(fArr, AbstractC6532h.a(c6529e.b(), c6529e.a()));
        long jF3 = f(fArr, AbstractC6532h.a(c6529e.c(), c6529e.d()));
        long jF4 = f(fArr, AbstractC6532h.a(c6529e.c(), c6529e.a()));
        c6529e.i(Math.min(Math.min(C6531g.m(jF), C6531g.m(jF2)), Math.min(C6531g.m(jF3), C6531g.m(jF4))));
        c6529e.k(Math.min(Math.min(C6531g.n(jF), C6531g.n(jF2)), Math.min(C6531g.n(jF3), C6531g.n(jF4))));
        c6529e.j(Math.max(Math.max(C6531g.m(jF), C6531g.m(jF2)), Math.max(C6531g.m(jF3), C6531g.m(jF4))));
        c6529e.h(Math.max(Math.max(C6531g.n(jF), C6531g.n(jF2)), Math.max(C6531g.n(jF3), C6531g.n(jF4))));
    }

    public static final void h(float[] fArr) {
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                fArr[(i11 * 4) + i10] = i10 == i11 ? 1.0f : 0.0f;
                i11++;
            }
            i10++;
        }
    }

    public static final void i(float[] fArr, float f10) {
        double d10 = (f10 * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[6];
        float f15 = fArr[9];
        float f16 = fArr[10];
        float f17 = fArr[13];
        float f18 = fArr[14];
        fArr[1] = (f11 * fCos) - (f12 * fSin);
        fArr[2] = (f11 * fSin) + (f12 * fCos);
        fArr[5] = (f13 * fCos) - (f14 * fSin);
        fArr[6] = (f13 * fSin) + (f14 * fCos);
        fArr[9] = (f15 * fCos) - (f16 * fSin);
        fArr[10] = (f15 * fSin) + (f16 * fCos);
        fArr[13] = (f17 * fCos) - (f18 * fSin);
        fArr[14] = (f17 * fSin) + (f18 * fCos);
    }

    public static final void j(float[] fArr, float f10) {
        double d10 = (f10 * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = fArr[0];
        float f12 = fArr[2];
        float f13 = fArr[4];
        float f14 = fArr[6];
        float f15 = fArr[8];
        float f16 = fArr[10];
        float f17 = fArr[12];
        float f18 = fArr[14];
        fArr[0] = (f11 * fCos) + (f12 * fSin);
        fArr[2] = ((-f11) * fSin) + (f12 * fCos);
        fArr[4] = (f13 * fCos) + (f14 * fSin);
        fArr[6] = ((-f13) * fSin) + (f14 * fCos);
        fArr[8] = (f15 * fCos) + (f16 * fSin);
        fArr[10] = ((-f15) * fSin) + (f16 * fCos);
        fArr[12] = (f17 * fCos) + (f18 * fSin);
        fArr[14] = ((-f17) * fSin) + (f18 * fCos);
    }

    public static final void k(float[] fArr, float f10) {
        double d10 = (f10 * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = fArr[0];
        float f12 = fArr[4];
        float f13 = -fSin;
        float f14 = fArr[1];
        float f15 = fArr[5];
        float f16 = fArr[2];
        float f17 = fArr[6];
        float f18 = fArr[3];
        float f19 = fArr[7];
        fArr[0] = (fCos * f11) + (fSin * f12);
        fArr[1] = (fCos * f14) + (fSin * f15);
        fArr[2] = (fCos * f16) + (fSin * f17);
        fArr[3] = (fCos * f18) + (fSin * f19);
        fArr[4] = (f11 * f13) + (f12 * fCos);
        fArr[5] = (f14 * f13) + (f15 * fCos);
        fArr[6] = (f16 * f13) + (f17 * fCos);
        fArr[7] = (f13 * f18) + (fCos * f19);
    }

    public static final void l(float[] fArr, float f10, float f11, float f12) {
        fArr[0] = fArr[0] * f10;
        fArr[1] = fArr[1] * f10;
        fArr[2] = fArr[2] * f10;
        fArr[3] = fArr[3] * f10;
        fArr[4] = fArr[4] * f11;
        fArr[5] = fArr[5] * f11;
        fArr[6] = fArr[6] * f11;
        fArr[7] = fArr[7] * f11;
        fArr[8] = fArr[8] * f12;
        fArr[9] = fArr[9] * f12;
        fArr[10] = fArr[10] * f12;
        fArr[11] = fArr[11] * f12;
    }

    public static /* synthetic */ void m(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 1.0f;
        }
        l(fArr, f10, f11, f12);
    }

    public static final void n(float[] fArr, float[] fArr2) {
        float fB = P0.b(fArr, 0, fArr2, 0);
        float fB2 = P0.b(fArr, 0, fArr2, 1);
        float fB3 = P0.b(fArr, 0, fArr2, 2);
        float fB4 = P0.b(fArr, 0, fArr2, 3);
        float fB5 = P0.b(fArr, 1, fArr2, 0);
        float fB6 = P0.b(fArr, 1, fArr2, 1);
        float fB7 = P0.b(fArr, 1, fArr2, 2);
        float fB8 = P0.b(fArr, 1, fArr2, 3);
        float fB9 = P0.b(fArr, 2, fArr2, 0);
        float fB10 = P0.b(fArr, 2, fArr2, 1);
        float fB11 = P0.b(fArr, 2, fArr2, 2);
        float fB12 = P0.b(fArr, 2, fArr2, 3);
        float fB13 = P0.b(fArr, 3, fArr2, 0);
        float fB14 = P0.b(fArr, 3, fArr2, 1);
        float fB15 = P0.b(fArr, 3, fArr2, 2);
        float fB16 = P0.b(fArr, 3, fArr2, 3);
        fArr[0] = fB;
        fArr[1] = fB2;
        fArr[2] = fB3;
        fArr[3] = fB4;
        fArr[4] = fB5;
        fArr[5] = fB6;
        fArr[6] = fB7;
        fArr[7] = fB8;
        fArr[8] = fB9;
        fArr[9] = fB10;
        fArr[10] = fB11;
        fArr[11] = fB12;
        fArr[12] = fB13;
        fArr[13] = fB14;
        fArr[14] = fB15;
        fArr[15] = fB16;
    }

    public static String o(float[] fArr) {
        return kotlin.text.t.j("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void p(float[] fArr, float f10, float f11, float f12) {
        float f13 = (fArr[0] * f10) + (fArr[4] * f11) + (fArr[8] * f12) + fArr[12];
        float f14 = (fArr[1] * f10) + (fArr[5] * f11) + (fArr[9] * f12) + fArr[13];
        float f15 = (fArr[2] * f10) + (fArr[6] * f11) + (fArr[10] * f12) + fArr[14];
        float f16 = (fArr[3] * f10) + (fArr[7] * f11) + (fArr[11] * f12) + fArr[15];
        fArr[12] = f13;
        fArr[13] = f14;
        fArr[14] = f15;
        fArr[15] = f16;
    }

    public static /* synthetic */ void q(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        p(fArr, f10, f11, f12);
    }

    public boolean equals(Object obj) {
        return d(this.f52836a, obj);
    }

    public int hashCode() {
        return e(this.f52836a);
    }

    public final /* synthetic */ float[] r() {
        return this.f52836a;
    }

    public String toString() {
        return o(this.f52836a);
    }
}

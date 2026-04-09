package I;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f1835a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1836b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1837c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1838d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1839e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1840f;

    public a(float f2, float f5, float f6, float f7, float f8, float f9) {
        this.f1835a = f2;
        this.f1836b = f5;
        this.f1837c = f6;
        this.f1838d = f7;
        this.f1839e = f8;
        this.f1840f = f9;
    }

    public static a a(int i) {
        m mVar = m.f1873k;
        float f2 = b.f(Color.red(i));
        float f5 = b.f(Color.green(i));
        float f6 = b.f(Color.blue(i));
        float[][] fArr = b.f1844d;
        float[] fArr2 = fArr[0];
        float f7 = (fArr2[2] * f6) + (fArr2[1] * f5) + (fArr2[0] * f2);
        float[] fArr3 = fArr[1];
        float f8 = (fArr3[2] * f6) + (fArr3[1] * f5) + (fArr3[0] * f2);
        float[] fArr4 = fArr[2];
        float f9 = (f6 * fArr4[2]) + (f5 * fArr4[1]) + (f2 * fArr4[0]);
        float[][] fArr5 = b.f1841a;
        float[] fArr6 = fArr5[0];
        float f10 = (fArr6[2] * f9) + (fArr6[1] * f8) + (fArr6[0] * f7);
        float[] fArr7 = fArr5[1];
        float f11 = (fArr7[2] * f9) + (fArr7[1] * f8) + (fArr7[0] * f7);
        float[] fArr8 = fArr5[2];
        float f12 = (f9 * fArr8[2]) + (f8 * fArr8[1]) + (f7 * fArr8[0]);
        float[] fArr9 = mVar.f1880g;
        float f13 = mVar.i;
        float f14 = mVar.f1877d;
        float f15 = mVar.f1874a;
        float f16 = fArr9[0] * f10;
        float f17 = fArr9[1] * f11;
        float f18 = fArr9[2] * f12;
        float f19 = mVar.f1881h;
        float fPow = (float) Math.pow((Math.abs(f16) * f19) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f17) * f19) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f18) * f19) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f16) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f17) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f18) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d6 = fSignum3;
        float f20 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d6)) / 11.0f;
        float f21 = ((float) ((fSignum + fSignum2) - (d6 * 2.0d))) / 9.0f;
        float f22 = fSignum2 * 20.0f;
        float f23 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f22)) / 20.0f;
        float f24 = (((fSignum * 40.0f) + f22) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f21, f20)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f25 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f24 * mVar.f1875b) / f15, mVar.f1882j * f14)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f26 = f15 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, mVar.f1879f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.f1878e) * mVar.f1876c) * ((float) Math.sqrt((f21 * f21) + (f20 * f20)))) / (f23 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        Math.sqrt((r0 * f14) / f26);
        float f27 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f13 * fPow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d7 = f25;
        return new a(fAtan2, fPow5, fPow4, f27, fLog * ((float) Math.cos(d7)), fLog * ((float) Math.sin(d7)));
    }

    public static a b(float f2, float f5, float f6) {
        m mVar = m.f1873k;
        float f7 = mVar.f1877d;
        Math.sqrt(f2 / 100.0d);
        float f8 = mVar.f1874a + 4.0f;
        float f9 = mVar.i * f5;
        Math.sqrt(((f5 / ((float) Math.sqrt(r1))) * mVar.f1877d) / f8);
        float f10 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float fLog = ((float) Math.log((f9 * 0.0228d) + 1.0d)) * 43.85965f;
        double d6 = (3.1415927f * f6) / 180.0f;
        return new a(f6, f5, f2, f10, fLog * ((float) Math.cos(d6)), fLog * ((float) Math.sin(d6)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(I.m r20) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I.a.c(I.m):int");
    }
}

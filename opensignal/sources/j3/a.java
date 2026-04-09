package j3;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f13162a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13163b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13164c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13165d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13166e;

    /* renamed from: f, reason: collision with root package name */
    public final float f13167f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f13162a = f10;
        this.f13163b = f11;
        this.f13164c = f12;
        this.f13165d = f13;
        this.f13166e = f14;
        this.f13167f = f15;
    }

    public static a a(int i10) {
        l lVar = l.k;
        float f10 = b.f(Color.red(i10));
        float f11 = b.f(Color.green(i10));
        float f12 = b.f(Color.blue(i10));
        float[][] fArr = b.f13171d;
        float[] fArr2 = fArr[0];
        float f13 = (fArr2[2] * f12) + (fArr2[1] * f11) + (fArr2[0] * f10);
        float[] fArr3 = fArr[1];
        float f14 = (fArr3[2] * f12) + (fArr3[1] * f11) + (fArr3[0] * f10);
        float[] fArr4 = fArr[2];
        float f15 = (f12 * fArr4[2]) + (f11 * fArr4[1]) + (f10 * fArr4[0]);
        float[][] fArr5 = b.f13168a;
        float[] fArr6 = fArr5[0];
        float f16 = (fArr6[2] * f15) + (fArr6[1] * f14) + (fArr6[0] * f13);
        float[] fArr7 = fArr5[1];
        float f17 = (fArr7[2] * f15) + (fArr7[1] * f14) + (fArr7[0] * f13);
        float[] fArr8 = fArr5[2];
        float f18 = (f15 * fArr8[2]) + (f14 * fArr8[1]) + (f13 * fArr8[0]);
        float[] fArr9 = lVar.f13202g;
        float f19 = lVar.f13204i;
        float f20 = lVar.f13199d;
        float f21 = lVar.f13196a;
        float f22 = fArr9[0] * f16;
        float f23 = fArr9[1] * f17;
        float f24 = fArr9[2] * f18;
        float f25 = lVar.f13203h;
        float fPow = (float) Math.pow((Math.abs(f22) * f25) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f23) * f25) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f24) * f25) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f22) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f23) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f24) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d6 = fSignum3;
        float f26 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d6)) / 11.0f;
        float f27 = ((float) ((fSignum + fSignum2) - (d6 * 2.0d))) / 9.0f;
        float f28 = fSignum2 * 20.0f;
        float f29 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f28)) / 20.0f;
        float f30 = (((fSignum * 40.0f) + f28) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f27, f26)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f31 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f30 * lVar.f13197b) / f21, lVar.j * f20)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f32 = f21 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.f13201f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.f13200e) * lVar.f13198c) * ((float) Math.sqrt((f27 * f27) + (f26 * f26)))) / (f29 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        Math.sqrt((r0 * f20) / f32);
        float f33 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f19 * fPow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d10 = f31;
        return new a(fAtan2, fPow5, fPow4, f33, fLog * ((float) Math.cos(d10)), fLog * ((float) Math.sin(d10)));
    }

    public static a b(float f10, float f11, float f12) {
        l lVar = l.k;
        float f13 = lVar.f13199d;
        Math.sqrt(f10 / 100.0d);
        float f14 = lVar.f13196a + 4.0f;
        float f15 = lVar.f13204i * f11;
        Math.sqrt(((f11 / ((float) Math.sqrt(r1))) * lVar.f13199d) / f14);
        float f16 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float fLog = ((float) Math.log((f15 * 0.0228d) + 1.0d)) * 43.85965f;
        double d6 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, f16, fLog * ((float) Math.cos(d6)), fLog * ((float) Math.sin(d6)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(j3.l r20) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.a.c(j3.l):int");
    }
}

package B0;

import android.graphics.Color;

/* compiled from: CamColor.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f331a;

    /* renamed from: b, reason: collision with root package name */
    public final float f332b;

    /* renamed from: c, reason: collision with root package name */
    public final float f333c;

    /* renamed from: d, reason: collision with root package name */
    public final float f334d;

    /* renamed from: e, reason: collision with root package name */
    public final float f335e;

    /* renamed from: f, reason: collision with root package name */
    public final float f336f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f331a = f10;
        this.f332b = f11;
        this.f333c = f12;
        this.f334d = f13;
        this.f335e = f14;
        this.f336f = f15;
    }

    public static a a(int i) {
        j jVar = j.f373k;
        float fB = b.b(Color.red(i));
        float fB2 = b.b(Color.green(i));
        float fB3 = b.b(Color.blue(i));
        float[][] fArr = b.f340d;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[2] * fB3) + (fArr2[1] * fB2) + (fArr2[0] * fB);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * fB3) + (fArr3[1] * fB2) + (fArr3[0] * fB);
        float[] fArr4 = fArr[2];
        float f12 = (fB3 * fArr4[2]) + (fB2 * fArr4[1]) + (fB * fArr4[0]);
        float[][] fArr5 = b.f337a;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f10);
        float[] fArr7 = fArr5[1];
        float f14 = (fArr7[2] * f12) + (fArr7[1] * f11) + (fArr7[0] * f10);
        float[] fArr8 = fArr5[2];
        float f15 = (f12 * fArr8[2]) + (f11 * fArr8[1]) + (f10 * fArr8[0]);
        float[] fArr9 = jVar.f380g;
        float f16 = fArr9[0] * f13;
        float f17 = fArr9[1] * f14;
        float f18 = fArr9[2] * f15;
        float fAbs = Math.abs(f16);
        float f19 = jVar.f381h;
        float fPow = (float) Math.pow((fAbs * f19) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f17) * f19) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f18) * f19) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f16) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f17) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f18) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d10 = fSignum3;
        float f20 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d10)) / 11.0f;
        float f21 = ((float) ((fSignum + fSignum2) - (d10 * 2.0d))) / 9.0f;
        float f22 = fSignum2 * 20.0f;
        float f23 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f22)) / 20.0f;
        float f24 = (((fSignum * 40.0f) + f22) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f21, f20)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f25 = fAtan2;
        float f26 = (3.1415927f * f25) / 180.0f;
        float f27 = f24 * jVar.f375b;
        float f28 = jVar.f374a;
        float f29 = jVar.f377d;
        float fPow4 = ((float) Math.pow(f27 / f28, jVar.f382j * f29)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f30 = f28 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, jVar.f379f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f25) < 20.14d ? f25 + 360.0f : f25) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * jVar.f378e) * jVar.f376c) * ((float) Math.sqrt((f21 * f21) + (f20 * f20)))) / (f23 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        float f31 = jVar.i * fPow5;
        Math.sqrt((r3 * f29) / f30);
        float f32 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f31 * 0.0228f) + 1.0f)) * 43.85965f;
        double d11 = f26;
        return new a(f25, fPow5, fPow4, f32, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
    }

    public static a b(float f10, float f11, float f12) {
        j jVar = j.f373k;
        float f13 = jVar.f377d;
        Math.sqrt(f10 / 100.0d);
        float f14 = jVar.f374a + 4.0f;
        float f15 = jVar.i * f11;
        Math.sqrt(((f11 / ((float) Math.sqrt(r1))) * jVar.f377d) / f14);
        float f16 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float fLog = ((float) Math.log((f15 * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, f16, fLog * ((float) Math.cos(d10)), fLog * ((float) Math.sin(d10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(B0.j r21) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.a.c(B0.j):int");
    }
}

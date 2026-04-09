package u3;

import android.graphics.Color;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f35062a;

    /* renamed from: b, reason: collision with root package name */
    public final float f35063b;

    /* renamed from: c, reason: collision with root package name */
    public final float f35064c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35065d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35066e;

    /* renamed from: f, reason: collision with root package name */
    public final float f35067f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f35062a = f10;
        this.f35063b = f11;
        this.f35064c = f12;
        this.f35065d = f13;
        this.f35066e = f14;
        this.f35067f = f15;
    }

    public static a a(int i4) {
        l lVar = l.f35094k;
        float fG = b.g(Color.red(i4));
        float fG2 = b.g(Color.green(i4));
        float fG3 = b.g(Color.blue(i4));
        float[][] fArr = b.f35071d;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[2] * fG3) + (fArr2[1] * fG2) + (fArr2[0] * fG);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * fG3) + (fArr3[1] * fG2) + (fArr3[0] * fG);
        float[] fArr4 = fArr[2];
        float f12 = (fG3 * fArr4[2]) + (fG2 * fArr4[1]) + (fG * fArr4[0]);
        float[][] fArr5 = b.f35068a;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f10);
        float[] fArr7 = fArr5[1];
        float f14 = (fArr7[2] * f12) + (fArr7[1] * f11) + (fArr7[0] * f10);
        float[] fArr8 = fArr5[2];
        float f15 = (f12 * fArr8[2]) + (f11 * fArr8[1]) + (f10 * fArr8[0]);
        float[] fArr9 = lVar.g;
        float f16 = lVar.f35102i;
        float f17 = lVar.f35098d;
        float f18 = lVar.f35095a;
        float f19 = fArr9[0] * f13;
        float f20 = fArr9[1] * f14;
        float f21 = fArr9[2] * f15;
        float f22 = lVar.f35101h;
        float fPow = (float) Math.pow((Math.abs(f19) * f22) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f20) * f22) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f21) * f22) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f19) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f20) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f21) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d10 = fSignum3;
        float f23 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d10)) / 11.0f;
        float f24 = ((float) ((fSignum + fSignum2) - (d10 * 2.0d))) / 9.0f;
        float f25 = fSignum2 * 20.0f;
        float f26 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f25)) / 20.0f;
        float f27 = (((fSignum * 40.0f) + f25) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f24, f23)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f28 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f27 * lVar.f35096b) / f18, lVar.j * f17)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f29 = f18 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.f35100f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.f35099e) * lVar.f35097c) * ((float) Math.sqrt((f24 * f24) + (f23 * f23)))) / (f26 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        Math.sqrt((r0 * f17) / f29);
        float f30 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f16 * fPow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d11 = f28;
        return new a(fAtan2, fPow5, fPow4, f30, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
    }

    public static a b(float f10, float f11, float f12) {
        l lVar = l.f35094k;
        float f13 = lVar.f35098d;
        Math.sqrt(f10 / 100.0d);
        float f14 = lVar.f35095a + 4.0f;
        float f15 = lVar.f35102i * f11;
        Math.sqrt(((f11 / ((float) Math.sqrt(r1))) * lVar.f35098d) / f14);
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
    public final int c(u3.l r20) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.a.c(u3.l):int");
    }
}

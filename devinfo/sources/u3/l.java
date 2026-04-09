package u3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: k, reason: collision with root package name */
    public static final l f35094k;

    /* renamed from: a, reason: collision with root package name */
    public final float f35095a;

    /* renamed from: b, reason: collision with root package name */
    public final float f35096b;

    /* renamed from: c, reason: collision with root package name */
    public final float f35097c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35098d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35099e;

    /* renamed from: f, reason: collision with root package name */
    public final float f35100f;
    public final float[] g;

    /* renamed from: h, reason: collision with root package name */
    public final float f35101h;

    /* renamed from: i, reason: collision with root package name */
    public final float f35102i;
    public final float j;

    static {
        float[] fArr = b.f35070c;
        float fO = (float) ((b.o() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f35068a;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = (fArr3[1] * f12) + f11;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13;
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f10);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f10 * fArr5[0]);
        float f18 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fO) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = fExp;
        if (d10 > 1.0d) {
            fExp = 1.0f;
        } else if (d10 < 0.0d) {
            fExp = 0.0f;
        }
        float f19 = 1.0f / ((5.0f * fO) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float fCbrt = (0.1f * f21 * f21 * ((float) Math.cbrt(fO * 5.0d))) + (f20 * fO);
        float fO2 = b.o() / fArr[1];
        double d11 = fO2;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * fCbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * fCbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * fCbrt) * f17) / 100.0d, 0.42d)};
        float f22 = fArr6[0];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr6[1];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr6[2];
        float[] fArr7 = {f23, f25, (400.0f * f26) / (f26 + 27.13f)};
        f35094k = new l(fO2, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * fPow, fPow, fPow, f18, 1.0f, new float[]{(((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f17) * fExp) + 1.0f) - fExp}, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public l(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f35100f = f10;
        this.f35095a = f11;
        this.f35096b = f12;
        this.f35097c = f13;
        this.f35098d = f14;
        this.f35099e = f15;
        this.g = fArr;
        this.f35101h = f16;
        this.f35102i = f17;
        this.j = f18;
    }
}

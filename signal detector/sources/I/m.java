package I;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: k, reason: collision with root package name */
    public static final m f1873k;

    /* renamed from: a, reason: collision with root package name */
    public final float f1874a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1875b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1876c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1877d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1878e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1879f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f1880g;

    /* renamed from: h, reason: collision with root package name */
    public final float f1881h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1882j;

    static {
        float[] fArr = b.f1843c;
        float fM = (float) ((b.m() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f1841a;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr3[0] * f2;
        float f6 = fArr[1];
        float f7 = (fArr3[1] * f6) + f5;
        float f8 = fArr[2];
        float f9 = (fArr3[2] * f8) + f7;
        float[] fArr4 = fArr2[1];
        float f10 = (fArr4[2] * f8) + (fArr4[1] * f6) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f11 = (f8 * fArr5[2]) + (f6 * fArr5[1]) + (f2 * fArr5[0]);
        float f12 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fM) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d6 = fExp;
        if (d6 > 1.0d) {
            fExp = 1.0f;
        } else if (d6 < 0.0d) {
            fExp = 0.0f;
        }
        float f13 = 1.0f / ((5.0f * fM) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float fCbrt = (0.1f * f15 * f15 * ((float) Math.cbrt(fM * 5.0d))) + (f14 * fM);
        float fM2 = b.m() / fArr[1];
        double d7 = fM2;
        float fSqrt = ((float) Math.sqrt(d7)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d7, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * fCbrt) * f9) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * fCbrt) * f10) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * fCbrt) * f11) / 100.0d, 0.42d)};
        float f16 = fArr6[0];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr6[1];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr6[2];
        float[] fArr7 = {f17, f19, (400.0f * f20) / (f20 + 27.13f)};
        f1873k = new m(fM2, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * fPow, fPow, fPow, f12, 1.0f, new float[]{(((100.0f / f9) * fExp) + 1.0f) - fExp, (((100.0f / f10) * fExp) + 1.0f) - fExp, (((100.0f / f11) * fExp) + 1.0f) - fExp}, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public m(float f2, float f5, float f6, float f7, float f8, float f9, float[] fArr, float f10, float f11, float f12) {
        this.f1879f = f2;
        this.f1874a = f5;
        this.f1875b = f6;
        this.f1876c = f7;
        this.f1877d = f8;
        this.f1878e = f9;
        this.f1880g = fArr;
        this.f1881h = f10;
        this.i = f11;
        this.f1882j = f12;
    }
}

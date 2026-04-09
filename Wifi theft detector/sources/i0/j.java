package i0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: k, reason: collision with root package name */
    public static final j f21546k = k(b.f21534c, (float) ((b.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a, reason: collision with root package name */
    public final float f21547a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21548b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21549c;

    /* renamed from: d, reason: collision with root package name */
    public final float f21550d;

    /* renamed from: e, reason: collision with root package name */
    public final float f21551e;

    /* renamed from: f, reason: collision with root package name */
    public final float f21552f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f21553g;

    /* renamed from: h, reason: collision with root package name */
    public final float f21554h;

    /* renamed from: i, reason: collision with root package name */
    public final float f21555i;

    /* renamed from: j, reason: collision with root package name */
    public final float f21556j;

    public j(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f21552f = f10;
        this.f21547a = f11;
        this.f21548b = f12;
        this.f21549c = f13;
        this.f21550d = f14;
        this.f21551e = f15;
        this.f21553g = fArr;
        this.f21554h = f16;
        this.f21555i = f17;
        this.f21556j = f18;
    }

    public static j k(float[] fArr, float f10, float f11, float f12, boolean z10) {
        float[][] fArr2 = b.f21532a;
        float f13 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f14 = fArr3[0] * f13;
        float f15 = fArr[1];
        float f16 = f14 + (fArr3[1] * f15);
        float f17 = fArr[2];
        float f18 = f16 + (fArr3[2] * f17);
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[0] * f13) + (fArr4[1] * f15) + (fArr4[2] * f17);
        float[] fArr5 = fArr2[2];
        float f20 = (f13 * fArr5[0]) + (f15 * fArr5[1]) + (f17 * fArr5[2]);
        float f21 = (f12 / 10.0f) + 0.8f;
        float fD = ((double) f21) >= 0.9d ? b.d(0.59f, 0.69f, (f21 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f21 - 0.8f) * 10.0f);
        float fExp = z10 ? 1.0f : (1.0f - (((float) Math.exp(((-f10) - 42.0f) / 92.0f)) * 0.2777778f)) * f21;
        double d10 = fExp;
        if (d10 > 1.0d) {
            fExp = 1.0f;
        } else if (d10 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f18) * fExp) + 1.0f) - fExp, (((100.0f / f19) * fExp) + 1.0f) - fExp, (((100.0f / f20) * fExp) + 1.0f) - fExp};
        float f22 = 1.0f / ((5.0f * f10) + 1.0f);
        float f23 = f22 * f22 * f22 * f22;
        float f24 = 1.0f - f23;
        float fCbrt = (f23 * f10) + (0.1f * f24 * f24 * ((float) Math.cbrt(f10 * 5.0d)));
        float fH = b.h(f11) / fArr[1];
        double d11 = fH;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * fCbrt) * f18) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * fCbrt) * f19) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * fCbrt) * f20) / 100.0d, 0.42d)};
        float f25 = fArr7[0];
        float f26 = (f25 * 400.0f) / (f25 + 27.13f);
        float f27 = fArr7[1];
        float f28 = (f27 * 400.0f) / (f27 + 27.13f);
        float f29 = fArr7[2];
        float[] fArr8 = {f26, f28, (400.0f * f29) / (f29 + 27.13f)};
        return new j(fH, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fD, f21, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public float a() {
        return this.f21547a;
    }

    public float b() {
        return this.f21550d;
    }

    public float c() {
        return this.f21554h;
    }

    public float d() {
        return this.f21555i;
    }

    public float e() {
        return this.f21552f;
    }

    public float f() {
        return this.f21548b;
    }

    public float g() {
        return this.f21551e;
    }

    public float h() {
        return this.f21549c;
    }

    public float[] i() {
        return this.f21553g;
    }

    public float j() {
        return this.f21556j;
    }
}

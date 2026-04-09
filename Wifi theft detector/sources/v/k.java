package v;

/* loaded from: classes.dex */
public class k implements m {

    /* renamed from: c, reason: collision with root package name */
    public double f24635c;

    /* renamed from: d, reason: collision with root package name */
    public double f24636d;

    /* renamed from: e, reason: collision with root package name */
    public double f24637e;

    /* renamed from: f, reason: collision with root package name */
    public float f24638f;

    /* renamed from: g, reason: collision with root package name */
    public float f24639g;

    /* renamed from: h, reason: collision with root package name */
    public float f24640h;

    /* renamed from: i, reason: collision with root package name */
    public float f24641i;

    /* renamed from: j, reason: collision with root package name */
    public float f24642j;

    /* renamed from: a, reason: collision with root package name */
    public double f24633a = 0.5d;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24634b = false;

    /* renamed from: k, reason: collision with root package name */
    public int f24643k = 0;

    @Override // v.m
    public float a() {
        return 0.0f;
    }

    @Override // v.m
    public boolean b() {
        double d10 = this.f24639g - this.f24636d;
        double d11 = this.f24635c;
        double d12 = this.f24640h;
        return Math.sqrt((((d12 * d12) * ((double) this.f24641i)) + ((d11 * d10) * d10)) / d11) <= ((double) this.f24642j);
    }

    public final void c(double d10) {
        double d11 = this.f24635c;
        double d12 = this.f24633a;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d11 / this.f24641i) * d10) * 4.0d)) + 1.0d);
        double d13 = d10 / iSqrt;
        int i10 = 0;
        while (i10 < iSqrt) {
            float f10 = this.f24639g;
            double d14 = this.f24636d;
            float f11 = this.f24640h;
            double d15 = d11;
            double d16 = ((-d11) * (f10 - d14)) - (f11 * d12);
            float f12 = this.f24641i;
            double d17 = d12;
            double d18 = f11 + (((d16 / f12) * d13) / 2.0d);
            double d19 = ((((-((f10 + ((d13 * d18) / 2.0d)) - d14)) * d15) - (d18 * d17)) / f12) * d13;
            float f13 = (float) (f11 + d19);
            this.f24640h = f13;
            float f14 = (float) (f10 + ((f11 + (d19 / 2.0d)) * d13));
            this.f24639g = f14;
            int i11 = this.f24643k;
            if (i11 > 0) {
                if (f14 < 0.0f && (i11 & 1) == 1) {
                    this.f24639g = -f14;
                    this.f24640h = -f13;
                }
                float f15 = this.f24639g;
                if (f15 > 1.0f && (i11 & 2) == 2) {
                    this.f24639g = 2.0f - f15;
                    this.f24640h = -this.f24640h;
                }
            }
            i10++;
            d11 = d15;
            d12 = d17;
        }
    }

    public void d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i10) {
        this.f24636d = f11;
        this.f24633a = f15;
        this.f24634b = false;
        this.f24639g = f10;
        this.f24637e = f12;
        this.f24635c = f14;
        this.f24641i = f13;
        this.f24642j = f16;
        this.f24643k = i10;
        this.f24638f = 0.0f;
    }

    @Override // v.m
    public float getInterpolation(float f10) {
        c(f10 - this.f24638f);
        this.f24638f = f10;
        return this.f24639g;
    }
}

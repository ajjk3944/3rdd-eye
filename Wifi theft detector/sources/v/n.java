package v;

/* loaded from: classes.dex */
public class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public float f24645a;

    /* renamed from: b, reason: collision with root package name */
    public float f24646b;

    /* renamed from: c, reason: collision with root package name */
    public float f24647c;

    /* renamed from: d, reason: collision with root package name */
    public float f24648d;

    /* renamed from: e, reason: collision with root package name */
    public float f24649e;

    /* renamed from: f, reason: collision with root package name */
    public float f24650f;

    /* renamed from: g, reason: collision with root package name */
    public float f24651g;

    /* renamed from: h, reason: collision with root package name */
    public float f24652h;

    /* renamed from: i, reason: collision with root package name */
    public float f24653i;

    /* renamed from: j, reason: collision with root package name */
    public int f24654j;

    /* renamed from: k, reason: collision with root package name */
    public String f24655k;

    /* renamed from: m, reason: collision with root package name */
    public float f24657m;

    /* renamed from: n, reason: collision with root package name */
    public float f24658n;

    /* renamed from: l, reason: collision with root package name */
    public boolean f24656l = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f24659o = false;

    @Override // v.m
    public float a() {
        return this.f24656l ? -e(this.f24658n) : e(this.f24658n);
    }

    @Override // v.m
    public boolean b() {
        return a() < 1.0E-5f && Math.abs(this.f24653i - this.f24658n) < 1.0E-5f;
    }

    public final float c(float f10) {
        this.f24659o = false;
        float f11 = this.f24648d;
        if (f10 <= f11) {
            float f12 = this.f24645a;
            return (f12 * f10) + ((((this.f24646b - f12) * f10) * f10) / (f11 * 2.0f));
        }
        int i10 = this.f24654j;
        if (i10 == 1) {
            return this.f24651g;
        }
        float f13 = f10 - f11;
        float f14 = this.f24649e;
        if (f13 < f14) {
            float f15 = this.f24651g;
            float f16 = this.f24646b;
            return f15 + (f16 * f13) + ((((this.f24647c - f16) * f13) * f13) / (f14 * 2.0f));
        }
        if (i10 == 2) {
            return this.f24652h;
        }
        float f17 = f13 - f14;
        float f18 = this.f24650f;
        if (f17 > f18) {
            this.f24659o = true;
            return this.f24653i;
        }
        float f19 = this.f24652h;
        float f20 = this.f24647c;
        return (f19 + (f20 * f17)) - (((f20 * f17) * f17) / (f18 * 2.0f));
    }

    public void d(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f24659o = false;
        this.f24657m = f10;
        boolean z10 = f10 > f11;
        this.f24656l = z10;
        if (z10) {
            f(-f12, f10 - f11, f14, f15, f13);
        } else {
            f(f12, f11 - f10, f14, f15, f13);
        }
    }

    public float e(float f10) {
        float f11 = this.f24648d;
        if (f10 <= f11) {
            float f12 = this.f24645a;
            return f12 + (((this.f24646b - f12) * f10) / f11);
        }
        int i10 = this.f24654j;
        if (i10 == 1) {
            return 0.0f;
        }
        float f13 = f10 - f11;
        float f14 = this.f24649e;
        if (f13 < f14) {
            float f15 = this.f24646b;
            return f15 + (((this.f24647c - f15) * f13) / f14);
        }
        if (i10 == 2) {
            return this.f24652h;
        }
        float f16 = f13 - f14;
        float f17 = this.f24650f;
        if (f16 >= f17) {
            return this.f24653i;
        }
        float f18 = this.f24647c;
        return f18 - ((f16 * f18) / f17);
    }

    public final void f(float f10, float f11, float f12, float f13, float f14) {
        this.f24659o = false;
        if (f10 == 0.0f) {
            f10 = 1.0E-4f;
        }
        this.f24645a = f10;
        float f15 = f10 / f12;
        float f16 = (f15 * f10) / 2.0f;
        if (f10 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f11 - ((((-f10) / f12) * f10) / 2.0f)) * f12);
            if (fSqrt < f13) {
                this.f24655k = "backward accelerate, decelerate";
                this.f24654j = 2;
                this.f24645a = f10;
                this.f24646b = fSqrt;
                this.f24647c = 0.0f;
                float f17 = (fSqrt - f10) / f12;
                this.f24648d = f17;
                this.f24649e = fSqrt / f12;
                this.f24651g = ((f10 + fSqrt) * f17) / 2.0f;
                this.f24652h = f11;
                this.f24653i = f11;
                return;
            }
            this.f24655k = "backward accelerate cruse decelerate";
            this.f24654j = 3;
            this.f24645a = f10;
            this.f24646b = f13;
            this.f24647c = f13;
            float f18 = (f13 - f10) / f12;
            this.f24648d = f18;
            float f19 = f13 / f12;
            this.f24650f = f19;
            float f20 = ((f10 + f13) * f18) / 2.0f;
            float f21 = (f19 * f13) / 2.0f;
            this.f24649e = ((f11 - f20) - f21) / f13;
            this.f24651g = f20;
            this.f24652h = f11 - f21;
            this.f24653i = f11;
            return;
        }
        if (f16 >= f11) {
            this.f24655k = "hard stop";
            this.f24654j = 1;
            this.f24645a = f10;
            this.f24646b = 0.0f;
            this.f24651g = f11;
            this.f24648d = (2.0f * f11) / f10;
            return;
        }
        float f22 = f11 - f16;
        float f23 = f22 / f10;
        if (f23 + f15 < f14) {
            this.f24655k = "cruse decelerate";
            this.f24654j = 2;
            this.f24645a = f10;
            this.f24646b = f10;
            this.f24647c = 0.0f;
            this.f24651g = f22;
            this.f24652h = f11;
            this.f24648d = f23;
            this.f24649e = f15;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f12 * f11) + ((f10 * f10) / 2.0f));
        float f24 = (fSqrt2 - f10) / f12;
        this.f24648d = f24;
        float f25 = fSqrt2 / f12;
        this.f24649e = f25;
        if (fSqrt2 < f13) {
            this.f24655k = "accelerate decelerate";
            this.f24654j = 2;
            this.f24645a = f10;
            this.f24646b = fSqrt2;
            this.f24647c = 0.0f;
            this.f24648d = f24;
            this.f24649e = f25;
            this.f24651g = ((f10 + fSqrt2) * f24) / 2.0f;
            this.f24652h = f11;
            return;
        }
        this.f24655k = "accelerate cruse decelerate";
        this.f24654j = 3;
        this.f24645a = f10;
        this.f24646b = f13;
        this.f24647c = f13;
        float f26 = (f13 - f10) / f12;
        this.f24648d = f26;
        float f27 = f13 / f12;
        this.f24650f = f27;
        float f28 = ((f10 + f13) * f26) / 2.0f;
        float f29 = (f27 * f13) / 2.0f;
        this.f24649e = ((f11 - f28) - f29) / f13;
        this.f24651g = f28;
        this.f24652h = f11 - f29;
        this.f24653i = f11;
    }

    @Override // v.m
    public float getInterpolation(float f10) {
        float fC = c(f10);
        this.f24658n = f10;
        return this.f24656l ? this.f24657m - fC : this.f24657m + fC;
    }
}

package r;

/* renamed from: r.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7528f0 {

    /* renamed from: a, reason: collision with root package name */
    private float f59695a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f59697c;

    /* renamed from: d, reason: collision with root package name */
    private double f59698d;

    /* renamed from: e, reason: collision with root package name */
    private double f59699e;

    /* renamed from: f, reason: collision with root package name */
    private double f59700f;

    /* renamed from: b, reason: collision with root package name */
    private double f59696b = Math.sqrt(50.0d);

    /* renamed from: g, reason: collision with root package name */
    private float f59701g = 1.0f;

    public C7528f0(float f10) {
        this.f59695a = f10;
    }

    private final void c() {
        if (this.f59697c) {
            return;
        }
        if (this.f59695a == AbstractC7530g0.b()) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f10 = this.f59701g;
        double d10 = f10 * f10;
        if (f10 > 1.0f) {
            double d11 = this.f59696b;
            double d12 = d10 - 1;
            this.f59698d = ((-f10) * d11) + (d11 * Math.sqrt(d12));
            double d13 = -this.f59701g;
            double d14 = this.f59696b;
            this.f59699e = (d13 * d14) - (d14 * Math.sqrt(d12));
        } else if (f10 >= 0.0f && f10 < 1.0f) {
            this.f59700f = this.f59696b * Math.sqrt(1 - d10);
        }
        this.f59697c = true;
    }

    public final float a() {
        return this.f59701g;
    }

    public final float b() {
        double d10 = this.f59696b;
        return (float) (d10 * d10);
    }

    public final void d(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f59701g = f10;
        this.f59697c = false;
    }

    public final void e(float f10) {
        this.f59695a = f10;
    }

    public final void f(float f10) {
        if (b() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f59696b = Math.sqrt(f10);
        this.f59697c = false;
    }

    public final long g(float f10, float f11, long j10) {
        double dCos;
        double dExp;
        c();
        float f12 = f10 - this.f59695a;
        double d10 = j10 / 1000.0d;
        float f13 = this.f59701g;
        if (f13 > 1.0f) {
            double d11 = f12;
            double d12 = this.f59699e;
            double d13 = f11;
            double d14 = this.f59698d;
            double d15 = d11 - (((d12 * d11) - d13) / (d12 - d14));
            double d16 = ((d11 * d12) - d13) / (d12 - d14);
            dExp = (Math.exp(d12 * d10) * d15) + (Math.exp(this.f59698d * d10) * d16);
            double d17 = this.f59699e;
            double dExp2 = d15 * d17 * Math.exp(d17 * d10);
            double d18 = this.f59698d;
            dCos = dExp2 + (d16 * d18 * Math.exp(d18 * d10));
        } else if (f13 == 1.0f) {
            double d19 = this.f59696b;
            double d20 = f12;
            double d21 = f11 + (d19 * d20);
            double d22 = d20 + (d21 * d10);
            double dExp3 = Math.exp((-d19) * d10) * d22;
            double dExp4 = d22 * Math.exp((-this.f59696b) * d10);
            double d23 = this.f59696b;
            dCos = (dExp4 * (-d23)) + (d21 * Math.exp((-d23) * d10));
            dExp = dExp3;
        } else {
            double d24 = 1 / this.f59700f;
            double d25 = this.f59696b;
            double d26 = f12;
            double d27 = d24 * ((f13 * d25 * d26) + f11);
            double dExp5 = Math.exp((-f13) * d25 * d10) * ((Math.cos(this.f59700f * d10) * d26) + (Math.sin(this.f59700f * d10) * d27));
            double d28 = this.f59696b;
            double d29 = (-d28) * dExp5 * this.f59701g;
            double dExp6 = Math.exp((-r5) * d28 * d10);
            double d30 = this.f59700f;
            double dSin = (-d30) * d26 * Math.sin(d30 * d10);
            double d31 = this.f59700f;
            dCos = d29 + (dExp6 * (dSin + (d27 * d31 * Math.cos(d31 * d10))));
            dExp = dExp5;
        }
        return AbstractC7530g0.a((float) (dExp + this.f59695a), (float) dCos);
    }
}

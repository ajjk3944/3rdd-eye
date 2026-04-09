package d1;

import d1.h;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public double f20649a;

    /* renamed from: b, reason: collision with root package name */
    public double f20650b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20651c;

    /* renamed from: d, reason: collision with root package name */
    public double f20652d;

    /* renamed from: e, reason: collision with root package name */
    public double f20653e;

    /* renamed from: f, reason: collision with root package name */
    public double f20654f;

    /* renamed from: g, reason: collision with root package name */
    public double f20655g;

    /* renamed from: h, reason: collision with root package name */
    public double f20656h;

    /* renamed from: i, reason: collision with root package name */
    public double f20657i;

    /* renamed from: j, reason: collision with root package name */
    public final h.o f20658j;

    public l() {
        this.f20649a = Math.sqrt(1500.0d);
        this.f20650b = 0.5d;
        this.f20651c = false;
        this.f20657i = Double.MAX_VALUE;
        this.f20658j = new h.o();
    }

    public float a() {
        return (float) this.f20650b;
    }

    public float b() {
        return (float) this.f20657i;
    }

    public float c() {
        double d10 = this.f20649a;
        return (float) (d10 * d10);
    }

    public final void d() {
        if (this.f20651c) {
            return;
        }
        if (this.f20657i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.f20650b;
        if (d10 > 1.0d) {
            double d11 = this.f20649a;
            this.f20654f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
            double d12 = this.f20650b;
            double d13 = this.f20649a;
            this.f20655g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
        } else if (d10 >= 0.0d && d10 < 1.0d) {
            this.f20656h = this.f20649a * Math.sqrt(1.0d - (d10 * d10));
        }
        this.f20651c = true;
    }

    public boolean e(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f20653e && ((double) Math.abs(f10 - b())) < this.f20652d;
    }

    public l f(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f20650b = f10;
        this.f20651c = false;
        return this;
    }

    public l g(float f10) {
        this.f20657i = f10;
        return this;
    }

    public l h(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f20649a = Math.sqrt(f10);
        this.f20651c = false;
        return this;
    }

    public void i(double d10) {
        double dAbs = Math.abs(d10);
        this.f20652d = dAbs;
        this.f20653e = dAbs * 62.5d;
    }

    public h.o j(double d10, double d11, long j10) {
        double dPow;
        double dCos;
        d();
        double d12 = j10 / 1000.0d;
        double d13 = d10 - this.f20657i;
        double d14 = this.f20650b;
        if (d14 > 1.0d) {
            double d15 = this.f20655g;
            double d16 = this.f20654f;
            double d17 = d13 - (((d15 * d13) - d11) / (d15 - d16));
            double d18 = ((d13 * d15) - d11) / (d15 - d16);
            dPow = (Math.pow(2.718281828459045d, d15 * d12) * d17) + (Math.pow(2.718281828459045d, this.f20654f * d12) * d18);
            double d19 = this.f20655g;
            double dPow2 = d17 * d19 * Math.pow(2.718281828459045d, d19 * d12);
            double d20 = this.f20654f;
            dCos = dPow2 + (d18 * d20 * Math.pow(2.718281828459045d, d20 * d12));
        } else if (d14 == 1.0d) {
            double d21 = this.f20649a;
            double d22 = d11 + (d21 * d13);
            double d23 = d13 + (d22 * d12);
            dPow = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double dPow3 = d23 * Math.pow(2.718281828459045d, (-this.f20649a) * d12);
            double d24 = this.f20649a;
            dCos = (d22 * Math.pow(2.718281828459045d, (-d24) * d12)) + (dPow3 * (-d24));
        } else {
            double d25 = 1.0d / this.f20656h;
            double d26 = this.f20649a;
            double d27 = d25 * ((d14 * d26 * d13) + d11);
            dPow = Math.pow(2.718281828459045d, (-d14) * d26 * d12) * ((Math.cos(this.f20656h * d12) * d13) + (Math.sin(this.f20656h * d12) * d27));
            double d28 = this.f20649a;
            double d29 = this.f20650b;
            double dPow4 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d30 = this.f20656h;
            double dSin = (-d30) * d13 * Math.sin(d30 * d12);
            double d31 = this.f20656h;
            dCos = ((-d28) * dPow * d29) + (dPow4 * (dSin + (d27 * d31 * Math.cos(d31 * d12))));
        }
        h.o oVar = this.f20658j;
        oVar.f20646a = (float) (dPow + this.f20657i);
        oVar.f20647b = (float) dCos;
        return oVar;
    }

    public l(float f10) {
        this.f20649a = Math.sqrt(1500.0d);
        this.f20650b = 0.5d;
        this.f20651c = false;
        this.f20657i = Double.MAX_VALUE;
        this.f20658j = new h.o();
        this.f20657i = f10;
    }
}

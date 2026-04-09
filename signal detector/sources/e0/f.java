package e0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public double f19887a;

    /* renamed from: b, reason: collision with root package name */
    public double f19888b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19889c;

    /* renamed from: d, reason: collision with root package name */
    public double f19890d;

    /* renamed from: e, reason: collision with root package name */
    public double f19891e;

    /* renamed from: f, reason: collision with root package name */
    public double f19892f;

    /* renamed from: g, reason: collision with root package name */
    public double f19893g;

    /* renamed from: h, reason: collision with root package name */
    public double f19894h;
    public double i;

    /* renamed from: j, reason: collision with root package name */
    public final C2296d f19895j;

    public f() {
        this.f19887a = Math.sqrt(1500.0d);
        this.f19888b = 0.5d;
        this.f19889c = false;
        this.i = Double.MAX_VALUE;
        this.f19895j = new C2296d();
    }

    public final void a(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f19888b = f2;
        this.f19889c = false;
    }

    public final void b(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f19887a = Math.sqrt(f2);
        this.f19889c = false;
    }

    public final C2296d c(double d6, double d7, long j6) {
        double dSin;
        double dCos;
        if (!this.f19889c) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d8 = this.f19888b;
            if (d8 > 1.0d) {
                double d9 = this.f19887a;
                this.f19892f = (Math.sqrt((d8 * d8) - 1.0d) * d9) + ((-d8) * d9);
                double d10 = this.f19888b;
                double d11 = this.f19887a;
                this.f19893g = ((-d10) * d11) - (Math.sqrt((d10 * d10) - 1.0d) * d11);
            } else if (d8 >= 0.0d && d8 < 1.0d) {
                this.f19894h = Math.sqrt(1.0d - (d8 * d8)) * this.f19887a;
            }
            this.f19889c = true;
        }
        double d12 = j6 / 1000.0d;
        double d13 = d6 - this.i;
        double d14 = this.f19888b;
        if (d14 > 1.0d) {
            double d15 = this.f19893g;
            double d16 = ((d15 * d13) - d7) / (d15 - this.f19892f);
            double d17 = d13 - d16;
            dSin = (Math.pow(2.718281828459045d, this.f19892f * d12) * d16) + (Math.pow(2.718281828459045d, d15 * d12) * d17);
            double d18 = this.f19893g;
            double dPow = Math.pow(2.718281828459045d, d18 * d12) * d17 * d18;
            double d19 = this.f19892f;
            dCos = (Math.pow(2.718281828459045d, d19 * d12) * d16 * d19) + dPow;
        } else if (d14 == 1.0d) {
            double d20 = this.f19887a;
            double d21 = (d20 * d13) + d7;
            double d22 = (d21 * d12) + d13;
            double dPow2 = Math.pow(2.718281828459045d, (-d20) * d12) * d22;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f19887a) * d12) * d22;
            double d23 = -this.f19887a;
            dCos = (Math.pow(2.718281828459045d, d23 * d12) * d21) + (dPow3 * d23);
            dSin = dPow2;
        } else {
            double d24 = 1.0d / this.f19894h;
            double d25 = this.f19887a;
            double d26 = ((d14 * d25 * d13) + d7) * d24;
            dSin = ((Math.sin(this.f19894h * d12) * d26) + (Math.cos(this.f19894h * d12) * d13)) * Math.pow(2.718281828459045d, (-d14) * d25 * d12);
            double d27 = this.f19887a;
            double d28 = this.f19888b;
            double d29 = (-d27) * dSin * d28;
            double dPow4 = Math.pow(2.718281828459045d, (-d28) * d27 * d12);
            double d30 = this.f19894h;
            double dSin2 = Math.sin(d30 * d12) * (-d30) * d13;
            double d31 = this.f19894h;
            dCos = (((Math.cos(d31 * d12) * d26 * d31) + dSin2) * dPow4) + d29;
        }
        float f2 = (float) (dSin + this.i);
        C2296d c2296d = this.f19895j;
        c2296d.f19867a = f2;
        c2296d.f19868b = (float) dCos;
        return c2296d;
    }

    public f(float f2) {
        this.f19887a = Math.sqrt(1500.0d);
        this.f19888b = 0.5d;
        this.f19889c = false;
        this.f19895j = new C2296d();
        this.i = f2;
    }
}

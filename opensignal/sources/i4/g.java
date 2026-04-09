package i4;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public double f11229a;

    /* renamed from: b, reason: collision with root package name */
    public double f11230b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11231c;

    /* renamed from: d, reason: collision with root package name */
    public double f11232d;

    /* renamed from: e, reason: collision with root package name */
    public double f11233e;

    /* renamed from: f, reason: collision with root package name */
    public double f11234f;

    /* renamed from: g, reason: collision with root package name */
    public double f11235g;

    /* renamed from: h, reason: collision with root package name */
    public double f11236h;

    /* renamed from: i, reason: collision with root package name */
    public double f11237i;
    public final e j;

    public g() {
        this.f11229a = Math.sqrt(1500.0d);
        this.f11230b = 0.5d;
        this.f11231c = false;
        this.f11237i = Double.MAX_VALUE;
        this.j = new e();
    }

    public final void a(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f11230b = f10;
        this.f11231c = false;
    }

    public final void b(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f11229a = Math.sqrt(f10);
        this.f11231c = false;
    }

    public final e c(double d6, double d10, long j) {
        double dSin;
        double dCos;
        if (!this.f11231c) {
            if (this.f11237i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d11 = this.f11230b;
            if (d11 > 1.0d) {
                double d12 = this.f11229a;
                this.f11234f = (Math.sqrt((d11 * d11) - 1.0d) * d12) + ((-d11) * d12);
                double d13 = this.f11230b;
                double d14 = this.f11229a;
                this.f11235g = ((-d13) * d14) - (Math.sqrt((d13 * d13) - 1.0d) * d14);
            } else if (d11 >= 0.0d && d11 < 1.0d) {
                this.f11236h = Math.sqrt(1.0d - (d11 * d11)) * this.f11229a;
            }
            this.f11231c = true;
        }
        double d15 = j / 1000.0d;
        double d16 = d6 - this.f11237i;
        double d17 = this.f11230b;
        if (d17 > 1.0d) {
            double d18 = this.f11235g;
            double d19 = ((d18 * d16) - d10) / (d18 - this.f11234f);
            double d20 = d16 - d19;
            dSin = (Math.pow(2.718281828459045d, this.f11234f * d15) * d19) + (Math.pow(2.718281828459045d, d18 * d15) * d20);
            double d21 = this.f11235g;
            double dPow = Math.pow(2.718281828459045d, d21 * d15) * d20 * d21;
            double d22 = this.f11234f;
            dCos = (Math.pow(2.718281828459045d, d22 * d15) * d19 * d22) + dPow;
        } else if (d17 == 1.0d) {
            double d23 = this.f11229a;
            double d24 = (d23 * d16) + d10;
            double d25 = (d24 * d15) + d16;
            double dPow2 = Math.pow(2.718281828459045d, (-d23) * d15) * d25;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f11229a) * d15) * d25;
            double d26 = -this.f11229a;
            dCos = (Math.pow(2.718281828459045d, d26 * d15) * d24) + (dPow3 * d26);
            dSin = dPow2;
        } else {
            double d27 = 1.0d / this.f11236h;
            double d28 = this.f11229a;
            double d29 = ((d17 * d28 * d16) + d10) * d27;
            dSin = ((Math.sin(this.f11236h * d15) * d29) + (Math.cos(this.f11236h * d15) * d16)) * Math.pow(2.718281828459045d, (-d17) * d28 * d15);
            double d30 = this.f11229a;
            double d31 = this.f11230b;
            double d32 = (-d30) * dSin * d31;
            double dPow4 = Math.pow(2.718281828459045d, (-d31) * d30 * d15);
            double d33 = this.f11236h;
            double dSin2 = Math.sin(d33 * d15) * (-d33) * d16;
            double d34 = this.f11236h;
            dCos = (((Math.cos(d34 * d15) * d29 * d34) + dSin2) * dPow4) + d32;
        }
        float f10 = (float) (dSin + this.f11237i);
        e eVar = this.j;
        eVar.f11208a = f10;
        eVar.f11209b = (float) dCos;
        return eVar;
    }

    public g(float f10) {
        this.f11229a = Math.sqrt(1500.0d);
        this.f11230b = 0.5d;
        this.f11231c = false;
        this.j = new e();
        this.f11237i = f10;
    }
}

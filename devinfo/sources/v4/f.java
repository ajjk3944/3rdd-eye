package v4;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public double f35848a;

    /* renamed from: b, reason: collision with root package name */
    public double f35849b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f35850c;

    /* renamed from: d, reason: collision with root package name */
    public double f35851d;

    /* renamed from: e, reason: collision with root package name */
    public double f35852e;

    /* renamed from: f, reason: collision with root package name */
    public double f35853f;
    public double g;

    /* renamed from: h, reason: collision with root package name */
    public double f35854h;

    /* renamed from: i, reason: collision with root package name */
    public double f35855i;
    public final qc.e j;

    public f() {
        this.f35848a = Math.sqrt(1500.0d);
        this.f35849b = 0.5d;
        this.f35850c = false;
        this.f35855i = Double.MAX_VALUE;
        this.j = new qc.e();
    }

    public final void a(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f35849b = f10;
        this.f35850c = false;
    }

    public final void b(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f35848a = Math.sqrt(f10);
        this.f35850c = false;
    }

    public final qc.e c(double d10, double d11, long j) {
        double dSin;
        double dCos;
        if (!this.f35850c) {
            if (this.f35855i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d12 = this.f35849b;
            if (d12 > 1.0d) {
                double d13 = this.f35848a;
                this.f35853f = (Math.sqrt((d12 * d12) - 1.0d) * d13) + ((-d12) * d13);
                double d14 = this.f35849b;
                double d15 = this.f35848a;
                this.g = ((-d14) * d15) - (Math.sqrt((d14 * d14) - 1.0d) * d15);
            } else if (d12 >= 0.0d && d12 < 1.0d) {
                this.f35854h = Math.sqrt(1.0d - (d12 * d12)) * this.f35848a;
            }
            this.f35850c = true;
        }
        double d16 = j / 1000.0d;
        double d17 = d10 - this.f35855i;
        double d18 = this.f35849b;
        if (d18 > 1.0d) {
            double d19 = this.g;
            double d20 = ((d19 * d17) - d11) / (d19 - this.f35853f);
            double d21 = d17 - d20;
            dSin = (Math.pow(2.718281828459045d, this.f35853f * d16) * d20) + (Math.pow(2.718281828459045d, d19 * d16) * d21);
            double d22 = this.g;
            double dPow = Math.pow(2.718281828459045d, d22 * d16) * d21 * d22;
            double d23 = this.f35853f;
            dCos = (Math.pow(2.718281828459045d, d23 * d16) * d20 * d23) + dPow;
        } else if (d18 == 1.0d) {
            double d24 = this.f35848a;
            double d25 = (d24 * d17) + d11;
            double d26 = (d25 * d16) + d17;
            double dPow2 = Math.pow(2.718281828459045d, (-d24) * d16) * d26;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f35848a) * d16) * d26;
            double d27 = -this.f35848a;
            dCos = (Math.pow(2.718281828459045d, d27 * d16) * d25) + (dPow3 * d27);
            dSin = dPow2;
        } else {
            double d28 = 1.0d / this.f35854h;
            double d29 = this.f35848a;
            double d30 = ((d18 * d29 * d17) + d11) * d28;
            dSin = ((Math.sin(this.f35854h * d16) * d30) + (Math.cos(this.f35854h * d16) * d17)) * Math.pow(2.718281828459045d, (-d18) * d29 * d16);
            double d31 = this.f35848a;
            double d32 = this.f35849b;
            double d33 = (-d31) * dSin * d32;
            double dPow4 = Math.pow(2.718281828459045d, (-d32) * d31 * d16);
            double d34 = this.f35854h;
            double dSin2 = Math.sin(d34 * d16) * (-d34) * d17;
            double d35 = this.f35854h;
            dCos = (((Math.cos(d35 * d16) * d30 * d35) + dSin2) * dPow4) + d33;
        }
        float f10 = (float) (dSin + this.f35855i);
        qc.e eVar = this.j;
        eVar.f32238a = f10;
        eVar.f32239b = (float) dCos;
        return eVar;
    }

    public f(float f10) {
        this.f35848a = Math.sqrt(1500.0d);
        this.f35849b = 0.5d;
        this.f35850c = false;
        this.j = new qc.e();
        this.f35855i = f10;
    }
}

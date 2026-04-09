package h9;

/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f10393a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10394b;

    /* renamed from: c, reason: collision with root package name */
    public float f10395c;

    /* renamed from: d, reason: collision with root package name */
    public float f10396d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10397e = false;

    public k2(float f10, float f11, float f12, float f13) {
        this.f10395c = 0.0f;
        this.f10396d = 0.0f;
        this.f10393a = f10;
        this.f10394b = f11;
        double dSqrt = Math.sqrt((f13 * f13) + (f12 * f12));
        if (dSqrt != 0.0d) {
            this.f10395c = (float) (f12 / dSqrt);
            this.f10396d = (float) (f13 / dSqrt);
        }
    }

    public final void a(float f10, float f11) {
        float f12 = f10 - this.f10393a;
        float f13 = f11 - this.f10394b;
        double dSqrt = Math.sqrt((f13 * f13) + (f12 * f12));
        if (dSqrt != 0.0d) {
            f12 = (float) (f12 / dSqrt);
            f13 = (float) (f13 / dSqrt);
        }
        float f14 = this.f10395c;
        if (f12 != (-f14) || f13 != (-this.f10396d)) {
            this.f10395c = f14 + f12;
            this.f10396d += f13;
        } else {
            this.f10397e = true;
            this.f10395c = -f13;
            this.f10396d = f12;
        }
    }

    public final void b(k2 k2Var) {
        float f10 = k2Var.f10395c;
        float f11 = this.f10395c;
        if (f10 == (-f11)) {
            float f12 = k2Var.f10396d;
            if (f12 == (-this.f10396d)) {
                this.f10397e = true;
                this.f10395c = -f12;
                this.f10396d = k2Var.f10395c;
                return;
            }
        }
        this.f10395c = f11 + f10;
        this.f10396d += k2Var.f10396d;
    }

    public final String toString() {
        return "(" + this.f10393a + "," + this.f10394b + " " + this.f10395c + "," + this.f10396d + ")";
    }
}

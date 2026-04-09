package q;

import sh.AbstractC7978m;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7382a {

    /* renamed from: a, reason: collision with root package name */
    public static final C7382a f58203a = new C7382a();

    /* renamed from: b, reason: collision with root package name */
    private static final float[] f58204b;

    /* renamed from: c, reason: collision with root package name */
    private static final float[] f58205c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f58206d;

    /* renamed from: q.a$a, reason: collision with other inner class name */
    public static final class C2048a {

        /* renamed from: a, reason: collision with root package name */
        private final float f58207a;

        /* renamed from: b, reason: collision with root package name */
        private final float f58208b;

        public C2048a(float f10, float f11) {
            this.f58207a = f10;
            this.f58208b = f11;
        }

        public final float a() {
            return this.f58207a;
        }

        public final float b() {
            return this.f58208b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2048a)) {
                return false;
            }
            C2048a c2048a = (C2048a) obj;
            return Float.compare(this.f58207a, c2048a.f58207a) == 0 && Float.compare(this.f58208b, c2048a.f58208b) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f58207a) * 31) + Float.hashCode(this.f58208b);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f58207a + ", velocityCoefficient=" + this.f58208b + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        f58204b = fArr;
        float[] fArr2 = new float[101];
        f58205c = fArr2;
        AbstractC7405x.b(fArr, fArr2, 100);
        f58206d = 8;
    }

    private C7382a() {
    }

    public final double a(float f10, float f11) {
        return Math.log((Math.abs(f10) * 0.35f) / f11);
    }

    public final C2048a b(float f10) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        float fJ = AbstractC7978m.j(f10, 0.0f, 1.0f);
        float f13 = 100;
        int i10 = (int) (f13 * fJ);
        if (i10 < 100) {
            float f14 = i10 / f13;
            int i11 = i10 + 1;
            float f15 = i11 / f13;
            float[] fArr = f58204b;
            float f16 = fArr[i10];
            float f17 = (fArr[i11] - f16) / (f15 - f14);
            float f18 = ((fJ - f14) * f17) + f16;
            f11 = f17;
            f12 = f18;
        }
        return new C2048a(f12, f11);
    }
}

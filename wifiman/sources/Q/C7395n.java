package q;

/* renamed from: q.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7395n {

    /* renamed from: a, reason: collision with root package name */
    private final float f58314a;

    /* renamed from: b, reason: collision with root package name */
    private final Y0.d f58315b;

    /* renamed from: c, reason: collision with root package name */
    private final float f58316c;

    /* renamed from: q.n$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final float f58317a;

        /* renamed from: b, reason: collision with root package name */
        private final float f58318b;

        /* renamed from: c, reason: collision with root package name */
        private final long f58319c;

        public a(float f10, float f11, long j10) {
            this.f58317a = f10;
            this.f58318b = f11;
            this.f58319c = j10;
        }

        public final float a(long j10) {
            long j11 = this.f58319c;
            return this.f58318b * Math.signum(this.f58317a) * C7382a.f58203a.b(j11 > 0 ? j10 / j11 : 1.0f).a();
        }

        public final float b(long j10) {
            long j11 = this.f58319c;
            return (((C7382a.f58203a.b(j11 > 0 ? j10 / j11 : 1.0f).b() * Math.signum(this.f58317a)) * this.f58318b) / this.f58319c) * 1000.0f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f58317a, aVar.f58317a) == 0 && Float.compare(this.f58318b, aVar.f58318b) == 0 && this.f58319c == aVar.f58319c;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f58317a) * 31) + Float.hashCode(this.f58318b)) * 31) + Long.hashCode(this.f58319c);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f58317a + ", distance=" + this.f58318b + ", duration=" + this.f58319c + ')';
        }
    }

    public C7395n(float f10, Y0.d dVar) {
        this.f58314a = f10;
        this.f58315b = dVar;
        this.f58316c = a(dVar);
    }

    private final float a(Y0.d dVar) {
        return AbstractC7396o.c(0.84f, dVar.getDensity());
    }

    private final double e(float f10) {
        return C7382a.f58203a.a(f10, this.f58314a * this.f58316c);
    }

    public final float b(float f10) {
        return (float) (this.f58314a * this.f58316c * Math.exp((AbstractC7396o.f58320a / (AbstractC7396o.f58320a - 1.0d)) * e(f10)));
    }

    public final long c(float f10) {
        return (long) (Math.exp(e(f10) / (AbstractC7396o.f58320a - 1.0d)) * 1000.0d);
    }

    public final a d(float f10) {
        double dE = e(f10);
        double d10 = AbstractC7396o.f58320a - 1.0d;
        return new a(f10, (float) (this.f58314a * this.f58316c * Math.exp((AbstractC7396o.f58320a / d10) * dE)), (long) (Math.exp(dE / d10) * 1000.0d));
    }
}

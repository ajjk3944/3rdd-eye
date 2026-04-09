package f0;

import Y0.o;
import Y0.r;
import Y0.s;
import Y0.t;
import f0.c;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    private final float f46590b;

    /* renamed from: c, reason: collision with root package name */
    private final float f46591c;

    public static final class a implements c.b {

        /* renamed from: a, reason: collision with root package name */
        private final float f46592a;

        public a(float f10) {
            this.f46592a = f10;
        }

        @Override // f0.c.b
        public int a(int i10, int i11, t tVar) {
            return Math.round(((i11 - i10) / 2.0f) * (1 + this.f46592a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f46592a, ((a) obj).f46592a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f46592a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f46592a + ')';
        }
    }

    public d(float f10, float f11) {
        this.f46590b = f10;
        this.f46591c = f11;
    }

    @Override // f0.c
    public long a(long j10, long j11, t tVar) {
        long jA = s.a(r.g(j11) - r.g(j10), r.f(j11) - r.f(j10));
        float f10 = 1;
        return o.a(Math.round((r.g(jA) / 2.0f) * (this.f46590b + f10)), Math.round((r.f(jA) / 2.0f) * (f10 + this.f46591c)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f46590b, dVar.f46590b) == 0 && Float.compare(this.f46591c, dVar.f46591c) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f46590b) * 31) + Float.hashCode(this.f46591c);
    }

    public String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f46590b + ", verticalBias=" + this.f46591c + ')';
    }
}

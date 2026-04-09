package Ia;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final a f9004a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final double f9005a;

        /* renamed from: b, reason: collision with root package name */
        private final double f9006b;

        public a(double d10, double d11) {
            this.f9005a = d10;
            this.f9006b = d11;
        }

        public final double a() {
            return this.f9005a;
        }

        public final double b() {
            return this.f9006b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.f9005a, aVar.f9005a) == 0 && Double.compare(this.f9006b, aVar.f9006b) == 0;
        }

        public int hashCode() {
            return (Double.hashCode(this.f9005a) * 31) + Double.hashCode(this.f9006b);
        }

        public String toString() {
            return "Coordinates(latitude=" + this.f9005a + ", longitude=" + this.f9006b + ")";
        }
    }

    public d(a aVar) {
        this.f9004a = aVar;
    }

    public final a a() {
        return this.f9004a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && AbstractC6492s.d(this.f9004a, ((d) obj).f9004a);
    }

    public int hashCode() {
        a aVar = this.f9004a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public String toString() {
        return "Params(coordinates=" + this.f9004a + ")";
    }
}

package W7;

import android.location.Location;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final a f23680a;

    /* renamed from: b, reason: collision with root package name */
    private final Double f23681b;

    /* renamed from: c, reason: collision with root package name */
    private final Location f23682c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final double f23683a;

        /* renamed from: b, reason: collision with root package name */
        private final double f23684b;

        public a(double d10, double d11) {
            this.f23683a = d10;
            this.f23684b = d11;
        }

        public final double a() {
            return this.f23683a;
        }

        public final double b() {
            return this.f23684b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.f23683a, aVar.f23683a) == 0 && Double.compare(this.f23684b, aVar.f23684b) == 0;
        }

        public int hashCode() {
            return (Double.hashCode(this.f23683a) * 31) + Double.hashCode(this.f23684b);
        }

        public String toString() {
            return "Coordinates(latitude=" + this.f23683a + ", longitude=" + this.f23684b + ")";
        }
    }

    public c(a coordinates, Double d10) {
        AbstractC6492s.i(coordinates, "coordinates");
        this.f23680a = coordinates;
        this.f23681b = d10;
        Location location = new Location("");
        location.setLongitude(coordinates.b());
        location.setLatitude(coordinates.a());
        this.f23682c = location;
    }

    public final float a(c other) {
        AbstractC6492s.i(other, "other");
        Location location = this.f23682c;
        Location location2 = new Location("");
        location2.setLongitude(other.f23680a.b());
        location2.setLatitude(other.f23680a.a());
        return location.distanceTo(location2);
    }

    public final a b() {
        return this.f23680a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC6492s.d(this.f23680a, cVar.f23680a) && AbstractC6492s.d(this.f23681b, cVar.f23681b);
    }

    public int hashCode() {
        int iHashCode = this.f23680a.hashCode() * 31;
        Double d10 = this.f23681b;
        return iHashCode + (d10 == null ? 0 : d10.hashCode());
    }

    public String toString() {
        return "Location(coordinates=" + this.f23680a + ", accuracy=" + this.f23681b + ")";
    }

    public /* synthetic */ c(a aVar, Double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? null : d10);
    }
}

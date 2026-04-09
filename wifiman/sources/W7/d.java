package W7;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f23685a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23686b;

    public d(int i10, int i11) {
        this.f23685a = i10;
        this.f23686b = i11;
    }

    public final int a() {
        return this.f23685a;
    }

    public final int b() {
        return this.f23686b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f23685a == dVar.f23685a && this.f23686b == dVar.f23686b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f23685a) * 31) + Integer.hashCode(this.f23686b);
    }

    public String toString() {
        return "MatrixPoint2D(x=" + this.f23685a + ", y=" + this.f23686b + ")";
    }
}

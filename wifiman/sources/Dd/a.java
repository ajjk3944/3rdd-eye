package Dd;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f3285a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3286b;

    public a(boolean z10, boolean z11) {
        this.f3285a = z10;
        this.f3286b = z11;
    }

    public static /* synthetic */ a b(a aVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f3285a;
        }
        if ((i10 & 2) != 0) {
            z11 = aVar.f3286b;
        }
        return aVar.a(z10, z11);
    }

    public final a a(boolean z10, boolean z11) {
        return new a(z10, z11);
    }

    public final boolean c() {
        return this.f3286b;
    }

    public final boolean d() {
        return this.f3285a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3285a == aVar.f3285a && this.f3286b == aVar.f3286b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f3285a) * 31) + Boolean.hashCode(this.f3286b);
    }

    public String toString() {
        return "SpeedtestSettings(uispReportingEnabled=" + this.f3285a + ", advancedTestEnabled=" + this.f3286b + ")";
    }
}

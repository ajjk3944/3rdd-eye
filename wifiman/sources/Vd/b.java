package Vd;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23366a;

    public b(boolean z10) {
        this.f23366a = z10;
    }

    public final boolean a() {
        return this.f23366a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f23366a == ((b) obj).f23366a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f23366a);
    }

    public String toString() {
        return "UnifiConsoleFeatures(speedTest=" + this.f23366a + ")";
    }
}

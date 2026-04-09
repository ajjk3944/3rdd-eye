package We;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f23887a;

    public a(long j10) {
        this.f23887a = j10;
    }

    public final long a() {
        return this.f23887a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f23887a == ((a) obj).f23887a;
    }

    public int hashCode() {
        return Long.hashCode(this.f23887a);
    }

    public String toString() {
        return "Params(id=" + this.f23887a + ")";
    }
}

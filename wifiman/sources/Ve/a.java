package Ve;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f23378a;

    public a(long j10) {
        this.f23378a = j10;
    }

    public final long a() {
        return this.f23378a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f23378a == ((a) obj).f23378a;
    }

    public int hashCode() {
        return Long.hashCode(this.f23378a);
    }

    public String toString() {
        return "Params(id=" + this.f23378a + ")";
    }
}

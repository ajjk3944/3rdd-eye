package Xe;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f24312a;

    public a(long j10) {
        this.f24312a = j10;
    }

    public final long a() {
        return this.f24312a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f24312a == ((a) obj).f24312a;
    }

    public int hashCode() {
        return Long.hashCode(this.f24312a);
    }

    public String toString() {
        return "Params(id=" + this.f24312a + ")";
    }
}

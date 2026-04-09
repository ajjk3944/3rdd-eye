package ob;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f19215a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19216b;

    public a(long j, long j7) {
        this.f19215a = j;
        this.f19216b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19215a == aVar.f19215a && this.f19216b == aVar.f19216b;
    }

    public final int hashCode() {
        return (((int) this.f19215a) * 31) + ((int) this.f19216b);
    }
}

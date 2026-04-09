package androidx.media3.exoplayer.trackselection;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f1858a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1859b;

    public a(long j, long j7) {
        this.f1858a = j;
        this.f1859b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1858a == aVar.f1858a && this.f1859b == aVar.f1859b;
    }

    public final int hashCode() {
        return (((int) this.f1858a) * 31) + ((int) this.f1859b);
    }
}

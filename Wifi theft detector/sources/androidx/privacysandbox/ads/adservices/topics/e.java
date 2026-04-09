package androidx.privacysandbox.ads.adservices.topics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f3583a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3584b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3585c;

    public e(long j10, long j11, int i10) {
        this.f3583a = j10;
        this.f3584b = j11;
        this.f3585c = i10;
    }

    public final long a() {
        return this.f3584b;
    }

    public final long b() {
        return this.f3583a;
    }

    public final int c() {
        return this.f3585c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f3583a == eVar.f3583a && this.f3584b == eVar.f3584b && this.f3585c == eVar.f3585c;
    }

    public int hashCode() {
        return (((d.a(this.f3583a) * 31) + d.a(this.f3584b)) * 31) + this.f3585c;
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.f3583a + ", ModelVersion=" + this.f3584b + ", TopicCode=" + this.f3585c + " }");
    }
}

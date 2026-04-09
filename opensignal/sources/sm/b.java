package sm;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f22108a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22109b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22110c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22111d;

    public b(long j, long j7, long j10, long j11) {
        this.f22108a = j;
        this.f22109b = j7;
        this.f22110c = j10;
        this.f22111d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f22108a == bVar.f22108a && this.f22109b == bVar.f22109b && this.f22110c == bVar.f22110c && this.f22111d == bVar.f22111d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22111d) + h0.b.b(h0.b.b(Long.hashCode(this.f22108a) * 31, 31, this.f22109b), 31, this.f22110c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataUsage(downloadWifi=");
        sb2.append(this.f22108a);
        sb2.append(", uploadWifi=");
        sb2.append(this.f22109b);
        sb2.append(", downloadCell=");
        sb2.append(this.f22110c);
        sb2.append(", uploadCell=");
        return w.g.h(sb2, this.f22111d, ')');
    }
}

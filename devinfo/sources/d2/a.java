package d2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f21936a;

    /* renamed from: b, reason: collision with root package name */
    public float f21937b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f21936a == aVar.f21936a && Float.compare(this.f21937b, aVar.f21937b) == 0;
    }

    public final int hashCode() {
        long j = this.f21936a;
        return Float.floatToIntBits(this.f21937b) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f21936a);
        sb2.append(", dataPoint=");
        return r5.c.k(sb2, this.f21937b, ')');
    }
}

package kf;

/* loaded from: classes.dex */
public final class b extends m {

    /* renamed from: b, reason: collision with root package name */
    public final String f14299b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14300c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14301d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14302e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14303f;

    public b(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f14299b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f14300c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f14301d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f14302e = str4;
        this.f14303f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            b bVar = (b) ((m) obj);
            if (this.f14299b.equals(bVar.f14299b) && this.f14300c.equals(bVar.f14300c) && this.f14301d.equals(bVar.f14301d) && this.f14302e.equals(bVar.f14302e) && this.f14303f == bVar.f14303f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f14299b.hashCode() ^ 1000003) * 1000003) ^ this.f14300c.hashCode()) * 1000003) ^ this.f14301d.hashCode()) * 1000003) ^ this.f14302e.hashCode()) * 1000003;
        long j = this.f14303f;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f14299b);
        sb2.append(", parameterKey=");
        sb2.append(this.f14300c);
        sb2.append(", parameterValue=");
        sb2.append(this.f14301d);
        sb2.append(", variantId=");
        sb2.append(this.f14302e);
        sb2.append(", templateVersion=");
        return c7.a.n(this.f14303f, "}", sb2);
    }
}

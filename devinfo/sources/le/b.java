package le;

import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends n {

    /* renamed from: b, reason: collision with root package name */
    public final String f28703b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28704c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28705d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28706e;

    /* renamed from: f, reason: collision with root package name */
    public final long f28707f;

    public b(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f28703b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f28704c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f28705d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f28706e = str4;
        this.f28707f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            b bVar = (b) ((n) obj);
            if (this.f28703b.equals(bVar.f28703b) && this.f28704c.equals(bVar.f28704c) && this.f28705d.equals(bVar.f28705d) && this.f28706e.equals(bVar.f28706e) && this.f28707f == bVar.f28707f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f28703b.hashCode() ^ 1000003) * 1000003) ^ this.f28704c.hashCode()) * 1000003) ^ this.f28705d.hashCode()) * 1000003) ^ this.f28706e.hashCode()) * 1000003;
        long j = this.f28707f;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f28703b);
        sb2.append(", parameterKey=");
        sb2.append(this.f28704c);
        sb2.append(", parameterValue=");
        sb2.append(this.f28705d);
        sb2.append(", variantId=");
        sb2.append(this.f28706e);
        sb2.append(", templateVersion=");
        return u.s(this.f28707f, "}", sb2);
    }
}

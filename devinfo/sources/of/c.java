package of;

import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    public final String f30539b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30540c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30541d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30542e;

    /* renamed from: f, reason: collision with root package name */
    public final long f30543f;

    public c(String str, String str2, String str3, String str4, long j) {
        this.f30539b = str;
        this.f30540c = str2;
        this.f30541d = str3;
        this.f30542e = str4;
        this.f30543f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            c cVar = (c) ((e) obj);
            if (this.f30539b.equals(cVar.f30539b) && this.f30540c.equals(cVar.f30540c) && this.f30541d.equals(cVar.f30541d) && this.f30542e.equals(cVar.f30542e) && this.f30543f == cVar.f30543f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f30539b.hashCode() ^ 1000003) * 1000003) ^ this.f30540c.hashCode()) * 1000003) ^ this.f30541d.hashCode()) * 1000003) ^ this.f30542e.hashCode()) * 1000003;
        long j = this.f30543f;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f30539b);
        sb2.append(", variantId=");
        sb2.append(this.f30540c);
        sb2.append(", parameterKey=");
        sb2.append(this.f30541d);
        sb2.append(", parameterValue=");
        sb2.append(this.f30542e);
        sb2.append(", templateVersion=");
        return u.s(this.f30543f, "}", sb2);
    }
}

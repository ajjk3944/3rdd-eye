package sg;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    public final String f22040b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22041c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22042d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22043e;

    /* renamed from: f, reason: collision with root package name */
    public final long f22044f;

    public c(String str, String str2, String str3, String str4, long j) {
        this.f22040b = str;
        this.f22041c = str2;
        this.f22042d = str3;
        this.f22043e = str4;
        this.f22044f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            c cVar = (c) ((e) obj);
            if (this.f22040b.equals(cVar.f22040b) && this.f22041c.equals(cVar.f22041c) && this.f22042d.equals(cVar.f22042d) && this.f22043e.equals(cVar.f22043e) && this.f22044f == cVar.f22044f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f22040b.hashCode() ^ 1000003) * 1000003) ^ this.f22041c.hashCode()) * 1000003) ^ this.f22042d.hashCode()) * 1000003) ^ this.f22043e.hashCode()) * 1000003;
        long j = this.f22044f;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f22040b);
        sb2.append(", variantId=");
        sb2.append(this.f22041c);
        sb2.append(", parameterKey=");
        sb2.append(this.f22042d);
        sb2.append(", parameterValue=");
        sb2.append(this.f22043e);
        sb2.append(", templateVersion=");
        return c7.a.n(this.f22044f, "}", sb2);
    }
}

package hg;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f10738a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10739b;

    /* renamed from: c, reason: collision with root package name */
    public final f f10740c;

    public b(String str, long j, f fVar) {
        this.f10738a = str;
        this.f10739b = j;
        this.f10740c = fVar;
    }

    public final boolean equals(Object obj) {
        f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            f fVar2 = bVar.f10740c;
            String str = bVar.f10738a;
            String str2 = this.f10738a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f10739b == bVar.f10739b && ((fVar = this.f10740c) != null ? fVar.equals(fVar2) : fVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10738a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f10739b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        f fVar = this.f10740c;
        return (fVar != null ? fVar.hashCode() : 0) ^ i10;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f10738a + ", tokenExpirationTimestamp=" + this.f10739b + ", responseCode=" + this.f10740c + "}";
    }
}

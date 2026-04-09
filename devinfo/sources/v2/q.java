package v2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final p f35784a;

    /* renamed from: b, reason: collision with root package name */
    public final k f35785b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35786c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35787d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f35788e;

    public q(p pVar, k kVar, int i4, int i10, Object obj) {
        this.f35784a = pVar;
        this.f35785b = kVar;
        this.f35786c = i4;
        this.f35787d = i10;
        this.f35788e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return nk.k.a(this.f35784a, qVar.f35784a) && nk.k.a(this.f35785b, qVar.f35785b) && this.f35786c == qVar.f35786c && this.f35787d == qVar.f35787d && nk.k.a(this.f35788e, qVar.f35788e);
    }

    public final int hashCode() {
        p pVar = this.f35784a;
        int iHashCode = (((((((pVar == null ? 0 : pVar.hashCode()) * 31) + this.f35785b.f35780a) * 31) + this.f35786c) * 31) + this.f35787d) * 31;
        Object obj = this.f35788e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.f35784a);
        sb2.append(", fontWeight=");
        sb2.append(this.f35785b);
        sb2.append(", fontStyle=");
        String str = "Invalid";
        int i4 = this.f35786c;
        sb2.append((Object) (i4 == 0 ? "Normal" : i4 == 1 ? "Italic" : "Invalid"));
        sb2.append(", fontSynthesis=");
        int i10 = this.f35787d;
        if (i10 == 0) {
            str = "None";
        } else if (i10 == 1) {
            str = "Weight";
        } else if (i10 == 2) {
            str = "Style";
        } else if (i10 == 65535) {
            str = "All";
        }
        sb2.append((Object) str);
        sb2.append(", resourceLoaderCacheKey=");
        sb2.append(this.f35788e);
        sb2.append(')');
        return sb2.toString();
    }
}

package je;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f27624a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27625b;

    public w(String str, String str2) {
        this.f27624a = str;
        this.f27625b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return nk.k.a(this.f27624a, wVar.f27624a) && nk.k.a(this.f27625b, wVar.f27625b);
    }

    public final int hashCode() {
        String str = this.f27624a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f27625b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FirebaseInstallationId(fid=");
        sb2.append(this.f27624a);
        sb2.append(", authToken=");
        return r5.c.l(sb2, this.f27625b, ')');
    }
}

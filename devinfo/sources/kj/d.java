package kj;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f28351a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28352b;

    public d(String str, long j) {
        this.f28352b = j;
        int iIndexOf = str.indexOf(".");
        if (iIndexOf >= 0) {
            this.f28351a = str.substring(iIndexOf);
        } else {
            this.f28351a = "";
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.f28351a.equals(this.f28351a) && dVar.f28352b == this.f28352b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f28351a.hashCode() >> 24) ^ ((int) this.f28352b);
    }
}

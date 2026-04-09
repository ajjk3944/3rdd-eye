package hh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f25127a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25128b;

    public s(String str, String str2) {
        this.f25127a = str;
        this.f25128b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return nk.k.a(this.f25127a, sVar.f25127a) && nk.k.a(this.f25128b, sVar.f25128b);
    }

    public final int hashCode() {
        return this.f25128b.hashCode() + (this.f25127a.hashCode() * 31);
    }

    public final String toString() {
        return a0.g.n("VerifyEmailData(email=", this.f25127a, ", vcode=", this.f25128b, ")");
    }
}

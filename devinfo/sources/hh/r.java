package hh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25124a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25125b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25126c;

    public r(String str, boolean z3, boolean z10) {
        nk.k.e(str, "text");
        this.f25124a = z3;
        this.f25125b = str;
        this.f25126c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f25124a == rVar.f25124a && nk.k.a(this.f25125b, rVar.f25125b) && this.f25126c == rVar.f25126c;
    }

    public final int hashCode() {
        return je.u.m((this.f25124a ? 1231 : 1237) * 31, 31, this.f25125b) + (this.f25126c ? 1231 : 1237);
    }

    public final String toString() {
        return "GetCodeData(enabled=" + this.f25124a + ", text=" + this.f25125b + ", showProgress=" + this.f25126c + ")";
    }
}

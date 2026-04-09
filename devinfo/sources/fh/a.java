package fh;

import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f24037a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24038b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24039c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24040d;

    /* renamed from: e, reason: collision with root package name */
    public final String f24041e;

    public a(String str, String str2, int i4) {
        str = (i4 & 1) != 0 ? null : str;
        boolean z3 = (i4 & 2) == 0;
        boolean z10 = (i4 & 4) == 0;
        boolean z11 = (i4 & 8) == 0;
        str2 = (i4 & 32) != 0 ? null : str2;
        this.f24037a = str;
        this.f24038b = z3;
        this.f24039c = z10;
        this.f24040d = z11;
        this.f24041e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.f24037a, aVar.f24037a) && this.f24038b == aVar.f24038b && this.f24039c == aVar.f24039c && this.f24040d == aVar.f24040d && k.a(this.f24041e, aVar.f24041e);
    }

    public final int hashCode() {
        String str = this.f24037a;
        int iHashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + (this.f24038b ? 1231 : 1237)) * 31) + (this.f24039c ? 1231 : 1237)) * 31) + (this.f24040d ? 1231 : 1237)) * 31) + 1237) * 31;
        String str2 = this.f24041e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccountProNotesData(msg=");
        sb2.append(this.f24037a);
        sb2.append(", btnLogin=");
        sb2.append(this.f24038b);
        sb2.append(", btnRegister=");
        sb2.append(this.f24039c);
        sb2.append(", btnBind=");
        sb2.append(this.f24040d);
        sb2.append(", btnRestore=false, orderToken=");
        return d.h.w(sb2, this.f24041e, ")");
    }
}

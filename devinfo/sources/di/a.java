package di;

import a0.g;
import nk.k;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f22269a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22270b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22271c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22272d;

    public a(String str, String str2, String str3, String str4) {
        this.f22269a = str;
        this.f22270b = str2;
        this.f22271c = str3;
        this.f22272d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.f22269a, aVar.f22269a) && k.a(this.f22270b, aVar.f22270b) && k.a(this.f22271c, aVar.f22271c) && k.a(this.f22272d, aVar.f22272d);
    }

    public final int hashCode() {
        String str = this.f22269a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f22270b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f22271c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f22272d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return g.p(c.o("GpuModel(version=", this.f22269a, ", renderer=", this.f22270b, ", vendor="), this.f22271c, ", extensions=", this.f22272d, ")");
    }
}

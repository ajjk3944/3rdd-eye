package sg;

import je.u;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f33612a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33613b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33614c;

    /* renamed from: d, reason: collision with root package name */
    public final vg.c f33615d;

    public g(String str, String str2, String str3, vg.c cVar) {
        k.e(str, "path");
        k.e(str2, "partition");
        k.e(str3, "filesystem");
        this.f33612a = str;
        this.f33613b = str2;
        this.f33614c = str3;
        this.f33615d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k.a(this.f33612a, gVar.f33612a) && k.a(this.f33613b, gVar.f33613b) && k.a(this.f33614c, gVar.f33614c) && k.a(this.f33615d, gVar.f33615d);
    }

    public final int hashCode() {
        int iM = u.m(u.m(this.f33612a.hashCode() * 31, 31, this.f33613b), 961, this.f33614c);
        vg.c cVar = this.f33615d;
        return iM + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = r5.c.o("PartitionData(path=", this.f33612a, ", partition=", this.f33613b, ", filesystem=");
        sbO.append(this.f33614c);
        sbO.append(", permissionMode=, statInfo=");
        sbO.append(this.f33615d);
        sbO.append(")");
        return sbO.toString();
    }
}

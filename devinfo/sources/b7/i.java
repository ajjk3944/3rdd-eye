package b7;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f1999a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2000b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2001c;

    public i(String str, int i4, int i10) {
        nk.k.e(str, "workSpecId");
        this.f1999a = str;
        this.f2000b = i4;
        this.f2001c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return nk.k.a(this.f1999a, iVar.f1999a) && this.f2000b == iVar.f2000b && this.f2001c == iVar.f2001c;
    }

    public final int hashCode() {
        return (((this.f1999a.hashCode() * 31) + this.f2000b) * 31) + this.f2001c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f1999a);
        sb2.append(", generation=");
        sb2.append(this.f2000b);
        sb2.append(", systemId=");
        return d.h.u(sb2, this.f2001c, ')');
    }
}

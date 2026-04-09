package b7;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f2007a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2008b;

    public l(String str, int i4) {
        nk.k.e(str, "workSpecId");
        this.f2007a = str;
        this.f2008b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return nk.k.a(this.f2007a, lVar.f2007a) && this.f2008b == lVar.f2008b;
    }

    public final int hashCode() {
        return (this.f2007a.hashCode() * 31) + this.f2008b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f2007a);
        sb2.append(", generation=");
        return d.h.u(sb2, this.f2008b, ')');
    }
}

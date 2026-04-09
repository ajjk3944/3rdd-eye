package s2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i extends k {

    /* renamed from: a, reason: collision with root package name */
    public final String f33394a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f33395b;

    public i(String str, f0 f0Var) {
        this.f33394a = str;
        this.f33395b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return nk.k.a(this.f33394a, iVar.f33394a) && nk.k.a(this.f33395b, iVar.f33395b);
    }

    public final int hashCode() {
        int iHashCode = this.f33394a.hashCode() * 31;
        f0 f0Var = this.f33395b;
        return (iHashCode + (f0Var != null ? f0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return r5.c.l(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f33394a, ')');
    }
}

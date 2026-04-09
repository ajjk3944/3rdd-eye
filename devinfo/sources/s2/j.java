package s2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final String f33397a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f33398b;

    public j(String str, f0 f0Var) {
        this.f33397a = str;
        this.f33398b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return nk.k.a(this.f33397a, jVar.f33397a) && nk.k.a(this.f33398b, jVar.f33398b);
    }

    public final int hashCode() {
        int iHashCode = this.f33397a.hashCode() * 31;
        f0 f0Var = this.f33398b;
        return (iHashCode + (f0Var != null ? f0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return r5.c.l(new StringBuilder("LinkAnnotation.Url(url="), this.f33397a, ')');
    }
}

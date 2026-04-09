package nk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class p extends c implements tk.c {
    public final boolean g;

    public p(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.g = false;
    }

    public final tk.a e() {
        if (this.g) {
            return this;
        }
        tk.a aVar = this.f29971a;
        if (aVar != null) {
            return aVar;
        }
        tk.a aVarC = c();
        this.f29971a = aVarC;
        return aVarC;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return d().equals(pVar.d()) && this.f29974d.equals(pVar.f29974d) && this.f29975e.equals(pVar.f29975e) && k.a(this.f29972b, pVar.f29972b);
        }
        if (obj instanceof tk.c) {
            return obj.equals(e());
        }
        return false;
    }

    public final int hashCode() {
        return this.f29975e.hashCode() + je.u.m(d().hashCode() * 31, 31, this.f29974d);
    }

    public final String toString() {
        tk.a aVarE = e();
        return aVarE != this ? aVarE.toString() : d.h.w(new StringBuilder("property "), this.f29974d, " (Kotlin reflection is not available)");
    }
}

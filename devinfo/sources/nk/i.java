package nk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class i extends c implements h, tk.a, yj.c {
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29979h;

    public i(int i4, Class cls, String str, String str2, int i10) {
        this(i4, b.f29970a, cls, str, str2, i10, 0);
    }

    @Override // nk.c
    public final tk.a c() {
        v.f29987a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return this.f29974d.equals(iVar.f29974d) && this.f29975e.equals(iVar.f29975e) && this.f29979h == iVar.f29979h && this.g == iVar.g && k.a(this.f29972b, iVar.f29972b) && d().equals(iVar.d());
        }
        if (!(obj instanceof i)) {
            return false;
        }
        tk.a aVar = this.f29971a;
        if (aVar == null) {
            c();
            this.f29971a = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // nk.h
    public final int getArity() {
        return this.g;
    }

    public final int hashCode() {
        d();
        return this.f29975e.hashCode() + je.u.m(d().hashCode() * 31, 31, this.f29974d);
    }

    public final String toString() {
        tk.a aVar = this.f29971a;
        if (aVar == null) {
            c();
            this.f29971a = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f29974d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : d.h.t("function ", str, " (Kotlin reflection is not available)");
    }

    public i(int i4, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.g = i4;
        this.f29979h = 0;
    }
}

package q5;

import c5.InterfaceC0404a;

/* loaded from: classes3.dex */
public abstract class h extends b implements g, w5.a, InterfaceC0404a {

    /* renamed from: g, reason: collision with root package name */
    public final int f23291g;

    /* renamed from: h, reason: collision with root package name */
    public final int f23292h;

    public h(int i, Class cls, String str, String str2, int i3) {
        this(i, a.f23281a, cls, str, str2, i3, 0);
    }

    @Override // q5.g
    public final int c() {
        return this.f23291g;
    }

    public final w5.a d() {
        p.f23300a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f23285d.equals(hVar.f23285d) && this.f23286e.equals(hVar.f23286e) && this.f23292h == hVar.f23292h && this.f23291g == hVar.f23291g && this.f23283b.equals(hVar.f23283b) && a().equals(hVar.a());
        }
        if (!(obj instanceof h)) {
            return false;
        }
        w5.a aVar = this.f23282a;
        if (aVar == null) {
            d();
            this.f23282a = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    public final int hashCode() {
        a();
        return this.f23286e.hashCode() + ((this.f23285d.hashCode() + (a().hashCode() * 31)) * 31);
    }

    public final String toString() {
        w5.a aVar = this.f23282a;
        if (aVar == null) {
            d();
            this.f23282a = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f23285d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : A.f.m("function ", str, " (Kotlin reflection is not available)");
    }

    public h(int i, Object obj, Class cls, String str, String str2, int i3, int i6) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f23291g = i;
        this.f23292h = 0;
    }
}

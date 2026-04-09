package m8;

import br.l;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f16324c;

    /* renamed from: a, reason: collision with root package name */
    public final a.a f16325a;

    /* renamed from: b, reason: collision with root package name */
    public final a.a f16326b;

    static {
        b bVar = b.f16321f;
        f16324c = new h(bVar, bVar);
    }

    public h(a.a aVar, a.a aVar2) {
        this.f16325a = aVar;
        this.f16326b = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f16325a, hVar.f16325a) && l.a(this.f16326b, hVar.f16326b);
    }

    public final int hashCode() {
        return this.f16326b.hashCode() + (this.f16325a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f16325a + ", height=" + this.f16326b + ')';
    }
}

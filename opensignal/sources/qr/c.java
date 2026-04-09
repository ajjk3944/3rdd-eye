package qr;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final qs.b f20962a;

    /* renamed from: b, reason: collision with root package name */
    public final qs.b f20963b;

    /* renamed from: c, reason: collision with root package name */
    public final qs.b f20964c;

    public c(qs.b bVar, qs.b bVar2, qs.b bVar3) {
        this.f20962a = bVar;
        this.f20963b = bVar2;
        this.f20964c = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return br.l.a(this.f20962a, cVar.f20962a) && br.l.a(this.f20963b, cVar.f20963b) && br.l.a(this.f20964c, cVar.f20964c);
    }

    public final int hashCode() {
        return this.f20964c.hashCode() + ((this.f20963b.hashCode() + (this.f20962a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.f20962a + ", kotlinReadOnly=" + this.f20963b + ", kotlinMutable=" + this.f20964c + ')';
    }
}

package kt;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public final class l extends f {
    @Override // kt.f, at.p
    public final Collection a(at.f fVar, ar.k kVar) {
        br.l.e(fVar, "kindFilter");
        throw new IllegalStateException(this.f14511b);
    }

    @Override // kt.f, at.n
    public final /* bridge */ /* synthetic */ Collection b(qs.g gVar, zr.b bVar) {
        b(gVar, bVar);
        throw null;
    }

    @Override // kt.f, at.p
    public final rr.i c(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        throw new IllegalStateException(this.f14511b + ", required name: " + gVar);
    }

    @Override // kt.f, at.n
    public final Set d() {
        throw new IllegalStateException();
    }

    @Override // kt.f, at.n
    public final Set e() {
        throw new IllegalStateException();
    }

    @Override // kt.f, at.n
    public final /* bridge */ /* synthetic */ Collection f(qs.g gVar, zr.b bVar) {
        f(gVar, bVar);
        throw null;
    }

    @Override // kt.f, at.n
    public final Set g() {
        throw new IllegalStateException();
    }

    @Override // kt.f
    /* renamed from: h */
    public final Set f(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        throw new IllegalStateException(this.f14511b + ", required name: " + gVar);
    }

    @Override // kt.f
    /* renamed from: i */
    public final Set b(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        throw new IllegalStateException(this.f14511b + ", required name: " + gVar);
    }

    @Override // kt.f
    public final String toString() {
        return h0.b.r(new StringBuilder("ThrowingScope{"), this.f14511b, '}');
    }
}

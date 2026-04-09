package p4;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e1 implements ck.f {

    /* renamed from: a, reason: collision with root package name */
    public final e1 f31196a;

    /* renamed from: b, reason: collision with root package name */
    public final z f31197b;

    public e1(e1 e1Var, z zVar) {
        this.f31196a = e1Var;
        this.f31197b = zVar;
    }

    @Override // ck.h
    public final Object G(Object obj, mk.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // ck.h
    public final ck.h L(ck.g gVar) {
        return wd.b.C(this, gVar);
    }

    @Override // ck.h
    public final ck.f O(ck.g gVar) {
        return wd.b.p(this, gVar);
    }

    public final void a(z zVar) {
        if (this.f31197b == zVar) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        e1 e1Var = this.f31196a;
        if (e1Var != null) {
            e1Var.a(zVar);
        }
    }

    @Override // ck.f
    public final ck.g getKey() {
        return d1.f31185a;
    }

    @Override // ck.h
    public final ck.h y(ck.h hVar) {
        return wd.b.O(this, hVar);
    }
}

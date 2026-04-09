package d4;

/* loaded from: classes.dex */
public final class j1 implements pq.f {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f6836a;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f6837d;

    public j1(j1 j1Var, c0 c0Var) {
        this.f6836a = j1Var;
        this.f6837d = c0Var;
    }

    @Override // pq.h
    public final pq.f Y(pq.g gVar) {
        return se.b.y(this, gVar);
    }

    @Override // pq.h
    public final Object Z(ar.n nVar, Object obj) {
        return nVar.w(obj, this);
    }

    public final void a(c0 c0Var) {
        if (this.f6837d == c0Var) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        j1 j1Var = this.f6836a;
        if (j1Var != null) {
            j1Var.a(c0Var);
        }
    }

    @Override // pq.f
    public final pq.g getKey() {
        return i1.f6825a;
    }

    @Override // pq.h
    public final pq.h i0(pq.h hVar) {
        return se.b.M(this, hVar);
    }

    @Override // pq.h
    public final pq.h q(pq.g gVar) {
        return se.b.L(this, gVar);
    }
}

package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class a80 extends xc implements rx, l40 {
    public final boolean l;

    public a80(b80 b80Var) {
        super(b80Var, um.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.l = false;
    }

    @Override // defpackage.rx
    public final Object a() {
        return this.g.getClass().getSimpleName();
    }

    public final l40 d() {
        if (this.l) {
            return this;
        }
        l40 l40Var = this.f;
        if (l40Var != null) {
            return l40Var;
        }
        dp0.a.getClass();
        this.f = this;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a80) {
            a80 a80Var = (a80) obj;
            return c().equals(a80Var.c()) && this.i.equals(a80Var.i) && this.j.equals(a80Var.j) && i30.c(this.g, a80Var.g);
        }
        if (obj instanceof a80) {
            return obj.equals(d());
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        l40 l40VarD = d();
        return l40VarD != this ? l40VarD.toString() : ex0.k(new StringBuilder("property "), this.i, " (Kotlin reflection is not available)");
    }
}

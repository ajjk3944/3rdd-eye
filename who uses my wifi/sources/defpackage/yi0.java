package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yi0 implements id {
    public final qw f;
    public final /* synthetic */ aj0 g;

    public yi0(aj0 aj0Var, qw qwVar) {
        i30.m(qwVar, "onBackPressedCallback");
        this.g = aj0Var;
        this.f = qwVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [rx, ry] */
    @Override // defpackage.id
    public final void cancel() {
        aj0 aj0Var = this.g;
        l8 l8Var = aj0Var.b;
        qw qwVar = this.f;
        l8Var.remove(qwVar);
        if (i30.c(aj0Var.c, qwVar)) {
            qwVar.getClass();
            aj0Var.c = null;
        }
        qwVar.b.remove(this);
        ?? r0 = qwVar.c;
        if (r0 != 0) {
            r0.a();
        }
        qwVar.c = null;
    }
}

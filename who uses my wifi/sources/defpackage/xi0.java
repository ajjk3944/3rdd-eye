package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xi0 implements y50, id {
    public final d60 f;
    public final qw g;
    public yi0 h;
    public final /* synthetic */ aj0 i;

    public xi0(aj0 aj0Var, d60 d60Var, qw qwVar) {
        i30.m(qwVar, "onBackPressedCallback");
        this.i = aj0Var;
        this.f = d60Var;
        this.g = qwVar;
        d60Var.a(this);
    }

    @Override // defpackage.y50
    public final void a(b60 b60Var, t50 t50Var) {
        if (t50Var != t50.ON_START) {
            if (t50Var != t50.ON_STOP) {
                if (t50Var == t50.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                yi0 yi0Var = this.h;
                if (yi0Var != null) {
                    yi0Var.cancel();
                    return;
                }
                return;
            }
        }
        aj0 aj0Var = this.i;
        aj0Var.getClass();
        qw qwVar = this.g;
        i30.m(qwVar, "onBackPressedCallback");
        aj0Var.b.addLast(qwVar);
        yi0 yi0Var2 = new yi0(aj0Var, qwVar);
        qwVar.b.add(yi0Var2);
        aj0Var.e();
        qwVar.c = new zi0(0, aj0Var, aj0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 1);
        this.h = yi0Var2;
    }

    @Override // defpackage.id
    public final void cancel() {
        this.f.f(this);
        this.g.b.remove(this);
        yi0 yi0Var = this.h;
        if (yi0Var != null) {
            yi0Var.cancel();
        }
        this.h = null;
    }
}

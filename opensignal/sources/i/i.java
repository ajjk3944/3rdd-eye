package i;

import android.view.LayoutInflater;

/* loaded from: classes.dex */
public final class i implements e.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f11061a;

    public i(j jVar) {
        this.f11061a = jVar;
    }

    @Override // e.a
    public final void a() {
        j jVar = this.f11061a;
        o oVarM = jVar.m();
        a0 a0Var = (a0) oVarM;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(a0Var.G);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(a0Var);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        ((io.sentry.t) jVar.f3031x.f11197d).k("androidx:appcompat");
        oVarM.c();
    }
}

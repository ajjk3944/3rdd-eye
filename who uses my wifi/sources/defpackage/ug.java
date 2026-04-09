package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ug implements y50 {
    public final /* synthetic */ aj0 f;
    public final /* synthetic */ ch g;

    public /* synthetic */ ug(aj0 aj0Var, ch chVar) {
        this.f = aj0Var;
        this.g = chVar;
    }

    @Override // defpackage.y50
    public final void a(b60 b60Var, t50 t50Var) {
        if (t50Var == t50.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = yg.a(this.g);
            aj0 aj0Var = this.f;
            aj0Var.e = onBackInvokedDispatcherA;
            aj0Var.d(aj0Var.g);
        }
    }
}

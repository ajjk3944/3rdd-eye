package defpackage;

import android.view.ActionProvider;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class td0 implements ActionProvider.VisibilityListener {
    public ug0 a;
    public final ActionProvider b;

    public td0(wd0 wd0Var, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        ug0 ug0Var = this.a;
        if (ug0Var != null) {
            od0 od0Var = ((sd0) ug0Var.g).n;
            od0Var.h = true;
            od0Var.p(true);
        }
    }
}

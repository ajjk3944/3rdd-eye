package o;

import android.view.ActionProvider;
import h7.r1;

/* loaded from: classes.dex */
public final class p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public r1 f18662a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f18663b;

    public p(t tVar, ActionProvider actionProvider) {
        this.f18663b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        r1 r1Var = this.f18662a;
        if (r1Var != null) {
            m mVar = ((o) r1Var.f10199d).f18649n;
            mVar.f18620h = true;
            mVar.p(true);
        }
    }
}

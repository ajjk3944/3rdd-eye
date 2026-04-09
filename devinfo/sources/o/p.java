package o;

import android.content.Context;
import android.view.ActionProvider;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30287a;

    /* renamed from: b, reason: collision with root package name */
    public km.y f30288b;

    /* renamed from: c, reason: collision with root package name */
    public final ActionProvider f30289c;

    public p(t tVar, Context context, ActionProvider actionProvider) {
        this.f30287a = context;
        this.f30289c = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z3) {
        km.y yVar = this.f30288b;
        if (yVar != null) {
            m mVar = ((o) yVar.f28522b).f30274n;
            mVar.f30244h = true;
            mVar.p(true);
        }
    }
}

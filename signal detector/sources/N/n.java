package n;

import android.content.Context;
import android.view.ActionProvider;

/* loaded from: classes.dex */
public final class n implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22119a;

    /* renamed from: b, reason: collision with root package name */
    public h2.d f22120b;

    /* renamed from: c, reason: collision with root package name */
    public final ActionProvider f22121c;

    public n(r rVar, Context context, ActionProvider actionProvider) {
        this.f22119a = context;
        this.f22121c = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z6) {
        h2.d dVar = this.f22120b;
        if (dVar != null) {
            MenuC2677k menuC2677k = ((m) dVar.f20472a).f22118n;
            menuC2677k.f22083h = true;
            menuC2677k.p(true);
        }
    }
}

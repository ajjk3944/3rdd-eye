package I6;

import android.view.View;

/* compiled from: SceneRootWatcher.kt */
/* loaded from: classes.dex */
public final class l implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final r7.g f2559b;

    public l(r7.g sceneRoot) {
        kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
        this.f2559b = sceneRoot;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        kotlin.jvm.internal.l.f(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        r7.g gVar = this.f2559b;
        gVar.removeOnAttachStateChangeListener(this);
        K1.m.b(gVar);
    }
}

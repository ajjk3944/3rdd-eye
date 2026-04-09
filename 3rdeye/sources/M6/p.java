package M6;

import H6.C0672i;
import N7.Z;
import android.view.View;

/* compiled from: Views.kt */
/* loaded from: classes.dex */
public final class p implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f4288b;

    public p(q qVar) {
        this.f4288b = qVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        kotlin.jvm.internal.l.f(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        q qVar = this.f4288b;
        Z z10 = qVar.f3311q;
        if (z10 == null) {
            return;
        }
        C0672i c0672i = qVar.f4289s;
        c0672i.f2146a.getDiv2Component$div_release().B().e(c0672i, view, z10);
    }
}

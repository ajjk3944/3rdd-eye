package p;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class e0 implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.d f20047a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0 f20048d;

    public e0(f0 f0Var, o.d dVar) {
        this.f20048d = f0Var;
        this.f20047a = dVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f20048d.f20057c0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f20047a);
        }
    }
}

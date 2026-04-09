package o;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: o.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2698I implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A3.C f22382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2699J f22383b;

    public C2698I(C2699J c2699j, A3.C c6) {
        this.f22383b = c2699j;
        this.f22382a = c6;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f22383b.f22397V.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f22382a);
        }
    }
}

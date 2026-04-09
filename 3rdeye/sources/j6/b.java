package J6;

import android.view.View;

/* compiled from: BackKeyPressedHelper.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final J6.a f2803a;

    /* renamed from: b, reason: collision with root package name */
    public a f2804b;

    /* compiled from: BackKeyPressedHelper.kt */
    public interface a {
        boolean a();
    }

    public b(J6.a aVar) {
        this.f2803a = aVar;
    }

    public final void a() {
        View rootView;
        if (this.f2804b != null) {
            J6.a aVar = this.f2803a;
            if (aVar.hasWindowFocus()) {
                aVar.setFocusable(true);
                aVar.setFocusableInTouchMode(true);
                if (aVar.isShown()) {
                    aVar.requestFocus();
                } else {
                    if (!aVar.hasFocus() || (rootView = aVar.getRootView()) == null) {
                        return;
                    }
                    rootView.requestFocus(33);
                }
            }
        }
    }
}

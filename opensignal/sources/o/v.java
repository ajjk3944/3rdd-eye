package o;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class v implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f18672a;

    public v(w wVar) {
        this.f18672a = wVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f18672a.c();
    }
}

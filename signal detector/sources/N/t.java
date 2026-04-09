package n;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class t implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f22130a;

    public t(u uVar) {
        this.f22130a = uVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f22130a.c();
    }
}

package defpackage;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yd0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ zd0 f;

    public yd0(zd0 zd0Var) {
        this.f = zd0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f.c();
    }
}

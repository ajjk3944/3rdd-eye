package o;

import android.widget.PopupWindow;
import androidx.lifecycle.f1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30299b;

    public /* synthetic */ v(int i4, Object obj) {
        this.f30298a = i4;
        this.f30299b = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.f30298a) {
            case 0:
                ((w) this.f30299b).c();
                break;
            default:
                ((f1) this.f30299b).getClass();
                break;
        }
    }
}

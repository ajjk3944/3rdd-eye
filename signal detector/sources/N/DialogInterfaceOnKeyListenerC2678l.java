package n;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import h.DialogInterfaceC2347e;

/* renamed from: n.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC2678l implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, v {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC2666C f22089a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC2347e f22090b;

    /* renamed from: c, reason: collision with root package name */
    public C2673g f22091c;

    @Override // n.v
    public final void c(MenuC2677k menuC2677k, boolean z6) {
        DialogInterfaceC2347e dialogInterfaceC2347e;
        if ((z6 || menuC2677k == this.f22089a) && (dialogInterfaceC2347e = this.f22090b) != null) {
            dialogInterfaceC2347e.dismiss();
        }
    }

    @Override // n.v
    public final boolean g(MenuC2677k menuC2677k) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        SubMenuC2666C subMenuC2666C = this.f22089a;
        C2673g c2673g = this.f22091c;
        if (c2673g.f22059f == null) {
            c2673g.f22059f = new C2672f(c2673g);
        }
        subMenuC2666C.q(c2673g.f22059f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f22091c.c(this.f22089a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC2666C subMenuC2666C = this.f22089a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f22090b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f22090b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC2666C.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC2666C.performShortcut(i, keyEvent, 0);
    }
}

package o;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, x {

    /* renamed from: a, reason: collision with root package name */
    public e0 f30260a;

    /* renamed from: b, reason: collision with root package name */
    public i.e f30261b;

    /* renamed from: c, reason: collision with root package name */
    public i f30262c;

    @Override // o.x
    public final void e(m mVar, boolean z3) {
        i.e eVar;
        if ((z3 || mVar == this.f30260a) && (eVar = this.f30261b) != null) {
            eVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        e0 e0Var = this.f30260a;
        i iVar = this.f30262c;
        if (iVar.f30230f == null) {
            iVar.f30230f = new h(iVar);
        }
        e0Var.q(iVar.f30230f.getItem(i4), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f30262c.e(this.f30260a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        e0 e0Var = this.f30260a;
        if (i4 == 82 || i4 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f30261b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f30261b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                e0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return e0Var.performShortcut(i4, keyEvent, 0);
    }

    @Override // o.x
    public final boolean v(m mVar) {
        return false;
    }
}

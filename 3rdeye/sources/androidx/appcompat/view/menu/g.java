package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.d.a;
import androidx.appcompat.view.menu.j;

/* compiled from: MenuDialogHelper.java */
/* loaded from: classes.dex */
public final class g implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: b, reason: collision with root package name */
    public m f14454b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.appcompat.app.d f14455c;

    /* renamed from: d, reason: collision with root package name */
    public d f14456d;

    @Override // androidx.appcompat.view.menu.j.a
    public final void b(f fVar, boolean z10) {
        androidx.appcompat.app.d dVar;
        if ((z10 || fVar == this.f14454b) && (dVar = this.f14455c) != null) {
            dVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public final boolean c(f fVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        d dVar = this.f14456d;
        if (dVar.f14421g == null) {
            dVar.f14421g = dVar.new a();
        }
        this.f14454b.q(dVar.f14421g.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f14456d.b(this.f14454b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        m mVar = this.f14454b;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f14455c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f14455c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                mVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return mVar.performShortcut(i, keyEvent, 0);
    }
}

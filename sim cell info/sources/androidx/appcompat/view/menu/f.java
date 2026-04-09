package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.j;

/* loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: b, reason: collision with root package name */
    private e f619b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.appcompat.app.b f620c;

    /* renamed from: d, reason: collision with root package name */
    c f621d;

    /* renamed from: e, reason: collision with root package name */
    private j.a f622e;

    public f(e eVar) {
        this.f619b = eVar;
    }

    public void a() {
        androidx.appcompat.app.b bVar = this.f620c;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void b(e eVar, boolean z2) {
        if (z2 || eVar == this.f619b) {
            a();
        }
        j.a aVar = this.f622e;
        if (aVar != null) {
            aVar.b(eVar, z2);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean c(e eVar) {
        j.a aVar = this.f622e;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f619b;
        b.a aVar = new b.a(eVar.u());
        c cVar = new c(aVar.b(), a.g.f107j);
        this.f621d = cVar;
        cVar.d(this);
        this.f619b.b(this.f621d);
        aVar.c(this.f621d.a(), this);
        View viewY = eVar.y();
        if (viewY != null) {
            aVar.e(viewY);
        } else {
            aVar.f(eVar.w()).k(eVar.x());
        }
        aVar.i(this);
        androidx.appcompat.app.b bVarA = aVar.a();
        this.f620c = bVarA;
        bVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f620c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f620c.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f619b.L((g) this.f621d.a().getItem(i2), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f621d.b(this.f619b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f620c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f620c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f619b.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f619b.performShortcut(i2, keyEvent, 0);
    }
}

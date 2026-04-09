package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.h;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;

/* loaded from: classes.dex */
public class e implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, h.a {

    /* renamed from: a, reason: collision with root package name */
    public d f738a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.appcompat.app.b f739b;

    /* renamed from: c, reason: collision with root package name */
    public b f740c;

    /* renamed from: d, reason: collision with root package name */
    public h.a f741d;

    public e(d dVar) {
        this.f738a = dVar;
    }

    public void a() {
        androidx.appcompat.app.b bVar = this.f739b;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.h.a
    public void b(d dVar, boolean z10) {
        if (z10 || dVar == this.f738a) {
            a();
        }
        h.a aVar = this.f741d;
        if (aVar != null) {
            aVar.b(dVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.h.a
    public boolean c(d dVar) {
        h.a aVar = this.f741d;
        if (aVar != null) {
            return aVar.c(dVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        d dVar = this.f738a;
        b.a aVar = new b.a(dVar.w());
        b bVar = new b(aVar.b(), c.g.abc_list_menu_item_layout);
        this.f740c = bVar;
        bVar.d(this);
        this.f738a.b(this.f740c);
        aVar.c(this.f740c.a(), this);
        View viewA = dVar.A();
        if (viewA != null) {
            aVar.e(viewA);
        } else {
            aVar.f(dVar.y()).p(dVar.z());
        }
        aVar.k(this);
        androidx.appcompat.app.b bVarA = aVar.a();
        this.f739b = bVarA;
        bVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f739b.getWindow().getAttributes();
        attributes.type = BackupConstant.SCENE_CLOSED_WITHOUT_SHOW;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f739b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f738a.O((f) this.f740c.a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f740c.b(this.f738a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f739b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f739b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f738a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f738a.performShortcut(i10, keyEvent, 0);
    }
}

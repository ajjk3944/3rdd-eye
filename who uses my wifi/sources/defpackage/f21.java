package defpackage;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class f21 extends m54 {
    public final h21 g;
    public final Window.Callback h;
    public final zs1 i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final ArrayList m = new ArrayList();
    public final a9 n = new a9(16, this);

    public f21(Toolbar toolbar, CharSequence charSequence, b6 b6Var) {
        vg0 vg0Var = new vg0(7, this);
        h21 h21Var = new h21(toolbar, false);
        this.g = h21Var;
        b6Var.getClass();
        this.h = b6Var;
        h21Var.k = b6Var;
        toolbar.setOnMenuItemClickListener(vg0Var);
        if (!h21Var.g) {
            h21Var.h = charSequence;
            if ((h21Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (h21Var.g) {
                    e61.m(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.i = new zs1(7, this);
    }

    @Override // defpackage.m54
    public final void A(CharSequence charSequence) {
        h21 h21Var = this.g;
        if (h21Var.g) {
            return;
        }
        Toolbar toolbar = h21Var.a;
        h21Var.h = charSequence;
        if ((h21Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (h21Var.g) {
                e61.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.m54
    public final boolean b() {
        y1 y1Var;
        ActionMenuView actionMenuView = this.g.a.f;
        return (actionMenuView == null || (y1Var = actionMenuView.y) == null || !y1Var.c()) ? false : true;
    }

    @Override // defpackage.m54
    public final boolean c() {
        sd0 sd0Var;
        b21 b21Var = this.g.a.R;
        if (b21Var == null || (sd0Var = b21Var.g) == null) {
            return false;
        }
        if (b21Var == null) {
            sd0Var = null;
        }
        if (sd0Var == null) {
            return true;
        }
        sd0Var.collapseActionView();
        return true;
    }

    @Override // defpackage.m54
    public final void d(boolean z) {
        if (z == this.l) {
            return;
        }
        this.l = z;
        ArrayList arrayList = this.m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.m54
    public final int g() {
        return this.g.b;
    }

    public final Menu i0() {
        boolean z = this.k;
        h21 h21Var = this.g;
        if (!z) {
            nb nbVar = new nb(this);
            z71 z71Var = new z71(10, this);
            Toolbar toolbar = h21Var.a;
            toolbar.S = nbVar;
            toolbar.T = z71Var;
            ActionMenuView actionMenuView = toolbar.f;
            if (actionMenuView != null) {
                actionMenuView.z = nbVar;
                actionMenuView.A = z71Var;
            }
            this.k = true;
        }
        return h21Var.a.getMenu();
    }

    @Override // defpackage.m54
    public final Context p() {
        return this.g.a.getContext();
    }

    @Override // defpackage.m54
    public final boolean q() {
        h21 h21Var = this.g;
        Toolbar toolbar = h21Var.a;
        a9 a9Var = this.n;
        toolbar.removeCallbacks(a9Var);
        Toolbar toolbar2 = h21Var.a;
        WeakHashMap weakHashMap = e61.a;
        toolbar2.postOnAnimation(a9Var);
        return true;
    }

    @Override // defpackage.m54
    public final void t() {
        this.g.a.removeCallbacks(this.n);
    }

    @Override // defpackage.m54
    public final boolean u(int i, KeyEvent keyEvent) {
        Menu menuI0 = i0();
        if (menuI0 == null) {
            return false;
        }
        menuI0.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuI0.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.m54
    public final boolean v(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            w();
        }
        return true;
    }

    @Override // defpackage.m54
    public final boolean w() {
        return this.g.a.u();
    }

    @Override // defpackage.m54
    public final void y(boolean z) {
        h21 h21Var = this.g;
        h21Var.a((h21Var.b & (-5)) | 4);
    }

    @Override // defpackage.m54
    public final void s() {
    }

    @Override // defpackage.m54
    public final void x(boolean z) {
    }

    @Override // defpackage.m54
    public final void z(boolean z) {
    }
}

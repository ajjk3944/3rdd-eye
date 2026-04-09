package i;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import e4.v0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p.i3;
import p.n3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d0 extends wd.b {

    /* renamed from: b, reason: collision with root package name */
    public final n3 f25276b;

    /* renamed from: c, reason: collision with root package name */
    public final Window.Callback f25277c;

    /* renamed from: d, reason: collision with root package name */
    public final o7.d f25278d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25279e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25280f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f25281h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final b5.o f25282i = new b5.o(17, this);

    public d0(Toolbar toolbar, CharSequence charSequence, r rVar) {
        jf.c cVar = new jf.c(21, this);
        toolbar.getClass();
        n3 n3Var = new n3(toolbar, false);
        this.f25276b = n3Var;
        rVar.getClass();
        this.f25277c = rVar;
        n3Var.f30787k = rVar;
        toolbar.setOnMenuItemClickListener(cVar);
        if (!n3Var.g) {
            n3Var.f30785h = charSequence;
            if ((n3Var.f30780b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (n3Var.g) {
                    v0.p(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.f25278d = new o7.d(25, this);
    }

    @Override // wd.b
    public final void E() {
        this.f25276b.f30779a.removeCallbacks(this.f25282i);
    }

    @Override // wd.b
    public final boolean F(int i4, KeyEvent keyEvent) {
        Menu menuV = V();
        if (menuV == null) {
            return false;
        }
        menuV.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuV.performShortcut(i4, keyEvent, 0);
    }

    @Override // wd.b
    public final boolean G(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            H();
        }
        return true;
    }

    @Override // wd.b
    public final boolean H() {
        return this.f25276b.f30779a.u();
    }

    @Override // wd.b
    public final void Q(boolean z3) {
        n3 n3Var = this.f25276b;
        n3Var.a((n3Var.f30780b & (-5)) | 4);
    }

    @Override // wd.b
    public final void T(CharSequence charSequence) {
        n3 n3Var = this.f25276b;
        if (n3Var.g) {
            return;
        }
        Toolbar toolbar = n3Var.f30779a;
        n3Var.f30785h = charSequence;
        if ((n3Var.f30780b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (n3Var.g) {
                v0.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu V() {
        boolean z3 = this.f25280f;
        n3 n3Var = this.f25276b;
        if (!z3) {
            a4.d dVar = new a4.d(this);
            o7.c cVar = new o7.c(25, this);
            Toolbar toolbar = n3Var.f30779a;
            toolbar.N = dVar;
            toolbar.O = cVar;
            ActionMenuView actionMenuView = toolbar.f818a;
            if (actionMenuView != null) {
                actionMenuView.f750u = dVar;
                actionMenuView.f751v = cVar;
            }
            this.f25280f = true;
        }
        return n3Var.f30779a.getMenu();
    }

    @Override // wd.b
    public final boolean f() {
        p.k kVar;
        ActionMenuView actionMenuView = this.f25276b.f30779a.f818a;
        return (actionMenuView == null || (kVar = actionMenuView.f749t) == null || !kVar.h()) ? false : true;
    }

    @Override // wd.b
    public final boolean g() {
        o.o oVar;
        i3 i3Var = this.f25276b.f30779a.M;
        if (i3Var == null || (oVar = i3Var.f30717b) == null) {
            return false;
        }
        if (i3Var == null) {
            oVar = null;
        }
        if (oVar == null) {
            return true;
        }
        oVar.collapseActionView();
        return true;
    }

    @Override // wd.b
    public final void m(boolean z3) {
        if (z3 == this.g) {
            return;
        }
        this.g = z3;
        ArrayList arrayList = this.f25281h;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // wd.b
    public final int s() {
        return this.f25276b.f30780b;
    }

    @Override // wd.b
    public final Context v() {
        return this.f25276b.f30779a.getContext();
    }

    @Override // wd.b
    public final void y() {
        this.f25276b.f30779a.setVisibility(8);
    }

    @Override // wd.b
    public final boolean z() {
        n3 n3Var = this.f25276b;
        Toolbar toolbar = n3Var.f30779a;
        b5.o oVar = this.f25282i;
        toolbar.removeCallbacks(oVar);
        Toolbar toolbar2 = n3Var.f30779a;
        WeakHashMap weakHashMap = v0.f22405a;
        toolbar2.postOnAnimation(oVar);
        return true;
    }

    @Override // wd.b
    public final void D() {
    }

    @Override // wd.b
    public final void P(boolean z3) {
    }

    @Override // wd.b
    public final void R(boolean z3) {
    }
}

package i;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import h7.r1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p.n2;
import p.r2;

/* loaded from: classes.dex */
public final class h0 extends xu.l {

    /* renamed from: c, reason: collision with root package name */
    public final r2 f11054c;

    /* renamed from: d, reason: collision with root package name */
    public final Window.Callback f11055d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f11056e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11057f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11058g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11059h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f11060i = new ArrayList();
    public final b4.e j = new b4.e(9, this);

    public h0(Toolbar toolbar, CharSequence charSequence, v vVar) {
        r1 r1Var = new r1(4, this);
        toolbar.getClass();
        r2 r2Var = new r2(toolbar, false);
        this.f11054c = r2Var;
        vVar.getClass();
        this.f11055d = vVar;
        r2Var.k = vVar;
        toolbar.setOnMenuItemClickListener(r1Var);
        if (!r2Var.f20158g) {
            r2Var.f20159h = charSequence;
            if ((r2Var.f20153b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (r2Var.f20158g) {
                    u3.i0.o(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.f11056e = new g0(this);
    }

    @Override // xu.l
    public final boolean E() {
        r2 r2Var = this.f11054c;
        Toolbar toolbar = r2Var.f20152a;
        b4.e eVar = this.j;
        toolbar.removeCallbacks(eVar);
        Toolbar toolbar2 = r2Var.f20152a;
        WeakHashMap weakHashMap = u3.i0.f23177a;
        toolbar2.postOnAnimation(eVar);
        return true;
    }

    @Override // xu.l
    public final void K() {
        this.f11054c.f20152a.removeCallbacks(this.j);
    }

    @Override // xu.l
    public final boolean L(int i10, KeyEvent keyEvent) {
        Menu menuF0 = f0();
        if (menuF0 == null) {
            return false;
        }
        menuF0.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuF0.performShortcut(i10, keyEvent, 0);
    }

    @Override // xu.l
    public final boolean M(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            N();
        }
        return true;
    }

    @Override // xu.l
    public final boolean N() {
        return this.f11054c.f20152a.u();
    }

    @Override // xu.l
    public final void S(boolean z10) {
        int i10 = z10 ? 4 : 0;
        r2 r2Var = this.f11054c;
        r2Var.a((i10 & 4) | (r2Var.f20153b & (-5)));
    }

    @Override // xu.l
    public final void V(CharSequence charSequence) {
        r2 r2Var = this.f11054c;
        if (r2Var.f20158g) {
            return;
        }
        Toolbar toolbar = r2Var.f20152a;
        r2Var.f20159h = charSequence;
        if ((r2Var.f20153b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (r2Var.f20158g) {
                u3.i0.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // xu.l
    public final boolean f() {
        androidx.appcompat.widget.b bVar;
        ActionMenuView actionMenuView = this.f11054c.f20152a.f1011a;
        return (actionMenuView == null || (bVar = actionMenuView.P) == null || !bVar.g()) ? false : true;
    }

    public final Menu f0() {
        boolean z10 = this.f11058g;
        r2 r2Var = this.f11054c;
        if (!z10) {
            ab.g gVar = new ab.g(5, this);
            h7.h0 h0Var = new h7.h0(this);
            Toolbar toolbar = r2Var.f20152a;
            toolbar.f1026m0 = gVar;
            toolbar.f1027n0 = h0Var;
            ActionMenuView actionMenuView = toolbar.f1011a;
            if (actionMenuView != null) {
                actionMenuView.Q = gVar;
                actionMenuView.R = h0Var;
            }
            this.f11058g = true;
        }
        return r2Var.f20152a.getMenu();
    }

    @Override // xu.l
    public final boolean g() {
        o.o oVar;
        n2 n2Var = this.f11054c.f20152a.f1025l0;
        if (n2Var == null || (oVar = n2Var.f20121d) == null) {
            return false;
        }
        if (n2Var == null) {
            oVar = null;
        }
        if (oVar == null) {
            return true;
        }
        oVar.collapseActionView();
        return true;
    }

    @Override // xu.l
    public final void n(boolean z10) {
        if (z10 == this.f11059h) {
            return;
        }
        this.f11059h = z10;
        ArrayList arrayList = this.f11060i;
        if (arrayList.size() > 0) {
            throw h0.b.e(0, arrayList);
        }
    }

    @Override // xu.l
    public final int s() {
        return this.f11054c.f20153b;
    }

    @Override // xu.l
    public final Context y() {
        return this.f11054c.f20152a.getContext();
    }

    @Override // xu.l
    public final void J() {
    }

    @Override // xu.l
    public final void T() {
    }

    @Override // xu.l
    public final void R(boolean z10) {
    }

    @Override // xu.l
    public final void U(boolean z10) {
    }
}

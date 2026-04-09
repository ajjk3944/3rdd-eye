package h;

import R.O;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.C2723l;
import o.d1;
import o.i1;

/* loaded from: classes.dex */
public final class C extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f20259a;

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f20260b;

    /* renamed from: c, reason: collision with root package name */
    public final d4.h f20261c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20262d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20263e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20264f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f20265g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final C0.k f20266h = new C0.k(22, this);

    public C(Toolbar toolbar, CharSequence charSequence, r rVar) {
        A0.e eVar = new A0.e(28, this);
        toolbar.getClass();
        i1 i1Var = new i1(toolbar, false);
        this.f20259a = i1Var;
        rVar.getClass();
        this.f20260b = rVar;
        i1Var.f22531k = rVar;
        toolbar.setOnMenuItemClickListener(eVar);
        if (!i1Var.f22528g) {
            i1Var.f22529h = charSequence;
            if ((i1Var.f22523b & 8) != 0) {
                Toolbar toolbar2 = i1Var.f22522a;
                toolbar2.setTitle(charSequence);
                if (i1Var.f22528g) {
                    O.n(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.f20261c = new d4.h(2, this);
    }

    @Override // com.bumptech.glide.d
    public final boolean D() {
        i1 i1Var = this.f20259a;
        Toolbar toolbar = i1Var.f22522a;
        C0.k kVar = this.f20266h;
        toolbar.removeCallbacks(kVar);
        Toolbar toolbar2 = i1Var.f22522a;
        WeakHashMap weakHashMap = O.f3270a;
        toolbar2.postOnAnimation(kVar);
        return true;
    }

    @Override // com.bumptech.glide.d
    public final void H() {
        this.f20259a.f22522a.removeCallbacks(this.f20266h);
    }

    @Override // com.bumptech.glide.d
    public final boolean K(int i, KeyEvent keyEvent) {
        Menu menuD0 = d0();
        if (menuD0 == null) {
            return false;
        }
        menuD0.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuD0.performShortcut(i, keyEvent, 0);
    }

    @Override // com.bumptech.glide.d
    public final boolean L(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            M();
        }
        return true;
    }

    @Override // com.bumptech.glide.d
    public final boolean M() {
        return this.f20259a.f22522a.u();
    }

    @Override // com.bumptech.glide.d
    public final void S(boolean z6) {
        int i = z6 ? 4 : 0;
        i1 i1Var = this.f20259a;
        i1Var.a((i & 4) | (i1Var.f22523b & (-5)));
    }

    @Override // com.bumptech.glide.d
    public final void T(int i) {
        this.f20259a.b(i);
    }

    @Override // com.bumptech.glide.d
    public final void U(Drawable drawable) {
        i1 i1Var = this.f20259a;
        i1Var.f22527f = drawable;
        Toolbar toolbar = i1Var.f22522a;
        if ((i1Var.f22523b & 4) == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = i1Var.f22535o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // com.bumptech.glide.d
    public final void X(String str) {
        i1 i1Var = this.f20259a;
        i1Var.f22528g = true;
        Toolbar toolbar = i1Var.f22522a;
        i1Var.f22529h = str;
        if ((i1Var.f22523b & 8) != 0) {
            toolbar.setTitle(str);
            if (i1Var.f22528g) {
                O.n(toolbar.getRootView(), str);
            }
        }
    }

    @Override // com.bumptech.glide.d
    public final void Y(CharSequence charSequence) {
        i1 i1Var = this.f20259a;
        if (i1Var.f22528g) {
            return;
        }
        Toolbar toolbar = i1Var.f22522a;
        i1Var.f22529h = charSequence;
        if ((i1Var.f22523b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (i1Var.f22528g) {
                O.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu d0() {
        boolean z6 = this.f20263e;
        i1 i1Var = this.f20259a;
        if (!z6) {
            P.g gVar = new P.g(this);
            U0.j jVar = new U0.j(29, this);
            Toolbar toolbar = i1Var.f22522a;
            toolbar.f5013e0 = gVar;
            toolbar.f5015f0 = jVar;
            ActionMenuView actionMenuView = toolbar.f5005a;
            if (actionMenuView != null) {
                actionMenuView.f4849I = gVar;
                actionMenuView.f4850J = jVar;
            }
            this.f20263e = true;
        }
        return i1Var.f22522a.getMenu();
    }

    @Override // com.bumptech.glide.d
    public final boolean j() {
        C2723l c2723l;
        ActionMenuView actionMenuView = this.f20259a.f22522a.f5005a;
        return (actionMenuView == null || (c2723l = actionMenuView.f4848H) == null || !c2723l.g()) ? false : true;
    }

    @Override // com.bumptech.glide.d
    public final boolean k() {
        n.m mVar;
        d1 d1Var = this.f20259a.f22522a.f5011d0;
        if (d1Var == null || (mVar = d1Var.f22503b) == null) {
            return false;
        }
        if (d1Var == null) {
            mVar = null;
        }
        if (mVar == null) {
            return true;
        }
        mVar.collapseActionView();
        return true;
    }

    @Override // com.bumptech.glide.d
    public final void q(boolean z6) {
        if (z6 == this.f20264f) {
            return;
        }
        this.f20264f = z6;
        ArrayList arrayList = this.f20265g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // com.bumptech.glide.d
    public final int u() {
        return this.f20259a.f22523b;
    }

    @Override // com.bumptech.glide.d
    public final Context y() {
        return this.f20259a.f22522a.getContext();
    }

    @Override // com.bumptech.glide.d
    public final void G() {
    }

    @Override // com.bumptech.glide.d
    public final void R(boolean z6) {
    }

    @Override // com.bumptech.glide.d
    public final void W(boolean z6) {
    }
}

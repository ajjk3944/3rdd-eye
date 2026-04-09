package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.e0;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a0 extends ActionBar {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f514a;

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f515b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatDelegateImpl.g f516c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f517d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f518e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f519f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f520g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f521h = new a();

    /* renamed from: i, reason: collision with root package name */
    public final Toolbar.h f522i;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.this.y();
        }
    }

    public class b implements Toolbar.h {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return a0.this.f515b.onMenuItemSelected(0, menuItem);
        }
    }

    public final class c implements h.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f525a;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public void b(androidx.appcompat.view.menu.d dVar, boolean z10) {
            if (this.f525a) {
                return;
            }
            this.f525a = true;
            a0.this.f514a.r();
            a0.this.f515b.onPanelClosed(108, dVar);
            this.f525a = false;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public boolean c(androidx.appcompat.view.menu.d dVar) {
            a0.this.f515b.onMenuOpened(108, dVar);
            return true;
        }
    }

    public final class d implements d.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.d.a
        public boolean a(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.d.a
        public void b(androidx.appcompat.view.menu.d dVar) {
            if (a0.this.f514a.e()) {
                a0.this.f515b.onPanelClosed(108, dVar);
            } else if (a0.this.f515b.onPreparePanel(0, null, dVar)) {
                a0.this.f515b.onMenuOpened(108, dVar);
            }
        }
    }

    public class e implements AppCompatDelegateImpl.g {
        public e() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.g
        public boolean a(int i10) {
            if (i10 != 0) {
                return false;
            }
            a0 a0Var = a0.this;
            if (a0Var.f517d) {
                return false;
            }
            a0Var.f514a.f();
            a0.this.f517d = true;
            return false;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.g
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(a0.this.f514a.getContext());
            }
            return null;
        }
    }

    public a0(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f522i = bVar;
        r0.i.g(toolbar);
        d1 d1Var = new d1(toolbar, false);
        this.f514a = d1Var;
        this.f515b = (Window.Callback) r0.i.g(callback);
        d1Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        d1Var.setWindowTitle(charSequence);
        this.f516c = new e();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean f() {
        return this.f514a.b();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean g() {
        if (!this.f514a.h()) {
            return false;
        }
        this.f514a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void h(boolean z10) {
        if (z10 == this.f519f) {
            return;
        }
        this.f519f = z10;
        if (this.f520g.size() <= 0) {
            return;
        }
        z.a(this.f520g.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.ActionBar
    public int i() {
        return this.f514a.v();
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context j() {
        return this.f514a.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean k() {
        this.f514a.m().removeCallbacks(this.f521h);
        ViewCompat.b0(this.f514a.m(), this.f521h);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void l(Configuration configuration) {
        super.l(configuration);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void m() {
        this.f514a.m().removeCallbacks(this.f521h);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean n(int i10, KeyEvent keyEvent) {
        Menu menuX = x();
        if (menuX == null) {
            return false;
        }
        menuX.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuX.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            p();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean p() {
        return this.f514a.c();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void q(boolean z10) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void r(boolean z10) {
        z(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void s(int i10) {
        this.f514a.o(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void t(Drawable drawable) {
        this.f514a.x(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void u(boolean z10) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void v(CharSequence charSequence) {
        this.f514a.setWindowTitle(charSequence);
    }

    public final Menu x() {
        if (!this.f518e) {
            this.f514a.u(new c(), new d());
            this.f518e = true;
        }
        return this.f514a.j();
    }

    public void y() {
        Menu menuX = x();
        androidx.appcompat.view.menu.d dVar = menuX instanceof androidx.appcompat.view.menu.d ? (androidx.appcompat.view.menu.d) menuX : null;
        if (dVar != null) {
            dVar.i0();
        }
        try {
            menuX.clear();
            if (!this.f515b.onCreatePanelMenu(0, menuX) || !this.f515b.onPreparePanel(0, null, menuX)) {
                menuX.clear();
            }
            if (dVar != null) {
                dVar.h0();
            }
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.h0();
            }
            throw th;
        }
    }

    public void z(int i10, int i11) {
        this.f514a.i((i10 & i11) | ((~i11) & this.f514a.v()));
    }
}

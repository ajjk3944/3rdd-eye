package h;

import L0.I;
import L0.S;
import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import h.AbstractC4397a;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: ToolbarActionBar.java */
/* loaded from: classes.dex */
public final class q extends AbstractC4397a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.c f38096a;

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f38097b;

    /* renamed from: c, reason: collision with root package name */
    public final e f38098c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38099d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38100e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f38101f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<AbstractC4397a.b> f38102g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public final a f38103h = new a();

    /* compiled from: ToolbarActionBar.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            q qVar = q.this;
            Window.Callback callback = qVar.f38097b;
            Menu menuR = qVar.r();
            androidx.appcompat.view.menu.f fVar = menuR instanceof androidx.appcompat.view.menu.f ? (androidx.appcompat.view.menu.f) menuR : null;
            if (fVar != null) {
                fVar.w();
            }
            try {
                menuR.clear();
                if (!callback.onCreatePanelMenu(0, menuR) || !callback.onPreparePanel(0, null, menuR)) {
                    menuR.clear();
                }
                if (fVar != null) {
                    fVar.v();
                }
            } catch (Throwable th) {
                if (fVar != null) {
                    fVar.v();
                }
                throw th;
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    public class b implements Toolbar.h {
        public b() {
        }
    }

    /* compiled from: ToolbarActionBar.java */
    public final class c implements j.a {

        /* renamed from: b, reason: collision with root package name */
        public boolean f38106b;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
            if (this.f38106b) {
                return;
            }
            this.f38106b = true;
            q qVar = q.this;
            qVar.f38096a.h();
            qVar.f38097b.onPanelClosed(108, fVar);
            this.f38106b = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            q.this.f38097b.onMenuOpened(108, fVar);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar.java */
    public final class d implements f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.widget.a aVar;
            q qVar = q.this;
            ActionMenuView actionMenuView = qVar.f38096a.f14783a.f14722b;
            boolean z10 = (actionMenuView == null || (aVar = actionMenuView.f14580u) == null || !aVar.k()) ? false : true;
            Window.Callback callback = qVar.f38097b;
            if (z10) {
                callback.onPanelClosed(108, fVar);
            } else if (callback.onPreparePanel(0, null, fVar)) {
                callback.onMenuOpened(108, fVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    public class e {
        public e() {
        }
    }

    public q(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        toolbar.getClass();
        androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(toolbar, false);
        this.f38096a = cVar;
        callback.getClass();
        this.f38097b = callback;
        cVar.f14792k = callback;
        toolbar.setOnMenuItemClickListener(bVar);
        cVar.setWindowTitle(charSequence);
        this.f38098c = new e();
    }

    @Override // h.AbstractC4397a
    public final boolean a() {
        return this.f38096a.f();
    }

    @Override // h.AbstractC4397a
    public final boolean b() {
        androidx.appcompat.widget.c cVar = this.f38096a;
        Toolbar.f fVar = cVar.f14783a.f14714N;
        if (fVar == null || fVar.f14751c == null) {
            return false;
        }
        cVar.collapseActionView();
        return true;
    }

    @Override // h.AbstractC4397a
    public final void c(boolean z10) {
        if (z10 == this.f38101f) {
            return;
        }
        this.f38101f = z10;
        ArrayList<AbstractC4397a.b> arrayList = this.f38102g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
    }

    @Override // h.AbstractC4397a
    public final int d() {
        return this.f38096a.f14784b;
    }

    @Override // h.AbstractC4397a
    public final Context e() {
        return this.f38096a.f14783a.getContext();
    }

    @Override // h.AbstractC4397a
    public final boolean f() {
        androidx.appcompat.widget.c cVar = this.f38096a;
        Toolbar toolbar = cVar.f14783a;
        a aVar = this.f38103h;
        toolbar.removeCallbacks(aVar);
        Toolbar toolbar2 = cVar.f14783a;
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        toolbar2.postOnAnimation(aVar);
        return true;
    }

    @Override // h.AbstractC4397a
    public final void h() {
        this.f38096a.f14783a.removeCallbacks(this.f38103h);
    }

    @Override // h.AbstractC4397a
    public final boolean i(int i, KeyEvent keyEvent) {
        Menu menuR = r();
        if (menuR == null) {
            return false;
        }
        menuR.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuR.performShortcut(i, keyEvent, 0);
    }

    @Override // h.AbstractC4397a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // h.AbstractC4397a
    public final boolean k() {
        return this.f38096a.f14783a.u();
    }

    @Override // h.AbstractC4397a
    public final void m(boolean z10) {
        androidx.appcompat.widget.c cVar = this.f38096a;
        cVar.j((cVar.f14784b & (-5)) | 4);
    }

    @Override // h.AbstractC4397a
    public final void o(CharSequence charSequence) {
        this.f38096a.setTitle(charSequence);
    }

    @Override // h.AbstractC4397a
    public final void p(CharSequence charSequence) {
        this.f38096a.setWindowTitle(charSequence);
    }

    public final Menu r() {
        boolean z10 = this.f38100e;
        androidx.appcompat.widget.c cVar = this.f38096a;
        if (!z10) {
            c cVar2 = new c();
            d dVar = new d();
            Toolbar toolbar = cVar.f14783a;
            toolbar.f14715O = cVar2;
            toolbar.f14716P = dVar;
            ActionMenuView actionMenuView = toolbar.f14722b;
            if (actionMenuView != null) {
                actionMenuView.f14581v = cVar2;
                actionMenuView.f14582w = dVar;
            }
            this.f38100e = true;
        }
        return cVar.f14783a.getMenu();
    }

    @Override // h.AbstractC4397a
    public final void g() {
    }

    @Override // h.AbstractC4397a
    public final void l(boolean z10) {
    }

    @Override // h.AbstractC4397a
    public final void n(boolean z10) {
    }
}

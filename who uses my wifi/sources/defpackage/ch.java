package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ch extends Activity implements r61, k00, at0, b60, s40 {
    public final d60 f = new d60(this);
    public final ij g = new ij();
    public final xb4 h;
    public final gw3 i;
    public q61 j;
    public final ah k;
    public final oz0 l;
    public final bh m;
    public final CopyOnWriteArrayList n;
    public final CopyOnWriteArrayList o;
    public final CopyOnWriteArrayList p;
    public final CopyOnWriteArrayList q;
    public final CopyOnWriteArrayList r;
    public final CopyOnWriteArrayList s;
    public boolean t;
    public boolean u;
    public final oz0 v;

    public ch() {
        i5 i5Var = (i5) this;
        this.h = new xb4(new sg(i5Var, 0));
        gw3 gw3Var = new gw3(new zs0(this, new ga0(2, this)));
        this.i = gw3Var;
        this.k = new ah(i5Var);
        this.l = new oz0(new tg(i5Var, 1));
        new AtomicInteger();
        this.m = new bh(i5Var);
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        this.s = new CopyOnWriteArrayList();
        d60 d60Var = this.f;
        if (d60Var == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        d60Var.a(new vg(0, i5Var));
        int i = 1;
        this.f.a(new vg(i, i5Var));
        this.f.a(new un0(i, i5Var));
        gw3Var.x();
        g82.g(this);
        ((vq2) gw3Var.h).q("android:support:activity-result", new wg(i5Var, 0));
        h(new xg(i5Var, 0));
        new oz0(new tg(i5Var, 2));
        this.v = new oz0(new tg(i5Var, 3));
    }

    public static void f(i5 i5Var) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!i30.c(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!i30.c(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.at0
    public final vq2 a() {
        return (vq2) this.i.h;
    }

    @Override // defpackage.s40
    public final boolean b(KeyEvent keyEvent) {
        i30.m(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.k00
    public final mf0 c() {
        mf0 mf0Var = new mf0(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = mf0Var.a;
        if (application != null) {
            linkedHashMap.put(o61.l, getApplication());
        }
        linkedHashMap.put(g82.g, this);
        linkedHashMap.put(g82.h, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(g82.i, extras);
        }
        return mf0Var;
    }

    @Override // defpackage.r61
    public final q61 d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.j == null) {
            zg zgVar = (zg) getLastNonConfigurationInstance();
            if (zgVar != null) {
                this.j = zgVar.a;
            }
            if (this.j == null) {
                this.j = new q61();
            }
        }
        q61 q61Var = this.j;
        i30.j(q61Var);
        return q61Var;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        i30.m(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        i30.l(decorView, "window.decorView");
        if (um.g(decorView, keyEvent)) {
            return true;
        }
        return um.h(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        i30.m(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        i30.l(decorView, "window.decorView");
        if (um.g(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // defpackage.b60
    public final d60 e() {
        return this.f;
    }

    public final void g(ui uiVar) {
        i30.m(uiVar, "listener");
        this.n.add(uiVar);
    }

    public final void h(ej0 ej0Var) {
        ij ijVar = this.g;
        ijVar.getClass();
        ch chVar = (ch) ijVar.f;
        if (chVar != null) {
            ej0Var.a(chVar);
        }
        ((CopyOnWriteArraySet) ijVar.g).add(ej0Var);
    }

    public final aj0 i() {
        return (aj0) this.v.a();
    }

    public final void j() {
        View decorView = getWindow().getDecorView();
        i30.l(decorView, "getDecorView(...)");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        i30.l(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        i30.l(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        i30.l(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        i30.l(decorView5, "getDecorView(...)");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final void k(Bundle bundle) {
        super.onCreate(bundle);
        int i = op0.g;
        mp0.b(this);
    }

    public final void l(Bundle bundle) {
        i30.m(bundle, "outState");
        this.f.g();
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.m.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        i().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        i30.m(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.n.iterator();
        i30.l(it, "iterator(...)");
        while (it.hasNext()) {
            ((ui) it.next()).accept(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        zs0 zs0Var = (zs0) this.i.g;
        at0 at0Var = zs0Var.a;
        if (!zs0Var.e) {
            zs0Var.a();
        }
        if (at0Var.e().c.compareTo(u50.i) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + at0Var.e().c).toString());
        }
        if (zs0Var.g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleN = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleN = m54.n(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        zs0Var.f = bundleN;
        zs0Var.g = true;
        ij ijVar = this.g;
        ijVar.getClass();
        ijVar.f = this;
        Iterator it = ((CopyOnWriteArraySet) ijVar.g).iterator();
        while (it.hasNext()) {
            ((ej0) it.next()).a(this);
        }
        k(bundle);
        int i = op0.g;
        mp0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        i30.m(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.h.h).iterator();
        while (it.hasNext()) {
            ((rw) it.next()).a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        i30.m(menuItem, "item");
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.h.h).iterator();
            while (it.hasNext()) {
                if (((rw) it.next()).a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.t) {
            return;
        }
        Iterator it = this.q.iterator();
        i30.l(it, "iterator(...)");
        while (it.hasNext()) {
            ((ui) it.next()).accept(new lf0(z));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        i30.m(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.p.iterator();
        i30.l(it, "iterator(...)");
        while (it.hasNext()) {
            ((ui) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        i30.m(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.h.h).iterator();
        while (it.hasNext()) {
            ((rw) it.next()).a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.u) {
            return;
        }
        Iterator it = this.r.iterator();
        i30.l(it, "iterator(...)");
        while (it.hasNext()) {
            ((ui) it.next()).accept(new sk0(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        i30.m(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.h.h).iterator();
        while (it.hasNext()) {
            ((rw) it.next()).a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        i30.m(strArr, "permissions");
        i30.m(iArr, "grantResults");
        if (this.m.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        zg zgVar;
        q61 q61Var = this.j;
        if (q61Var == null && (zgVar = (zg) getLastNonConfigurationInstance()) != null) {
            q61Var = zgVar.a;
        }
        if (q61Var == null) {
            return null;
        }
        zg zgVar2 = new zg();
        zgVar2.a = q61Var;
        return zgVar2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        i30.m(bundle, "outState");
        d60 d60Var = this.f;
        if (d60Var != null) {
            d60Var.g();
        }
        l(bundle);
        this.i.y(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.o.iterator();
        i30.l(it, "iterator(...)");
        while (it.hasNext()) {
            ((ui) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.s.iterator();
        i30.l(it, "iterator(...)");
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (g82.l()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            qx qxVar = (qx) this.l.a();
            synchronized (qxVar.b) {
                try {
                    qxVar.c = true;
                    ArrayList arrayList = qxVar.d;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((rx) obj).a();
                    }
                    qxVar.d.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        j();
        View decorView = getWindow().getDecorView();
        i30.l(decorView, "getDecorView(...)");
        ah ahVar = this.k;
        ahVar.getClass();
        if (!ahVar.h) {
            ahVar.h = true;
            decorView.getViewTreeObserver().addOnDrawListener(ahVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        i30.m(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        i30.m(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        i30.m(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        i30.m(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        i30.m(configuration, "newConfig");
        this.t = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.t = false;
            Iterator it = this.q.iterator();
            i30.l(it, "iterator(...)");
            while (it.hasNext()) {
                ((ui) it.next()).accept(new lf0(z));
            }
        } catch (Throwable th) {
            this.t = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        i30.m(configuration, "newConfig");
        this.u = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.u = false;
            Iterator it = this.r.iterator();
            i30.l(it, "iterator(...)");
            while (it.hasNext()) {
                ((ui) it.next()).accept(new sk0(z));
            }
        } catch (Throwable th) {
            this.u = false;
            throw th;
        }
    }
}

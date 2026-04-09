package d;

import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.j1;
import androidx.lifecycle.k1;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.lifecycle.y0;
import b5.d1;
import com.google.android.gms.internal.ads.hp;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.z3;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class j extends r3.g implements k1, androidx.lifecycle.n, a6.f, f.c {

    /* renamed from: b, reason: collision with root package name */
    public final hp f21604b = new hp();

    /* renamed from: c, reason: collision with root package name */
    public final yb.e f21605c = new yb.e(new b(this, 0));

    /* renamed from: d, reason: collision with root package name */
    public final y4.a f21606d;

    /* renamed from: e, reason: collision with root package name */
    public j1 f21607e;

    /* renamed from: f, reason: collision with root package name */
    public final g f21608f;
    public final yj.n g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f21609h;

    /* renamed from: i, reason: collision with root package name */
    public final i f21610i;
    public final CopyOnWriteArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f21611k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f21612l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f21613m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f21614n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f21615o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21616p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21617q;

    /* renamed from: r, reason: collision with root package name */
    public final yj.n f21618r;

    /* renamed from: s, reason: collision with root package name */
    public final yj.n f21619s;

    /* renamed from: t, reason: collision with root package name */
    public final yj.n f21620t;

    public j() {
        y4.a aVar = new y4.a(new c6.a(this, new a6.e(0, this)));
        this.f21606d = aVar;
        this.f21608f = new g(this);
        this.g = a.a.u(new c(this, 1));
        this.f21609h = new AtomicInteger();
        this.f21610i = new i(this);
        this.j = new CopyOnWriteArrayList();
        this.f21611k = new CopyOnWriteArrayList();
        this.f21612l = new CopyOnWriteArrayList();
        this.f21613m = new CopyOnWriteArrayList();
        this.f21614n = new CopyOnWriteArrayList();
        this.f21615o = new CopyOnWriteArrayList();
        this.f21618r = a.a.u(new c(this, 2));
        androidx.lifecycle.c0 c0Var = this.f32744a;
        if (c0Var == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        c0Var.a(new e(0, this));
        this.f32744a.a(new e(1, this));
        this.f32744a.a(new a6.b(this, 2));
        aVar.n();
        y0.d(this);
        if (Build.VERSION.SDK_INT == 23) {
            this.f32744a.a(new x(this));
        }
        ((yb.i) aVar.f37324b).P("android:support:activity-result", new b5.a0(2, this));
        n(new b5.c0(this, 1));
        this.f21619s = a.a.u(new c(this, 3));
        this.f21620t = a.a.u(new c(this, 4));
    }

    public static void f(c0 c0Var, j jVar, androidx.lifecycle.a0 a0Var, androidx.lifecycle.r rVar) {
        if (rVar == androidx.lifecycle.r.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = jVar.getOnBackInvokedDispatcher();
            nk.k.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            c0Var.a(onBackInvokedDispatcher);
        }
    }

    public static void k(j jVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e2) {
            if (!nk.k.a(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e2;
            }
        } catch (NullPointerException e10) {
            if (!nk.k.a(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e10;
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        View decorView = getWindow().getDecorView();
        nk.k.d(decorView, "getDecorView(...)");
        this.f21608f.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.n
    public final h1 b() {
        return (h1) this.f21619s.getValue();
    }

    @Override // androidx.lifecycle.n
    public final h5.c c() {
        h5.c cVar = new h5.c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f24880a;
        if (application != null) {
            linkedHashMap.put(g1.f1141e, getApplication());
        }
        linkedHashMap.put(y0.f1201a, this);
        linkedHashMap.put(y0.f1202b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(y0.f1203c, extras);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.k1
    public final j1 e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f21607e == null) {
            f fVar = (f) getLastNonConfigurationInstance();
            if (fVar != null) {
                this.f21607e = fVar.f21592a;
            }
            if (this.f21607e == null) {
                this.f21607e = new j1();
            }
        }
        j1 j1Var = this.f21607e;
        nk.k.b(j1Var);
        return j1Var;
    }

    @Override // a6.f
    public final yb.i g() {
        return (yb.i) this.f21606d.f37324b;
    }

    @Override // f.c
    public final f.d h(ci.b bVar, f.b bVar2) {
        i iVar = this.f21610i;
        nk.k.e(iVar, "registry");
        return iVar.c("activity_rq#" + this.f21609h.getAndIncrement(), this, bVar, bVar2);
    }

    @Override // androidx.lifecycle.a0
    public final androidx.lifecycle.c0 j() {
        return this.f32744a;
    }

    public final void l(e4.n nVar, androidx.lifecycle.a0 a0Var) {
        nk.k.e(nVar, "provider");
        nk.k.e(a0Var, "owner");
        yb.e eVar = this.f21605c;
        eVar.getClass();
        androidx.lifecycle.c0 c0VarJ = ((d1) a0Var).j();
        HashMap map = (HashMap) eVar.f37511d;
        e4.m mVar = (e4.m) map.remove(nVar);
        if (mVar != null) {
            mVar.f22372a.b(mVar.f22373b);
            mVar.f22373b = null;
        }
        map.put(nVar, new e4.m(c0VarJ, new d(eVar, nVar)));
    }

    public final void m(d4.a aVar) {
        nk.k.e(aVar, "listener");
        this.j.add(aVar);
    }

    public final void n(e.a aVar) {
        hp hpVar = this.f21604b;
        hpVar.getClass();
        j jVar = (j) hpVar.f11935b;
        if (jVar != null) {
            aVar.a(jVar);
        }
        ((CopyOnWriteArraySet) hpVar.f11934a).add(aVar);
    }

    public final c0 o() {
        return (c0) this.f21620t.getValue();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i4, int i10, Intent intent) {
        if (this.f21610i.a(i4, i10, intent)) {
            return;
        }
        super.onActivityResult(i4, i10, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ((k5.a) this.f21618r.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        nk.k.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.j.iterator();
        nk.k.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((d4.a) it.next()).accept(configuration);
        }
    }

    @Override // r3.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f21606d.q(bundle);
        hp hpVar = this.f21604b;
        hpVar.getClass();
        hpVar.f11935b = this;
        Iterator it = ((CopyOnWriteArraySet) hpVar.f11934a).iterator();
        while (it.hasNext()) {
            ((e.a) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i4 = u0.f1190b;
        s0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i4, Menu menu) {
        nk.k.e(menu, "menu");
        if (i4 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i4, menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f21605c.f37510c).iterator();
        while (it.hasNext()) {
            ((e4.n) it.next()).c(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        nk.k.e(menuItem, "item");
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f21605c.f37510c).iterator();
            while (it.hasNext()) {
                if (((e4.n) it.next()).a(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3) {
        if (this.f21616p) {
            return;
        }
        Iterator it = this.f21613m.iterator();
        nk.k.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((d4.a) it.next()).accept(new r3.h(z3));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        nk.k.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f21612l.iterator();
        nk.k.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((d4.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i4, Menu menu) {
        nk.k.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f21605c.f37510c).iterator();
        while (it.hasNext()) {
            ((e4.n) it.next()).b(menu);
        }
        super.onPanelClosed(i4, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3) {
        if (this.f21617q) {
            return;
        }
        Iterator it = this.f21614n.iterator();
        nk.k.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((d4.a) it.next()).accept(new r3.z(z3));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i4, View view, Menu menu) {
        nk.k.e(menu, "menu");
        if (i4 != 0) {
            return true;
        }
        super.onPreparePanel(i4, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f21605c.f37510c).iterator();
        while (it.hasNext()) {
            ((e4.n) it.next()).d(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        nk.k.e(strArr, "permissions");
        nk.k.e(iArr, "grantResults");
        if (this.f21610i.a(i4, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        f fVar;
        j1 j1Var = this.f21607e;
        if (j1Var == null && (fVar = (f) getLastNonConfigurationInstance()) != null) {
            j1Var = fVar.f21592a;
        }
        if (j1Var == null) {
            return null;
        }
        f fVar2 = new f();
        fVar2.f21592a = j1Var;
        return fVar2;
    }

    @Override // r3.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        nk.k.e(bundle, "outState");
        androidx.lifecycle.c0 c0Var = this.f32744a;
        if (c0Var != null) {
            nk.k.c(c0Var, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            c0Var.g();
        }
        super.onSaveInstanceState(bundle);
        this.f21606d.r(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        super.onTrimMemory(i4);
        Iterator it = this.f21611k.iterator();
        nk.k.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((d4.a) it.next()).accept(Integer.valueOf(i4));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f21615o.iterator();
        nk.k.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void p() {
        View decorView = getWindow().getDecorView();
        nk.k.d(decorView, "getDecorView(...)");
        y0.h(decorView, this);
        View decorView2 = getWindow().getDecorView();
        nk.k.d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        nk.k.d(decorView3, "getDecorView(...)");
        d5.u(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        nk.k.d(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        nk.k.d(decorView5, "getDecorView(...)");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        nk.k.d(decorView6, "getDecorView(...)");
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (z3.p()) {
                Trace.beginSection(z3.w("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            t tVar = (t) this.g.getValue();
            synchronized (tVar.f21631b) {
                try {
                    tVar.f21632c = true;
                    ArrayList arrayList = tVar.f21633d;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        ((mk.a) obj).invoke();
                    }
                    tVar.f21633d.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i4) {
        p();
        View decorView = getWindow().getDecorView();
        nk.k.d(decorView, "getDecorView(...)");
        this.f21608f.a(decorView);
        super.setContentView(i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i4) {
        nk.k.e(intent, "intent");
        super.startActivityForResult(intent, i4);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i4, Intent intent, int i10, int i11, int i12) throws IntentSender.SendIntentException {
        nk.k.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i4, intent, i10, i11, i12);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i4, Bundle bundle) {
        nk.k.e(intent, "intent");
        super.startActivityForResult(intent, i4, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i4, Intent intent, int i10, int i11, int i12, Bundle bundle) throws IntentSender.SendIntentException {
        nk.k.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i4, intent, i10, i11, i12, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3, Configuration configuration) {
        nk.k.e(configuration, "newConfig");
        this.f21616p = true;
        try {
            super.onMultiWindowModeChanged(z3, configuration);
            this.f21616p = false;
            Iterator it = this.f21613m.iterator();
            nk.k.d(it, "iterator(...)");
            while (it.hasNext()) {
                ((d4.a) it.next()).accept(new r3.h(z3));
            }
        } catch (Throwable th2) {
            this.f21616p = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3, Configuration configuration) {
        nk.k.e(configuration, "newConfig");
        this.f21617q = true;
        try {
            super.onPictureInPictureModeChanged(z3, configuration);
            this.f21617q = false;
            Iterator it = this.f21614n.iterator();
            nk.k.d(it, "iterator(...)");
            while (it.hasNext()) {
                ((d4.a) it.next()).accept(new r3.z(z3));
            }
        } catch (Throwable th2) {
            this.f21617q = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        p();
        View decorView = getWindow().getDecorView();
        nk.k.d(decorView, "getDecorView(...)");
        this.f21608f.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        View decorView = getWindow().getDecorView();
        nk.k.d(decorView, "getDecorView(...)");
        this.f21608f.a(decorView);
        super.setContentView(view, layoutParams);
    }
}

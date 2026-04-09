package c;

import a.AbstractC0241a;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0300w;
import androidx.lifecycle.EnumC0291m;
import androidx.lifecycle.EnumC0292n;
import androidx.lifecycle.InterfaceC0287i;
import androidx.lifecycle.InterfaceC0296s;
import androidx.lifecycle.InterfaceC0298u;
import androidx.lifecycle.Q;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import c5.C0410g;
import com.apm.insight.R;
import d.InterfaceC2261a;
import e.AbstractC2286c;
import e.InterfaceC2285b;
import h.AbstractActivityC2349g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: c.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0389n extends G.e implements b0, InterfaceC0287i, F0.g, InterfaceC0373M {

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f5849H = 0;

    /* renamed from: C, reason: collision with root package name */
    public final CopyOnWriteArrayList f5850C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f5851D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f5852E;

    /* renamed from: F, reason: collision with root package name */
    public final C0410g f5853F;

    /* renamed from: G, reason: collision with root package name */
    public final C0410g f5854G;

    /* renamed from: b, reason: collision with root package name */
    public final H1.h f5855b = new H1.h();

    /* renamed from: c, reason: collision with root package name */
    public final V2.e f5856c;

    /* renamed from: d, reason: collision with root package name */
    public final A1.w f5857d;

    /* renamed from: e, reason: collision with root package name */
    public a0 f5858e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewTreeObserverOnDrawListenerC0386k f5859f;

    /* renamed from: g, reason: collision with root package name */
    public final C0410g f5860g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f5861h;
    public final C0387l i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f5862j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f5863k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f5864l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f5865m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f5866n;

    public AbstractActivityC0389n() {
        final AbstractActivityC2349g abstractActivityC2349g = (AbstractActivityC2349g) this;
        this.f5856c = new V2.e(new RunnableC0379d(abstractActivityC2349g, 0));
        A1.w wVar = new A1.w(this);
        this.f5857d = wVar;
        this.f5859f = new ViewTreeObserverOnDrawListenerC0386k(abstractActivityC2349g);
        this.f5860g = new C0410g(new C0388m(abstractActivityC2349g, 2));
        this.f5861h = new AtomicInteger();
        this.i = new C0387l(abstractActivityC2349g);
        this.f5862j = new CopyOnWriteArrayList();
        this.f5863k = new CopyOnWriteArrayList();
        this.f5864l = new CopyOnWriteArrayList();
        this.f5865m = new CopyOnWriteArrayList();
        this.f5866n = new CopyOnWriteArrayList();
        this.f5850C = new CopyOnWriteArrayList();
        C0300w c0300w = this.f1476a;
        if (c0300w == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i = 0;
        c0300w.a(new InterfaceC0296s() { // from class: c.e
            @Override // androidx.lifecycle.InterfaceC0296s
            public final void d(InterfaceC0298u interfaceC0298u, EnumC0291m enumC0291m) {
                Window window;
                View viewPeekDecorView;
                switch (i) {
                    case 0:
                        AbstractActivityC2349g abstractActivityC2349g2 = abstractActivityC2349g;
                        if (enumC0291m == EnumC0291m.ON_STOP && (window = abstractActivityC2349g2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC2349g abstractActivityC2349g3 = abstractActivityC2349g;
                        if (enumC0291m == EnumC0291m.ON_DESTROY) {
                            abstractActivityC2349g3.f5855b.f1765a = null;
                            if (!abstractActivityC2349g3.isChangingConfigurations()) {
                                abstractActivityC2349g3.d().a();
                            }
                            ViewTreeObserverOnDrawListenerC0386k viewTreeObserverOnDrawListenerC0386k = abstractActivityC2349g3.f5859f;
                            AbstractActivityC2349g abstractActivityC2349g4 = viewTreeObserverOnDrawListenerC0386k.f5838d;
                            abstractActivityC2349g4.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0386k);
                            abstractActivityC2349g4.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0386k);
                            break;
                        }
                        break;
                }
            }
        });
        final int i3 = 1;
        this.f1476a.a(new InterfaceC0296s() { // from class: c.e
            @Override // androidx.lifecycle.InterfaceC0296s
            public final void d(InterfaceC0298u interfaceC0298u, EnumC0291m enumC0291m) {
                Window window;
                View viewPeekDecorView;
                switch (i3) {
                    case 0:
                        AbstractActivityC2349g abstractActivityC2349g2 = abstractActivityC2349g;
                        if (enumC0291m == EnumC0291m.ON_STOP && (window = abstractActivityC2349g2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC2349g abstractActivityC2349g3 = abstractActivityC2349g;
                        if (enumC0291m == EnumC0291m.ON_DESTROY) {
                            abstractActivityC2349g3.f5855b.f1765a = null;
                            if (!abstractActivityC2349g3.isChangingConfigurations()) {
                                abstractActivityC2349g3.d().a();
                            }
                            ViewTreeObserverOnDrawListenerC0386k viewTreeObserverOnDrawListenerC0386k = abstractActivityC2349g3.f5859f;
                            AbstractActivityC2349g abstractActivityC2349g4 = viewTreeObserverOnDrawListenerC0386k.f5838d;
                            abstractActivityC2349g4.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0386k);
                            abstractActivityC2349g4.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0386k);
                            break;
                        }
                        break;
                }
            }
        });
        this.f1476a.a(new F0.b(4, abstractActivityC2349g));
        wVar.c();
        Q.e(this);
        if (Build.VERSION.SDK_INT <= 23) {
            this.f1476a.a(new C0361A(abstractActivityC2349g));
        }
        ((F0.f) wVar.f139b).f("android:support:activity-result", new C0381f(abstractActivityC2349g, 0));
        int i6 = 0;
        m(new C0382g(abstractActivityC2349g, i6));
        this.f5853F = new C0410g(new C0388m(abstractActivityC2349g, i6));
        this.f5854G = new C0410g(new C0388m(abstractActivityC2349g, 3));
    }

    @Override // androidx.lifecycle.InterfaceC0287i
    public final n0.d c() {
        n0.d dVar = new n0.d(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = dVar.f22143a;
        if (application != null) {
            Application application2 = getApplication();
            q5.i.d(application2, "application");
            linkedHashMap.put(Y.f5231e, application2);
        }
        linkedHashMap.put(Q.f5209a, this);
        linkedHashMap.put(Q.f5210b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(Q.f5211c, extras);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.b0
    public final a0 d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f5858e == null) {
            C0385j c0385j = (C0385j) getLastNonConfigurationInstance();
            if (c0385j != null) {
                this.f5858e = c0385j.f5834a;
            }
            if (this.f5858e == null) {
                this.f5858e = new a0();
            }
        }
        a0 a0Var = this.f5858e;
        q5.i.b(a0Var);
        return a0Var;
    }

    @Override // F0.g
    public final F0.f f() {
        return (F0.f) this.f5857d.f139b;
    }

    @Override // androidx.lifecycle.InterfaceC0298u
    public final C0300w j() {
        return this.f1476a;
    }

    public final void l(Q.a aVar) {
        q5.i.e(aVar, "listener");
        this.f5862j.add(aVar);
    }

    public final void m(InterfaceC2261a interfaceC2261a) {
        H1.h hVar = this.f5855b;
        hVar.getClass();
        AbstractActivityC0389n abstractActivityC0389n = (AbstractActivityC0389n) hVar.f1765a;
        if (abstractActivityC0389n != null) {
            interfaceC2261a.a(abstractActivityC0389n);
        }
        ((CopyOnWriteArraySet) hVar.f1766b).add(interfaceC2261a);
    }

    public final Z n() {
        return (Z) this.f5853F.getValue();
    }

    public final C0371K o() {
        return (C0371K) this.f5854G.getValue();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i3, Intent intent) {
        if (this.i.a(i, i3, intent)) {
            return;
        }
        super.onActivityResult(i, i3, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        o().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        q5.i.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.f5862j.iterator();
        while (it.hasNext()) {
            ((Q.a) it.next()).accept(configuration);
        }
    }

    @Override // G.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f5857d.e(bundle);
        H1.h hVar = this.f5855b;
        hVar.getClass();
        hVar.f1765a = this;
        Iterator it = ((CopyOnWriteArraySet) hVar.f1766b).iterator();
        while (it.hasNext()) {
            ((InterfaceC2261a) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = androidx.lifecycle.L.f5194b;
        androidx.lifecycle.J.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        q5.i.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f5856c.f3869c).iterator();
        while (it.hasNext()) {
            ((k0.D) it.next()).f21478a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        q5.i.e(menuItem, "item");
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f5856c.f3869c).iterator();
            while (it.hasNext()) {
                if (((k0.D) it.next()).f21478a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z6) {
        if (this.f5851D) {
            return;
        }
        Iterator it = this.f5865m.iterator();
        while (it.hasNext()) {
            ((Q.a) it.next()).accept(new G.f(z6));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        q5.i.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f5864l.iterator();
        while (it.hasNext()) {
            ((Q.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        q5.i.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f5856c.f3869c).iterator();
        while (it.hasNext()) {
            ((k0.D) it.next()).f21478a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z6) {
        if (this.f5852E) {
            return;
        }
        Iterator it = this.f5866n.iterator();
        while (it.hasNext()) {
            ((Q.a) it.next()).accept(new G.s(z6));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        q5.i.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f5856c.f3869c).iterator();
        while (it.hasNext()) {
            ((k0.D) it.next()).f21478a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        q5.i.e(strArr, "permissions");
        q5.i.e(iArr, "grantResults");
        if (this.i.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0385j c0385j;
        a0 a0Var = this.f5858e;
        if (a0Var == null && (c0385j = (C0385j) getLastNonConfigurationInstance()) != null) {
            a0Var = c0385j.f5834a;
        }
        if (a0Var == null) {
            return null;
        }
        C0385j c0385j2 = new C0385j();
        c0385j2.f5834a = a0Var;
        return c0385j2;
    }

    @Override // G.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        q5.i.e(bundle, "outState");
        C0300w c0300w = this.f1476a;
        if (c0300w != null) {
            q5.i.c(c0300w, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            c0300w.g(EnumC0292n.f5245c);
        }
        super.onSaveInstanceState(bundle);
        this.f5857d.f(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f5863k.iterator();
        while (it.hasNext()) {
            ((Q.a) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f5850C.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final AbstractC2286c p(R2.a aVar, InterfaceC2285b interfaceC2285b) {
        C0387l c0387l = this.i;
        q5.i.e(c0387l, "registry");
        return c0387l.d("activity_rq#" + this.f5861h.getAndIncrement(), this, aVar, interfaceC2285b);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (R3.b.s()) {
                R3.b.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            v vVar = (v) this.f5860g.getValue();
            synchronized (vVar.f5873b) {
                try {
                    vVar.f5874c = true;
                    ArrayList arrayList = vVar.f5875d;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((p5.a) obj).b();
                    }
                    vVar.f5875d.clear();
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
        View decorView = getWindow().getDecorView();
        q5.i.d(decorView, "window.decorView");
        Q.i(decorView, this);
        View decorView2 = getWindow().getDecorView();
        q5.i.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        q5.i.d(decorView3, "window.decorView");
        AbstractC0241a.o(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        q5.i.d(decorView4, "window.decorView");
        com.bumptech.glide.c.J(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        q5.i.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        q5.i.d(decorView6, "window.decorView");
        ViewTreeObserverOnDrawListenerC0386k viewTreeObserverOnDrawListenerC0386k = this.f5859f;
        viewTreeObserverOnDrawListenerC0386k.getClass();
        if (!viewTreeObserverOnDrawListenerC0386k.f5837c) {
            viewTreeObserverOnDrawListenerC0386k.f5837c = true;
            decorView6.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC0386k);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        q5.i.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i3, int i6, int i7) throws IntentSender.SendIntentException {
        q5.i.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i3, i6, i7);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        q5.i.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i3, int i6, int i7, Bundle bundle) throws IntentSender.SendIntentException {
        q5.i.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i3, i6, i7, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z6, Configuration configuration) {
        q5.i.e(configuration, "newConfig");
        this.f5851D = true;
        try {
            super.onMultiWindowModeChanged(z6, configuration);
            this.f5851D = false;
            Iterator it = this.f5865m.iterator();
            while (it.hasNext()) {
                ((Q.a) it.next()).accept(new G.f(z6));
            }
        } catch (Throwable th) {
            this.f5851D = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z6, Configuration configuration) {
        q5.i.e(configuration, "newConfig");
        this.f5852E = true;
        try {
            super.onPictureInPictureModeChanged(z6, configuration);
            this.f5852E = false;
            Iterator it = this.f5866n.iterator();
            while (it.hasNext()) {
                ((Q.a) it.next()).accept(new G.s(z6));
            }
        } catch (Throwable th) {
            this.f5852E = false;
            throw th;
        }
    }
}

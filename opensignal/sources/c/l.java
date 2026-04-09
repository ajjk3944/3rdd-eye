package c;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import o4.d0;

/* loaded from: classes.dex */
public abstract class l extends g3.g implements w0, androidx.lifecycle.h, l7.e {
    public w B;
    public final k D;
    public final h4 E;
    public final g F;
    public final CopyOnWriteArrayList G;
    public final CopyOnWriteArrayList H;
    public final CopyOnWriteArrayList I;
    public final CopyOnWriteArrayList J;
    public final CopyOnWriteArrayList K;
    public boolean L;
    public boolean M;

    /* renamed from: d, reason: collision with root package name */
    public final zb.g f3028d = new zb.g();

    /* renamed from: g, reason: collision with root package name */
    public final qm.c f3029g = new qm.c(new f0(2, this));

    /* renamed from: r, reason: collision with root package name */
    public final androidx.lifecycle.x f3030r;

    /* renamed from: x, reason: collision with root package name */
    public final i4.b f3031x;

    /* renamed from: y, reason: collision with root package name */
    public v0 f3032y;

    public l() {
        androidx.lifecycle.x xVar = new androidx.lifecycle.x(this);
        this.f3030r = xVar;
        i4.b bVar = new i4.b(new n7.b(this, new p0(10, this)));
        this.f3031x = bVar;
        this.B = null;
        this.D = new k(this);
        new p0(1, this);
        h4 h4Var = new h4();
        h4Var.f5056d = new Object();
        h4Var.f5057g = new ArrayList();
        this.E = h4Var;
        new AtomicInteger();
        this.F = new g(this);
        this.G = new CopyOnWriteArrayList();
        this.H = new CopyOnWriteArrayList();
        this.I = new CopyOnWriteArrayList();
        this.J = new CopyOnWriteArrayList();
        this.K = new CopyOnWriteArrayList();
        this.L = false;
        this.M = false;
        xVar.V0(new h(this, 0));
        xVar.V0(new h(this, 1));
        xVar.V0(new h(this, 2));
        bVar.J();
        o0.b(this);
        ((io.sentry.t) bVar.f11197d).H("android:support:activity-result", new d(0, this));
        i(new e(this, 0));
    }

    @Override // androidx.lifecycle.h
    public final v4.c a() {
        v4.c cVar = new v4.c();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f23843a;
        if (application != null) {
            linkedHashMap.put(o0.f1508r, getApplication());
        }
        linkedHashMap.put(o0.f1505a, this);
        linkedHashMap.put(o0.f1506d, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(o0.f1507g, getIntent().getExtras());
        }
        return cVar;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        this.D.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.w0
    public final v0 d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f3032y == null) {
            j jVar = (j) getLastNonConfigurationInstance();
            if (jVar != null) {
                this.f3032y = jVar.f3023b;
            }
            if (this.f3032y == null) {
                this.f3032y = new v0();
            }
        }
        return this.f3032y;
    }

    @Override // l7.e
    public final io.sentry.t f() {
        return (io.sentry.t) this.f3031x.f11197d;
    }

    public final void g(t3.a aVar) {
        this.G.add(aVar);
    }

    @Override // androidx.lifecycle.v
    public final androidx.lifecycle.o h() {
        return this.f3030r;
    }

    public final void i(e.a aVar) {
        zb.g gVar = this.f3028d;
        gVar.getClass();
        if (((l) gVar.f26826b) != null) {
            aVar.a();
        }
        ((CopyOnWriteArraySet) gVar.f26825a).add(aVar);
    }

    public final w j() {
        if (this.B == null) {
            this.B = new w(new b4.e(4, this));
            this.f3030r.V0(new h(this, 3));
        }
        return this.B;
    }

    public final void k() {
        o0.f(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        br.l.e(decorView, "<this>");
        decorView.setTag(v4.d.view_tree_view_model_store_owner, this);
        i4.C(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        br.l.e(decorView2, "<this>");
        decorView2.setTag(x.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView3 = getWindow().getDecorView();
        br.l.e(decorView3, "<this>");
        decorView3.setTag(x.report_drawn, this);
    }

    public Object l() {
        return null;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.F.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        j().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((t3.a) it.next()).accept(configuration);
        }
    }

    @Override // g3.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        n7.b bVar = (n7.b) this.f3031x.f11196a;
        l7.e eVar = bVar.f17388a;
        if (!bVar.f17392e) {
            bVar.a();
        }
        if (eVar.h().e1().isAtLeast(androidx.lifecycle.n.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + eVar.h().e1()).toString());
        }
        if (bVar.f17394g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleF = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleF = b4.F("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        bVar.f17393f = bundleF;
        bVar.f17394g = true;
        zb.g gVar = this.f3028d;
        gVar.getClass();
        gVar.f26826b = this;
        Iterator it = ((CopyOnWriteArraySet) gVar.f26825a).iterator();
        while (it.hasNext()) {
            ((e.a) it.next()).a();
        }
        super.onCreate(bundle);
        int i10 = k0.f1500d;
        i0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f3029g.f20918d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).f18787a.k(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f3029g.f20918d).iterator();
            while (it.hasNext()) {
                if (((d0) it.next()).f18787a.p(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        if (this.L) {
            return;
        }
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            ((t3.a) it.next()).accept(new g3.i(z10));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            ((t3.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f3029g.f20918d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).f18787a.q();
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10) {
        if (this.M) {
            return;
        }
        Iterator it = this.K.iterator();
        while (it.hasNext()) {
            ((t3.a) it.next()).accept(new g3.u(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f3029g.f20918d).iterator();
        while (it.hasNext()) {
            ((d0) it.next()).f18787a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.F.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        Object objL = l();
        v0 v0Var = this.f3032y;
        if (v0Var == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            v0Var = jVar.f3023b;
        }
        if (v0Var == null && objL == null) {
            return null;
        }
        j jVar2 = new j();
        jVar2.f3022a = objL;
        jVar2.f3023b = v0Var;
        return jVar2;
    }

    @Override // g3.g, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.x xVar = this.f3030r;
        if (xVar != null) {
            xVar.x1(androidx.lifecycle.n.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f3031x.K(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            ((t3.a) it.next()).accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (xu.d.N()) {
                xu.d.e("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            h4 h4Var = this.E;
            synchronized (h4Var.f5056d) {
                try {
                    h4Var.f5055a = true;
                    Iterator it = ((ArrayList) h4Var.f5057g).iterator();
                    while (it.hasNext()) {
                        ((ar.a) it.next()).c();
                    }
                    ((ArrayList) h4Var.f5057g).clear();
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
    public void setContentView(int i10) {
        k();
        this.D.a(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.L = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.L = false;
            Iterator it = this.J.iterator();
            while (it.hasNext()) {
                t3.a aVar = (t3.a) it.next();
                br.l.e(configuration, "newConfig");
                aVar.accept(new g3.i(z10));
            }
        } catch (Throwable th2) {
            this.L = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.M = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.M = false;
            Iterator it = this.K.iterator();
            while (it.hasNext()) {
                t3.a aVar = (t3.a) it.next();
                br.l.e(configuration, "newConfig");
                aVar.accept(new g3.u(z10));
            }
        } catch (Throwable th2) {
            this.M = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        k();
        this.D.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        this.D.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}

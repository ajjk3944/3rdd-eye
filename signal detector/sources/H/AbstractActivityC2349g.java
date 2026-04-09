package h;

import a.AbstractC0241a;
import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.C0300w;
import androidx.lifecycle.EnumC0291m;
import androidx.lifecycle.EnumC0292n;
import androidx.lifecycle.Q;
import c.AbstractActivityC0389n;
import c.C0381f;
import c.C0382g;
import h.AbstractActivityC2349g;
import k0.AbstractComponentCallbacksC2617v;
import k0.K;
import k0.S;
import o.n1;

/* renamed from: h.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2349g extends AbstractActivityC0389n implements InterfaceC2350h {

    /* renamed from: K, reason: collision with root package name */
    public boolean f20343K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f20344L;

    /* renamed from: N, reason: collision with root package name */
    public v f20345N;

    /* renamed from: I, reason: collision with root package name */
    public final d4.h f20341I = new d4.h(6, new k0.x(this));

    /* renamed from: J, reason: collision with root package name */
    public final C0300w f20342J = new C0300w(this);
    public boolean M = true;

    public AbstractActivityC2349g() {
        ((F0.f) this.f5857d.f139b).f("android:support:lifecycle", new C0381f(this, 1));
        final int i = 0;
        l(new Q.a(this) { // from class: k0.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC2349g f21725b;

            {
                this.f21725b = this;
            }

            @Override // Q.a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.f21725b.f20341I.e();
                        break;
                    default:
                        this.f21725b.f20341I.e();
                        break;
                }
            }
        });
        final int i3 = 1;
        this.f5864l.add(new Q.a(this) { // from class: k0.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC2349g f21725b;

            {
                this.f21725b = this;
            }

            @Override // Q.a
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        this.f21725b.f20341I.e();
                        break;
                    default:
                        this.f21725b.f20341I.e();
                        break;
                }
            }
        });
        m(new C0382g(this, 1));
        ((F0.f) this.f5857d.f139b).f("androidx:appcompat", new F0.a(this));
        m(new C2348f(this));
    }

    public static boolean u(K k6) {
        boolean zU = false;
        for (AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v : k6.f21505c.s()) {
            if (abstractComponentCallbacksC2617v != null) {
                k0.x xVar = abstractComponentCallbacksC2617v.f21685H;
                if ((xVar == null ? null : xVar.f21729m) != null) {
                    zU |= u(abstractComponentCallbacksC2617v.l());
                }
                S s5 = abstractComponentCallbacksC2617v.f21707c0;
                EnumC0292n enumC0292n = EnumC0292n.f5245c;
                EnumC0292n enumC0292n2 = EnumC0292n.f5246d;
                if (s5 != null && s5.j().f5259d.compareTo(enumC0292n2) >= 0) {
                    abstractComponentCallbacksC2617v.f21707c0.f21572d.g(enumC0292n);
                    zU = true;
                }
                if (abstractComponentCallbacksC2617v.b0.f5259d.compareTo(enumC0292n2) >= 0) {
                    abstractComponentCallbacksC2617v.b0.g(enumC0292n);
                    zU = true;
                }
            }
        }
        return zU;
    }

    public boolean A() {
        Intent intentD = G.c.d(this);
        if (intentD == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentD)) {
            navigateUpTo(intentD);
            return true;
        }
        G.t tVar = new G.t(this);
        Intent intentD2 = G.c.d(this);
        if (intentD2 == null) {
            intentD2 = G.c.d(this);
        }
        if (intentD2 != null) {
            ComponentName component = intentD2.getComponent();
            if (component == null) {
                component = intentD2.resolveActivity(tVar.f1510b.getPackageManager());
            }
            tVar.a(component);
            tVar.f1509a.add(intentD2);
        }
        tVar.b();
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public final void B(Toolbar toolbar) {
        v vVar = (v) q();
        if (vVar.f20416j instanceof Activity) {
            vVar.H();
            com.bumptech.glide.d dVar = vVar.f20385C;
            if (dVar instanceof H) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            vVar.f20386D = null;
            if (dVar != null) {
                dVar.H();
            }
            vVar.f20385C = null;
            if (toolbar != null) {
                Object obj = vVar.f20416j;
                C c6 = new C(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : vVar.f20387E, vVar.f20422m);
                vVar.f20385C = c6;
                vVar.f20422m.f20360b = c6.f20261c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                vVar.f20422m.f20360b = null;
            }
            vVar.d();
        }
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t();
        v vVar = (v) q();
        vVar.B();
        ((ViewGroup) vVar.f20396O.findViewById(R.id.content)).addView(view, layoutParams);
        vVar.f20422m.a(vVar.f20420l.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x01e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.AbstractActivityC2349g.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        com.bumptech.glide.d dVarR = r();
        if (getWindow().hasFeature(0)) {
            if (dVarR == null || !dVarR.j()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // G.e, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        com.bumptech.glide.d dVarR = r();
        if (keyCode == 82 && dVarR != null && dVarR.L(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dump(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.AbstractActivityC2349g.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        v vVar = (v) q();
        vVar.B();
        return vVar.f20420l.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        v vVar = (v) q();
        if (vVar.f20386D == null) {
            vVar.H();
            com.bumptech.glide.d dVar = vVar.f20385C;
            vVar.f20386D = new m.h(dVar != null ? dVar.y() : vVar.f20418k);
        }
        return vVar.f20386D;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = n1.f22597a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        q().d();
    }

    @Override // c.AbstractActivityC0389n, android.app.Activity
    public final void onActivityResult(int i, int i3, Intent intent) {
        this.f20341I.e();
        super.onActivityResult(i, i3, intent);
    }

    @Override // c.AbstractActivityC0389n, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v vVar = (v) q();
        if (vVar.f20401T && vVar.f20395N) {
            vVar.H();
            com.bumptech.glide.d dVar = vVar.f20385C;
            if (dVar != null) {
                dVar.G();
            }
        }
        o.r rVarA = o.r.a();
        Context context = vVar.f20418k;
        synchronized (rVarA) {
            rVarA.f22623a.l(context);
        }
        vVar.f20412f0 = new Configuration(vVar.f20418k.getResources().getConfiguration());
        vVar.s(false, false);
    }

    @Override // c.AbstractActivityC0389n, G.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20342J.d(EnumC0291m.ON_CREATE);
        K k6 = ((k0.x) this.f20341I.f19807b).f21728l;
        k6.f21495F = false;
        k6.f21496G = false;
        k6.M.f21542g = false;
        k6.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((k0.x) this.f20341I.f19807b).f21728l.f21508f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        v();
        q().h();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // c.AbstractActivityC0389n, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (w(i, menuItem)) {
            return true;
        }
        com.bumptech.glide.d dVarR = r();
        if (menuItem.getItemId() != 16908332 || dVarR == null || (dVarR.u() & 4) == 0) {
            return false;
        }
        return A();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f20344L = false;
        ((k0.x) this.f20341I.f19807b).f21728l.t(5);
        this.f20342J.d(EnumC0291m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((v) q()).B();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        x();
        v vVar = (v) q();
        vVar.H();
        com.bumptech.glide.d dVar = vVar.f20385C;
        if (dVar != null) {
            dVar.W(true);
        }
    }

    @Override // c.AbstractActivityC0389n, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f20341I.e();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        d4.h hVar = this.f20341I;
        hVar.e();
        super.onResume();
        this.f20344L = true;
        ((k0.x) hVar.f19807b).f21728l.x(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        y();
        ((v) q()).s(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f20341I.e();
    }

    @Override // android.app.Activity
    public final void onStop() {
        z();
        v vVar = (v) q();
        vVar.H();
        com.bumptech.glide.d dVar = vVar.f20385C;
        if (dVar != null) {
            dVar.W(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        q().q(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        com.bumptech.glide.d dVarR = r();
        if (getWindow().hasFeature(0)) {
            if (dVarR == null || !dVarR.M()) {
                super.openOptionsMenu();
            }
        }
    }

    public final k q() {
        if (this.f20345N == null) {
            C0.B b5 = k.f20346a;
            this.f20345N = new v(this, null, this, this);
        }
        return this.f20345N;
    }

    public final com.bumptech.glide.d r() {
        v vVar = (v) q();
        vVar.H();
        return vVar.f20385C;
    }

    public final K s() {
        return ((k0.x) this.f20341I.f19807b).f21728l;
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        t();
        q().l(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((v) q()).f20414h0 = i;
    }

    public final void t() {
        Q.i(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        q5.i.e(decorView, "<this>");
        decorView.setTag(com.apm.insight.R.id.view_tree_view_model_store_owner, this);
        AbstractC0241a.o(getWindow().getDecorView(), this);
        com.bumptech.glide.c.J(getWindow().getDecorView(), this);
    }

    public final void v() {
        super.onDestroy();
        ((k0.x) this.f20341I.f19807b).f21728l.k();
        this.f20342J.d(EnumC0291m.ON_DESTROY);
    }

    public final boolean w(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((k0.x) this.f20341I.f19807b).f21728l.i();
        }
        return false;
    }

    public final void x() {
        super.onPostResume();
        this.f20342J.d(EnumC0291m.ON_RESUME);
        K k6 = ((k0.x) this.f20341I.f19807b).f21728l;
        k6.f21495F = false;
        k6.f21496G = false;
        k6.M.f21542g = false;
        k6.t(7);
    }

    public final void y() {
        d4.h hVar = this.f20341I;
        hVar.e();
        k0.x xVar = (k0.x) hVar.f19807b;
        super.onStart();
        this.M = false;
        if (!this.f20343K) {
            this.f20343K = true;
            K k6 = xVar.f21728l;
            k6.f21495F = false;
            k6.f21496G = false;
            k6.M.f21542g = false;
            k6.t(4);
        }
        xVar.f21728l.x(true);
        this.f20342J.d(EnumC0291m.ON_START);
        K k7 = xVar.f21728l;
        k7.f21495F = false;
        k7.f21496G = false;
        k7.M.f21542g = false;
        k7.t(5);
    }

    public final void z() {
        super.onStop();
        this.M = true;
        while (u(s())) {
        }
        K k6 = ((k0.x) this.f20341I.f19807b).f21728l;
        k6.f21496G = true;
        k6.M.f21542g = true;
        k6.t(4);
        this.f20342J.d(EnumC0291m.ON_STOP);
    }

    @Override // c.AbstractActivityC0389n, android.app.Activity
    public void setContentView(View view) {
        t();
        q().m(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t();
        q().n(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((k0.x) this.f20341I.f19807b).f21728l.f21508f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}

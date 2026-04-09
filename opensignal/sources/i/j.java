package i;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import h7.r1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o4.p0;
import p.a2;
import p.w2;

/* loaded from: classes.dex */
public abstract class j extends c.l implements k, g3.a {
    public boolean P;
    public boolean Q;
    public a0 S;
    public final r1 N = new r1(29, new o4.x(this));
    public final androidx.lifecycle.x O = new androidx.lifecycle.x(this);
    public boolean R = true;

    public j() {
        ((io.sentry.t) this.f3031x.f11197d).H("android:support:lifecycle", new c.d(1, this));
        final int i10 = 0;
        g(new t3.a(this) { // from class: o4.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i.j f18876b;

            {
                this.f18876b = this;
            }

            @Override // t3.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f18876b.N.Z();
                        break;
                    default:
                        this.f18876b.N.Z();
                        break;
                }
            }
        });
        final int i11 = 1;
        this.I.add(new t3.a(this) { // from class: o4.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i.j f18876b;

            {
                this.f18876b = this;
            }

            @Override // t3.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.f18876b.N.Z();
                        break;
                    default:
                        this.f18876b.N.Z();
                        break;
                }
            }
        });
        i(new c.e(this, 1));
        ((io.sentry.t) this.f3031x.f11197d).H("androidx:appcompat", new h(this));
        i(new i(this));
    }

    public static boolean p(androidx.fragment.app.d dVar, androidx.lifecycle.n nVar) {
        boolean zP = false;
        for (androidx.fragment.app.b bVar : dVar.f1438c.a0()) {
            if (bVar != null) {
                o4.x xVar = bVar.R;
                if ((xVar == null ? null : xVar.B) != null) {
                    zP |= p(bVar.m(), nVar);
                }
                p0 p0Var = bVar.f1424o0;
                if (p0Var != null) {
                    p0Var.c();
                    if (p0Var.f18842r.f1528x.isAtLeast(androidx.lifecycle.n.STARTED)) {
                        bVar.f1424o0.f18842r.x1(nVar);
                        zP = true;
                    }
                }
                if (bVar.f1423n0.f1528x.isAtLeast(androidx.lifecycle.n.STARTED)) {
                    bVar.f1423n0.x1(nVar);
                    zP = true;
                }
            }
        }
        return zP;
    }

    @Override // c.l, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        k();
        a0 a0Var = (a0) m();
        a0Var.u();
        ((ViewGroup) a0Var.W.findViewById(R.id.content)).addView(view, layoutParams);
        a0Var.I.a(a0Var.H.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        a0 a0Var = (a0) m();
        a0Var.f10974k0 = true;
        int i10 = a0Var.f10978o0;
        if (i10 == -100) {
            i10 = o.f11100d;
        }
        int iB = a0Var.B(context, i10);
        int i11 = 3;
        if (o.b(context) && o.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (o.E) {
                    try {
                        p3.d dVar = o.f11101g;
                        if (dVar == null) {
                            if (o.f11102r == null) {
                                o.f11102r = p3.d.a(g3.e.e(context));
                            }
                            if (!o.f11102r.f20245a.f20246a.isEmpty()) {
                                o.f11101g = o.f11102r;
                            }
                        } else if (!dVar.equals(o.f11102r)) {
                            p3.d dVar2 = o.f11101g;
                            o.f11102r = dVar2;
                            g3.e.d(context, dVar2.f20245a.f20246a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!o.f11104y) {
                o.f11099a.execute(new ah.a(context, i11));
            }
        }
        p3.d dVarM = a0.m(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(a0.r(context, iB, dVarM, null, false));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof n.c) {
            try {
                ((n.c) context).a(a0.r(context, iB, dVarM, null, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (a0.F0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f10 = configuration3.fontScale;
                    float f11 = configuration4.fontScale;
                    if (f10 != f11) {
                        configuration.fontScale = f11;
                    }
                    int i12 = configuration3.mcc;
                    int i13 = configuration4.mcc;
                    if (i12 != i13) {
                        configuration.mcc = i13;
                    }
                    int i14 = configuration3.mnc;
                    int i15 = configuration4.mnc;
                    if (i14 != i15) {
                        configuration.mnc = i15;
                    }
                    int i16 = Build.VERSION.SDK_INT;
                    t.a(configuration3, configuration4, configuration);
                    int i17 = configuration3.touchscreen;
                    int i18 = configuration4.touchscreen;
                    if (i17 != i18) {
                        configuration.touchscreen = i18;
                    }
                    int i19 = configuration3.keyboard;
                    int i20 = configuration4.keyboard;
                    if (i19 != i20) {
                        configuration.keyboard = i20;
                    }
                    int i21 = configuration3.keyboardHidden;
                    int i22 = configuration4.keyboardHidden;
                    if (i21 != i22) {
                        configuration.keyboardHidden = i22;
                    }
                    int i23 = configuration3.navigation;
                    int i24 = configuration4.navigation;
                    if (i23 != i24) {
                        configuration.navigation = i24;
                    }
                    int i25 = configuration3.navigationHidden;
                    int i26 = configuration4.navigationHidden;
                    if (i25 != i26) {
                        configuration.navigationHidden = i26;
                    }
                    int i27 = configuration3.orientation;
                    int i28 = configuration4.orientation;
                    if (i27 != i28) {
                        configuration.orientation = i28;
                    }
                    int i29 = configuration3.screenLayout & 15;
                    int i30 = configuration4.screenLayout & 15;
                    if (i29 != i30) {
                        configuration.screenLayout |= i30;
                    }
                    int i31 = configuration3.screenLayout & 192;
                    int i32 = configuration4.screenLayout & 192;
                    if (i31 != i32) {
                        configuration.screenLayout |= i32;
                    }
                    int i33 = configuration3.screenLayout & 48;
                    int i34 = configuration4.screenLayout & 48;
                    if (i33 != i34) {
                        configuration.screenLayout |= i34;
                    }
                    int i35 = configuration3.screenLayout & 768;
                    int i36 = configuration4.screenLayout & 768;
                    if (i35 != i36) {
                        configuration.screenLayout |= i36;
                    }
                    if (i16 >= 26) {
                        if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                            configuration.colorMode = (3 & configuration4.colorMode) | configuration.colorMode;
                        }
                        if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                            configuration.colorMode |= configuration4.colorMode & 12;
                        }
                    }
                    int i37 = configuration3.uiMode & 15;
                    int i38 = configuration4.uiMode & 15;
                    if (i37 != i38) {
                        configuration.uiMode |= i38;
                    }
                    int i39 = configuration3.uiMode & 48;
                    int i40 = configuration4.uiMode & 48;
                    if (i39 != i40) {
                        configuration.uiMode |= i40;
                    }
                    int i41 = configuration3.screenWidthDp;
                    int i42 = configuration4.screenWidthDp;
                    if (i41 != i42) {
                        configuration.screenWidthDp = i42;
                    }
                    int i43 = configuration3.screenHeightDp;
                    int i44 = configuration4.screenHeightDp;
                    if (i43 != i44) {
                        configuration.screenHeightDp = i44;
                    }
                    int i45 = configuration3.smallestScreenWidthDp;
                    int i46 = configuration4.smallestScreenWidthDp;
                    if (i45 != i46) {
                        configuration.smallestScreenWidthDp = i46;
                    }
                    int i47 = configuration3.densityDpi;
                    int i48 = configuration4.densityDpi;
                    if (i47 != i48) {
                        configuration.densityDpi = i48;
                    }
                }
            }
            Configuration configurationR = a0.r(context, iB, dVarM, configuration, true);
            n.c cVar = new n.c(context, h.i.Theme_AppCompat_Empty);
            cVar.a(configurationR);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = cVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        j3.j.a(theme);
                    } else {
                        synchronized (j3.b.f13172e) {
                            if (!j3.b.f13174g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    j3.b.f13173f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException unused3) {
                                }
                                j3.b.f13174g = true;
                            }
                            Method method = j3.b.f13173f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException unused4) {
                                    j3.b.f13173f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused5) {
            }
            context = cVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        xu.l lVarN = n();
        if (getWindow().hasFeature(0)) {
            if (lVarN == null || !lVarN.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // g3.g, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int keyCode = keyEvent.getKeyCode();
        xu.l lVarN = n();
        if (keyCode == 82 && lVarN != null && lVarN.M(keyEvent)) {
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
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.j.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // android.app.Activity
    public final View findViewById(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a0 a0Var = (a0) m();
        a0Var.u();
        return a0Var.H.findViewById(i10);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a0 a0Var = (a0) m();
        if (a0Var.L == null) {
            a0Var.y();
            xu.l lVar = a0Var.K;
            a0Var.L = new n.h(lVar != null ? lVar.y() : a0Var.G);
        }
        return a0Var.L;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i10 = w2.f20213a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m().a();
    }

    public final o m() {
        if (this.S == null) {
            n nVar = o.f11099a;
            this.S = new a0(this, null, this, this);
        }
        return this.S;
    }

    public final xu.l n() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a0 a0Var = (a0) m();
        a0Var.y();
        return a0Var.K;
    }

    public final o4.j0 o() {
        return ((o4.x) this.N.f10199d).f18880y;
    }

    @Override // c.l, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        this.N.Z();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // c.l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onConfigurationChanged(configuration);
        a0 a0Var = (a0) m();
        if (a0Var.f10965b0 && a0Var.V) {
            a0Var.y();
            xu.l lVar = a0Var.K;
            if (lVar != null) {
                lVar.J();
            }
        }
        p.p pVarA = p.p.a();
        Context context = a0Var.G;
        synchronized (pVarA) {
            a2 a2Var = pVarA.f20132a;
            synchronized (a2Var) {
                u.o oVar = (u.o) a2Var.f20024b.get(context);
                if (oVar != null) {
                    oVar.a();
                }
            }
        }
        a0Var.f10977n0 = new Configuration(a0Var.G.getResources().getConfiguration());
        a0Var.k(false, false);
    }

    @Override // c.l, g3.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.O.v1(androidx.lifecycle.m.ON_CREATE);
        o4.j0 j0Var = ((o4.x) this.N.f10199d).f18880y;
        j0Var.H = false;
        j0Var.I = false;
        j0Var.O.f18820g = false;
        j0Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((o4.x) this.N.f10199d).f18880y.f1441f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        q();
        m().d();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override // c.l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (r(i10, menuItem)) {
            return true;
        }
        xu.l lVarN = n();
        if (menuItem.getItemId() != 16908332 || lVarN == null || (lVarN.s() & 4) == 0) {
            return false;
        }
        return v();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.Q = false;
        ((o4.x) this.N.f10199d).f18880y.u(5);
        this.O.v1(androidx.lifecycle.m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostCreate(bundle);
        ((a0) m()).u();
    }

    @Override // android.app.Activity
    public final void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        s();
        a0 a0Var = (a0) m();
        a0Var.y();
        xu.l lVar = a0Var.K;
        if (lVar != null) {
            lVar.U(true);
        }
    }

    @Override // c.l, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.N.Z();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        r1 r1Var = this.N;
        r1Var.Z();
        super.onResume();
        this.Q = true;
        ((o4.x) r1Var.f10199d).f18880y.A(true);
    }

    @Override // android.app.Activity
    public void onStart() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        t();
        ((a0) m()).k(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.N.Z();
    }

    @Override // android.app.Activity
    public void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        u();
        a0 a0Var = (a0) m();
        a0Var.y();
        xu.l lVar = a0Var.K;
        if (lVar != null) {
            lVar.U(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        m().j(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        xu.l lVarN = n();
        if (getWindow().hasFeature(0)) {
            if (lVarN == null || !lVarN.N()) {
                super.openOptionsMenu();
            }
        }
    }

    public final void q() {
        super.onDestroy();
        ((o4.x) this.N.f10199d).f18880y.l();
        this.O.v1(androidx.lifecycle.m.ON_DESTROY);
    }

    public final boolean r(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return ((o4.x) this.N.f10199d).f18880y.j();
        }
        return false;
    }

    public final void s() {
        super.onPostResume();
        this.O.v1(androidx.lifecycle.m.ON_RESUME);
        o4.j0 j0Var = ((o4.x) this.N.f10199d).f18880y;
        j0Var.H = false;
        j0Var.I = false;
        j0Var.O.f18820g = false;
        j0Var.u(7);
    }

    @Override // c.l, android.app.Activity
    public final void setContentView(int i10) {
        k();
        m().g(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        super.setTheme(i10);
        ((a0) m()).f10979p0 = i10;
    }

    public final void t() {
        r1 r1Var = this.N;
        r1Var.Z();
        o4.x xVar = (o4.x) r1Var.f10199d;
        super.onStart();
        this.R = false;
        if (!this.P) {
            this.P = true;
            o4.j0 j0Var = xVar.f18880y;
            j0Var.H = false;
            j0Var.I = false;
            j0Var.O.f18820g = false;
            j0Var.u(4);
        }
        xVar.f18880y.A(true);
        this.O.v1(androidx.lifecycle.m.ON_START);
        o4.j0 j0Var2 = xVar.f18880y;
        j0Var2.H = false;
        j0Var2.I = false;
        j0Var2.O.f18820g = false;
        j0Var2.u(5);
    }

    public final void u() {
        super.onStop();
        this.R = true;
        while (p(o(), androidx.lifecycle.n.CREATED)) {
        }
        o4.j0 j0Var = ((o4.x) this.N.f10199d).f18880y;
        j0Var.I = true;
        j0Var.O.f18820g = true;
        j0Var.u(4);
        this.O.v1(androidx.lifecycle.m.ON_STOP);
    }

    public boolean v() {
        Intent intentA = g3.e.a(this);
        if (intentA == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentA)) {
            navigateUpTo(intentA);
            return true;
        }
        ArrayList arrayList = new ArrayList();
        Intent intentA2 = g3.e.a(this);
        if (intentA2 == null) {
            intentA2 = g3.e.a(this);
        }
        if (intentA2 != null) {
            ComponentName component = intentA2.getComponent();
            if (component == null) {
                component = intentA2.resolveActivity(getPackageManager());
            }
            int size = arrayList.size();
            try {
                Intent intentB = g3.e.b(this, component);
                while (intentB != null) {
                    arrayList.add(size, intentB);
                    intentB = g3.e.b(this, intentB.getComponent());
                }
                arrayList.add(intentA2);
            } catch (PackageManager.NameNotFoundException e4) {
                io.sentry.android.core.e0.d("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e4);
            }
        }
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public final void w(Toolbar toolbar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a0 a0Var = (a0) m();
        if (a0Var.F instanceof Activity) {
            a0Var.y();
            xu.l lVar = a0Var.K;
            if (lVar instanceof m0) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            a0Var.L = null;
            if (lVar != null) {
                lVar.K();
            }
            a0Var.K = null;
            if (toolbar != null) {
                Object obj = a0Var.F;
                h0 h0Var = new h0(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : a0Var.M, a0Var.I);
                a0Var.K = h0Var;
                a0Var.I.f11111d = h0Var.f11056e;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                a0Var.I.f11111d = null;
            }
            a0Var.a();
        }
    }

    @Override // c.l, android.app.Activity
    public void setContentView(View view) {
        k();
        m().h(view);
    }

    @Override // c.l, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        m().i(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((o4.x) this.N.f10199d).f18880y.f1441f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}

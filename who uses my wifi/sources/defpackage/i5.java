package defpackage;

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
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class i5 extends ch implements l5 {
    public h6 B;
    public boolean y;
    public boolean z;
    public final of3 w = new of3(3, new kw(this));
    public final d60 x = new d60(this);
    public boolean A = true;

    public i5() {
        ((vq2) this.i.h).q("android:support:lifecycle", new wg(this, 1));
        final int i = 0;
        g(new ui(this) { // from class: jw
            public final /* synthetic */ i5 b;

            {
                this.b = this;
            }

            @Override // defpackage.ui
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.b.w.e();
                        break;
                    default:
                        this.b.w.e();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.p.add(new ui(this) { // from class: jw
            public final /* synthetic */ i5 b;

            {
                this.b = this;
            }

            @Override // defpackage.ui
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        this.b.w.e();
                        break;
                    default:
                        this.b.w.e();
                        break;
                }
            }
        });
        h(new xg(this, 1));
        ((vq2) this.i.h).q("androidx:appcompat", new g5(this));
        h(new h5(this));
    }

    public static boolean p(xw xwVar) {
        boolean zP = false;
        for (iw iwVar : xwVar.c.n()) {
            if (iwVar != null) {
                kw kwVar = iwVar.x;
                if ((kwVar == null ? null : kwVar.A) != null) {
                    zP |= p(iwVar.h());
                }
                jx jxVar = iwVar.T;
                u50 u50Var = u50.i;
                if (jxVar != null && jxVar.e().c.compareTo(u50Var) >= 0) {
                    iwVar.T.h.g();
                    zP = true;
                }
                if (iwVar.S.c.compareTo(u50Var) >= 0) {
                    iwVar.S.g();
                    zP = true;
                }
            }
        }
        return zP;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        j();
        h6 h6Var = (h6) m();
        h6Var.w();
        ((ViewGroup) h6Var.F.findViewById(R.id.content)).addView(view, layoutParams);
        h6Var.r.a(h6Var.q.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        h6 h6Var = (h6) m();
        h6Var.T = true;
        int i = h6Var.X;
        if (i == -100) {
            i = u5.g;
        }
        int iC = h6Var.C(context, i);
        if (u5.b(context) && u5.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (u5.n) {
                    try {
                        y70 y70Var = u5.h;
                        if (y70Var == null) {
                            if (u5.i == null) {
                                u5.i = y70.a(um.v(context));
                            }
                            if (!u5.i.a.a.isEmpty()) {
                                u5.h = u5.i;
                            }
                        } else if (!y70Var.equals(u5.i)) {
                            y70 y70Var2 = u5.h;
                            u5.i = y70Var2;
                            um.t(context, y70Var2.a.a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!u5.k) {
                u5.f.execute(new o5(context, 0));
            }
        }
        y70 y70VarP = h6.p(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(h6.t(context, iC, y70VarP, null, false));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof nj) {
            try {
                ((nj) context).a(h6.t(context, iC, y70VarP, null, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (h6.o0) {
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
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    y5.a(configuration3, configuration4, configuration);
                    int i6 = configuration3.touchscreen;
                    int i7 = configuration4.touchscreen;
                    if (i6 != i7) {
                        configuration.touchscreen = i7;
                    }
                    int i8 = configuration3.keyboard;
                    int i9 = configuration4.keyboard;
                    if (i8 != i9) {
                        configuration.keyboard = i9;
                    }
                    int i10 = configuration3.keyboardHidden;
                    int i11 = configuration4.keyboardHidden;
                    if (i10 != i11) {
                        configuration.keyboardHidden = i11;
                    }
                    int i12 = configuration3.navigation;
                    int i13 = configuration4.navigation;
                    if (i12 != i13) {
                        configuration.navigation = i13;
                    }
                    int i14 = configuration3.navigationHidden;
                    int i15 = configuration4.navigationHidden;
                    if (i14 != i15) {
                        configuration.navigationHidden = i15;
                    }
                    int i16 = configuration3.orientation;
                    int i17 = configuration4.orientation;
                    if (i16 != i17) {
                        configuration.orientation = i17;
                    }
                    int i18 = configuration3.screenLayout & 15;
                    int i19 = configuration4.screenLayout & 15;
                    if (i18 != i19) {
                        configuration.screenLayout |= i19;
                    }
                    int i20 = configuration3.screenLayout & 192;
                    int i21 = configuration4.screenLayout & 192;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 48;
                    int i23 = configuration4.screenLayout & 48;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 768;
                    int i25 = configuration4.screenLayout & 768;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.colorMode & 3;
                    int i27 = configuration4.colorMode & 3;
                    if (i26 != i27) {
                        configuration.colorMode |= i27;
                    }
                    int i28 = configuration3.colorMode & 12;
                    int i29 = configuration4.colorMode & 12;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.uiMode & 15;
                    int i31 = configuration4.uiMode & 15;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.uiMode & 48;
                    int i33 = configuration4.uiMode & 48;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configuration3.screenWidthDp;
                    int i35 = configuration4.screenWidthDp;
                    if (i34 != i35) {
                        configuration.screenWidthDp = i35;
                    }
                    int i36 = configuration3.screenHeightDp;
                    int i37 = configuration4.screenHeightDp;
                    if (i36 != i37) {
                        configuration.screenHeightDp = i37;
                    }
                    int i38 = configuration3.smallestScreenWidthDp;
                    int i39 = configuration4.smallestScreenWidthDp;
                    if (i38 != i39) {
                        configuration.smallestScreenWidthDp = i39;
                    }
                    int i40 = configuration3.densityDpi;
                    int i41 = configuration4.densityDpi;
                    if (i40 != i41) {
                        configuration.densityDpi = i41;
                    }
                }
            }
            Configuration configurationT = h6.t(context, iC, y70VarP, configuration, true);
            nj njVar = new nj(context, com.phuongpn.whousemywifi.networkscanner.R.style.Theme_AppCompat_Empty);
            njVar.a(configurationT);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = njVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        eq0.a(theme);
                    } else {
                        synchronized (ou1.i) {
                            if (!ou1.k) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    ou1.j = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException unused3) {
                                }
                                ou1.k = true;
                            }
                            Method method = ou1.j;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException unused4) {
                                    ou1.j = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused5) {
            }
            context = njVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m54 m54VarN = n();
        if (getWindow().hasFeature(0)) {
            if (m54VarN == null || !m54VarN.b()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.ch, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int keyCode = keyEvent.getKeyCode();
        m54 m54VarN = n();
        if (keyCode == 82 && m54VarN != null && m54VarN.v(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dump(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i5.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // android.app.Activity
    public final View findViewById(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        h6 h6Var = (h6) m();
        h6Var.w();
        return h6Var.q.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        h6 h6Var = (h6) m();
        if (h6Var.u == null) {
            h6Var.A();
            m54 m54Var = h6Var.t;
            h6Var.u = new hz0(m54Var != null ? m54Var.p() : h6Var.p);
        }
        return h6Var.u;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = z41.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m().a();
    }

    public final u5 m() {
        if (this.B == null) {
            s5 s5Var = u5.f;
            this.B = new h6(this, null, this, this);
        }
        return this.B;
    }

    public final m54 n() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        h6 h6Var = (h6) m();
        h6Var.A();
        return h6Var.t;
    }

    public final xw o() {
        return ((kw) this.w.g).z;
    }

    @Override // defpackage.ch, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.w.e();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.ch, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onConfigurationChanged(configuration);
        h6 h6Var = (h6) m();
        if (h6Var.K && h6Var.E) {
            h6Var.A();
            m54 m54Var = h6Var.t;
            if (m54Var != null) {
                m54Var.s();
            }
        }
        l6 l6VarA = l6.a();
        Context context = h6Var.p;
        synchronized (l6VarA) {
            zp0 zp0Var = l6VarA.a;
            synchronized (zp0Var) {
                l80 l80Var = (l80) zp0Var.b.get(context);
                if (l80Var != null) {
                    l80Var.a();
                }
            }
        }
        h6Var.W = new Configuration(h6Var.p.getResources().getConfiguration());
        h6Var.m(false, false);
    }

    @Override // defpackage.ch, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.x.d(t50.ON_CREATE);
        xw xwVar = ((kw) this.w.g).z;
        xwVar.E = false;
        xwVar.F = false;
        xwVar.L.g = false;
        xwVar.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((kw) this.w.g).z.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        q();
        m().d();
    }

    @Override // defpackage.ch, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (r(i, menuItem)) {
            return true;
        }
        m54 m54VarN = n();
        if (menuItem.getItemId() != 16908332 || m54VarN == null || (m54VarN.g() & 4) == 0) {
            return false;
        }
        return v();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.z = false;
        ((kw) this.w.g).z.t(5);
        this.x.d(t50.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostCreate(bundle);
        ((h6) m()).w();
    }

    @Override // android.app.Activity
    public final void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        s();
        h6 h6Var = (h6) m();
        h6Var.A();
        m54 m54Var = h6Var.t;
        if (m54Var != null) {
            m54Var.z(true);
        }
    }

    @Override // defpackage.ch, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.w.e();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        of3 of3Var = this.w;
        of3Var.e();
        super.onResume();
        this.z = true;
        ((kw) of3Var.g).z.y(true);
    }

    @Override // android.app.Activity
    public final void onStart() throws PackageManager.NameNotFoundException {
        t();
        ((h6) m()).m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.w.e();
    }

    @Override // android.app.Activity
    public void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        u();
        h6 h6Var = (h6) m();
        h6Var.A();
        m54 m54Var = h6Var.t;
        if (m54Var != null) {
            m54Var.z(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m54 m54VarN = n();
        if (getWindow().hasFeature(0)) {
            if (m54VarN == null || !m54VarN.w()) {
                super.openOptionsMenu();
            }
        }
    }

    public final void q() {
        super.onDestroy();
        ((kw) this.w.g).z.k();
        this.x.d(t50.ON_DESTROY);
    }

    public final boolean r(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((kw) this.w.g).z.i();
        }
        return false;
    }

    public final void s() {
        super.onPostResume();
        this.x.d(t50.ON_RESUME);
        xw xwVar = ((kw) this.w.g).z;
        xwVar.E = false;
        xwVar.F = false;
        xwVar.L.g = false;
        xwVar.t(7);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        j();
        m().h(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((h6) m()).Y = i;
    }

    public final void t() {
        of3 of3Var = this.w;
        of3Var.e();
        kw kwVar = (kw) of3Var.g;
        super.onStart();
        this.A = false;
        if (!this.y) {
            this.y = true;
            xw xwVar = kwVar.z;
            xwVar.E = false;
            xwVar.F = false;
            xwVar.L.g = false;
            xwVar.t(4);
        }
        kwVar.z.y(true);
        this.x.d(t50.ON_START);
        xw xwVar2 = kwVar.z;
        xwVar2.E = false;
        xwVar2.F = false;
        xwVar2.L.g = false;
        xwVar2.t(5);
    }

    public final void u() {
        super.onStop();
        this.A = true;
        while (p(o())) {
        }
        xw xwVar = ((kw) this.w.g).z;
        xwVar.F = true;
        xwVar.L.g = true;
        xwVar.t(4);
        this.x.d(t50.ON_STOP);
    }

    public boolean v() {
        Intent intentK = m54.k(this);
        if (intentK == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentK)) {
            navigateUpTo(intentK);
            return true;
        }
        ArrayList arrayList = new ArrayList();
        Intent intentK2 = m54.k(this);
        if (intentK2 == null) {
            intentK2 = m54.k(this);
        }
        if (intentK2 != null) {
            ComponentName component = intentK2.getComponent();
            if (component == null) {
                component = intentK2.resolveActivity(getPackageManager());
            }
            int size = arrayList.size();
            try {
                Intent intentL = m54.l(this, component);
                while (intentL != null) {
                    arrayList.add(size, intentL);
                    intentL = m54.l(this, intentL.getComponent());
                }
                arrayList.add(intentK2);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
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
        h6 h6Var = (h6) m();
        if (h6Var.o instanceof Activity) {
            h6Var.A();
            m54 m54Var = h6Var.t;
            if (m54Var instanceof t81) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            h6Var.u = null;
            if (m54Var != null) {
                m54Var.t();
            }
            h6Var.t = null;
            Object obj = h6Var.o;
            f21 f21Var = new f21(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : h6Var.v, h6Var.r);
            h6Var.t = f21Var;
            h6Var.r.g = f21Var.i;
            toolbar.setBackInvokedCallbackEnabled(true);
            h6Var.a();
        }
    }

    @Override // defpackage.ch, android.app.Activity
    public void setContentView(View view) {
        j();
        m().i(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        m().j(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((kw) this.w.g).z.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}

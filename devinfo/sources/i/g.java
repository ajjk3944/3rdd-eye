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
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import b5.d1;
import b5.u0;
import j$.util.Objects;
import java.util.ArrayList;
import p.s3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class g extends d.j implements h, r3.a {

    /* renamed from: w, reason: collision with root package name */
    public boolean f25293w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f25294x;

    /* renamed from: z, reason: collision with root package name */
    public v f25296z;

    /* renamed from: u, reason: collision with root package name */
    public final jf.c f25291u = new jf.c(3, new b5.d0(this));

    /* renamed from: v, reason: collision with root package name */
    public final androidx.lifecycle.c0 f25292v = new androidx.lifecycle.c0(this, true);

    /* renamed from: y, reason: collision with root package name */
    public boolean f25295y = true;

    public g() {
        ((yb.i) this.f21606d.f37324b).P("android:support:lifecycle", new b5.a0(0, this));
        final int i4 = 0;
        m(new d4.a(this) { // from class: b5.b0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i.g f1744b;

            {
                this.f1744b = this;
            }

            @Override // d4.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        this.f1744b.f25291u.n();
                        break;
                    default:
                        this.f1744b.f25291u.n();
                        break;
                }
            }
        });
        final int i10 = 1;
        this.f21612l.add(new d4.a(this) { // from class: b5.b0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i.g f1744b;

            {
                this.f1744b = this;
            }

            @Override // d4.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f1744b.f25291u.n();
                        break;
                    default:
                        this.f1744b.f25291u.n();
                        break;
                }
            }
        });
        n(new b5.c0(this, 0));
        ((yb.i) this.f21606d.f37324b).P("androidx:appcompat", new a6.a(this));
        n(new f(this));
    }

    public static boolean t(u0 u0Var) {
        boolean zT = false;
        for (b5.z zVar : u0Var.f1879c.B()) {
            if (zVar != null) {
                b5.d0 d0Var = zVar.f1948v;
                if ((d0Var == null ? null : d0Var.f1769e) != null) {
                    zT |= t(zVar.o());
                }
                d1 d1Var = zVar.R;
                androidx.lifecycle.s sVar = androidx.lifecycle.s.f1183d;
                if (d1Var != null) {
                    d1Var.d();
                    if (d1Var.f1774e.f1110d.compareTo(sVar) >= 0) {
                        zVar.R.f1774e.g();
                        zT = true;
                    }
                }
                if (zVar.Q.f1110d.compareTo(sVar) >= 0) {
                    zVar.Q.g();
                    zT = true;
                }
            }
        }
        return zT;
    }

    @Override // d.j, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        v vVar = (v) q();
        vVar.x();
        ((ViewGroup) vVar.A.findViewById(R.id.content)).addView(view, layoutParams);
        vVar.f25376m.a(vVar.f25375l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        v vVar = (v) q();
        vVar.O = true;
        int i4 = vVar.S;
        if (i4 == -100) {
            i4 = l.f25329b;
        }
        int iE = vVar.E(i4, context);
        if (l.c(context) && l.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (l.f25335i) {
                    try {
                        a4.h hVar = l.f25330c;
                        if (hVar == null) {
                            if (l.f25331d == null) {
                                l.f25331d = a4.h.b(r3.e.e(context));
                            }
                            if (!l.f25331d.f193a.isEmpty()) {
                                l.f25330c = l.f25331d;
                            }
                        } else if (!hVar.equals(l.f25331d)) {
                            a4.h hVar2 = l.f25330c;
                            l.f25331d = hVar2;
                            r3.e.d(context, hVar2.f193a.a());
                        }
                    } finally {
                    }
                }
            } else if (!l.f25333f) {
                l.f25328a.execute(new i(context, 0));
            }
        }
        a4.h hVarP = v.p(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(v.u(context, iE, hVarP, null, false));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof n.c) {
            try {
                ((n.c) context).a(v.u(context, iE, hVarP, null, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (v.f25366j0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f10 = configuration3.fontScale;
                    float f11 = configuration4.fontScale;
                    if (f10 != f11) {
                        configuration.fontScale = f11;
                    }
                    int i10 = configuration3.mcc;
                    int i11 = configuration4.mcc;
                    if (i10 != i11) {
                        configuration.mcc = i11;
                    }
                    int i12 = configuration3.mnc;
                    int i13 = configuration4.mnc;
                    if (i12 != i13) {
                        configuration.mnc = i13;
                    }
                    int i14 = Build.VERSION.SDK_INT;
                    if (i14 >= 24) {
                        p.a(configuration3, configuration4, configuration);
                    } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i15 = configuration3.touchscreen;
                    int i16 = configuration4.touchscreen;
                    if (i15 != i16) {
                        configuration.touchscreen = i16;
                    }
                    int i17 = configuration3.keyboard;
                    int i18 = configuration4.keyboard;
                    if (i17 != i18) {
                        configuration.keyboard = i18;
                    }
                    int i19 = configuration3.keyboardHidden;
                    int i20 = configuration4.keyboardHidden;
                    if (i19 != i20) {
                        configuration.keyboardHidden = i20;
                    }
                    int i21 = configuration3.navigation;
                    int i22 = configuration4.navigation;
                    if (i21 != i22) {
                        configuration.navigation = i22;
                    }
                    int i23 = configuration3.navigationHidden;
                    int i24 = configuration4.navigationHidden;
                    if (i23 != i24) {
                        configuration.navigationHidden = i24;
                    }
                    int i25 = configuration3.orientation;
                    int i26 = configuration4.orientation;
                    if (i25 != i26) {
                        configuration.orientation = i26;
                    }
                    int i27 = configuration3.screenLayout & 15;
                    int i28 = configuration4.screenLayout & 15;
                    if (i27 != i28) {
                        configuration.screenLayout |= i28;
                    }
                    int i29 = configuration3.screenLayout & 192;
                    int i30 = configuration4.screenLayout & 192;
                    if (i29 != i30) {
                        configuration.screenLayout |= i30;
                    }
                    int i31 = configuration3.screenLayout & 48;
                    int i32 = configuration4.screenLayout & 48;
                    if (i31 != i32) {
                        configuration.screenLayout |= i32;
                    }
                    int i33 = configuration3.screenLayout & 768;
                    int i34 = configuration4.screenLayout & 768;
                    if (i33 != i34) {
                        configuration.screenLayout |= i34;
                    }
                    if (i14 >= 26) {
                        ub.a.c(configuration3, configuration4, configuration);
                    }
                    int i35 = configuration3.uiMode & 15;
                    int i36 = configuration4.uiMode & 15;
                    if (i35 != i36) {
                        configuration.uiMode |= i36;
                    }
                    int i37 = configuration3.uiMode & 48;
                    int i38 = configuration4.uiMode & 48;
                    if (i37 != i38) {
                        configuration.uiMode |= i38;
                    }
                    int i39 = configuration3.screenWidthDp;
                    int i40 = configuration4.screenWidthDp;
                    if (i39 != i40) {
                        configuration.screenWidthDp = i40;
                    }
                    int i41 = configuration3.screenHeightDp;
                    int i42 = configuration4.screenHeightDp;
                    if (i41 != i42) {
                        configuration.screenHeightDp = i42;
                    }
                    int i43 = configuration3.smallestScreenWidthDp;
                    int i44 = configuration4.smallestScreenWidthDp;
                    if (i43 != i44) {
                        configuration.smallestScreenWidthDp = i44;
                    }
                    int i45 = configuration3.densityDpi;
                    int i46 = configuration4.densityDpi;
                    if (i45 != i46) {
                        configuration.densityDpi = i46;
                    }
                }
            }
            Configuration configurationU = v.u(context, iE, hVarP, configuration, true);
            n.c cVar = new n.c(context, com.liuzh.deviceinfo.R.style.Theme_AppCompat_Empty);
            cVar.a(configurationU);
            try {
                if (context.getTheme() != null) {
                    u3.b.m(cVar.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = cVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        wd.b bVarR = r();
        if (getWindow().hasFeature(0)) {
            if (bVarR == null || !bVarR.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // r3.g, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        wd.b bVarR = r();
        if (keyCode == 82 && bVarR != null && bVarR.G(keyEvent)) {
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
    public final void dump(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
        /*
            r2 = this;
            super.dump(r3, r4, r5, r6)
            if (r6 == 0) goto L5d
            int r0 = r6.length
            if (r0 != 0) goto L9
            goto L5d
        L9:
            r0 = 0
            r0 = r6[r0]
            int r1 = r0.hashCode()
            switch(r1) {
                case -645125871: goto L4d;
                case 100470631: goto L3d;
                case 472614934: goto L34;
                case 1159329357: goto L24;
                case 1455016274: goto L14;
                default: goto L13;
            }
        L13:
            goto L5d
        L14:
            java.lang.String r1 = "--autofill"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1d
            goto L5d
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L5d
            goto L5c
        L24:
            java.lang.String r1 = "--contentcapture"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d
            goto L5d
        L2d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L5d
            goto L5c
        L34:
            java.lang.String r1 = "--list-dumpables"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L5d
        L3d:
            java.lang.String r1 = "--dump-dumpable"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L5d
        L46:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L5d
            goto L5c
        L4d:
            java.lang.String r1 = "--translation"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L56
            goto L5d
        L56:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L5d
        L5c:
            return
        L5d:
            r5.print(r3)
            java.lang.String r0 = "Local FragmentActivity "
            r5.print(r0)
            int r0 = java.lang.System.identityHashCode(r2)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " State:"
            r5.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.print(r0)
            java.lang.String r1 = "mCreated="
            r5.print(r1)
            boolean r1 = r2.f25293w
            r5.print(r1)
            java.lang.String r1 = " mResumed="
            r5.print(r1)
            boolean r1 = r2.f25294x
            r5.print(r1)
            java.lang.String r1 = " mStopped="
            r5.print(r1)
            boolean r1 = r2.f25295y
            r5.print(r1)
            android.app.Application r1 = r2.getApplication()
            if (r1 == 0) goto Lb4
            yb.i r1 = yb.i.E(r2)
            r1.B(r0, r5)
        Lb4:
            jf.c r0 = r2.f25291u
            java.lang.Object r0 = r0.f27642b
            b5.d0 r0 = (b5.d0) r0
            b5.u0 r0 = r0.f1768d
            r0.v(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.g.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // android.app.Activity
    public final View findViewById(int i4) {
        v vVar = (v) q();
        vVar.x();
        return vVar.f25375l.findViewById(i4);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        v vVar = (v) q();
        if (vVar.f25379p == null) {
            vVar.C();
            wd.b bVar = vVar.f25378o;
            vVar.f25379p = new n.h(bVar != null ? bVar.v() : vVar.f25374k);
        }
        return vVar.f25379p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i4 = s3.f30862a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        q().b();
    }

    @Override // d.j, android.app.Activity
    public void onActivityResult(int i4, int i10, Intent intent) {
        this.f25291u.n();
        super.onActivityResult(i4, i10, intent);
    }

    @Override // d.j, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v vVar = (v) q();
        if (vVar.F && vVar.f25389z) {
            vVar.C();
            wd.b bVar = vVar.f25378o;
            if (bVar != null) {
                bVar.D();
            }
        }
        p.s sVarA = p.s.a();
        Context context = vVar.f25374k;
        synchronized (sVarA) {
            sVarA.f30852a.l(context);
        }
        vVar.R = new Configuration(vVar.f25374k.getResources().getConfiguration());
        vVar.n(false, false);
    }

    @Override // d.j, r3.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f25292v.e(androidx.lifecycle.r.ON_CREATE);
        u0 u0Var = ((b5.d0) this.f25291u.f27642b).f1768d;
        u0Var.I = false;
        u0Var.J = false;
        u0Var.P.g = false;
        u0Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((b5.d0) this.f25291u.f27642b).f1768d.f1882f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        u();
        q().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i4, keyEvent);
        }
        return true;
    }

    @Override // d.j, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        Intent intentA;
        if (!v(i4, menuItem)) {
            wd.b bVarR = r();
            if (menuItem.getItemId() != 16908332 || bVarR == null || (bVarR.s() & 4) == 0 || (intentA = r3.e.a(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentA)) {
                navigateUpTo(intentA);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentA2 = r3.e.a(this);
            if (intentA2 == null) {
                intentA2 = r3.e.a(this);
            }
            if (intentA2 != null) {
                ComponentName component = intentA2.getComponent();
                if (component == null) {
                    component = intentA2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentB = r3.e.b(this, component);
                    while (intentB != null) {
                        arrayList.add(size, intentB);
                        intentB = r3.e.b(this, intentB.getComponent());
                    }
                    arrayList.add(intentA2);
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e2);
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
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f25294x = false;
        ((b5.d0) this.f25291u.f27642b).f1768d.u(5);
        this.f25292v.e(androidx.lifecycle.r.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((v) q()).x();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        w();
        v vVar = (v) q();
        vVar.C();
        wd.b bVar = vVar.f25378o;
        if (bVar != null) {
            bVar.R(true);
        }
    }

    @Override // d.j, android.app.Activity
    public final void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        this.f25291u.n();
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        jf.c cVar = this.f25291u;
        cVar.n();
        super.onResume();
        this.f25294x = true;
        ((b5.d0) cVar.f27642b).f1768d.z(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        x();
        ((v) q()).n(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f25291u.n();
    }

    @Override // android.app.Activity
    public final void onStop() {
        y();
        v vVar = (v) q();
        vVar.C();
        wd.b bVar = vVar.f25378o;
        if (bVar != null) {
            bVar.R(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i4) {
        super.onTitleChanged(charSequence, i4);
        q().m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        wd.b bVarR = r();
        if (getWindow().hasFeature(0)) {
            if (bVarR == null || !bVarR.H()) {
                super.openOptionsMenu();
            }
        }
    }

    public final l q() {
        if (this.f25296z == null) {
            c7.l lVar = l.f25328a;
            this.f25296z = new v(this, null, this, this);
        }
        return this.f25296z;
    }

    public final wd.b r() {
        v vVar = (v) q();
        vVar.C();
        return vVar.f25378o;
    }

    public final u0 s() {
        return ((b5.d0) this.f25291u.f27642b).f1768d;
    }

    @Override // d.j, android.app.Activity
    public final void setContentView(int i4) {
        p();
        q().i(i4);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i4) {
        super.setTheme(i4);
        ((v) q()).T = i4;
    }

    public final void u() {
        super.onDestroy();
        ((b5.d0) this.f25291u.f27642b).f1768d.l();
        this.f25292v.e(androidx.lifecycle.r.ON_DESTROY);
    }

    public final boolean v(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 == 6) {
            return ((b5.d0) this.f25291u.f27642b).f1768d.j();
        }
        return false;
    }

    public final void w() {
        super.onPostResume();
        this.f25292v.e(androidx.lifecycle.r.ON_RESUME);
        u0 u0Var = ((b5.d0) this.f25291u.f27642b).f1768d;
        u0Var.I = false;
        u0Var.J = false;
        u0Var.P.g = false;
        u0Var.u(7);
    }

    public final void x() {
        jf.c cVar = this.f25291u;
        cVar.n();
        b5.d0 d0Var = (b5.d0) cVar.f27642b;
        super.onStart();
        this.f25295y = false;
        if (!this.f25293w) {
            this.f25293w = true;
            u0 u0Var = d0Var.f1768d;
            u0Var.I = false;
            u0Var.J = false;
            u0Var.P.g = false;
            u0Var.u(4);
        }
        d0Var.f1768d.z(true);
        this.f25292v.e(androidx.lifecycle.r.ON_START);
        u0 u0Var2 = d0Var.f1768d;
        u0Var2.I = false;
        u0Var2.J = false;
        u0Var2.P.g = false;
        u0Var2.u(5);
    }

    public final void y() {
        super.onStop();
        this.f25295y = true;
        while (t(s())) {
        }
        u0 u0Var = ((b5.d0) this.f25291u.f27642b).f1768d;
        u0Var.J = true;
        u0Var.P.g = true;
        u0Var.u(4);
        this.f25292v.e(androidx.lifecycle.r.ON_STOP);
    }

    public final void z(Toolbar toolbar) {
        v vVar = (v) q();
        if (vVar.j instanceof Activity) {
            vVar.C();
            wd.b bVar = vVar.f25378o;
            if (bVar instanceof i0) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            vVar.f25379p = null;
            if (bVar != null) {
                bVar.E();
            }
            vVar.f25378o = null;
            if (toolbar != null) {
                Object obj = vVar.j;
                d0 d0Var = new d0(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : vVar.f25380q, vVar.f25376m);
                vVar.f25378o = d0Var;
                vVar.f25376m.f25341b = d0Var.f25278d;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                vVar.f25376m.f25341b = null;
            }
            vVar.b();
        }
    }

    @Override // d.j, android.app.Activity
    public void setContentView(View view) {
        p();
        q().j(view);
    }

    @Override // d.j, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        q().k(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((b5.d0) this.f25291u.f27642b).f1768d.f1882f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}

package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h6 extends u5 implements md0, LayoutInflater.Factory2 {
    public static final bw0 m0 = new bw0(0);
    public static final int[] n0 = {R.attr.windowBackground};
    public static final boolean o0 = !"robolectric".equals(Build.FINGERPRINT);
    public ActionBarContextView A;
    public PopupWindow B;
    public v5 C;
    public boolean E;
    public ViewGroup F;
    public TextView G;
    public View H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public g6[] Q;
    public g6 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public Configuration W;
    public final int X;
    public int Y;
    public int Z;
    public boolean a0;
    public c6 b0;
    public c6 c0;
    public boolean d0;
    public int e0;
    public boolean g0;
    public Rect h0;
    public Rect i0;
    public a8 j0;
    public OnBackInvokedDispatcher k0;
    public OnBackInvokedCallback l0;
    public final Object o;
    public final Context p;
    public Window q;
    public b6 r;
    public final Object s;
    public m54 t;
    public hz0 u;
    public CharSequence v;
    public vm w;
    public vg0 x;
    public z71 y;
    public c2 z;
    public w61 D = null;
    public final v5 f0 = new v5(this, 0);

    public h6(Context context, Window window, l5 l5Var, Object obj) {
        i5 i5Var = null;
        this.X = -100;
        this.p = context;
        this.s = l5Var;
        this.o = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof i5)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        i5Var = (i5) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (i5Var != null) {
                this.X = ((h6) i5Var.m()).X;
            }
        }
        if (this.X == -100) {
            String name = this.o.getClass().getName();
            bw0 bw0Var = m0;
            Integer num = (Integer) bw0Var.get(name);
            if (num != null) {
                this.X = num.intValue();
                bw0Var.remove(this.o.getClass().getName());
            }
        }
        if (window != null) {
            o(window);
        }
        l6.d();
    }

    public static y70 p(Context context) {
        y70 y70Var;
        y70 y70Var2;
        if (Build.VERSION.SDK_INT >= 33 || (y70Var = u5.h) == null) {
            return null;
        }
        z70 z70Var = y70Var.a;
        y70 y70VarB = y5.b(context.getApplicationContext().getResources().getConfiguration());
        if (z70Var.a.isEmpty()) {
            y70Var2 = y70.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < y70VarB.a.a.size() + z70Var.a.size()) {
                Locale locale = i < z70Var.a.size() ? z70Var.a.get(i) : y70VarB.a.a.get(i - z70Var.a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            y70Var2 = new y70(new z70(x70.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return y70Var2.a.a.isEmpty() ? y70VarB : y70Var2;
    }

    public static Configuration t(Context context, int i, y70 y70Var, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (y70Var != null) {
            y5.d(configuration2, y70Var);
        }
        return configuration2;
    }

    public final void A() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w();
        if (this.K && this.t == null) {
            Object obj = this.o;
            if (obj instanceof Activity) {
                this.t = new t81((Activity) obj, this.L);
            } else if (obj instanceof Dialog) {
                this.t = new t81((Dialog) obj);
            }
            m54 m54Var = this.t;
            if (m54Var != null) {
                m54Var.x(this.g0);
            }
        }
    }

    public final void B(int i) {
        this.e0 = (1 << i) | this.e0;
        if (this.d0) {
            return;
        }
        View decorView = this.q.getDecorView();
        WeakHashMap weakHashMap = e61.a;
        decorView.postOnAnimation(this.f0);
        this.d0 = true;
    }

    public final int C(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.c0 == null) {
                            this.c0 = new c6(this, context);
                        }
                        return this.c0.g();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return y(context).g();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean D() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z = this.S;
        this.S = false;
        g6 g6VarZ = z(0);
        if (!g6VarZ.m) {
            c2 c2Var = this.z;
            if (c2Var != null) {
                c2Var.a();
                return true;
            }
            A();
            m54 m54Var = this.t;
            if (m54Var == null || !m54Var.c()) {
                return false;
            }
        } else if (!z) {
            s(g6VarZ, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        if (r2.k.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(defpackage.g6 r18, android.view.KeyEvent r19) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6.E(g6, android.view.KeyEvent):void");
    }

    public final boolean F(g6 g6Var, int i, KeyEvent keyEvent) {
        od0 od0Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((g6Var.k || G(g6Var, keyEvent)) && (od0Var = g6Var.h) != null) {
            return od0Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean G(defpackage.g6 r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6.G(g6, android.view.KeyEvent):boolean");
    }

    public final void H() {
        if (this.E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.k0 != null && (z(0).m || this.z != null)) {
                z = true;
            }
            if (z && this.l0 == null) {
                this.l0 = a6.b(this.k0, this);
            } else {
                if (z || (onBackInvokedCallback = this.l0) == null) {
                    return;
                }
                a6.c(this.k0, onBackInvokedCallback);
                this.l0 = null;
            }
        }
    }

    @Override // defpackage.u5
    public final void a() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.t != null) {
            A();
            if (this.t.q()) {
                return;
            }
            B(0);
        }
    }

    @Override // defpackage.u5
    public final void c() throws PackageManager.NameNotFoundException {
        String strM;
        this.T = true;
        m(false, true);
        x();
        Object obj = this.o;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM = m54.m(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM = null;
            }
            if (strM != null) {
                m54 m54Var = this.t;
                if (m54Var == null) {
                    this.g0 = true;
                } else {
                    m54Var.x(true);
                }
            }
            synchronized (u5.m) {
                u5.e(this);
                u5.l.add(new WeakReference(this));
            }
        }
        this.W = new Configuration(this.p.getResources().getConfiguration());
        this.U = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // defpackage.u5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.o
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.u5.m
            monitor-enter(r0)
            defpackage.u5.e(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.d0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.q
            android.view.View r0 = r0.getDecorView()
            v5 r1 = r3.f0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.V = r0
            int r0 = r3.X
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.o
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            bw0 r0 = defpackage.h6.m0
            java.lang.Object r1 = r3.o
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.X
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            bw0 r0 = defpackage.h6.m0
            java.lang.Object r1 = r3.o
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            m54 r0 = r3.t
            if (r0 == 0) goto L63
            r0.t()
        L63:
            c6 r0 = r3.b0
            if (r0 == 0) goto L6a
            r0.d()
        L6a:
            c6 r0 = r3.c0
            if (r0 == 0) goto L71
            r0.d()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6.d():void");
    }

    @Override // defpackage.u5
    public final boolean f(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.O && i == 108) {
            return false;
        }
        if (this.K && i == 1) {
            this.K = false;
        }
        if (i == 1) {
            H();
            this.O = true;
            return true;
        }
        if (i == 2) {
            H();
            this.I = true;
            return true;
        }
        if (i == 5) {
            H();
            this.J = true;
            return true;
        }
        if (i == 10) {
            H();
            this.M = true;
            return true;
        }
        if (i == 108) {
            H();
            this.K = true;
            return true;
        }
        if (i != 109) {
            return this.q.requestFeature(i);
        }
        H();
        this.L = true;
        return true;
    }

    @Override // defpackage.md0
    public final boolean g(od0 od0Var, MenuItem menuItem) {
        g6 g6Var;
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !this.V) {
            od0 od0VarK = od0Var.k();
            g6[] g6VarArr = this.Q;
            int length = g6VarArr != null ? g6VarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    g6Var = g6VarArr[i];
                    if (g6Var != null && g6Var.h == od0VarK) {
                        break;
                    }
                    i++;
                } else {
                    g6Var = null;
                    break;
                }
            }
            if (g6Var != null) {
                return callback.onMenuItemSelected(g6Var.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.u5
    public final void h(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.p).inflate(i, viewGroup);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.u5
    public final void i(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.u5
    public final void j(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.u5
    public final void l(CharSequence charSequence) {
        this.v = charSequence;
        vm vmVar = this.w;
        if (vmVar != null) {
            vmVar.setWindowTitle(charSequence);
            return;
        }
        m54 m54Var = this.t;
        if (m54Var != null) {
            m54Var.A(charSequence);
            return;
        }
        TextView textView = this.G;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(boolean r13, boolean r14) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6.m(boolean, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // defpackage.md0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(defpackage.od0 r6) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r5 = this;
            vm r6 = r5.w
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Ld3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            wm r6 = r6.j
            h21 r6 = (defpackage.h21) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Ld3
            androidx.appcompat.widget.ActionMenuView r6 = r6.f
            if (r6 == 0) goto Ld3
            boolean r6 = r6.x
            if (r6 == 0) goto Ld3
            android.content.Context r6 = r5.p
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L4a
            vm r6 = r5.w
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            wm r6 = r6.j
            h21 r6 = (defpackage.h21) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f
            if (r6 == 0) goto Ld3
            y1 r6 = r6.y
            if (r6 == 0) goto Ld3
            jq3 r2 = r6.z
            if (r2 != 0) goto L4a
            boolean r6 = r6.h()
            if (r6 == 0) goto Ld3
        L4a:
            android.view.Window r6 = r5.q
            android.view.Window$Callback r6 = r6.getCallback()
            vm r2 = r5.w
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.k()
            wm r2 = r2.j
            h21 r2 = (defpackage.h21) r2
            androidx.appcompat.widget.Toolbar r2 = r2.a
            boolean r2 = r2.o()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L8c
            vm r0 = r5.w
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.k()
            wm r0 = r0.j
            h21 r0 = (defpackage.h21) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f
            if (r0 == 0) goto L7e
            y1 r0 = r0.y
            if (r0 == 0) goto L7e
            boolean r0 = r0.c()
        L7e:
            boolean r0 = r5.V
            if (r0 != 0) goto Ld2
            g6 r0 = r5.z(r1)
            od0 r0 = r0.h
            r6.onPanelClosed(r3, r0)
            return
        L8c:
            if (r6 == 0) goto Ld2
            boolean r2 = r5.V
            if (r2 != 0) goto Ld2
            boolean r2 = r5.d0
            if (r2 == 0) goto La9
            int r2 = r5.e0
            r0 = r0 & r2
            if (r0 == 0) goto La9
            android.view.Window r0 = r5.q
            android.view.View r0 = r0.getDecorView()
            v5 r2 = r5.f0
            r0.removeCallbacks(r2)
            r2.run()
        La9:
            g6 r0 = r5.z(r1)
            od0 r2 = r0.h
            if (r2 == 0) goto Ld2
            boolean r4 = r0.o
            if (r4 != 0) goto Ld2
            android.view.View r4 = r0.g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Ld2
            od0 r0 = r0.h
            r6.onMenuOpened(r3, r0)
            vm r6 = r5.w
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            wm r6 = r6.j
            h21 r6 = (defpackage.h21) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            r6.u()
        Ld2:
            return
        Ld3:
            g6 r6 = r5.z(r1)
            r6.n = r0
            r5.s(r6, r1)
            r0 = 0
            r5.E(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6.n(od0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(android.view.Window r8) {
        /*
            r7 = this;
            java.lang.String r0 = "AppCompat has already installed itself into the Window"
            android.view.Window r1 = r7.q
            if (r1 != 0) goto L80
            android.view.Window$Callback r1 = r8.getCallback()
            boolean r2 = r1 instanceof defpackage.b6
            if (r2 != 0) goto L7a
            b6 r0 = new b6
            r0.<init>(r7, r1)
            r7.r = r0
            r8.setCallback(r0)
            android.content.Context r0 = r7.p
            int[] r1 = defpackage.h6.n0
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            l6 r4 = defpackage.l6.a()
            monitor-enter(r4)
            zp0 r5 = r4.a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r0 = r5.d(r0, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r8
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L45
            r8.setBackgroundDrawable(r0)
        L45:
            r1.recycle()
            r7.q = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.k0
            if (r8 != 0) goto L79
            java.lang.Object r0 = r7.o
            if (r8 == 0) goto L61
            android.window.OnBackInvokedCallback r1 = r7.l0
            if (r1 == 0) goto L61
            defpackage.a6.c(r8, r1)
            r7.l0 = r2
        L61:
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L74
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r8 = r0.getWindow()
            if (r8 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = defpackage.a6.a(r0)
            r7.k0 = r8
            goto L76
        L74:
            r7.k0 = r2
        L76:
            r7.I()
        L79:
            return
        L7a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r0)
            throw r8
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6.o(android.view.Window):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:113:0x01c0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void q(int i, g6 g6Var, od0 od0Var) {
        if (od0Var == null) {
            if (g6Var == null && i >= 0) {
                g6[] g6VarArr = this.Q;
                if (i < g6VarArr.length) {
                    g6Var = g6VarArr[i];
                }
            }
            if (g6Var != null) {
                od0Var = g6Var.h;
            }
        }
        if ((g6Var == null || g6Var.m) && !this.V) {
            b6 b6Var = this.r;
            Window.Callback callback = this.q.getCallback();
            b6Var.getClass();
            try {
                b6Var.j = true;
                callback.onPanelClosed(i, od0Var);
            } finally {
                b6Var.j = false;
            }
        }
    }

    public final void r(od0 od0Var) {
        y1 y1Var;
        if (this.P) {
            return;
        }
        this.P = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.w;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((h21) actionBarOverlayLayout.j).a.f;
        if (actionMenuView != null && (y1Var = actionMenuView.y) != null) {
            y1Var.c();
            v1 v1Var = y1Var.y;
            if (v1Var != null && v1Var.b()) {
                v1Var.i.dismiss();
            }
        }
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !this.V) {
            callback.onPanelClosed(108, od0Var);
        }
        this.P = false;
    }

    public final void s(g6 g6Var, boolean z) {
        f6 f6Var;
        vm vmVar;
        if (z && g6Var.a == 0 && (vmVar = this.w) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) vmVar;
            actionBarOverlayLayout.k();
            if (((h21) actionBarOverlayLayout.j).a.o()) {
                r(g6Var.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.p.getSystemService("window");
        if (windowManager != null && g6Var.m && (f6Var = g6Var.e) != null) {
            windowManager.removeView(f6Var);
            if (z) {
                q(g6Var.a, g6Var, null);
            }
        }
        g6Var.k = false;
        g6Var.l = false;
        g6Var.m = false;
        g6Var.f = null;
        g6Var.n = true;
        if (this.R == g6Var) {
            this.R = null;
        }
        if (g6Var.a == 0) {
            I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6.u(android.view.KeyEvent):boolean");
    }

    public final void v(int i) {
        g6 g6VarZ = z(i);
        if (g6VarZ.h != null) {
            Bundle bundle = new Bundle();
            g6VarZ.h.t(bundle);
            if (bundle.size() > 0) {
                g6VarZ.p = bundle;
            }
            g6VarZ.h.w();
            g6VarZ.h.clear();
        }
        g6VarZ.o = true;
        g6VarZ.n = true;
        if ((i == 108 || i == 0) && this.w != null) {
            g6 g6VarZ2 = z(0);
            g6VarZ2.k = false;
            G(g6VarZ2, null);
        }
    }

    public final void w() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (this.E) {
            return;
        }
        Context context = this.p;
        int[] iArr = hn0.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            f(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            f(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            f(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            f(10);
        }
        this.N = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        x();
        this.q.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = 2;
        if (this.O) {
            viewGroup = this.M ? (ViewGroup) layoutInflaterFrom.inflate(com.phuongpn.whousemywifi.networkscanner.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.phuongpn.whousemywifi.networkscanner.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.N) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.phuongpn.whousemywifi.networkscanner.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.L = false;
            this.K = false;
        } else if (this.K) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.phuongpn.whousemywifi.networkscanner.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new nj(context, typedValue.resourceId) : context).inflate(com.phuongpn.whousemywifi.networkscanner.R.layout.abc_screen_toolbar, (ViewGroup) null);
            vm vmVar = (vm) viewGroup.findViewById(com.phuongpn.whousemywifi.networkscanner.R.id.decor_content_parent);
            this.w = vmVar;
            vmVar.setWindowCallback(this.q.getCallback());
            if (this.L) {
                ((ActionBarOverlayLayout) this.w).j(109);
            }
            if (this.I) {
                ((ActionBarOverlayLayout) this.w).j(2);
            }
            if (this.J) {
                ((ActionBarOverlayLayout) this.w).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.K + ", windowActionBarOverlay: " + this.L + ", android:windowIsFloating: " + this.N + ", windowActionModeOverlay: " + this.M + ", windowNoTitle: " + this.O + " }");
        }
        f20 f20Var = new f20(i, this);
        WeakHashMap weakHashMap = e61.a;
        t51.u(viewGroup, f20Var);
        if (this.w == null) {
            this.G = (TextView) viewGroup.findViewById(com.phuongpn.whousemywifi.networkscanner.R.id.title);
        }
        boolean z = g71.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.phuongpn.whousemywifi.networkscanner.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.q.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.q.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ug0(i, this));
        this.F = viewGroup;
        Object obj = this.o;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.v;
        if (!TextUtils.isEmpty(title)) {
            vm vmVar2 = this.w;
            if (vmVar2 != null) {
                vmVar2.setWindowTitle(title);
            } else {
                m54 m54Var = this.t;
                if (m54Var != null) {
                    m54Var.A(title);
                } else {
                    TextView textView = this.G;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.F.findViewById(R.id.content);
        View decorView = this.q.getDecorView();
        contentFrameLayout2.l.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.E = true;
        g6 g6VarZ = z(0);
        if (this.V || g6VarZ.h != null) {
            return;
        }
        B(108);
    }

    public final void x() {
        if (this.q == null) {
            Object obj = this.o;
            if (obj instanceof Activity) {
                o(((Activity) obj).getWindow());
            }
        }
        if (this.q == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final e6 y(Context context) {
        if (this.b0 == null) {
            if (t83.o == null) {
                Context applicationContext = context.getApplicationContext();
                t83.o = new t83(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.b0 = new c6(this, t83.o);
        }
        return this.b0;
    }

    public final g6 z(int i) {
        g6[] g6VarArr = this.Q;
        if (g6VarArr == null || g6VarArr.length <= i) {
            g6[] g6VarArr2 = new g6[i + 1];
            if (g6VarArr != null) {
                System.arraycopy(g6VarArr, 0, g6VarArr2, 0, g6VarArr.length);
            }
            this.Q = g6VarArr2;
            g6VarArr = g6VarArr2;
        }
        g6 g6Var = g6VarArr[i];
        if (g6Var != null) {
            return g6Var;
        }
        g6 g6Var2 = new g6();
        g6Var2.a = i;
        g6Var2.n = false;
        g6VarArr[i] = g6Var2;
        return g6Var2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

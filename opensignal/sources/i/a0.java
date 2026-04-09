package i;

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
import android.os.LocaleList;
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
import h7.r1;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p.r2;
import p.y0;
import p.z2;

/* loaded from: classes.dex */
public final class a0 extends o implements o.k, LayoutInflater.Factory2 {
    public static final u.i0 D0 = new u.i0(0);
    public static final int[] E0 = {R.attr.windowBackground};
    public static final boolean F0 = !"robolectric".equals(Build.FINGERPRINT);
    public d0 A0;
    public OnBackInvokedDispatcher B0;
    public OnBackInvokedCallback C0;
    public final Object F;
    public final Context G;
    public Window H;
    public v I;
    public final Object J;
    public xu.l K;
    public n.h L;
    public CharSequence M;
    public y0 N;
    public h7.h0 O;
    public q P;
    public n.a Q;
    public ActionBarContextView R;
    public PopupWindow S;
    public p T;
    public boolean V;
    public ViewGroup W;
    public TextView X;
    public View Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f10964a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f10965b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f10966c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f10967d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f10968e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f10969f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f10970g0;

    /* renamed from: h0, reason: collision with root package name */
    public z[] f10971h0;

    /* renamed from: i0, reason: collision with root package name */
    public z f10972i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f10973j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f10974k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f10975l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f10976m0;

    /* renamed from: n0, reason: collision with root package name */
    public Configuration f10977n0;

    /* renamed from: o0, reason: collision with root package name */
    public final int f10978o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f10979p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f10980q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f10981r0;

    /* renamed from: s0, reason: collision with root package name */
    public w f10982s0;

    /* renamed from: t0, reason: collision with root package name */
    public w f10983t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f10984u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f10985v0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f10987x0;

    /* renamed from: y0, reason: collision with root package name */
    public Rect f10988y0;

    /* renamed from: z0, reason: collision with root package name */
    public Rect f10989z0;
    public u3.l0 U = null;

    /* renamed from: w0, reason: collision with root package name */
    public final p f10986w0 = new p(this, 0);

    public a0(Context context, Window window, k kVar, Object obj) {
        j jVar = null;
        this.f10978o0 = -100;
        this.G = context;
        this.J = kVar;
        this.F = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof j)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        jVar = (j) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (jVar != null) {
                this.f10978o0 = ((a0) jVar.m()).f10978o0;
            }
        }
        if (this.f10978o0 == -100) {
            String name = this.F.getClass().getName();
            u.i0 i0Var = D0;
            Integer num = (Integer) i0Var.get(name);
            if (num != null) {
                this.f10978o0 = num.intValue();
                i0Var.remove(this.F.getClass().getName());
            }
        }
        if (window != null) {
            l(window);
        }
        p.p.d();
    }

    public static p3.d m(Context context) {
        p3.d dVar;
        p3.d dVar2;
        if (Build.VERSION.SDK_INT >= 33 || (dVar = o.f11101g) == null) {
            return null;
        }
        p3.e eVar = dVar.f20245a;
        p3.d dVarB = t.b(context.getApplicationContext().getResources().getConfiguration());
        if (eVar.f20246a.isEmpty()) {
            dVar2 = p3.d.f20244b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (i10 < dVarB.f20245a.f20246a.size() + eVar.f20246a.size()) {
                Locale locale = i10 < eVar.f20246a.size() ? eVar.f20246a.get(i10) : dVarB.f20245a.f20246a.get(i10 - eVar.f20246a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i10++;
            }
            dVar2 = new p3.d(new p3.e(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return dVar2.f20245a.f20246a.isEmpty() ? dVarB : dVar2;
    }

    public static Configuration r(Context context, int i10, p3.d dVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (dVar != null) {
            t.d(configuration2, dVar);
        }
        return configuration2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.j() != false) goto L20;
     */
    @Override // o.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(o.m r6) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r5 = this;
            p.y0 r6 = r5.N
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Ld3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            p.z0 r6 = r6.f953x
            p.r2 r6 = (p.r2) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f20152a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Ld3
            androidx.appcompat.widget.ActionMenuView r6 = r6.f1011a
            if (r6 == 0) goto Ld3
            boolean r6 = r6.O
            if (r6 == 0) goto Ld3
            android.content.Context r6 = r5.G
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L4a
            p.y0 r6 = r5.N
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            p.z0 r6 = r6.f953x
            p.r2 r6 = (p.r2) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f20152a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f1011a
            if (r6 == 0) goto Ld3
            androidx.appcompat.widget.b r6 = r6.P
            if (r6 == 0) goto Ld3
            p.h r2 = r6.R
            if (r2 != 0) goto L4a
            boolean r6 = r6.j()
            if (r6 == 0) goto Ld3
        L4a:
            android.view.Window r6 = r5.H
            android.view.Window$Callback r6 = r6.getCallback()
            p.y0 r2 = r5.N
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.k()
            p.z0 r2 = r2.f953x
            p.r2 r2 = (p.r2) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f20152a
            boolean r2 = r2.o()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L8c
            p.y0 r0 = r5.N
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.k()
            p.z0 r0 = r0.f953x
            p.r2 r0 = (p.r2) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f20152a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f1011a
            if (r0 == 0) goto L7e
            androidx.appcompat.widget.b r0 = r0.P
            if (r0 == 0) goto L7e
            boolean r0 = r0.g()
        L7e:
            boolean r0 = r5.f10976m0
            if (r0 != 0) goto Ld2
            i.z r0 = r5.x(r1)
            o.m r0 = r0.f11128h
            r6.onPanelClosed(r3, r0)
            return
        L8c:
            if (r6 == 0) goto Ld2
            boolean r2 = r5.f10976m0
            if (r2 != 0) goto Ld2
            boolean r2 = r5.f10984u0
            if (r2 == 0) goto La9
            int r2 = r5.f10985v0
            r0 = r0 & r2
            if (r0 == 0) goto La9
            android.view.Window r0 = r5.H
            android.view.View r0 = r0.getDecorView()
            i.p r2 = r5.f10986w0
            r0.removeCallbacks(r2)
            r2.run()
        La9:
            i.z r0 = r5.x(r1)
            o.m r2 = r0.f11128h
            if (r2 == 0) goto Ld2
            boolean r4 = r0.f11133o
            if (r4 != 0) goto Ld2
            android.view.View r4 = r0.f11127g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Ld2
            o.m r0 = r0.f11128h
            r6.onMenuOpened(r3, r0)
            p.y0 r6 = r5.N
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            p.z0 r6 = r6.f953x
            p.r2 r6 = (p.r2) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f20152a
            r6.u()
        Ld2:
            return
        Ld3:
            i.z r6 = r5.x(r1)
            r6.f11132n = r0
            r5.q(r6, r1)
            r0 = 0
            r5.D(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a0.A(o.m):void");
    }

    public final int B(Context context, int i10) {
        if (i10 != -100) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1 && i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f10983t0 == null) {
                            this.f10983t0 = new w(this, context);
                        }
                        return this.f10983t0.f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return w(context).f();
                }
            }
            return i10;
        }
        return -1;
    }

    public final boolean C() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z10 = this.f10973j0;
        this.f10973j0 = false;
        z zVarX = x(0);
        if (!zVarX.f11131m) {
            n.a aVar = this.Q;
            if (aVar != null) {
                aVar.b();
                return true;
            }
            y();
            xu.l lVar = this.K;
            if (lVar == null || !lVar.g()) {
                return false;
            }
        } else if (!z10) {
            q(zVarX, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        if (r2.B.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(i.z r18, android.view.KeyEvent r19) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a0.D(i.z, android.view.KeyEvent):void");
    }

    public final boolean E(z zVar, int i10, KeyEvent keyEvent) {
        o.m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((zVar.k || F(zVar, keyEvent)) && (mVar = zVar.f11128h) != null) {
            return mVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F(i.z r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a0.F(i.z, android.view.KeyEvent):boolean");
    }

    public final void G() {
        if (this.V) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.B0 != null && (x(0).f11131m || this.Q != null)) {
                z10 = true;
            }
            if (z10 && this.C0 == null) {
                this.C0 = u.b(this.B0, this);
            } else {
                if (z10 || (onBackInvokedCallback = this.C0) == null) {
                    return;
                }
                u.c(this.B0, onBackInvokedCallback);
                this.C0 = null;
            }
        }
    }

    @Override // i.o
    public final void a() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.K != null) {
            y();
            if (this.K.E()) {
                return;
            }
            z(0);
        }
    }

    @Override // i.o
    public final void c() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        String strC;
        this.f10974k0 = true;
        k(false, true);
        v();
        Object obj = this.F;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = g3.e.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e4) {
                    throw new IllegalArgumentException(e4);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                xu.l lVar = this.K;
                if (lVar == null) {
                    this.f10987x0 = true;
                } else {
                    lVar.R(true);
                }
            }
            synchronized (o.D) {
                o.e(this);
                o.B.add(new WeakReference(this));
            }
        }
        this.f10977n0 = new Configuration(this.G.getResources().getConfiguration());
        this.f10975l0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // i.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.F
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = i.o.D
            monitor-enter(r0)
            i.o.e(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f10984u0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.H
            android.view.View r0 = r0.getDecorView()
            i.p r1 = r3.f10986w0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f10976m0 = r0
            int r0 = r3.f10978o0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.F
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            u.i0 r0 = i.a0.D0
            java.lang.Object r1 = r3.F
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f10978o0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            u.i0 r0 = i.a0.D0
            java.lang.Object r1 = r3.F
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            xu.l r0 = r3.K
            if (r0 == 0) goto L63
            r0.K()
        L63:
            i.w r0 = r3.f10982s0
            if (r0 == 0) goto L6a
            r0.c()
        L6a:
            i.w r0 = r3.f10983t0
            if (r0 == 0) goto L71
            r0.c()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a0.d():void");
    }

    @Override // i.o
    public final boolean f(int i10) {
        if (i10 == 8) {
            i10 = 108;
        } else if (i10 == 9) {
            i10 = 109;
        }
        if (this.f10969f0 && i10 == 108) {
            return false;
        }
        if (this.f10965b0 && i10 == 1) {
            this.f10965b0 = false;
        }
        if (i10 == 1) {
            G();
            this.f10969f0 = true;
            return true;
        }
        if (i10 == 2) {
            G();
            this.Z = true;
            return true;
        }
        if (i10 == 5) {
            G();
            this.f10964a0 = true;
            return true;
        }
        if (i10 == 10) {
            G();
            this.f10967d0 = true;
            return true;
        }
        if (i10 == 108) {
            G();
            this.f10965b0 = true;
            return true;
        }
        if (i10 != 109) {
            return this.H.requestFeature(i10);
        }
        G();
        this.f10966c0 = true;
        return true;
    }

    @Override // i.o
    public final void g(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        u();
        ViewGroup viewGroup = (ViewGroup) this.W.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.G).inflate(i10, viewGroup);
        this.I.a(this.H.getCallback());
    }

    @Override // i.o
    public final void h(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        u();
        ViewGroup viewGroup = (ViewGroup) this.W.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.I.a(this.H.getCallback());
    }

    @Override // i.o
    public final void i(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        u();
        ViewGroup viewGroup = (ViewGroup) this.W.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.I.a(this.H.getCallback());
    }

    @Override // i.o
    public final void j(CharSequence charSequence) {
        this.M = charSequence;
        y0 y0Var = this.N;
        if (y0Var != null) {
            y0Var.setWindowTitle(charSequence);
            return;
        }
        xu.l lVar = this.K;
        if (lVar != null) {
            lVar.V(charSequence);
            return;
        }
        TextView textView = this.X;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(boolean r14, boolean r15) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a0.k(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(android.view.Window r8) {
        /*
            r7 = this;
            java.lang.String r0 = "AppCompat has already installed itself into the Window"
            android.view.Window r1 = r7.H
            if (r1 != 0) goto L80
            android.view.Window$Callback r1 = r8.getCallback()
            boolean r2 = r1 instanceof i.v
            if (r2 != 0) goto L7a
            i.v r0 = new i.v
            r0.<init>(r7, r1)
            r7.I = r0
            r8.setCallback(r0)
            android.content.Context r0 = r7.G
            int[] r1 = i.a0.E0
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            p.p r4 = p.p.a()
            monitor-enter(r4)
            p.a2 r5 = r4.f20132a     // Catch: java.lang.Throwable -> L3c
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
            r7.H = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.B0
            if (r8 != 0) goto L79
            java.lang.Object r0 = r7.F
            if (r8 == 0) goto L61
            android.window.OnBackInvokedCallback r1 = r7.C0
            if (r1 == 0) goto L61
            i.u.c(r8, r1)
            r7.C0 = r2
        L61:
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L74
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r8 = r0.getWindow()
            if (r8 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = i.u.a(r0)
            r7.B0 = r8
            goto L76
        L74:
            r7.B0 = r2
        L76:
            r7.H()
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
        throw new UnsupportedOperationException("Method not decompiled: i.a0.l(android.view.Window):void");
    }

    @Override // o.k
    public final boolean n(o.m mVar, MenuItem menuItem) {
        z zVar;
        Window.Callback callback = this.H.getCallback();
        if (callback != null && !this.f10976m0) {
            o.m mVarK = mVar.k();
            z[] zVarArr = this.f10971h0;
            int length = zVarArr != null ? zVarArr.length : 0;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    zVar = zVarArr[i10];
                    if (zVar != null && zVar.f11128h == mVarK) {
                        break;
                    }
                    i10++;
                } else {
                    zVar = null;
                    break;
                }
            }
            if (zVar != null) {
                return callback.onMenuItemSelected(zVar.f11121a, menuItem);
            }
        }
        return false;
    }

    public final void o(int i10, z zVar, o.m mVar) {
        if (mVar == null) {
            if (zVar == null && i10 >= 0) {
                z[] zVarArr = this.f10971h0;
                if (i10 < zVarArr.length) {
                    zVar = zVarArr[i10];
                }
            }
            if (zVar != null) {
                mVar = zVar.f11128h;
            }
        }
        if ((zVar == null || zVar.f11131m) && !this.f10976m0) {
            v vVar = this.I;
            Window.Callback callback = this.H.getCallback();
            vVar.getClass();
            try {
                vVar.f11114x = true;
                callback.onPanelClosed(i10, mVar);
            } finally {
                vVar.f11114x = false;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:114:0x01c4
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a0.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(o.m mVar) {
        androidx.appcompat.widget.b bVar;
        if (this.f10970g0) {
            return;
        }
        this.f10970g0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.N;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((r2) actionBarOverlayLayout.f953x).f20152a.f1011a;
        if (actionMenuView != null && (bVar = actionMenuView.P) != null) {
            bVar.g();
            p.f fVar = bVar.Q;
            if (fVar != null && fVar.b()) {
                fVar.f18681i.dismiss();
            }
        }
        Window.Callback callback = this.H.getCallback();
        if (callback != null && !this.f10976m0) {
            callback.onPanelClosed(108, mVar);
        }
        this.f10970g0 = false;
    }

    public final void q(z zVar, boolean z10) {
        y yVar;
        y0 y0Var;
        if (z10 && zVar.f11121a == 0 && (y0Var = this.N) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) y0Var;
            actionBarOverlayLayout.k();
            if (((r2) actionBarOverlayLayout.f953x).f20152a.o()) {
                p(zVar.f11128h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.G.getSystemService("window");
        if (windowManager != null && zVar.f11131m && (yVar = zVar.f11125e) != null) {
            windowManager.removeView(yVar);
            if (z10) {
                o(zVar.f11121a, zVar, null);
            }
        }
        zVar.k = false;
        zVar.f11130l = false;
        zVar.f11131m = false;
        zVar.f11126f = null;
        zVar.f11132n = true;
        if (this.f10972i0 == zVar) {
            this.f10972i0 = null;
        }
        if (zVar.f11121a == 0) {
            H();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a0.s(android.view.KeyEvent):boolean");
    }

    public final void t(int i10) {
        z zVarX = x(i10);
        if (zVarX.f11128h != null) {
            Bundle bundle = new Bundle();
            zVarX.f11128h.t(bundle);
            if (bundle.size() > 0) {
                zVarX.f11134p = bundle;
            }
            zVarX.f11128h.w();
            zVarX.f11128h.clear();
        }
        zVarX.f11133o = true;
        zVarX.f11132n = true;
        if ((i10 == 108 || i10 == 0) && this.N != null) {
            z zVarX2 = x(0);
            zVarX2.k = false;
            F(zVarX2, null);
        }
    }

    public final void u() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (this.V) {
            return;
        }
        int[] iArr = h.j.AppCompatTheme;
        Context context = this.G;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(h.j.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(h.j.AppCompatTheme_windowNoTitle, false)) {
            f(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(h.j.AppCompatTheme_windowActionBar, false)) {
            f(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(h.j.AppCompatTheme_windowActionBarOverlay, false)) {
            f(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(h.j.AppCompatTheme_windowActionModeOverlay, false)) {
            f(10);
        }
        this.f10968e0 = typedArrayObtainStyledAttributes.getBoolean(h.j.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        v();
        this.H.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f10969f0) {
            viewGroup = this.f10967d0 ? (ViewGroup) layoutInflaterFrom.inflate(h.g.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(h.g.abc_screen_simple, (ViewGroup) null);
        } else if (this.f10968e0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(h.g.abc_dialog_title_material, (ViewGroup) null);
            this.f10966c0 = false;
            this.f10965b0 = false;
        } else if (this.f10965b0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(h.a.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new n.c(context, typedValue.resourceId) : context).inflate(h.g.abc_screen_toolbar, (ViewGroup) null);
            y0 y0Var = (y0) viewGroup.findViewById(h.f.decor_content_parent);
            this.N = y0Var;
            y0Var.setWindowCallback(this.H.getCallback());
            if (this.f10966c0) {
                ((ActionBarOverlayLayout) this.N).j(109);
            }
            if (this.Z) {
                ((ActionBarOverlayLayout) this.N).j(2);
            }
            if (this.f10964a0) {
                ((ActionBarOverlayLayout) this.N).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f10965b0 + ", windowActionBarOverlay: " + this.f10966c0 + ", android:windowIsFloating: " + this.f10968e0 + ", windowActionModeOverlay: " + this.f10967d0 + ", windowNoTitle: " + this.f10969f0 + " }");
        }
        q qVar = new q(this);
        WeakHashMap weakHashMap = u3.i0.f23177a;
        u3.z.j(viewGroup, qVar);
        if (this.N == null) {
            this.X = (TextView) viewGroup.findViewById(h.f.title);
        }
        boolean z10 = z2.f20220a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(h.f.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.H.findViewById(R.id.content);
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
        this.H.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new r1(3, this));
        this.W = viewGroup;
        Object obj = this.F;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.M;
        if (!TextUtils.isEmpty(title)) {
            y0 y0Var2 = this.N;
            if (y0Var2 != null) {
                y0Var2.setWindowTitle(title);
            } else {
                xu.l lVar = this.K;
                if (lVar != null) {
                    lVar.V(title);
                } else {
                    TextView textView = this.X;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.W.findViewById(R.id.content);
        View decorView = this.H.getDecorView();
        contentFrameLayout2.B.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(h.j.AppCompatTheme);
        typedArrayObtainStyledAttributes2.getValue(h.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(h.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(h.j.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes2.getValue(h.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(h.j.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes2.getValue(h.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(h.j.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes2.getValue(h.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(h.j.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes2.getValue(h.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.V = true;
        z zVarX = x(0);
        if (this.f10976m0 || zVarX.f11128h != null) {
            return;
        }
        z(108);
    }

    public final void v() {
        if (this.H == null) {
            Object obj = this.F;
            if (obj instanceof Activity) {
                l(((Activity) obj).getWindow());
            }
        }
        if (this.H == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final x w(Context context) {
        if (this.f10982s0 == null) {
            if (bm.d.f2824x == null) {
                Context applicationContext = context.getApplicationContext();
                bm.d.f2824x = new bm.d(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f10982s0 = new w(this, bm.d.f2824x);
        }
        return this.f10982s0;
    }

    public final z x(int i10) {
        z[] zVarArr = this.f10971h0;
        if (zVarArr == null || zVarArr.length <= i10) {
            z[] zVarArr2 = new z[i10 + 1];
            if (zVarArr != null) {
                System.arraycopy(zVarArr, 0, zVarArr2, 0, zVarArr.length);
            }
            this.f10971h0 = zVarArr2;
            zVarArr = zVarArr2;
        }
        z zVar = zVarArr[i10];
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z();
        zVar2.f11121a = i10;
        zVar2.f11132n = false;
        zVarArr[i10] = zVar2;
        return zVar2;
    }

    public final void y() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        u();
        if (this.f10965b0 && this.K == null) {
            Object obj = this.F;
            if (obj instanceof Activity) {
                this.K = new m0((Activity) obj, this.f10966c0);
            } else if (obj instanceof Dialog) {
                this.K = new m0((Dialog) obj);
            }
            xu.l lVar = this.K;
            if (lVar != null) {
                lVar.R(this.f10987x0);
            }
        }
    }

    public final void z(int i10) {
        this.f10985v0 = (1 << i10) | this.f10985v0;
        if (this.f10984u0) {
            return;
        }
        View decorView = this.H.getDecorView();
        WeakHashMap weakHashMap = u3.i0.f23177a;
        decorView.postOnAnimation(this.f10986w0);
        this.f10984u0 = true;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

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
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
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
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import e4.c1;
import e4.m0;
import e4.v0;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p.e1;
import p.n3;
import p.v3;
import x.n0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v extends l implements o.k, LayoutInflater.Factory2 {

    /* renamed from: h0, reason: collision with root package name */
    public static final n0 f25364h0 = new n0(0);

    /* renamed from: i0, reason: collision with root package name */
    public static final int[] f25365i0 = {R.attr.windowBackground};

    /* renamed from: j0, reason: collision with root package name */
    public static final boolean f25366j0 = !"robolectric".equals(Build.FINGERPRINT);
    public ViewGroup A;
    public TextView B;
    public View C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public u[] L;
    public u M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public Configuration R;
    public final int S;
    public int T;
    public int U;
    public boolean V;
    public s W;
    public s X;
    public boolean Y;
    public int Z;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f25368b0;

    /* renamed from: c0, reason: collision with root package name */
    public Rect f25369c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f25370d0;

    /* renamed from: e0, reason: collision with root package name */
    public a0 f25371e0;

    /* renamed from: f0, reason: collision with root package name */
    public OnBackInvokedDispatcher f25372f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedCallback f25373g0;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f25374k;

    /* renamed from: l, reason: collision with root package name */
    public Window f25375l;

    /* renamed from: m, reason: collision with root package name */
    public r f25376m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f25377n;

    /* renamed from: o, reason: collision with root package name */
    public wd.b f25378o;

    /* renamed from: p, reason: collision with root package name */
    public n.h f25379p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f25380q;

    /* renamed from: r, reason: collision with root package name */
    public e1 f25381r;

    /* renamed from: s, reason: collision with root package name */
    public o7.d f25382s;

    /* renamed from: t, reason: collision with root package name */
    public p6.i f25383t;

    /* renamed from: u, reason: collision with root package name */
    public n.a f25384u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f25385v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f25386w;

    /* renamed from: x, reason: collision with root package name */
    public m f25387x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f25389z;

    /* renamed from: y, reason: collision with root package name */
    public c1 f25388y = null;

    /* renamed from: a0, reason: collision with root package name */
    public final m f25367a0 = new m(this, 0);

    public v(Context context, Window window, h hVar, Object obj) {
        g gVar = null;
        this.S = -100;
        this.f25374k = context;
        this.f25377n = hVar;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof g)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        gVar = (g) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (gVar != null) {
                this.S = ((v) gVar.q()).S;
            }
        }
        if (this.S == -100) {
            String name = this.j.getClass().getName();
            n0 n0Var = f25364h0;
            Integer num = (Integer) n0Var.get(name);
            if (num != null) {
                this.S = num.intValue();
                n0Var.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            o(window);
        }
        p.s.d();
    }

    public static a4.h A(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? p.b(configuration) : a4.h.b(o.b(configuration.locale));
    }

    public static a4.h p(Context context) {
        a4.h hVar;
        a4.h hVarB;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33 || (hVar = l.f25330c) == null) {
            return null;
        }
        a4.j jVar = hVar.f193a;
        a4.h hVarA = A(context.getApplicationContext().getResources().getConfiguration());
        int i10 = 0;
        if (i4 < 24) {
            hVarB = jVar.isEmpty() ? a4.h.f192b : a4.h.b(o.b(jVar.get(0)));
        } else if (jVar.isEmpty()) {
            hVarB = a4.h.f192b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i10 < hVarA.f193a.size() + jVar.size()) {
                Locale locale = i10 < jVar.size() ? jVar.get(i10) : hVarA.f193a.get(i10 - jVar.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i10++;
            }
            hVarB = a4.h.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return hVarB.f193a.isEmpty() ? hVarA : hVarB;
    }

    public static Configuration u(Context context, int i4, a4.h hVar, Configuration configuration, boolean z3) {
        int i10 = i4 != 1 ? i4 != 2 ? z3 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i10 | (configuration2.uiMode & (-49));
        if (hVar != null) {
            a4.j jVar = hVar.f193a;
            if (Build.VERSION.SDK_INT >= 24) {
                p.d(configuration2, hVar);
                return configuration2;
            }
            configuration2.setLocale(jVar.get(0));
            configuration2.setLayoutDirection(jVar.get(0));
        }
        return configuration2;
    }

    public final u B(int i4) {
        u[] uVarArr = this.L;
        if (uVarArr == null || uVarArr.length <= i4) {
            u[] uVarArr2 = new u[i4 + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.L = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i4];
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u();
        uVar2.f25350a = i4;
        uVar2.f25361n = false;
        uVarArr[i4] = uVar2;
        return uVar2;
    }

    public final void C() {
        x();
        if (this.F && this.f25378o == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.f25378o = new i0((Activity) obj, this.G);
            } else if (obj instanceof Dialog) {
                this.f25378o = new i0((Dialog) obj);
            }
            wd.b bVar = this.f25378o;
            if (bVar != null) {
                bVar.P(this.f25368b0);
            }
        }
    }

    public final void D(int i4) {
        this.Z = (1 << i4) | this.Z;
        if (this.Y) {
            return;
        }
        View decorView = this.f25375l.getDecorView();
        WeakHashMap weakHashMap = v0.f22405a;
        decorView.postOnAnimation(this.f25367a0);
        this.Y = true;
    }

    public final int E(int i4, Context context) {
        if (i4 != -100) {
            if (i4 == -1) {
                return i4;
            }
            if (i4 != 0) {
                if (i4 == 1 || i4 == 2) {
                    return i4;
                }
                if (i4 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.X == null) {
                    this.X = new s(this, context);
                }
                return this.X.f();
            }
            if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                return z(context).f();
            }
        }
        return -1;
    }

    public final boolean F() {
        boolean z3 = this.N;
        this.N = false;
        u uVarB = B(0);
        if (!uVarB.f25360m) {
            n.a aVar = this.f25384u;
            if (aVar != null) {
                aVar.d();
                return true;
            }
            C();
            wd.b bVar = this.f25378o;
            if (bVar == null || !bVar.g()) {
                return false;
            }
        } else if (!z3) {
            t(uVarB, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        if (r2.f30230f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(i.u r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.v.G(i.u, android.view.KeyEvent):void");
    }

    public final boolean H(u uVar, int i4, KeyEvent keyEvent) {
        o.m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f25358k || I(uVar, keyEvent)) && (mVar = uVar.f25356h) != null) {
            return mVar.performShortcut(i4, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I(i.u r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.v.I(i.u, android.view.KeyEvent):boolean");
    }

    public final void J() {
        if (this.f25389z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void K() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z3 = false;
            if (this.f25372f0 != null && (B(0).f25360m || this.f25384u != null)) {
                z3 = true;
            }
            if (z3 && this.f25373g0 == null) {
                this.f25373g0 = q.b(this.f25372f0, this);
            } else {
                if (z3 || (onBackInvokedCallback = this.f25373g0) == null) {
                    return;
                }
                q.c(this.f25372f0, onBackInvokedCallback);
                this.f25373g0 = null;
            }
        }
    }

    @Override // i.l
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f25374k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof v) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // i.l
    public final void b() {
        if (this.f25378o != null) {
            C();
            if (this.f25378o.z()) {
                return;
            }
            D(0);
        }
    }

    @Override // i.l
    public final void d() {
        String strC;
        this.O = true;
        n(false, true);
        y();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = r3.e.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                wd.b bVar = this.f25378o;
                if (bVar == null) {
                    this.f25368b0 = true;
                } else {
                    bVar.P(true);
                }
            }
            synchronized (l.f25334h) {
                l.g(this);
                l.g.add(new WeakReference(this));
            }
        }
        this.R = new Configuration(this.f25374k.getResources().getConfiguration());
        this.P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // i.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = i.l.f25334h
            monitor-enter(r0)
            i.l.g(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.Y
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f25375l
            android.view.View r0 = r0.getDecorView()
            i.m r1 = r3.f25367a0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.Q = r0
            int r0 = r3.S
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            x.n0 r0 = i.v.f25364h0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            x.n0 r0 = i.v.f25364h0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            wd.b r0 = r3.f25378o
            if (r0 == 0) goto L63
            r0.E()
        L63:
            i.s r0 = r3.W
            if (r0 == 0) goto L6a
            r0.c()
        L6a:
            i.s r0 = r3.X
            if (r0 == 0) goto L71
            r0.c()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.v.e():void");
    }

    @Override // o.k
    public final boolean f(o.m mVar, MenuItem menuItem) {
        u uVar;
        Window.Callback callback = this.f25375l.getCallback();
        if (callback != null && !this.Q) {
            o.m mVarK = mVar.k();
            u[] uVarArr = this.L;
            int length = uVarArr != null ? uVarArr.length : 0;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    uVar = uVarArr[i4];
                    if (uVar != null && uVar.f25356h == mVarK) {
                        break;
                    }
                    i4++;
                } else {
                    uVar = null;
                    break;
                }
            }
            if (uVar != null) {
                return callback.onMenuItemSelected(uVar.f25350a, menuItem);
            }
        }
        return false;
    }

    @Override // i.l
    public final boolean h(int i4) {
        if (i4 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i4 = 108;
        } else if (i4 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i4 = 109;
        }
        if (this.J && i4 == 108) {
            return false;
        }
        if (this.F && i4 == 1) {
            this.F = false;
        }
        if (i4 == 1) {
            J();
            this.J = true;
            return true;
        }
        if (i4 == 2) {
            J();
            this.D = true;
            return true;
        }
        if (i4 == 5) {
            J();
            this.E = true;
            return true;
        }
        if (i4 == 10) {
            J();
            this.H = true;
            return true;
        }
        if (i4 == 108) {
            J();
            this.F = true;
            return true;
        }
        if (i4 != 109) {
            return this.f25375l.requestFeature(i4);
        }
        J();
        this.G = true;
        return true;
    }

    @Override // i.l
    public final void i(int i4) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f25374k).inflate(i4, viewGroup);
        this.f25376m.a(this.f25375l.getCallback());
    }

    @Override // i.l
    public final void j(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f25376m.a(this.f25375l.getCallback());
    }

    @Override // i.l
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f25376m.a(this.f25375l.getCallback());
    }

    @Override // i.l
    public final void m(CharSequence charSequence) {
        this.f25380q = charSequence;
        e1 e1Var = this.f25381r;
        if (e1Var != null) {
            e1Var.setWindowTitle(charSequence);
            return;
        }
        wd.b bVar = this.f25378o;
        if (bVar != null) {
            bVar.T(charSequence);
            return;
        }
        TextView textView = this.B;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.v.n(boolean, boolean):boolean");
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
            android.view.Window r1 = r7.f25375l
            if (r1 != 0) goto L80
            android.view.Window$Callback r1 = r8.getCallback()
            boolean r2 = r1 instanceof i.r
            if (r2 != 0) goto L7a
            i.r r0 = new i.r
            r0.<init>(r7, r1)
            r7.f25376m = r0
            r8.setCallback(r0)
            android.content.Context r0 = r7.f25374k
            int[] r1 = i.v.f25365i0
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            p.s r4 = p.s.a()
            monitor-enter(r4)
            p.k2 r5 = r4.f30852a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r0 = r5.g(r0, r3, r6)     // Catch: java.lang.Throwable -> L3c
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
            r7.f25375l = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.f25372f0
            if (r8 != 0) goto L79
            java.lang.Object r0 = r7.j
            if (r8 == 0) goto L61
            android.window.OnBackInvokedCallback r1 = r7.f25373g0
            if (r1 == 0) goto L61
            i.q.c(r8, r1)
            r7.f25373g0 = r2
        L61:
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L74
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r8 = r0.getWindow()
            if (r8 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = i.q.a(r0)
            r7.f25372f0 = r8
            goto L76
        L74:
            r7.f25372f0 = r2
        L76:
            r7.K()
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
        throw new UnsupportedOperationException("Method not decompiled: i.v.o(android.view.Window):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:117:0x01e3
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.v.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void q(int i4, u uVar, o.m mVar) {
        if (mVar == null) {
            if (uVar == null && i4 >= 0) {
                u[] uVarArr = this.L;
                if (i4 < uVarArr.length) {
                    uVar = uVarArr[i4];
                }
            }
            if (uVar != null) {
                mVar = uVar.f25356h;
            }
        }
        if ((uVar == null || uVar.f25360m) && !this.Q) {
            r rVar = this.f25376m;
            Window.Callback callback = this.f25375l.getCallback();
            rVar.getClass();
            try {
                rVar.f25344e = true;
                callback.onPanelClosed(i4, mVar);
            } finally {
                rVar.f25344e = false;
            }
        }
    }

    public final void r(o.m mVar) {
        p.k kVar;
        if (this.K) {
            return;
        }
        this.K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f25381r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((n3) actionBarOverlayLayout.f725e).f30779a.f818a;
        if (actionMenuView != null && (kVar = actionMenuView.f749t) != null) {
            kVar.h();
            p.g gVar = kVar.f30742t;
            if (gVar != null && gVar.b()) {
                gVar.f30307i.dismiss();
            }
        }
        Window.Callback callback = this.f25375l.getCallback();
        if (callback != null && !this.Q) {
            callback.onPanelClosed(108, mVar);
        }
        this.K = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.k() != false) goto L20;
     */
    @Override // o.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(o.m r6) {
        /*
            r5 = this;
            p.e1 r6 = r5.f25381r
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Ld3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            p.f1 r6 = r6.f725e
            p.n3 r6 = (p.n3) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f30779a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Ld3
            androidx.appcompat.widget.ActionMenuView r6 = r6.f818a
            if (r6 == 0) goto Ld3
            boolean r6 = r6.f748s
            if (r6 == 0) goto Ld3
            android.content.Context r6 = r5.f25374k
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L4a
            p.e1 r6 = r5.f25381r
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            p.f1 r6 = r6.f725e
            p.n3 r6 = (p.n3) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f30779a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f818a
            if (r6 == 0) goto Ld3
            p.k r6 = r6.f749t
            if (r6 == 0) goto Ld3
            p.i r2 = r6.f30743u
            if (r2 != 0) goto L4a
            boolean r6 = r6.k()
            if (r6 == 0) goto Ld3
        L4a:
            android.view.Window r6 = r5.f25375l
            android.view.Window$Callback r6 = r6.getCallback()
            p.e1 r2 = r5.f25381r
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.k()
            p.f1 r2 = r2.f725e
            p.n3 r2 = (p.n3) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f30779a
            boolean r2 = r2.o()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L8c
            p.e1 r0 = r5.f25381r
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.k()
            p.f1 r0 = r0.f725e
            p.n3 r0 = (p.n3) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f30779a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f818a
            if (r0 == 0) goto L7e
            p.k r0 = r0.f749t
            if (r0 == 0) goto L7e
            boolean r0 = r0.h()
        L7e:
            boolean r0 = r5.Q
            if (r0 != 0) goto Ld2
            i.u r0 = r5.B(r1)
            o.m r0 = r0.f25356h
            r6.onPanelClosed(r3, r0)
            return
        L8c:
            if (r6 == 0) goto Ld2
            boolean r2 = r5.Q
            if (r2 != 0) goto Ld2
            boolean r2 = r5.Y
            if (r2 == 0) goto La9
            int r2 = r5.Z
            r0 = r0 & r2
            if (r0 == 0) goto La9
            android.view.Window r0 = r5.f25375l
            android.view.View r0 = r0.getDecorView()
            i.m r2 = r5.f25367a0
            r0.removeCallbacks(r2)
            r2.run()
        La9:
            i.u r0 = r5.B(r1)
            o.m r2 = r0.f25356h
            if (r2 == 0) goto Ld2
            boolean r4 = r0.f25362o
            if (r4 != 0) goto Ld2
            android.view.View r4 = r0.g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Ld2
            o.m r0 = r0.f25356h
            r6.onMenuOpened(r3, r0)
            p.e1 r6 = r5.f25381r
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            p.f1 r6 = r6.f725e
            p.n3 r6 = (p.n3) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f30779a
            r6.u()
        Ld2:
            return
        Ld3:
            i.u r6 = r5.B(r1)
            r6.f25361n = r0
            r5.t(r6, r1)
            r0 = 0
            r5.G(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.v.s(o.m):void");
    }

    public final void t(u uVar, boolean z3) {
        t tVar;
        e1 e1Var;
        if (z3 && uVar.f25350a == 0 && (e1Var = this.f25381r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) e1Var;
            actionBarOverlayLayout.k();
            if (((n3) actionBarOverlayLayout.f725e).f30779a.o()) {
                r(uVar.f25356h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f25374k.getSystemService("window");
        if (windowManager != null && uVar.f25360m && (tVar = uVar.f25354e) != null) {
            windowManager.removeView(tVar);
            if (z3) {
                q(uVar.f25350a, uVar, null);
            }
        }
        uVar.f25358k = false;
        uVar.f25359l = false;
        uVar.f25360m = false;
        uVar.f25355f = null;
        uVar.f25361n = true;
        if (this.M == uVar) {
            this.M = null;
        }
        if (uVar.f25350a == 0) {
            K();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.v.v(android.view.KeyEvent):boolean");
    }

    public final void w(int i4) {
        u uVarB = B(i4);
        if (uVarB.f25356h != null) {
            Bundle bundle = new Bundle();
            uVarB.f25356h.t(bundle);
            if (bundle.size() > 0) {
                uVarB.f25363p = bundle;
            }
            uVarB.f25356h.w();
            uVarB.f25356h.clear();
        }
        uVarB.f25362o = true;
        uVarB.f25361n = true;
        if ((i4 == 108 || i4 == 0) && this.f25381r != null) {
            u uVarB2 = B(0);
            uVarB2.f25358k = false;
            I(uVarB2, null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        if (this.f25389z) {
            return;
        }
        Context context = this.f25374k;
        int[] iArr = h.a.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(WebSocketProtocol.PAYLOAD_SHORT, false)) {
            h(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            h(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            h(FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            h(10);
        }
        this.I = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        y();
        this.f25375l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.J) {
            viewGroup = this.H ? (ViewGroup) layoutInflaterFrom.inflate(com.liuzh.deviceinfo.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.liuzh.deviceinfo.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.I) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.liuzh.deviceinfo.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.G = false;
            this.F = false;
        } else if (this.F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.liuzh.deviceinfo.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new n.c(context, typedValue.resourceId) : context).inflate(com.liuzh.deviceinfo.R.layout.abc_screen_toolbar, (ViewGroup) null);
            e1 e1Var = (e1) viewGroup.findViewById(com.liuzh.deviceinfo.R.id.decor_content_parent);
            this.f25381r = e1Var;
            e1Var.setWindowCallback(this.f25375l.getCallback());
            if (this.G) {
                ((ActionBarOverlayLayout) this.f25381r).j(FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD);
            }
            if (this.D) {
                ((ActionBarOverlayLayout) this.f25381r).j(2);
            }
            if (this.E) {
                ((ActionBarOverlayLayout) this.f25381r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.F + ", windowActionBarOverlay: " + this.G + ", android:windowIsFloating: " + this.I + ", windowActionModeOverlay: " + this.H + ", windowNoTitle: " + this.J + " }");
        }
        jf.c cVar = new jf.c(20, this);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(viewGroup, cVar);
        if (this.f25381r == null) {
            this.B = (TextView) viewGroup.findViewById(com.liuzh.deviceinfo.R.id.title);
        }
        boolean z3 = v3.f30896a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e10) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.liuzh.deviceinfo.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f25375l.findViewById(R.id.content);
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
        this.f25375l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new o7.c(24, this));
        this.A = viewGroup;
        Object obj = this.j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f25380q;
        if (!TextUtils.isEmpty(title)) {
            e1 e1Var2 = this.f25381r;
            if (e1Var2 != null) {
                e1Var2.setWindowTitle(title);
            } else {
                wd.b bVar = this.f25378o;
                if (bVar != null) {
                    bVar.T(title);
                } else {
                    TextView textView = this.B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.A.findViewById(R.id.content);
        View decorView = this.f25375l.getDecorView();
        contentFrameLayout2.g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f25389z = true;
        u uVarB = B(0);
        if (this.Q || uVarB.f25356h != null) {
            return;
        }
        D(108);
    }

    public final void y() {
        if (this.f25375l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                o(((Activity) obj).getWindow());
            }
        }
        if (this.f25375l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final androidx.recyclerview.widget.d0 z(Context context) {
        if (this.W == null) {
            if (yb.e.g == null) {
                Context applicationContext = context.getApplicationContext();
                yb.e.g = new yb.e(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.W = new s(this, yb.e.g);
        }
        return this.W;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

package h;

import R.O;
import R.S;
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
import g.AbstractC2327a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import n.InterfaceC2675i;
import n.MenuC2677k;
import o.C2713g;
import o.C2723l;
import o.InterfaceC2712f0;
import o.i1;
import o.q1;
import u.C2940i;

/* loaded from: classes.dex */
public final class v extends k implements InterfaceC2675i, LayoutInflater.Factory2 {
    public static final C2940i v0 = new C2940i(0);

    /* renamed from: w0, reason: collision with root package name */
    public static final int[] f20383w0 = {R.attr.windowBackground};

    /* renamed from: x0, reason: collision with root package name */
    public static final boolean f20384x0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: C, reason: collision with root package name */
    public com.bumptech.glide.d f20385C;

    /* renamed from: D, reason: collision with root package name */
    public m.h f20386D;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f20387E;

    /* renamed from: F, reason: collision with root package name */
    public InterfaceC2712f0 f20388F;

    /* renamed from: G, reason: collision with root package name */
    public U0.j f20389G;

    /* renamed from: H, reason: collision with root package name */
    public m f20390H;

    /* renamed from: I, reason: collision with root package name */
    public m.a f20391I;

    /* renamed from: J, reason: collision with root package name */
    public ActionBarContextView f20392J;

    /* renamed from: K, reason: collision with root package name */
    public PopupWindow f20393K;

    /* renamed from: L, reason: collision with root package name */
    public l f20394L;

    /* renamed from: N, reason: collision with root package name */
    public boolean f20395N;

    /* renamed from: O, reason: collision with root package name */
    public ViewGroup f20396O;

    /* renamed from: P, reason: collision with root package name */
    public TextView f20397P;

    /* renamed from: Q, reason: collision with root package name */
    public View f20398Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f20399R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f20400S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f20401T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f20402U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f20403V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f20404W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f20405X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f20406Y;

    /* renamed from: Z, reason: collision with root package name */
    public u[] f20407Z;

    /* renamed from: a0, reason: collision with root package name */
    public u f20408a0;
    public boolean b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f20409c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f20410d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f20411e0;

    /* renamed from: f0, reason: collision with root package name */
    public Configuration f20412f0;

    /* renamed from: g0, reason: collision with root package name */
    public final int f20413g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f20414h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f20415i0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f20416j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f20417j0;

    /* renamed from: k, reason: collision with root package name */
    public final Context f20418k;

    /* renamed from: k0, reason: collision with root package name */
    public s f20419k0;

    /* renamed from: l, reason: collision with root package name */
    public Window f20420l;

    /* renamed from: l0, reason: collision with root package name */
    public s f20421l0;

    /* renamed from: m, reason: collision with root package name */
    public r f20422m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f20423m0;

    /* renamed from: n, reason: collision with root package name */
    public final Object f20424n;

    /* renamed from: n0, reason: collision with root package name */
    public int f20425n0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f20427p0;

    /* renamed from: q0, reason: collision with root package name */
    public Rect f20428q0;

    /* renamed from: r0, reason: collision with root package name */
    public Rect f20429r0;

    /* renamed from: s0, reason: collision with root package name */
    public C2341A f20430s0;

    /* renamed from: t0, reason: collision with root package name */
    public OnBackInvokedDispatcher f20431t0;

    /* renamed from: u0, reason: collision with root package name */
    public OnBackInvokedCallback f20432u0;
    public S M = null;

    /* renamed from: o0, reason: collision with root package name */
    public final l f20426o0 = new l(this, 0);

    public v(Context context, Window window, InterfaceC2350h interfaceC2350h, Object obj) {
        AbstractActivityC2349g abstractActivityC2349g = null;
        this.f20413g0 = -100;
        this.f20418k = context;
        this.f20424n = interfaceC2350h;
        this.f20416j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AbstractActivityC2349g)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        abstractActivityC2349g = (AbstractActivityC2349g) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC2349g != null) {
                this.f20413g0 = ((v) abstractActivityC2349g.q()).f20413g0;
            }
        }
        if (this.f20413g0 == -100) {
            String name = this.f20416j.getClass().getName();
            C2940i c2940i = v0;
            Integer num = (Integer) c2940i.get(name);
            if (num != null) {
                this.f20413g0 = num.intValue();
                c2940i.remove(this.f20416j.getClass().getName());
            }
        }
        if (window != null) {
            t(window);
        }
        o.r.d();
    }

    public static N.h F(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? p.b(configuration) : N.h.b(o.b(configuration.locale));
    }

    public static N.h u(Context context) {
        N.h hVar;
        N.h hVarB;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (hVar = k.f20348c) == null) {
            return null;
        }
        N.j jVar = hVar.f2966a;
        N.h hVarF = F(context.getApplicationContext().getResources().getConfiguration());
        int i3 = 0;
        if (i < 24) {
            hVarB = jVar.isEmpty() ? N.h.f2965b : N.h.b(o.b(jVar.get(0)));
        } else if (jVar.isEmpty()) {
            hVarB = N.h.f2965b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i3 < hVarF.f2966a.size() + jVar.size()) {
                Locale locale = i3 < jVar.size() ? jVar.get(i3) : hVarF.f2966a.get(i3 - jVar.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i3++;
            }
            hVarB = N.h.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return hVarB.f2966a.isEmpty() ? hVarF : hVarB;
    }

    public static Configuration y(Context context, int i, N.h hVar, Configuration configuration, boolean z6) {
        int i3 = i != 1 ? i != 2 ? z6 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (hVar != null) {
            N.j jVar = hVar.f2966a;
            if (Build.VERSION.SDK_INT >= 24) {
                p.d(configuration2, hVar);
                return configuration2;
            }
            configuration2.setLocale(jVar.get(0));
            configuration2.setLayoutDirection(jVar.get(0));
        }
        return configuration2;
    }

    public final void A(int i) {
        u uVarG = G(i);
        if (uVarG.f20375h != null) {
            Bundle bundle = new Bundle();
            uVarG.f20375h.u(bundle);
            if (bundle.size() > 0) {
                uVarG.f20382p = bundle;
            }
            uVarG.f20375h.y();
            uVarG.f20375h.clear();
        }
        uVarG.f20381o = true;
        uVarG.f20380n = true;
        if ((i == 108 || i == 0) && this.f20388F != null) {
            u uVarG2 = G(0);
            uVarG2.f20377k = false;
            N(uVarG2, null);
        }
    }

    public final void B() {
        ViewGroup viewGroup;
        if (this.f20395N) {
            return;
        }
        Context context = this.f20418k;
        int[] iArr = AbstractC2327a.f20122j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            j(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            j(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            j(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            j(10);
        }
        this.f20404W = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        C();
        this.f20420l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f20405X) {
            viewGroup = this.f20403V ? (ViewGroup) layoutInflaterFrom.inflate(com.apm.insight.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.apm.insight.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f20404W) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.apm.insight.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f20402U = false;
            this.f20401T = false;
        } else if (this.f20401T) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.apm.insight.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new m.c(context, typedValue.resourceId) : context).inflate(com.apm.insight.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC2712f0 interfaceC2712f0 = (InterfaceC2712f0) viewGroup.findViewById(com.apm.insight.R.id.decor_content_parent);
            this.f20388F = interfaceC2712f0;
            interfaceC2712f0.setWindowCallback(this.f20420l.getCallback());
            if (this.f20402U) {
                ((ActionBarOverlayLayout) this.f20388F).j(109);
            }
            if (this.f20399R) {
                ((ActionBarOverlayLayout) this.f20388F).j(2);
            }
            if (this.f20400S) {
                ((ActionBarOverlayLayout) this.f20388F).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f20401T + ", windowActionBarOverlay: " + this.f20402U + ", android:windowIsFloating: " + this.f20404W + ", windowActionModeOverlay: " + this.f20403V + ", windowNoTitle: " + this.f20405X + " }");
        }
        m mVar = new m(this);
        WeakHashMap weakHashMap = O.f3270a;
        R.F.k(viewGroup, mVar);
        if (this.f20388F == null) {
            this.f20397P = (TextView) viewGroup.findViewById(com.apm.insight.R.id.title);
        }
        boolean z6 = q1.f22618a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e6) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e6);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e7) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e7);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.apm.insight.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f20420l.findViewById(R.id.content);
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
        this.f20420l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new A0.e(27, this));
        this.f20396O = viewGroup;
        Object obj = this.f20416j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f20387E;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC2712f0 interfaceC2712f02 = this.f20388F;
            if (interfaceC2712f02 != null) {
                interfaceC2712f02.setWindowTitle(title);
            } else {
                com.bumptech.glide.d dVar = this.f20385C;
                if (dVar != null) {
                    dVar.Y(title);
                } else {
                    TextView textView = this.f20397P;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f20396O.findViewById(R.id.content);
        View decorView = this.f20420l.getDecorView();
        contentFrameLayout2.f4882g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f20395N = true;
        u uVarG = G(0);
        if (this.f20411e0 || uVarG.f20375h != null) {
            return;
        }
        I(108);
    }

    public final void C() {
        if (this.f20420l == null) {
            Object obj = this.f20416j;
            if (obj instanceof Activity) {
                t(((Activity) obj).getWindow());
            }
        }
        if (this.f20420l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Context D() {
        H();
        com.bumptech.glide.d dVar = this.f20385C;
        Context contextY = dVar != null ? dVar.y() : null;
        return contextY == null ? this.f20418k : contextY;
    }

    public final B3.u E(Context context) {
        if (this.f20419k0 == null) {
            if (V2.e.f3866f == null) {
                Context applicationContext = context.getApplicationContext();
                V2.e.f3866f = new V2.e(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f20419k0 = new s(this, V2.e.f3866f);
        }
        return this.f20419k0;
    }

    public final u G(int i) {
        u[] uVarArr = this.f20407Z;
        if (uVarArr == null || uVarArr.length <= i) {
            u[] uVarArr2 = new u[i + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.f20407Z = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i];
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u();
        uVar2.f20368a = i;
        uVar2.f20380n = false;
        uVarArr[i] = uVar2;
        return uVar2;
    }

    public final void H() {
        B();
        if (this.f20401T && this.f20385C == null) {
            Object obj = this.f20416j;
            if (obj instanceof Activity) {
                this.f20385C = new H((Activity) obj, this.f20402U);
            } else if (obj instanceof Dialog) {
                this.f20385C = new H((Dialog) obj);
            }
            com.bumptech.glide.d dVar = this.f20385C;
            if (dVar != null) {
                dVar.R(this.f20427p0);
            }
        }
    }

    public final void I(int i) {
        this.f20425n0 = (1 << i) | this.f20425n0;
        if (this.f20423m0) {
            return;
        }
        View decorView = this.f20420l.getDecorView();
        WeakHashMap weakHashMap = O.f3270a;
        decorView.postOnAnimation(this.f20426o0);
        this.f20423m0 = true;
    }

    public final int J(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f20421l0 == null) {
                            this.f20421l0 = new s(this, context);
                        }
                        return this.f20421l0.h();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return E(context).h();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean K() {
        boolean z6 = this.b0;
        this.b0 = false;
        u uVarG = G(0);
        if (!uVarG.f20379m) {
            m.a aVar = this.f20391I;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            H();
            com.bumptech.glide.d dVar = this.f20385C;
            if (dVar == null || !dVar.k()) {
                return false;
            }
        } else if (!z6) {
            x(uVarG, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0164, code lost:
    
        if (r15.f22059f.getCount() > 0) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(h.u r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.v.L(h.u, android.view.KeyEvent):void");
    }

    public final boolean M(u uVar, int i, KeyEvent keyEvent) {
        MenuC2677k menuC2677k;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f20377k || N(uVar, keyEvent)) && (menuC2677k = uVar.f20375h) != null) {
            return menuC2677k.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean N(h.u r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.v.N(h.u, android.view.KeyEvent):boolean");
    }

    public final void O() {
        if (this.f20395N) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void P() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z6 = false;
            if (this.f20431t0 != null && (G(0).f20379m || this.f20391I != null)) {
                z6 = true;
            }
            if (z6 && this.f20432u0 == null) {
                this.f20432u0 = q.b(this.f20431t0, this);
            } else {
                if (z6 || (onBackInvokedCallback = this.f20432u0) == null) {
                    return;
                }
                q.c(this.f20431t0, onBackInvokedCallback);
                this.f20432u0 = null;
            }
        }
    }

    @Override // h.k
    public final void c() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f20418k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof v) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // h.k
    public final void d() {
        if (this.f20385C != null) {
            H();
            if (this.f20385C.D()) {
                return;
            }
            I(0);
        }
    }

    @Override // n.InterfaceC2675i
    public final boolean f(MenuC2677k menuC2677k, MenuItem menuItem) {
        u uVar;
        Window.Callback callback = this.f20420l.getCallback();
        if (callback != null && !this.f20411e0) {
            MenuC2677k menuC2677kK = menuC2677k.k();
            u[] uVarArr = this.f20407Z;
            int length = uVarArr != null ? uVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    uVar = uVarArr[i];
                    if (uVar != null && uVar.f20375h == menuC2677kK) {
                        break;
                    }
                    i++;
                } else {
                    uVar = null;
                    break;
                }
            }
            if (uVar != null) {
                return callback.onMenuItemSelected(uVar.f20368a, menuItem);
            }
        }
        return false;
    }

    @Override // h.k
    public final void g() {
        String strE;
        this.f20409c0 = true;
        s(false, true);
        C();
        Object obj = this.f20416j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strE = G.c.e(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e6) {
                    throw new IllegalArgumentException(e6);
                }
            } catch (IllegalArgumentException unused) {
                strE = null;
            }
            if (strE != null) {
                com.bumptech.glide.d dVar = this.f20385C;
                if (dVar == null) {
                    this.f20427p0 = true;
                } else {
                    dVar.R(true);
                }
            }
            synchronized (k.f20353h) {
                k.i(this);
                k.f20352g.add(new WeakReference(this));
            }
        }
        this.f20412f0 = new Configuration(this.f20418k.getResources().getConfiguration());
        this.f20410d0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // h.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f20416j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = h.k.f20353h
            monitor-enter(r0)
            h.k.i(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f20423m0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f20420l
            android.view.View r0 = r0.getDecorView()
            h.l r1 = r3.f20426o0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f20411e0 = r0
            int r0 = r3.f20413g0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f20416j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            u.i r0 = h.v.v0
            java.lang.Object r1 = r3.f20416j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f20413g0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            u.i r0 = h.v.v0
            java.lang.Object r1 = r3.f20416j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            com.bumptech.glide.d r0 = r3.f20385C
            if (r0 == 0) goto L63
            r0.H()
        L63:
            h.s r0 = r3.f20419k0
            if (r0 == 0) goto L6a
            r0.e()
        L6a:
            h.s r0 = r3.f20421l0
            if (r0 == 0) goto L71
            r0.e()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.v.h():void");
    }

    @Override // h.k
    public final boolean j(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f20405X && i == 108) {
            return false;
        }
        if (this.f20401T && i == 1) {
            this.f20401T = false;
        }
        if (i == 1) {
            O();
            this.f20405X = true;
            return true;
        }
        if (i == 2) {
            O();
            this.f20399R = true;
            return true;
        }
        if (i == 5) {
            O();
            this.f20400S = true;
            return true;
        }
        if (i == 10) {
            O();
            this.f20403V = true;
            return true;
        }
        if (i == 108) {
            O();
            this.f20401T = true;
            return true;
        }
        if (i != 109) {
            return this.f20420l.requestFeature(i);
        }
        O();
        this.f20402U = true;
        return true;
    }

    @Override // h.k
    public final void l(int i) {
        B();
        ViewGroup viewGroup = (ViewGroup) this.f20396O.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f20418k).inflate(i, viewGroup);
        this.f20422m.a(this.f20420l.getCallback());
    }

    @Override // h.k
    public final void m(View view) {
        B();
        ViewGroup viewGroup = (ViewGroup) this.f20396O.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f20422m.a(this.f20420l.getCallback());
    }

    @Override // h.k
    public final void n(View view, ViewGroup.LayoutParams layoutParams) {
        B();
        ViewGroup viewGroup = (ViewGroup) this.f20396O.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f20422m.a(this.f20420l.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // n.InterfaceC2675i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(n.MenuC2677k r6) {
        /*
            r5 = this;
            o.f0 r6 = r5.f20388F
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Ld3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            o.g0 r6 = r6.f4835e
            o.i1 r6 = (o.i1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f22522a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Ld3
            androidx.appcompat.widget.ActionMenuView r6 = r6.f5005a
            if (r6 == 0) goto Ld3
            boolean r6 = r6.f4847G
            if (r6 == 0) goto Ld3
            android.content.Context r6 = r5.f20418k
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L4a
            o.f0 r6 = r5.f20388F
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            o.g0 r6 = r6.f4835e
            o.i1 r6 = (o.i1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f22522a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f5005a
            if (r6 == 0) goto Ld3
            o.l r6 = r6.f4848H
            if (r6 == 0) goto Ld3
            o.i r2 = r6.f22550J
            if (r2 != 0) goto L4a
            boolean r6 = r6.i()
            if (r6 == 0) goto Ld3
        L4a:
            android.view.Window r6 = r5.f20420l
            android.view.Window$Callback r6 = r6.getCallback()
            o.f0 r2 = r5.f20388F
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.k()
            o.g0 r2 = r2.f4835e
            o.i1 r2 = (o.i1) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f22522a
            boolean r2 = r2.o()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L8c
            o.f0 r0 = r5.f20388F
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.k()
            o.g0 r0 = r0.f4835e
            o.i1 r0 = (o.i1) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f22522a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f5005a
            if (r0 == 0) goto L7e
            o.l r0 = r0.f4848H
            if (r0 == 0) goto L7e
            boolean r0 = r0.g()
        L7e:
            boolean r0 = r5.f20411e0
            if (r0 != 0) goto Ld2
            h.u r0 = r5.G(r1)
            n.k r0 = r0.f20375h
            r6.onPanelClosed(r3, r0)
            return
        L8c:
            if (r6 == 0) goto Ld2
            boolean r2 = r5.f20411e0
            if (r2 != 0) goto Ld2
            boolean r2 = r5.f20423m0
            if (r2 == 0) goto La9
            int r2 = r5.f20425n0
            r0 = r0 & r2
            if (r0 == 0) goto La9
            android.view.Window r0 = r5.f20420l
            android.view.View r0 = r0.getDecorView()
            h.l r2 = r5.f20426o0
            r0.removeCallbacks(r2)
            r2.run()
        La9:
            h.u r0 = r5.G(r1)
            n.k r2 = r0.f20375h
            if (r2 == 0) goto Ld2
            boolean r4 = r0.f20381o
            if (r4 != 0) goto Ld2
            android.view.View r4 = r0.f20374g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Ld2
            n.k r0 = r0.f20375h
            r6.onMenuOpened(r3, r0)
            o.f0 r6 = r5.f20388F
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            o.g0 r6 = r6.f4835e
            o.i1 r6 = (o.i1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f22522a
            r6.u()
        Ld2:
            return
        Ld3:
            h.u r6 = r5.G(r1)
            r6.f20380n = r0
            r5.x(r6, r1)
            r0 = 0
            r5.L(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.v.o(n.k):void");
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
        throw new UnsupportedOperationException("Method not decompiled: h.v.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // h.k
    public final void q(CharSequence charSequence) {
        this.f20387E = charSequence;
        InterfaceC2712f0 interfaceC2712f0 = this.f20388F;
        if (interfaceC2712f0 != null) {
            interfaceC2712f0.setWindowTitle(charSequence);
            return;
        }
        com.bumptech.glide.d dVar = this.f20385C;
        if (dVar != null) {
            dVar.Y(charSequence);
            return;
        }
        TextView textView = this.f20397P;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.v.s(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(android.view.Window r8) {
        /*
            r7 = this;
            java.lang.String r0 = "AppCompat has already installed itself into the Window"
            android.view.Window r1 = r7.f20420l
            if (r1 != 0) goto L80
            android.view.Window$Callback r1 = r8.getCallback()
            boolean r2 = r1 instanceof h.r
            if (r2 != 0) goto L7a
            h.r r0 = new h.r
            r0.<init>(r7, r1)
            r7.f20422m = r0
            r8.setCallback(r0)
            android.content.Context r0 = r7.f20418k
            int[] r1 = h.v.f20383w0
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            o.r r4 = o.r.a()
            monitor-enter(r4)
            o.I0 r5 = r4.f22623a     // Catch: java.lang.Throwable -> L3c
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
            r7.f20420l = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.f20431t0
            if (r8 != 0) goto L79
            java.lang.Object r0 = r7.f20416j
            if (r8 == 0) goto L61
            android.window.OnBackInvokedCallback r1 = r7.f20432u0
            if (r1 == 0) goto L61
            h.q.c(r8, r1)
            r7.f20432u0 = r2
        L61:
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L74
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r8 = r0.getWindow()
            if (r8 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = h.q.a(r0)
            r7.f20431t0 = r8
            goto L76
        L74:
            r7.f20431t0 = r2
        L76:
            r7.P()
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
        throw new UnsupportedOperationException("Method not decompiled: h.v.t(android.view.Window):void");
    }

    public final void v(int i, u uVar, MenuC2677k menuC2677k) {
        if (menuC2677k == null) {
            if (uVar == null && i >= 0) {
                u[] uVarArr = this.f20407Z;
                if (i < uVarArr.length) {
                    uVar = uVarArr[i];
                }
            }
            if (uVar != null) {
                menuC2677k = uVar.f20375h;
            }
        }
        if ((uVar == null || uVar.f20379m) && !this.f20411e0) {
            r rVar = this.f20422m;
            Window.Callback callback = this.f20420l.getCallback();
            rVar.getClass();
            try {
                rVar.f20363e = true;
                callback.onPanelClosed(i, menuC2677k);
            } finally {
                rVar.f20363e = false;
            }
        }
    }

    public final void w(MenuC2677k menuC2677k) {
        C2723l c2723l;
        if (this.f20406Y) {
            return;
        }
        this.f20406Y = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f20388F;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((i1) actionBarOverlayLayout.f4835e).f22522a.f5005a;
        if (actionMenuView != null && (c2723l = actionMenuView.f4848H) != null) {
            c2723l.g();
            C2713g c2713g = c2723l.f22549I;
            if (c2713g != null && c2713g.b()) {
                c2713g.i.dismiss();
            }
        }
        Window.Callback callback = this.f20420l.getCallback();
        if (callback != null && !this.f20411e0) {
            callback.onPanelClosed(108, menuC2677k);
        }
        this.f20406Y = false;
    }

    public final void x(u uVar, boolean z6) {
        t tVar;
        InterfaceC2712f0 interfaceC2712f0;
        if (z6 && uVar.f20368a == 0 && (interfaceC2712f0 = this.f20388F) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC2712f0;
            actionBarOverlayLayout.k();
            if (((i1) actionBarOverlayLayout.f4835e).f22522a.o()) {
                w(uVar.f20375h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f20418k.getSystemService("window");
        if (windowManager != null && uVar.f20379m && (tVar = uVar.f20372e) != null) {
            windowManager.removeView(tVar);
            if (z6) {
                v(uVar.f20368a, uVar, null);
            }
        }
        uVar.f20377k = false;
        uVar.f20378l = false;
        uVar.f20379m = false;
        uVar.f20373f = null;
        uVar.f20380n = true;
        if (this.f20408a0 == uVar) {
            this.f20408a0 = null;
        }
        if (uVar.f20368a == 0) {
            P();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.v.z(android.view.KeyEvent):boolean");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

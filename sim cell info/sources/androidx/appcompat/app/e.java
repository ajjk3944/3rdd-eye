package androidx.appcompat.app;

import a0.a0;
import a0.e;
import a0.s;
import a0.w;
import a0.y;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.w0;
import androidx.lifecycle.d;
import f.b;
import f.f;
import java.lang.Thread;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
class e extends androidx.appcompat.app.d implements e.a, LayoutInflater.Factory2 {

    /* renamed from: b0, reason: collision with root package name */
    private static final Map<Class<?>, Integer> f374b0 = new k.a();

    /* renamed from: c0, reason: collision with root package name */
    private static final boolean f375c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final int[] f376d0;

    /* renamed from: e0, reason: collision with root package name */
    private static boolean f377e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final boolean f378f0;
    private boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    private boolean G;
    private o[] H;
    private o I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    boolean N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private l S;
    private l T;
    boolean U;
    int V;
    private final Runnable W;
    private boolean X;
    private Rect Y;
    private Rect Z;

    /* renamed from: a0, reason: collision with root package name */
    private AppCompatViewInflater f379a0;

    /* renamed from: e, reason: collision with root package name */
    final Object f380e;

    /* renamed from: f, reason: collision with root package name */
    final Context f381f;

    /* renamed from: g, reason: collision with root package name */
    Window f382g;

    /* renamed from: h, reason: collision with root package name */
    private j f383h;

    /* renamed from: i, reason: collision with root package name */
    final b.a f384i;

    /* renamed from: j, reason: collision with root package name */
    androidx.appcompat.app.a f385j;

    /* renamed from: k, reason: collision with root package name */
    MenuInflater f386k;

    /* renamed from: l, reason: collision with root package name */
    private CharSequence f387l;

    /* renamed from: m, reason: collision with root package name */
    private c0 f388m;

    /* renamed from: n, reason: collision with root package name */
    private h f389n;

    /* renamed from: o, reason: collision with root package name */
    private p f390o;

    /* renamed from: p, reason: collision with root package name */
    f.b f391p;

    /* renamed from: q, reason: collision with root package name */
    ActionBarContextView f392q;

    /* renamed from: r, reason: collision with root package name */
    PopupWindow f393r;

    /* renamed from: s, reason: collision with root package name */
    Runnable f394s;

    /* renamed from: t, reason: collision with root package name */
    w f395t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f396u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f397v;

    /* renamed from: w, reason: collision with root package name */
    private ViewGroup f398w;

    /* renamed from: x, reason: collision with root package name */
    private TextView f399x;

    /* renamed from: y, reason: collision with root package name */
    private View f400y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f401z;

    static class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f402a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f402a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!a(th)) {
                this.f402a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f402a.uncaughtException(thread, notFoundException);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if ((eVar.V & 1) != 0) {
                eVar.S(0);
            }
            e eVar2 = e.this;
            if ((eVar2.V & 4096) != 0) {
                eVar2.S(108);
            }
            e eVar3 = e.this;
            eVar3.U = false;
            eVar3.V = 0;
        }
    }

    class c implements a0.p {
        c() {
        }

        @Override // a0.p
        public a0 a(View view, a0 a0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            int iG = a0Var.g();
            int iI0 = e.this.I0(iG);
            if (iG != iI0) {
                a0Var = a0Var.j(a0Var.e(), iI0, a0Var.f(), a0Var.d());
            }
            return s.I(view, a0Var);
        }
    }

    class d implements g0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.g0.a
        public void a(Rect rect) {
            rect.top = e.this.I0(rect.top);
        }
    }

    /* renamed from: androidx.appcompat.app.e$e, reason: collision with other inner class name */
    class C0003e implements ContentFrameLayout.a {
        C0003e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            e.this.Q();
        }
    }

    class f implements Runnable {

        class a extends y {
            a() {
            }

            @Override // a0.x
            public void a(View view) {
                e.this.f392q.setAlpha(1.0f);
                e.this.f395t.f(null);
                e.this.f395t = null;
            }

            @Override // a0.y, a0.x
            public void b(View view) {
                e.this.f392q.setVisibility(0);
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.f393r.showAtLocation(eVar.f392q, 55, 0, 0);
            e.this.T();
            if (!e.this.A0()) {
                e.this.f392q.setAlpha(1.0f);
                e.this.f392q.setVisibility(0);
            } else {
                e.this.f392q.setAlpha(0.0f);
                e eVar2 = e.this;
                eVar2.f395t = s.b(eVar2.f392q).a(1.0f);
                e.this.f395t.f(new a());
            }
        }
    }

    class g extends y {
        g() {
        }

        @Override // a0.x
        public void a(View view) {
            e.this.f392q.setAlpha(1.0f);
            e.this.f395t.f(null);
            e.this.f395t = null;
        }

        @Override // a0.y, a0.x
        public void b(View view) {
            e.this.f392q.setVisibility(0);
            e.this.f392q.sendAccessibilityEvent(32);
            if (e.this.f392q.getParent() instanceof View) {
                s.N((View) e.this.f392q.getParent());
            }
        }
    }

    private final class h implements j.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
            e.this.K(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackC0 = e.this.c0();
            if (callbackC0 == null) {
                return true;
            }
            callbackC0.onMenuOpened(108, eVar);
            return true;
        }
    }

    class i implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private b.a f411a;

        class a extends y {
            a() {
            }

            @Override // a0.x
            public void a(View view) {
                e.this.f392q.setVisibility(8);
                e eVar = e.this;
                PopupWindow popupWindow = eVar.f393r;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (eVar.f392q.getParent() instanceof View) {
                    s.N((View) e.this.f392q.getParent());
                }
                e.this.f392q.removeAllViews();
                e.this.f395t.f(null);
                e.this.f395t = null;
            }
        }

        public i(b.a aVar) {
            this.f411a = aVar;
        }

        @Override // f.b.a
        public boolean a(f.b bVar, Menu menu) {
            return this.f411a.a(bVar, menu);
        }

        @Override // f.b.a
        public void b(f.b bVar) {
            this.f411a.b(bVar);
            e eVar = e.this;
            if (eVar.f393r != null) {
                eVar.f382g.getDecorView().removeCallbacks(e.this.f394s);
            }
            e eVar2 = e.this;
            if (eVar2.f392q != null) {
                eVar2.T();
                e eVar3 = e.this;
                eVar3.f395t = s.b(eVar3.f392q).a(0.0f);
                e.this.f395t.f(new a());
            }
            e eVar4 = e.this;
            b.a aVar = eVar4.f384i;
            if (aVar != null) {
                aVar.f(eVar4.f391p);
            }
            e.this.f391p = null;
        }

        @Override // f.b.a
        public boolean c(f.b bVar, MenuItem menuItem) {
            return this.f411a.c(bVar, menuItem);
        }

        @Override // f.b.a
        public boolean d(f.b bVar, Menu menu) {
            return this.f411a.d(bVar, menu);
        }
    }

    class j extends f.i {
        j(Window.Callback callback) {
            super(callback);
        }

        final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(e.this.f381f, callback);
            f.b bVarC0 = e.this.C0(aVar);
            if (bVarC0 != null) {
                return aVar.e(bVarC0);
            }
            return null;
        }

        @Override // f.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.R(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // f.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || e.this.o0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // f.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // f.i, android.view.Window.Callback
        public boolean onMenuOpened(int i2, Menu menu) {
            super.onMenuOpened(i2, menu);
            e.this.r0(i2);
            return true;
        }

        @Override // f.i, android.view.Window.Callback
        public void onPanelClosed(int i2, Menu menu) {
            super.onPanelClosed(i2, menu);
            e.this.s0(i2);
        }

        @Override // f.i, android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i2 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.a0(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i2, view, menu);
            if (eVar != null) {
                eVar.a0(false);
            }
            return zOnPreparePanel;
        }

        @Override // f.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            androidx.appcompat.view.menu.e eVar;
            o oVarA0 = e.this.a0(0, true);
            if (oVarA0 == null || (eVar = oVarA0.f432j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i2);
            }
        }

        @Override // f.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return e.this.j0() ? b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // f.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            return (e.this.j0() && i2 == 0) ? b(callback) : super.onWindowStartingActionMode(callback, i2);
        }
    }

    private class k extends l {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f415c;

        k(Context context) {
            super();
            this.f415c = (PowerManager) context.getSystemService("power");
        }

        @Override // androidx.appcompat.app.e.l
        IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.e.l
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f415c.isPowerSaveMode()) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.e.l
        public void d() {
            e.this.E();
        }
    }

    abstract class l {

        /* renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f417a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                l.this.d();
            }
        }

        l() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f417a;
            if (broadcastReceiver != null) {
                try {
                    e.this.f381f.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f417a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f417a == null) {
                this.f417a = new a();
            }
            e.this.f381f.registerReceiver(this.f417a, intentFilterB);
        }
    }

    private class m extends l {

        /* renamed from: c, reason: collision with root package name */
        private final androidx.appcompat.app.h f420c;

        m(androidx.appcompat.app.h hVar) {
            super();
            this.f420c = hVar;
        }

        @Override // androidx.appcompat.app.e.l
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.e.l
        public int c() {
            return this.f420c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.e.l
        public void d() {
            e.this.E();
        }
    }

    private class n extends ContentFrameLayout {
        public n(Context context) {
            super(context);
        }

        private boolean c(int i2, int i3) {
            return i2 < -5 || i3 < -5 || i2 > getWidth() + 5 || i3 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.R(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            e.this.M(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(c.a.d(getContext(), i2));
        }
    }

    protected static final class o {

        /* renamed from: a, reason: collision with root package name */
        int f423a;

        /* renamed from: b, reason: collision with root package name */
        int f424b;

        /* renamed from: c, reason: collision with root package name */
        int f425c;

        /* renamed from: d, reason: collision with root package name */
        int f426d;

        /* renamed from: e, reason: collision with root package name */
        int f427e;

        /* renamed from: f, reason: collision with root package name */
        int f428f;

        /* renamed from: g, reason: collision with root package name */
        ViewGroup f429g;

        /* renamed from: h, reason: collision with root package name */
        View f430h;

        /* renamed from: i, reason: collision with root package name */
        View f431i;

        /* renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.e f432j;

        /* renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.c f433k;

        /* renamed from: l, reason: collision with root package name */
        Context f434l;

        /* renamed from: m, reason: collision with root package name */
        boolean f435m;

        /* renamed from: n, reason: collision with root package name */
        boolean f436n;

        /* renamed from: o, reason: collision with root package name */
        boolean f437o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f438p;

        /* renamed from: q, reason: collision with root package name */
        boolean f439q = false;

        /* renamed from: r, reason: collision with root package name */
        boolean f440r;

        /* renamed from: s, reason: collision with root package name */
        Bundle f441s;

        o(int i2) {
            this.f423a = i2;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f432j == null) {
                return null;
            }
            if (this.f433k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f434l, a.g.f107j);
                this.f433k = cVar;
                cVar.d(aVar);
                this.f432j.b(this.f433k);
            }
            return this.f433k.e(this.f429g);
        }

        public boolean b() {
            if (this.f430h == null) {
                return false;
            }
            return this.f431i != null || this.f433k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f432j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.O(this.f433k);
            }
            this.f432j = eVar;
            if (eVar == null || (cVar = this.f433k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(a.a.f0a, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                themeNewTheme.applyStyle(i2, true);
            }
            themeNewTheme.resolveAttribute(a.a.D, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 == 0) {
                i3 = a.i.f131b;
            }
            themeNewTheme.applyStyle(i3, true);
            f.d dVar = new f.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f434l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(a.j.z0);
            this.f424b = typedArrayObtainStyledAttributes.getResourceId(a.j.C0, 0);
            this.f428f = typedArrayObtainStyledAttributes.getResourceId(a.j.B0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final class p implements j.a {
        p() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
            androidx.appcompat.view.menu.e eVarD = eVar.D();
            boolean z3 = eVarD != eVar;
            e eVar2 = e.this;
            if (z3) {
                eVar = eVarD;
            }
            o oVarW = eVar2.W(eVar);
            if (oVarW != null) {
                if (!z3) {
                    e.this.N(oVarW, z2);
                } else {
                    e.this.J(oVarW.f423a, oVarW, eVarD);
                    e.this.N(oVarW, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackC0;
            if (eVar != null) {
                return true;
            }
            e eVar2 = e.this;
            if (!eVar2.B || (callbackC0 = eVar2.c0()) == null || e.this.N) {
                return true;
            }
            callbackC0.onMenuOpened(108, eVar);
            return true;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        boolean z3 = i2 < 21;
        f375c0 = z3;
        f376d0 = new int[]{R.attr.windowBackground};
        if (i2 >= 21 && i2 <= 25) {
            z2 = true;
        }
        f378f0 = z2;
        if (!z3 || f377e0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        f377e0 = true;
    }

    e(Activity activity, b.a aVar) {
        this(activity, null, aVar, activity);
    }

    e(Dialog dialog, b.a aVar) {
        this(dialog.getContext(), dialog.getWindow(), aVar, dialog);
    }

    private e(Context context, Window window, b.a aVar, Object obj) {
        Map<Class<?>, Integer> map;
        Integer num;
        androidx.appcompat.app.c cVarF0;
        this.f395t = null;
        this.f396u = true;
        this.O = -100;
        this.W = new b();
        this.f381f = context;
        this.f384i = aVar;
        this.f380e = obj;
        if (this.O == -100 && (obj instanceof Dialog) && (cVarF0 = F0()) != null) {
            this.O = cVarF0.w().i();
        }
        if (this.O == -100 && (num = (map = f374b0).get(obj.getClass())) != null) {
            this.O = num.intValue();
            map.remove(obj.getClass());
        }
        if (window != null) {
            H(window);
        }
        androidx.appcompat.widget.j.h();
    }

    private boolean B0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f382g.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || s.C((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private void E0() {
        if (this.f397v) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private boolean F(boolean z2) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        if (this.N) {
            return false;
        }
        int I = I();
        boolean zG0 = G0(k0(I), z2);
        if (I == 0) {
            Z().e();
        } else {
            l lVar = this.S;
            if (lVar != null) {
                lVar.a();
            }
        }
        if (I == 3) {
            Y().e();
        } else {
            l lVar2 = this.T;
            if (lVar2 != null) {
                lVar2.a();
            }
        }
        return zG0;
    }

    private androidx.appcompat.app.c F0() {
        for (Context baseContext = this.f381f; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void G() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f398w.findViewById(R.id.content);
        View decorView = this.f382g.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f381f.obtainStyledAttributes(a.j.z0);
        typedArrayObtainStyledAttributes.getValue(a.j.L0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(a.j.M0, contentFrameLayout.getMinWidthMinor());
        int i2 = a.j.J0;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = a.j.K0;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            typedArrayObtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = a.j.H0;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            typedArrayObtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = a.j.I0;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            typedArrayObtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private boolean G0(int i2, boolean z2) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        int i3 = this.f381f.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z3 = true;
        int i4 = i2 != 1 ? i2 != 2 ? i3 : 32 : 16;
        boolean zI0 = i0();
        boolean z4 = false;
        if ((f378f0 || i4 != i3) && !zI0 && Build.VERSION.SDK_INT >= 17 && !this.K && (this.f380e instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & (-49)) | i4;
            try {
                ((ContextThemeWrapper) this.f380e).applyOverrideConfiguration(configuration);
                z4 = true;
            } catch (IllegalStateException e2) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e2);
            }
        }
        int i5 = this.f381f.getResources().getConfiguration().uiMode & 48;
        if (!z4 && i5 != i4 && z2 && !zI0 && this.K && (Build.VERSION.SDK_INT >= 17 || this.L)) {
            Object obj = this.f380e;
            if (obj instanceof Activity) {
                q.a.g((Activity) obj);
                z4 = true;
            }
        }
        if (z4 || i5 == i4) {
            z3 = z4;
        } else {
            H0(i4, zI0);
        }
        if (z3) {
            Object obj2 = this.f380e;
            if (obj2 instanceof androidx.appcompat.app.c) {
                ((androidx.appcompat.app.c) obj2).z(i2);
            }
        }
        return z3;
    }

    private void H(Window window) {
        if (this.f382g != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof j) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        j jVar = new j(callback);
        this.f383h = jVar;
        window.setCallback(jVar);
        w0 w0VarS = w0.s(this.f381f, null, f376d0);
        Drawable drawableG = w0VarS.g(0);
        if (drawableG != null) {
            window.setBackgroundDrawable(drawableG);
        }
        w0VarS.u();
        this.f382g = window;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void H0(int i2, boolean z2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Resources resources = this.f381f.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration, null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            androidx.appcompat.app.f.a(resources);
        }
        int i4 = this.P;
        if (i4 != 0) {
            this.f381f.setTheme(i4);
            if (i3 >= 23) {
                this.f381f.getTheme().applyStyle(this.P, true);
            }
        }
        if (z2) {
            Object obj = this.f380e;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.g) {
                    if (!((androidx.lifecycle.g) activity).a().b().a(d.b.STARTED)) {
                        return;
                    }
                } else if (!this.M) {
                    return;
                }
                activity.onConfigurationChanged(configuration);
            }
        }
    }

    private int I() {
        int i2 = this.O;
        return i2 != -100 ? i2 : androidx.appcompat.app.d.h();
    }

    private void L() {
        l lVar = this.S;
        if (lVar != null) {
            lVar.a();
        }
        l lVar2 = this.T;
        if (lVar2 != null) {
            lVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ViewGroup O() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f381f.obtainStyledAttributes(a.j.z0);
        int i2 = a.j.E0;
        if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(a.j.N0, false)) {
            y(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i2, false)) {
            y(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(a.j.F0, false)) {
            y(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(a.j.G0, false)) {
            y(10);
        }
        this.E = typedArrayObtainStyledAttributes.getBoolean(a.j.A0, false);
        typedArrayObtainStyledAttributes.recycle();
        V();
        this.f382g.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f381f);
        if (this.F) {
            ViewGroup viewGroup2 = (ViewGroup) layoutInflaterFrom.inflate(this.D ? a.g.f112o : a.g.f111n, (ViewGroup) null);
            if (Build.VERSION.SDK_INT >= 21) {
                s.X(viewGroup2, new c());
                viewGroup = viewGroup2;
            } else {
                ((g0) viewGroup2).setOnFitSystemWindowsListener(new d());
                viewGroup = viewGroup2;
            }
        } else if (this.E) {
            ViewGroup viewGroup3 = (ViewGroup) layoutInflaterFrom.inflate(a.g.f103f, (ViewGroup) null);
            this.C = false;
            this.B = false;
            viewGroup = viewGroup3;
        } else if (this.B) {
            TypedValue typedValue = new TypedValue();
            this.f381f.getTheme().resolveAttribute(a.a.f5f, typedValue, true);
            ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new f.d(this.f381f, typedValue.resourceId) : this.f381f).inflate(a.g.f113p, (ViewGroup) null);
            c0 c0Var = (c0) viewGroup4.findViewById(a.f.f87p);
            this.f388m = c0Var;
            c0Var.setWindowCallback(c0());
            if (this.C) {
                this.f388m.h(109);
            }
            if (this.f401z) {
                this.f388m.h(2);
            }
            viewGroup = viewGroup4;
            if (this.A) {
                this.f388m.h(5);
                viewGroup = viewGroup4;
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.B + ", windowActionBarOverlay: " + this.C + ", android:windowIsFloating: " + this.E + ", windowActionModeOverlay: " + this.D + ", windowNoTitle: " + this.F + " }");
        }
        if (this.f388m == null) {
            this.f399x = (TextView) viewGroup.findViewById(a.f.M);
        }
        c1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(a.f.f73b);
        ViewGroup viewGroup5 = (ViewGroup) this.f382g.findViewById(R.id.content);
        if (viewGroup5 != null) {
            while (viewGroup5.getChildCount() > 0) {
                View childAt = viewGroup5.getChildAt(0);
                viewGroup5.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup5.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup5 instanceof FrameLayout) {
                ((FrameLayout) viewGroup5).setForeground(null);
            }
        }
        this.f382g.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0003e());
        return viewGroup;
    }

    private void U() {
        if (this.f397v) {
            return;
        }
        this.f398w = O();
        CharSequence charSequenceB0 = b0();
        if (!TextUtils.isEmpty(charSequenceB0)) {
            c0 c0Var = this.f388m;
            if (c0Var != null) {
                c0Var.setWindowTitle(charSequenceB0);
            } else if (v0() != null) {
                v0().u(charSequenceB0);
            } else {
                TextView textView = this.f399x;
                if (textView != null) {
                    textView.setText(charSequenceB0);
                }
            }
        }
        G();
        t0(this.f398w);
        this.f397v = true;
        o oVarA0 = a0(0, false);
        if (this.N) {
            return;
        }
        if (oVarA0 == null || oVarA0.f432j == null) {
            h0(108);
        }
    }

    private void V() {
        if (this.f382g == null) {
            Object obj = this.f380e;
            if (obj instanceof Activity) {
                H(((Activity) obj).getWindow());
            }
        }
        if (this.f382g == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private l Y() {
        if (this.T == null) {
            this.T = new k(this.f381f);
        }
        return this.T;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d0() {
        /*
            r3 = this;
            r3.U()
            boolean r0 = r3.B
            if (r0 == 0) goto L37
            androidx.appcompat.app.a r0 = r3.f385j
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f380e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            androidx.appcompat.app.i r0 = new androidx.appcompat.app.i
            java.lang.Object r1 = r3.f380e
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.C
            r0.<init>(r1, r2)
        L1d:
            r3.f385j = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            androidx.appcompat.app.i r0 = new androidx.appcompat.app.i
            java.lang.Object r1 = r3.f380e
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            androidx.appcompat.app.a r0 = r3.f385j
            if (r0 == 0) goto L37
            boolean r1 = r3.X
            r0.r(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.d0():void");
    }

    private boolean e0(o oVar) {
        View view = oVar.f431i;
        if (view != null) {
            oVar.f430h = view;
            return true;
        }
        if (oVar.f432j == null) {
            return false;
        }
        if (this.f390o == null) {
            this.f390o = new p();
        }
        View view2 = (View) oVar.a(this.f390o);
        oVar.f430h = view2;
        return view2 != null;
    }

    private boolean f0(o oVar) {
        oVar.d(X());
        oVar.f429g = new n(oVar.f434l);
        oVar.f425c = 81;
        return true;
    }

    private boolean g0(o oVar) {
        Context context = this.f381f;
        int i2 = oVar.f423a;
        if ((i2 == 0 || i2 == 108) && this.f388m != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(a.a.f5f, typedValue, true);
            Resources.Theme themeNewTheme = null;
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(a.a.f6g, typedValue, true);
            } else {
                theme.resolveAttribute(a.a.f6g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                f.d dVar = new f.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.R(this);
        oVar.c(eVar);
        return true;
    }

    private void h0(int i2) {
        this.V = (1 << i2) | this.V;
        if (this.U) {
            return;
        }
        s.L(this.f382g.getDecorView(), this.W);
        this.U = true;
    }

    private boolean i0() throws PackageManager.NameNotFoundException {
        if (!this.R && (this.f380e instanceof Activity)) {
            PackageManager packageManager = this.f381f.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f381f, this.f380e.getClass()), 0);
                this.Q = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.Q = false;
            }
        }
        this.R = true;
        return this.Q;
    }

    private boolean n0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        o oVarA0 = a0(i2, true);
        if (oVarA0.f437o) {
            return false;
        }
        return x0(oVarA0, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean q0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            f.b r0 = r4.f391p
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.e$o r2 = r4.a0(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.c0 r5 = r4.f388m
            if (r5 == 0) goto L43
            boolean r5 = r5.f()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f381f
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.c0 r5 = r4.f388m
            boolean r5 = r5.e()
            if (r5 != 0) goto L3c
            boolean r5 = r4.N
            if (r5 != 0) goto L62
            boolean r5 = r4.x0(r2, r6)
            if (r5 == 0) goto L62
            androidx.appcompat.widget.c0 r5 = r4.f388m
            boolean r0 = r5.a()
            goto L68
        L3c:
            androidx.appcompat.widget.c0 r5 = r4.f388m
            boolean r0 = r5.g()
            goto L68
        L43:
            boolean r5 = r2.f437o
            if (r5 != 0) goto L64
            boolean r3 = r2.f436n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f435m
            if (r5 == 0) goto L62
            boolean r5 = r2.f440r
            if (r5 == 0) goto L5b
            r2.f435m = r1
            boolean r5 = r4.x0(r2, r6)
            goto L5c
        L5b:
            r5 = 1
        L5c:
            if (r5 == 0) goto L62
            r4.u0(r2, r6)
            goto L68
        L62:
            r0 = 0
            goto L68
        L64:
            r4.N(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L81
            android.content.Context r5 = r4.f381f
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7a
            r5.playSoundEffect(r1)
            goto L81
        L7a:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.q0(int, android.view.KeyEvent):boolean");
    }

    private void u0(o oVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (oVar.f437o || this.N) {
            return;
        }
        if (oVar.f423a == 0) {
            if ((this.f381f.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackC0 = c0();
        if (callbackC0 != null && !callbackC0.onMenuOpened(oVar.f423a, oVar.f432j)) {
            N(oVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f381f.getSystemService("window");
        if (windowManager != null && x0(oVar, keyEvent)) {
            ViewGroup viewGroup = oVar.f429g;
            if (viewGroup != null && !oVar.f439q) {
                View view = oVar.f431i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                }
                oVar.f436n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, oVar.f426d, oVar.f427e, 1002, 8519680, -3);
                layoutParams2.gravity = oVar.f425c;
                layoutParams2.windowAnimations = oVar.f428f;
                windowManager.addView(oVar.f429g, layoutParams2);
                oVar.f437o = true;
            }
            if (viewGroup == null) {
                if (!f0(oVar) || oVar.f429g == null) {
                    return;
                }
            } else if (oVar.f439q && viewGroup.getChildCount() > 0) {
                oVar.f429g.removeAllViews();
            }
            if (!e0(oVar) || !oVar.b()) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = oVar.f430h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            oVar.f429g.setBackgroundResource(oVar.f424b);
            ViewParent parent = oVar.f430h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(oVar.f430h);
            }
            oVar.f429g.addView(oVar.f430h, layoutParams3);
            if (!oVar.f430h.hasFocus()) {
                oVar.f430h.requestFocus();
            }
            i2 = -2;
            oVar.f436n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i2, -2, oVar.f426d, oVar.f427e, 1002, 8519680, -3);
            layoutParams22.gravity = oVar.f425c;
            layoutParams22.windowAnimations = oVar.f428f;
            windowManager.addView(oVar.f429g, layoutParams22);
            oVar.f437o = true;
        }
    }

    private boolean w0(o oVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((oVar.f435m || x0(oVar, keyEvent)) && (eVar = oVar.f432j) != null) {
            zPerformShortcut = eVar.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 & 1) == 0 && this.f388m == null) {
            N(oVar, true);
        }
        return zPerformShortcut;
    }

    private boolean x0(o oVar, KeyEvent keyEvent) {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        if (this.N) {
            return false;
        }
        if (oVar.f435m) {
            return true;
        }
        o oVar2 = this.I;
        if (oVar2 != null && oVar2 != oVar) {
            N(oVar2, false);
        }
        Window.Callback callbackC0 = c0();
        if (callbackC0 != null) {
            oVar.f431i = callbackC0.onCreatePanelView(oVar.f423a);
        }
        int i2 = oVar.f423a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (c0Var3 = this.f388m) != null) {
            c0Var3.d();
        }
        if (oVar.f431i == null) {
            if (z2) {
                v0();
            }
            androidx.appcompat.view.menu.e eVar = oVar.f432j;
            if (eVar == null || oVar.f440r) {
                if (eVar == null && (!g0(oVar) || oVar.f432j == null)) {
                    return false;
                }
                if (z2 && this.f388m != null) {
                    if (this.f389n == null) {
                        this.f389n = new h();
                    }
                    this.f388m.b(oVar.f432j, this.f389n);
                }
                oVar.f432j.d0();
                if (!callbackC0.onCreatePanelMenu(oVar.f423a, oVar.f432j)) {
                    oVar.c(null);
                    if (z2 && (c0Var = this.f388m) != null) {
                        c0Var.b(null, this.f389n);
                    }
                    return false;
                }
                oVar.f440r = false;
            }
            oVar.f432j.d0();
            Bundle bundle = oVar.f441s;
            if (bundle != null) {
                oVar.f432j.P(bundle);
                oVar.f441s = null;
            }
            if (!callbackC0.onPreparePanel(0, oVar.f431i, oVar.f432j)) {
                if (z2 && (c0Var2 = this.f388m) != null) {
                    c0Var2.b(null, this.f389n);
                }
                oVar.f432j.c0();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            oVar.f438p = z3;
            oVar.f432j.setQwertyMode(z3);
            oVar.f432j.c0();
        }
        oVar.f435m = true;
        oVar.f436n = false;
        this.I = oVar;
        return true;
    }

    private void y0(androidx.appcompat.view.menu.e eVar, boolean z2) {
        c0 c0Var = this.f388m;
        if (c0Var == null || !c0Var.f() || (ViewConfiguration.get(this.f381f).hasPermanentMenuKey() && !this.f388m.c())) {
            o oVarA0 = a0(0, true);
            oVarA0.f439q = true;
            N(oVarA0, false);
            u0(oVarA0, null);
            return;
        }
        Window.Callback callbackC0 = c0();
        if (this.f388m.e() && z2) {
            this.f388m.g();
            if (this.N) {
                return;
            }
            callbackC0.onPanelClosed(108, a0(0, true).f432j);
            return;
        }
        if (callbackC0 == null || this.N) {
            return;
        }
        if (this.U && (this.V & 1) != 0) {
            this.f382g.getDecorView().removeCallbacks(this.W);
            this.W.run();
        }
        o oVarA02 = a0(0, true);
        androidx.appcompat.view.menu.e eVar2 = oVarA02.f432j;
        if (eVar2 == null || oVarA02.f440r || !callbackC0.onPreparePanel(0, oVarA02.f431i, eVar2)) {
            return;
        }
        callbackC0.onMenuOpened(108, oVarA02.f432j);
        this.f388m.a();
    }

    private int z0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i2 != 9) {
            return i2;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    @Override // androidx.appcompat.app.d
    public void A(View view) {
        U();
        ViewGroup viewGroup = (ViewGroup) this.f398w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f383h.a().onContentChanged();
    }

    final boolean A0() {
        ViewGroup viewGroup;
        return this.f397v && (viewGroup = this.f398w) != null && s.D(viewGroup);
    }

    @Override // androidx.appcompat.app.d
    public void B(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        ViewGroup viewGroup = (ViewGroup) this.f398w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f383h.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.d
    public void C(int i2) {
        this.P = i2;
    }

    public f.b C0(b.a aVar) {
        b.a aVar2;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        f.b bVar = this.f391p;
        if (bVar != null) {
            bVar.c();
        }
        i iVar = new i(aVar);
        androidx.appcompat.app.a aVarK = k();
        if (aVarK != null) {
            f.b bVarV = aVarK.v(iVar);
            this.f391p = bVarV;
            if (bVarV != null && (aVar2 = this.f384i) != null) {
                aVar2.h(bVarV);
            }
        }
        if (this.f391p == null) {
            this.f391p = D0(iVar);
        }
        return this.f391p;
    }

    @Override // androidx.appcompat.app.d
    public final void D(CharSequence charSequence) {
        this.f387l = charSequence;
        c0 c0Var = this.f388m;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
            return;
        }
        if (v0() != null) {
            v0().u(charSequence);
            return;
        }
        TextView textView = this.f399x;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    f.b D0(b.a aVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        f.b bVarG;
        Context dVar;
        b.a aVar2;
        T();
        f.b bVar = this.f391p;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        b.a aVar3 = this.f384i;
        if (aVar3 == null || this.N) {
            bVarG = null;
        } else {
            try {
                bVarG = aVar3.g(aVar);
            } catch (AbstractMethodError unused) {
            }
        }
        if (bVarG != null) {
            this.f391p = bVarG;
        } else {
            if (this.f392q == null) {
                if (this.E) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f381f.getTheme();
                    theme.resolveAttribute(a.a.f5f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f381f.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new f.d(this.f381f, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f381f;
                    }
                    this.f392q = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, a.a.f8i);
                    this.f393r = popupWindow;
                    androidx.core.widget.h.b(popupWindow, 2);
                    this.f393r.setContentView(this.f392q);
                    this.f393r.setWidth(-1);
                    dVar.getTheme().resolveAttribute(a.a.f1b, typedValue, true);
                    this.f392q.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f393r.setHeight(-2);
                    this.f394s = new f();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f398w.findViewById(a.f.f79h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(X()));
                        this.f392q = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f392q != null) {
                T();
                this.f392q.k();
                f.e eVar = new f.e(this.f392q.getContext(), this.f392q, aVar, this.f393r == null);
                if (aVar.a(eVar, eVar.e())) {
                    eVar.k();
                    this.f392q.h(eVar);
                    this.f391p = eVar;
                    if (A0()) {
                        this.f392q.setAlpha(0.0f);
                        w wVarA = s.b(this.f392q).a(1.0f);
                        this.f395t = wVarA;
                        wVarA.f(new g());
                    } else {
                        this.f392q.setAlpha(1.0f);
                        this.f392q.setVisibility(0);
                        this.f392q.sendAccessibilityEvent(32);
                        if (this.f392q.getParent() instanceof View) {
                            s.N((View) this.f392q.getParent());
                        }
                    }
                    if (this.f393r != null) {
                        this.f382g.getDecorView().post(this.f394s);
                    }
                } else {
                    this.f391p = null;
                }
            }
        }
        f.b bVar2 = this.f391p;
        if (bVar2 != null && (aVar2 = this.f384i) != null) {
            aVar2.h(bVar2);
        }
        return this.f391p;
    }

    public boolean E() {
        return F(true);
    }

    int I0(int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z2;
        boolean z3;
        ActionBarContextView actionBarContextView = this.f392q;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f392q.getLayoutParams();
            if (this.f392q.isShown()) {
                if (this.Y == null) {
                    this.Y = new Rect();
                    this.Z = new Rect();
                }
                Rect rect = this.Y;
                Rect rect2 = this.Z;
                rect.set(0, i2, 0, 0);
                c1.a(this.f398w, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.f400y;
                    if (view == null) {
                        View view2 = new View(this.f381f);
                        this.f400y = view2;
                        view2.setBackgroundColor(this.f381f.getResources().getColor(a.c.f27a));
                        this.f398w.addView(this.f400y, -1, new ViewGroup.LayoutParams(-1, i2));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.f400y.setLayoutParams(layoutParams);
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = this.f400y != null;
                if (!this.D && z) {
                    i2 = 0;
                }
                boolean z4 = z;
                z = z3;
                z2 = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z = false;
            }
            if (z) {
                this.f392q.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.f400y;
        if (view3 != null) {
            view3.setVisibility(z2 ? 0 : 8);
        }
        return i2;
    }

    void J(int i2, o oVar, Menu menu) {
        if (menu == null) {
            if (oVar == null && i2 >= 0) {
                o[] oVarArr = this.H;
                if (i2 < oVarArr.length) {
                    oVar = oVarArr[i2];
                }
            }
            if (oVar != null) {
                menu = oVar.f432j;
            }
        }
        if ((oVar == null || oVar.f437o) && !this.N) {
            this.f383h.a().onPanelClosed(i2, menu);
        }
    }

    void K(androidx.appcompat.view.menu.e eVar) {
        if (this.G) {
            return;
        }
        this.G = true;
        this.f388m.j();
        Window.Callback callbackC0 = c0();
        if (callbackC0 != null && !this.N) {
            callbackC0.onPanelClosed(108, eVar);
        }
        this.G = false;
    }

    void M(int i2) {
        N(a0(i2, true), true);
    }

    void N(o oVar, boolean z2) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (z2 && oVar.f423a == 0 && (c0Var = this.f388m) != null && c0Var.e()) {
            K(oVar.f432j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f381f.getSystemService("window");
        if (windowManager != null && oVar.f437o && (viewGroup = oVar.f429g) != null) {
            windowManager.removeView(viewGroup);
            if (z2) {
                J(oVar.f423a, oVar, null);
            }
        }
        oVar.f435m = false;
        oVar.f436n = false;
        oVar.f437o = false;
        oVar.f430h = null;
        oVar.f439q = true;
        if (this.I == oVar) {
            this.I = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View P(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        AppCompatViewInflater appCompatViewInflater;
        boolean zB0 = false;
        if (this.f379a0 == null) {
            String string = this.f381f.obtainStyledAttributes(a.j.z0).getString(a.j.D0);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.f379a0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.f379a0 = appCompatViewInflater;
        }
        boolean z3 = f375c0;
        if (z3) {
            if (!(attributeSet instanceof XmlPullParser)) {
                zB0 = B0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                zB0 = true;
            }
            z2 = zB0;
        } else {
            z2 = false;
        }
        return this.f379a0.q(view, str, context, attributeSet, z2, z3, true, b1.b());
    }

    void Q() {
        androidx.appcompat.view.menu.e eVar;
        c0 c0Var = this.f388m;
        if (c0Var != null) {
            c0Var.j();
        }
        if (this.f393r != null) {
            this.f382g.getDecorView().removeCallbacks(this.f394s);
            if (this.f393r.isShowing()) {
                try {
                    this.f393r.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f393r = null;
        }
        T();
        o oVarA0 = a0(0, false);
        if (oVarA0 == null || (eVar = oVarA0.f432j) == null) {
            return;
        }
        eVar.close();
    }

    boolean R(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f380e;
        if (((obj instanceof e.a) || (obj instanceof b.b)) && (decorView = this.f382g.getDecorView()) != null && a0.e.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f383h.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m0(keyCode, keyEvent) : p0(keyCode, keyEvent);
    }

    void S(int i2) {
        o oVarA0;
        o oVarA02 = a0(i2, true);
        if (oVarA02.f432j != null) {
            Bundle bundle = new Bundle();
            oVarA02.f432j.Q(bundle);
            if (bundle.size() > 0) {
                oVarA02.f441s = bundle;
            }
            oVarA02.f432j.d0();
            oVarA02.f432j.clear();
        }
        oVarA02.f440r = true;
        oVarA02.f439q = true;
        if ((i2 != 108 && i2 != 0) || this.f388m == null || (oVarA0 = a0(0, false)) == null) {
            return;
        }
        oVarA0.f435m = false;
        x0(oVarA0, null);
    }

    void T() {
        w wVar = this.f395t;
        if (wVar != null) {
            wVar.b();
        }
    }

    o W(Menu menu) {
        o[] oVarArr = this.H;
        int length = oVarArr != null ? oVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            o oVar = oVarArr[i2];
            if (oVar != null && oVar.f432j == menu) {
                return oVar;
            }
        }
        return null;
    }

    final Context X() {
        androidx.appcompat.app.a aVarK = k();
        Context contextK = aVarK != null ? aVarK.k() : null;
        return contextK == null ? this.f381f : contextK;
    }

    final l Z() {
        if (this.S == null) {
            this.S = new m(androidx.appcompat.app.h.a(this.f381f));
        }
        return this.S;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void a(androidx.appcompat.view.menu.e eVar) {
        y0(eVar, true);
    }

    protected o a0(int i2, boolean z2) {
        o[] oVarArr = this.H;
        if (oVarArr == null || oVarArr.length <= i2) {
            o[] oVarArr2 = new o[i2 + 1];
            if (oVarArr != null) {
                System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr.length);
            }
            this.H = oVarArr2;
            oVarArr = oVarArr2;
        }
        o oVar = oVarArr[i2];
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(i2);
        oVarArr[i2] = oVar2;
        return oVar2;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean b(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        o oVarW;
        Window.Callback callbackC0 = c0();
        if (callbackC0 == null || this.N || (oVarW = W(eVar.D())) == null) {
            return false;
        }
        return callbackC0.onMenuItemSelected(oVarW.f423a, menuItem);
    }

    final CharSequence b0() {
        Object obj = this.f380e;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f387l;
    }

    @Override // androidx.appcompat.app.d
    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        ((ViewGroup) this.f398w.findViewById(R.id.content)).addView(view, layoutParams);
        this.f383h.a().onContentChanged();
    }

    final Window.Callback c0() {
        return this.f382g.getCallback();
    }

    @Override // androidx.appcompat.app.d
    public void d(Context context) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        F(false);
        this.K = true;
    }

    @Override // androidx.appcompat.app.d
    public <T extends View> T g(int i2) {
        U();
        return (T) this.f382g.findViewById(i2);
    }

    @Override // androidx.appcompat.app.d
    public int i() {
        return this.O;
    }

    @Override // androidx.appcompat.app.d
    public MenuInflater j() {
        if (this.f386k == null) {
            d0();
            androidx.appcompat.app.a aVar = this.f385j;
            this.f386k = new f.g(aVar != null ? aVar.k() : this.f381f);
        }
        return this.f386k;
    }

    public boolean j0() {
        return this.f396u;
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.app.a k() {
        d0();
        return this.f385j;
    }

    int k0(int i2) {
        l lVarZ;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    lVarZ = Y();
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f381f.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    return -1;
                }
                lVarZ = Z();
            }
            return lVarZ.c();
        }
        return i2;
    }

    @Override // androidx.appcompat.app.d
    public void l() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f381f);
        if (layoutInflaterFrom.getFactory() == null) {
            a0.f.b(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof e) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    boolean l0() {
        f.b bVar = this.f391p;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a aVarK = k();
        return aVarK != null && aVarK.h();
    }

    @Override // androidx.appcompat.app.d
    public void m() {
        androidx.appcompat.app.a aVarK = k();
        if (aVarK == null || !aVarK.l()) {
            h0(0);
        }
    }

    boolean m0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.J = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            n0(0, keyEvent);
            return true;
        }
        return false;
    }

    boolean o0(int i2, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVarK = k();
        if (aVarK != null && aVarK.o(i2, keyEvent)) {
            return true;
        }
        o oVar = this.I;
        if (oVar != null && w0(oVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            o oVar2 = this.I;
            if (oVar2 != null) {
                oVar2.f436n = true;
            }
            return true;
        }
        if (this.I == null) {
            o oVarA0 = a0(0, true);
            x0(oVarA0, keyEvent);
            boolean zW0 = w0(oVarA0, keyEvent.getKeyCode(), keyEvent, 1);
            oVarA0.f435m = false;
            if (zW0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return P(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.d
    public void p(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        androidx.appcompat.app.a aVarK;
        if (this.B && this.f397v && (aVarK = k()) != null) {
            aVarK.m(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.f381f);
        F(false);
    }

    boolean p0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z2 = this.J;
            this.J = false;
            o oVarA0 = a0(0, false);
            if (oVarA0 != null && oVarA0.f437o) {
                if (!z2) {
                    N(oVarA0, true);
                }
                return true;
            }
            if (l0()) {
                return true;
            }
        } else if (i2 == 82) {
            q0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.d
    public void q(Bundle bundle) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        this.K = true;
        F(false);
        V();
        Object obj = this.f380e;
        if (obj instanceof Activity) {
            String strC = null;
            try {
                strC = q.e.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (strC != null) {
                androidx.appcompat.app.a aVarV0 = v0();
                if (aVarV0 == null) {
                    this.X = true;
                } else {
                    aVarV0.r(true);
                }
            }
        }
        this.L = true;
    }

    @Override // androidx.appcompat.app.d
    public void r() {
        androidx.appcompat.app.d.o(this);
        if (this.U) {
            this.f382g.getDecorView().removeCallbacks(this.W);
        }
        this.M = false;
        this.N = true;
        androidx.appcompat.app.a aVar = this.f385j;
        if (aVar != null) {
            aVar.n();
        }
        L();
    }

    void r0(int i2) {
        androidx.appcompat.app.a aVarK;
        if (i2 != 108 || (aVarK = k()) == null) {
            return;
        }
        aVarK.i(true);
    }

    @Override // androidx.appcompat.app.d
    public void s(Bundle bundle) {
        U();
    }

    void s0(int i2) {
        if (i2 == 108) {
            androidx.appcompat.app.a aVarK = k();
            if (aVarK != null) {
                aVarK.i(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            o oVarA0 = a0(i2, true);
            if (oVarA0.f437o) {
                N(oVarA0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.d
    public void t() {
        androidx.appcompat.app.a aVarK = k();
        if (aVarK != null) {
            aVarK.t(true);
        }
    }

    void t0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.d
    public void u(Bundle bundle) {
        if (this.O != -100) {
            f374b0.put(this.f380e.getClass(), Integer.valueOf(this.O));
        }
    }

    @Override // androidx.appcompat.app.d
    public void v() {
        this.M = true;
        E();
        androidx.appcompat.app.d.n(this);
    }

    final androidx.appcompat.app.a v0() {
        return this.f385j;
    }

    @Override // androidx.appcompat.app.d
    public void w() {
        this.M = false;
        androidx.appcompat.app.d.o(this);
        androidx.appcompat.app.a aVarK = k();
        if (aVarK != null) {
            aVarK.t(false);
        }
        if (this.f380e instanceof Dialog) {
            L();
        }
    }

    @Override // androidx.appcompat.app.d
    public boolean y(int i2) {
        int iZ0 = z0(i2);
        if (this.F && iZ0 == 108) {
            return false;
        }
        if (this.B && iZ0 == 1) {
            this.B = false;
        }
        if (iZ0 == 1) {
            E0();
            this.F = true;
            return true;
        }
        if (iZ0 == 2) {
            E0();
            this.f401z = true;
            return true;
        }
        if (iZ0 == 5) {
            E0();
            this.A = true;
            return true;
        }
        if (iZ0 == 10) {
            E0();
            this.D = true;
            return true;
        }
        if (iZ0 == 108) {
            E0();
            this.B = true;
            return true;
        }
        if (iZ0 != 109) {
            return this.f382g.requestFeature(iZ0);
        }
        E0();
        this.C = true;
        return true;
    }

    @Override // androidx.appcompat.app.d
    public void z(int i2) {
        U();
        ViewGroup viewGroup = (ViewGroup) this.f398w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f381f).inflate(i2, viewGroup);
        this.f383h.a().onContentChanged();
    }
}

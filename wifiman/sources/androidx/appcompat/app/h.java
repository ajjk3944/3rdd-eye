package androidx.appcompat.app;

import F1.AbstractC2749g0;
import F1.AbstractC2773t;
import F1.AbstractC2775u;
import F1.C2745e0;
import F1.C2780w0;
import F1.F;
import F1.W;
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
import android.os.LocaleList;
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
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C3886k;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.b0;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.i0;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.InterfaceC4017o;
import h.AbstractC5927a;
import h.AbstractC5929c;
import h.AbstractC5932f;
import h.AbstractC5933g;
import h.AbstractC5935i;
import h.AbstractC5936j;
import i.AbstractC6050a;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import o.V;
import org.snmp4j.mp.SnmpConstants;
import org.xmlpull.v1.XmlPullParser;
import t1.AbstractC8021a;
import v1.h;

/* loaded from: classes.dex */
class h extends androidx.appcompat.app.f implements e.a, LayoutInflater.Factory2 {

    /* renamed from: A1, reason: collision with root package name */
    private static final V f26508A1 = new V();

    /* renamed from: B1, reason: collision with root package name */
    private static final boolean f26509B1 = false;

    /* renamed from: C1, reason: collision with root package name */
    private static final int[] f26510C1 = {R.attr.windowBackground};

    /* renamed from: D1, reason: collision with root package name */
    private static final boolean f26511D1 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    private boolean f26512A;

    /* renamed from: B, reason: collision with root package name */
    ViewGroup f26513B;

    /* renamed from: C, reason: collision with root package name */
    private TextView f26514C;

    /* renamed from: D, reason: collision with root package name */
    private View f26515D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f26516E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f26517F;

    /* renamed from: G, reason: collision with root package name */
    boolean f26518G;

    /* renamed from: H, reason: collision with root package name */
    boolean f26519H;

    /* renamed from: I, reason: collision with root package name */
    boolean f26520I;

    /* renamed from: J, reason: collision with root package name */
    boolean f26521J;

    /* renamed from: N, reason: collision with root package name */
    boolean f26522N;

    /* renamed from: X, reason: collision with root package name */
    private boolean f26523X;

    /* renamed from: Y, reason: collision with root package name */
    private q[] f26524Y;

    /* renamed from: Z, reason: collision with root package name */
    private q f26525Z;

    /* renamed from: f1, reason: collision with root package name */
    private boolean f26526f1;

    /* renamed from: g1, reason: collision with root package name */
    private boolean f26527g1;

    /* renamed from: h1, reason: collision with root package name */
    private boolean f26528h1;

    /* renamed from: i1, reason: collision with root package name */
    boolean f26529i1;

    /* renamed from: j, reason: collision with root package name */
    final Object f26530j;

    /* renamed from: j1, reason: collision with root package name */
    private Configuration f26531j1;

    /* renamed from: k, reason: collision with root package name */
    final Context f26532k;

    /* renamed from: k1, reason: collision with root package name */
    private int f26533k1;

    /* renamed from: l, reason: collision with root package name */
    Window f26534l;

    /* renamed from: l1, reason: collision with root package name */
    private int f26535l1;

    /* renamed from: m, reason: collision with root package name */
    private l f26536m;

    /* renamed from: m1, reason: collision with root package name */
    private int f26537m1;

    /* renamed from: n, reason: collision with root package name */
    final androidx.appcompat.app.d f26538n;

    /* renamed from: n1, reason: collision with root package name */
    private boolean f26539n1;

    /* renamed from: o, reason: collision with root package name */
    androidx.appcompat.app.a f26540o;

    /* renamed from: o1, reason: collision with root package name */
    private n f26541o1;

    /* renamed from: p, reason: collision with root package name */
    MenuInflater f26542p;

    /* renamed from: p1, reason: collision with root package name */
    private n f26543p1;

    /* renamed from: q, reason: collision with root package name */
    private CharSequence f26544q;

    /* renamed from: q1, reason: collision with root package name */
    boolean f26545q1;

    /* renamed from: r, reason: collision with root package name */
    private I f26546r;

    /* renamed from: r1, reason: collision with root package name */
    int f26547r1;

    /* renamed from: s, reason: collision with root package name */
    private f f26548s;

    /* renamed from: s1, reason: collision with root package name */
    private final Runnable f26549s1;

    /* renamed from: t, reason: collision with root package name */
    private r f26550t;

    /* renamed from: t1, reason: collision with root package name */
    private boolean f26551t1;

    /* renamed from: u, reason: collision with root package name */
    androidx.appcompat.view.b f26552u;

    /* renamed from: u1, reason: collision with root package name */
    private Rect f26553u1;

    /* renamed from: v, reason: collision with root package name */
    ActionBarContextView f26554v;

    /* renamed from: v1, reason: collision with root package name */
    private Rect f26555v1;

    /* renamed from: w, reason: collision with root package name */
    PopupWindow f26556w;

    /* renamed from: w1, reason: collision with root package name */
    private androidx.appcompat.app.q f26557w1;

    /* renamed from: x, reason: collision with root package name */
    Runnable f26558x;

    /* renamed from: x1, reason: collision with root package name */
    private s f26559x1;

    /* renamed from: y, reason: collision with root package name */
    C2745e0 f26560y;

    /* renamed from: y1, reason: collision with root package name */
    private OnBackInvokedDispatcher f26561y1;

    /* renamed from: z, reason: collision with root package name */
    private boolean f26562z;

    /* renamed from: z1, reason: collision with root package name */
    private OnBackInvokedCallback f26563z1;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            if ((hVar.f26547r1 & 1) != 0) {
                hVar.i0(0);
            }
            h hVar2 = h.this;
            if ((hVar2.f26547r1 & 4096) != 0) {
                hVar2.i0(108);
            }
            h hVar3 = h.this;
            hVar3.f26545q1 = false;
            hVar3.f26547r1 = 0;
        }
    }

    class b implements F {
        b() {
        }

        @Override // F1.F
        public C2780w0 a(View view, C2780w0 c2780w0) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int iL = c2780w0.l();
            int iF1 = h.this.f1(c2780w0, null);
            if (iL != iF1) {
                c2780w0 = c2780w0.q(c2780w0.j(), iF1, c2780w0.k(), c2780w0.i());
            }
            return W.Y(view, c2780w0);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            h.this.g0();
        }
    }

    class d implements Runnable {

        class a extends AbstractC2749g0 {
            a() {
            }

            @Override // F1.InterfaceC2747f0
            public void b(View view) {
                h.this.f26554v.setAlpha(1.0f);
                h.this.f26560y.h(null);
                h.this.f26560y = null;
            }

            @Override // F1.AbstractC2749g0, F1.InterfaceC2747f0
            public void c(View view) {
                h.this.f26554v.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f26556w.showAtLocation(hVar.f26554v, 55, 0, 0);
            h.this.j0();
            if (!h.this.U0()) {
                h.this.f26554v.setAlpha(1.0f);
                h.this.f26554v.setVisibility(0);
            } else {
                h.this.f26554v.setAlpha(0.0f);
                h hVar2 = h.this;
                hVar2.f26560y = W.e(hVar2.f26554v).b(1.0f);
                h.this.f26560y.h(new a());
            }
        }
    }

    class e extends AbstractC2749g0 {
        e() {
        }

        @Override // F1.InterfaceC2747f0
        public void b(View view) {
            h.this.f26554v.setAlpha(1.0f);
            h.this.f26560y.h(null);
            h.this.f26560y = null;
        }

        @Override // F1.AbstractC2749g0, F1.InterfaceC2747f0
        public void c(View view) {
            h.this.f26554v.setVisibility(0);
            if (h.this.f26554v.getParent() instanceof View) {
                W.j0((View) h.this.f26554v.getParent());
            }
        }
    }

    private final class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
            h.this.Z(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackV0 = h.this.v0();
            if (callbackV0 == null) {
                return true;
            }
            callbackV0.onMenuOpened(108, eVar);
            return true;
        }
    }

    class g implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private b.a f26571a;

        class a extends AbstractC2749g0 {
            a() {
            }

            @Override // F1.InterfaceC2747f0
            public void b(View view) {
                h.this.f26554v.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.f26556w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.f26554v.getParent() instanceof View) {
                    W.j0((View) h.this.f26554v.getParent());
                }
                h.this.f26554v.k();
                h.this.f26560y.h(null);
                h hVar2 = h.this;
                hVar2.f26560y = null;
                W.j0(hVar2.f26513B);
            }
        }

        public g(b.a aVar) {
            this.f26571a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f26571a.a(bVar);
            h hVar = h.this;
            if (hVar.f26556w != null) {
                hVar.f26534l.getDecorView().removeCallbacks(h.this.f26558x);
            }
            h hVar2 = h.this;
            if (hVar2.f26554v != null) {
                hVar2.j0();
                h hVar3 = h.this;
                hVar3.f26560y = W.e(hVar3.f26554v).b(0.0f);
                h.this.f26560y.h(new a());
            }
            h hVar4 = h.this;
            androidx.appcompat.app.d dVar = hVar4.f26538n;
            if (dVar != null) {
                dVar.f(hVar4.f26552u);
            }
            h hVar5 = h.this;
            hVar5.f26552u = null;
            W.j0(hVar5.f26513B);
            h.this.d1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f26571a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            W.j0(h.this.f26513B);
            return this.f26571a.c(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f26571a.d(bVar, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.h$h, reason: collision with other inner class name */
    static class C1020h {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class i {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static A1.j b(Configuration configuration) {
            return A1.j.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(A1.j jVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(jVar.g()));
        }

        static void d(Configuration configuration, A1.j jVar) {
            configuration.setLocales(LocaleList.forLanguageTags(jVar.g()));
        }
    }

    static class j {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    static class k {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, final h hVar) {
            Objects.requireNonNull(hVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.n
                public final void onBackInvoked() {
                    hVar.D0();
                }
            };
            androidx.appcompat.app.j.a(obj).registerOnBackInvokedCallback(SnmpConstants.MILLISECOND_TO_NANOSECOND, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            androidx.appcompat.app.j.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.i.a(obj2));
        }
    }

    class l extends androidx.appcompat.view.i {

        /* renamed from: b, reason: collision with root package name */
        private boolean f26574b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f26575c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f26576d;

        l(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f26575c = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f26575c = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f26574b = true;
                callback.onContentChanged();
            } finally {
                this.f26574b = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f26576d = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f26576d = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f26575c ? a().dispatchKeyEvent(keyEvent) : h.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || h.this.G0(keyEvent.getKeyCode(), keyEvent);
        }

        final ActionMode e(ActionMode.Callback callback) {
            f.a aVar = new f.a(h.this.f26532k, callback);
            androidx.appcompat.view.b bVarX0 = h.this.X0(aVar);
            if (bVarX0 != null) {
                return aVar.e(bVarX0);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f26574b) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            return super.onCreatePanelView(i10);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            h.this.J0(i10);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f26576d) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                h.this.K0(i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.b0(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            if (eVar != null) {
                eVar.b0(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            q qVarT0 = h.this.t0(0, true);
            if (qVarT0 == null || (eVar = qVarT0.f26595j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (h.this.B0() && i10 == 0) ? e(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    private class m extends n {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f26578c;

        m(Context context) {
            super();
            this.f26578c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.h.n
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.n
        public int c() {
            return C1020h.a(this.f26578c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.n
        public void d() {
            h.this.f();
        }
    }

    abstract class n {

        /* renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f26580a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                n.this.d();
            }
        }

        n() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f26580a;
            if (broadcastReceiver != null) {
                try {
                    h.this.f26532k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f26580a = null;
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
            if (this.f26580a == null) {
                this.f26580a = new a();
            }
            h.this.f26532k.registerReceiver(this.f26580a, intentFilterB);
        }
    }

    private class o extends n {

        /* renamed from: c, reason: collision with root package name */
        private final v f26583c;

        o(v vVar) {
            super();
            this.f26583c = vVar;
        }

        @Override // androidx.appcompat.app.h.n
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.n
        public int c() {
            return this.f26583c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.n
        public void d() {
            h.this.f();
        }
    }

    private class p extends ContentFrameLayout {
        public p(Context context) {
            super(context);
        }

        private boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            h.this.b0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(AbstractC6050a.b(getContext(), i10));
        }
    }

    protected static final class q {

        /* renamed from: a, reason: collision with root package name */
        int f26586a;

        /* renamed from: b, reason: collision with root package name */
        int f26587b;

        /* renamed from: c, reason: collision with root package name */
        int f26588c;

        /* renamed from: d, reason: collision with root package name */
        int f26589d;

        /* renamed from: e, reason: collision with root package name */
        int f26590e;

        /* renamed from: f, reason: collision with root package name */
        int f26591f;

        /* renamed from: g, reason: collision with root package name */
        ViewGroup f26592g;

        /* renamed from: h, reason: collision with root package name */
        View f26593h;

        /* renamed from: i, reason: collision with root package name */
        View f26594i;

        /* renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.e f26595j;

        /* renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.c f26596k;

        /* renamed from: l, reason: collision with root package name */
        Context f26597l;

        /* renamed from: m, reason: collision with root package name */
        boolean f26598m;

        /* renamed from: n, reason: collision with root package name */
        boolean f26599n;

        /* renamed from: o, reason: collision with root package name */
        boolean f26600o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f26601p;

        /* renamed from: q, reason: collision with root package name */
        boolean f26602q = false;

        /* renamed from: r, reason: collision with root package name */
        boolean f26603r;

        /* renamed from: s, reason: collision with root package name */
        Bundle f26604s;

        q(int i10) {
            this.f26586a = i10;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f26595j == null) {
                return null;
            }
            if (this.f26596k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f26597l, AbstractC5933g.f48063j);
                this.f26596k = cVar;
                cVar.h(aVar);
                this.f26595j.b(this.f26596k);
            }
            return this.f26596k.b(this.f26592g);
        }

        public boolean b() {
            if (this.f26593h == null) {
                return false;
            }
            return this.f26594i != null || this.f26596k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f26595j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.P(this.f26596k);
            }
            this.f26595j = eVar;
            if (eVar == null || (cVar = this.f26596k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(AbstractC5927a.f47938a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                themeNewTheme.applyStyle(i10, true);
            }
            themeNewTheme.resolveAttribute(AbstractC5927a.f47931C, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                themeNewTheme.applyStyle(i11, true);
            } else {
                themeNewTheme.applyStyle(AbstractC5935i.f48082a, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f26597l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(AbstractC5936j.f48298y0);
            this.f26587b = typedArrayObtainStyledAttributes.getResourceId(AbstractC5936j.f48090B0, 0);
            this.f26591f = typedArrayObtainStyledAttributes.getResourceId(AbstractC5936j.f48086A0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final class r implements j.a {
        r() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e eVarD = eVar.D();
            boolean z11 = eVarD != eVar;
            h hVar = h.this;
            if (z11) {
                eVar = eVarD;
            }
            q qVarM0 = hVar.m0(eVar);
            if (qVarM0 != null) {
                if (!z11) {
                    h.this.c0(qVarM0, z10);
                } else {
                    h.this.Y(qVarM0.f26586a, qVarM0, eVarD);
                    h.this.c0(qVarM0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackV0;
            if (eVar != eVar.D()) {
                return true;
            }
            h hVar = h.this;
            if (!hVar.f26518G || (callbackV0 = hVar.v0()) == null || h.this.f26529i1) {
                return true;
            }
            callbackV0.onMenuOpened(108, eVar);
            return true;
        }
    }

    h(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    private void A0(int i10) {
        this.f26547r1 = (1 << i10) | this.f26547r1;
        if (this.f26545q1) {
            return;
        }
        W.e0(this.f26534l.getDecorView(), this.f26549s1);
        this.f26545q1 = true;
    }

    private boolean F0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        q qVarT0 = t0(i10, true);
        if (qVarT0.f26600o) {
            return false;
        }
        return P0(qVarT0, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean I0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.b r0 = r4.f26552u
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.h$q r2 = r4.t0(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.I r5 = r4.f26546r
            if (r5 == 0) goto L43
            boolean r5 = r5.d()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f26532k
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.I r5 = r4.f26546r
            boolean r5 = r5.b()
            if (r5 != 0) goto L3c
            boolean r5 = r4.f26529i1
            if (r5 != 0) goto L62
            boolean r5 = r4.P0(r2, r6)
            if (r5 == 0) goto L62
            androidx.appcompat.widget.I r5 = r4.f26546r
            boolean r0 = r5.g()
            goto L68
        L3c:
            androidx.appcompat.widget.I r5 = r4.f26546r
            boolean r0 = r5.f()
            goto L68
        L43:
            boolean r5 = r2.f26600o
            if (r5 != 0) goto L64
            boolean r3 = r2.f26599n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f26598m
            if (r5 == 0) goto L62
            boolean r5 = r2.f26603r
            if (r5 == 0) goto L5b
            r2.f26598m = r1
            boolean r5 = r4.P0(r2, r6)
            goto L5c
        L5b:
            r5 = r0
        L5c:
            if (r5 == 0) goto L62
            r4.M0(r2, r6)
            goto L68
        L62:
            r0 = r1
            goto L68
        L64:
            r4.c0(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f26532k
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            goto L85
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.I0(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void M0(androidx.appcompat.app.h.q r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.M0(androidx.appcompat.app.h$q, android.view.KeyEvent):void");
    }

    private boolean O0(q qVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((qVar.f26598m || P0(qVar, keyEvent)) && (eVar = qVar.f26595j) != null) {
            zPerformShortcut = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (zPerformShortcut && (i11 & 1) == 0 && this.f26546r == null) {
            c0(qVar, true);
        }
        return zPerformShortcut;
    }

    private boolean P0(q qVar, KeyEvent keyEvent) {
        I i10;
        I i11;
        I i12;
        if (this.f26529i1) {
            return false;
        }
        if (qVar.f26598m) {
            return true;
        }
        q qVar2 = this.f26525Z;
        if (qVar2 != null && qVar2 != qVar) {
            c0(qVar2, false);
        }
        Window.Callback callbackV0 = v0();
        if (callbackV0 != null) {
            qVar.f26594i = callbackV0.onCreatePanelView(qVar.f26586a);
        }
        int i13 = qVar.f26586a;
        boolean z10 = i13 == 0 || i13 == 108;
        if (z10 && (i12 = this.f26546r) != null) {
            i12.c();
        }
        if (qVar.f26594i == null) {
            if (z10) {
                N0();
            }
            androidx.appcompat.view.menu.e eVar = qVar.f26595j;
            if (eVar == null || qVar.f26603r) {
                if (eVar == null && (!z0(qVar) || qVar.f26595j == null)) {
                    return false;
                }
                if (z10 && this.f26546r != null) {
                    if (this.f26548s == null) {
                        this.f26548s = new f();
                    }
                    this.f26546r.a(qVar.f26595j, this.f26548s);
                }
                qVar.f26595j.e0();
                if (!callbackV0.onCreatePanelMenu(qVar.f26586a, qVar.f26595j)) {
                    qVar.c(null);
                    if (z10 && (i10 = this.f26546r) != null) {
                        i10.a(null, this.f26548s);
                    }
                    return false;
                }
                qVar.f26603r = false;
            }
            qVar.f26595j.e0();
            Bundle bundle = qVar.f26604s;
            if (bundle != null) {
                qVar.f26595j.Q(bundle);
                qVar.f26604s = null;
            }
            if (!callbackV0.onPreparePanel(0, qVar.f26594i, qVar.f26595j)) {
                if (z10 && (i11 = this.f26546r) != null) {
                    i11.a(null, this.f26548s);
                }
                qVar.f26595j.d0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            qVar.f26601p = z11;
            qVar.f26595j.setQwertyMode(z11);
            qVar.f26595j.d0();
        }
        qVar.f26598m = true;
        qVar.f26599n = false;
        this.f26525Z = qVar;
        return true;
    }

    private void Q0(boolean z10) {
        I i10 = this.f26546r;
        if (i10 == null || !i10.d() || (ViewConfiguration.get(this.f26532k).hasPermanentMenuKey() && !this.f26546r.e())) {
            q qVarT0 = t0(0, true);
            qVarT0.f26602q = true;
            c0(qVarT0, false);
            M0(qVarT0, null);
            return;
        }
        Window.Callback callbackV0 = v0();
        if (this.f26546r.b() && z10) {
            this.f26546r.f();
            if (this.f26529i1) {
                return;
            }
            callbackV0.onPanelClosed(108, t0(0, true).f26595j);
            return;
        }
        if (callbackV0 == null || this.f26529i1) {
            return;
        }
        if (this.f26545q1 && (this.f26547r1 & 1) != 0) {
            this.f26534l.getDecorView().removeCallbacks(this.f26549s1);
            this.f26549s1.run();
        }
        q qVarT02 = t0(0, true);
        androidx.appcompat.view.menu.e eVar = qVarT02.f26595j;
        if (eVar == null || qVarT02.f26603r || !callbackV0.onPreparePanel(0, qVarT02.f26594i, eVar)) {
            return;
        }
        callbackV0.onMenuOpened(108, qVarT02.f26595j);
        this.f26546r.g();
    }

    private int R0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i10 != 9) {
            return i10;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean S(boolean z10) {
        return T(z10, true);
    }

    private boolean T(boolean z10, boolean z11) throws PackageManager.NameNotFoundException {
        if (this.f26529i1) {
            return false;
        }
        int iX = X();
        int iC0 = C0(this.f26532k, iX);
        A1.j jVarW = Build.VERSION.SDK_INT < 33 ? W(this.f26532k) : null;
        if (!z11 && jVarW != null) {
            jVarW = s0(this.f26532k.getResources().getConfiguration());
        }
        boolean zC1 = c1(iC0, jVarW, z10);
        if (iX == 0) {
            r0(this.f26532k).e();
        } else {
            n nVar = this.f26541o1;
            if (nVar != null) {
                nVar.a();
            }
        }
        if (iX == 3) {
            q0(this.f26532k).e();
        } else {
            n nVar2 = this.f26543p1;
            if (nVar2 != null) {
                nVar2.a();
            }
        }
        return zC1;
    }

    private void U() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f26513B.findViewById(R.id.content);
        View decorView = this.f26534l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f26532k.obtainStyledAttributes(AbstractC5936j.f48298y0);
        typedArrayObtainStyledAttributes.getValue(AbstractC5936j.f48126K0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(AbstractC5936j.f48130L0, contentFrameLayout.getMinWidthMinor());
        int i10 = AbstractC5936j.f48118I0;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = AbstractC5936j.f48122J0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            typedArrayObtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = AbstractC5936j.f48110G0;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            typedArrayObtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = AbstractC5936j.f48114H0;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            typedArrayObtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void V(Window window) {
        if (this.f26534l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof l) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        l lVar = new l(callback);
        this.f26536m = lVar;
        window.setCallback(lVar);
        b0 b0VarU = b0.u(this.f26532k, null, f26510C1);
        Drawable drawableH = b0VarU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        b0VarU.x();
        this.f26534l = window;
        if (Build.VERSION.SDK_INT < 33 || this.f26561y1 != null) {
            return;
        }
        N(null);
    }

    private boolean V0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f26534l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int X() {
        int i10 = this.f26533k1;
        return i10 != -100 ? i10 : androidx.appcompat.app.f.o();
    }

    private void Z0() {
        if (this.f26512A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void a0() {
        n nVar = this.f26541o1;
        if (nVar != null) {
            nVar.a();
        }
        n nVar2 = this.f26543p1;
        if (nVar2 != null) {
            nVar2.a();
        }
    }

    private androidx.appcompat.app.c a1() {
        for (Context baseContext = this.f26532k; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b1(Configuration configuration) {
        Activity activity = (Activity) this.f26530j;
        if (activity instanceof InterfaceC4017o) {
            if (((InterfaceC4017o) activity).O().b().isAtLeast(AbstractC4013k.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f26528h1 || this.f26529i1) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c1(int r10, A1.j r11, boolean r12) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            r9 = this;
            android.content.Context r1 = r9.f26532k
            r4 = 0
            r5 = 0
            r0 = r9
            r2 = r10
            r3 = r11
            android.content.res.Configuration r0 = r0.d0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r9.f26532k
            int r1 = r9.p0(r1)
            android.content.res.Configuration r2 = r9.f26531j1
            if (r2 != 0) goto L1f
            android.content.Context r2 = r9.f26532k
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            A1.j r2 = r9.s0(r2)
            r5 = 0
            if (r11 != 0) goto L30
            r6 = r5
            goto L34
        L30:
            A1.j r6 = r9.s0(r0)
        L34:
            r7 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.17E-43)
            goto L3b
        L3a:
            r3 = r7
        L3b:
            if (r6 == 0) goto L45
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L45
            r3 = r3 | 8196(0x2004, float:1.1485E-41)
        L45:
            int r2 = ~r1
            r2 = r2 & r3
            r8 = 1
            if (r2 == 0) goto L8c
            if (r12 == 0) goto L8c
            boolean r12 = r9.f26527g1
            if (r12 == 0) goto L8c
            boolean r12 = androidx.appcompat.app.h.f26511D1
            if (r12 != 0) goto L58
            boolean r12 = r9.f26528h1
            if (r12 == 0) goto L8c
        L58:
            java.lang.Object r12 = r9.f26530j
            boolean r2 = r12 instanceof android.app.Activity
            if (r2 == 0) goto L8c
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r12 = r12.isChild()
            if (r12 != 0) goto L8c
            int r12 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r12 < r2) goto L83
            r12 = r3 & 8192(0x2000, float:1.148E-41)
            if (r12 == 0) goto L83
            java.lang.Object r12 = r9.f26530j
            android.app.Activity r12 = (android.app.Activity) r12
            android.view.Window r12 = r12.getWindow()
            android.view.View r12 = r12.getDecorView()
            int r0 = r0.getLayoutDirection()
            r12.setLayoutDirection(r0)
        L83:
            java.lang.Object r12 = r9.f26530j
            android.app.Activity r12 = (android.app.Activity) r12
            s1.AbstractC7874b.r(r12)
            r12 = r8
            goto L8d
        L8c:
            r12 = r7
        L8d:
            if (r12 != 0) goto L9a
            if (r3 == 0) goto L9a
            r12 = r3 & r1
            if (r12 != r3) goto L96
            r7 = r8
        L96:
            r9.e1(r4, r6, r7, r5)
            goto L9b
        L9a:
            r8 = r12
        L9b:
            if (r8 == 0) goto Lb7
            java.lang.Object r12 = r9.f26530j
            boolean r0 = r12 instanceof androidx.appcompat.app.c
            if (r0 == 0) goto Lb7
            r0 = r3 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto Lac
            androidx.appcompat.app.c r12 = (androidx.appcompat.app.c) r12
            r12.M0(r10)
        Lac:
            r10 = r3 & 4
            if (r10 == 0) goto Lb7
            java.lang.Object r10 = r9.f26530j
            androidx.appcompat.app.c r10 = (androidx.appcompat.app.c) r10
            r10.L0(r11)
        Lb7:
            if (r6 == 0) goto Lca
            android.content.Context r10 = r9.f26532k
            android.content.res.Resources r10 = r10.getResources()
            android.content.res.Configuration r10 = r10.getConfiguration()
            A1.j r10 = r9.s0(r10)
            r9.T0(r10)
        Lca:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.c1(int, A1.j, boolean):boolean");
    }

    private Configuration d0(Context context, int i10, A1.j jVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (jVar != null) {
            S0(configuration2, jVar);
        }
        return configuration2;
    }

    private ViewGroup e0() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f26532k.obtainStyledAttributes(AbstractC5936j.f48298y0);
        int i10 = AbstractC5936j.f48098D0;
        if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC5936j.f48134M0, false)) {
            I(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i10, false)) {
            I(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC5936j.f48102E0, false)) {
            I(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC5936j.f48106F0, false)) {
            I(10);
        }
        this.f26521J = typedArrayObtainStyledAttributes.getBoolean(AbstractC5936j.f48302z0, false);
        typedArrayObtainStyledAttributes.recycle();
        l0();
        this.f26534l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f26532k);
        if (this.f26522N) {
            viewGroup = this.f26520I ? (ViewGroup) layoutInflaterFrom.inflate(AbstractC5933g.f48068o, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(AbstractC5933g.f48067n, (ViewGroup) null);
        } else if (this.f26521J) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(AbstractC5933g.f48059f, (ViewGroup) null);
            this.f26519H = false;
            this.f26518G = false;
        } else if (this.f26518G) {
            TypedValue typedValue = new TypedValue();
            this.f26532k.getTheme().resolveAttribute(AbstractC5927a.f47941d, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f26532k, typedValue.resourceId) : this.f26532k).inflate(AbstractC5933g.f48069p, (ViewGroup) null);
            I i11 = (I) viewGroup.findViewById(AbstractC5932f.f48043p);
            this.f26546r = i11;
            i11.setWindowCallback(v0());
            if (this.f26519H) {
                this.f26546r.h(109);
            }
            if (this.f26516E) {
                this.f26546r.h(2);
            }
            if (this.f26517F) {
                this.f26546r.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f26518G + ", windowActionBarOverlay: " + this.f26519H + ", android:windowIsFloating: " + this.f26521J + ", windowActionModeOverlay: " + this.f26520I + ", windowNoTitle: " + this.f26522N + " }");
        }
        W.y0(viewGroup, new b());
        if (this.f26546r == null) {
            this.f26514C = (TextView) viewGroup.findViewById(AbstractC5932f.f48024B);
        }
        i0.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(AbstractC5932f.f48029b);
        ViewGroup viewGroup2 = (ViewGroup) this.f26534l.findViewById(R.id.content);
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
        this.f26534l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void e1(int i10, A1.j jVar, boolean z10, Configuration configuration) {
        Resources resources = this.f26532k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (jVar != null) {
            S0(configuration2, jVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i11 = this.f26535l1;
        if (i11 != 0) {
            this.f26532k.setTheme(i11);
            this.f26532k.getTheme().applyStyle(this.f26535l1, true);
        }
        if (z10 && (this.f26530j instanceof Activity)) {
            b1(configuration2);
        }
    }

    private void g1(View view) {
        view.setBackgroundColor((W.J(view) & 8192) != 0 ? AbstractC8021a.c(this.f26532k, AbstractC5929c.f47966b) : AbstractC8021a.c(this.f26532k, AbstractC5929c.f47965a));
    }

    private void k0() {
        if (this.f26512A) {
            return;
        }
        this.f26513B = e0();
        CharSequence charSequenceU0 = u0();
        if (!TextUtils.isEmpty(charSequenceU0)) {
            I i10 = this.f26546r;
            if (i10 != null) {
                i10.setWindowTitle(charSequenceU0);
            } else if (N0() != null) {
                N0().x(charSequenceU0);
            } else {
                TextView textView = this.f26514C;
                if (textView != null) {
                    textView.setText(charSequenceU0);
                }
            }
        }
        U();
        L0(this.f26513B);
        this.f26512A = true;
        q qVarT0 = t0(0, false);
        if (this.f26529i1) {
            return;
        }
        if (qVarT0 == null || qVarT0.f26595j == null) {
            A0(108);
        }
    }

    private void l0() {
        if (this.f26534l == null) {
            Object obj = this.f26530j;
            if (obj instanceof Activity) {
                V(((Activity) obj).getWindow());
            }
        }
        if (this.f26534l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration n0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            i.a(configuration, configuration2, configuration3);
            int i14 = configuration.touchscreen;
            int i15 = configuration2.touchscreen;
            if (i14 != i15) {
                configuration3.touchscreen = i15;
            }
            int i16 = configuration.keyboard;
            int i17 = configuration2.keyboard;
            if (i16 != i17) {
                configuration3.keyboard = i17;
            }
            int i18 = configuration.keyboardHidden;
            int i19 = configuration2.keyboardHidden;
            if (i18 != i19) {
                configuration3.keyboardHidden = i19;
            }
            int i20 = configuration.navigation;
            int i21 = configuration2.navigation;
            if (i20 != i21) {
                configuration3.navigation = i21;
            }
            int i22 = configuration.navigationHidden;
            int i23 = configuration2.navigationHidden;
            if (i22 != i23) {
                configuration3.navigationHidden = i23;
            }
            int i24 = configuration.orientation;
            int i25 = configuration2.orientation;
            if (i24 != i25) {
                configuration3.orientation = i25;
            }
            int i26 = configuration.screenLayout & 15;
            int i27 = configuration2.screenLayout;
            if (i26 != (i27 & 15)) {
                configuration3.screenLayout |= i27 & 15;
            }
            int i28 = configuration.screenLayout & 192;
            int i29 = configuration2.screenLayout;
            if (i28 != (i29 & 192)) {
                configuration3.screenLayout |= i29 & 192;
            }
            int i30 = configuration.screenLayout & 48;
            int i31 = configuration2.screenLayout;
            if (i30 != (i31 & 48)) {
                configuration3.screenLayout |= i31 & 48;
            }
            int i32 = configuration.screenLayout & 768;
            int i33 = configuration2.screenLayout;
            if (i32 != (i33 & 768)) {
                configuration3.screenLayout |= i33 & 768;
            }
            j.a(configuration, configuration2, configuration3);
            int i34 = configuration.uiMode & 15;
            int i35 = configuration2.uiMode;
            if (i34 != (i35 & 15)) {
                configuration3.uiMode |= i35 & 15;
            }
            int i36 = configuration.uiMode & 48;
            int i37 = configuration2.uiMode;
            if (i36 != (i37 & 48)) {
                configuration3.uiMode |= i37 & 48;
            }
            int i38 = configuration.screenWidthDp;
            int i39 = configuration2.screenWidthDp;
            if (i38 != i39) {
                configuration3.screenWidthDp = i39;
            }
            int i40 = configuration.screenHeightDp;
            int i41 = configuration2.screenHeightDp;
            if (i40 != i41) {
                configuration3.screenHeightDp = i41;
            }
            int i42 = configuration.smallestScreenWidthDp;
            int i43 = configuration2.smallestScreenWidthDp;
            if (i42 != i43) {
                configuration3.smallestScreenWidthDp = i43;
            }
            int i44 = configuration.densityDpi;
            int i45 = configuration2.densityDpi;
            if (i44 != i45) {
                configuration3.densityDpi = i45;
            }
        }
        return configuration3;
    }

    private int p0(Context context) throws PackageManager.NameNotFoundException {
        if (!this.f26539n1 && (this.f26530j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f26530j.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f26537m1 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f26537m1 = 0;
            }
        }
        this.f26539n1 = true;
        return this.f26537m1;
    }

    private n q0(Context context) {
        if (this.f26543p1 == null) {
            this.f26543p1 = new m(context);
        }
        return this.f26543p1;
    }

    private n r0(Context context) {
        if (this.f26541o1 == null) {
            this.f26541o1 = new o(v.a(context));
        }
        return this.f26541o1;
    }

    private void w0() {
        k0();
        if (this.f26518G && this.f26540o == null) {
            Object obj = this.f26530j;
            if (obj instanceof Activity) {
                this.f26540o = new w((Activity) this.f26530j, this.f26519H);
            } else if (obj instanceof Dialog) {
                this.f26540o = new w((Dialog) this.f26530j);
            }
            androidx.appcompat.app.a aVar = this.f26540o;
            if (aVar != null) {
                aVar.r(this.f26551t1);
            }
        }
    }

    private boolean x0(q qVar) {
        View view = qVar.f26594i;
        if (view != null) {
            qVar.f26593h = view;
            return true;
        }
        if (qVar.f26595j == null) {
            return false;
        }
        if (this.f26550t == null) {
            this.f26550t = new r();
        }
        View view2 = (View) qVar.a(this.f26550t);
        qVar.f26593h = view2;
        return view2 != null;
    }

    private boolean y0(q qVar) {
        qVar.d(o0());
        qVar.f26592g = new p(qVar.f26597l);
        qVar.f26588c = 81;
        return true;
    }

    private boolean z0(q qVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f26532k;
        int i10 = qVar.f26586a;
        if ((i10 == 0 || i10 == 108) && this.f26546r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(AbstractC5927a.f47941d, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(AbstractC5927a.f47942e, typedValue, true);
            } else {
                theme.resolveAttribute(AbstractC5927a.f47942e, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.S(this);
        qVar.c(eVar);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // androidx.appcompat.app.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f26530j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.f.G(r3)
        L9:
            boolean r0 = r3.f26545q1
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f26534l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f26549s1
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f26529i1 = r0
            int r0 = r3.f26533k1
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f26530j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            o.V r0 = androidx.appcompat.app.h.f26508A1
            java.lang.Object r1 = r3.f26530j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f26533k1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            o.V r0 = androidx.appcompat.app.h.f26508A1
            java.lang.Object r1 = r3.f26530j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.f26540o
            if (r0 == 0) goto L5b
            r0.n()
        L5b:
            r3.a0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.A():void");
    }

    @Override // androidx.appcompat.app.f
    public void B(Bundle bundle) {
        k0();
    }

    public boolean B0() {
        return this.f26562z;
    }

    @Override // androidx.appcompat.app.f
    public void C() {
        androidx.appcompat.app.a aVarT = t();
        if (aVarT != null) {
            aVarT.v(true);
        }
    }

    int C0(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return r0(context).c();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return q0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i10;
    }

    @Override // androidx.appcompat.app.f
    public void D(Bundle bundle) {
    }

    boolean D0() {
        boolean z10 = this.f26526f1;
        this.f26526f1 = false;
        q qVarT0 = t0(0, false);
        if (qVarT0 != null && qVarT0.f26600o) {
            if (!z10) {
                c0(qVarT0, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f26552u;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a aVarT = t();
        return aVarT != null && aVarT.h();
    }

    @Override // androidx.appcompat.app.f
    public void E() throws PackageManager.NameNotFoundException {
        T(true, false);
    }

    boolean E0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.f26526f1 = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            F0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public void F() {
        androidx.appcompat.app.a aVarT = t();
        if (aVarT != null) {
            aVarT.v(false);
        }
    }

    boolean G0(int i10, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVarT = t();
        if (aVarT != null && aVarT.o(i10, keyEvent)) {
            return true;
        }
        q qVar = this.f26525Z;
        if (qVar != null && O0(qVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            q qVar2 = this.f26525Z;
            if (qVar2 != null) {
                qVar2.f26599n = true;
            }
            return true;
        }
        if (this.f26525Z == null) {
            q qVarT0 = t0(0, true);
            P0(qVarT0, keyEvent);
            boolean zO0 = O0(qVarT0, keyEvent.getKeyCode(), keyEvent, 1);
            qVarT0.f26598m = false;
            if (zO0) {
                return true;
            }
        }
        return false;
    }

    boolean H0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                I0(0, keyEvent);
                return true;
            }
        } else if (D0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public boolean I(int i10) {
        int iR0 = R0(i10);
        if (this.f26522N && iR0 == 108) {
            return false;
        }
        if (this.f26518G && iR0 == 1) {
            this.f26518G = false;
        }
        if (iR0 == 1) {
            Z0();
            this.f26522N = true;
            return true;
        }
        if (iR0 == 2) {
            Z0();
            this.f26516E = true;
            return true;
        }
        if (iR0 == 5) {
            Z0();
            this.f26517F = true;
            return true;
        }
        if (iR0 == 10) {
            Z0();
            this.f26520I = true;
            return true;
        }
        if (iR0 == 108) {
            Z0();
            this.f26518G = true;
            return true;
        }
        if (iR0 != 109) {
            return this.f26534l.requestFeature(iR0);
        }
        Z0();
        this.f26519H = true;
        return true;
    }

    @Override // androidx.appcompat.app.f
    public void J(int i10) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.f26513B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f26532k).inflate(i10, viewGroup);
        this.f26536m.c(this.f26534l.getCallback());
    }

    void J0(int i10) {
        androidx.appcompat.app.a aVarT;
        if (i10 != 108 || (aVarT = t()) == null) {
            return;
        }
        aVarT.i(true);
    }

    @Override // androidx.appcompat.app.f
    public void K(View view) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.f26513B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f26536m.c(this.f26534l.getCallback());
    }

    void K0(int i10) {
        if (i10 == 108) {
            androidx.appcompat.app.a aVarT = t();
            if (aVarT != null) {
                aVarT.i(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            q qVarT0 = t0(i10, true);
            if (qVarT0.f26600o) {
                c0(qVarT0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.f
    public void L(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.f26513B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f26536m.c(this.f26534l.getCallback());
    }

    void L0(ViewGroup viewGroup) {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // androidx.appcompat.app.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void N(android.window.OnBackInvokedDispatcher r3) {
        /*
            r2 = this;
            super.N(r3)
            android.window.OnBackInvokedDispatcher r0 = r2.f26561y1
            if (r0 == 0) goto L11
            android.window.OnBackInvokedCallback r1 = r2.f26563z1
            if (r1 == 0) goto L11
            androidx.appcompat.app.h.k.c(r0, r1)
            r0 = 0
            r2.f26563z1 = r0
        L11:
            if (r3 != 0) goto L2c
            java.lang.Object r0 = r2.f26530j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L2c
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L2c
            java.lang.Object r3 = r2.f26530j
            android.app.Activity r3 = (android.app.Activity) r3
            android.window.OnBackInvokedDispatcher r3 = androidx.appcompat.app.h.k.a(r3)
            r2.f26561y1 = r3
            goto L2e
        L2c:
            r2.f26561y1 = r3
        L2e:
            r2.d1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.N(android.window.OnBackInvokedDispatcher):void");
    }

    final androidx.appcompat.app.a N0() {
        return this.f26540o;
    }

    @Override // androidx.appcompat.app.f
    public void O(int i10) {
        this.f26535l1 = i10;
    }

    @Override // androidx.appcompat.app.f
    public final void P(CharSequence charSequence) {
        this.f26544q = charSequence;
        I i10 = this.f26546r;
        if (i10 != null) {
            i10.setWindowTitle(charSequence);
            return;
        }
        if (N0() != null) {
            N0().x(charSequence);
            return;
        }
        TextView textView = this.f26514C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    void S0(Configuration configuration, A1.j jVar) {
        i.d(configuration, jVar);
    }

    void T0(A1.j jVar) {
        i.c(jVar);
    }

    final boolean U0() {
        ViewGroup viewGroup;
        return this.f26512A && (viewGroup = this.f26513B) != null && viewGroup.isLaidOut();
    }

    A1.j W(Context context) {
        A1.j jVarS;
        if (Build.VERSION.SDK_INT >= 33 || (jVarS = androidx.appcompat.app.f.s()) == null) {
            return null;
        }
        A1.j jVarS0 = s0(context.getApplicationContext().getResources().getConfiguration());
        A1.j jVarB = t.b(jVarS, jVarS0);
        return jVarB.e() ? jVarS0 : jVarB;
    }

    boolean W0() {
        if (this.f26561y1 == null) {
            return false;
        }
        q qVarT0 = t0(0, false);
        return (qVarT0 != null && qVarT0.f26600o) || this.f26552u != null;
    }

    public androidx.appcompat.view.b X0(b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.f26552u;
        if (bVar != null) {
            bVar.c();
        }
        g gVar = new g(aVar);
        androidx.appcompat.app.a aVarT = t();
        if (aVarT != null) {
            androidx.appcompat.view.b bVarY = aVarT.y(gVar);
            this.f26552u = bVarY;
            if (bVarY != null && (dVar = this.f26538n) != null) {
                dVar.e(bVarY);
            }
        }
        if (this.f26552u == null) {
            this.f26552u = Y0(gVar);
        }
        d1();
        return this.f26552u;
    }

    void Y(int i10, q qVar, Menu menu) {
        if (menu == null) {
            if (qVar == null && i10 >= 0) {
                q[] qVarArr = this.f26524Y;
                if (i10 < qVarArr.length) {
                    qVar = qVarArr[i10];
                }
            }
            if (qVar != null) {
                menu = qVar.f26595j;
            }
        }
        if ((qVar == null || qVar.f26600o) && !this.f26529i1) {
            this.f26536m.d(this.f26534l.getCallback(), i10, menu);
        }
    }

    androidx.appcompat.view.b Y0(b.a aVar) {
        androidx.appcompat.view.b bVarS;
        Context dVar;
        androidx.appcompat.app.d dVar2;
        j0();
        androidx.appcompat.view.b bVar = this.f26552u;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof g)) {
            aVar = new g(aVar);
        }
        androidx.appcompat.app.d dVar3 = this.f26538n;
        if (dVar3 == null || this.f26529i1) {
            bVarS = null;
        } else {
            try {
                bVarS = dVar3.s(aVar);
            } catch (AbstractMethodError unused) {
            }
        }
        if (bVarS != null) {
            this.f26552u = bVarS;
        } else {
            if (this.f26554v == null) {
                if (this.f26521J) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f26532k.getTheme();
                    theme.resolveAttribute(AbstractC5927a.f47941d, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f26532k.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new androidx.appcompat.view.d(this.f26532k, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f26532k;
                    }
                    this.f26554v = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, AbstractC5927a.f47943f);
                    this.f26556w = popupWindow;
                    androidx.core.widget.g.b(popupWindow, 2);
                    this.f26556w.setContentView(this.f26554v);
                    this.f26556w.setWidth(-1);
                    dVar.getTheme().resolveAttribute(AbstractC5927a.f47939b, typedValue, true);
                    this.f26554v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f26556w.setHeight(-2);
                    this.f26558x = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f26513B.findViewById(AbstractC5932f.f48035h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(o0()));
                        this.f26554v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f26554v != null) {
                j0();
                this.f26554v.k();
                androidx.appcompat.view.e eVar = new androidx.appcompat.view.e(this.f26554v.getContext(), this.f26554v, aVar, this.f26556w == null);
                if (aVar.b(eVar, eVar.e())) {
                    eVar.k();
                    this.f26554v.h(eVar);
                    this.f26552u = eVar;
                    if (U0()) {
                        this.f26554v.setAlpha(0.0f);
                        C2745e0 c2745e0B = W.e(this.f26554v).b(1.0f);
                        this.f26560y = c2745e0B;
                        c2745e0B.h(new e());
                    } else {
                        this.f26554v.setAlpha(1.0f);
                        this.f26554v.setVisibility(0);
                        if (this.f26554v.getParent() instanceof View) {
                            W.j0((View) this.f26554v.getParent());
                        }
                    }
                    if (this.f26556w != null) {
                        this.f26534l.getDecorView().post(this.f26558x);
                    }
                } else {
                    this.f26552u = null;
                }
            }
        }
        androidx.appcompat.view.b bVar2 = this.f26552u;
        if (bVar2 != null && (dVar2 = this.f26538n) != null) {
            dVar2.e(bVar2);
        }
        d1();
        return this.f26552u;
    }

    void Z(androidx.appcompat.view.menu.e eVar) {
        if (this.f26523X) {
            return;
        }
        this.f26523X = true;
        this.f26546r.i();
        Window.Callback callbackV0 = v0();
        if (callbackV0 != null && !this.f26529i1) {
            callbackV0.onPanelClosed(108, eVar);
        }
        this.f26523X = false;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        q qVarM0;
        Window.Callback callbackV0 = v0();
        if (callbackV0 == null || this.f26529i1 || (qVarM0 = m0(eVar.D())) == null) {
            return false;
        }
        return callbackV0.onMenuItemSelected(qVarM0.f26586a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        Q0(true);
    }

    void b0(int i10) {
        c0(t0(i10, true), true);
    }

    void c0(q qVar, boolean z10) {
        ViewGroup viewGroup;
        I i10;
        if (z10 && qVar.f26586a == 0 && (i10 = this.f26546r) != null && i10.b()) {
            Z(qVar.f26595j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f26532k.getSystemService("window");
        if (windowManager != null && qVar.f26600o && (viewGroup = qVar.f26592g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                Y(qVar.f26586a, qVar, null);
            }
        }
        qVar.f26598m = false;
        qVar.f26599n = false;
        qVar.f26600o = false;
        qVar.f26593h = null;
        qVar.f26602q = true;
        if (this.f26525Z == qVar) {
            this.f26525Z = null;
        }
        if (qVar.f26586a == 0) {
            d1();
        }
    }

    void d1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zW0 = W0();
            if (zW0 && this.f26563z1 == null) {
                this.f26563z1 = k.b(this.f26561y1, this);
            } else {
                if (zW0 || (onBackInvokedCallback = this.f26563z1) == null) {
                    return;
                }
                k.c(this.f26561y1, onBackInvokedCallback);
                this.f26563z1 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.f
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ((ViewGroup) this.f26513B.findViewById(R.id.content)).addView(view, layoutParams);
        this.f26536m.c(this.f26534l.getCallback());
    }

    @Override // androidx.appcompat.app.f
    public boolean f() {
        return S(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View f0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        if (this.f26557w1 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f26532k.obtainStyledAttributes(AbstractC5936j.f48298y0);
            String string = typedArrayObtainStyledAttributes.getString(AbstractC5936j.f48094C0);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f26557w1 = new androidx.appcompat.app.q();
            } else {
                try {
                    this.f26557w1 = (androidx.appcompat.app.q) this.f26532k.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f26557w1 = new androidx.appcompat.app.q();
                }
            }
        }
        boolean z11 = f26509B1;
        boolean zV0 = false;
        if (z11) {
            if (this.f26559x1 == null) {
                this.f26559x1 = new s();
            }
            if (this.f26559x1.a(attributeSet)) {
                z10 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zV0 = V0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zV0 = true;
                }
                z10 = zV0;
            }
        } else {
            z10 = zV0;
        }
        return this.f26557w1.r(view, str, context, attributeSet, z10, z11, true, h0.c());
    }

    final int f1(C2780w0 c2780w0, Rect rect) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z10;
        boolean z11;
        int iL = c2780w0 != null ? c2780w0.l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f26554v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26554v.getLayoutParams();
            if (this.f26554v.isShown()) {
                if (this.f26553u1 == null) {
                    this.f26553u1 = new Rect();
                    this.f26555v1 = new Rect();
                }
                Rect rect2 = this.f26553u1;
                Rect rect3 = this.f26555v1;
                if (c2780w0 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c2780w0.j(), c2780w0.l(), c2780w0.k(), c2780w0.i());
                }
                i0.a(this.f26513B, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                C2780w0 c2780w0F = W.F(this.f26513B);
                int iJ = c2780w0F == null ? 0 : c2780w0F.j();
                int iK = c2780w0F == null ? 0 : c2780w0F.k();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.f26515D != null) {
                    View view = this.f26515D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iJ || marginLayoutParams2.rightMargin != iK) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iJ;
                            marginLayoutParams2.rightMargin = iK;
                            this.f26515D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f26532k);
                    this.f26515D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iJ;
                    layoutParams.rightMargin = iK;
                    this.f26513B.addView(this.f26515D, -1, layoutParams);
                }
                View view3 = this.f26515D;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    g1(this.f26515D);
                }
                if (!this.f26520I && z) {
                    iL = 0;
                }
                z10 = z;
                z = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z = false;
            }
            if (z) {
                this.f26554v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f26515D;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return iL;
    }

    void g0() {
        androidx.appcompat.view.menu.e eVar;
        I i10 = this.f26546r;
        if (i10 != null) {
            i10.i();
        }
        if (this.f26556w != null) {
            this.f26534l.getDecorView().removeCallbacks(this.f26558x);
            if (this.f26556w.isShowing()) {
                try {
                    this.f26556w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f26556w = null;
        }
        j0();
        q qVarT0 = t0(0, false);
        if (qVarT0 == null || (eVar = qVarT0.f26595j) == null) {
            return;
        }
        eVar.close();
    }

    boolean h0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f26530j;
        if (((obj instanceof AbstractC2773t.a) || (obj instanceof androidx.appcompat.app.p)) && (decorView = this.f26534l.getDecorView()) != null && AbstractC2773t.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f26536m.b(this.f26534l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? E0(keyCode, keyEvent) : H0(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.app.f
    public Context i(Context context) {
        this.f26527g1 = true;
        int iC0 = C0(context, X());
        if (androidx.appcompat.app.f.w(context)) {
            androidx.appcompat.app.f.R(context);
        }
        A1.j jVarW = W(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(d0(context, iC0, jVarW, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(d0(context, iC0, jVarW, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f26511D1) {
            return super.i(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationD0 = d0(context, iC0, jVarW, !configuration2.equals(configuration3) ? n0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, AbstractC5935i.f48083b);
        dVar.a(configurationD0);
        try {
            if (context.getTheme() != null) {
                h.f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.i(dVar);
    }

    void i0(int i10) {
        q qVarT0;
        q qVarT02 = t0(i10, true);
        if (qVarT02.f26595j != null) {
            Bundle bundle = new Bundle();
            qVarT02.f26595j.R(bundle);
            if (bundle.size() > 0) {
                qVarT02.f26604s = bundle;
            }
            qVarT02.f26595j.e0();
            qVarT02.f26595j.clear();
        }
        qVarT02.f26603r = true;
        qVarT02.f26602q = true;
        if ((i10 != 108 && i10 != 0) || this.f26546r == null || (qVarT0 = t0(0, false)) == null) {
            return;
        }
        qVarT0.f26598m = false;
        P0(qVarT0, null);
    }

    void j0() {
        C2745e0 c2745e0 = this.f26560y;
        if (c2745e0 != null) {
            c2745e0.c();
        }
    }

    @Override // androidx.appcompat.app.f
    public View l(int i10) {
        k0();
        return this.f26534l.findViewById(i10);
    }

    q m0(Menu menu) {
        q[] qVarArr = this.f26524Y;
        int length = qVarArr != null ? qVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            q qVar = qVarArr[i10];
            if (qVar != null && qVar.f26595j == menu) {
                return qVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.f
    public Context n() {
        return this.f26532k;
    }

    final Context o0() {
        androidx.appcompat.app.a aVarT = t();
        Context contextK = aVarT != null ? aVarT.k() : null;
        return contextK == null ? this.f26532k : contextK;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return f0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    public int p() {
        return this.f26533k1;
    }

    @Override // androidx.appcompat.app.f
    public MenuInflater r() {
        if (this.f26542p == null) {
            w0();
            androidx.appcompat.app.a aVar = this.f26540o;
            this.f26542p = new androidx.appcompat.view.g(aVar != null ? aVar.k() : this.f26532k);
        }
        return this.f26542p;
    }

    A1.j s0(Configuration configuration) {
        return i.b(configuration);
    }

    @Override // androidx.appcompat.app.f
    public androidx.appcompat.app.a t() {
        w0();
        return this.f26540o;
    }

    protected q t0(int i10, boolean z10) {
        q[] qVarArr = this.f26524Y;
        if (qVarArr == null || qVarArr.length <= i10) {
            q[] qVarArr2 = new q[i10 + 1];
            if (qVarArr != null) {
                System.arraycopy(qVarArr, 0, qVarArr2, 0, qVarArr.length);
            }
            this.f26524Y = qVarArr2;
            qVarArr = qVarArr2;
        }
        q qVar = qVarArr[i10];
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(i10);
        qVarArr[i10] = qVar2;
        return qVar2;
    }

    @Override // androidx.appcompat.app.f
    public void u() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f26532k);
        if (layoutInflaterFrom.getFactory() == null) {
            AbstractC2775u.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof h) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    final CharSequence u0() {
        Object obj = this.f26530j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f26544q;
    }

    @Override // androidx.appcompat.app.f
    public void v() {
        if (N0() == null || t().l()) {
            return;
        }
        A0(0);
    }

    final Window.Callback v0() {
        return this.f26534l.getCallback();
    }

    @Override // androidx.appcompat.app.f
    public void y(Configuration configuration) throws PackageManager.NameNotFoundException {
        androidx.appcompat.app.a aVarT;
        if (this.f26518G && this.f26512A && (aVarT = t()) != null) {
            aVarT.m(configuration);
        }
        C3886k.b().g(this.f26532k);
        this.f26531j1 = new Configuration(this.f26532k.getResources().getConfiguration());
        T(false, false);
    }

    @Override // androidx.appcompat.app.f
    public void z(Bundle bundle) {
        String strC;
        this.f26527g1 = true;
        S(false);
        l0();
        Object obj = this.f26530j;
        if (obj instanceof Activity) {
            try {
                strC = s1.i.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                androidx.appcompat.app.a aVarN0 = N0();
                if (aVarN0 == null) {
                    this.f26551t1 = true;
                } else {
                    aVarN0.r(true);
                }
            }
            androidx.appcompat.app.f.d(this);
        }
        this.f26531j1 = new Configuration(this.f26532k.getResources().getConfiguration());
        this.f26528h1 = true;
    }

    h(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private h(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        androidx.appcompat.app.c cVarA1;
        this.f26560y = null;
        this.f26562z = true;
        this.f26533k1 = -100;
        this.f26549s1 = new a();
        this.f26532k = context;
        this.f26538n = dVar;
        this.f26530j = obj;
        if (this.f26533k1 == -100 && (obj instanceof Dialog) && (cVarA1 = a1()) != null) {
            this.f26533k1 = cVarA1.G0().p();
        }
        if (this.f26533k1 == -100) {
            V v10 = f26508A1;
            Integer num = (Integer) v10.get(obj.getClass().getName());
            if (num != null) {
                this.f26533k1 = num.intValue();
                v10.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            V(window);
        }
        C3886k.h();
    }
}

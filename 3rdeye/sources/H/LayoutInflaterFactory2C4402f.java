package h;

import B0.g;
import E.u;
import L0.I;
import L0.S;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.Location;
import android.location.LocationManager;
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
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import g.C4353a;
import h.q;
import h.s;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import m.AbstractC5304a;
import m.C5306c;
import m.e;
import m.h;
import m0.C5316i;
import o.C5390h;
import o.InterfaceC5373A;
import o.f0;

/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: h.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C4402f extends AbstractC4401e implements f.a, LayoutInflater.Factory2 {

    /* renamed from: j0, reason: collision with root package name */
    public static final C5316i<String, Integer> f37979j0 = new C5316i<>();

    /* renamed from: k0, reason: collision with root package name */
    public static final int[] f37980k0 = {R.attr.windowBackground};

    /* renamed from: l0, reason: collision with root package name */
    public static final boolean f37981l0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: B, reason: collision with root package name */
    public boolean f37983B;

    /* renamed from: C, reason: collision with root package name */
    public ViewGroup f37984C;

    /* renamed from: D, reason: collision with root package name */
    public TextView f37985D;

    /* renamed from: E, reason: collision with root package name */
    public View f37986E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f37987F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f37988G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f37989H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f37990I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f37991J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f37992K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f37993L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f37994M;

    /* renamed from: N, reason: collision with root package name */
    public m[] f37995N;

    /* renamed from: O, reason: collision with root package name */
    public m f37996O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f37997P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f37998Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f37999R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f38000S;

    /* renamed from: T, reason: collision with root package name */
    public Configuration f38001T;

    /* renamed from: U, reason: collision with root package name */
    public final int f38002U;

    /* renamed from: V, reason: collision with root package name */
    public int f38003V;

    /* renamed from: W, reason: collision with root package name */
    public int f38004W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f38005X;

    /* renamed from: Y, reason: collision with root package name */
    public k f38006Y;

    /* renamed from: Z, reason: collision with root package name */
    public i f38007Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f38008a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f38009b0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f38011d0;

    /* renamed from: e0, reason: collision with root package name */
    public Rect f38012e0;

    /* renamed from: f0, reason: collision with root package name */
    public Rect f38013f0;

    /* renamed from: g0, reason: collision with root package name */
    public h.n f38014g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedDispatcher f38015h0;

    /* renamed from: i0, reason: collision with root package name */
    public OnBackInvokedCallback f38016i0;

    /* renamed from: k, reason: collision with root package name */
    public final Object f38017k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f38018l;

    /* renamed from: m, reason: collision with root package name */
    public Window f38019m;

    /* renamed from: n, reason: collision with root package name */
    public h f38020n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f38021o;

    /* renamed from: p, reason: collision with root package name */
    public AbstractC4397a f38022p;

    /* renamed from: q, reason: collision with root package name */
    public m.f f38023q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f38024r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC5373A f38025s;

    /* renamed from: t, reason: collision with root package name */
    public c f38026t;

    /* renamed from: u, reason: collision with root package name */
    public n f38027u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC5304a f38028v;

    /* renamed from: w, reason: collision with root package name */
    public ActionBarContextView f38029w;

    /* renamed from: x, reason: collision with root package name */
    public PopupWindow f38030x;

    /* renamed from: y, reason: collision with root package name */
    public h.h f38031y;

    /* renamed from: z, reason: collision with root package name */
    public S f38032z = null;

    /* renamed from: A, reason: collision with root package name */
    public final boolean f37982A = true;

    /* renamed from: c0, reason: collision with root package name */
    public final a f38010c0 = new a();

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.f$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f = LayoutInflaterFactory2C4402f.this;
            if ((layoutInflaterFactory2C4402f.f38009b0 & 1) != 0) {
                layoutInflaterFactory2C4402f.M(0);
            }
            if ((layoutInflaterFactory2C4402f.f38009b0 & 4096) != 0) {
                layoutInflaterFactory2C4402f.M(108);
            }
            layoutInflaterFactory2C4402f.f38008a0 = false;
            layoutInflaterFactory2C4402f.f38009b0 = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.f$b */
    public class b implements InterfaceC4398b {
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.f$c */
    public final class c implements j.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
            LayoutInflaterFactory2C4402f.this.I(fVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            Window.Callback callback = LayoutInflaterFactory2C4402f.this.f38019m.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, fVar);
            return true;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.f$d */
    public class d implements AbstractC5304a.InterfaceC0495a {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC5304a.InterfaceC0495a f38035a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* renamed from: h.f$d$a */
        public class a extends A2.l {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f38037c;

            public a(d dVar) {
                super(13);
                this.f38037c = dVar;
            }

            @Override // L0.T
            public final void e() {
                d dVar = this.f38037c;
                LayoutInflaterFactory2C4402f.this.f38029w.setVisibility(8);
                LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f = LayoutInflaterFactory2C4402f.this;
                PopupWindow popupWindow = layoutInflaterFactory2C4402f.f38030x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C4402f.f38029w.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C4402f.f38029w.getParent();
                    WeakHashMap<View, S> weakHashMap = I.f3792a;
                    I.c.c(view);
                }
                layoutInflaterFactory2C4402f.f38029w.h();
                layoutInflaterFactory2C4402f.f38032z.d(null);
                layoutInflaterFactory2C4402f.f38032z = null;
                ViewGroup viewGroup = layoutInflaterFactory2C4402f.f37984C;
                WeakHashMap<View, S> weakHashMap2 = I.f3792a;
                I.c.c(viewGroup);
            }
        }

        public d(AbstractC5304a.InterfaceC0495a interfaceC0495a) {
            this.f38035a = interfaceC0495a;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [h.d, java.lang.Object] */
        @Override // m.AbstractC5304a.InterfaceC0495a
        public final void a(AbstractC5304a abstractC5304a) {
            this.f38035a.a(abstractC5304a);
            LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f = LayoutInflaterFactory2C4402f.this;
            if (layoutInflaterFactory2C4402f.f38030x != null) {
                layoutInflaterFactory2C4402f.f38019m.getDecorView().removeCallbacks(layoutInflaterFactory2C4402f.f38031y);
            }
            if (layoutInflaterFactory2C4402f.f38029w != null) {
                S s10 = layoutInflaterFactory2C4402f.f38032z;
                if (s10 != null) {
                    s10.b();
                }
                S sA = I.a(layoutInflaterFactory2C4402f.f38029w);
                sA.a(0.0f);
                layoutInflaterFactory2C4402f.f38032z = sA;
                sA.d(new a(this));
            }
            ?? r02 = layoutInflaterFactory2C4402f.f38021o;
            if (r02 != 0) {
                r02.onSupportActionModeFinished(layoutInflaterFactory2C4402f.f38028v);
            }
            layoutInflaterFactory2C4402f.f38028v = null;
            ViewGroup viewGroup = layoutInflaterFactory2C4402f.f37984C;
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            I.c.c(viewGroup);
            layoutInflaterFactory2C4402f.a0();
        }

        @Override // m.AbstractC5304a.InterfaceC0495a
        public final boolean b(AbstractC5304a abstractC5304a, androidx.appcompat.view.menu.f fVar) {
            return this.f38035a.b(abstractC5304a, fVar);
        }

        @Override // m.AbstractC5304a.InterfaceC0495a
        public final boolean c(AbstractC5304a abstractC5304a, MenuItem menuItem) {
            return this.f38035a.c(abstractC5304a, menuItem);
        }

        @Override // m.AbstractC5304a.InterfaceC0495a
        public final boolean d(AbstractC5304a abstractC5304a, androidx.appcompat.view.menu.f fVar) {
            ViewGroup viewGroup = LayoutInflaterFactory2C4402f.this.f37984C;
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            I.c.c(viewGroup);
            return this.f38035a.d(abstractC5304a, fVar);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.f$e */
    public static class e {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.f$f, reason: collision with other inner class name */
    public static class C0462f {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static G0.j b(Configuration configuration) {
            return G0.j.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(G0.j jVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(jVar.f1852a.a()));
        }

        public static void d(Configuration configuration, G0.j jVar) {
            configuration.setLocales(LocaleList.forLanguageTags(jVar.f1852a.a()));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.f$g */
    public static class g {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.window.OnBackInvokedCallback, h.j] */
        public static OnBackInvokedCallback b(Object obj, final LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f) {
            Objects.requireNonNull(layoutInflaterFactory2C4402f);
            ?? r02 = new OnBackInvokedCallback() { // from class: h.j
                public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    layoutInflaterFactory2C4402f.V();
                }
            };
            com.applovin.adview.a.b(obj).registerOnBackInvokedCallback(1000000, r02);
            return r02;
        }

        public static void c(Object obj, Object obj2) {
            com.applovin.adview.a.b(obj).unregisterOnBackInvokedCallback(L4.g.d(obj2));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.f$i */
    public class i extends j {

        /* renamed from: c, reason: collision with root package name */
        public final PowerManager f38043c;

        public i(Context context) {
            super();
            this.f38043c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // h.LayoutInflaterFactory2C4402f.j
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // h.LayoutInflaterFactory2C4402f.j
        public final int c() {
            return e.a(this.f38043c) ? 2 : 1;
        }

        @Override // h.LayoutInflaterFactory2C4402f.j
        public final void d() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
            LayoutInflaterFactory2C4402f.this.E(true, true);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.f$j */
    public abstract class j {

        /* renamed from: a, reason: collision with root package name */
        public a f38045a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* renamed from: h.f$j$a */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                j.this.d();
            }
        }

        public j() {
        }

        public final void a() {
            a aVar = this.f38045a;
            if (aVar != null) {
                try {
                    LayoutInflaterFactory2C4402f.this.f38018l.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f38045a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f38045a == null) {
                this.f38045a = new a();
            }
            LayoutInflaterFactory2C4402f.this.f38018l.registerReceiver(this.f38045a, intentFilterB);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.f$k */
    public class k extends j {

        /* renamed from: c, reason: collision with root package name */
        public final s f38048c;

        public k(s sVar) {
            super();
            this.f38048c = sVar;
        }

        @Override // h.LayoutInflaterFactory2C4402f.j
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // h.LayoutInflaterFactory2C4402f.j
        public final int c() {
            Location location;
            boolean z10;
            long j4;
            s sVar = this.f38048c;
            s.a aVar = sVar.f38117c;
            if (aVar.f38119b > System.currentTimeMillis()) {
                z10 = aVar.f38118a;
            } else {
                Context context = sVar.f38115a;
                int iS = u.s(context, "android.permission.ACCESS_COARSE_LOCATION");
                Location lastKnownLocation = null;
                LocationManager locationManager = sVar.f38116b;
                if (iS == 0) {
                    try {
                    } catch (Exception e4) {
                        Log.d("TwilightManager", "Failed to get last known location", e4);
                    }
                    Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                    location = lastKnownLocation2;
                } else {
                    location = null;
                }
                if (u.s(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            lastKnownLocation = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception e10) {
                        Log.d("TwilightManager", "Failed to get last known location", e10);
                    }
                }
                if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                    location = lastKnownLocation;
                }
                if (location != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (r.f38110d == null) {
                        r.f38110d = new r();
                    }
                    r rVar = r.f38110d;
                    rVar.a(jCurrentTimeMillis - com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS, location.getLatitude(), location.getLongitude());
                    rVar.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                    z10 = rVar.f38113c == 1;
                    long j10 = rVar.f38112b;
                    long j11 = rVar.f38111a;
                    rVar.a(com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                    long j12 = rVar.f38112b;
                    if (j10 == -1 || j11 == -1) {
                        j4 = jCurrentTimeMillis + 43200000;
                    } else {
                        if (jCurrentTimeMillis <= j11) {
                            j12 = jCurrentTimeMillis > j10 ? j11 : j10;
                        }
                        j4 = j12 + 60000;
                    }
                    aVar.f38118a = z10;
                    aVar.f38119b = j4;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i = Calendar.getInstance().get(11);
                    if (i < 6 || i >= 22) {
                        z10 = true;
                    }
                }
            }
            return z10 ? 2 : 1;
        }

        @Override // h.LayoutInflaterFactory2C4402f.j
        public final void d() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
            LayoutInflaterFactory2C4402f.this.E(true, true);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.f$l */
    public class l extends ContentFrameLayout {
        public l(C5306c c5306c) {
            super(c5306c, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C4402f.this.L(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x10 < -5 || y10 < -5 || x10 > getWidth() + 5 || y10 > getHeight() + 5) {
                    LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f = LayoutInflaterFactory2C4402f.this;
                    layoutInflaterFactory2C4402f.J(layoutInflaterFactory2C4402f.R(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(A9.I.w(getContext(), i));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.f$m */
    public static final class m {

        /* renamed from: a, reason: collision with root package name */
        public int f38051a;

        /* renamed from: b, reason: collision with root package name */
        public int f38052b;

        /* renamed from: c, reason: collision with root package name */
        public int f38053c;

        /* renamed from: d, reason: collision with root package name */
        public int f38054d;

        /* renamed from: e, reason: collision with root package name */
        public l f38055e;

        /* renamed from: f, reason: collision with root package name */
        public View f38056f;

        /* renamed from: g, reason: collision with root package name */
        public View f38057g;

        /* renamed from: h, reason: collision with root package name */
        public androidx.appcompat.view.menu.f f38058h;
        public androidx.appcompat.view.menu.d i;

        /* renamed from: j, reason: collision with root package name */
        public C5306c f38059j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f38060k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f38061l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f38062m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f38063n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f38064o;

        /* renamed from: p, reason: collision with root package name */
        public Bundle f38065p;
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.f$n */
    public final class n implements j.a {
        public n() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
            m mVar;
            androidx.appcompat.view.menu.f fVarK = fVar.k();
            int i = 0;
            boolean z11 = fVarK != fVar;
            if (z11) {
                fVar = fVarK;
            }
            LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f = LayoutInflaterFactory2C4402f.this;
            m[] mVarArr = layoutInflaterFactory2C4402f.f37995N;
            int length = mVarArr != null ? mVarArr.length : 0;
            while (true) {
                if (i < length) {
                    mVar = mVarArr[i];
                    if (mVar != null && mVar.f38058h == fVar) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    mVar = null;
                    break;
                }
            }
            if (mVar != null) {
                if (!z11) {
                    layoutInflaterFactory2C4402f.J(mVar, z10);
                } else {
                    layoutInflaterFactory2C4402f.H(mVar.f38051a, mVar, fVarK);
                    layoutInflaterFactory2C4402f.J(mVar, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            Window.Callback callback;
            if (fVar != fVar.k()) {
                return true;
            }
            LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f = LayoutInflaterFactory2C4402f.this;
            if (!layoutInflaterFactory2C4402f.f37989H || (callback = layoutInflaterFactory2C4402f.f38019m.getCallback()) == null || layoutInflaterFactory2C4402f.f38000S) {
                return true;
            }
            callback.onMenuOpened(108, fVar);
            return true;
        }
    }

    public LayoutInflaterFactory2C4402f(Context context, Window window, InterfaceC4400d interfaceC4400d, Object obj) {
        C5316i<String, Integer> c5316i;
        Integer num;
        AppCompatActivity appCompatActivity = null;
        this.f38002U = -100;
        this.f38018l = context;
        this.f38021o = interfaceC4400d;
        this.f38017k = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AppCompatActivity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        appCompatActivity = (AppCompatActivity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (appCompatActivity != null) {
                this.f38002U = appCompatActivity.getDelegate().i();
            }
        }
        if (this.f38002U == -100 && (num = (c5316i = f37979j0).get(this.f38017k.getClass().getName())) != null) {
            this.f38002U = num.intValue();
            c5316i.remove(this.f38017k.getClass().getName());
        }
        if (window != null) {
            F(window);
        }
        C5390h.d();
    }

    public static G0.j G(Context context) {
        G0.j jVar;
        G0.j jVarB;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || (jVar = AbstractC4401e.f37969d) == null) {
            return null;
        }
        G0.j jVarQ = Q(context.getApplicationContext().getResources().getConfiguration());
        G0.l lVar = jVar.f1852a;
        int i11 = 0;
        if (i10 < 24) {
            jVarB = lVar.isEmpty() ? G0.j.f1851b : G0.j.b(e.b(lVar.get(0)));
        } else if (lVar.isEmpty()) {
            jVarB = G0.j.f1851b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i11 < jVarQ.f1852a.size() + lVar.size()) {
                Locale locale = i11 < lVar.size() ? lVar.get(i11) : jVarQ.f1852a.get(i11 - lVar.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i11++;
            }
            jVarB = G0.j.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return jVarB.f1852a.isEmpty() ? jVarQ : jVarB;
    }

    public static Configuration K(Context context, int i10, G0.j jVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (jVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                C0462f.d(configuration2, jVar);
                return configuration2;
            }
            G0.l lVar = jVar.f1852a;
            configuration2.setLocale(lVar.get(0));
            configuration2.setLayoutDirection(lVar.get(0));
        }
        return configuration2;
    }

    public static G0.j Q(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? C0462f.b(configuration) : G0.j.b(e.b(configuration.locale));
    }

    @Override // h.AbstractC4401e
    public final void A(Toolbar toolbar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object obj = this.f38017k;
        if (obj instanceof Activity) {
            S();
            AbstractC4397a abstractC4397a = this.f38022p;
            if (abstractC4397a instanceof t) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f38023q = null;
            if (abstractC4397a != null) {
                abstractC4397a.h();
            }
            this.f38022p = null;
            if (toolbar != null) {
                q qVar = new q(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f38024r, this.f38020n);
                this.f38022p = qVar;
                this.f38020n.f38038c = qVar.f38098c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f38020n.f38038c = null;
            }
            m();
        }
    }

    @Override // h.AbstractC4401e
    public final void B(int i10) {
        this.f38003V = i10;
    }

    @Override // h.AbstractC4401e
    public final void C(CharSequence charSequence) {
        this.f38024r = charSequence;
        InterfaceC5373A interfaceC5373A = this.f38025s;
        if (interfaceC5373A != null) {
            interfaceC5373A.setWindowTitle(charSequence);
            return;
        }
        AbstractC4397a abstractC4397a = this.f38022p;
        if (abstractC4397a != null) {
            abstractC4397a.p(charSequence);
            return;
        }
        TextView textView = this.f37985D;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Type inference failed for: r1v0, types: [h.d, java.lang.Object] */
    @Override // h.AbstractC4401e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m.AbstractC5304a D(m.AbstractC5304a.InterfaceC0495a r9) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.LayoutInflaterFactory2C4402f.D(m.a$a):m.a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E(boolean r18, boolean r19) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.LayoutInflaterFactory2C4402f.E(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(android.view.Window r8) {
        /*
            r7 = this;
            android.view.Window r0 = r7.f38019m
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L80
            android.view.Window$Callback r0 = r8.getCallback()
            boolean r2 = r0 instanceof h.LayoutInflaterFactory2C4402f.h
            if (r2 != 0) goto L7a
            h.f$h r1 = new h.f$h
            r1.<init>(r0)
            r7.f38020n = r1
            r8.setCallback(r1)
            android.content.Context r0 = r7.f38018l
            int[] r1 = h.LayoutInflaterFactory2C4402f.f37980k0
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            o.h r4 = o.C5390h.a()
            monitor-enter(r4)
            o.N r5 = r4.f44676a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r0 = r5.f(r3, r0, r6)     // Catch: java.lang.Throwable -> L3c
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
            r7.f38019m = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.f38015h0
            if (r8 != 0) goto L79
            if (r8 == 0) goto L5f
            android.window.OnBackInvokedCallback r0 = r7.f38016i0
            if (r0 == 0) goto L5f
            h.LayoutInflaterFactory2C4402f.g.c(r8, r0)
            r7.f38016i0 = r2
        L5f:
            java.lang.Object r8 = r7.f38017k
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L74
            android.app.Activity r8 = (android.app.Activity) r8
            android.view.Window r0 = r8.getWindow()
            if (r0 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = h.LayoutInflaterFactory2C4402f.g.a(r8)
            r7.f38015h0 = r8
            goto L76
        L74:
            r7.f38015h0 = r2
        L76:
            r7.a0()
        L79:
            return
        L7a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h.LayoutInflaterFactory2C4402f.F(android.view.Window):void");
    }

    public final void H(int i10, m mVar, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (mVar == null && i10 >= 0) {
                m[] mVarArr = this.f37995N;
                if (i10 < mVarArr.length) {
                    mVar = mVarArr[i10];
                }
            }
            if (mVar != null) {
                fVar = mVar.f38058h;
            }
        }
        if ((mVar == null || mVar.f38062m) && !this.f38000S) {
            h hVar = this.f38020n;
            Window.Callback callback = this.f38019m.getCallback();
            hVar.getClass();
            try {
                hVar.f38041f = true;
                callback.onPanelClosed(i10, fVar);
            } finally {
                hVar.f38041f = false;
            }
        }
    }

    public final void I(androidx.appcompat.view.menu.f fVar) {
        if (this.f37994M) {
            return;
        }
        this.f37994M = true;
        this.f38025s.i();
        Window.Callback callback = this.f38019m.getCallback();
        if (callback != null && !this.f38000S) {
            callback.onPanelClosed(108, fVar);
        }
        this.f37994M = false;
    }

    public final void J(m mVar, boolean z10) {
        l lVar;
        InterfaceC5373A interfaceC5373A;
        if (z10 && mVar.f38051a == 0 && (interfaceC5373A = this.f38025s) != null && interfaceC5373A.a()) {
            I(mVar.f38058h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f38018l.getSystemService("window");
        if (windowManager != null && mVar.f38062m && (lVar = mVar.f38055e) != null) {
            windowManager.removeView(lVar);
            if (z10) {
                H(mVar.f38051a, mVar, null);
            }
        }
        mVar.f38060k = false;
        mVar.f38061l = false;
        mVar.f38062m = false;
        mVar.f38056f = null;
        mVar.f38063n = true;
        if (this.f37996O == mVar) {
            this.f37996O = null;
        }
        if (mVar.f38051a == 0) {
            a0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean L(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.LayoutInflaterFactory2C4402f.L(android.view.KeyEvent):boolean");
    }

    public final void M(int i10) {
        m mVarR = R(i10);
        if (mVarR.f38058h != null) {
            Bundle bundle = new Bundle();
            mVarR.f38058h.t(bundle);
            if (bundle.size() > 0) {
                mVarR.f38065p = bundle;
            }
            mVarR.f38058h.w();
            mVarR.f38058h.clear();
        }
        mVarR.f38064o = true;
        mVarR.f38063n = true;
        if ((i10 == 108 || i10 == 0) && this.f38025s != null) {
            m mVarR2 = R(0);
            mVarR2.f38060k = false;
            Y(mVarR2, null);
        }
    }

    public final void N() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (this.f37983B) {
            return;
        }
        int[] iArr = C4353a.f37884j;
        Context context = this.f38018l;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            w(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            w(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            w(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            w(10);
        }
        this.f37992K = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        O();
        this.f38019m.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f37993L) {
            viewGroup = this.f37991J ? (ViewGroup) layoutInflaterFrom.inflate(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f37992K) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f37990I = false;
            this.f37989H = false;
        } else if (this.f37989H) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C5306c(context, typedValue.resourceId) : context).inflate(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC5373A interfaceC5373A = (InterfaceC5373A) viewGroup.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.decor_content_parent);
            this.f38025s = interfaceC5373A;
            interfaceC5373A.setWindowCallback(this.f38019m.getCallback());
            if (this.f37990I) {
                this.f38025s.h(109);
            }
            if (this.f37987F) {
                this.f38025s.h(2);
            }
            if (this.f37988G) {
                this.f38025s.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.f37989H);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f37990I);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f37992K);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.f37991J);
            sb.append(", windowNoTitle: ");
            throw new IllegalArgumentException(androidx.work.s.h(sb, this.f37993L, " }"));
        }
        H6.I i10 = new H6.I(this, 11);
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        I.d.u(viewGroup, i10);
        if (this.f38025s == null) {
            this.f37985D = (TextView) viewGroup.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.title);
        }
        boolean z10 = f0.f44665a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e4) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e4);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e10) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f38019m.findViewById(R.id.content);
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
        this.f38019m.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C4403g(this));
        this.f37984C = viewGroup;
        Object obj = this.f38017k;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f38024r;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC5373A interfaceC5373A2 = this.f38025s;
            if (interfaceC5373A2 != null) {
                interfaceC5373A2.setWindowTitle(title);
            } else {
                AbstractC4397a abstractC4397a = this.f38022p;
                if (abstractC4397a != null) {
                    abstractC4397a.p(title);
                } else {
                    TextView textView = this.f37985D;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f37984C.findViewById(R.id.content);
        View decorView = this.f38019m.getDecorView();
        contentFrameLayout2.f14627h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f37983B = true;
        m mVarR = R(0);
        if (this.f38000S || mVarR.f38058h != null) {
            return;
        }
        T(108);
    }

    public final void O() {
        if (this.f38019m == null) {
            Object obj = this.f38017k;
            if (obj instanceof Activity) {
                F(((Activity) obj).getWindow());
            }
        }
        if (this.f38019m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final j P(Context context) {
        if (this.f38006Y == null) {
            if (s.f38114d == null) {
                Context applicationContext = context.getApplicationContext();
                s.f38114d = new s(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f38006Y = new k(s.f38114d);
        }
        return this.f38006Y;
    }

    public final m R(int i10) {
        m[] mVarArr = this.f37995N;
        if (mVarArr == null || mVarArr.length <= i10) {
            m[] mVarArr2 = new m[i10 + 1];
            if (mVarArr != null) {
                System.arraycopy(mVarArr, 0, mVarArr2, 0, mVarArr.length);
            }
            this.f37995N = mVarArr2;
            mVarArr = mVarArr2;
        }
        m mVar = mVarArr[i10];
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m();
        mVar2.f38051a = i10;
        mVar2.f38063n = false;
        mVarArr[i10] = mVar2;
        return mVar2;
    }

    public final void S() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        N();
        if (this.f37989H && this.f38022p == null) {
            Object obj = this.f38017k;
            if (obj instanceof Activity) {
                this.f38022p = new t(this.f37990I, (Activity) obj);
            } else if (obj instanceof Dialog) {
                this.f38022p = new t((Dialog) obj);
            }
            AbstractC4397a abstractC4397a = this.f38022p;
            if (abstractC4397a != null) {
                abstractC4397a.l(this.f38011d0);
            }
        }
    }

    public final void T(int i10) {
        this.f38009b0 = (1 << i10) | this.f38009b0;
        if (this.f38008a0) {
            return;
        }
        View decorView = this.f38019m.getDecorView();
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        decorView.postOnAnimation(this.f38010c0);
        this.f38008a0 = true;
    }

    public final int U(Context context, int i10) {
        if (i10 != -100) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1 && i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f38007Z == null) {
                            this.f38007Z = new i(context);
                        }
                        return this.f38007Z.c();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return P(context).c();
                }
            }
            return i10;
        }
        return -1;
    }

    public final boolean V() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z10 = this.f37997P;
        this.f37997P = false;
        m mVarR = R(0);
        if (!mVarR.f38062m) {
            AbstractC5304a abstractC5304a = this.f38028v;
            if (abstractC5304a != null) {
                abstractC5304a.c();
                return true;
            }
            S();
            AbstractC4397a abstractC4397a = this.f38022p;
            if (abstractC4397a == null || !abstractC4397a.b()) {
                return false;
            }
        } else if (!z10) {
            J(mVarR, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        if (r3.f14421g.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(h.LayoutInflaterFactory2C4402f.m r18, android.view.KeyEvent r19) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.LayoutInflaterFactory2C4402f.W(h.f$m, android.view.KeyEvent):void");
    }

    public final boolean X(m mVar, int i10, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((mVar.f38060k || Y(mVar, keyEvent)) && (fVar = mVar.f38058h) != null) {
            return fVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Y(h.LayoutInflaterFactory2C4402f.m r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.LayoutInflaterFactory2C4402f.Y(h.f$m, android.view.KeyEvent):boolean");
    }

    public final void Z() {
        if (this.f37983B) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        m mVar;
        Window.Callback callback = this.f38019m.getCallback();
        if (callback != null && !this.f38000S) {
            androidx.appcompat.view.menu.f fVarK = fVar.k();
            m[] mVarArr = this.f37995N;
            int length = mVarArr != null ? mVarArr.length : 0;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    mVar = mVarArr[i10];
                    if (mVar != null && mVar.f38058h == fVarK) {
                        break;
                    }
                    i10++;
                } else {
                    mVar = null;
                    break;
                }
            }
            if (mVar != null) {
                return callback.onMenuItemSelected(mVar.f38051a, menuItem);
            }
        }
        return false;
    }

    public final void a0() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f38015h0 != null && (R(0).f38062m || this.f38028v != null)) {
                z10 = true;
            }
            if (z10 && this.f38016i0 == null) {
                this.f38016i0 = g.b(this.f38015h0, this);
            } else {
                if (z10 || (onBackInvokedCallback = this.f38016i0) == null) {
                    return;
                }
                g.c(this.f38015h0, onBackInvokedCallback);
                this.f38016i0 = null;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        InterfaceC5373A interfaceC5373A = this.f38025s;
        if (interfaceC5373A == null || !interfaceC5373A.c() || (ViewConfiguration.get(this.f38018l).hasPermanentMenuKey() && !this.f38025s.e())) {
            m mVarR = R(0);
            mVarR.f38063n = true;
            J(mVarR, false);
            W(mVarR, null);
            return;
        }
        Window.Callback callback = this.f38019m.getCallback();
        if (this.f38025s.a()) {
            this.f38025s.f();
            if (this.f38000S) {
                return;
            }
            callback.onPanelClosed(108, R(0).f38058h);
            return;
        }
        if (callback == null || this.f38000S) {
            return;
        }
        if (this.f38008a0 && (1 & this.f38009b0) != 0) {
            View decorView = this.f38019m.getDecorView();
            a aVar = this.f38010c0;
            decorView.removeCallbacks(aVar);
            aVar.run();
        }
        m mVarR2 = R(0);
        androidx.appcompat.view.menu.f fVar2 = mVarR2.f38058h;
        if (fVar2 == null || mVarR2.f38064o || !callback.onPreparePanel(0, mVarR2.f38057g, fVar2)) {
            return;
        }
        callback.onMenuOpened(108, mVarR2.f38058h);
        this.f38025s.g();
    }

    @Override // h.AbstractC4401e
    public final void c(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        N();
        ((ViewGroup) this.f37984C.findViewById(R.id.content)).addView(view, layoutParams);
        this.f38020n.a(this.f38019m.getCallback());
    }

    @Override // h.AbstractC4401e
    public final boolean d() {
        return E(true, true);
    }

    @Override // h.AbstractC4401e
    public final Context e(Context context) {
        this.f37998Q = true;
        int i10 = this.f38002U;
        if (i10 == -100) {
            i10 = AbstractC4401e.f37968c;
        }
        int iU = U(context, i10);
        if (AbstractC4401e.n(context) && AbstractC4401e.n(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC4401e.f37974j) {
                    try {
                        G0.j jVar = AbstractC4401e.f37969d;
                        if (jVar == null) {
                            if (AbstractC4401e.f37970e == null) {
                                AbstractC4401e.f37970e = G0.j.b(y0.e.b(context));
                            }
                            if (!AbstractC4401e.f37970e.f1852a.isEmpty()) {
                                AbstractC4401e.f37969d = AbstractC4401e.f37970e;
                            }
                        } else if (!jVar.equals(AbstractC4401e.f37970e)) {
                            G0.j jVar2 = AbstractC4401e.f37969d;
                            AbstractC4401e.f37970e = jVar2;
                            y0.e.a(context, jVar2.f1852a.a());
                        }
                    } finally {
                    }
                }
            } else if (!AbstractC4401e.f37972g) {
                AbstractC4401e.f37967b.execute(new com.vungle.ads.internal.util.a(context, 4));
            }
        }
        G0.j jVarG = G(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(K(context, iU, jVarG, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C5306c) {
            try {
                ((C5306c) context).a(K(context, iU, jVarG, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f37981l0) {
            return context;
        }
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
                int i11 = configuration3.mcc;
                int i12 = configuration4.mcc;
                if (i11 != i12) {
                    configuration.mcc = i12;
                }
                int i13 = configuration3.mnc;
                int i14 = configuration4.mnc;
                if (i13 != i14) {
                    configuration.mnc = i14;
                }
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 24) {
                    C0462f.a(configuration3, configuration4, configuration);
                } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                    configuration.locale = configuration4.locale;
                }
                int i16 = configuration3.touchscreen;
                int i17 = configuration4.touchscreen;
                if (i16 != i17) {
                    configuration.touchscreen = i17;
                }
                int i18 = configuration3.keyboard;
                int i19 = configuration4.keyboard;
                if (i18 != i19) {
                    configuration.keyboard = i19;
                }
                int i20 = configuration3.keyboardHidden;
                int i21 = configuration4.keyboardHidden;
                if (i20 != i21) {
                    configuration.keyboardHidden = i21;
                }
                int i22 = configuration3.navigation;
                int i23 = configuration4.navigation;
                if (i22 != i23) {
                    configuration.navigation = i23;
                }
                int i24 = configuration3.navigationHidden;
                int i25 = configuration4.navigationHidden;
                if (i24 != i25) {
                    configuration.navigationHidden = i25;
                }
                int i26 = configuration3.orientation;
                int i27 = configuration4.orientation;
                if (i26 != i27) {
                    configuration.orientation = i27;
                }
                int i28 = configuration3.screenLayout & 15;
                int i29 = configuration4.screenLayout & 15;
                if (i28 != i29) {
                    configuration.screenLayout |= i29;
                }
                int i30 = configuration3.screenLayout & 192;
                int i31 = configuration4.screenLayout & 192;
                if (i30 != i31) {
                    configuration.screenLayout |= i31;
                }
                int i32 = configuration3.screenLayout & 48;
                int i33 = configuration4.screenLayout & 48;
                if (i32 != i33) {
                    configuration.screenLayout |= i33;
                }
                int i34 = configuration3.screenLayout & 768;
                int i35 = configuration4.screenLayout & 768;
                if (i34 != i35) {
                    configuration.screenLayout |= i35;
                }
                if (i15 >= 26) {
                    if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                        configuration.colorMode |= configuration4.colorMode & 3;
                    }
                    if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                        configuration.colorMode |= configuration4.colorMode & 12;
                    }
                }
                int i36 = configuration3.uiMode & 15;
                int i37 = configuration4.uiMode & 15;
                if (i36 != i37) {
                    configuration.uiMode |= i37;
                }
                int i38 = configuration3.uiMode & 48;
                int i39 = configuration4.uiMode & 48;
                if (i38 != i39) {
                    configuration.uiMode |= i39;
                }
                int i40 = configuration3.screenWidthDp;
                int i41 = configuration4.screenWidthDp;
                if (i40 != i41) {
                    configuration.screenWidthDp = i41;
                }
                int i42 = configuration3.screenHeightDp;
                int i43 = configuration4.screenHeightDp;
                if (i42 != i43) {
                    configuration.screenHeightDp = i43;
                }
                int i44 = configuration3.smallestScreenWidthDp;
                int i45 = configuration4.smallestScreenWidthDp;
                if (i44 != i45) {
                    configuration.smallestScreenWidthDp = i45;
                }
                int i46 = configuration3.densityDpi;
                int i47 = configuration4.densityDpi;
                if (i46 != i47) {
                    configuration.densityDpi = i47;
                }
            }
        }
        Configuration configurationK = K(context, iU, jVarG, configuration, true);
        C5306c c5306c = new C5306c(context, 2132017797);
        c5306c.a(configurationK);
        try {
            if (context.getTheme() != null) {
                g.f.a(c5306c.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return c5306c;
    }

    @Override // h.AbstractC4401e
    public final <T extends View> T f(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        N();
        return (T) this.f38019m.findViewById(i10);
    }

    @Override // h.AbstractC4401e
    public final Context g() {
        return this.f38018l;
    }

    @Override // h.AbstractC4401e
    public final b h() {
        return new b();
    }

    @Override // h.AbstractC4401e
    public final int i() {
        return this.f38002U;
    }

    @Override // h.AbstractC4401e
    public final MenuInflater j() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f38023q == null) {
            S();
            AbstractC4397a abstractC4397a = this.f38022p;
            this.f38023q = new m.f(abstractC4397a != null ? abstractC4397a.e() : this.f38018l);
        }
        return this.f38023q;
    }

    @Override // h.AbstractC4401e
    public final AbstractC4397a k() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        S();
        return this.f38022p;
    }

    @Override // h.AbstractC4401e
    public final void l() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f38018l);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C4402f) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // h.AbstractC4401e
    public final void m() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f38022p != null) {
            S();
            if (this.f38022p.f()) {
                return;
            }
            T(0);
        }
    }

    @Override // h.AbstractC4401e
    public final void o(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f37989H && this.f37983B) {
            S();
            AbstractC4397a abstractC4397a = this.f38022p;
            if (abstractC4397a != null) {
                abstractC4397a.g();
            }
        }
        C5390h c5390hA = C5390h.a();
        Context context = this.f38018l;
        synchronized (c5390hA) {
            c5390hA.f44676a.l(context);
        }
        this.f38001T = new Configuration(this.f38018l.getResources().getConfiguration());
        E(false, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r10, java.lang.String r11, android.content.Context r12, android.util.AttributeSet r13) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.LayoutInflaterFactory2C4402f.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // h.AbstractC4401e
    public final void p() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        String strC;
        this.f37998Q = true;
        E(false, true);
        O();
        Object obj = this.f38017k;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = y0.k.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e4) {
                    throw new IllegalArgumentException(e4);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                AbstractC4397a abstractC4397a = this.f38022p;
                if (abstractC4397a == null) {
                    this.f38011d0 = true;
                } else {
                    abstractC4397a.l(true);
                }
            }
            synchronized (AbstractC4401e.i) {
                AbstractC4401e.v(this);
                AbstractC4401e.f37973h.add(new WeakReference<>(this));
            }
        }
        this.f38001T = new Configuration(this.f38018l.getResources().getConfiguration());
        this.f37999R = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // h.AbstractC4401e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f38017k
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = h.AbstractC4401e.i
            monitor-enter(r0)
            h.AbstractC4401e.v(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f38008a0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f38019m
            android.view.View r0 = r0.getDecorView()
            h.f$a r1 = r3.f38010c0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f38000S = r0
            int r0 = r3.f38002U
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f38017k
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            m0.i<java.lang.String, java.lang.Integer> r0 = h.LayoutInflaterFactory2C4402f.f37979j0
            java.lang.Object r1 = r3.f38017k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f38002U
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            m0.i<java.lang.String, java.lang.Integer> r0 = h.LayoutInflaterFactory2C4402f.f37979j0
            java.lang.Object r1 = r3.f38017k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            h.a r0 = r3.f38022p
            if (r0 == 0) goto L63
            r0.h()
        L63:
            h.f$k r0 = r3.f38006Y
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            h.f$i r0 = r3.f38007Z
            if (r0 == 0) goto L71
            r0.a()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.LayoutInflaterFactory2C4402f.q():void");
    }

    @Override // h.AbstractC4401e
    public final void r() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        N();
    }

    @Override // h.AbstractC4401e
    public final void s() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        S();
        AbstractC4397a abstractC4397a = this.f38022p;
        if (abstractC4397a != null) {
            abstractC4397a.n(true);
        }
    }

    @Override // h.AbstractC4401e
    public final void t() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        E(true, false);
    }

    @Override // h.AbstractC4401e
    public final void u() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        S();
        AbstractC4397a abstractC4397a = this.f38022p;
        if (abstractC4397a != null) {
            abstractC4397a.n(false);
        }
    }

    @Override // h.AbstractC4401e
    public final boolean w(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.f37993L && i10 == 108) {
            return false;
        }
        if (this.f37989H && i10 == 1) {
            this.f37989H = false;
        }
        if (i10 == 1) {
            Z();
            this.f37993L = true;
            return true;
        }
        if (i10 == 2) {
            Z();
            this.f37987F = true;
            return true;
        }
        if (i10 == 5) {
            Z();
            this.f37988G = true;
            return true;
        }
        if (i10 == 10) {
            Z();
            this.f37991J = true;
            return true;
        }
        if (i10 == 108) {
            Z();
            this.f37989H = true;
            return true;
        }
        if (i10 != 109) {
            return this.f38019m.requestFeature(i10);
        }
        Z();
        this.f37990I = true;
        return true;
    }

    @Override // h.AbstractC4401e
    public final void x(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        N();
        ViewGroup viewGroup = (ViewGroup) this.f37984C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f38018l).inflate(i10, viewGroup);
        this.f38020n.a(this.f38019m.getCallback());
    }

    @Override // h.AbstractC4401e
    public final void y(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        N();
        ViewGroup viewGroup = (ViewGroup) this.f37984C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f38020n.a(this.f38019m.getCallback());
    }

    @Override // h.AbstractC4401e
    public final void z(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        N();
        ViewGroup viewGroup = (ViewGroup) this.f37984C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f38020n.a(this.f38019m.getCallback());
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.f$h */
    public class h extends m.h {

        /* renamed from: c, reason: collision with root package name */
        public q.e f38038c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f38039d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f38040e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f38041f;

        public h(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.f38039d = true;
                callback.onContentChanged();
            } finally {
                this.f38039d = false;
            }
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            boolean z10 = this.f38040e;
            Window.Callback callback = this.f43995b;
            return z10 ? callback.dispatchKeyEvent(keyEvent) : LayoutInflaterFactory2C4402f.this.L(keyEvent) || callback.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (!this.f43995b.dispatchKeyShortcutEvent(keyEvent)) {
                int keyCode = keyEvent.getKeyCode();
                LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f = LayoutInflaterFactory2C4402f.this;
                layoutInflaterFactory2C4402f.S();
                AbstractC4397a abstractC4397a = layoutInflaterFactory2C4402f.f38022p;
                if (abstractC4397a == null || !abstractC4397a.i(keyCode, keyEvent)) {
                    m mVar = layoutInflaterFactory2C4402f.f37996O;
                    if (mVar == null || !layoutInflaterFactory2C4402f.X(mVar, keyEvent.getKeyCode(), keyEvent)) {
                        if (layoutInflaterFactory2C4402f.f37996O == null) {
                            m mVarR = layoutInflaterFactory2C4402f.R(0);
                            layoutInflaterFactory2C4402f.Y(mVarR, keyEvent);
                            boolean zX = layoutInflaterFactory2C4402f.X(mVarR, keyEvent.getKeyCode(), keyEvent);
                            mVarR.f38060k = false;
                            if (zX) {
                            }
                        }
                        return false;
                    }
                    m mVar2 = layoutInflaterFactory2C4402f.f37996O;
                    if (mVar2 != null) {
                        mVar2.f38061l = true;
                        return true;
                    }
                }
            }
            return true;
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f38039d) {
                this.f43995b.onContentChanged();
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return this.f43995b.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public final View onCreatePanelView(int i) {
            q.e eVar = this.f38038c;
            if (eVar != null) {
                View view = i == 0 ? new View(q.this.f38096a.f14783a.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return this.f43995b.onCreatePanelView(i);
        }

        @Override // m.h, android.view.Window.Callback
        public final boolean onMenuOpened(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            super.onMenuOpened(i, menu);
            LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f = LayoutInflaterFactory2C4402f.this;
            if (i == 108) {
                layoutInflaterFactory2C4402f.S();
                AbstractC4397a abstractC4397a = layoutInflaterFactory2C4402f.f38022p;
                if (abstractC4397a != null) {
                    abstractC4397a.c(true);
                }
            } else {
                layoutInflaterFactory2C4402f.getClass();
            }
            return true;
        }

        @Override // m.h, android.view.Window.Callback
        public final void onPanelClosed(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (this.f38041f) {
                this.f43995b.onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f = LayoutInflaterFactory2C4402f.this;
            if (i == 108) {
                layoutInflaterFactory2C4402f.S();
                AbstractC4397a abstractC4397a = layoutInflaterFactory2C4402f.f38022p;
                if (abstractC4397a != null) {
                    abstractC4397a.c(false);
                    return;
                }
                return;
            }
            if (i != 0) {
                layoutInflaterFactory2C4402f.getClass();
                return;
            }
            m mVarR = layoutInflaterFactory2C4402f.R(i);
            if (mVarR.f38062m) {
                layoutInflaterFactory2C4402f.J(mVarR, false);
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar = menu instanceof androidx.appcompat.view.menu.f ? (androidx.appcompat.view.menu.f) menu : null;
            if (i == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.f14453x = true;
            }
            q.e eVar = this.f38038c;
            if (eVar != null && i == 0) {
                q qVar = q.this;
                if (!qVar.f38099d) {
                    qVar.f38096a.f14793l = true;
                    qVar.f38099d = true;
                }
            }
            boolean zOnPreparePanel = this.f43995b.onPreparePanel(i, view, menu);
            if (fVar != null) {
                fVar.f14453x = false;
            }
            return zOnPreparePanel;
        }

        @Override // m.h, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.f fVar = LayoutInflaterFactory2C4402f.this.R(0).f38058h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f = LayoutInflaterFactory2C4402f.this;
            if (!layoutInflaterFactory2C4402f.f37982A || i != 0) {
                return h.a.b(this.f43995b, callback, i);
            }
            e.a aVar = new e.a(layoutInflaterFactory2C4402f.f38018l, callback);
            AbstractC5304a abstractC5304aD = layoutInflaterFactory2C4402f.D(aVar);
            if (abstractC5304aD != null) {
                return aVar.e(abstractC5304aD);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

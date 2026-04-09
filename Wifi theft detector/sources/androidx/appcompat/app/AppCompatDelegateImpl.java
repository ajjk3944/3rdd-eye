package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
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
import android.os.Parcel;
import android.os.Parcelable;
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
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.k1;
import androidx.appcompat.widget.z0;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.a;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.g0;
import androidx.core.view.g1;
import androidx.core.view.i1;
import androidx.core.view.s;
import androidx.lifecycle.Lifecycle;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import h.b;
import h.f;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class AppCompatDelegateImpl extends AppCompatDelegate implements d.a, LayoutInflater.Factory2 {

    /* renamed from: j0, reason: collision with root package name */
    public static final r.k f422j0 = new r.k();

    /* renamed from: k0, reason: collision with root package name */
    public static final boolean f423k0 = false;

    /* renamed from: l0, reason: collision with root package name */
    public static final int[] f424l0 = {R.attr.windowBackground};

    /* renamed from: m0, reason: collision with root package name */
    public static final boolean f425m0 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A;
    public ViewGroup B;
    public TextView C;
    public View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public PanelFeatureState[] M;
    public PanelFeatureState N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public Configuration S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public p X;
    public p Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f426a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Runnable f427b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f428c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f429d0;

    /* renamed from: e0, reason: collision with root package name */
    public Rect f430e0;

    /* renamed from: f0, reason: collision with root package name */
    public v f431f0;

    /* renamed from: g0, reason: collision with root package name */
    public w f432g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedDispatcher f433h0;

    /* renamed from: i0, reason: collision with root package name */
    public OnBackInvokedCallback f434i0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f435j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f436k;

    /* renamed from: l, reason: collision with root package name */
    public Window f437l;

    /* renamed from: m, reason: collision with root package name */
    public n f438m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.appcompat.app.c f439n;

    /* renamed from: o, reason: collision with root package name */
    public ActionBar f440o;

    /* renamed from: p, reason: collision with root package name */
    public MenuInflater f441p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f442q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.appcompat.widget.d0 f443r;

    /* renamed from: s, reason: collision with root package name */
    public h f444s;

    /* renamed from: t, reason: collision with root package name */
    public s f445t;

    /* renamed from: u, reason: collision with root package name */
    public h.b f446u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f447v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f448w;

    /* renamed from: x, reason: collision with root package name */
    public Runnable f449x;

    /* renamed from: y, reason: collision with root package name */
    public g1 f450y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f451z;

    public static final class PanelFeatureState {

        /* renamed from: a, reason: collision with root package name */
        public int f452a;

        /* renamed from: b, reason: collision with root package name */
        public int f453b;

        /* renamed from: c, reason: collision with root package name */
        public int f454c;

        /* renamed from: d, reason: collision with root package name */
        public int f455d;

        /* renamed from: e, reason: collision with root package name */
        public int f456e;

        /* renamed from: f, reason: collision with root package name */
        public int f457f;

        /* renamed from: g, reason: collision with root package name */
        public ViewGroup f458g;

        /* renamed from: h, reason: collision with root package name */
        public View f459h;

        /* renamed from: i, reason: collision with root package name */
        public View f460i;

        /* renamed from: j, reason: collision with root package name */
        public androidx.appcompat.view.menu.d f461j;

        /* renamed from: k, reason: collision with root package name */
        public androidx.appcompat.view.menu.b f462k;

        /* renamed from: l, reason: collision with root package name */
        public Context f463l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f464m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f465n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f466o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f467p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f468q = false;

        /* renamed from: r, reason: collision with root package name */
        public boolean f469r;

        /* renamed from: s, reason: collision with root package name */
        public Bundle f470s;

        @SuppressLint({"BanParcelableUsage"})
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            public int f471a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f472b;

            /* renamed from: c, reason: collision with root package name */
            public Bundle f473c;

            public class a implements Parcelable.ClassLoaderCreator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.c(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.c(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i10) {
                    return new SavedState[i10];
                }
            }

            public static SavedState c(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f471a = parcel.readInt();
                boolean z10 = parcel.readInt() == 1;
                savedState.f472b = z10;
                if (z10) {
                    savedState.f473c = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f471a);
                parcel.writeInt(this.f472b ? 1 : 0);
                if (this.f472b) {
                    parcel.writeBundle(this.f473c);
                }
            }
        }

        public PanelFeatureState(int i10) {
            this.f452a = i10;
        }

        public androidx.appcompat.view.menu.i a(h.a aVar) {
            if (this.f461j == null) {
                return null;
            }
            if (this.f462k == null) {
                androidx.appcompat.view.menu.b bVar = new androidx.appcompat.view.menu.b(this.f463l, c.g.abc_list_menu_item_layout);
                this.f462k = bVar;
                bVar.d(aVar);
                this.f461j.b(this.f462k);
            }
            return this.f462k.l(this.f458g);
        }

        public boolean b() {
            if (this.f459h == null) {
                return false;
            }
            return this.f460i != null || this.f462k.a().getCount() > 0;
        }

        public void c(androidx.appcompat.view.menu.d dVar) {
            androidx.appcompat.view.menu.b bVar;
            androidx.appcompat.view.menu.d dVar2 = this.f461j;
            if (dVar == dVar2) {
                return;
            }
            if (dVar2 != null) {
                dVar2.R(this.f462k);
            }
            this.f461j = dVar;
            if (dVar == null || (bVar = this.f462k) == null) {
                return;
            }
            dVar.b(bVar);
        }

        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(c.a.actionBarPopupTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                themeNewTheme.applyStyle(i10, true);
            }
            themeNewTheme.resolveAttribute(c.a.panelMenuListTheme, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                themeNewTheme.applyStyle(i11, true);
            } else {
                themeNewTheme.applyStyle(c.i.Theme_AppCompat_CompactMenu, true);
            }
            h.d dVar = new h.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f463l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(c.j.AppCompatTheme);
            this.f453b = typedArrayObtainStyledAttributes.getResourceId(c.j.AppCompatTheme_panelBackground, 0);
            this.f457f = typedArrayObtainStyledAttributes.getResourceId(c.j.AppCompatTheme_android_windowAnimationStyle, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f426a0 & 1) != 0) {
                appCompatDelegateImpl.h0(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f426a0 & 4096) != 0) {
                appCompatDelegateImpl2.h0(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.Z = false;
            appCompatDelegateImpl3.f426a0 = 0;
        }
    }

    public class b implements g0 {
        public b() {
        }

        @Override // androidx.core.view.g0
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int iL = windowInsetsCompat.l();
            int iE1 = AppCompatDelegateImpl.this.e1(windowInsetsCompat, null);
            if (iL != iE1) {
                windowInsetsCompat = windowInsetsCompat.q(windowInsetsCompat.j(), iE1, windowInsetsCompat.k(), windowInsetsCompat.i());
            }
            return ViewCompat.V(view, windowInsetsCompat);
        }
    }

    public class c implements ContentFrameLayout.a {
        public c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.f0();
        }
    }

    public class d implements Runnable {

        public class a extends i1 {
            public a() {
            }

            @Override // androidx.core.view.h1
            public void b(View view) {
                AppCompatDelegateImpl.this.f447v.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f450y.g(null);
                AppCompatDelegateImpl.this.f450y = null;
            }

            @Override // androidx.core.view.i1, androidx.core.view.h1
            public void c(View view) {
                AppCompatDelegateImpl.this.f447v.setVisibility(0);
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f448w.showAtLocation(appCompatDelegateImpl.f447v, 55, 0, 0);
            AppCompatDelegateImpl.this.i0();
            if (!AppCompatDelegateImpl.this.T0()) {
                AppCompatDelegateImpl.this.f447v.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f447v.setVisibility(0);
            } else {
                AppCompatDelegateImpl.this.f447v.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f450y = ViewCompat.e(appCompatDelegateImpl2.f447v).b(1.0f);
                AppCompatDelegateImpl.this.f450y.g(new a());
            }
        }
    }

    public class e extends i1 {
        public e() {
        }

        @Override // androidx.core.view.h1
        public void b(View view) {
            AppCompatDelegateImpl.this.f447v.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f450y.g(null);
            AppCompatDelegateImpl.this.f450y = null;
        }

        @Override // androidx.core.view.i1, androidx.core.view.h1
        public void c(View view) {
            AppCompatDelegateImpl.this.f447v.setVisibility(0);
            if (AppCompatDelegateImpl.this.f447v.getParent() instanceof View) {
                ViewCompat.g0((View) AppCompatDelegateImpl.this.f447v.getParent());
            }
        }
    }

    public class f implements a.b {
        public f() {
        }

        @Override // androidx.appcompat.app.a.b
        public Context a() {
            return AppCompatDelegateImpl.this.n0();
        }

        @Override // androidx.appcompat.app.a.b
        public boolean b() {
            ActionBar actionBarS = AppCompatDelegateImpl.this.s();
            return (actionBarS == null || (actionBarS.i() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.a.b
        public void c(Drawable drawable, int i10) {
            ActionBar actionBarS = AppCompatDelegateImpl.this.s();
            if (actionBarS != null) {
                actionBarS.t(drawable);
                actionBarS.s(i10);
            }
        }

        @Override // androidx.appcompat.app.a.b
        public Drawable d() {
            z0 z0VarU = z0.u(a(), null, new int[]{c.a.homeAsUpIndicator});
            Drawable drawableG = z0VarU.g(0);
            z0VarU.x();
            return drawableG;
        }

        @Override // androidx.appcompat.app.a.b
        public void e(int i10) {
            ActionBar actionBarS = AppCompatDelegateImpl.this.s();
            if (actionBarS != null) {
                actionBarS.s(i10);
            }
        }
    }

    public interface g {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    public final class h implements h.a {
        public h() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public void b(androidx.appcompat.view.menu.d dVar, boolean z10) {
            AppCompatDelegateImpl.this.Y(dVar);
        }

        @Override // androidx.appcompat.view.menu.h.a
        public boolean c(androidx.appcompat.view.menu.d dVar) {
            Window.Callback callbackU0 = AppCompatDelegateImpl.this.u0();
            if (callbackU0 == null) {
                return true;
            }
            callbackU0.onMenuOpened(108, dVar);
            return true;
        }
    }

    public class i implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public b.a f482a;

        public class a extends i1 {
            public a() {
            }

            @Override // androidx.core.view.h1
            public void b(View view) {
                AppCompatDelegateImpl.this.f447v.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f448w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f447v.getParent() instanceof View) {
                    ViewCompat.g0((View) AppCompatDelegateImpl.this.f447v.getParent());
                }
                AppCompatDelegateImpl.this.f447v.k();
                AppCompatDelegateImpl.this.f450y.g(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f450y = null;
                ViewCompat.g0(appCompatDelegateImpl2.B);
            }
        }

        public i(b.a aVar) {
            this.f482a = aVar;
        }

        @Override // h.b.a
        public boolean a(h.b bVar, Menu menu) {
            return this.f482a.a(bVar, menu);
        }

        @Override // h.b.a
        public boolean b(h.b bVar, Menu menu) {
            ViewCompat.g0(AppCompatDelegateImpl.this.B);
            return this.f482a.b(bVar, menu);
        }

        @Override // h.b.a
        public boolean c(h.b bVar, MenuItem menuItem) {
            return this.f482a.c(bVar, menuItem);
        }

        @Override // h.b.a
        public void d(h.b bVar) {
            this.f482a.d(bVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f448w != null) {
                appCompatDelegateImpl.f437l.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f449x);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f447v != null) {
                appCompatDelegateImpl2.i0();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f450y = ViewCompat.e(appCompatDelegateImpl3.f447v).b(0.0f);
                AppCompatDelegateImpl.this.f450y.g(new a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            androidx.appcompat.app.c cVar = appCompatDelegateImpl4.f439n;
            if (cVar != null) {
                cVar.k(appCompatDelegateImpl4.f446u);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f446u = null;
            ViewCompat.g0(appCompatDelegateImpl5.B);
            AppCompatDelegateImpl.this.c1();
        }
    }

    public static class j {
        @DoNotInline
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        @DoNotInline
        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    public static class k {
        @DoNotInline
        public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        @DoNotInline
        public static n0.g b(Configuration configuration) {
            return n0.g.c(configuration.getLocales().toLanguageTags());
        }

        @DoNotInline
        public static void c(n0.g gVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(gVar.h()));
        }

        @DoNotInline
        public static void d(Configuration configuration, n0.g gVar) {
            configuration.setLocales(LocaleList.forLanguageTags(gVar.h()));
        }
    }

    public static class l {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode |= configuration2.colorMode & 3;
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode |= configuration2.colorMode & 12;
            }
        }
    }

    public static class m {
        @DoNotInline
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        @DoNotInline
        public static OnBackInvokedCallback b(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.s
                public final void onBackInvoked() {
                    appCompatDelegateImpl.C0();
                }
            };
            androidx.appcompat.app.o.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        @DoNotInline
        public static void c(Object obj, Object obj2) {
            androidx.appcompat.app.o.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.n.a(obj2));
        }
    }

    public class n extends h.i {

        /* renamed from: b, reason: collision with root package name */
        public g f485b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f486c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f487d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f488e;

        public n(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f487d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f487d = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f486c = true;
                callback.onContentChanged();
            } finally {
                this.f486c = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f488e = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f488e = false;
            }
        }

        @Override // h.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f487d ? a().dispatchKeyEvent(keyEvent) : AppCompatDelegateImpl.this.g0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // h.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.F0(keyEvent.getKeyCode(), keyEvent);
        }

        public void e(g gVar) {
            this.f485b = gVar;
        }

        public final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(AppCompatDelegateImpl.this.f436k, callback);
            h.b bVarW0 = AppCompatDelegateImpl.this.W0(aVar);
            if (bVarW0 != null) {
                return aVar.e(bVarW0);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f486c) {
                a().onContentChanged();
            }
        }

        @Override // h.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.d)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // h.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View viewOnCreatePanelView;
            g gVar = this.f485b;
            return (gVar == null || (viewOnCreatePanelView = gVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : viewOnCreatePanelView;
        }

        @Override // h.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            AppCompatDelegateImpl.this.I0(i10);
            return true;
        }

        @Override // h.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f488e) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                AppCompatDelegateImpl.this.J0(i10);
            }
        }

        @Override // h.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.d dVar = menu instanceof androidx.appcompat.view.menu.d ? (androidx.appcompat.view.menu.d) menu : null;
            if (i10 == 0 && dVar == null) {
                return false;
            }
            if (dVar != null) {
                dVar.f0(true);
            }
            g gVar = this.f485b;
            boolean zOnPreparePanel = gVar != null && gVar.a(i10);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            }
            if (dVar != null) {
                dVar.f0(false);
            }
            return zOnPreparePanel;
        }

        @Override // h.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
            androidx.appcompat.view.menu.d dVar;
            PanelFeatureState panelFeatureStateS0 = AppCompatDelegateImpl.this.s0(0, true);
            if (panelFeatureStateS0 == null || (dVar = panelFeatureStateS0.f461j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, dVar, i10);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // h.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (AppCompatDelegateImpl.this.A0() && i10 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    public class o extends p {

        /* renamed from: c, reason: collision with root package name */
        public final PowerManager f490c;

        public o(Context context) {
            super();
            this.f490c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public int c() {
            return j.a(this.f490c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public void d() {
            AppCompatDelegateImpl.this.S();
        }
    }

    public abstract class p {

        /* renamed from: a, reason: collision with root package name */
        public BroadcastReceiver f492a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        public p() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f492a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f436k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f492a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f492a == null) {
                this.f492a = new a();
            }
            AppCompatDelegateImpl.this.f436k.registerReceiver(this.f492a, intentFilterB);
        }
    }

    public class q extends p {

        /* renamed from: c, reason: collision with root package name */
        public final c0 f495c;

        public q(c0 c0Var) {
            super();
            this.f495c = c0Var;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public int c() {
            return this.f495c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.p
        public void d() {
            AppCompatDelegateImpl.this.S();
        }
    }

    public class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        public final boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.g0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.a0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(d.a.b(getContext(), i10));
        }
    }

    public final class s implements h.a {
        public s() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public void b(androidx.appcompat.view.menu.d dVar, boolean z10) {
            androidx.appcompat.view.menu.d dVarF = dVar.F();
            boolean z11 = dVarF != dVar;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z11) {
                dVar = dVarF;
            }
            PanelFeatureState panelFeatureStateL0 = appCompatDelegateImpl.l0(dVar);
            if (panelFeatureStateL0 != null) {
                if (!z11) {
                    AppCompatDelegateImpl.this.b0(panelFeatureStateL0, z10);
                } else {
                    AppCompatDelegateImpl.this.X(panelFeatureStateL0.f452a, panelFeatureStateL0, dVarF);
                    AppCompatDelegateImpl.this.b0(panelFeatureStateL0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.h.a
        public boolean c(androidx.appcompat.view.menu.d dVar) {
            Window.Callback callbackU0;
            if (dVar != dVar.F()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.G || (callbackU0 = appCompatDelegateImpl.u0()) == null || AppCompatDelegateImpl.this.R) {
                return true;
            }
            callbackU0.onMenuOpened(108, dVar);
            return true;
        }
    }

    public AppCompatDelegateImpl(Activity activity, androidx.appcompat.app.c cVar) {
        this(activity, null, cVar, activity);
    }

    public static Configuration m0(Configuration configuration, Configuration configuration2) {
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
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                k.a(configuration, configuration2, configuration3);
            } else if (!r0.d.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & PsExtractor.AUDIO_STREAM;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & PsExtractor.AUDIO_STREAM)) {
                configuration3.screenLayout |= i30 & PsExtractor.AUDIO_STREAM;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                l.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            int i45 = configuration.densityDpi;
            int i46 = configuration2.densityDpi;
            if (i45 != i46) {
                configuration3.densityDpi = i46;
            }
        }
        return configuration3;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void A() {
        ActionBar actionBarS = s();
        if (actionBarS != null) {
            actionBarS.u(true);
        }
    }

    public boolean A0() {
        return this.f451z;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void B(Bundle bundle) {
    }

    public int B0(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return q0(context).c();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return p0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i10;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void C() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        R(true, false);
    }

    public boolean C0() {
        boolean z10 = this.O;
        this.O = false;
        PanelFeatureState panelFeatureStateS0 = s0(0, false);
        if (panelFeatureStateS0 != null && panelFeatureStateS0.f466o) {
            if (!z10) {
                b0(panelFeatureStateS0, true);
            }
            return true;
        }
        h.b bVar = this.f446u;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        ActionBar actionBarS = s();
        return actionBarS != null && actionBarS.g();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void D() {
        ActionBar actionBarS = s();
        if (actionBarS != null) {
            actionBarS.u(false);
        }
    }

    public boolean D0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.O = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            E0(0, keyEvent);
            return true;
        }
        return false;
    }

    public final boolean E0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState panelFeatureStateS0 = s0(i10, true);
        if (panelFeatureStateS0.f466o) {
            return false;
        }
        return O0(panelFeatureStateS0, keyEvent);
    }

    public boolean F0(int i10, KeyEvent keyEvent) {
        ActionBar actionBarS = s();
        if (actionBarS != null && actionBarS.n(i10, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.N;
        if (panelFeatureState != null && N0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.N;
            if (panelFeatureState2 != null) {
                panelFeatureState2.f465n = true;
            }
            return true;
        }
        if (this.N == null) {
            PanelFeatureState panelFeatureStateS0 = s0(0, true);
            O0(panelFeatureStateS0, keyEvent);
            boolean zN0 = N0(panelFeatureStateS0, keyEvent.getKeyCode(), keyEvent, 1);
            panelFeatureStateS0.f464m = false;
            if (zN0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean G(int i10) {
        int iQ0 = Q0(i10);
        if (this.K && iQ0 == 108) {
            return false;
        }
        if (this.G && iQ0 == 1) {
            this.G = false;
        }
        if (iQ0 == 1) {
            Y0();
            this.K = true;
            return true;
        }
        if (iQ0 == 2) {
            Y0();
            this.E = true;
            return true;
        }
        if (iQ0 == 5) {
            Y0();
            this.F = true;
            return true;
        }
        if (iQ0 == 10) {
            Y0();
            this.I = true;
            return true;
        }
        if (iQ0 == 108) {
            Y0();
            this.G = true;
            return true;
        }
        if (iQ0 != 109) {
            return this.f437l.requestFeature(iQ0);
        }
        Y0();
        this.H = true;
        return true;
    }

    public boolean G0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                H0(0, keyEvent);
                return true;
            }
        } else if (C0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void H(int i10) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f436k).inflate(i10, viewGroup);
        this.f438m.c(this.f437l.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean H0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            h.b r0 = r4.f446u
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = r4.s0(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.d0 r5 = r4.f443r
            if (r5 == 0) goto L43
            boolean r5 = r5.a()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f436k
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.d0 r5 = r4.f443r
            boolean r5 = r5.e()
            if (r5 != 0) goto L3c
            boolean r5 = r4.R
            if (r5 != 0) goto L62
            boolean r5 = r4.O0(r2, r6)
            if (r5 == 0) goto L62
            androidx.appcompat.widget.d0 r5 = r4.f443r
            boolean r0 = r5.c()
            goto L68
        L3c:
            androidx.appcompat.widget.d0 r5 = r4.f443r
            boolean r0 = r5.b()
            goto L68
        L43:
            boolean r5 = r2.f466o
            if (r5 != 0) goto L64
            boolean r3 = r2.f465n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f464m
            if (r5 == 0) goto L62
            boolean r5 = r2.f469r
            if (r5 == 0) goto L5b
            r2.f464m = r1
            boolean r5 = r4.O0(r2, r6)
            goto L5c
        L5b:
            r5 = r0
        L5c:
            if (r5 == 0) goto L62
            r4.L0(r2, r6)
            goto L68
        L62:
            r0 = r1
            goto L68
        L64:
            r4.b0(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f436k
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            return r0
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.H0(int, android.view.KeyEvent):boolean");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void I(View view) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f438m.c(this.f437l.getCallback());
    }

    public void I0(int i10) {
        ActionBar actionBarS;
        if (i10 != 108 || (actionBarS = s()) == null) {
            return;
        }
        actionBarS.h(true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void J(View view, ViewGroup.LayoutParams layoutParams) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f438m.c(this.f437l.getCallback());
    }

    public void J0(int i10) {
        if (i10 == 108) {
            ActionBar actionBarS = s();
            if (actionBarS != null) {
                actionBarS.h(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            PanelFeatureState panelFeatureStateS0 = s0(i10, true);
            if (panelFeatureStateS0.f466o) {
                b0(panelFeatureStateS0, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void K(android.window.OnBackInvokedDispatcher r3) {
        /*
            r2 = this;
            super.K(r3)
            android.window.OnBackInvokedDispatcher r0 = r2.f433h0
            if (r0 == 0) goto L11
            android.window.OnBackInvokedCallback r1 = r2.f434i0
            if (r1 == 0) goto L11
            androidx.appcompat.app.AppCompatDelegateImpl.m.c(r0, r1)
            r0 = 0
            r2.f434i0 = r0
        L11:
            if (r3 != 0) goto L2c
            java.lang.Object r0 = r2.f435j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L2c
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L2c
            java.lang.Object r3 = r2.f435j
            android.app.Activity r3 = (android.app.Activity) r3
            android.window.OnBackInvokedDispatcher r3 = androidx.appcompat.app.AppCompatDelegateImpl.m.a(r3)
            r2.f433h0 = r3
            goto L2e
        L2c:
            r2.f433h0 = r3
        L2e:
            r2.c1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.K(android.window.OnBackInvokedDispatcher):void");
    }

    public void K0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void L(Toolbar toolbar) {
        if (this.f435j instanceof Activity) {
            ActionBar actionBarS = s();
            if (actionBarS instanceof d0) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f441p = null;
            if (actionBarS != null) {
                actionBarS.m();
            }
            this.f440o = null;
            if (toolbar != null) {
                a0 a0Var = new a0(toolbar, t0(), this.f438m);
                this.f440o = a0Var;
                this.f438m.e(a0Var.f516c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f438m.e(null);
            }
            u();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L0(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.L0(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void M(int i10) {
        this.U = i10;
    }

    public final ActionBar M0() {
        return this.f440o;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void N(CharSequence charSequence) {
        this.f442q = charSequence;
        androidx.appcompat.widget.d0 d0Var = this.f443r;
        if (d0Var != null) {
            d0Var.setWindowTitle(charSequence);
            return;
        }
        if (M0() != null) {
            M0().v(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final boolean N0(PanelFeatureState panelFeatureState, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.d dVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f464m || O0(panelFeatureState, keyEvent)) && (dVar = panelFeatureState.f461j) != null) {
            zPerformShortcut = dVar.performShortcut(i10, keyEvent, i11);
        }
        if (zPerformShortcut && (i11 & 1) == 0 && this.f443r == null) {
            b0(panelFeatureState, true);
        }
        return zPerformShortcut;
    }

    public final boolean O0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        androidx.appcompat.widget.d0 d0Var;
        androidx.appcompat.widget.d0 d0Var2;
        androidx.appcompat.widget.d0 d0Var3;
        if (this.R) {
            return false;
        }
        if (panelFeatureState.f464m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.N;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            b0(panelFeatureState2, false);
        }
        Window.Callback callbackU0 = u0();
        if (callbackU0 != null) {
            panelFeatureState.f460i = callbackU0.onCreatePanelView(panelFeatureState.f452a);
        }
        int i10 = panelFeatureState.f452a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (d0Var3 = this.f443r) != null) {
            d0Var3.f();
        }
        if (panelFeatureState.f460i == null && (!z10 || !(M0() instanceof a0))) {
            androidx.appcompat.view.menu.d dVar = panelFeatureState.f461j;
            if (dVar == null || panelFeatureState.f469r) {
                if (dVar == null && (!y0(panelFeatureState) || panelFeatureState.f461j == null)) {
                    return false;
                }
                if (z10 && this.f443r != null) {
                    if (this.f444s == null) {
                        this.f444s = new h();
                    }
                    this.f443r.d(panelFeatureState.f461j, this.f444s);
                }
                panelFeatureState.f461j.i0();
                if (!callbackU0.onCreatePanelMenu(panelFeatureState.f452a, panelFeatureState.f461j)) {
                    panelFeatureState.c(null);
                    if (z10 && (d0Var = this.f443r) != null) {
                        d0Var.d(null, this.f444s);
                    }
                    return false;
                }
                panelFeatureState.f469r = false;
            }
            panelFeatureState.f461j.i0();
            Bundle bundle = panelFeatureState.f470s;
            if (bundle != null) {
                panelFeatureState.f461j.S(bundle);
                panelFeatureState.f470s = null;
            }
            if (!callbackU0.onPreparePanel(0, panelFeatureState.f460i, panelFeatureState.f461j)) {
                if (z10 && (d0Var2 = this.f443r) != null) {
                    d0Var2.d(null, this.f444s);
                }
                panelFeatureState.f461j.h0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f467p = z11;
            panelFeatureState.f461j.setQwertyMode(z11);
            panelFeatureState.f461j.h0();
        }
        panelFeatureState.f464m = true;
        panelFeatureState.f465n = false;
        this.N = panelFeatureState;
        return true;
    }

    public final void P0(boolean z10) {
        androidx.appcompat.widget.d0 d0Var = this.f443r;
        if (d0Var == null || !d0Var.a() || (ViewConfiguration.get(this.f436k).hasPermanentMenuKey() && !this.f443r.g())) {
            PanelFeatureState panelFeatureStateS0 = s0(0, true);
            panelFeatureStateS0.f468q = true;
            b0(panelFeatureStateS0, false);
            L0(panelFeatureStateS0, null);
            return;
        }
        Window.Callback callbackU0 = u0();
        if (this.f443r.e() && z10) {
            this.f443r.b();
            if (this.R) {
                return;
            }
            callbackU0.onPanelClosed(108, s0(0, true).f461j);
            return;
        }
        if (callbackU0 == null || this.R) {
            return;
        }
        if (this.Z && (this.f426a0 & 1) != 0) {
            this.f437l.getDecorView().removeCallbacks(this.f427b0);
            this.f427b0.run();
        }
        PanelFeatureState panelFeatureStateS02 = s0(0, true);
        androidx.appcompat.view.menu.d dVar = panelFeatureStateS02.f461j;
        if (dVar == null || panelFeatureStateS02.f469r || !callbackU0.onPreparePanel(0, panelFeatureStateS02.f460i, dVar)) {
            return;
        }
        callbackU0.onMenuOpened(108, panelFeatureStateS02.f461j);
        this.f443r.c();
    }

    public final boolean Q(boolean z10) {
        return R(z10, true);
    }

    public final int Q0(int i10) {
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

    public final boolean R(boolean z10, boolean z11) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        if (this.R) {
            return false;
        }
        int iW = W();
        int iB0 = B0(this.f436k, iW);
        n0.g gVarV = Build.VERSION.SDK_INT < 33 ? V(this.f436k) : null;
        if (!z11 && gVarV != null) {
            gVarV = r0(this.f436k.getResources().getConfiguration());
        }
        boolean zB1 = b1(iB0, gVarV, z10);
        if (iW == 0) {
            q0(this.f436k).e();
        } else {
            p pVar = this.X;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (iW == 3) {
            p0(this.f436k).e();
            return zB1;
        }
        p pVar2 = this.Y;
        if (pVar2 != null) {
            pVar2.a();
        }
        return zB1;
    }

    public void R0(Configuration configuration, n0.g gVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            k.d(configuration, gVar);
        } else {
            configuration.setLocale(gVar.d(0));
            configuration.setLayoutDirection(gVar.d(0));
        }
    }

    public boolean S() {
        return Q(true);
    }

    public void S0(n0.g gVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            k.c(gVar);
        } else {
            Locale.setDefault(gVar.d(0));
        }
    }

    public final void T() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.B.findViewById(R.id.content);
        View decorView = this.f437l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f436k.obtainStyledAttributes(c.j.AppCompatTheme);
        typedArrayObtainStyledAttributes.getValue(c.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(c.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        int i10 = c.j.AppCompatTheme_windowFixedWidthMajor;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = c.j.AppCompatTheme_windowFixedWidthMinor;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            typedArrayObtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = c.j.AppCompatTheme_windowFixedHeightMajor;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            typedArrayObtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = c.j.AppCompatTheme_windowFixedHeightMinor;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            typedArrayObtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final boolean T0() {
        ViewGroup viewGroup;
        return this.A && (viewGroup = this.B) != null && viewGroup.isLaidOut();
    }

    public final void U(Window window) {
        if (this.f437l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(callback);
        this.f438m = nVar;
        window.setCallback(nVar);
        z0 z0VarU = z0.u(this.f436k, null, f424l0);
        Drawable drawableH = z0VarU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        z0VarU.x();
        this.f437l = window;
        if (Build.VERSION.SDK_INT < 33 || this.f433h0 != null) {
            return;
        }
        K(null);
    }

    public final boolean U0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f437l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    public n0.g V(Context context) {
        n0.g gVarR;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || (gVarR = AppCompatDelegate.r()) == null) {
            return null;
        }
        n0.g gVarR0 = r0(context.getApplicationContext().getResources().getConfiguration());
        n0.g gVarB = i10 >= 24 ? x.b(gVarR, gVarR0) : gVarR.f() ? n0.g.e() : n0.g.c(j.b(gVarR.d(0)));
        return gVarB.f() ? gVarR0 : gVarB;
    }

    public boolean V0() {
        if (this.f433h0 == null) {
            return false;
        }
        PanelFeatureState panelFeatureStateS0 = s0(0, false);
        return (panelFeatureStateS0 != null && panelFeatureStateS0.f466o) || this.f446u != null;
    }

    public final int W() {
        int i10 = this.T;
        return i10 != -100 ? i10 : AppCompatDelegate.m();
    }

    public h.b W0(b.a aVar) {
        androidx.appcompat.app.c cVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        h.b bVar = this.f446u;
        if (bVar != null) {
            bVar.c();
        }
        i iVar = new i(aVar);
        ActionBar actionBarS = s();
        if (actionBarS != null) {
            h.b bVarW = actionBarS.w(iVar);
            this.f446u = bVarW;
            if (bVarW != null && (cVar = this.f439n) != null) {
                cVar.o(bVarW);
            }
        }
        if (this.f446u == null) {
            this.f446u = X0(iVar);
        }
        c1();
        return this.f446u;
    }

    public void X(int i10, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i10 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.M;
                if (i10 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i10];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f461j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f466o) && !this.R) {
            this.f438m.d(this.f437l.getCallback(), i10, menu);
        }
    }

    public h.b X0(b.a aVar) {
        h.b bVarM;
        Context dVar;
        androidx.appcompat.app.c cVar;
        i0();
        h.b bVar = this.f446u;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        androidx.appcompat.app.c cVar2 = this.f439n;
        if (cVar2 == null || this.R) {
            bVarM = null;
        } else {
            try {
                bVarM = cVar2.m(aVar);
            } catch (AbstractMethodError unused) {
            }
        }
        if (bVarM != null) {
            this.f446u = bVarM;
        } else {
            if (this.f447v == null) {
                if (this.J) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f436k.getTheme();
                    theme.resolveAttribute(c.a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f436k.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new h.d(this.f436k, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f436k;
                    }
                    this.f447v = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, c.a.actionModePopupWindowStyle);
                    this.f448w = popupWindow;
                    androidx.core.widget.g.b(popupWindow, 2);
                    this.f448w.setContentView(this.f447v);
                    this.f448w.setWidth(-1);
                    dVar.getTheme().resolveAttribute(c.a.actionBarSize, typedValue, true);
                    this.f447v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f448w.setHeight(-2);
                    this.f449x = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.B.findViewById(c.f.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(n0()));
                        this.f447v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f447v != null) {
                i0();
                this.f447v.k();
                h.e eVar = new h.e(this.f447v.getContext(), this.f447v, aVar, this.f448w == null);
                if (aVar.a(eVar, eVar.e())) {
                    eVar.k();
                    this.f447v.h(eVar);
                    this.f446u = eVar;
                    if (T0()) {
                        this.f447v.setAlpha(0.0f);
                        g1 g1VarB = ViewCompat.e(this.f447v).b(1.0f);
                        this.f450y = g1VarB;
                        g1VarB.g(new e());
                    } else {
                        this.f447v.setAlpha(1.0f);
                        this.f447v.setVisibility(0);
                        if (this.f447v.getParent() instanceof View) {
                            ViewCompat.g0((View) this.f447v.getParent());
                        }
                    }
                    if (this.f448w != null) {
                        this.f437l.getDecorView().post(this.f449x);
                    }
                } else {
                    this.f446u = null;
                }
            }
        }
        h.b bVar2 = this.f446u;
        if (bVar2 != null && (cVar = this.f439n) != null) {
            cVar.o(bVar2);
        }
        c1();
        return this.f446u;
    }

    public void Y(androidx.appcompat.view.menu.d dVar) {
        if (this.L) {
            return;
        }
        this.L = true;
        this.f443r.l();
        Window.Callback callbackU0 = u0();
        if (callbackU0 != null && !this.R) {
            callbackU0.onPanelClosed(108, dVar);
        }
        this.L = false;
    }

    public final void Y0() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void Z() {
        p pVar = this.X;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.Y;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    public final AppCompatActivity Z0() {
        for (Context baseContext = this.f436k; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof AppCompatActivity) {
                return (AppCompatActivity) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.d.a
    public boolean a(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
        PanelFeatureState panelFeatureStateL0;
        Window.Callback callbackU0 = u0();
        if (callbackU0 == null || this.R || (panelFeatureStateL0 = l0(dVar.F())) == null) {
            return false;
        }
        return callbackU0.onMenuItemSelected(panelFeatureStateL0.f452a, menuItem);
    }

    public void a0(int i10) {
        b0(s0(i10, true), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a1(Configuration configuration) {
        Activity activity = (Activity) this.f435j;
        if (activity instanceof androidx.lifecycle.n) {
            if (((androidx.lifecycle.n) activity).getLifecycle().b().f(Lifecycle.State.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.Q || this.R) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.appcompat.view.menu.d.a
    public void b(androidx.appcompat.view.menu.d dVar) {
        P0(true);
    }

    public void b0(PanelFeatureState panelFeatureState, boolean z10) {
        ViewGroup viewGroup;
        androidx.appcompat.widget.d0 d0Var;
        if (z10 && panelFeatureState.f452a == 0 && (d0Var = this.f443r) != null && d0Var.e()) {
            Y(panelFeatureState.f461j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f436k.getSystemService("window");
        if (windowManager != null && panelFeatureState.f466o && (viewGroup = panelFeatureState.f458g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                X(panelFeatureState.f452a, panelFeatureState, null);
            }
        }
        panelFeatureState.f464m = false;
        panelFeatureState.f465n = false;
        panelFeatureState.f466o = false;
        panelFeatureState.f459h = null;
        panelFeatureState.f468q = true;
        if (this.N == panelFeatureState) {
            this.N = null;
        }
        if (panelFeatureState.f452a == 0) {
            c1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b1(int r11, n0.g r12, boolean r13) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            r10 = this;
            android.content.Context r1 = r10.f436k
            r4 = 0
            r5 = 0
            r0 = r10
            r2 = r11
            r3 = r12
            android.content.res.Configuration r11 = r0.c0(r1, r2, r3, r4, r5)
            android.content.Context r12 = r0.f436k
            int r12 = r10.o0(r12)
            android.content.res.Configuration r1 = r0.S
            if (r1 != 0) goto L1f
            android.content.Context r1 = r0.f436k
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
        L1f:
            int r4 = r1.uiMode
            r4 = r4 & 48
            int r5 = r11.uiMode
            r5 = r5 & 48
            n0.g r1 = r10.r0(r1)
            r6 = 0
            if (r3 != 0) goto L30
            r7 = r6
            goto L34
        L30:
            n0.g r7 = r10.r0(r11)
        L34:
            r8 = 0
            if (r4 == r5) goto L3a
            r4 = 512(0x200, float:7.17E-43)
            goto L3b
        L3a:
            r4 = r8
        L3b:
            if (r7 == 0) goto L45
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L45
            r4 = r4 | 8196(0x2004, float:1.1485E-41)
        L45:
            int r1 = ~r12
            r1 = r1 & r4
            r9 = 1
            if (r1 == 0) goto L8c
            if (r13 == 0) goto L8c
            boolean r13 = r0.P
            if (r13 == 0) goto L8c
            boolean r13 = androidx.appcompat.app.AppCompatDelegateImpl.f425m0
            if (r13 != 0) goto L58
            boolean r13 = r0.Q
            if (r13 == 0) goto L8c
        L58:
            java.lang.Object r13 = r0.f435j
            boolean r1 = r13 instanceof android.app.Activity
            if (r1 == 0) goto L8c
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r13 = r13.isChild()
            if (r13 != 0) goto L8c
            int r13 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r13 < r1) goto L83
            r13 = r4 & 8192(0x2000, float:1.148E-41)
            if (r13 == 0) goto L83
            java.lang.Object r13 = r0.f435j
            android.app.Activity r13 = (android.app.Activity) r13
            android.view.Window r13 = r13.getWindow()
            android.view.View r13 = r13.getDecorView()
            int r11 = r11.getLayoutDirection()
            r13.setLayoutDirection(r11)
        L83:
            java.lang.Object r11 = r0.f435j
            android.app.Activity r11 = (android.app.Activity) r11
            f0.b.c(r11)
            r11 = r9
            goto L8d
        L8c:
            r11 = r8
        L8d:
            if (r11 != 0) goto L9a
            if (r4 == 0) goto L9a
            r11 = r4 & r12
            if (r11 != r4) goto L96
            r8 = r9
        L96:
            r10.d1(r5, r7, r8, r6)
            goto L9b
        L9a:
            r9 = r11
        L9b:
            if (r9 == 0) goto Lb7
            java.lang.Object r11 = r0.f435j
            boolean r12 = r11 instanceof androidx.appcompat.app.AppCompatActivity
            if (r12 == 0) goto Lb7
            r12 = r4 & 512(0x200, float:7.17E-43)
            if (r12 == 0) goto Lac
            androidx.appcompat.app.AppCompatActivity r11 = (androidx.appcompat.app.AppCompatActivity) r11
            r11.K(r2)
        Lac:
            r11 = r4 & 4
            if (r11 == 0) goto Lb7
            java.lang.Object r11 = r0.f435j
            androidx.appcompat.app.AppCompatActivity r11 = (androidx.appcompat.app.AppCompatActivity) r11
            r11.J(r3)
        Lb7:
            if (r7 == 0) goto Lca
            android.content.Context r11 = r0.f436k
            android.content.res.Resources r11 = r11.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            n0.g r11 = r10.r0(r11)
            r10.S0(r11)
        Lca:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.b1(int, n0.g, boolean):boolean");
    }

    public final Configuration c0(Context context, int i10, n0.g gVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (gVar != null) {
            R0(configuration2, gVar);
        }
        return configuration2;
    }

    public void c1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zV0 = V0();
            if (zV0 && this.f434i0 == null) {
                this.f434i0 = m.b(this.f433h0, this);
            } else {
                if (zV0 || (onBackInvokedCallback = this.f434i0) == null) {
                    return;
                }
                m.c(this.f433h0, onBackInvokedCallback);
                this.f434i0 = null;
            }
        }
    }

    public final ViewGroup d0() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f436k.obtainStyledAttributes(c.j.AppCompatTheme);
        int i10 = c.j.AppCompatTheme_windowActionBar;
        if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(c.j.AppCompatTheme_windowNoTitle, false)) {
            G(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i10, false)) {
            G(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(c.j.AppCompatTheme_windowActionBarOverlay, false)) {
            G(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(c.j.AppCompatTheme_windowActionModeOverlay, false)) {
            G(10);
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(c.j.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        k0();
        this.f437l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f436k);
        if (this.K) {
            viewGroup = this.I ? (ViewGroup) layoutInflaterFrom.inflate(c.g.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(c.g.abc_screen_simple, (ViewGroup) null);
        } else if (this.J) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(c.g.abc_dialog_title_material, (ViewGroup) null);
            this.H = false;
            this.G = false;
        } else if (this.G) {
            TypedValue typedValue = new TypedValue();
            this.f436k.getTheme().resolveAttribute(c.a.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new h.d(this.f436k, typedValue.resourceId) : this.f436k).inflate(c.g.abc_screen_toolbar, (ViewGroup) null);
            androidx.appcompat.widget.d0 d0Var = (androidx.appcompat.widget.d0) viewGroup.findViewById(c.f.decor_content_parent);
            this.f443r = d0Var;
            d0Var.setWindowCallback(u0());
            if (this.H) {
                this.f443r.h(109);
            }
            if (this.E) {
                this.f443r.h(2);
            }
            if (this.F) {
                this.f443r.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.G + ", windowActionBarOverlay: " + this.H + ", android:windowIsFloating: " + this.J + ", windowActionModeOverlay: " + this.I + ", windowNoTitle: " + this.K + " }");
        }
        ViewCompat.t0(viewGroup, new b());
        if (this.f443r == null) {
            this.C = (TextView) viewGroup.findViewById(c.f.title);
        }
        k1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(c.f.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f437l.findViewById(R.id.content);
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
        this.f437l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    public final void d1(int i10, n0.g gVar, boolean z10, Configuration configuration) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Resources resources = this.f436k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (gVar != null) {
            R0(configuration2, gVar);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            y.a(resources);
        }
        int i11 = this.U;
        if (i11 != 0) {
            this.f436k.setTheme(i11);
            this.f436k.getTheme().applyStyle(this.U, true);
        }
        if (z10 && (this.f435j instanceof Activity)) {
            a1(configuration2);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        j0();
        ((ViewGroup) this.B.findViewById(R.id.content)).addView(view, layoutParams);
        this.f438m.c(this.f437l.getCallback());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View e0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        if (this.f431f0 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f436k.obtainStyledAttributes(c.j.AppCompatTheme);
            String string = typedArrayObtainStyledAttributes.getString(c.j.AppCompatTheme_viewInflaterClass);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f431f0 = new v();
            } else {
                try {
                    this.f431f0 = (v) this.f436k.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f431f0 = new v();
                }
            }
        }
        boolean z11 = f423k0;
        boolean zU0 = false;
        if (z11) {
            if (this.f432g0 == null) {
                this.f432g0 = new w();
            }
            if (this.f432g0.a(attributeSet)) {
                z10 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zU0 = U0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zU0 = true;
                }
                z10 = zU0;
            }
        } else {
            z10 = zU0;
        }
        return this.f431f0.r(view, str, context, attributeSet, z10, z11, true, j1.c());
    }

    public final int e1(WindowInsetsCompat windowInsetsCompat, Rect rect) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z10;
        boolean z11;
        int iL = windowInsetsCompat != null ? windowInsetsCompat.l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f447v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f447v.getLayoutParams();
            if (this.f447v.isShown()) {
                if (this.f429d0 == null) {
                    this.f429d0 = new Rect();
                    this.f430e0 = new Rect();
                }
                Rect rect2 = this.f429d0;
                Rect rect3 = this.f430e0;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.j(), windowInsetsCompat.l(), windowInsetsCompat.k(), windowInsetsCompat.i());
                }
                k1.a(this.B, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                WindowInsetsCompat windowInsetsCompatF = ViewCompat.F(this.B);
                int iJ = windowInsetsCompatF == null ? 0 : windowInsetsCompatF.j();
                int iK = windowInsetsCompatF == null ? 0 : windowInsetsCompatF.k();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.D != null) {
                    View view = this.D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iJ || marginLayoutParams2.rightMargin != iK) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iJ;
                            marginLayoutParams2.rightMargin = iK;
                            this.D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f436k);
                    this.D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iJ;
                    layoutParams.rightMargin = iK;
                    this.B.addView(this.D, -1, layoutParams);
                }
                View view3 = this.D;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    f1(this.D);
                }
                if (!this.I && z) {
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
                this.f447v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.D;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return iL;
    }

    public void f0() {
        androidx.appcompat.view.menu.d dVar;
        androidx.appcompat.widget.d0 d0Var = this.f443r;
        if (d0Var != null) {
            d0Var.l();
        }
        if (this.f448w != null) {
            this.f437l.getDecorView().removeCallbacks(this.f449x);
            if (this.f448w.isShowing()) {
                try {
                    this.f448w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f448w = null;
        }
        i0();
        PanelFeatureState panelFeatureStateS0 = s0(0, false);
        if (panelFeatureStateS0 == null || (dVar = panelFeatureStateS0.f461j) == null) {
            return;
        }
        dVar.close();
    }

    public final void f1(View view) {
        view.setBackgroundColor((ViewCompat.K(view) & 8192) != 0 ? ContextCompat.getColor(this.f436k, c.c.abc_decor_view_status_guard_light) : ContextCompat.getColor(this.f436k, c.c.abc_decor_view_status_guard));
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public Context g(Context context) {
        Context context2;
        this.P = true;
        int iB0 = B0(context, W());
        if (AppCompatDelegate.v(context)) {
            AppCompatDelegate.P(context);
        }
        n0.g gVarV = V(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(c0(context2, iB0, gVarV, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof h.d) {
            try {
                ((h.d) context2).a(c0(context2, iB0, gVarV, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f425m0) {
            return super.g(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationC0 = c0(context2, iB0, gVarV, !configuration2.equals(configuration3) ? m0(configuration2, configuration3) : null, true);
        h.d dVar = new h.d(context2, c.i.Theme_AppCompat_Empty);
        dVar.a(configurationC0);
        try {
            if (context2.getTheme() != null) {
                a.f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.g(dVar);
    }

    public boolean g0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f435j;
        if (((obj instanceof s.a) || (obj instanceof u)) && (decorView = this.f437l.getDecorView()) != null && androidx.core.view.s.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f438m.b(this.f437l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? D0(keyCode, keyEvent) : G0(keyCode, keyEvent);
    }

    public void h0(int i10) {
        PanelFeatureState panelFeatureStateS0;
        PanelFeatureState panelFeatureStateS02 = s0(i10, true);
        if (panelFeatureStateS02.f461j != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateS02.f461j.U(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateS02.f470s = bundle;
            }
            panelFeatureStateS02.f461j.i0();
            panelFeatureStateS02.f461j.clear();
        }
        panelFeatureStateS02.f469r = true;
        panelFeatureStateS02.f468q = true;
        if ((i10 != 108 && i10 != 0) || this.f443r == null || (panelFeatureStateS0 = s0(0, false)) == null) {
            return;
        }
        panelFeatureStateS0.f464m = false;
        O0(panelFeatureStateS0, null);
    }

    public void i0() {
        g1 g1Var = this.f450y;
        if (g1Var != null) {
            g1Var.c();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public View j(int i10) {
        j0();
        return this.f437l.findViewById(i10);
    }

    public final void j0() {
        if (this.A) {
            return;
        }
        this.B = d0();
        CharSequence charSequenceT0 = t0();
        if (!TextUtils.isEmpty(charSequenceT0)) {
            androidx.appcompat.widget.d0 d0Var = this.f443r;
            if (d0Var != null) {
                d0Var.setWindowTitle(charSequenceT0);
            } else if (M0() != null) {
                M0().v(charSequenceT0);
            } else {
                TextView textView = this.C;
                if (textView != null) {
                    textView.setText(charSequenceT0);
                }
            }
        }
        T();
        K0(this.B);
        this.A = true;
        PanelFeatureState panelFeatureStateS0 = s0(0, false);
        if (this.R) {
            return;
        }
        if (panelFeatureStateS0 == null || panelFeatureStateS0.f461j == null) {
            z0(108);
        }
    }

    public final void k0() {
        if (this.f437l == null) {
            Object obj = this.f435j;
            if (obj instanceof Activity) {
                U(((Activity) obj).getWindow());
            }
        }
        if (this.f437l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public Context l() {
        return this.f436k;
    }

    public PanelFeatureState l0(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.M;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i10];
            if (panelFeatureState != null && panelFeatureState.f461j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final a.b n() {
        return new f();
    }

    public final Context n0() {
        ActionBar actionBarS = s();
        Context contextJ = actionBarS != null ? actionBarS.j() : null;
        return contextJ == null ? this.f436k : contextJ;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public int o() {
        return this.T;
    }

    public final int o0(Context context) throws PackageManager.NameNotFoundException {
        if (!this.W && (this.f435j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f435j.getClass()), i10 >= 29 ? 269221888 : i10 >= 24 ? 786432 : 0);
                if (activityInfo != null) {
                    this.V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.V = 0;
            }
        }
        this.W = true;
        return this.V;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return e0(view, str, context, attributeSet);
    }

    public final p p0(Context context) {
        if (this.Y == null) {
            this.Y = new o(context);
        }
        return this.Y;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public MenuInflater q() {
        if (this.f441p == null) {
            v0();
            ActionBar actionBar = this.f440o;
            this.f441p = new h.g(actionBar != null ? actionBar.j() : this.f436k);
        }
        return this.f441p;
    }

    public final p q0(Context context) {
        if (this.X == null) {
            this.X = new q(c0.a(context));
        }
        return this.X;
    }

    public n0.g r0(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? k.b(configuration) : n0.g.c(j.b(configuration.locale));
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public ActionBar s() {
        v0();
        return this.f440o;
    }

    public PanelFeatureState s0(int i10, boolean z10) {
        PanelFeatureState[] panelFeatureStateArr = this.M;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i10) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i10 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.M = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i10];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i10);
        panelFeatureStateArr[i10] = panelFeatureState2;
        return panelFeatureState2;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void t() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f436k);
        if (layoutInflaterFrom.getFactory() == null) {
            androidx.core.view.t.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final CharSequence t0() {
        Object obj = this.f435j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f442q;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void u() {
        if (M0() == null || s().k()) {
            return;
        }
        z0(0);
    }

    public final Window.Callback u0() {
        return this.f437l.getCallback();
    }

    public final void v0() {
        j0();
        if (this.G && this.f440o == null) {
            Object obj = this.f435j;
            if (obj instanceof Activity) {
                this.f440o = new d0((Activity) this.f435j, this.H);
            } else if (obj instanceof Dialog) {
                this.f440o = new d0((Dialog) this.f435j);
            }
            ActionBar actionBar = this.f440o;
            if (actionBar != null) {
                actionBar.q(this.f428c0);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void w(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        ActionBar actionBarS;
        if (this.G && this.A && (actionBarS = s()) != null) {
            actionBarS.l(configuration);
        }
        androidx.appcompat.widget.i.b().g(this.f436k);
        this.S = new Configuration(this.f436k.getResources().getConfiguration());
        R(false, false);
    }

    public final boolean w0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f460i;
        if (view != null) {
            panelFeatureState.f459h = view;
            return true;
        }
        if (panelFeatureState.f461j == null) {
            return false;
        }
        if (this.f445t == null) {
            this.f445t = new s();
        }
        View view2 = (View) panelFeatureState.a(this.f445t);
        panelFeatureState.f459h = view2;
        return view2 != null;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void x(Bundle bundle) {
        String strC;
        this.P = true;
        Q(false);
        k0();
        Object obj = this.f435j;
        if (obj instanceof Activity) {
            try {
                strC = f0.n.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                ActionBar actionBarM0 = M0();
                if (actionBarM0 == null) {
                    this.f428c0 = true;
                } else {
                    actionBarM0.q(true);
                }
            }
            AppCompatDelegate.d(this);
        }
        this.S = new Configuration(this.f436k.getResources().getConfiguration());
        this.Q = true;
    }

    public final boolean x0(PanelFeatureState panelFeatureState) {
        panelFeatureState.d(n0());
        panelFeatureState.f458g = new r(panelFeatureState.f463l);
        panelFeatureState.f454c = 81;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f435j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.AppCompatDelegate.E(r3)
        L9:
            boolean r0 = r3.Z
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f437l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f427b0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.R = r0
            int r0 = r3.T
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f435j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            r.k r0 = androidx.appcompat.app.AppCompatDelegateImpl.f422j0
            java.lang.Object r1 = r3.f435j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            r.k r0 = androidx.appcompat.app.AppCompatDelegateImpl.f422j0
            java.lang.Object r1 = r3.f435j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.ActionBar r0 = r3.f440o
            if (r0 == 0) goto L5b
            r0.m()
        L5b:
            r3.Z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.y():void");
    }

    public final boolean y0(PanelFeatureState panelFeatureState) {
        Resources.Theme themeNewTheme;
        Context context = this.f436k;
        int i10 = panelFeatureState.f452a;
        if ((i10 == 0 || i10 == 108) && this.f443r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(c.a.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(c.a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(c.a.actionBarWidgetTheme, typedValue, true);
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
                h.d dVar = new h.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(context);
        dVar2.W(this);
        panelFeatureState.c(dVar2);
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void z(Bundle bundle) {
        j0();
    }

    public final void z0(int i10) {
        this.f426a0 = (1 << i10) | this.f426a0;
        if (this.Z) {
            return;
        }
        ViewCompat.b0(this.f437l.getDecorView(), this.f427b0);
        this.Z = true;
    }

    public AppCompatDelegateImpl(Dialog dialog, androidx.appcompat.app.c cVar) {
        this(dialog.getContext(), dialog.getWindow(), cVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.c cVar, Object obj) {
        AppCompatActivity appCompatActivityZ0;
        this.f450y = null;
        this.f451z = true;
        this.T = -100;
        this.f427b0 = new a();
        this.f436k = context;
        this.f439n = cVar;
        this.f435j = obj;
        if (this.T == -100 && (obj instanceof Dialog) && (appCompatActivityZ0 = Z0()) != null) {
            this.T = appCompatActivityZ0.F().o();
        }
        if (this.T == -100) {
            r.k kVar = f422j0;
            Integer num = (Integer) kVar.get(obj.getClass().getName());
            if (num != null) {
                this.T = num.intValue();
                kVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            U(window);
        }
        androidx.appcompat.widget.i.h();
    }
}

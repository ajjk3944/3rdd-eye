package I0;

import C.RunnableC0615b;
import I0.b;
import I0.k;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: SplashScreen.kt */
@SuppressLint({"CustomSplashScreen"})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f2382a;

    /* compiled from: SplashScreen.kt */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Activity f2383a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f2384b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f2385c;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f2386d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2387e;

        /* renamed from: f, reason: collision with root package name */
        public c f2388f = new F3.h(2);

        /* renamed from: g, reason: collision with root package name */
        public B.d f2389g;

        /* renamed from: h, reason: collision with root package name */
        public k f2390h;

        /* compiled from: SplashScreen.kt */
        /* renamed from: I0.b$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC0039a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f2392c;

            public ViewTreeObserverOnPreDrawListenerC0039a(View view) {
                this.f2392c = view;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                B.d dVar;
                a aVar = a.this;
                if (aVar.f2388f.f()) {
                    return false;
                }
                this.f2392c.getViewTreeObserver().removeOnPreDrawListener(this);
                k kVar = aVar.f2390h;
                if (kVar == null || (dVar = aVar.f2389g) == null) {
                    return true;
                }
                aVar.f2389g = null;
                kVar.f2403a.c().postOnAnimation(new RunnableC0615b(3, kVar, dVar));
                return true;
            }
        }

        public a(Activity activity) {
            this.f2383a = activity;
        }

        public void a() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.f2383a.getTheme();
            if (theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true)) {
                this.f2384b = Integer.valueOf(typedValue.resourceId);
                this.f2385c = Integer.valueOf(typedValue.data);
            }
            if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
                this.f2386d = theme.getDrawable(typedValue.resourceId);
            }
            if (theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true)) {
                this.f2387e = typedValue.resourceId == R.dimen.splashscreen_icon_size_with_background;
            }
            d(theme, typedValue);
        }

        public void b(c cVar) {
            this.f2388f = cVar;
            View viewFindViewById = this.f2383a.findViewById(android.R.id.content);
            viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0039a(viewFindViewById));
        }

        public void c(B.d dVar) {
            float dimension;
            this.f2389g = dVar;
            Activity activity = this.f2383a;
            k kVar = new k(activity);
            Integer num = this.f2384b;
            Integer num2 = this.f2385c;
            ViewGroup viewGroupC = kVar.f2403a.c();
            if (num != null && num.intValue() != 0) {
                viewGroupC.setBackgroundResource(num.intValue());
            } else if (num2 != null) {
                viewGroupC.setBackgroundColor(num2.intValue());
            } else {
                viewGroupC.setBackground(activity.getWindow().getDecorView().getBackground());
            }
            Drawable drawable = this.f2386d;
            if (drawable != null) {
                ImageView imageView = (ImageView) viewGroupC.findViewById(R.id.splashscreen_icon_view);
                if (this.f2387e) {
                    Drawable drawable2 = imageView.getContext().getDrawable(R.drawable.icon_background);
                    dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_with_background) * 0.6666667f;
                    if (drawable2 != null) {
                        imageView.setBackground(new I0.a(drawable2, dimension));
                    }
                } else {
                    dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_no_background) * 0.6666667f;
                }
                imageView.setImageDrawable(new I0.a(drawable, dimension));
            }
            viewGroupC.addOnLayoutChangeListener(new I0.c(this, kVar));
        }

        public final void d(Resources.Theme theme, TypedValue typedValue) {
            int i;
            if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i = typedValue.resourceId) == 0) {
                return;
            }
            this.f2383a.setTheme(i);
        }
    }

    /* compiled from: SplashScreen.kt */
    public interface c {
        boolean f();
    }

    public b(Activity activity) {
        this.f2382a = Build.VERSION.SDK_INT >= 31 ? new C0040b(activity) : new a(activity);
    }

    /* compiled from: SplashScreen.kt */
    /* renamed from: I0.b$b, reason: collision with other inner class name */
    public static final class C0040b extends a {
        public ViewTreeObserverOnPreDrawListenerC0041b i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f2393j;

        /* renamed from: k, reason: collision with root package name */
        public final a f2394k;

        /* compiled from: SplashScreen.kt */
        /* renamed from: I0.b$b$b, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC0041b implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f2398c;

            public ViewTreeObserverOnPreDrawListenerC0041b(View view) {
                this.f2398c = view;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (C0040b.this.f2388f.f()) {
                    return false;
                }
                this.f2398c.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        }

        public C0040b(Activity activity) {
            super(activity);
            this.f2393j = true;
            this.f2394k = new a(activity);
        }

        @Override // I0.b.a
        public final void a() {
            Activity activity = this.f2383a;
            Resources.Theme theme = activity.getTheme();
            kotlin.jvm.internal.l.e(theme, "activity.theme");
            d(theme, new TypedValue());
            ((ViewGroup) activity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f2394k);
        }

        @Override // I0.b.a
        public final void b(c cVar) {
            this.f2388f = cVar;
            View viewFindViewById = this.f2383a.findViewById(android.R.id.content);
            ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            if (this.i != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.i);
            }
            ViewTreeObserverOnPreDrawListenerC0041b viewTreeObserverOnPreDrawListenerC0041b = new ViewTreeObserverOnPreDrawListenerC0041b(viewFindViewById);
            this.i = viewTreeObserverOnPreDrawListenerC0041b;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0041b);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [I0.i] */
        @Override // I0.b.a
        public final void c(final B.d dVar) {
            this.f2383a.getSplashScreen().setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: I0.i
                @Override // android.window.SplashScreen.OnExitAnimationListener
                public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                    b.C0040b this$0 = this.f2401a;
                    B.d dVar2 = dVar;
                    kotlin.jvm.internal.l.f(this$0, "this$0");
                    kotlin.jvm.internal.l.f(splashScreenView, "splashScreenView");
                    TypedValue typedValue = new TypedValue();
                    Activity activity = this$0.f2383a;
                    Resources.Theme theme = activity.getTheme();
                    Window window = activity.getWindow();
                    if (theme.resolveAttribute(android.R.attr.statusBarColor, typedValue, true)) {
                        window.setStatusBarColor(typedValue.data);
                    }
                    if (theme.resolveAttribute(android.R.attr.navigationBarColor, typedValue, true)) {
                        window.setNavigationBarColor(typedValue.data);
                    }
                    if (theme.resolveAttribute(android.R.attr.windowDrawsSystemBarBackgrounds, typedValue, true)) {
                        if (typedValue.data != 0) {
                            window.addFlags(RecyclerView.UNDEFINED_DURATION);
                        } else {
                            window.clearFlags(RecyclerView.UNDEFINED_DURATION);
                        }
                    }
                    if (theme.resolveAttribute(android.R.attr.enforceNavigationBarContrast, typedValue, true)) {
                        window.setNavigationBarContrastEnforced(typedValue.data != 0);
                    }
                    if (theme.resolveAttribute(android.R.attr.enforceStatusBarContrast, typedValue, true)) {
                        window.setStatusBarContrastEnforced(typedValue.data != 0);
                    }
                    ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                    n.b(theme, viewGroup, typedValue);
                    viewGroup.setOnHierarchyChangeListener(null);
                    window.setDecorFitsSystemWindows(this$0.f2393j);
                    k kVar = new k(activity);
                    k.b bVar = (k.b) kVar.f2403a;
                    bVar.getClass();
                    bVar.f2407c = splashScreenView;
                    dVar2.d(kVar);
                }
            });
        }

        /* compiled from: SplashScreen.kt */
        /* renamed from: I0.b$b$a */
        public static final class a implements ViewGroup.OnHierarchyChangeListener {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Activity f2396c;

            public a(Activity activity) {
                this.f2396c = activity;
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewAdded(View view, View view2) {
                if (f.v(view2)) {
                    SplashScreenView child = j.j(view2);
                    C0040b c0040b = C0040b.this;
                    c0040b.getClass();
                    kotlin.jvm.internal.l.f(child, "child");
                    WindowInsets windowInsetsBuild = H2.e.e().build();
                    kotlin.jvm.internal.l.e(windowInsetsBuild, "Builder().build()");
                    Rect rect = new Rect(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, Integer.MAX_VALUE);
                    c0040b.f2393j = (windowInsetsBuild == child.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
                    ((ViewGroup) this.f2396c.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewRemoved(View view, View view2) {
            }
        }
    }
}

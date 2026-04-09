package p0;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f23842b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final C0451c f23843a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final c a(Activity activity) {
            p.e(activity, "<this>");
            c cVar = new c(activity, null);
            cVar.b();
            return cVar;
        }

        public a() {
        }
    }

    /* renamed from: p0.c$c, reason: collision with other inner class name */
    public static class C0451c {

        /* renamed from: a, reason: collision with root package name */
        public final Activity f23848a;

        /* renamed from: b, reason: collision with root package name */
        public int f23849b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f23850c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f23851d;

        /* renamed from: e, reason: collision with root package name */
        public Drawable f23852e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f23853f;

        /* renamed from: g, reason: collision with root package name */
        public d f23854g;

        public C0451c(Activity activity) {
            p.e(activity, "activity");
            this.f23848a = activity;
            this.f23854g = new d() { // from class: p0.d
            };
        }

        public final Activity a() {
            return this.f23848a;
        }

        public void b() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.f23848a.getTheme();
            if (theme.resolveAttribute(p0.a.windowSplashScreenBackground, typedValue, true)) {
                this.f23850c = Integer.valueOf(typedValue.resourceId);
                this.f23851d = Integer.valueOf(typedValue.data);
            }
            if (theme.resolveAttribute(p0.a.windowSplashScreenAnimatedIcon, typedValue, true)) {
                this.f23852e = d.a.b(this.f23848a, typedValue.resourceId);
            }
            if (theme.resolveAttribute(p0.a.splashScreenIconSize, typedValue, true)) {
                this.f23853f = typedValue.resourceId == p0.b.splashscreen_icon_size_with_background;
            }
            p.b(theme);
            c(theme, typedValue);
        }

        public final void c(Resources.Theme currentTheme, TypedValue typedValue) {
            p.e(currentTheme, "currentTheme");
            p.e(typedValue, "typedValue");
            if (currentTheme.resolveAttribute(p0.a.postSplashScreenTheme, typedValue, true)) {
                int i10 = typedValue.resourceId;
                this.f23849b = i10;
                if (i10 != 0) {
                    this.f23848a.setTheme(i10);
                }
            }
        }
    }

    public interface d {
    }

    public /* synthetic */ c(Activity activity, kotlin.jvm.internal.i iVar) {
        this(activity);
    }

    public static final c c(Activity activity) {
        return f23842b.a(activity);
    }

    public final void b() {
        this.f23843a.b();
    }

    public c(Activity activity) {
        this.f23843a = Build.VERSION.SDK_INT >= 31 ? new b(activity) : new C0451c(activity);
    }

    public static final class b extends C0451c {

        /* renamed from: h, reason: collision with root package name */
        public boolean f23844h;

        /* renamed from: i, reason: collision with root package name */
        public final ViewGroup.OnHierarchyChangeListener f23845i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity) {
            super(activity);
            p.e(activity, "activity");
            this.f23844h = true;
            this.f23845i = new a(activity);
        }

        @Override // p0.c.C0451c
        public void b() {
            Resources.Theme theme = a().getTheme();
            p.d(theme, "getTheme(...)");
            c(theme, new TypedValue());
            if (Build.VERSION.SDK_INT < 33) {
                View decorView = a().getWindow().getDecorView();
                p.c(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) decorView).setOnHierarchyChangeListener(this.f23845i);
            }
        }

        public final boolean d(SplashScreenView child) {
            p.e(child, "child");
            WindowInsets windowInsetsBuild = e.a().build();
            p.d(windowInsetsBuild, "build(...)");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            return (windowInsetsBuild == child.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
        }

        public final void e(boolean z10) {
            this.f23844h = z10;
        }

        public static final class a implements ViewGroup.OnHierarchyChangeListener {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Activity f23847b;

            public a(Activity activity) {
                this.f23847b = activity;
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                if (h.a(view2)) {
                    b bVar = b.this;
                    bVar.e(bVar.d(i.a(view2)));
                    View decorView = this.f23847b.getWindow().getDecorView();
                    p.c(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
            }
        }
    }
}

package I0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.window.SplashScreenView;
import b9.C2001h;
import b9.p;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import p9.InterfaceC5480a;

/* compiled from: SplashScreenViewProvider.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final a f2403a;

    /* compiled from: SplashScreenViewProvider.kt */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Activity f2404a;

        /* renamed from: b, reason: collision with root package name */
        public final p f2405b = C2001h.b(new C0042a());

        /* compiled from: SplashScreenViewProvider.kt */
        /* renamed from: I0.k$a$a, reason: collision with other inner class name */
        public static final class C0042a extends kotlin.jvm.internal.m implements InterfaceC5480a<ViewGroup> {
            public C0042a() {
                super(0);
            }

            @Override // p9.InterfaceC5480a
            public final ViewGroup invoke() {
                View viewInflate = View.inflate(a.this.f2404a, R.layout.splash_screen_view, null);
                if (viewInflate != null) {
                    return (ViewGroup) viewInflate;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }

        public a(Activity activity) {
            this.f2404a = activity;
        }

        public void a() {
            View rootView = ((ViewGroup) this.f2404a.findViewById(android.R.id.content)).getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup != null) {
                viewGroup.addView((ViewGroup) this.f2405b.getValue());
            }
        }

        public View b() {
            View viewFindViewById = c().findViewById(R.id.splashscreen_icon_view);
            kotlin.jvm.internal.l.e(viewFindViewById, "splashScreenView.findVie…d.splashscreen_icon_view)");
            return viewFindViewById;
        }

        public ViewGroup c() {
            return (ViewGroup) this.f2405b.getValue();
        }

        public void d() {
            ViewParent parent = c().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(c());
            }
        }
    }

    public k(Activity activity) {
        a bVar = Build.VERSION.SDK_INT >= 31 ? new b(activity) : new a(activity);
        bVar.a();
        this.f2403a = bVar;
    }

    /* compiled from: SplashScreenViewProvider.kt */
    public static final class b extends a {

        /* renamed from: c, reason: collision with root package name */
        public SplashScreenView f2407c;

        @Override // I0.k.a
        public final View b() {
            SplashScreenView splashScreenView = this.f2407c;
            if (splashScreenView == null) {
                kotlin.jvm.internal.l.l("platformView");
                throw null;
            }
            if (splashScreenView.getIconView() == null) {
                return new View(this.f2404a);
            }
            SplashScreenView splashScreenView2 = this.f2407c;
            if (splashScreenView2 == null) {
                kotlin.jvm.internal.l.l("platformView");
                throw null;
            }
            View iconView = splashScreenView2.getIconView();
            kotlin.jvm.internal.l.c(iconView);
            return iconView;
        }

        @Override // I0.k.a
        public final ViewGroup c() {
            SplashScreenView splashScreenView = this.f2407c;
            if (splashScreenView != null) {
                return splashScreenView;
            }
            kotlin.jvm.internal.l.l("platformView");
            throw null;
        }

        @Override // I0.k.a
        public final void d() {
            SplashScreenView splashScreenView = this.f2407c;
            if (splashScreenView == null) {
                kotlin.jvm.internal.l.l("platformView");
                throw null;
            }
            splashScreenView.remove();
            Activity activity = this.f2404a;
            Resources.Theme theme = activity.getTheme();
            kotlin.jvm.internal.l.e(theme, "activity.theme");
            View decorView = activity.getWindow().getDecorView();
            kotlin.jvm.internal.l.e(decorView, "activity.window.decorView");
            n.b(theme, decorView, new TypedValue());
        }

        @Override // I0.k.a
        public final void a() {
        }
    }
}

package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.WindowInsetsCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class WindowInsetsAnimationCompat {

    /* renamed from: a, reason: collision with root package name */
    public d f2636a;

    public static abstract class Callback {

        /* renamed from: a, reason: collision with root package name */
        public WindowInsets f2637a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2638b;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface DispatchMode {
        }

        public Callback(int i10) {
            this.f2638b = i10;
        }

        public final int a() {
            return this.f2638b;
        }

        public abstract void b(WindowInsetsAnimationCompat windowInsetsAnimationCompat);

        public abstract void c(WindowInsetsAnimationCompat windowInsetsAnimationCompat);

        public abstract WindowInsetsCompat d(WindowInsetsCompat windowInsetsCompat, List list);

        public abstract a e(WindowInsetsAnimationCompat windowInsetsAnimationCompat, a aVar);
    }

    public static class b extends d {

        /* renamed from: e, reason: collision with root package name */
        public static final Interpolator f2641e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: f, reason: collision with root package name */
        public static final Interpolator f2642f = new i1.a();

        /* renamed from: g, reason: collision with root package name */
        public static final Interpolator f2643g = new DecelerateInterpolator();

        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public final Callback f2644a;

            /* renamed from: b, reason: collision with root package name */
            public WindowInsetsCompat f2645b;

            /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$b$a$a, reason: collision with other inner class name */
            public class C0021a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsAnimationCompat f2646a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsCompat f2647b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsCompat f2648c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f2649d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ View f2650e;

                public C0021a(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i10, View view) {
                    this.f2646a = windowInsetsAnimationCompat;
                    this.f2647b = windowInsetsCompat;
                    this.f2648c = windowInsetsCompat2;
                    this.f2649d = i10;
                    this.f2650e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f2646a.e(valueAnimator.getAnimatedFraction());
                    b.k(this.f2650e, b.o(this.f2647b, this.f2648c, this.f2646a.b(), this.f2649d), Collections.singletonList(this.f2646a));
                }
            }

            /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$b$a$b, reason: collision with other inner class name */
            public class C0022b extends AnimatorListenerAdapter {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsAnimationCompat f2652a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ View f2653b;

                public C0022b(WindowInsetsAnimationCompat windowInsetsAnimationCompat, View view) {
                    this.f2652a = windowInsetsAnimationCompat;
                    this.f2653b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f2652a.e(1.0f);
                    b.i(this.f2653b, this.f2652a);
                }
            }

            public class c implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ View f2655a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsAnimationCompat f2656b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f2657c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f2658d;

                public c(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, a aVar, ValueAnimator valueAnimator) {
                    this.f2655a = view;
                    this.f2656b = windowInsetsAnimationCompat;
                    this.f2657c = aVar;
                    this.f2658d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    b.l(this.f2655a, this.f2656b, this.f2657c);
                    this.f2658d.start();
                }
            }

            public a(View view, Callback callback) {
                this.f2644a = callback;
                WindowInsetsCompat windowInsetsCompatF = ViewCompat.F(view);
                this.f2645b = windowInsetsCompatF != null ? new WindowInsetsCompat.b(windowInsetsCompatF).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f2645b = WindowInsetsCompat.x(windowInsets, view);
                    return b.m(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompatX = WindowInsetsCompat.x(windowInsets, view);
                if (this.f2645b == null) {
                    this.f2645b = ViewCompat.F(view);
                }
                if (this.f2645b == null) {
                    this.f2645b = windowInsetsCompatX;
                    return b.m(view, windowInsets);
                }
                Callback callbackN = b.n(view);
                if (callbackN != null && Objects.equals(callbackN.f2637a, windowInsets)) {
                    return b.m(view, windowInsets);
                }
                int iE = b.e(windowInsetsCompatX, this.f2645b);
                if (iE == 0) {
                    return b.m(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat = this.f2645b;
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(iE, b.g(iE, windowInsetsCompatX, windowInsetsCompat), 160L);
                windowInsetsAnimationCompat.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(windowInsetsAnimationCompat.a());
                a aVarF = b.f(windowInsetsCompatX, windowInsetsCompat, iE);
                b.j(view, windowInsetsAnimationCompat, windowInsets, false);
                duration.addUpdateListener(new C0021a(windowInsetsAnimationCompat, windowInsetsCompatX, windowInsetsCompat, iE, view));
                duration.addListener(new C0022b(windowInsetsAnimationCompat, view));
                j0.a(view, new c(view, windowInsetsAnimationCompat, aVarF, duration));
                this.f2645b = windowInsetsCompatX;
                return b.m(view, windowInsets);
            }
        }

        public b(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        public static int e(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2) {
            int i10 = 0;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if (!windowInsetsCompat.f(i11).equals(windowInsetsCompat2.f(i11))) {
                    i10 |= i11;
                }
            }
            return i10;
        }

        public static a f(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i10) {
            j0.b bVarF = windowInsetsCompat.f(i10);
            j0.b bVarF2 = windowInsetsCompat2.f(i10);
            return new a(j0.b.b(Math.min(bVarF.f21686a, bVarF2.f21686a), Math.min(bVarF.f21687b, bVarF2.f21687b), Math.min(bVarF.f21688c, bVarF2.f21688c), Math.min(bVarF.f21689d, bVarF2.f21689d)), j0.b.b(Math.max(bVarF.f21686a, bVarF2.f21686a), Math.max(bVarF.f21687b, bVarF2.f21687b), Math.max(bVarF.f21688c, bVarF2.f21688c), Math.max(bVarF.f21689d, bVarF2.f21689d)));
        }

        public static Interpolator g(int i10, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2) {
            return (i10 & 8) != 0 ? windowInsetsCompat.f(WindowInsetsCompat.Type.b()).f21689d > windowInsetsCompat2.f(WindowInsetsCompat.Type.b()).f21689d ? f2641e : f2642f : f2643g;
        }

        public static View.OnApplyWindowInsetsListener h(View view, Callback callback) {
            return new a(view, callback);
        }

        public static void i(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            Callback callbackN = n(view);
            if (callbackN != null) {
                callbackN.b(windowInsetsAnimationCompat);
                if (callbackN.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    i(viewGroup.getChildAt(i10), windowInsetsAnimationCompat);
                }
            }
        }

        public static void j(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsets windowInsets, boolean z10) {
            Callback callbackN = n(view);
            if (callbackN != null) {
                callbackN.f2637a = windowInsets;
                if (!z10) {
                    callbackN.c(windowInsetsAnimationCompat);
                    z10 = callbackN.a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    j(viewGroup.getChildAt(i10), windowInsetsAnimationCompat, windowInsets, z10);
                }
            }
        }

        public static void k(View view, WindowInsetsCompat windowInsetsCompat, List list) {
            Callback callbackN = n(view);
            if (callbackN != null) {
                windowInsetsCompat = callbackN.d(windowInsetsCompat, list);
                if (callbackN.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    k(viewGroup.getChildAt(i10), windowInsetsCompat, list);
                }
            }
        }

        public static void l(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, a aVar) {
            Callback callbackN = n(view);
            if (callbackN != null) {
                callbackN.e(windowInsetsAnimationCompat, aVar);
                if (callbackN.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    l(viewGroup.getChildAt(i10), windowInsetsAnimationCompat, aVar);
                }
            }
        }

        public static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(e0.c.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static Callback n(View view) {
            Object tag = view.getTag(e0.c.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f2644a;
            }
            return null;
        }

        public static WindowInsetsCompat o(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, float f10, int i10) {
            WindowInsetsCompat.b bVar = new WindowInsetsCompat.b(windowInsetsCompat);
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    bVar.b(i11, windowInsetsCompat.f(i11));
                } else {
                    j0.b bVarF = windowInsetsCompat.f(i11);
                    j0.b bVarF2 = windowInsetsCompat2.f(i11);
                    float f11 = 1.0f - f10;
                    bVar.b(i11, WindowInsetsCompat.o(bVarF, (int) (((bVarF.f21686a - bVarF2.f21686a) * f11) + 0.5d), (int) (((bVarF.f21687b - bVarF2.f21687b) * f11) + 0.5d), (int) (((bVarF.f21688c - bVarF2.f21688c) * f11) + 0.5d), (int) (((bVarF.f21689d - bVarF2.f21689d) * f11) + 0.5d)));
                }
            }
            return bVar.a();
        }

        public static void p(View view, Callback callback) {
            Object tag = view.getTag(e0.c.tag_on_apply_window_listener);
            if (callback == null) {
                view.setTag(e0.c.tag_window_insets_animation_callback, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerH = h(view, callback);
            view.setTag(e0.c.tag_window_insets_animation_callback, onApplyWindowInsetsListenerH);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerH);
            }
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f2665a;

        /* renamed from: b, reason: collision with root package name */
        public float f2666b;

        /* renamed from: c, reason: collision with root package name */
        public final Interpolator f2667c;

        /* renamed from: d, reason: collision with root package name */
        public final long f2668d;

        public d(int i10, Interpolator interpolator, long j10) {
            this.f2665a = i10;
            this.f2667c = interpolator;
            this.f2668d = j10;
        }

        public long a() {
            return this.f2668d;
        }

        public float b() {
            Interpolator interpolator = this.f2667c;
            return interpolator != null ? interpolator.getInterpolation(this.f2666b) : this.f2666b;
        }

        public int c() {
            return this.f2665a;
        }

        public void d(float f10) {
            this.f2666b = f10;
        }
    }

    public WindowInsetsAnimationCompat(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2636a = new c(i10, interpolator, j10);
        } else {
            this.f2636a = new b(i10, interpolator, j10);
        }
    }

    public static void d(View view, Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.h(view, callback);
        } else {
            b.p(view, callback);
        }
    }

    public static WindowInsetsAnimationCompat f(WindowInsetsAnimation windowInsetsAnimation) {
        return new WindowInsetsAnimationCompat(windowInsetsAnimation);
    }

    public long a() {
        return this.f2636a.a();
    }

    public float b() {
        return this.f2636a.b();
    }

    public int c() {
        return this.f2636a.c();
    }

    public void e(float f10) {
        this.f2636a.d(f10);
    }

    public static class c extends d {

        /* renamed from: e, reason: collision with root package name */
        public final WindowInsetsAnimation f2660e;

        public static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            public final Callback f2661a;

            /* renamed from: b, reason: collision with root package name */
            public List f2662b;

            /* renamed from: c, reason: collision with root package name */
            public ArrayList f2663c;

            /* renamed from: d, reason: collision with root package name */
            public final HashMap f2664d;

            public a(Callback callback) {
                super(callback.a());
                this.f2664d = new HashMap();
                this.f2661a = callback;
            }

            public final WindowInsetsAnimationCompat a(WindowInsetsAnimation windowInsetsAnimation) {
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) this.f2664d.get(windowInsetsAnimation);
                if (windowInsetsAnimationCompat != null) {
                    return windowInsetsAnimationCompat;
                }
                WindowInsetsAnimationCompat windowInsetsAnimationCompatF = WindowInsetsAnimationCompat.f(windowInsetsAnimation);
                this.f2664d.put(windowInsetsAnimation, windowInsetsAnimationCompatF);
                return windowInsetsAnimationCompatF;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f2661a.b(a(windowInsetsAnimation));
                this.f2664d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f2661a.c(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f2663c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f2663c = arrayList2;
                    this.f2662b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = v1.a(list.get(size));
                    WindowInsetsAnimationCompat windowInsetsAnimationCompatA = a(windowInsetsAnimationA);
                    windowInsetsAnimationCompatA.e(windowInsetsAnimationA.getFraction());
                    this.f2663c.add(windowInsetsAnimationCompatA);
                }
                return this.f2661a.d(WindowInsetsCompat.w(windowInsets), this.f2662b).v();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f2661a.e(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        public c(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f2660e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            s1.a();
            return r1.a(aVar.a().e(), aVar.b().e());
        }

        public static j0.b f(WindowInsetsAnimation.Bounds bounds) {
            return j0.b.d(bounds.getUpperBound());
        }

        public static j0.b g(WindowInsetsAnimation.Bounds bounds) {
            return j0.b.d(bounds.getLowerBound());
        }

        public static void h(View view, Callback callback) {
            view.setWindowInsetsAnimationCallback(callback != null ? new a(callback) : null);
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.d
        public long a() {
            return this.f2660e.getDurationMillis();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.d
        public float b() {
            return this.f2660e.getInterpolatedFraction();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.d
        public int c() {
            return this.f2660e.getTypeMask();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.d
        public void d(float f10) {
            this.f2660e.setFraction(f10);
        }

        public c(int i10, Interpolator interpolator, long j10) {
            this(q1.a(i10, interpolator, j10));
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final j0.b f2639a;

        /* renamed from: b, reason: collision with root package name */
        public final j0.b f2640b;

        public a(j0.b bVar, j0.b bVar2) {
            this.f2639a = bVar;
            this.f2640b = bVar2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public j0.b a() {
            return this.f2639a;
        }

        public j0.b b() {
            return this.f2640b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return c.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f2639a + " upper=" + this.f2640b + "}";
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.f2639a = c.g(bounds);
            this.f2640b = c.f(bounds);
        }
    }

    public WindowInsetsAnimationCompat(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2636a = new c(windowInsetsAnimation);
        }
    }
}

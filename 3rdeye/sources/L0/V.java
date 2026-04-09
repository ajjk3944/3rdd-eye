package L0;

import L0.I;
import L0.X;
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
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import h1.C4406a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: WindowInsetsAnimationCompat.java */
/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public e f3820a;

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final C0.e f3821a;

        /* renamed from: b, reason: collision with root package name */
        public final C0.e f3822b;

        public a(C0.e eVar, C0.e eVar2) {
            this.f3821a = eVar;
            this.f3822b = eVar2;
        }

        public final String toString() {
            return "Bounds{lower=" + this.f3821a + " upper=" + this.f3822b + "}";
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public WindowInsets f3823a;

        public abstract X a(X x10, List<V> list);
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static class c extends e {

        /* renamed from: e, reason: collision with root package name */
        public static final PathInterpolator f3824e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: f, reason: collision with root package name */
        public static final C4406a f3825f = new C4406a();

        /* renamed from: g, reason: collision with root package name */
        public static final DecelerateInterpolator f3826g = new DecelerateInterpolator();

        /* compiled from: WindowInsetsAnimationCompat.java */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public final P3.d f3827a;

            /* renamed from: b, reason: collision with root package name */
            public X f3828b;

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: L0.V$c$a$a, reason: collision with other inner class name */
            public class C0066a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ V f3829a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ X f3830b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ X f3831c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f3832d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ View f3833e;

                public C0066a(V v10, X x10, X x11, int i, View view) {
                    this.f3829a = v10;
                    this.f3830b = x10;
                    this.f3831c = x11;
                    this.f3832d = i;
                    this.f3833e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float f10;
                    int i;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    V v10 = this.f3829a;
                    v10.f3820a.d(animatedFraction);
                    float fB = v10.f3820a.b();
                    PathInterpolator pathInterpolator = c.f3824e;
                    int i10 = Build.VERSION.SDK_INT;
                    X x10 = this.f3830b;
                    X.e dVar = i10 >= 30 ? new X.d(x10) : i10 >= 29 ? new X.c(x10) : new X.b(x10);
                    int i11 = 1;
                    while (i11 <= 256) {
                        int i12 = this.f3832d & i11;
                        X.k kVar = x10.f3850a;
                        if (i12 == 0) {
                            dVar.c(i11, kVar.f(i11));
                            f10 = fB;
                            i = 1;
                        } else {
                            C0.e eVarF = kVar.f(i11);
                            C0.e eVarF2 = this.f3831c.f3850a.f(i11);
                            float f11 = 1.0f - fB;
                            f10 = fB;
                            i = 1;
                            dVar.c(i11, X.e(eVarF, (int) (((eVarF.f801a - eVarF2.f801a) * f11) + 0.5d), (int) (((eVarF.f802b - eVarF2.f802b) * f11) + 0.5d), (int) (((eVarF.f803c - eVarF2.f803c) * f11) + 0.5d), (int) (((eVarF.f804d - eVarF2.f804d) * f11) + 0.5d)));
                        }
                        i11 <<= i;
                        fB = f10;
                    }
                    c.g(this.f3833e, dVar.b(), Collections.singletonList(v10));
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            public class b extends AnimatorListenerAdapter {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ V f3834a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ View f3835b;

                public b(V v10, View view) {
                    this.f3834a = v10;
                    this.f3835b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    V v10 = this.f3834a;
                    v10.f3820a.d(1.0f);
                    c.e(v10, this.f3835b);
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: L0.V$c$a$c, reason: collision with other inner class name */
            public class RunnableC0067c implements Runnable {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ View f3836b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ V f3837c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ a f3838d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f3839e;

                public RunnableC0067c(View view, V v10, a aVar, ValueAnimator valueAnimator) {
                    this.f3836b = view;
                    this.f3837c = v10;
                    this.f3838d = aVar;
                    this.f3839e = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.h(this.f3836b, this.f3837c, this.f3838d);
                    this.f3839e.start();
                }
            }

            public a(View view, P3.d dVar) {
                X xB;
                this.f3827a = dVar;
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                X xA = I.e.a(view);
                if (xA != null) {
                    int i = Build.VERSION.SDK_INT;
                    xB = (i >= 30 ? new X.d(xA) : i >= 29 ? new X.c(xA) : new X.b(xA)).b();
                } else {
                    xB = null;
                }
                this.f3828b = xB;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                X.k kVar;
                if (!view.isLaidOut()) {
                    this.f3828b = X.h(view, windowInsets);
                    return c.i(view, windowInsets);
                }
                X xH = X.h(view, windowInsets);
                if (this.f3828b == null) {
                    WeakHashMap<View, S> weakHashMap = I.f3792a;
                    this.f3828b = I.e.a(view);
                }
                if (this.f3828b == null) {
                    this.f3828b = xH;
                    return c.i(view, windowInsets);
                }
                b bVarJ = c.j(view);
                if (bVarJ != null && Objects.equals(bVarJ.f3823a, windowInsets)) {
                    return c.i(view, windowInsets);
                }
                X x10 = this.f3828b;
                int i = 1;
                int i10 = 0;
                while (true) {
                    kVar = xH.f3850a;
                    if (i > 256) {
                        break;
                    }
                    if (!kVar.f(i).equals(x10.f3850a.f(i))) {
                        i10 |= i;
                    }
                    i <<= 1;
                }
                if (i10 == 0) {
                    return c.i(view, windowInsets);
                }
                X x11 = this.f3828b;
                V v10 = new V(i10, (i10 & 8) != 0 ? kVar.f(8).f804d > x11.f3850a.f(8).f804d ? c.f3824e : c.f3825f : c.f3826g, 160L);
                v10.f3820a.d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(v10.f3820a.a());
                C0.e eVarF = kVar.f(i10);
                C0.e eVarF2 = x11.f3850a.f(i10);
                int iMin = Math.min(eVarF.f801a, eVarF2.f801a);
                int i11 = eVarF.f802b;
                int i12 = eVarF2.f802b;
                int iMin2 = Math.min(i11, i12);
                int i13 = eVarF.f803c;
                int i14 = eVarF2.f803c;
                int iMin3 = Math.min(i13, i14);
                int i15 = eVarF.f804d;
                int i16 = i10;
                int i17 = eVarF2.f804d;
                a aVar = new a(C0.e.b(iMin, iMin2, iMin3, Math.min(i15, i17)), C0.e.b(Math.max(eVarF.f801a, eVarF2.f801a), Math.max(i11, i12), Math.max(i13, i14), Math.max(i15, i17)));
                c.f(view, v10, windowInsets, false);
                duration.addUpdateListener(new C0066a(v10, xH, x11, i16, view));
                duration.addListener(new b(v10, view));
                ViewTreeObserverOnPreDrawListenerC0791w.a(view, new RunnableC0067c(view, v10, aVar, duration));
                this.f3828b = xH;
                return c.i(view, windowInsets);
            }
        }

        public static void e(V v10, View view) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                ((P3.d) bVarJ).f10591b.setTranslationY(0.0f);
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    e(v10, viewGroup.getChildAt(i));
                }
            }
        }

        public static void f(View view, V v10, WindowInsets windowInsets, boolean z10) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                bVarJ.f3823a = windowInsets;
                if (!z10) {
                    P3.d dVar = (P3.d) bVarJ;
                    View view2 = dVar.f10591b;
                    int[] iArr = dVar.f10594e;
                    view2.getLocationOnScreen(iArr);
                    z10 = true;
                    dVar.f10592c = iArr[1];
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    f(viewGroup.getChildAt(i), v10, windowInsets, z10);
                }
            }
        }

        public static void g(View view, X x10, List<V> list) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                bVarJ.a(x10, list);
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    g(viewGroup.getChildAt(i), x10, list);
                }
            }
        }

        public static void h(View view, V v10, a aVar) {
            b bVarJ = j(view);
            if (bVarJ == null) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        h(viewGroup.getChildAt(i), v10, aVar);
                    }
                    return;
                }
                return;
            }
            P3.d dVar = (P3.d) bVarJ;
            View view2 = dVar.f10591b;
            int[] iArr = dVar.f10594e;
            view2.getLocationOnScreen(iArr);
            int i10 = dVar.f10592c - iArr[1];
            dVar.f10593d = i10;
            view2.setTranslationY(i10);
        }

        public static WindowInsets i(View view, WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static b j(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f3827a;
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static class d extends e {

        /* renamed from: e, reason: collision with root package name */
        public final WindowInsetsAnimation f3840e;

        /* compiled from: WindowInsetsAnimationCompat.java */
        public static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            public final P3.d f3841a;

            /* renamed from: b, reason: collision with root package name */
            public List<V> f3842b;

            /* renamed from: c, reason: collision with root package name */
            public ArrayList<V> f3843c;

            /* renamed from: d, reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, V> f3844d;

            public a(P3.d dVar) {
                super(0);
                this.f3844d = new HashMap<>();
                this.f3841a = dVar;
            }

            public final V a(WindowInsetsAnimation windowInsetsAnimation) {
                V v10 = this.f3844d.get(windowInsetsAnimation);
                if (v10 == null) {
                    v10 = new V(0, null, 0L);
                    if (Build.VERSION.SDK_INT >= 30) {
                        v10.f3820a = new d(windowInsetsAnimation);
                    }
                    this.f3844d.put(windowInsetsAnimation, v10);
                }
                return v10;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                P3.d dVar = this.f3841a;
                a(windowInsetsAnimation);
                dVar.f10591b.setTranslationY(0.0f);
                this.f3844d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                P3.d dVar = this.f3841a;
                a(windowInsetsAnimation);
                View view = dVar.f10591b;
                int[] iArr = dVar.f10594e;
                view.getLocationOnScreen(iArr);
                dVar.f10592c = iArr[1];
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<V> arrayList = this.f3843c;
                if (arrayList == null) {
                    ArrayList<V> arrayList2 = new ArrayList<>(list.size());
                    this.f3843c = arrayList2;
                    this.f3842b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationI = C0793y.i(list.get(size));
                    V vA = a(windowInsetsAnimationI);
                    vA.f3820a.d(windowInsetsAnimationI.getFraction());
                    this.f3843c.add(vA);
                }
                P3.d dVar = this.f3841a;
                X xH = X.h(null, windowInsets);
                dVar.a(xH, this.f3842b);
                return xH.g();
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                P3.d dVar = this.f3841a;
                a(windowInsetsAnimation);
                C0.e eVarC = C0.e.c(bounds.getLowerBound());
                C0.e eVarC2 = C0.e.c(bounds.getUpperBound());
                View view = dVar.f10591b;
                int[] iArr = dVar.f10594e;
                view.getLocationOnScreen(iArr);
                int i = dVar.f10592c - iArr[1];
                dVar.f10593d = i;
                view.setTranslationY(i);
                I0.m.i();
                return I0.l.d(eVarC.d(), eVarC2.d());
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f3840e = windowInsetsAnimation;
        }

        @Override // L0.V.e
        public final long a() {
            return this.f3840e.getDurationMillis();
        }

        @Override // L0.V.e
        public final float b() {
            return this.f3840e.getInterpolatedFraction();
        }

        @Override // L0.V.e
        public final int c() {
            return this.f3840e.getTypeMask();
        }

        @Override // L0.V.e
        public final void d(float f10) {
            this.f3840e.setFraction(f10);
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f3845a;

        /* renamed from: b, reason: collision with root package name */
        public float f3846b;

        /* renamed from: c, reason: collision with root package name */
        public final Interpolator f3847c;

        /* renamed from: d, reason: collision with root package name */
        public final long f3848d;

        public e(int i, Interpolator interpolator, long j4) {
            this.f3845a = i;
            this.f3847c = interpolator;
            this.f3848d = j4;
        }

        public long a() {
            return this.f3848d;
        }

        public float b() {
            Interpolator interpolator = this.f3847c;
            return interpolator != null ? interpolator.getInterpolation(this.f3846b) : this.f3846b;
        }

        public int c() {
            return this.f3845a;
        }

        public void d(float f10) {
            this.f3846b = f10;
        }
    }

    public V(int i, Interpolator interpolator, long j4) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3820a = new d(I0.h.f(i, interpolator, j4));
        } else {
            this.f3820a = new c(i, interpolator, j4);
        }
    }
}

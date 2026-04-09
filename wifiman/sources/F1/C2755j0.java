package F1;

import F1.C2780w0;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import r1.AbstractC7556b;

/* renamed from: F1.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2755j0 {

    /* renamed from: a, reason: collision with root package name */
    private e f5726a;

    /* renamed from: F1.j0$b */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        WindowInsets f5729a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5730b;

        public b(int i10) {
            this.f5730b = i10;
        }

        public final int b() {
            return this.f5730b;
        }

        public void c(C2755j0 c2755j0) {
        }

        public void d(C2755j0 c2755j0) {
        }

        public abstract C2780w0 e(C2780w0 c2780w0, List list);

        public a f(C2755j0 c2755j0, a aVar) {
            return aVar;
        }
    }

    /* renamed from: F1.j0$c */
    private static class c extends e {

        /* renamed from: e, reason: collision with root package name */
        private static final Interpolator f5731e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: f, reason: collision with root package name */
        private static final Interpolator f5732f = new X1.a();

        /* renamed from: g, reason: collision with root package name */
        private static final Interpolator f5733g = new DecelerateInterpolator();

        /* renamed from: F1.j0$c$a */
        private static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            final b f5734a;

            /* renamed from: b, reason: collision with root package name */
            private C2780w0 f5735b;

            /* renamed from: F1.j0$c$a$a, reason: collision with other inner class name */
            class C0237a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C2755j0 f5736a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C2780w0 f5737b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C2780w0 f5738c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f5739d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ View f5740e;

                C0237a(C2755j0 c2755j0, C2780w0 c2780w0, C2780w0 c2780w02, int i10, View view) {
                    this.f5736a = c2755j0;
                    this.f5737b = c2780w0;
                    this.f5738c = c2780w02;
                    this.f5739d = i10;
                    this.f5740e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f5736a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.f5740e, c.o(this.f5737b, this.f5738c, this.f5736a.b(), this.f5739d), Collections.singletonList(this.f5736a));
                }
            }

            /* renamed from: F1.j0$c$a$b */
            class b extends AnimatorListenerAdapter {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C2755j0 f5742a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f5743b;

                b(C2755j0 c2755j0, View view) {
                    this.f5742a = c2755j0;
                    this.f5743b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f5742a.e(1.0f);
                    c.i(this.f5743b, this.f5742a);
                }
            }

            /* renamed from: F1.j0$c$a$c, reason: collision with other inner class name */
            class RunnableC0238c implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ View f5745a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C2755j0 f5746b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ a f5747c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f5748d;

                RunnableC0238c(View view, C2755j0 c2755j0, a aVar, ValueAnimator valueAnimator) {
                    this.f5745a = view;
                    this.f5746b = c2755j0;
                    this.f5747c = aVar;
                    this.f5748d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.l(this.f5745a, this.f5746b, this.f5747c);
                    this.f5748d.start();
                }
            }

            a(View view, b bVar) {
                this.f5734a = bVar;
                C2780w0 c2780w0F = W.F(view);
                this.f5735b = c2780w0F != null ? new C2780w0.a(c2780w0F).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                int iE;
                if (!view.isLaidOut()) {
                    this.f5735b = C2780w0.x(windowInsets, view);
                    return c.m(view, windowInsets);
                }
                C2780w0 c2780w0X = C2780w0.x(windowInsets, view);
                if (this.f5735b == null) {
                    this.f5735b = W.F(view);
                }
                if (this.f5735b == null) {
                    this.f5735b = c2780w0X;
                    return c.m(view, windowInsets);
                }
                b bVarN = c.n(view);
                if ((bVarN == null || !Objects.equals(bVarN.f5729a, windowInsets)) && (iE = c.e(c2780w0X, this.f5735b)) != 0) {
                    C2780w0 c2780w0 = this.f5735b;
                    C2755j0 c2755j0 = new C2755j0(iE, c.g(iE, c2780w0X, c2780w0), 160L);
                    c2755j0.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c2755j0.a());
                    a aVarF = c.f(c2780w0X, c2780w0, iE);
                    c.j(view, c2755j0, windowInsets, false);
                    duration.addUpdateListener(new C0237a(c2755j0, c2780w0X, c2780w0, iE, view));
                    duration.addListener(new b(c2755j0, view));
                    I.a(view, new RunnableC0238c(view, c2755j0, aVarF, duration));
                    this.f5735b = c2780w0X;
                    return c.m(view, windowInsets);
                }
                return c.m(view, windowInsets);
            }
        }

        c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        static int e(C2780w0 c2780w0, C2780w0 c2780w02) {
            int i10 = 0;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if (!c2780w0.f(i11).equals(c2780w02.f(i11))) {
                    i10 |= i11;
                }
            }
            return i10;
        }

        static a f(C2780w0 c2780w0, C2780w0 c2780w02, int i10) {
            w1.f fVarF = c2780w0.f(i10);
            w1.f fVarF2 = c2780w02.f(i10);
            return new a(w1.f.b(Math.min(fVarF.f64336a, fVarF2.f64336a), Math.min(fVarF.f64337b, fVarF2.f64337b), Math.min(fVarF.f64338c, fVarF2.f64338c), Math.min(fVarF.f64339d, fVarF2.f64339d)), w1.f.b(Math.max(fVarF.f64336a, fVarF2.f64336a), Math.max(fVarF.f64337b, fVarF2.f64337b), Math.max(fVarF.f64338c, fVarF2.f64338c), Math.max(fVarF.f64339d, fVarF2.f64339d)));
        }

        static Interpolator g(int i10, C2780w0 c2780w0, C2780w0 c2780w02) {
            return (i10 & 8) != 0 ? c2780w0.f(C2780w0.l.c()).f64339d > c2780w02.f(C2780w0.l.c()).f64339d ? f5731e : f5732f : f5733g;
        }

        private static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        static void i(View view, C2755j0 c2755j0) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.c(c2755j0);
                if (bVarN.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    i(viewGroup.getChildAt(i10), c2755j0);
                }
            }
        }

        static void j(View view, C2755j0 c2755j0, WindowInsets windowInsets, boolean z10) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.f5729a = windowInsets;
                if (!z10) {
                    bVarN.d(c2755j0);
                    z10 = bVarN.b() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    j(viewGroup.getChildAt(i10), c2755j0, windowInsets, z10);
                }
            }
        }

        static void k(View view, C2780w0 c2780w0, List list) {
            b bVarN = n(view);
            if (bVarN != null) {
                c2780w0 = bVarN.e(c2780w0, list);
                if (bVarN.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    k(viewGroup.getChildAt(i10), c2780w0, list);
                }
            }
        }

        static void l(View view, C2755j0 c2755j0, a aVar) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.f(c2755j0, aVar);
                if (bVarN.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    l(viewGroup.getChildAt(i10), c2755j0, aVar);
                }
            }
        }

        static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(AbstractC7556b.f59969L) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b n(View view) {
            Object tag = view.getTag(AbstractC7556b.f59976S);
            if (tag instanceof a) {
                return ((a) tag).f5734a;
            }
            return null;
        }

        static C2780w0 o(C2780w0 c2780w0, C2780w0 c2780w02, float f10, int i10) {
            C2780w0.a aVar = new C2780w0.a(c2780w0);
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    aVar.b(i11, c2780w0.f(i11));
                } else {
                    w1.f fVarF = c2780w0.f(i11);
                    w1.f fVarF2 = c2780w02.f(i11);
                    float f11 = 1.0f - f10;
                    aVar.b(i11, C2780w0.n(fVarF, (int) (((fVarF.f64336a - fVarF2.f64336a) * f11) + 0.5d), (int) (((fVarF.f64337b - fVarF2.f64337b) * f11) + 0.5d), (int) (((fVarF.f64338c - fVarF2.f64338c) * f11) + 0.5d), (int) (((fVarF.f64339d - fVarF2.f64339d) * f11) + 0.5d)));
                }
            }
            return aVar.a();
        }

        static void p(View view, b bVar) {
            Object tag = view.getTag(AbstractC7556b.f59969L);
            if (bVar == null) {
                view.setTag(AbstractC7556b.f59976S, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerH = h(view, bVar);
            view.setTag(AbstractC7556b.f59976S, onApplyWindowInsetsListenerH);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerH);
            }
        }
    }

    /* renamed from: F1.j0$e */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final int f5755a;

        /* renamed from: b, reason: collision with root package name */
        private float f5756b;

        /* renamed from: c, reason: collision with root package name */
        private final Interpolator f5757c;

        /* renamed from: d, reason: collision with root package name */
        private final long f5758d;

        e(int i10, Interpolator interpolator, long j10) {
            this.f5755a = i10;
            this.f5757c = interpolator;
            this.f5758d = j10;
        }

        public long a() {
            return this.f5758d;
        }

        public float b() {
            Interpolator interpolator = this.f5757c;
            return interpolator != null ? interpolator.getInterpolation(this.f5756b) : this.f5756b;
        }

        public int c() {
            return this.f5755a;
        }

        public void d(float f10) {
            this.f5756b = f10;
        }
    }

    public C2755j0(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f5726a = new d(i10, interpolator, j10);
        } else {
            this.f5726a = new c(i10, interpolator, j10);
        }
    }

    static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.p(view, bVar);
        }
    }

    static C2755j0 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new C2755j0(windowInsetsAnimation);
    }

    public long a() {
        return this.f5726a.a();
    }

    public float b() {
        return this.f5726a.b();
    }

    public int c() {
        return this.f5726a.c();
    }

    public void e(float f10) {
        this.f5726a.d(f10);
    }

    /* renamed from: F1.j0$d */
    private static class d extends e {

        /* renamed from: e, reason: collision with root package name */
        private final WindowInsetsAnimation f5750e;

        /* renamed from: F1.j0$d$a */
        private static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            private final b f5751a;

            /* renamed from: b, reason: collision with root package name */
            private List f5752b;

            /* renamed from: c, reason: collision with root package name */
            private ArrayList f5753c;

            /* renamed from: d, reason: collision with root package name */
            private final HashMap f5754d;

            a(b bVar) {
                super(bVar.b());
                this.f5754d = new HashMap();
                this.f5751a = bVar;
            }

            private C2755j0 a(WindowInsetsAnimation windowInsetsAnimation) {
                C2755j0 c2755j0 = (C2755j0) this.f5754d.get(windowInsetsAnimation);
                if (c2755j0 != null) {
                    return c2755j0;
                }
                C2755j0 c2755j0F = C2755j0.f(windowInsetsAnimation);
                this.f5754d.put(windowInsetsAnimation, c2755j0F);
                return c2755j0F;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f5751a.c(a(windowInsetsAnimation));
                this.f5754d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f5751a.d(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f5753c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f5753c = arrayList2;
                    this.f5752b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = AbstractC2776u0.a(list.get(size));
                    C2755j0 c2755j0A = a(windowInsetsAnimationA);
                    c2755j0A.e(windowInsetsAnimationA.getFraction());
                    this.f5753c.add(c2755j0A);
                }
                return this.f5751a.e(C2780w0.w(windowInsets), this.f5752b).v();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f5751a.f(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f5750e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            AbstractC2774t0.a();
            return AbstractC2772s0.a(aVar.a().e(), aVar.b().e());
        }

        public static w1.f f(WindowInsetsAnimation.Bounds bounds) {
            return w1.f.d(bounds.getUpperBound());
        }

        public static w1.f g(WindowInsetsAnimation.Bounds bounds) {
            return w1.f.d(bounds.getLowerBound());
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // F1.C2755j0.e
        public long a() {
            return this.f5750e.getDurationMillis();
        }

        @Override // F1.C2755j0.e
        public float b() {
            return this.f5750e.getInterpolatedFraction();
        }

        @Override // F1.C2755j0.e
        public int c() {
            return this.f5750e.getTypeMask();
        }

        @Override // F1.C2755j0.e
        public void d(float f10) {
            this.f5750e.setFraction(f10);
        }

        d(int i10, Interpolator interpolator, long j10) {
            this(AbstractC2770r0.a(i10, interpolator, j10));
        }
    }

    /* renamed from: F1.j0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final w1.f f5727a;

        /* renamed from: b, reason: collision with root package name */
        private final w1.f f5728b;

        public a(w1.f fVar, w1.f fVar2) {
            this.f5727a = fVar;
            this.f5728b = fVar2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public w1.f a() {
            return this.f5727a;
        }

        public w1.f b() {
            return this.f5728b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f5727a + " upper=" + this.f5728b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f5727a = d.g(bounds);
            this.f5728b = d.f(bounds);
        }
    }

    private C2755j0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f5726a = new d(windowInsetsAnimation);
        }
    }
}

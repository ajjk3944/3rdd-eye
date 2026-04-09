package I6;

import K1.i;
import K1.z;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.HashMap;

/* compiled from: Slide.kt */
/* loaded from: classes.dex */
public final class n extends I6.i {

    /* renamed from: G, reason: collision with root package name */
    public static final b f2563G = new b();

    /* renamed from: H, reason: collision with root package name */
    public static final d f2564H = new d();

    /* renamed from: I, reason: collision with root package name */
    public static final c f2565I = new c();

    /* renamed from: J, reason: collision with root package name */
    public static final a f2566J = new a();

    /* renamed from: E, reason: collision with root package name */
    public final int f2567E;

    /* renamed from: F, reason: collision with root package name */
    public final f f2568F;

    /* compiled from: Slide.kt */
    public static final class a extends h {
        @Override // I6.n.f
        public final float b(int i, View view, ViewGroup sceneRoot) {
            kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
            kotlin.jvm.internal.l.f(view, "view");
            float translationY = view.getTranslationY();
            b bVar = n.f2563G;
            int height = sceneRoot.getHeight() - view.getTop();
            if (i == -1) {
                i = height;
            }
            return translationY + i;
        }
    }

    /* compiled from: Slide.kt */
    public static final class b extends e {
        @Override // I6.n.f
        public final float a(int i, View view, ViewGroup sceneRoot) {
            kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
            kotlin.jvm.internal.l.f(view, "view");
            float translationX = view.getTranslationX();
            b bVar = n.f2563G;
            int right = view.getRight();
            if (i == -1) {
                i = right;
            }
            return translationX - i;
        }
    }

    /* compiled from: Slide.kt */
    public static final class c extends e {
        @Override // I6.n.f
        public final float a(int i, View view, ViewGroup sceneRoot) {
            kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
            kotlin.jvm.internal.l.f(view, "view");
            float translationX = view.getTranslationX();
            b bVar = n.f2563G;
            int width = sceneRoot.getWidth() - view.getLeft();
            if (i == -1) {
                i = width;
            }
            return translationX + i;
        }
    }

    /* compiled from: Slide.kt */
    public static final class d extends h {
        @Override // I6.n.f
        public final float b(int i, View view, ViewGroup sceneRoot) {
            kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
            kotlin.jvm.internal.l.f(view, "view");
            float translationY = view.getTranslationY();
            b bVar = n.f2563G;
            int bottom = view.getBottom();
            if (i == -1) {
                i = bottom;
            }
            return translationY - i;
        }
    }

    /* compiled from: Slide.kt */
    public static abstract class e implements f {
        @Override // I6.n.f
        public final float b(int i, View view, ViewGroup sceneRoot) {
            kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
            kotlin.jvm.internal.l.f(view, "view");
            return view.getTranslationY();
        }
    }

    /* compiled from: Slide.kt */
    public interface f {
        float a(int i, View view, ViewGroup viewGroup);

        float b(int i, View view, ViewGroup viewGroup);
    }

    /* compiled from: Slide.kt */
    public static abstract class h implements f {
        @Override // I6.n.f
        public final float a(int i, View view, ViewGroup sceneRoot) {
            kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
            kotlin.jvm.internal.l.f(view, "view");
            return view.getTranslationX();
        }
    }

    /* compiled from: Slide.kt */
    public static final class i extends kotlin.jvm.internal.m implements p9.l<int[], C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ K1.p f2577g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(K1.p pVar) {
            super(1);
            this.f2577g = pVar;
        }

        @Override // p9.l
        public final C1992A invoke(int[] iArr) {
            int[] position = iArr;
            kotlin.jvm.internal.l.f(position, "position");
            HashMap map = this.f2577g.f3031a;
            kotlin.jvm.internal.l.e(map, "transitionValues.values");
            map.put("yandex:slide:screenPosition", position);
            return C1992A.f18074a;
        }
    }

    /* compiled from: Slide.kt */
    public static final class j extends kotlin.jvm.internal.m implements p9.l<int[], C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ K1.p f2578g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(K1.p pVar) {
            super(1);
            this.f2578g = pVar;
        }

        @Override // p9.l
        public final C1992A invoke(int[] iArr) {
            int[] position = iArr;
            kotlin.jvm.internal.l.f(position, "position");
            HashMap map = this.f2578g.f3031a;
            kotlin.jvm.internal.l.e(map, "transitionValues.values");
            map.put("yandex:slide:screenPosition", position);
            return C1992A.f18074a;
        }
    }

    public n(int i10, int i11) {
        this.f2567E = i10;
        this.f2568F = i11 != 3 ? i11 != 5 ? i11 != 48 ? f2566J : f2564H : f2565I : f2563G;
    }

    public static ObjectAnimator T(View view, n nVar, K1.p pVar, int i10, int i11, float f10, float f11, float f12, float f13, TimeInterpolator timeInterpolator) {
        float f14;
        float f15;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        Object tag = pVar.f3032b.getTag(R.id.div_transition_position);
        if ((tag instanceof int[] ? (int[]) tag : null) != null) {
            f14 = (r5[0] - i10) + translationX;
            f15 = (r5[1] - i11) + translationY;
        } else {
            f14 = f10;
            f15 = f11;
        }
        int iY = com.google.gson.internal.c.y(f14 - translationX) + i10;
        int iY2 = com.google.gson.internal.c.y(f15 - translationY) + i11;
        view.setTranslationX(f14);
        view.setTranslationY(f15);
        if (f14 == f12 && f15 == f13) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f14, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f15, f13));
        kotlin.jvm.internal.l.e(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(\n…, startY, endY)\n        )");
        View view2 = pVar.f3032b;
        kotlin.jvm.internal.l.e(view2, "values.view");
        g gVar = new g(view2, view, iY, iY2, translationX, translationY);
        nVar.a(gVar);
        objectAnimatorOfPropertyValuesHolder.addListener(gVar);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(gVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // K1.z
    public final ObjectAnimator P(ViewGroup sceneRoot, View view, K1.p pVar, K1.p pVar2) {
        kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
        kotlin.jvm.internal.l.f(view, "view");
        if (pVar2 == null) {
            return null;
        }
        Object obj = pVar2.f3031a.get("yandex:slide:screenPosition");
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        f fVar = this.f2568F;
        int i10 = this.f2567E;
        return T(v.a(view, sceneRoot, this, iArr), this, pVar2, iArr[0], iArr[1], fVar.a(i10, view, sceneRoot), fVar.b(i10, view, sceneRoot), view.getTranslationX(), view.getTranslationY(), this.f2982e);
    }

    @Override // K1.z
    public final ObjectAnimator R(ViewGroup sceneRoot, View view, K1.p pVar, K1.p pVar2) {
        kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
        if (pVar == null) {
            return null;
        }
        Object obj = pVar.f3031a.get("yandex:slide:screenPosition");
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        f fVar = this.f2568F;
        int i10 = this.f2567E;
        return T(p.b(this, view, sceneRoot, pVar, "yandex:slide:screenPosition"), this, pVar, iArr[0], iArr[1], translationX, translationY, fVar.a(i10, view, sceneRoot), fVar.b(i10, view, sceneRoot), this.f2982e);
    }

    @Override // K1.z, K1.i
    public final void f(K1.p pVar) {
        z.M(pVar);
        p.a(pVar, new i(pVar));
    }

    @Override // K1.i
    public final void i(K1.p pVar) {
        z.M(pVar);
        p.a(pVar, new j(pVar));
    }

    /* compiled from: Slide.kt */
    public static final class g extends AnimatorListenerAdapter implements i.d {

        /* renamed from: a, reason: collision with root package name */
        public final View f2569a;

        /* renamed from: b, reason: collision with root package name */
        public final View f2570b;

        /* renamed from: c, reason: collision with root package name */
        public final float f2571c;

        /* renamed from: d, reason: collision with root package name */
        public final float f2572d;

        /* renamed from: e, reason: collision with root package name */
        public final int f2573e;

        /* renamed from: f, reason: collision with root package name */
        public final int f2574f;

        /* renamed from: g, reason: collision with root package name */
        public int[] f2575g;

        /* renamed from: h, reason: collision with root package name */
        public float f2576h;
        public float i;

        public g(View originalView, View view, int i, int i10, float f10, float f11) {
            kotlin.jvm.internal.l.f(originalView, "originalView");
            this.f2569a = originalView;
            this.f2570b = view;
            this.f2571c = f10;
            this.f2572d = f11;
            this.f2573e = i - com.google.gson.internal.c.y(view.getTranslationX());
            this.f2574f = i10 - com.google.gson.internal.c.y(view.getTranslationY());
            Object tag = originalView.getTag(R.id.div_transition_position);
            int[] iArr = tag instanceof int[] ? (int[]) tag : null;
            this.f2575g = iArr;
            if (iArr != null) {
                originalView.setTag(R.id.div_transition_position, null);
            }
        }

        @Override // K1.i.d
        public final void a(K1.i iVar) {
            View view = this.f2570b;
            view.setTranslationX(this.f2571c);
            view.setTranslationY(this.f2572d);
            iVar.z(this);
        }

        @Override // K1.i.d
        public final void e(K1.i iVar) {
            a(iVar);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.l.f(animation, "animation");
            if (this.f2575g == null) {
                View view = this.f2570b;
                this.f2575g = new int[]{com.google.gson.internal.c.y(view.getTranslationX()) + this.f2573e, com.google.gson.internal.c.y(view.getTranslationY()) + this.f2574f};
            }
            this.f2569a.setTag(R.id.div_transition_position, this.f2575g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            kotlin.jvm.internal.l.f(animator, "animator");
            View view = this.f2570b;
            this.f2576h = view.getTranslationX();
            this.i = view.getTranslationY();
            view.setTranslationX(this.f2571c);
            view.setTranslationY(this.f2572d);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            kotlin.jvm.internal.l.f(animator, "animator");
            float f10 = this.f2576h;
            View view = this.f2570b;
            view.setTranslationX(f10);
            view.setTranslationY(this.i);
        }

        @Override // K1.i.d
        public final void b(K1.i iVar) {
        }

        @Override // K1.i.d
        public final void c(K1.i iVar) {
        }

        @Override // K1.i.d
        public final void d(K1.i iVar) {
        }

        @Override // K1.i.d
        public final void f(K1.i iVar) {
        }

        @Override // K1.i.d
        public final void g(K1.i iVar) {
        }
    }
}

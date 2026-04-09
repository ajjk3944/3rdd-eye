package I6;

import K1.z;
import L0.I;
import L0.S;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import b9.C1992A;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: VerticalTranslation.kt */
/* loaded from: classes.dex */
public final class r extends i {

    /* renamed from: E, reason: collision with root package name */
    public final float f2583E;

    /* renamed from: F, reason: collision with root package name */
    public final float f2584F;

    /* compiled from: VerticalTranslation.kt */
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final View f2585a;

        public a(View view) {
            kotlin.jvm.internal.l.f(view, "view");
            this.f2585a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.l.f(animation, "animation");
            View view = this.f2585a;
            view.setTranslationY(0.0f);
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            view.setClipBounds(null);
        }
    }

    /* compiled from: VerticalTranslation.kt */
    public static final class b extends Property<View, Float> {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f2586a;

        /* renamed from: b, reason: collision with root package name */
        public float f2587b;

        public b(View view) {
            super(Float.TYPE, "ClipBoundsTop");
            this.f2586a = new Rect(0, 0, view.getWidth(), view.getHeight());
        }

        public final void a(View view, float f10) {
            kotlin.jvm.internal.l.f(view, "view");
            this.f2587b = f10;
            Rect rect = this.f2586a;
            if (f10 < 0.0f) {
                rect.set(0, (int) ((-f10) * (view.getHeight() - 1)), view.getWidth(), view.getHeight());
            } else if (f10 > 0.0f) {
                float f11 = 1;
                rect.set(0, 0, view.getWidth(), (int) (((f11 - this.f2587b) * view.getHeight()) + f11));
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            view.setClipBounds(rect);
        }

        @Override // android.util.Property
        public final Float get(View view) {
            View view2 = view;
            kotlin.jvm.internal.l.f(view2, "view");
            return Float.valueOf(this.f2587b);
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ void set(View view, Float f10) {
            a(view, f10.floatValue());
        }
    }

    /* compiled from: VerticalTranslation.kt */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<int[], C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ K1.p f2588g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(K1.p pVar) {
            super(1);
            this.f2588g = pVar;
        }

        @Override // p9.l
        public final C1992A invoke(int[] iArr) {
            int[] position = iArr;
            kotlin.jvm.internal.l.f(position, "position");
            HashMap map = this.f2588g.f3031a;
            kotlin.jvm.internal.l.e(map, "transitionValues.values");
            map.put("yandex:verticalTranslation:screenPosition", position);
            return C1992A.f18074a;
        }
    }

    /* compiled from: VerticalTranslation.kt */
    public static final class d extends kotlin.jvm.internal.m implements p9.l<int[], C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ K1.p f2589g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(K1.p pVar) {
            super(1);
            this.f2589g = pVar;
        }

        @Override // p9.l
        public final C1992A invoke(int[] iArr) {
            int[] position = iArr;
            kotlin.jvm.internal.l.f(position, "position");
            HashMap map = this.f2589g.f3031a;
            kotlin.jvm.internal.l.e(map, "transitionValues.values");
            map.put("yandex:verticalTranslation:screenPosition", position);
            return C1992A.f18074a;
        }
    }

    public r(float f10, float f11) {
        this.f2583E = f10;
        this.f2584F = f11;
    }

    @Override // K1.z
    public final ObjectAnimator P(ViewGroup sceneRoot, View view, K1.p pVar, K1.p pVar2) {
        kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
        kotlin.jvm.internal.l.f(view, "view");
        if (pVar2 == null) {
            return null;
        }
        float height = view.getHeight();
        float f10 = this.f2583E;
        float f11 = f10 * height;
        float f12 = this.f2584F;
        Object obj = pVar2.f3031a.get("yandex:verticalTranslation:screenPosition");
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.IntArray");
        View viewA = v.a(view, sceneRoot, this, (int[]) obj);
        viewA.setTranslationY(f11);
        b bVar = new b(viewA);
        bVar.a(viewA, f10);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewA, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f11, height * f12), PropertyValuesHolder.ofFloat(bVar, f10, f12));
        objectAnimatorOfPropertyValuesHolder.addListener(new a(view));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // K1.z
    public final ObjectAnimator R(ViewGroup sceneRoot, View view, K1.p pVar, K1.p pVar2) {
        kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
        if (pVar == null) {
            return null;
        }
        float height = view.getHeight();
        float f10 = this.f2583E;
        View viewB = p.b(this, view, sceneRoot, pVar, "yandex:verticalTranslation:screenPosition");
        Property property = View.TRANSLATION_Y;
        float f11 = this.f2584F;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewB, PropertyValuesHolder.ofFloat((Property<?, Float>) property, f11, height * f10), PropertyValuesHolder.ofFloat(new b(view), f11, f10));
        objectAnimatorOfPropertyValuesHolder.addListener(new a(view));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // K1.z, K1.i
    public final void f(K1.p pVar) {
        z.M(pVar);
        p.a(pVar, new c(pVar));
    }

    @Override // K1.i
    public final void i(K1.p pVar) {
        z.M(pVar);
        p.a(pVar, new d(pVar));
    }
}

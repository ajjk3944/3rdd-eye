package I6;

import K1.z;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import b9.C1992A;
import java.util.HashMap;

/* compiled from: Scale.kt */
/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: E, reason: collision with root package name */
    public final float f2549E;

    /* renamed from: F, reason: collision with root package name */
    public final float f2550F;

    /* renamed from: G, reason: collision with root package name */
    public final float f2551G;

    /* compiled from: Scale.kt */
    public final class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final View f2552a;

        /* renamed from: b, reason: collision with root package name */
        public final float f2553b;

        /* renamed from: c, reason: collision with root package name */
        public final float f2554c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2555d;

        public a(View view, float f10, float f11) {
            this.f2552a = view;
            this.f2553b = f10;
            this.f2554c = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.l.f(animation, "animation");
            View view = this.f2552a;
            view.setScaleX(this.f2553b);
            view.setScaleY(this.f2554c);
            if (this.f2555d) {
                if (Build.VERSION.SDK_INT >= 28) {
                    view.resetPivot();
                } else {
                    view.setPivotX(view.getWidth() * 0.5f);
                    view.setPivotY(view.getHeight() * 0.5f);
                }
            }
            animation.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.l.f(animation, "animation");
            View view = this.f2552a;
            view.setVisibility(0);
            k kVar = k.this;
            if (kVar.f2550F == 0.5f && kVar.f2551G == 0.5f) {
                return;
            }
            this.f2555d = true;
            view.setPivotX(view.getWidth() * kVar.f2550F);
            view.setPivotY(view.getHeight() * kVar.f2551G);
        }
    }

    /* compiled from: Scale.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<int[], C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ K1.p f2557g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(K1.p pVar) {
            super(1);
            this.f2557g = pVar;
        }

        @Override // p9.l
        public final C1992A invoke(int[] iArr) {
            int[] position = iArr;
            kotlin.jvm.internal.l.f(position, "position");
            HashMap map = this.f2557g.f3031a;
            kotlin.jvm.internal.l.e(map, "transitionValues.values");
            map.put("yandex:scale:screenPosition", position);
            return C1992A.f18074a;
        }
    }

    /* compiled from: Scale.kt */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<int[], C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ K1.p f2558g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(K1.p pVar) {
            super(1);
            this.f2558g = pVar;
        }

        @Override // p9.l
        public final C1992A invoke(int[] iArr) {
            int[] position = iArr;
            kotlin.jvm.internal.l.f(position, "position");
            HashMap map = this.f2558g.f3031a;
            kotlin.jvm.internal.l.e(map, "transitionValues.values");
            map.put("yandex:scale:screenPosition", position);
            return C1992A.f18074a;
        }
    }

    public k(float f10, float f11, float f12) {
        this.f2549E = f10;
        this.f2550F = f11;
        this.f2551G = f12;
    }

    public static float U(K1.p pVar, float f10) {
        HashMap map;
        Object obj = (pVar == null || (map = pVar.f3031a) == null) ? null : map.get("yandex:scale:scaleX");
        Float f11 = obj instanceof Float ? (Float) obj : null;
        return f11 != null ? f11.floatValue() : f10;
    }

    public static float V(K1.p pVar, float f10) {
        HashMap map;
        Object obj = (pVar == null || (map = pVar.f3031a) == null) ? null : map.get("yandex:scale:scaleY");
        Float f11 = obj instanceof Float ? (Float) obj : null;
        return f11 != null ? f11.floatValue() : f10;
    }

    @Override // K1.z
    public final ObjectAnimator P(ViewGroup sceneRoot, View view, K1.p pVar, K1.p pVar2) {
        kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
        kotlin.jvm.internal.l.f(view, "view");
        if (pVar2 == null) {
            return null;
        }
        float f10 = this.f2549E;
        float fU = U(pVar, f10);
        float fV = V(pVar, f10);
        float fU2 = U(pVar2, 1.0f);
        float fV2 = V(pVar2, 1.0f);
        Object obj = pVar2.f3031a.get("yandex:scale:screenPosition");
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return T(v.a(view, sceneRoot, this, (int[]) obj), fU, fV, fU2, fV2);
    }

    @Override // K1.z
    public final ObjectAnimator R(ViewGroup sceneRoot, View view, K1.p pVar, K1.p pVar2) {
        kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
        if (pVar == null) {
            return null;
        }
        float fU = U(pVar, 1.0f);
        float fV = V(pVar, 1.0f);
        float f10 = this.f2549E;
        return T(p.b(this, view, sceneRoot, pVar, "yandex:scale:screenPosition"), fU, fV, U(pVar2, f10), V(pVar2, f10));
    }

    public final ObjectAnimator T(View view, float f10, float f11, float f12, float f13) {
        if (f10 == f12 && f11 == f13) {
            return null;
        }
        view.setVisibility(4);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f10, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f11, f13));
        objectAnimatorOfPropertyValuesHolder.addListener(new a(view, view.getScaleX(), view.getScaleY()));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // K1.z, K1.i
    public final void f(K1.p pVar) {
        View view = pVar.f3032b;
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        Float fValueOf = Float.valueOf(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        z.M(pVar);
        view.setScaleX(scaleX);
        view.setScaleY(scaleY);
        int i = this.f3049C;
        HashMap map = pVar.f3031a;
        if (i == 1) {
            kotlin.jvm.internal.l.e(map, "transitionValues.values");
            map.put("yandex:scale:scaleX", fValueOf);
            map.put("yandex:scale:scaleY", fValueOf);
        } else if (i == 2) {
            kotlin.jvm.internal.l.e(map, "transitionValues.values");
            float f10 = this.f2549E;
            map.put("yandex:scale:scaleX", Float.valueOf(f10));
            map.put("yandex:scale:scaleY", Float.valueOf(f10));
        }
        p.a(pVar, new b(pVar));
    }

    @Override // K1.i
    public final void i(K1.p pVar) {
        View view = pVar.f3032b;
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        z.M(pVar);
        view.setScaleX(scaleX);
        view.setScaleY(scaleY);
        int i = this.f3049C;
        HashMap map = pVar.f3031a;
        if (i == 1) {
            kotlin.jvm.internal.l.e(map, "transitionValues.values");
            float f10 = this.f2549E;
            map.put("yandex:scale:scaleX", Float.valueOf(f10));
            map.put("yandex:scale:scaleY", Float.valueOf(f10));
        } else if (i == 2) {
            kotlin.jvm.internal.l.e(map, "transitionValues.values");
            map.put("yandex:scale:scaleX", Float.valueOf(view.getScaleX()));
            map.put("yandex:scale:scaleY", Float.valueOf(view.getScaleY()));
        }
        p.a(pVar, new c(pVar));
    }
}

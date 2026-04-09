package I6;

import K1.z;
import L0.I;
import L0.S;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import b9.C1992A;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: Fade.kt */
/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: E, reason: collision with root package name */
    public final float f2537E;

    /* compiled from: Fade.kt */
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final View f2538a;

        /* renamed from: b, reason: collision with root package name */
        public final float f2539b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2540c;

        public a(View view, float f10) {
            this.f2538a = view;
            this.f2539b = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.l.f(animation, "animation");
            View view = this.f2538a;
            view.setAlpha(this.f2539b);
            if (this.f2540c) {
                view.setLayerType(0, null);
            }
            animation.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.l.f(animation, "animation");
            View view = this.f2538a;
            view.setVisibility(0);
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.f2540c = true;
                view.setLayerType(2, null);
            }
        }
    }

    /* compiled from: Fade.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<int[], C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ K1.p f2541g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(K1.p pVar) {
            super(1);
            this.f2541g = pVar;
        }

        @Override // p9.l
        public final C1992A invoke(int[] iArr) {
            int[] position = iArr;
            kotlin.jvm.internal.l.f(position, "position");
            HashMap map = this.f2541g.f3031a;
            kotlin.jvm.internal.l.e(map, "transitionValues.values");
            map.put("yandex:fade:screenPosition", position);
            return C1992A.f18074a;
        }
    }

    /* compiled from: Fade.kt */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<int[], C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ K1.p f2542g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(K1.p pVar) {
            super(1);
            this.f2542g = pVar;
        }

        @Override // p9.l
        public final C1992A invoke(int[] iArr) {
            int[] position = iArr;
            kotlin.jvm.internal.l.f(position, "position");
            HashMap map = this.f2542g.f3031a;
            kotlin.jvm.internal.l.e(map, "transitionValues.values");
            map.put("yandex:fade:screenPosition", position);
            return C1992A.f18074a;
        }
    }

    public h(float f10) {
        this.f2537E = f10;
    }

    public static ObjectAnimator T(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        view.setAlpha(f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f10, f11);
        objectAnimatorOfFloat.addListener(new a(view, view.getAlpha()));
        return objectAnimatorOfFloat;
    }

    public static float U(K1.p pVar, float f10) {
        HashMap map;
        Object obj = (pVar == null || (map = pVar.f3031a) == null) ? null : map.get("yandex:fade:alpha");
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
        float fU = U(pVar, this.f2537E);
        float fU2 = U(pVar2, 1.0f);
        Object obj = pVar2.f3031a.get("yandex:fade:screenPosition");
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return T(v.a(view, sceneRoot, this, (int[]) obj), fU, fU2);
    }

    @Override // K1.z
    public final ObjectAnimator R(ViewGroup sceneRoot, View view, K1.p pVar, K1.p pVar2) {
        kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
        if (pVar == null) {
            return null;
        }
        return T(p.b(this, view, sceneRoot, pVar, "yandex:fade:screenPosition"), U(pVar, 1.0f), U(pVar2, this.f2537E));
    }

    @Override // K1.z, K1.i
    public final void f(K1.p pVar) {
        z.M(pVar);
        int i = this.f3049C;
        HashMap map = pVar.f3031a;
        if (i == 1) {
            kotlin.jvm.internal.l.e(map, "transitionValues.values");
            map.put("yandex:fade:alpha", Float.valueOf(pVar.f3032b.getAlpha()));
        } else if (i == 2) {
            kotlin.jvm.internal.l.e(map, "transitionValues.values");
            map.put("yandex:fade:alpha", Float.valueOf(this.f2537E));
        }
        p.a(pVar, new b(pVar));
    }

    @Override // K1.i
    public final void i(K1.p pVar) {
        z.M(pVar);
        int i = this.f3049C;
        HashMap map = pVar.f3031a;
        if (i == 1) {
            kotlin.jvm.internal.l.e(map, "transitionValues.values");
            map.put("yandex:fade:alpha", Float.valueOf(this.f2537E));
        } else if (i == 2) {
            kotlin.jvm.internal.l.e(map, "transitionValues.values");
            map.put("yandex:fade:alpha", Float.valueOf(pVar.f3032b.getAlpha()));
        }
        p.a(pVar, new c(pVar));
    }
}

package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC4036k;

/* renamed from: androidx.transition.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4028c extends K {

    /* renamed from: androidx.transition.c$a */
    private static class a extends AnimatorListenerAdapter implements AbstractC4036k.f {

        /* renamed from: a, reason: collision with root package name */
        private final View f32422a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f32423b = false;

        a(View view) {
            this.f32422a = view;
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void a(AbstractC4036k abstractC4036k) {
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void b(AbstractC4036k abstractC4036k) {
            this.f32422a.setTag(AbstractC4033h.f32446d, Float.valueOf(this.f32422a.getVisibility() == 0 ? y.b(this.f32422a) : 0.0f));
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void d(AbstractC4036k abstractC4036k) {
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void e(AbstractC4036k abstractC4036k) {
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void f(AbstractC4036k abstractC4036k, boolean z10) {
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void g(AbstractC4036k abstractC4036k) {
            this.f32422a.setTag(AbstractC4033h.f32446d, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            y.e(this.f32422a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f32422a.hasOverlappingRendering() && this.f32422a.getLayerType() == 0) {
                this.f32423b = true;
                this.f32422a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f32423b) {
                this.f32422a.setLayerType(0, null);
            }
            if (z10) {
                return;
            }
            y.e(this.f32422a, 1.0f);
            y.a(this.f32422a);
        }
    }

    public C4028c(int i10) {
        v0(i10);
    }

    private Animator w0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        y.e(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) y.f32525b, f11);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        D().b(aVar);
        return objectAnimatorOfFloat;
    }

    private static float x0(v vVar, float f10) {
        Float f11;
        return (vVar == null || (f11 = (Float) vVar.f32516a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // androidx.transition.K, androidx.transition.AbstractC4036k
    public void l(v vVar) {
        super.l(vVar);
        Float fValueOf = (Float) vVar.f32517b.getTag(AbstractC4033h.f32446d);
        if (fValueOf == null) {
            fValueOf = vVar.f32517b.getVisibility() == 0 ? Float.valueOf(y.b(vVar.f32517b)) : Float.valueOf(0.0f);
        }
        vVar.f32516a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // androidx.transition.K
    public Animator r0(ViewGroup viewGroup, View view, v vVar, v vVar2) {
        y.c(view);
        return w0(view, x0(vVar, 0.0f), 1.0f);
    }

    @Override // androidx.transition.K
    public Animator t0(ViewGroup viewGroup, View view, v vVar, v vVar2) {
        y.c(view);
        Animator animatorW0 = w0(view, x0(vVar, 1.0f), 0.0f);
        if (animatorW0 == null) {
            y.e(view, x0(vVar2, 1.0f));
        }
        return animatorW0;
    }

    public C4028c() {
    }
}

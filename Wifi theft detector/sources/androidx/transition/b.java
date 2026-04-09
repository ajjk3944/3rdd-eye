package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import y1.h;
import y1.q;
import y1.t;

/* loaded from: classes.dex */
public class b extends Visibility {

    public static class a extends AnimatorListenerAdapter implements Transition.f {

        /* renamed from: a, reason: collision with root package name */
        public final View f4218a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f4219b = false;

        public a(View view) {
            this.f4218a = view;
        }

        @Override // androidx.transition.Transition.f
        public void a(Transition transition) {
            this.f4218a.setTag(y1.e.transition_pause_alpha, null);
        }

        @Override // androidx.transition.Transition.f
        public void b(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void c(Transition transition) {
            this.f4218a.setTag(y1.e.transition_pause_alpha, Float.valueOf(this.f4218a.getVisibility() == 0 ? t.b(this.f4218a) : 0.0f));
        }

        @Override // androidx.transition.Transition.f
        public /* synthetic */ void d(Transition transition, boolean z10) {
            h.a(this, transition, z10);
        }

        @Override // androidx.transition.Transition.f
        public void e(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void f(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void g(Transition transition, boolean z10) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            t.e(this.f4218a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f4218a.hasOverlappingRendering() && this.f4218a.getLayerType() == 0) {
                this.f4219b = true;
                this.f4218a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f4219b) {
                this.f4218a.setLayerType(0, null);
            }
            if (z10) {
                return;
            }
            t.e(this.f4218a, 1.0f);
            t.a(this.f4218a);
        }
    }

    public b(int i10) {
        k0(i10);
    }

    public static float m0(q qVar, float f10) {
        Float f11;
        return (qVar == null || (f11 = (Float) qVar.f25089a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // androidx.transition.Visibility
    public Animator g0(ViewGroup viewGroup, View view, q qVar, q qVar2) {
        t.c(view);
        return l0(view, m0(qVar, 0.0f), 1.0f);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void i(q qVar) {
        super.i(qVar);
        Float fValueOf = (Float) qVar.f25090b.getTag(y1.e.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = qVar.f25090b.getVisibility() == 0 ? Float.valueOf(t.b(qVar.f25090b)) : Float.valueOf(0.0f);
        }
        qVar.f25089a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // androidx.transition.Visibility
    public Animator i0(ViewGroup viewGroup, View view, q qVar, q qVar2) {
        t.c(view);
        Animator animatorL0 = l0(view, m0(qVar, 1.0f), 0.0f);
        if (animatorL0 == null) {
            t.e(view, m0(qVar2, 1.0f));
        }
        return animatorL0;
    }

    public final Animator l0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        t.e(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) t.f25098b, f11);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        w().a(aVar);
        return objectAnimatorOfFloat;
    }

    public b() {
    }
}

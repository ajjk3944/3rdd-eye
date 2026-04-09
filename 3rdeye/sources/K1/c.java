package K1;

import K1.i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: Fade.java */
/* loaded from: classes.dex */
public final class c extends z {

    /* compiled from: Fade.java */
    public static class a extends AnimatorListenerAdapter implements i.d {

        /* renamed from: a, reason: collision with root package name */
        public final View f2962a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2963b = false;

        public a(View view) {
            this.f2962a = view;
        }

        @Override // K1.i.d
        public final void a(i iVar) {
            throw null;
        }

        @Override // K1.i.d
        public final void b(i iVar) {
            throw null;
        }

        @Override // K1.i.d
        public final void c(i iVar) {
            this.f2962a.setTag(R.id.transition_pause_alpha, null);
        }

        @Override // K1.i.d
        public final void g(i iVar) {
            View view = this.f2962a;
            view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? s.f3039a.a(view) : 0.0f));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            s.f3039a.b(this.f2962a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            View view = this.f2962a;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.f2963b = true;
                view.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z10) {
            boolean z11 = this.f2963b;
            View view = this.f2962a;
            if (z11) {
                view.setLayerType(0, null);
            }
            if (z10) {
                return;
            }
            x xVar = s.f3039a;
            xVar.b(view, 1.0f);
            xVar.getClass();
        }

        @Override // K1.i.d
        public final void d(i iVar) {
        }

        @Override // K1.i.d
        public final void e(i iVar) {
        }

        @Override // K1.i.d
        public final void f(i iVar) {
        }
    }

    public c(int i) {
        S(i);
    }

    public static float U(p pVar, float f10) {
        Float f11;
        return (pVar == null || (f11 = (Float) pVar.f3031a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // K1.z
    public final ObjectAnimator P(ViewGroup viewGroup, View view, p pVar, p pVar2) {
        s.f3039a.getClass();
        return T(view, U(pVar, 0.0f), 1.0f);
    }

    @Override // K1.z
    public final ObjectAnimator R(ViewGroup viewGroup, View view, p pVar, p pVar2) {
        x xVar = s.f3039a;
        xVar.getClass();
        ObjectAnimator objectAnimatorT = T(view, U(pVar, 1.0f), 0.0f);
        if (objectAnimatorT == null) {
            xVar.b(view, U(pVar2, 1.0f));
        }
        return objectAnimatorT;
    }

    public final ObjectAnimator T(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        s.f3039a.b(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, s.f3040b, f11);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        r().a(aVar);
        return objectAnimatorOfFloat;
    }

    @Override // K1.i
    public final void i(p pVar) {
        z.M(pVar);
        View view = pVar.f3032b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(s.f3039a.a(view)) : Float.valueOf(0.0f);
        }
        pVar.f3031a.put("android:fade:transitionAlpha", fValueOf);
    }
}

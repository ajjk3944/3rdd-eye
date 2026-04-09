package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4000k {
    private static int a(Fragment fragment, boolean z10, boolean z11) {
        return z11 ? z10 ? fragment.I() : fragment.J() : z10 ? fragment.u() : fragment.x();
    }

    static a b(Context context, Fragment fragment, boolean z10, boolean z11) throws Resources.NotFoundException {
        int iE = fragment.E();
        int iA = a(fragment, z10, z11);
        fragment.u1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f31229H;
        if (viewGroup != null) {
            int i10 = U1.b.f22126c;
            if (viewGroup.getTag(i10) != null) {
                fragment.f31229H.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = fragment.f31229H;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationP0 = fragment.p0(iE, z10, iA);
        if (animationP0 != null) {
            return new a(animationP0);
        }
        Animator animatorQ0 = fragment.q0(iE, z10, iA);
        if (animatorQ0 != null) {
            return new a(animatorQ0);
        }
        if (iA == 0 && iE != 0) {
            iA = d(context, iE, z10);
        }
        if (iA != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                }
            } else {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                    if (animatorLoadAnimator != null) {
                        return new a(animatorLoadAnimator);
                    }
                } catch (RuntimeException e11) {
                    if (zEquals) {
                        throw e11;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation2 != null) {
                        return new a(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    private static int c(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? U1.a.f22122e : U1.a.f22123f;
        }
        if (i10 == 8194) {
            return z10 ? U1.a.f22118a : U1.a.f22119b;
        }
        if (i10 == 8197) {
            return z10 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i10 == 4099) {
            return z10 ? U1.a.f22120c : U1.a.f22121d;
        }
        if (i10 != 4100) {
            return -1;
        }
        return z10 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    /* renamed from: androidx.fragment.app.k$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f31454a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f31455b;

        a(Animation animation) {
            this.f31454a = animation;
            this.f31455b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f31454a = null;
            this.f31455b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.k$b */
    static class b extends AnimationSet implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f31456a;

        /* renamed from: b, reason: collision with root package name */
        private final View f31457b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f31458c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f31459d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f31460e;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f31460e = true;
            this.f31456a = viewGroup;
            this.f31457b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f31460e = true;
            if (this.f31458c) {
                return !this.f31459d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f31458c = true;
                F1.I.a(this.f31456a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f31458c || !this.f31460e) {
                this.f31456a.endViewTransition(this.f31457b);
                this.f31459d = true;
            } else {
                this.f31460e = false;
                this.f31456a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f31460e = true;
            if (this.f31458c) {
                return !this.f31459d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f31458c = true;
                F1.I.a(this.f31456a, this);
            }
            return true;
        }
    }
}

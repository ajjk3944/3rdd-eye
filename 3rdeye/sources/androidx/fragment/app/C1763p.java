package androidx.fragment.app;

import L0.ViewTreeObserverOnPreDrawListenerC0791w;
import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: FragmentAnim.java */
/* renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1763p {
    public static int a(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.p$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f15942a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f15943b;

        public a(Animation animation) {
            this.f15942a = animation;
            this.f15943b = null;
        }

        public a(Animator animator) {
            this.f15942a = null;
            this.f15943b = animator;
        }
    }

    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.p$b */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final ViewGroup f15944b;

        /* renamed from: c, reason: collision with root package name */
        public final View f15945c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f15946d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f15947e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f15948f;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f15948f = true;
            this.f15944b = viewGroup;
            this.f15945c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j4, Transformation transformation) {
            this.f15948f = true;
            if (this.f15946d) {
                return !this.f15947e;
            }
            if (!super.getTransformation(j4, transformation)) {
                this.f15946d = true;
                ViewTreeObserverOnPreDrawListenerC0791w.a(this.f15944b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10 = this.f15946d;
            ViewGroup viewGroup = this.f15944b;
            if (z10 || !this.f15948f) {
                viewGroup.endViewTransition(this.f15945c);
                this.f15947e = true;
            } else {
                this.f15948f = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j4, Transformation transformation, float f10) {
            this.f15948f = true;
            if (this.f15946d) {
                return !this.f15947e;
            }
            if (!super.getTransformation(j4, transformation, f10)) {
                this.f15946d = true;
                ViewTreeObserverOnPreDrawListenerC0791w.a(this.f15944b, this);
            }
            return true;
        }
    }
}

package k0;

import R.ViewTreeObserverOnPreDrawListenerC0190q;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class y extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f21730a;

    /* renamed from: b, reason: collision with root package name */
    public final View f21731b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21732c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21733d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21734e;

    public y(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f21734e = true;
        this.f21730a = viewGroup;
        this.f21731b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j6, Transformation transformation) {
        this.f21734e = true;
        if (this.f21732c) {
            return !this.f21733d;
        }
        if (!super.getTransformation(j6, transformation)) {
            this.f21732c = true;
            ViewTreeObserverOnPreDrawListenerC0190q.a(this.f21730a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6 = this.f21732c;
        ViewGroup viewGroup = this.f21730a;
        if (z6 || !this.f21734e) {
            viewGroup.endViewTransition(this.f21731b);
            this.f21733d = true;
        } else {
            this.f21734e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j6, Transformation transformation, float f2) {
        this.f21734e = true;
        if (this.f21732c) {
            return !this.f21733d;
        }
        if (!super.getTransformation(j6, transformation, f2)) {
            this.f21732c = true;
            ViewTreeObserverOnPreDrawListenerC0190q.a(this.f21730a, this);
        }
        return true;
    }
}

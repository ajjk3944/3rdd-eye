package o4;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class y extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f18882a;

    /* renamed from: d, reason: collision with root package name */
    public final View f18883d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18884g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18885r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f18886x;

    public y(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f18886x = true;
        this.f18882a = viewGroup;
        this.f18883d = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f18886x = true;
        if (this.f18884g) {
            return !this.f18885r;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f18884g = true;
            u3.p.a(this.f18882a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.f18884g;
        ViewGroup viewGroup = this.f18882a;
        if (z10 || !this.f18886x) {
            viewGroup.endViewTransition(this.f18883d);
            this.f18885r = true;
        } else {
            this.f18886x = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f10) {
        this.f18886x = true;
        if (this.f18884g) {
            return !this.f18885r;
        }
        if (!super.getTransformation(j, transformation, f10)) {
            this.f18884g = true;
            u3.p.a(this.f18882a, this);
        }
        return true;
    }
}

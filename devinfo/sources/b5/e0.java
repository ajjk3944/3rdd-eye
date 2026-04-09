package b5;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1780a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1781b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1782c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1783d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1784e;

    public e0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1784e = true;
        this.f1780a = viewGroup;
        this.f1781b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f1784e = true;
        if (this.f1782c) {
            return !this.f1783d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f1782c = true;
            e4.u.a(this.f1780a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3 = this.f1782c;
        ViewGroup viewGroup = this.f1780a;
        if (z3 || !this.f1784e) {
            viewGroup.endViewTransition(this.f1781b);
            this.f1783d = true;
        } else {
            this.f1784e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f10) {
        this.f1784e = true;
        if (this.f1782c) {
            return !this.f1783d;
        }
        if (!super.getTransformation(j, transformation, f10)) {
            this.f1782c = true;
            e4.u.a(this.f1780a, this);
        }
        return true;
    }
}

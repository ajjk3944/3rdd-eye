package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lw extends AnimationSet implements Runnable {
    public final ViewGroup f;
    public final View g;
    public boolean h;
    public boolean i;
    public boolean j;

    public lw(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.j = true;
        this.f = viewGroup;
        this.g = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.j = true;
        if (this.h) {
            return !this.i;
        }
        if (!super.getTransformation(j, transformation)) {
            this.h = true;
            lj0.a(this.f, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.h;
        ViewGroup viewGroup = this.f;
        if (z || !this.j) {
            viewGroup.endViewTransition(this.g);
            this.i = true;
        } else {
            this.j = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.j = true;
        if (this.h) {
            return !this.i;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.h = true;
            lj0.a(this.f, this);
        }
        return true;
    }
}

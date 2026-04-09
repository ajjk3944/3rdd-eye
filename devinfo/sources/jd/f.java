package jd;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f27501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f27502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f27503c;

    public f(g gVar, View view, View view2) {
        this.f27503c = gVar;
        this.f27501a = view;
        this.f27502b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f27503c.c(this.f27501a, this.f27502b, valueAnimator.getAnimatedFraction());
    }
}

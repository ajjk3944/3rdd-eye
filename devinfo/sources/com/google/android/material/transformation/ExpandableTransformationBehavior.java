package com.google.android.material.transformation;

import ad.g;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f20680b;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void w(View view, View view2, boolean z3, boolean z10) {
        AnimatorSet animatorSet = this.f20680b;
        boolean z11 = animatorSet != null;
        if (z11) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetX = x(view, view2, z3, z11);
        this.f20680b = animatorSetX;
        animatorSetX.addListener(new g(11, this));
        this.f20680b.start();
        if (z10) {
            return;
        }
        this.f20680b.end();
    }

    public abstract AnimatorSet x(View view, View view2, boolean z3, boolean z10);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

package com.google.android.material.transformation;

import O3.d;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f23203b;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void s(View view, View view2, boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f23203b;
        boolean z12 = animatorSet != null;
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetT = t(view, view2, z10, z12);
        this.f23203b = animatorSetT;
        animatorSetT.addListener(new d(this, 2));
        this.f23203b.start();
        if (z11) {
            return;
        }
        this.f23203b.end();
    }

    public abstract AnimatorSet t(View view, View view2, boolean z10, boolean z11);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

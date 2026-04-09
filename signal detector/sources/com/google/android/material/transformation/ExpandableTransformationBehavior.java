package com.google.android.material.transformation;

import B3.x;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f18609b;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void w(View view, View view2, boolean z6, boolean z7) {
        AnimatorSet animatorSet = this.f18609b;
        boolean z8 = animatorSet != null;
        if (z8) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetX = x(view, view2, z6, z8);
        this.f18609b = animatorSetX;
        animatorSetX.addListener(new x(6, this));
        this.f18609b.start();
        if (z7) {
            return;
        }
        this.f18609b.end();
    }

    public abstract AnimatorSet x(View view, View view2, boolean z6, boolean z7);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class ycc extends com.bytedance.sdk.openadsdk.core.ycc.dg {
    private float emc;

    public ycc(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ycc.dg, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int i6 = getLayoutParams().width;
        int i7 = getLayoutParams().height;
        float f2 = this.emc;
        if (f2 > 0.0f) {
            if (i6 == -2) {
                size = (int) (size2 * f2);
                mode = 1073741824;
            } else if (i7 == -2) {
                size2 = (int) (size / f2);
                mode2 = 1073741824;
            }
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    public void setRatio(float f2) {
        this.emc = f2;
    }

    public ycc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}

package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class sup extends com.bytedance.sdk.openadsdk.core.ycc.xq {
    public float emc;

    public sup(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ycc.xq, android.widget.FrameLayout, android.view.View
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    public void setRatio(float f2) {
        this.emc = f2;
    }

    public sup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public sup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.emc = 0.0f;
    }
}

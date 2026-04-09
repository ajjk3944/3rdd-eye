package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ryl extends com.bytedance.sdk.openadsdk.core.le.lh {
    public float ouw;

    public ryl(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = getLayoutParams().width;
        int i12 = getLayoutParams().height;
        float f10 = this.ouw;
        if (f10 > 0.0f) {
            if (i11 == -2) {
                size = (int) (size2 * f10);
                mode = 1073741824;
            } else if (i12 == -2) {
                size2 = (int) (size / f10);
                mode2 = 1073741824;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    public final void setRatio(float f10) {
        this.ouw = f10;
    }

    private ryl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ryl(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet, 0);
        this.ouw = 0.0f;
    }
}

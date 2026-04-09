package com.bytedance.sdk.openadsdk.core.ycc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class xq extends FrameLayout {
    public xq(Context context) {
        super(context);
        init();
    }

    private void init() {
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(zz.emc(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i, int i3, int i6, int i7) {
        super.setPaddingRelative(i, i3, i6, i7);
    }

    public xq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public xq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}

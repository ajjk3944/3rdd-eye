package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ul extends uym implements com.bytedance.sdk.component.adexpress.dynamic.xq {
    public ul(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq
    public void emc(CharSequence charSequence, boolean z6, int i, boolean z7) {
        if (i != 0) {
            ((TextView) this.cf).setText(" | ".concat(String.format(com.bytedance.sdk.component.utils.rie.emc(com.bytedance.sdk.component.adexpress.dg.emc(), "tt_reward_full_skip_count_down"), Integer.valueOf(i))));
        } else if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        requestLayout();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.uym, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        if (TextUtils.isEmpty(((TextView) this.cf).getText())) {
            setMeasuredDimension(0, this.msw);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw
    public void ycc() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.uym, this.msw);
        int i = this.zz;
        layoutParams.leftMargin = i;
        layoutParams.gravity = 16;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }
}

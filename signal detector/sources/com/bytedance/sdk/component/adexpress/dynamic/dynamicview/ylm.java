package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ylm extends uym implements com.bytedance.sdk.component.adexpress.dynamic.xq {
    private int[] emc;
    private int ul;
    private int ypw;

    public ylm(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq
    @SuppressLint({"SetTextI18n"})
    public void emc(CharSequence charSequence, boolean z6, int i, boolean z7) {
        String strEmc = com.bytedance.sdk.component.utils.rie.emc(com.bytedance.sdk.component.adexpress.dg.emc(), "tt_reward_screen_skip_tx");
        if (i == 0) {
            this.cf.setVisibility(0);
            ((TextView) this.cf).setText("| ".concat(String.valueOf(strEmc)));
            this.cf.measure(-2, -2);
            this.emc = new int[]{this.cf.getMeasuredWidth() + 1, this.cf.getMeasuredHeight()};
            View view = this.cf;
            int[] iArr = this.emc;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.cf).setGravity(17);
            ((TextView) this.cf).setIncludeFontPadding(false);
            emc();
            this.cf.setPadding(this.sup.xq(), this.ypw, this.sup.dg(), this.ul);
        }
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        if (TextUtils.isEmpty(((TextView) this.cf).getText())) {
            setMeasuredDimension(0, this.msw);
        } else {
            setMeasuredDimension(this.uym, this.msw);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw
    public void ycc() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.uym, this.msw);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.uym, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rtt
    public boolean zz() {
        super.zz();
        ((TextView) this.cf).setText("");
        return true;
    }

    private void emc() {
        int iEmc = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.bw());
        this.ypw = ((this.msw - iEmc) / 2) - this.sup.emc();
        this.ul = 0;
    }
}

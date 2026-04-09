package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class zin extends ra implements com.bytedance.sdk.component.adexpress.dynamic.lh {
    private int[] ouw;
    private int qbp;
    private int vt;

    public zin(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final void fkw() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.ra, this.pno);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
        if (TextUtils.isEmpty(((TextView) this.ko).getText())) {
            setMeasuredDimension(0, this.pno);
        } else {
            setMeasuredDimension(this.ra, this.pno);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh
    @SuppressLint({"SetTextI18n"})
    public final void ouw(CharSequence charSequence, boolean z3, int i4, boolean z10) {
        String strOuw = com.bytedance.sdk.component.utils.vpp.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), "tt_reward_screen_skip_tx");
        if (i4 == 0) {
            this.ko.setVisibility(0);
            ((TextView) this.ko).setText("| ".concat(String.valueOf(strOuw)));
            this.ko.measure(-2, -2);
            this.ouw = new int[]{this.ko.getMeasuredWidth() + 1, this.ko.getMeasuredHeight()};
            View view = this.ko;
            int[] iArr = this.ouw;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.ko).setGravity(17);
            ((TextView) this.ko).setIncludeFontPadding(false);
            int iOuw = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.ryl.yu.pno);
            this.vt = ((this.pno - iOuw) / 2) - this.ryl.ouw();
            this.qbp = 0;
            this.ko.setPadding(this.ryl.lh(), this.vt, this.ryl.yu(), this.qbp);
        }
        requestLayout();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ra, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        super.ra();
        ((TextView) this.ko).setText("");
        return true;
    }
}

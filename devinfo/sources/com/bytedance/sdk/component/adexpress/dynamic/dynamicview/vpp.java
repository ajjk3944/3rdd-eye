package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vpp extends le implements com.bytedance.sdk.component.adexpress.dynamic.lh {
    private int ouw;
    private int qbp;
    private int vt;

    public vpp(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list = this.mwh.tlj;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar2 : list) {
            if (pnoVar2.bly.ouw() == 21) {
                this.ouw = (int) (this.ra - com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, pnoVar2.f7305le));
            }
            if (pnoVar2.bly.ouw() == 20) {
                this.vt = (int) (this.ra - com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, pnoVar2.f7305le));
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final void fkw() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i4 = this.bly;
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = this.tlj;
        layoutParams.setMarginStart(i4);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le
    public final FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
        if (this.qbp == 0) {
            setMeasuredDimension(this.vt, this.pno);
        } else {
            setMeasuredDimension(this.ouw, this.pno);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh
    public final void ouw(CharSequence charSequence, boolean z3, int i4, boolean z10) {
        this.qbp = i4;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        setBackground(getBackgroundDrawable());
        setPadding((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.lh()), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.vt()), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.yu()), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.ouw()));
        return true;
    }
}

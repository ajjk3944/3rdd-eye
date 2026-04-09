package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.List;

/* loaded from: classes.dex */
public class sra extends ycc implements com.bytedance.sdk.component.adexpress.dynamic.xq {
    private int emc;
    private int ul;
    private int ypw;

    public sra(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        emc();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq
    public void emc(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        this.ul = i10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.ul == 0) {
            setMeasuredDimension(this.ypw, this.msw);
        } else {
            setMeasuredDimension(this.emc, this.msw);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw
    public void ycc() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i10 = this.zz;
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = this.ru;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rtt
    public boolean zz() {
        setBackground(getBackgroundDrawable());
        setPadding((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.sup.xq()), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.sup.ypw()), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.sup.dg()), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.sup.emc()));
        return true;
    }

    private void emc() {
        List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> listGbl = this.sz.gbl();
        if (listGbl == null || listGbl.size() <= 0) {
            return;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar : listGbl) {
            if (mswVar.ru().emc() == 21) {
                this.emc = (int) (this.uym - com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, mswVar.msw()));
            }
            if (mswVar.ru().emc() == 20) {
                this.ypw = (int) (this.uym - com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, mswVar.msw()));
            }
        }
    }
}

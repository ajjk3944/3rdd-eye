package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class hxp extends ycc {
    private int emc;

    public hxp(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        this.emc = 0;
        com.bytedance.sdk.component.adexpress.ycc.hxp hxpVar = new com.bytedance.sdk.component.adexpress.ycc.hxp(context, null);
        this.cf = hxpVar;
        hxpVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.cf, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        int iEmc = (int) (com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.sup.dg()) + this.sup.xq()) + (com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.sup.bw()) * 5.0f));
        if (this.uym > iEmc && 4 == this.sup.msw()) {
            this.emc = (this.uym - iEmc) / 2;
        }
        this.uym = iEmc;
        return new FrameLayout.LayoutParams(this.uym, this.msw);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw
    public void ycc() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.uym, this.msw);
        layoutParams.topMargin = this.ru;
        int i = this.zz + this.emc;
        layoutParams.leftMargin = i;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rtt
    public boolean zz() throws NumberFormatException {
        DynamicRootView dynamicRootView;
        super.zz();
        double dSz = this.sup.sz();
        if (com.bytedance.sdk.component.adexpress.dg.ypw() && (dSz < 0.0d || dSz > 5.0d || ((dynamicRootView = this.qh) != null && dynamicRootView.getRenderRequest() != null && this.qh.getRenderRequest().ru() != 4))) {
            this.cf.setVisibility(8);
            return true;
        }
        double d6 = (dSz < 0.0d || dSz > 5.0d) ? 5.0d : dSz;
        this.cf.setVisibility(0);
        ((com.bytedance.sdk.component.adexpress.ycc.hxp) this.cf).emc(d6, this.sup.uym(), (int) this.sup.bw(), ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.ypw())) + ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.emc())) + ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.bw())));
        return true;
    }
}

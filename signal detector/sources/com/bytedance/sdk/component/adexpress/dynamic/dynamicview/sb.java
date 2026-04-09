package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class sb extends ycc implements com.bytedance.sdk.component.adexpress.dynamic.xq {
    int emc;
    private boolean sra;
    private int ul;
    private int ylm;
    boolean ypw;

    public sb(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        this.ylm = 0;
        setTag(Integer.valueOf(getClickArea()));
        emc();
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().db()) {
            return;
        }
        View view = this.cf;
        if (view != null) {
            view.setVisibility(8);
        }
        setVisibility(8);
    }

    private void emc() {
        List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> listGbl = this.sz.gbl();
        if (listGbl == null || listGbl.size() <= 0) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> it = listGbl.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.dg.msw next = it.next();
            if (TextUtils.equals("skip-with-time-skip-btn", next.ru().ypw())) {
                int iEmc = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, next.msw() + (com.bytedance.sdk.component.adexpress.dg.ypw() ? next.sz() : 0));
                this.ul = iEmc;
                this.emc = this.uym - iEmc;
            }
        }
        this.ylm = this.uym - this.emc;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        if (this.sra && this.sup != null) {
            setMeasuredDimension(this.ul + ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.sup.xq())) + ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.sup.dg())), this.msw);
        } else if (this.ypw) {
            setMeasuredDimension(this.uym, this.msw);
        } else {
            setMeasuredDimension(this.emc, this.msw);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw
    public void ycc() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.ypw) {
            layoutParams.leftMargin = this.zz;
        } else {
            layoutParams.leftMargin = this.zz + this.ylm;
        }
        if (this.sra && this.sup != null) {
            layoutParams.leftMargin = ((this.zz + this.ylm) - ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.sup.xq()))) - ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.sup.dg()));
        }
        if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
            layoutParams.topMargin = this.ru - ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.sup.ypw()));
        } else {
            layoutParams.topMargin = this.ru;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rtt
    public boolean zz() {
        if (com.bytedance.sdk.component.adexpress.dg.ycc.ypw(this.qh.getRenderRequest().dg())) {
            return true;
        }
        super.zz();
        setPadding((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.sup.xq()), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.sup.ypw()), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.sup.dg()), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.sup.emc()));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq
    public void emc(CharSequence charSequence, boolean z6, int i, boolean z7) {
        if (z7 && this.sra != z7) {
            this.sra = z7;
            ycc();
            return;
        }
        if (z6 && this.ypw != z6) {
            this.ypw = z6;
            ycc();
        }
        this.ypw = z6;
    }
}

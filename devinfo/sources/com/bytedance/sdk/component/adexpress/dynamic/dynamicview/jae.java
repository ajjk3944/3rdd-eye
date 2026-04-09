package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class jae extends le implements com.bytedance.sdk.component.adexpress.dynamic.lh {
    int ouw;
    private int qbp;
    private boolean vpp;
    boolean vt;
    private int zin;

    public jae(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        this.zin = 0;
        setTag(Integer.valueOf(getClickArea()));
        List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list = this.mwh.tlj;
        if (list != null && list.size() > 0) {
            Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.bytedance.sdk.component.adexpress.dynamic.yu.pno next = it.next();
                if (TextUtils.equals("skip-with-time-skip-btn", next.bly.ouw)) {
                    int iOuw = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, next.f7305le + (com.bytedance.sdk.component.adexpress.yu.vt() ? next.ouw() : 0));
                    this.qbp = iOuw;
                    this.ouw = this.ra - iOuw;
                }
            }
            this.zin = this.ra - this.ouw;
        }
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().tc) {
            return;
        }
        View view = this.ko;
        if (view != null) {
            view.setVisibility(8);
        }
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final void fkw() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.vt) {
            layoutParams.leftMargin = this.bly;
        } else {
            layoutParams.leftMargin = this.bly + this.zin;
        }
        if (this.vpp && this.ryl != null) {
            layoutParams.leftMargin = ((this.bly + this.zin) - ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.lh()))) - ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.yu()));
        }
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            layoutParams.topMargin = this.tlj - ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.vt()));
        } else {
            layoutParams.topMargin = this.tlj;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
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
        if (this.vpp && this.ryl != null) {
            setMeasuredDimension(this.qbp + ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.lh())) + ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.yu())), this.pno);
        } else if (this.vt) {
            setMeasuredDimension(this.ra, this.pno);
        } else {
            setMeasuredDimension(this.ouw, this.pno);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh
    public final void ouw(CharSequence charSequence, boolean z3, int i4, boolean z10) {
        if (z10 && this.vpp != z10) {
            this.vpp = z10;
            fkw();
            return;
        }
        if (z3 && this.vt != z3) {
            this.vt = z3;
            fkw();
        }
        this.vt = z3;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        if (com.bytedance.sdk.component.adexpress.yu.le.ouw(this.f7230jg.getRenderRequest().ouw)) {
            return true;
        }
        super.ra();
        setPadding((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.lh()), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.vt()), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.yu()), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.ouw()));
        return true;
    }
}

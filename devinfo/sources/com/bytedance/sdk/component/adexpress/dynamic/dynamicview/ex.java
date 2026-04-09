package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ex extends le {
    private int ouw;

    public ex(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        this.ouw = 0;
        com.bytedance.sdk.component.adexpress.le.ex exVar = new com.bytedance.sdk.component.adexpress.le.ex(context, null);
        this.ko = exVar;
        exVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.ko, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final void fkw() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.ra, this.pno);
        layoutParams.topMargin = this.tlj;
        int i4 = this.bly + this.ouw;
        layoutParams.leftMargin = i4;
        layoutParams.setMarginStart(i4);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le
    public final FrameLayout.LayoutParams getWidgetLayoutParams() {
        int iOuw = (int) (com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.yu()) + this.ryl.lh()) + (com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.yu.pno) * 5.0f));
        if (this.ra > iOuw && 4 == this.ryl.ra()) {
            this.ouw = (this.ra - iOuw) / 2;
        }
        this.ra = iOuw;
        return new FrameLayout.LayoutParams(this.ra, this.pno);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() throws NumberFormatException {
        DynamicRootView dynamicRootView;
        super.ra();
        double dTlj = this.ryl.tlj();
        if (com.bytedance.sdk.component.adexpress.yu.vt() && (dTlj < 0.0d || dTlj > 5.0d || ((dynamicRootView = this.f7230jg) != null && dynamicRootView.getRenderRequest() != null && this.f7230jg.getRenderRequest().f7398le != 4))) {
            this.ko.setVisibility(8);
            return true;
        }
        if (dTlj < 0.0d || dTlj > 5.0d) {
            dTlj = 5.0d;
        }
        this.ko.setVisibility(0);
        com.bytedance.sdk.component.adexpress.le.ex exVar = (com.bytedance.sdk.component.adexpress.le.ex) this.ko;
        int iLe = this.ryl.le();
        int i4 = (int) this.ryl.yu.pno;
        int iOuw = ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, r5.vt())) + ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.ryl.ouw())) + ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.ryl.yu.pno));
        float f10 = i4;
        exVar.ouw = (int) com.bytedance.sdk.component.adexpress.yu.ra.lh(exVar.getContext(), f10);
        exVar.vt = (int) com.bytedance.sdk.component.adexpress.yu.ra.lh(exVar.getContext(), f10);
        exVar.f7325lh = dTlj;
        exVar.yu = iOuw;
        exVar.removeAllViews();
        for (int i10 = 0; i10 < 5; i10++) {
            ImageView starImageView = exVar.getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(iLe, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(exVar.getStarFillDrawable());
            exVar.f7324le.addView(starImageView);
        }
        for (int i11 = 0; i11 < 5; i11++) {
            ImageView starImageView2 = exVar.getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(exVar.getStarEmptyDrawable());
            exVar.fkw.addView(starImageView2);
        }
        exVar.addView(exVar.fkw);
        exVar.addView(exVar.f7324le);
        exVar.requestLayout();
        return true;
    }
}

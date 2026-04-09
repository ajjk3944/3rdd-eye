package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class bly extends le {
    public bly(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            this.ko = new ImageView(context);
        } else {
            this.ko = new com.bytedance.sdk.component.adexpress.le.bly(context);
        }
        this.ko.setTag(3);
        addView(this.ko, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        super.ra();
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            Drawable drawableOuw = com.bytedance.sdk.component.adexpress.yu.lh.ouw(getContext(), this.ryl);
            if (drawableOuw != null) {
                this.ko.setBackground(drawableOuw);
            }
            int iYu = com.bytedance.sdk.component.utils.vpp.yu(getContext(), "tt_close_btn");
            if (iYu > 0) {
                ((ImageView) this.ko).setImageResource(iYu);
            }
            ((ImageView) this.ko).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        int iOuw = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.ryl.yu.vt);
        View view = this.ko;
        if (view instanceof com.bytedance.sdk.component.adexpress.le.bly) {
            ((com.bytedance.sdk.component.adexpress.le.bly) view).setRadius((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.ryl.yu.ouw));
            ((com.bytedance.sdk.component.adexpress.le.bly) this.ko).setStrokeWidth(iOuw);
            ((com.bytedance.sdk.component.adexpress.le.bly) this.ko).setStrokeColor(this.ryl.cf());
            ((com.bytedance.sdk.component.adexpress.le.bly) this.ko).setBgColor(this.ryl.mwh());
            ((com.bytedance.sdk.component.adexpress.le.bly) this.ko).setDislikeColor(this.ryl.le());
            ((com.bytedance.sdk.component.adexpress.le.bly) this.ko).setDislikeWidth((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, 1.0f));
        }
        return true;
    }
}

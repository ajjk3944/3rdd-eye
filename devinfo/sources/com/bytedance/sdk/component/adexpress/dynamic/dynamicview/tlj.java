package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj extends le {
    public tlj(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            ImageView imageView = new ImageView(context);
            this.ko = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.ra = this.pno;
        } else {
            this.ko = new TextView(context);
        }
        this.ko.setTag(3);
        addView(this.ko, getWidgetLayoutParams());
        if (dynamicRootView.getRenderRequest() != null) {
            if (dynamicRootView.getRenderRequest().yu && dynamicRootView.getRenderRequest().tc) {
                return;
            }
            this.ko.setVisibility(8);
            setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        super.ra();
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            Drawable drawableOuw = com.bytedance.sdk.component.adexpress.yu.lh.ouw(getContext(), this.ryl);
            if (drawableOuw != null) {
                ((ImageView) this.ko).setBackground(drawableOuw);
            }
            ((ImageView) this.ko).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int iYu = com.bytedance.sdk.component.utils.vpp.yu(getContext(), "tt_reward_full_feedback");
            if (iYu > 0) {
                ((ImageView) this.ko).setImageResource(iYu);
            }
        }
        return true;
    }
}

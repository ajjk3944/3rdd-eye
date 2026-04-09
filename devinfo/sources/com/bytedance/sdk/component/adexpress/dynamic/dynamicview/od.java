package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class od extends le implements com.bytedance.sdk.component.adexpress.dynamic.lh {
    private boolean ouw;

    public od(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        if (dynamicRootView.getRenderRequest() != null) {
            this.ouw = dynamicRootView.getRenderRequest().bly;
        }
        this.ra = this.pno;
        ImageView imageView = new ImageView(context);
        this.ko = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        addView(this.ko, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().tc) {
            return;
        }
        this.ko.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh
    public final void ouw(CharSequence charSequence, boolean z3, int i4, boolean z10) {
        int i10 = 0;
        if (!z3 && !z10) {
            i10 = 8;
        }
        setVisibility(i10);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        Drawable drawableLh;
        super.ra();
        ((ImageView) this.ko).setScaleType(ImageView.ScaleType.CENTER_CROP);
        Drawable drawableOuw = com.bytedance.sdk.component.adexpress.yu.lh.ouw(getContext(), this.ryl);
        if (drawableOuw != null) {
            ((ImageView) this.ko).setBackground(drawableOuw);
        }
        if (this.ouw) {
            drawableLh = com.bytedance.sdk.component.utils.vpp.lh(getContext(), "tt_close_btn");
        } else {
            drawableLh = com.bytedance.sdk.component.utils.vpp.lh(getContext(), "tt_skip_btn");
            if (drawableLh != null) {
                drawableLh.setAutoMirrored(true);
            }
        }
        if (drawableLh != null) {
            ((ImageView) this.ko).setImageDrawable(drawableLh);
        }
        setVisibility(8);
        return true;
    }
}

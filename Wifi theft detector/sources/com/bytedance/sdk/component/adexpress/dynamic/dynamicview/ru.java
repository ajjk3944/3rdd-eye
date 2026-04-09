package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ru extends ycc {
    public ru(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
            ImageView imageView = new ImageView(context);
            this.cf = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.uym = this.msw;
        } else {
            this.cf = new TextView(context);
        }
        this.cf.setTag(3);
        addView(this.cf, getWidgetLayoutParams());
        if (dynamicRootView.getRenderRequest() != null) {
            if (dynamicRootView.getRenderRequest().msw() && dynamicRootView.getRenderRequest().db()) {
                return;
            }
            this.cf.setVisibility(8);
            setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rtt
    public boolean zz() {
        super.zz();
        if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
            Drawable drawableEmc = com.bytedance.sdk.component.adexpress.dg.xq.emc(getContext(), this.sup);
            if (drawableEmc != null) {
                ((ImageView) this.cf).setBackground(drawableEmc);
            }
            ((ImageView) this.cf).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int iDg = com.bytedance.sdk.component.utils.rie.dg(getContext(), "tt_reward_full_feedback");
            if (iDg > 0) {
                ((ImageView) this.cf).setImageResource(iDg);
            }
        }
        return true;
    }
}

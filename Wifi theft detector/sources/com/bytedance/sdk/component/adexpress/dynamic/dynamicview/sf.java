package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class sf extends ycc implements com.bytedance.sdk.component.adexpress.dynamic.xq {
    private boolean emc;

    public sf(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        if (dynamicRootView.getRenderRequest() != null) {
            this.emc = dynamicRootView.getRenderRequest().sz();
        }
        this.uym = this.msw;
        ImageView imageView = new ImageView(context);
        this.cf = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        addView(this.cf, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().db()) {
            return;
        }
        this.cf.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq
    public void emc(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        int i11 = 0;
        if (!z10 && !z11) {
            i11 = 8;
        }
        setVisibility(i11);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rtt
    public boolean zz() {
        Drawable drawableXq;
        super.zz();
        ((ImageView) this.cf).setScaleType(ImageView.ScaleType.CENTER_CROP);
        Drawable drawableEmc = com.bytedance.sdk.component.adexpress.dg.xq.emc(getContext(), this.sup);
        if (drawableEmc != null) {
            ((ImageView) this.cf).setBackground(drawableEmc);
        }
        if (this.emc) {
            drawableXq = com.bytedance.sdk.component.utils.rie.xq(getContext(), "tt_close_btn");
        } else {
            drawableXq = com.bytedance.sdk.component.utils.rie.xq(getContext(), "tt_skip_btn");
            if (drawableXq != null) {
                drawableXq.setAutoMirrored(true);
            }
        }
        if (drawableXq != null) {
            ((ImageView) this.cf).setImageDrawable(drawableXq);
        }
        setVisibility(8);
        return true;
    }
}

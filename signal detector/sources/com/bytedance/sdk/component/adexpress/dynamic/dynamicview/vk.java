package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class vk extends ycc implements com.bytedance.sdk.component.adexpress.dynamic.ypw {
    public vk(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        ImageView imageView = new ImageView(context);
        this.cf = imageView;
        imageView.setTag(5);
        addView(this.cf, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().db()) {
            return;
        }
        this.cf.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw
    public boolean bw() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ypw
    public void setSoundMute(boolean z6) {
        ((ImageView) this.cf).setImageResource(z6 ? com.bytedance.sdk.component.utils.rie.dg(getContext(), "tt_reward_full_mute") : com.bytedance.sdk.component.utils.rie.dg(getContext(), "tt_reward_full_unmute"));
        if (((ImageView) this.cf).getDrawable() != null) {
            ((ImageView) this.cf).getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rtt
    public boolean zz() {
        super.zz();
        if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
            ((ImageView) this.cf).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            ((ImageView) this.cf).setScaleType(ImageView.ScaleType.CENTER);
        }
        setSoundMute(this.qh.mIsMute);
        if (!com.bytedance.sdk.component.adexpress.dg.ypw()) {
            ((ImageView) this.cf).setBackgroundDrawable(com.bytedance.sdk.component.adexpress.dg.msw.emc(0, Integer.valueOf(this.sup.sf()), new int[]{this.msw / 2}, null, null, null));
            return true;
        }
        Drawable drawableEmc = com.bytedance.sdk.component.adexpress.dg.xq.emc(getContext(), this.sup);
        if (drawableEmc == null) {
            return true;
        }
        ((ImageView) this.cf).setBackground(drawableEmc);
        return true;
    }
}

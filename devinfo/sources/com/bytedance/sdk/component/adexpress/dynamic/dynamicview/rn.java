package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class rn extends le implements com.bytedance.sdk.component.adexpress.dynamic.vt {
    public rn(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        ImageView imageView = new ImageView(context);
        this.ko = imageView;
        imageView.setTag(5);
        addView(this.ko, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().tc) {
            return;
        }
        this.ko.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        super.ra();
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            ((ImageView) this.ko).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            ((ImageView) this.ko).setScaleType(ImageView.ScaleType.CENTER);
        }
        setSoundMute(this.f7230jg.mIsMute);
        if (!com.bytedance.sdk.component.adexpress.yu.vt()) {
            ((ImageView) this.ko).setBackgroundDrawable(com.bytedance.sdk.component.adexpress.yu.pno.ouw(0, Integer.valueOf(this.ryl.mwh()), new int[]{this.pno / 2}, null, null, null));
            return true;
        }
        Drawable drawableOuw = com.bytedance.sdk.component.adexpress.yu.lh.ouw(getContext(), this.ryl);
        if (drawableOuw == null) {
            return true;
        }
        ((ImageView) this.ko).setBackground(drawableOuw);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.vt
    public final void setSoundMute(boolean z3) {
        ((ImageView) this.ko).setImageResource(z3 ? com.bytedance.sdk.component.utils.vpp.yu(getContext(), "tt_reward_full_mute") : com.bytedance.sdk.component.utils.vpp.yu(getContext(), "tt_reward_full_unmute"));
        if (((ImageView) this.ko).getDrawable() != null) {
            ((ImageView) this.ko).getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final boolean yu() {
        return true;
    }
}

package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ksc extends ra implements com.bytedance.sdk.component.adexpress.dynamic.lh {
    private boolean ouw;
    private boolean qbp;
    private boolean vt;

    public ksc(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(pnoVar.bly.ouw)) {
            dynamicRootView.setTimedown(this.pno);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final void fkw() {
        if (!TextUtils.equals("skip-with-countdowns-video-countdown", this.mwh.bly.ouw) && !TextUtils.equals("skip-with-time-countdown", this.mwh.bly.ouw)) {
            super.fkw();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.ra, this.pno);
        layoutParams.gravity = 8388627;
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            layoutParams.leftMargin = this.bly;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
        if (TextUtils.isEmpty(((TextView) this.ko).getText())) {
            setMeasuredDimension(0, this.pno);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh
    public final void ouw(CharSequence charSequence, boolean z3, int i4, boolean z10) {
        if (z10 || this.qbp) {
            ((TextView) this.ko).setText("");
            setVisibility(8);
            return;
        }
        try {
            if (Integer.parseInt((String) charSequence) <= 0) {
                setVisibility(8);
                return;
            }
        } catch (Exception unused) {
        }
        setVisibility(0);
        if (!z3 && this.f7230jg.getRenderRequest().vm && com.bytedance.sdk.component.adexpress.yu.le.ouw(this.f7230jg.getRenderRequest().ouw)) {
            if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                ((TextView) this.ko).setText(i4 + "s");
            } else {
                ((TextView) this.ko).setText(String.format(com.bytedance.sdk.component.utils.vpp.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), "tt_reward_full_skip"), Integer.valueOf(i4)));
            }
            this.ouw = true;
            return;
        }
        if (com.bytedance.sdk.component.adexpress.yu.vt() && !"open_ad".equals(this.f7230jg.getRenderRequest().ouw) && this.f7230jg.getRenderRequest().vm) {
            this.qbp = true;
            setVisibility(8);
            return;
        }
        if ("timedown".equals(this.mwh.bly.ouw)) {
            ((TextView) this.ko).setText(charSequence);
            return;
        }
        ((TextView) this.ko).setText(((Object) charSequence) + "s");
        this.vt = true;
        if (this.ouw) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.yu() + this.ryl.lh()) + com.bytedance.sdk.component.adexpress.dynamic.fkw.cf.ouw(((TextView) this.ko).getText() != null ? r5.toString() : "", this.ryl.yu.pno, true)[0]), this.pno);
            layoutParams.gravity = 8388629;
            this.ko.setLayoutParams(layoutParams);
            this.ouw = false;
            requestLayout();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ra, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        super.ra();
        if (com.bytedance.sdk.component.adexpress.yu.le.ouw(this.f7230jg.getRenderRequest().ouw)) {
            setVisibility(8);
        }
        if ("timedown".equals(this.mwh.bly.ouw)) {
            ((TextView) this.ko).setText(String.valueOf((int) Double.parseDouble(this.ryl.pno())));
            return true;
        }
        ((TextView) this.ko).setText(((int) Double.parseDouble(this.ryl.pno())) + "s");
        return true;
    }
}

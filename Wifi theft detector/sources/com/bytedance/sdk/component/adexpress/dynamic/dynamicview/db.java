package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class db extends uym implements com.bytedance.sdk.component.adexpress.dynamic.xq {
    private boolean emc;
    private boolean ul;
    private boolean ypw;

    public db(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(mswVar.ru().ypw())) {
            dynamicRootView.setTimedown(this.msw);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq
    public void emc(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        if (z11 || this.ul) {
            ((TextView) this.cf).setText("");
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
        if (!z10 && this.qh.getRenderRequest().emc() && com.bytedance.sdk.component.adexpress.dg.ycc.ypw(this.qh.getRenderRequest().dg())) {
            if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
                ((TextView) this.cf).setText(i10 + "s");
            } else {
                ((TextView) this.cf).setText(String.format(com.bytedance.sdk.component.utils.rie.emc(com.bytedance.sdk.component.adexpress.dg.emc(), "tt_reward_full_skip"), Integer.valueOf(i10)));
            }
            this.emc = true;
            return;
        }
        if (com.bytedance.sdk.component.adexpress.dg.ypw() && !"open_ad".equals(this.qh.getRenderRequest().dg()) && this.qh.getRenderRequest().emc()) {
            this.ul = true;
            setVisibility(8);
            return;
        }
        if ("timedown".equals(this.sz.ru().ypw())) {
            ((TextView) this.cf).setText(charSequence);
            return;
        }
        ((TextView) this.cf).setText(((Object) charSequence) + "s");
        this.ypw = true;
        if (this.emc) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (com.bytedance.sdk.component.adexpress.dynamic.bw.gbl.ypw(((TextView) this.cf).getText() != null ? r5.toString() : "", this.sup.bw(), true)[0] + com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.sup.xq() + this.sup.dg())), this.msw);
            layoutParams.gravity = 8388629;
            this.cf.setLayoutParams(layoutParams);
            this.emc = false;
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.cf).getText())) {
            setMeasuredDimension(0, this.msw);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw
    public void ycc() {
        if (!TextUtils.equals("skip-with-countdowns-video-countdown", this.sz.ru().ypw()) && !TextUtils.equals("skip-with-time-countdown", this.sz.ru().ypw())) {
            super.ycc();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.uym, this.msw);
        layoutParams.gravity = 8388627;
        if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
            layoutParams.leftMargin = this.zz;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.uym, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rtt
    public boolean zz() {
        super.zz();
        if (com.bytedance.sdk.component.adexpress.dg.ycc.ypw(this.qh.getRenderRequest().dg())) {
            setVisibility(8);
        }
        if ("timedown".equals(this.sz.ru().ypw())) {
            ((TextView) this.cf).setText(String.valueOf((int) Double.parseDouble(this.sup.ru())));
            return true;
        }
        ((TextView) this.cf).setText(((int) Double.parseDouble(this.sup.ru())) + "s");
        return true;
    }
}

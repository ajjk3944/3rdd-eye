package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class qh extends ycc {
    public qh(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        ImageView imageView = new ImageView(context);
        this.cf = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
            this.msw = Math.max(dynamicRootView.getLogoUnionHeight(), this.msw);
        }
        addView(this.cf, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rtt
    public boolean zz() {
        super.zz();
        if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
            ((ImageView) this.cf).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        DynamicRootView dynamicRootView = this.qh;
        if (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || TextUtils.isEmpty(this.qh.getRenderRequest().sb())) {
            setVisibility(8);
        } else {
            String strSb = this.qh.getRenderRequest().sb();
            if (strSb.equals("logo")) {
                ((ImageView) this.cf).setImageResource(com.bytedance.sdk.component.utils.rie.dg(getContext(), "tt_ad_logo"));
            } else {
                com.bytedance.sdk.component.bw.ru ruVarBw = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().bw().emc(strSb).emc(this.uym).ypw(this.msw).dg(this.uym).bw(this.msw);
                String strQh = this.qh.getRenderRequest().qh();
                if (!TextUtils.isEmpty(strQh)) {
                    ruVarBw.ypw(strQh);
                }
                ruVarBw.emc((ImageView) this.cf);
            }
        }
        ((ImageView) this.cf).setColorFilter(this.sup.uym(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}

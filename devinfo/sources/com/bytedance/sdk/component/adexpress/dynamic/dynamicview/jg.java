package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.widget.ImageView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class jg extends le {
    public jg(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        ImageView imageView = new ImageView(context);
        this.ko = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            this.pno = Math.max(dynamicRootView.getLogoUnionHeight(), this.pno);
        }
        addView(this.ko, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        super.ra();
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            ((ImageView) this.ko).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        DynamicRootView dynamicRootView = this.f7230jg;
        if (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || TextUtils.isEmpty(this.f7230jg.getRenderRequest().ksc)) {
            setVisibility(8);
        } else {
            String str = this.f7230jg.getRenderRequest().ksc;
            if (str.equals("logo")) {
                ((ImageView) this.ko).setImageResource(com.bytedance.sdk.component.utils.vpp.yu(getContext(), "tt_ad_logo"));
            } else {
                com.bytedance.sdk.component.fkw.tlj tljVarFkw = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().yu.ouw(str).ouw(this.ra).vt(this.pno).yu(this.ra).fkw(this.pno);
                String str2 = this.f7230jg.getRenderRequest().tlj;
                if (!TextUtils.isEmpty(str2)) {
                    tljVarFkw.vt(str2);
                }
                tljVarFkw.ouw((ImageView) this.ko);
            }
        }
        ((ImageView) this.ko).setColorFilter(this.ryl.le(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}

package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class zz extends ycc {
    public zz(Context context, @NonNull DynamicRootView dynamicRootView, @NonNull com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
            this.cf = new ImageView(context);
        } else {
            this.cf = new com.bytedance.sdk.component.adexpress.ycc.zz(context);
        }
        this.cf.setTag(3);
        addView(this.cf, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rtt
    public boolean zz() {
        super.zz();
        if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
            Drawable drawableEmc = com.bytedance.sdk.component.adexpress.dg.xq.emc(getContext(), this.sup);
            if (drawableEmc != null) {
                this.cf.setBackground(drawableEmc);
            }
            int iDg = com.bytedance.sdk.component.utils.rie.dg(getContext(), "tt_close_btn");
            if (iDg > 0) {
                ((ImageView) this.cf).setImageResource(iDg);
            }
            ((ImageView) this.cf).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        int iEmc = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.aa());
        View view = this.cf;
        if (view instanceof com.bytedance.sdk.component.adexpress.ycc.zz) {
            ((com.bytedance.sdk.component.adexpress.ycc.zz) view).setRadius((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.cf()));
            ((com.bytedance.sdk.component.adexpress.ycc.zz) this.cf).setStrokeWidth(iEmc);
            ((com.bytedance.sdk.component.adexpress.ycc.zz) this.cf).setStrokeColor(this.sup.vk());
            ((com.bytedance.sdk.component.adexpress.ycc.zz) this.cf).setBgColor(this.sup.sf());
            ((com.bytedance.sdk.component.adexpress.ycc.zz) this.cf).setDislikeColor(this.sup.uym());
            ((com.bytedance.sdk.component.adexpress.ycc.zz) this.cf).setDislikeWidth((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, 1.0f));
        }
        return true;
    }
}

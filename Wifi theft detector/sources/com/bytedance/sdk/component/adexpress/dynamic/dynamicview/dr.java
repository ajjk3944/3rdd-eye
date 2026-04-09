package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class dr extends ycc implements com.bytedance.sdk.component.adexpress.dynamic.xq {
    private boolean emc;

    public dr(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        this.uym = this.msw;
        ImageView imageView = new ImageView(context);
        this.cf = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        addView(this.cf, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null) {
            if (!dynamicRootView.getRenderRequest().db()) {
                this.cf.setVisibility(8);
                setVisibility(8);
            }
            this.emc = dynamicRootView.getRenderRequest().sz();
        }
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
        super.zz();
        View view = this.cf;
        if (view != null) {
            ((ImageView) view).setScaleType(ImageView.ScaleType.CENTER_CROP);
            Drawable drawableEmc = com.bytedance.sdk.component.adexpress.dg.xq.emc(getContext(), this.sup);
            if (drawableEmc != null) {
                ((ImageView) this.cf).setBackground(drawableEmc);
            }
            Drawable drawableXq = this.emc ? com.bytedance.sdk.component.utils.rie.xq(getContext(), "tt_close_btn") : com.bytedance.sdk.component.utils.rie.xq(getContext(), "tt_skip_btn");
            if (drawableXq != null) {
                drawableXq.setAutoMirrored(true);
                ((ImageView) this.cf).setImageDrawable(drawableXq);
            }
            int iEmc = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.ypw());
            this.cf.setPadding(iEmc, iEmc, iEmc, iEmc);
        }
        setVisibility(8);
        return true;
    }
}

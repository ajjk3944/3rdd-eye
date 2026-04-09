package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class uym extends ycc {
    public uym(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.emc emcVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.emc(context);
        this.cf = emcVar;
        emcVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.cf, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (!com.bytedance.sdk.component.adexpress.dg.ypw() || !"fillButton".equals(this.sz.ru().ypw())) {
            return super.getWidgetLayoutParams();
        }
        ((TextView) this.cf).setEllipsize(TextUtils.TruncateAt.END);
        ((TextView) this.cf).setMaxLines(1);
        FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
        widgetLayoutParams.width -= this.sup.sba() * 2;
        widgetLayoutParams.height -= this.sup.sba() * 2;
        widgetLayoutParams.topMargin += this.sup.sba();
        int iSba = widgetLayoutParams.leftMargin + this.sup.sba();
        widgetLayoutParams.leftMargin = iSba;
        widgetLayoutParams.setMarginStart(iSba);
        widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
        return widgetLayoutParams;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rtt
    public boolean zz() {
        super.zz();
        if (TextUtils.equals("download-progress-button", this.sz.ru().ypw()) && TextUtils.isEmpty(this.sup.ru())) {
            this.cf.setVisibility(4);
            return true;
        }
        this.cf.setTextAlignment(this.sup.msw());
        ((TextView) this.cf).setText(this.sup.ru());
        ((TextView) this.cf).setTextColor(this.sup.uym());
        ((TextView) this.cf).setTextSize(this.sup.bw());
        ((TextView) this.cf).setGravity(17);
        ((TextView) this.cf).setIncludeFontPadding(false);
        if ("fillButton".equals(this.sz.ru().ypw())) {
            this.cf.setPadding(0, 0, 0, 0);
        } else {
            this.cf.setPadding(this.sup.xq(), this.sup.ypw(), this.sup.dg(), this.sup.emc());
        }
        return true;
    }
}

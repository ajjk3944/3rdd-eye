package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ra extends le {
    public ra(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.ouw ouwVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.ouw(context);
        this.ko = ouwVar;
        ouwVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.ko, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (!com.bytedance.sdk.component.adexpress.yu.vt() || !"fillButton".equals(this.mwh.bly.ouw)) {
            return super.getWidgetLayoutParams();
        }
        ((TextView) this.ko).setEllipsize(TextUtils.TruncateAt.END);
        ((TextView) this.ko).setMaxLines(1);
        FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
        int i4 = widgetLayoutParams.width;
        int i10 = this.ryl.yu.f7284gh;
        widgetLayoutParams.width = i4 - (i10 * 2);
        widgetLayoutParams.height -= i10 * 2;
        widgetLayoutParams.topMargin += i10;
        int i11 = widgetLayoutParams.leftMargin + i10;
        widgetLayoutParams.leftMargin = i11;
        widgetLayoutParams.setMarginStart(i11);
        widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
        return widgetLayoutParams;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public boolean ra() {
        super.ra();
        if (TextUtils.equals("download-progress-button", this.mwh.bly.ouw) && TextUtils.isEmpty(this.ryl.pno())) {
            this.ko.setVisibility(4);
            return true;
        }
        this.ko.setTextAlignment(this.ryl.ra());
        ((TextView) this.ko).setText(this.ryl.pno());
        ((TextView) this.ko).setTextColor(this.ryl.le());
        ((TextView) this.ko).setTextSize(this.ryl.yu.pno);
        ((TextView) this.ko).setGravity(17);
        ((TextView) this.ko).setIncludeFontPadding(false);
        if ("fillButton".equals(this.mwh.bly.ouw)) {
            this.ko.setPadding(0, 0, 0, 0);
        } else {
            this.ko.setPadding(this.ryl.lh(), this.ryl.vt(), this.ryl.yu(), this.ryl.ouw());
        }
        return true;
    }
}

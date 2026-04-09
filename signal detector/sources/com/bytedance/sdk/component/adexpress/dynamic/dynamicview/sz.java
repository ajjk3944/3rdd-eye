package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class sz extends ycc {
    public sz(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        TextView textView = new TextView(context);
        this.cf = textView;
        textView.setTag(Integer.valueOf(getClickArea()));
        addView(this.cf, getWidgetLayoutParams());
    }

    private boolean emc() {
        if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.sup.ypw) && this.sup.ypw.contains("adx:")) || com.bytedance.sdk.component.adexpress.dynamic.bw.gbl.ypw();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw
    public void ycc() {
        com.bytedance.sdk.component.adexpress.ypw.sz renderRequest = this.qh.getRenderRequest();
        if (renderRequest == null || !TextUtils.isEmpty(renderRequest.sb())) {
            super.ycc();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.uym, this.msw);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rtt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean zz() {
        /*
            r4 = this;
            super.zz()
            android.view.View r0 = r4.cf
            com.bytedance.sdk.component.adexpress.dynamic.dg.uym r1 = r4.sup
            int r1 = r1.msw()
            r0.setTextAlignment(r1)
            android.view.View r0 = r4.cf
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.bytedance.sdk.component.adexpress.dynamic.dg.uym r1 = r4.sup
            int r1 = r1.uym()
            r0.setTextColor(r1)
            android.view.View r0 = r4.cf
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.bytedance.sdk.component.adexpress.dynamic.dg.uym r1 = r4.sup
            float r1 = r1.bw()
            r0.setTextSize(r1)
            boolean r0 = com.bytedance.sdk.component.adexpress.dg.ypw()
            if (r0 == 0) goto L8a
            android.view.View r0 = r4.cf
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            r0.setIncludeFontPadding(r1)
            android.view.View r0 = r4.cf
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r2 = com.bytedance.sdk.component.adexpress.dg.emc()
            int r3 = r4.msw
            float r3 = (float) r3
            int r2 = com.bytedance.sdk.component.adexpress.dg.uym.ypw(r2, r3)
            com.bytedance.sdk.component.adexpress.dynamic.dg.uym r3 = r4.sup
            int r3 = r3.ypw()
            int r2 = r2 - r3
            com.bytedance.sdk.component.adexpress.dynamic.dg.uym r3 = r4.sup
            int r3 = r3.emc()
            int r2 = r2 - r3
            float r2 = (float) r2
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 - r3
            com.bytedance.sdk.component.adexpress.dynamic.dg.uym r3 = r4.sup
            float r3 = r3.bw()
            float r2 = java.lang.Math.min(r2, r3)
            r0.setTextSize(r2)
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView r0 = r4.qh
            if (r0 == 0) goto L80
            com.bytedance.sdk.component.adexpress.ypw.sz r0 = r0.getRenderRequest()
            if (r0 == 0) goto L80
            java.lang.String r0 = r0.sf()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L80
            android.view.View r2 = r4.cf
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r0)
            goto L82
        L80:
            r1 = 8
        L82:
            android.view.View r0 = r4.cf
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setVisibility(r1)
            goto Lc3
        L8a:
            boolean r0 = r4.emc()
            if (r0 == 0) goto Lb2
            boolean r0 = com.bytedance.sdk.component.adexpress.dynamic.bw.gbl.ypw()
            if (r0 == 0) goto La2
            android.view.View r0 = r4.cf
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = com.bytedance.sdk.component.adexpress.dynamic.bw.gbl.emc()
            r0.setText(r1)
            goto Lc3
        La2:
            android.view.View r0 = r4.cf
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.bytedance.sdk.component.adexpress.dynamic.dg.uym r1 = r4.sup
            java.lang.String r1 = r1.ypw
            java.lang.String r1 = com.bytedance.sdk.component.adexpress.dynamic.bw.gbl.emc(r1)
            r0.setText(r1)
            goto Lc3
        Lb2:
            android.view.View r0 = r4.cf
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "tt_logo_cn"
            int r1 = com.bytedance.sdk.component.utils.rie.ypw(r1, r2)
            r0.setText(r1)
        Lc3:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sz.zz():boolean");
    }
}

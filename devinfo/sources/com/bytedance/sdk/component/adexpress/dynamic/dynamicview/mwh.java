package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class mwh extends le {
    public mwh(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        TextView textView = new TextView(context);
        this.ko = textView;
        textView.setTag(Integer.valueOf(getClickArea()));
        addView(this.ko, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final void fkw() {
        com.bytedance.sdk.component.adexpress.vt.mwh renderRequest = this.f7230jg.getRenderRequest();
        if (renderRequest == null || !TextUtils.isEmpty(renderRequest.ksc)) {
            super.fkw();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.ra, this.pno);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007e  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean ra() {
        /*
            r4 = this;
            super.ra()
            android.view.View r0 = r4.ko
            com.bytedance.sdk.component.adexpress.dynamic.yu.ra r1 = r4.ryl
            int r1 = r1.ra()
            r0.setTextAlignment(r1)
            android.view.View r0 = r4.ko
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.bytedance.sdk.component.adexpress.dynamic.yu.ra r1 = r4.ryl
            int r1 = r1.le()
            r0.setTextColor(r1)
            android.view.View r0 = r4.ko
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.bytedance.sdk.component.adexpress.dynamic.yu.ra r1 = r4.ryl
            com.bytedance.sdk.component.adexpress.dynamic.yu.le r1 = r1.yu
            float r1 = r1.pno
            r0.setTextSize(r1)
            boolean r0 = com.bytedance.sdk.component.adexpress.yu.vt()
            if (r0 == 0) goto L88
            android.view.View r0 = r4.ko
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            r0.setIncludeFontPadding(r1)
            android.view.View r0 = r4.ko
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r2 = com.bytedance.sdk.component.adexpress.yu.ouw()
            int r3 = r4.pno
            float r3 = (float) r3
            int r2 = com.bytedance.sdk.component.adexpress.yu.ra.vt(r2, r3)
            com.bytedance.sdk.component.adexpress.dynamic.yu.ra r3 = r4.ryl
            int r3 = r3.vt()
            int r2 = r2 - r3
            com.bytedance.sdk.component.adexpress.dynamic.yu.ra r3 = r4.ryl
            int r3 = r3.ouw()
            int r2 = r2 - r3
            float r2 = (float) r2
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 - r3
            com.bytedance.sdk.component.adexpress.dynamic.yu.ra r3 = r4.ryl
            com.bytedance.sdk.component.adexpress.dynamic.yu.le r3 = r3.yu
            float r3 = r3.pno
            float r2 = java.lang.Math.min(r2, r3)
            r0.setTextSize(r2)
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView r0 = r4.f7230jg
            if (r0 == 0) goto L7e
            com.bytedance.sdk.component.adexpress.vt.mwh r0 = r0.getRenderRequest()
            if (r0 == 0) goto L7e
            java.lang.String r0 = r0.jae
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L7e
            android.view.View r2 = r4.ko
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r0)
            goto L80
        L7e:
            r1 = 8
        L80:
            android.view.View r0 = r4.ko
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setVisibility(r1)
            goto Ldd
        L88:
            boolean r0 = com.bytedance.sdk.component.adexpress.yu.vt()
            if (r0 != 0) goto Lcc
            com.bytedance.sdk.component.adexpress.dynamic.yu.ra r0 = r4.ryl
            java.lang.String r0 = r0.vt
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La4
            com.bytedance.sdk.component.adexpress.dynamic.yu.ra r0 = r4.ryl
            java.lang.String r0 = r0.vt
            java.lang.String r1 = "adx:"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Laa
        La4:
            boolean r0 = com.bytedance.sdk.component.adexpress.dynamic.fkw.cf.vt()
            if (r0 == 0) goto Lcc
        Laa:
            boolean r0 = com.bytedance.sdk.component.adexpress.dynamic.fkw.cf.vt()
            if (r0 == 0) goto Lbc
            android.view.View r0 = r4.ko
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = com.bytedance.sdk.component.adexpress.dynamic.fkw.cf.ouw()
            r0.setText(r1)
            goto Ldd
        Lbc:
            android.view.View r0 = r4.ko
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.bytedance.sdk.component.adexpress.dynamic.yu.ra r1 = r4.ryl
            java.lang.String r1 = r1.vt
            java.lang.String r1 = com.bytedance.sdk.component.adexpress.dynamic.fkw.cf.ouw(r1)
            r0.setText(r1)
            goto Ldd
        Lcc:
            android.view.View r0 = r4.ko
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "tt_logo_cn"
            int r1 = com.bytedance.sdk.component.utils.vpp.vt(r1, r2)
            r0.setText(r1)
        Ldd:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mwh.ra():boolean");
    }
}

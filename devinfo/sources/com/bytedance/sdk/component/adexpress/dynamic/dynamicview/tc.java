package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tc extends le {
    public tc(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        this.pno += 6;
        if (this.ryl.yu.f7296vh) {
            int iLe = this.ryl.le();
            com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = this.ryl;
            com.bytedance.sdk.component.adexpress.le.ouw ouwVar = new com.bytedance.sdk.component.adexpress.le.ouw(context, iLe, raVar.yu.pno, raVar.ra());
            this.ko = ouwVar;
            ouwVar.setMaxLines(1);
        } else {
            TextView textView = new TextView(context);
            this.ko = textView;
            textView.setIncludeFontPadding(false);
        }
        this.ko.setTag(Integer.valueOf(getClickArea()));
        addView(this.ko, getWidgetLayoutParams());
    }

    public final String getText() {
        String strFkw = this.ryl.fkw();
        if (TextUtils.isEmpty(strFkw)) {
            if (!com.bytedance.sdk.component.adexpress.yu.vt() && TextUtils.equals(this.mwh.bly.ouw, "text_star")) {
                strFkw = "5";
            }
            if (!com.bytedance.sdk.component.adexpress.yu.vt() && TextUtils.equals(this.mwh.bly.ouw, "score-count")) {
                strFkw = "6870";
            }
        }
        return (TextUtils.equals(this.mwh.bly.ouw, "title") || TextUtils.equals(this.mwh.bly.ouw, "subtitle")) ? strFkw.replace("\n", "") : strFkw;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x04bc  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean ra() throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tc.ra():boolean");
    }
}

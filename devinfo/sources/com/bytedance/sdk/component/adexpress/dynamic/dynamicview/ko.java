package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import a0.g;
import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ko extends le {
    String ouw;
    com.bytedance.sdk.component.adexpress.dynamic.yu.pno vt;

    public ko(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar, String str) {
        super(context, dynamicRootView, pnoVar);
        this.ouw = str;
        this.vt = pnoVar;
        com.bytedance.sdk.component.adexpress.le.tlj lottieView = getLottieView();
        if (lottieView != null) {
            addView(lottieView, getWidgetLayoutParams());
        }
    }

    private com.bytedance.sdk.component.adexpress.le.tlj getLottieView() {
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar = this.mwh;
        if (pnoVar == null || pnoVar.bly == null || this.f7229cf == null || TextUtils.isEmpty(this.ouw)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = this.mwh.bly.f7280lh;
        String str = leVar != null ? leVar.wp : "";
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strP = g.p(new StringBuilder(), this.ouw, "static/lotties/", str, ".json");
        com.bytedance.sdk.component.adexpress.le.tlj tljVar = new com.bytedance.sdk.component.adexpress.le.tlj(this.f7229cf);
        tljVar.setImageLottieTosPath(strP);
        tljVar.yu();
        return tljVar;
    }
}

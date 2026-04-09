package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC1135f5;

/* loaded from: classes.dex */
public class cf extends ycc {
    String emc;
    com.bytedance.sdk.component.adexpress.dynamic.dg.msw ypw;

    public cf(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar, String str) {
        super(context, dynamicRootView, mswVar);
        this.emc = str;
        this.ypw = mswVar;
        com.bytedance.sdk.component.adexpress.ycc.ru lottieView = getLottieView();
        if (lottieView != null) {
            addView(lottieView, getWidgetLayoutParams());
        }
    }

    private com.bytedance.sdk.component.adexpress.ycc.ru getLottieView() {
        com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar = this.sz;
        if (mswVar == null || mswVar.ru() == null || this.gbl == null || TextUtils.isEmpty(this.emc)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.dg.ycc yccVarBw = this.sz.ru().bw();
        String strJp = yccVarBw != null ? yccVarBw.jp() : "";
        if (TextUtils.isEmpty(strJp)) {
            return null;
        }
        String strO = AbstractC1135f5.o(new StringBuilder(), this.emc, "static/lotties/", strJp, ".json");
        com.bytedance.sdk.component.adexpress.ycc.ru ruVar = new com.bytedance.sdk.component.adexpress.ycc.ru(this.gbl);
        ruVar.setImageLottieTosPath(strO);
        ruVar.msw();
        return ruVar;
    }
}

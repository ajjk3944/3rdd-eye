package com.bytedance.sdk.openadsdk.component.emc;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.xq.xq;
import com.bytedance.sdk.openadsdk.ee.ypw.bw;
import java.util.HashMap;

/* loaded from: classes.dex */
public class emc extends com.bytedance.sdk.openadsdk.core.xq.emc {
    private final com.bytedance.sdk.openadsdk.component.msw.emc emc;

    public emc(Context context, rie rieVar, String str, int i, com.bytedance.sdk.openadsdk.component.msw.emc emcVar) {
        super(context, rieVar, str, i);
        this.emc = emcVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xq.emc, com.bytedance.sdk.openadsdk.core.xq.ypw, com.bytedance.sdk.openadsdk.core.xq.xq
    public void emc(View view, float f2, float f5, float f6, float f7, SparseArray<xq.emc> sparseArray, boolean z6) {
        if (view.getTag() == "open_ad_click_button_tag") {
            emc("click_bar");
        } else {
            emc("click_material");
        }
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(this.emc.xq()));
        emc(map);
        super.emc(view, f2, f5, f6, f7, sparseArray, z6);
        bw.emc(((com.bytedance.sdk.openadsdk.core.xq.ypw) this).ycc, 9);
    }
}

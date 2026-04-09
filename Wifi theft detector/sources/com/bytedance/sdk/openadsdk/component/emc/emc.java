package com.bytedance.sdk.openadsdk.component.emc;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.xq.xq;
import com.bytedance.sdk.openadsdk.ee.ypw.bw;
import java.util.HashMap;

/* loaded from: classes.dex */
public class emc extends com.bytedance.sdk.openadsdk.core.xq.emc {
    private final com.bytedance.sdk.openadsdk.component.msw.emc emc;

    public emc(@NonNull Context context, @NonNull rie rieVar, @NonNull String str, int i10, com.bytedance.sdk.openadsdk.component.msw.emc emcVar) {
        super(context, rieVar, str, i10);
        this.emc = emcVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xq.emc, com.bytedance.sdk.openadsdk.core.xq.ypw, com.bytedance.sdk.openadsdk.core.xq.xq
    public void emc(View view, float f10, float f11, float f12, float f13, SparseArray<xq.emc> sparseArray, boolean z10) {
        if (view.getTag() == "open_ad_click_button_tag") {
            emc("click_bar");
        } else {
            emc("click_material");
        }
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(this.emc.xq()));
        emc(map);
        super.emc(view, f10, f11, f12, f13, sparseArray, z10);
        bw.emc(((com.bytedance.sdk.openadsdk.core.xq.ypw) this).ycc, 9);
    }
}

package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class xq extends com.bytedance.sdk.openadsdk.core.ycc.dg {
    public xq(Context context) {
        super(context);
        emc();
    }

    private void emc() {
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.vk.kda);
    }

    public void emc(int i, rie rieVar) {
        if (rieVar.ak() || (rieVar.yvi() && rieVar.rie())) {
            vw.emc((View) this, 0);
            com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc((int) vw.emc(getContext(), i, true), this, rieVar);
        }
    }
}

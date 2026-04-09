package com.bytedance.sdk.openadsdk.emc.ypw.emc;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.zz.ul;
import com.bytedance.sdk.openadsdk.core.zz.yzg;

/* loaded from: classes.dex */
public class ypw extends xq {
    public ypw(@NonNull Context context, rie rieVar, AdSlot adSlot) {
        super(context, rieVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.emc.ypw.emc.xq
    public void emc() {
        yzg yzgVar = new yzg(((xq) this).msw, this.ypw, ((xq) this).zz, this.gbl, false);
        this.ru = yzgVar;
        this.emc.emc(yzgVar.getVideoController());
        xq();
    }

    public com.bytedance.sdk.openadsdk.multipro.ypw.emc ypw() {
        ul ulVar = this.ru;
        if (ulVar != null) {
            return ((yzg) ulVar).getVideoModel();
        }
        return null;
    }
}

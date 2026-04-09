package com.bytedance.sdk.component.bw.dg.ypw;

import android.text.TextUtils;
import com.bytedance.sdk.component.bw.yzg;
import com.bytedance.sdk.component.utils.vk;

/* loaded from: classes.dex */
public class ypw implements ycc {
    @Override // com.bytedance.sdk.component.bw.dg.ypw.ycc
    public boolean emc(com.bytedance.sdk.component.bw.dg.xq.xq xqVar, yzg yzgVar, com.bytedance.sdk.component.bw.dg.xq.emc emcVar) {
        if (TextUtils.isEmpty(xqVar.ru())) {
            String strEmc = emc(xqVar);
            xqVar.ypw(strEmc);
            xqVar.emc(strEmc);
        }
        xqVar.emc();
        return true;
    }

    @Override // com.bytedance.sdk.component.bw.dg.ypw.ycc
    public String emc() {
        return "generate_key";
    }

    private String emc(com.bytedance.sdk.component.bw.dg.xq.xq xqVar) {
        return vk.emc(xqVar.emc());
    }
}

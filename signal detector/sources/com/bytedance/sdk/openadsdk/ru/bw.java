package com.bytedance.sdk.openadsdk.ru;

import com.bytedance.sdk.component.bw.yzg;
import com.bytedance.sdk.component.bw.zz;

/* loaded from: classes.dex */
public class bw implements yzg {
    private static int emc;
    private final String bw;
    private boolean dg;
    private long xq;
    private long ypw = 0;

    public bw() {
        emc++;
        this.bw = "image_request_" + emc;
    }

    private String xq(String str, zz zzVar) {
        return str;
    }

    @Override // com.bytedance.sdk.component.bw.yzg
    public void emc(String str, zz zzVar) {
        if (!this.dg) {
            zzVar.emc();
            zzVar.ypw();
            zzVar.xq();
            this.dg = true;
        }
        this.ypw = System.currentTimeMillis();
        xq(str, zzVar);
    }

    @Override // com.bytedance.sdk.component.bw.yzg
    public void ypw(String str, zz zzVar) {
        this.xq += System.currentTimeMillis() - this.ypw;
        xq(str, zzVar);
    }
}

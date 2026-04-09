package com.bytedance.sdk.component.bw.dg.xq.emc.ypw;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.bw.aa;

/* loaded from: classes.dex */
public class xq implements aa {
    private final aa emc;
    private final com.bytedance.sdk.component.bw.dg.xq.emc.emc ypw;

    public xq(aa aaVar) {
        this(aaVar, null);
    }

    public xq(aa aaVar, com.bytedance.sdk.component.bw.dg.xq.emc.emc emcVar) {
        this.emc = aaVar;
        this.ypw = emcVar;
    }

    @Override // com.bytedance.sdk.component.bw.emc
    public boolean ypw(String str) {
        return this.emc.ypw(str);
    }

    @Override // com.bytedance.sdk.component.bw.emc
    public boolean emc(String str, Bitmap bitmap) {
        return this.emc.emc(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.bw.emc
    public Bitmap emc(String str) {
        return this.emc.emc(str);
    }
}

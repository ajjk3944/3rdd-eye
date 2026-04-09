package com.bytedance.sdk.component.bw.xq.emc.ypw;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.bw.aa;

/* loaded from: classes.dex */
public class dg implements aa {
    private final aa emc;
    private final com.bytedance.sdk.component.bw.xq.emc.ypw ypw;

    public dg(aa aaVar) {
        this(aaVar, null);
    }

    public dg(aa aaVar, com.bytedance.sdk.component.bw.xq.emc.ypw ypwVar) {
        this.emc = aaVar;
        this.ypw = ypwVar;
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

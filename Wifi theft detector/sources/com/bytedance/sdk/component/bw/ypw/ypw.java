package com.bytedance.sdk.component.bw.ypw;

import com.bytedance.sdk.component.bw.bw;
import com.bytedance.sdk.component.bw.qh;

/* loaded from: classes.dex */
public class ypw implements bw {
    private qh dg;
    private String emc;
    private boolean xq;
    private boolean ypw;

    public ypw(String str, boolean z10, boolean z11, qh qhVar) {
        this.emc = str;
        this.ypw = z10;
        this.xq = z11;
        this.dg = qhVar;
    }

    @Override // com.bytedance.sdk.component.bw.bw
    public String emc() {
        return this.emc;
    }

    @Override // com.bytedance.sdk.component.bw.bw
    public boolean xq() {
        return this.xq;
    }

    @Override // com.bytedance.sdk.component.bw.bw
    public boolean ypw() {
        return this.ypw;
    }
}

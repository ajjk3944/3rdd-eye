package com.bytedance.sdk.component.bw.bw;

/* loaded from: classes.dex */
public class ypw implements zz {
    private byte[] emc;
    private com.bytedance.sdk.component.bw.ycc ypw;

    public ypw(byte[] bArr, com.bytedance.sdk.component.bw.ycc yccVar) {
        this.emc = bArr;
        this.ypw = yccVar;
    }

    @Override // com.bytedance.sdk.component.bw.bw.zz
    public void emc(com.bytedance.sdk.component.bw.xq.xq xqVar) {
        zz bwVar;
        int iSup = xqVar.sup();
        xqVar.emc(this.emc.length);
        if (iSup == 2) {
            bwVar = com.bytedance.sdk.component.utils.ycc.emc(this.emc) ? new bw(this.emc, this.ypw) : this.ypw == null ? new gbl() : new msw(1001, "not image format", null);
        } else if (iSup != 3) {
            boolean zYpw = com.bytedance.sdk.component.utils.ycc.ypw(this.emc);
            bwVar = (!zYpw && com.bytedance.sdk.component.utils.ycc.emc(this.emc)) ? new bw(this.emc, this.ypw) : new sz(this.emc, this.ypw, zYpw);
        } else {
            byte[] bArr = this.emc;
            bwVar = new sz(bArr, this.ypw, com.bytedance.sdk.component.utils.ycc.ypw(bArr));
        }
        xqVar.emc(bwVar);
    }

    @Override // com.bytedance.sdk.component.bw.bw.zz
    public String emc() {
        return "image_type";
    }
}

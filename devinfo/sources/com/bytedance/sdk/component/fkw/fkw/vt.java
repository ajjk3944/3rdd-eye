package com.bytedance.sdk.component.fkw.fkw;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt implements bly {
    private byte[] ouw;
    private com.bytedance.sdk.component.fkw.le vt;

    public vt(byte[] bArr, com.bytedance.sdk.component.fkw.le leVar) {
        this.ouw = bArr;
        this.vt = leVar;
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "image_type";
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        bly fkwVar;
        int i4 = lhVar.tlj;
        byte[] bArr = this.ouw;
        lhVar.vpp = bArr.length;
        if (i4 == 2) {
            fkwVar = com.bytedance.sdk.component.utils.le.ouw(bArr) ? new fkw(this.ouw, this.vt) : this.vt == null ? new cf() : new pno(1001, "not image format", null);
        } else if (i4 != 3) {
            boolean zVt = com.bytedance.sdk.component.utils.le.vt(bArr);
            fkwVar = (!zVt && com.bytedance.sdk.component.utils.le.ouw(this.ouw)) ? new fkw(this.ouw, this.vt) : new mwh(this.ouw, this.vt, zVt);
        } else {
            fkwVar = new mwh(bArr, this.vt, com.bytedance.sdk.component.utils.le.vt(bArr));
        }
        lhVar.ouw(fkwVar);
    }
}

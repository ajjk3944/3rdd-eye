package com.bytedance.sdk.component.bw.dg.xq.emc.ypw;

import com.bytedance.sdk.component.bw.sba;

/* loaded from: classes.dex */
public class ypw implements sba {
    private com.bytedance.sdk.component.bw.dg.xq.emc.xq<String, byte[]> dg;
    private long emc = 1048576;
    private int xq;
    private int ypw;

    public ypw(int i10, int i11) {
        this.xq = i10;
        this.ypw = i11;
        this.dg = new com.bytedance.sdk.component.bw.dg.xq.emc.xq<>(i11);
    }

    @Override // com.bytedance.sdk.component.bw.emc
    public boolean ypw(String str) {
        return this.dg.emc((com.bytedance.sdk.component.bw.dg.xq.emc.xq<String, byte[]>) str) != null;
    }

    @Override // com.bytedance.sdk.component.bw.emc
    public boolean emc(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            try {
                if (bArr.length > this.emc) {
                    return false;
                }
                this.dg.emc(str, bArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.bw.emc
    public byte[] emc(String str) {
        try {
            return this.dg.emc((com.bytedance.sdk.component.bw.dg.xq.emc.xq<String, byte[]>) str);
        } catch (Throwable unused) {
            return null;
        }
    }
}

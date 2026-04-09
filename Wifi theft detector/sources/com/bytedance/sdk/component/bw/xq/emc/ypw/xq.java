package com.bytedance.sdk.component.bw.xq.emc.ypw;

import com.bytedance.sdk.component.bw.sba;

/* loaded from: classes.dex */
public class xq implements sba {
    private int emc;
    private com.bytedance.sdk.component.bw.xq.emc.xq<String, byte[]> xq;
    private int ypw;

    public xq(int i10, int i11) {
        this.ypw = i10;
        this.emc = i11;
        this.xq = new com.bytedance.sdk.component.bw.xq.emc.xq<String, byte[]>(i10) { // from class: com.bytedance.sdk.component.bw.xq.emc.ypw.xq.1
            @Override // com.bytedance.sdk.component.bw.xq.emc.xq
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public int ypw(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    @Override // com.bytedance.sdk.component.bw.emc
    public boolean ypw(String str) {
        return this.xq.emc((com.bytedance.sdk.component.bw.xq.emc.xq<String, byte[]>) str) != null;
    }

    @Override // com.bytedance.sdk.component.bw.emc
    public boolean emc(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.xq.emc(str, bArr);
        return true;
    }

    @Override // com.bytedance.sdk.component.bw.emc
    public byte[] emc(String str) {
        return this.xq.emc((com.bytedance.sdk.component.bw.xq.emc.xq<String, byte[]>) str);
    }
}

package com.bytedance.sdk.component.fkw.lh.ouw.vt;

import com.bytedance.sdk.component.fkw.vm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt implements vm {

    /* renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.component.fkw.lh.ouw.lh<String, byte[]> f7482lh;
    private int ouw = Integer.MAX_VALUE;
    private int vt;

    public vt(int i4) {
        this.vt = i4;
        this.f7482lh = new com.bytedance.sdk.component.fkw.lh.ouw.lh<String, byte[]>(i4) { // from class: com.bytedance.sdk.component.fkw.lh.ouw.vt.vt.1
            @Override // com.bytedance.sdk.component.fkw.lh.ouw.lh
            public final /* bridge */ /* synthetic */ int vt(byte[] bArr) {
                byte[] bArr2 = bArr;
                if (bArr2 == null) {
                    return 0;
                }
                return bArr2.length;
            }
        };
    }

    @Override // com.bytedance.sdk.component.fkw.ouw
    public final /* bridge */ /* synthetic */ byte[] ouw(String str) {
        return this.f7482lh.ouw((com.bytedance.sdk.component.fkw.lh.ouw.lh<String, byte[]>) str);
    }

    @Override // com.bytedance.sdk.component.fkw.ouw
    public final /* synthetic */ boolean vt(String str) {
        return this.f7482lh.ouw((com.bytedance.sdk.component.fkw.lh.ouw.lh<String, byte[]>) str) != null;
    }

    @Override // com.bytedance.sdk.component.fkw.ouw
    public final /* bridge */ /* synthetic */ boolean ouw(String str, byte[] bArr) {
        String str2 = str;
        byte[] bArr2 = bArr;
        if (str2 == null || bArr2 == null) {
            return false;
        }
        this.f7482lh.ouw(str2, bArr2);
        return true;
    }
}

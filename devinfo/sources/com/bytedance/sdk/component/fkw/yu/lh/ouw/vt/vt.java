package com.bytedance.sdk.component.fkw.yu.lh.ouw.vt;

import com.bytedance.sdk.component.fkw.vm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class vt implements vm {

    /* renamed from: lh, reason: collision with root package name */
    private int f7515lh;
    private long ouw = 1048576;
    private int vt;
    private com.bytedance.sdk.component.fkw.yu.lh.ouw.lh<String, byte[]> yu;

    public vt(int i4, int i10) {
        this.f7515lh = i4;
        this.vt = i10;
        this.yu = new com.bytedance.sdk.component.fkw.yu.lh.ouw.lh<>(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.component.fkw.ouw
    public boolean vt(String str) {
        return this.yu.ouw((com.bytedance.sdk.component.fkw.yu.lh.ouw.lh<String, byte[]>) str) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.component.fkw.ouw
    public boolean ouw(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            try {
                if (bArr.length > this.ouw) {
                    return false;
                }
                this.yu.ouw(str, bArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.component.fkw.ouw
    public byte[] ouw(String str) {
        try {
            return this.yu.ouw((com.bytedance.sdk.component.fkw.yu.lh.ouw.lh<String, byte[]>) str);
        } catch (Throwable unused) {
            return null;
        }
    }
}

package com.bytedance.sdk.component.fkw.yu.lh.ouw.vt;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.fkw.zih;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements zih {

    /* renamed from: lh, reason: collision with root package name */
    private int f7514lh;
    private long ouw = 4194304;
    private int vt;
    private com.bytedance.sdk.component.fkw.yu.lh.ouw.lh<String, Bitmap> yu;

    public ouw(int i4, int i10) {
        this.vt = i10;
        this.f7514lh = i4;
        this.yu = new com.bytedance.sdk.component.fkw.yu.lh.ouw.lh<>(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.component.fkw.ouw
    public boolean vt(String str) {
        return this.yu.ouw((com.bytedance.sdk.component.fkw.yu.lh.ouw.lh<String, Bitmap>) str) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.component.fkw.ouw
    public Bitmap ouw(String str) {
        try {
            return this.yu.ouw((com.bytedance.sdk.component.fkw.yu.lh.ouw.lh<String, Bitmap>) str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.component.fkw.ouw
    public boolean ouw(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            try {
                int allocationByteCount = bitmap.getAllocationByteCount();
                if (allocationByteCount <= this.ouw && allocationByteCount != 0) {
                    this.yu.ouw(str, bitmap);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}

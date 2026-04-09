package com.bytedance.sdk.component.fkw.lh.ouw.vt;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.fkw.zih;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements zih {

    /* renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.component.fkw.lh.ouw.lh<String, Bitmap> f7481lh;
    private int ouw = Integer.MAX_VALUE;
    private int vt;

    public ouw(int i4) {
        this.vt = i4;
        this.f7481lh = new com.bytedance.sdk.component.fkw.lh.ouw.lh<String, Bitmap>(i4) { // from class: com.bytedance.sdk.component.fkw.lh.ouw.vt.ouw.1
            @Override // com.bytedance.sdk.component.fkw.lh.ouw.lh
            public final /* synthetic */ int vt(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                if (bitmap2 == null) {
                    return 0;
                }
                return bitmap2.getAllocationByteCount();
            }
        };
    }

    @Override // com.bytedance.sdk.component.fkw.ouw
    public final /* bridge */ /* synthetic */ Bitmap ouw(String str) {
        return this.f7481lh.ouw((com.bytedance.sdk.component.fkw.lh.ouw.lh<String, Bitmap>) str);
    }

    @Override // com.bytedance.sdk.component.fkw.ouw
    public final /* synthetic */ boolean vt(String str) {
        return this.f7481lh.ouw((com.bytedance.sdk.component.fkw.lh.ouw.lh<String, Bitmap>) str) != null;
    }

    @Override // com.bytedance.sdk.component.fkw.ouw
    public final /* bridge */ /* synthetic */ boolean ouw(String str, Bitmap bitmap) {
        String str2 = str;
        Bitmap bitmap2 = bitmap;
        if (str2 == null || bitmap2 == null) {
            return false;
        }
        this.f7481lh.ouw(str2, bitmap2);
        return true;
    }
}

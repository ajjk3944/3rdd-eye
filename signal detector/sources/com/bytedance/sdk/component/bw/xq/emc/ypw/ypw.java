package com.bytedance.sdk.component.bw.xq.emc.ypw;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.bw.aa;

/* loaded from: classes.dex */
public class ypw implements aa {
    private int emc;
    private com.bytedance.sdk.component.bw.xq.emc.xq<String, Bitmap> xq;
    private int ypw;

    public ypw(int i, int i3) {
        this.ypw = i;
        this.emc = i3;
        this.xq = new com.bytedance.sdk.component.bw.xq.emc.xq<String, Bitmap>(i) { // from class: com.bytedance.sdk.component.bw.xq.emc.ypw.ypw.1
            @Override // com.bytedance.sdk.component.bw.xq.emc.xq
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public int ypw(String str, Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return ypw.emc(bitmap);
            }
        };
    }

    @Override // com.bytedance.sdk.component.bw.emc
    public boolean ypw(String str) {
        return this.xq.emc((com.bytedance.sdk.component.bw.xq.emc.xq<String, Bitmap>) str) != null;
    }

    @Override // com.bytedance.sdk.component.bw.emc
    public boolean emc(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.xq.emc(str, bitmap);
        return true;
    }

    @Override // com.bytedance.sdk.component.bw.emc
    public Bitmap emc(String str) {
        return this.xq.emc((com.bytedance.sdk.component.bw.xq.emc.xq<String, Bitmap>) str);
    }

    public static int emc(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}

package com.bytedance.sdk.component.bw.dg.xq.emc.ypw;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.bw.aa;

/* loaded from: classes.dex */
public class emc implements aa {
    private com.bytedance.sdk.component.bw.dg.xq.emc.xq<String, Bitmap> dg;
    private long emc = 4194304;
    private int xq;
    private int ypw;

    public emc(int i10, int i11) {
        this.ypw = i11;
        this.xq = i10;
        this.dg = new com.bytedance.sdk.component.bw.dg.xq.emc.xq<>(i11);
    }

    @Override // com.bytedance.sdk.component.bw.emc
    public boolean ypw(String str) {
        return this.dg.emc((com.bytedance.sdk.component.bw.dg.xq.emc.xq<String, Bitmap>) str) != null;
    }

    @Override // com.bytedance.sdk.component.bw.emc
    public boolean emc(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            try {
                int iEmc = emc(bitmap);
                if (iEmc <= this.emc && iEmc != 0) {
                    this.dg.emc(str, bitmap);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.bw.emc
    public Bitmap emc(String str) {
        try {
            return this.dg.emc((com.bytedance.sdk.component.bw.dg.xq.emc.xq<String, Bitmap>) str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int emc(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}

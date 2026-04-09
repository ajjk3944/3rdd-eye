package com.bytedance.sdk.openadsdk.yzg.emc;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.dg;
import com.bytedance.sdk.component.utils.ul;

/* loaded from: classes.dex */
public class ypw {
    private Bitmap bw;
    private Bitmap dg;
    int emc;
    private byte[] xq;
    private Drawable ypw;

    public ypw(Drawable drawable, int i10) {
        this.xq = null;
        this.dg = null;
        this.bw = null;
        this.ypw = drawable;
        this.emc = i10;
    }

    public boolean bw() {
        if (this.dg != null || this.ypw != null) {
            return true;
        }
        byte[] bArr = this.xq;
        return bArr != null && bArr.length > 0;
    }

    public Drawable dg() {
        return this.ypw;
    }

    public Bitmap emc() {
        return this.dg;
    }

    public byte[] xq() {
        try {
            if (this.xq == null) {
                this.xq = dg.emc(this.dg);
            }
        } catch (OutOfMemoryError e10) {
            ul.xq("GifRequestResult", e10.getMessage());
        }
        return this.xq;
    }

    public Bitmap ypw() {
        return this.bw;
    }

    public ypw(byte[] bArr, int i10) {
        this.ypw = null;
        this.dg = null;
        this.bw = null;
        this.xq = bArr;
        this.emc = i10;
    }

    public ypw(Bitmap bitmap, Bitmap bitmap2, int i10) {
        this.ypw = null;
        this.xq = null;
        this.bw = bitmap2;
        this.dg = bitmap;
        this.emc = i10;
    }
}

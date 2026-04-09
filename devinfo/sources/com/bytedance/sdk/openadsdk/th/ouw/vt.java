package com.bytedance.sdk.openadsdk.th.ouw;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.qbp;
import java.io.ByteArrayOutputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    private byte[] fkw;

    /* renamed from: lh, reason: collision with root package name */
    public Bitmap f8671lh;
    public Drawable ouw;
    public Bitmap vt;
    int yu;

    public vt(Drawable drawable, int i4) {
        this.fkw = null;
        this.vt = null;
        this.f8671lh = null;
        this.ouw = drawable;
        this.yu = i4;
    }

    public final byte[] ouw() {
        try {
            if (this.fkw == null) {
                Bitmap bitmap = this.vt;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmap.getByteCount());
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                this.fkw = byteArrayOutputStream.toByteArray();
            }
        } catch (OutOfMemoryError e2) {
            qbp.lh("GifRequestResult", e2.getMessage());
        }
        return this.fkw;
    }

    public final boolean vt() {
        if (this.vt != null || this.ouw != null) {
            return true;
        }
        byte[] bArr = this.fkw;
        return bArr != null && bArr.length > 0;
    }

    public vt(byte[] bArr, int i4) {
        this.ouw = null;
        this.vt = null;
        this.f8671lh = null;
        this.fkw = bArr;
        this.yu = i4;
    }

    public vt(Bitmap bitmap, Bitmap bitmap2, int i4) {
        this.ouw = null;
        this.fkw = null;
        this.f8671lh = bitmap2;
        this.vt = bitmap;
        this.yu = i4;
    }
}

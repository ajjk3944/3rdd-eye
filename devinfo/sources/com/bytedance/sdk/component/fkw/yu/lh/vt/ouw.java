package com.bytedance.sdk.component.fkw.yu.lh.vt;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.sdk.component.utils.qbp;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.component.fkw.yu.lh.vt.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0052ouw {
        void ouw();

        void ouw(Drawable drawable);

        void vt();
    }

    public static void ouw(byte[] bArr, InterfaceC0052ouw interfaceC0052ouw) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT < 28) {
            interfaceC0052ouw.vt();
            return;
        }
        try {
            interfaceC0052ouw.ouw(ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap)));
        } catch (Throwable th2) {
            qbp.lh("PAGGifDefaultDecoder", th2.getMessage());
            interfaceC0052ouw.ouw();
        }
    }
}

package com.mbridge.msdk.video.module.listener.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.p0;

/* loaded from: classes3.dex */
public class j extends e {

    /* renamed from: d, reason: collision with root package name */
    private int f19186d;

    public j(ImageView imageView, int i10) {
        super(imageView);
        this.f19186d = i10;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.e, com.mbridge.msdk.foundation.same.image.c
    public void onSuccessLoad(Bitmap bitmap, String str) {
        Bitmap bitmapA;
        if (bitmap == null) {
            return;
        }
        try {
            if (this.f19179a == null || bitmap.isRecycled() || (bitmapA = p0.a(bitmap, 1, this.f19186d)) == null) {
                return;
            }
            this.f19179a.setImageBitmap(bitmapA);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }
}

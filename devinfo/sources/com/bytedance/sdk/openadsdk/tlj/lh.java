package com.bytedance.sdk.openadsdk.tlj;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.applovin.shadow.okio.a;
import com.bytedance.sdk.component.fkw.cf;
import com.bytedance.sdk.component.fkw.rn;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.bs;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh implements rn {

    /* renamed from: lh, reason: collision with root package name */
    private rn f8676lh;
    private final WeakReference<ImageView> ouw;
    private final String vt = "ImageLoaderToViewWrapper";

    public lh(ImageView imageView, rn rnVar) {
        this.ouw = new WeakReference<>(imageView);
        this.f8676lh = rnVar;
    }

    public static rn ouw(vpp vppVar, String str, ImageView imageView) {
        return new vt(vppVar, str, new lh(imageView));
    }

    @Override // com.bytedance.sdk.component.fkw.rn
    public final void ouw(cf cfVar) {
        final ImageView imageView = this.ouw.get();
        if (imageView != null) {
            final Object objVt = cfVar.vt();
            if (objVt instanceof Bitmap) {
                if (bs.le()) {
                    imageView.setImageBitmap((Bitmap) objVt);
                } else {
                    jg.lh().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tlj.lh.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            imageView.setImageBitmap((Bitmap) objVt);
                        }
                    });
                }
                rn rnVar = this.f8676lh;
                if (rnVar != null) {
                    rnVar.ouw(cfVar);
                    return;
                }
                return;
            }
            if (objVt instanceof Drawable) {
                if (bs.le()) {
                    ouw(objVt, imageView);
                } else {
                    jg.lh().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tlj.lh.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            lh.ouw(objVt, imageView);
                        }
                    });
                }
            }
        }
    }

    private lh(ImageView imageView) {
        this.ouw = new WeakReference<>(imageView);
    }

    public static void ouw(Object obj, ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 28 && a.i(obj)) {
            a.c(obj).start();
        }
        imageView.setImageDrawable((Drawable) obj);
    }

    @Override // com.bytedance.sdk.component.fkw.rn
    public final void ouw(int i4, String str, Throwable th2) {
        rn rnVar = this.f8676lh;
        if (rnVar != null) {
            rnVar.ouw(i4, str, th2);
        }
    }
}

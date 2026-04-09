package com.bytedance.sdk.openadsdk.ru;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.adsdk.ugeno.zz.dg.a;
import com.bytedance.adsdk.ugeno.zz.dg.b;
import com.bytedance.sdk.component.bw.gbl;
import com.bytedance.sdk.component.bw.vk;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.utils.iyl;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class xq implements vk {
    private final WeakReference<ImageView> emc;
    private vk xq;
    private final String ypw = "ImageLoaderToViewWrapper";

    private xq(ImageView imageView, vk vkVar) {
        this.emc = new WeakReference<>(imageView);
        this.xq = vkVar;
    }

    public static vk emc(rie rieVar, String str, ImageView imageView) {
        return new ypw(rieVar, str, new xq(imageView));
    }

    public static vk emc(rie rieVar, String str, ImageView imageView, vk vkVar) {
        return new ypw(rieVar, str, new xq(imageView, vkVar));
    }

    private xq(ImageView imageView) {
        this.emc = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.bw.vk
    public void emc(gbl gblVar) {
        final ImageView imageView = this.emc.get();
        if (imageView != null) {
            final Object objYpw = gblVar.ypw();
            if (objYpw instanceof Bitmap) {
                if (iyl.ycc()) {
                    imageView.setImageBitmap((Bitmap) objYpw);
                } else {
                    qh.xq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ru.xq.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap((Bitmap) objYpw);
                        }
                    });
                }
                vk vkVar = this.xq;
                if (vkVar != null) {
                    vkVar.emc(gblVar);
                    return;
                }
                return;
            }
            if (objYpw instanceof Drawable) {
                if (iyl.ycc()) {
                    emc(objYpw, imageView);
                } else {
                    qh.xq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ru.xq.2
                        @Override // java.lang.Runnable
                        public void run() {
                            xq.this.emc(objYpw, imageView);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(Object obj, ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 28 && a.a(obj)) {
            b.a(obj).start();
        }
        imageView.setImageDrawable((Drawable) obj);
    }

    @Override // com.bytedance.sdk.component.bw.vk
    public void emc(int i10, String str, @Nullable Throwable th) {
        vk vkVar = this.xq;
        if (vkVar != null) {
            vkVar.emc(i10, str, th);
        }
    }
}

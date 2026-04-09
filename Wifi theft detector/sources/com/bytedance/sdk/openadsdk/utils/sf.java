package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.adsdk.ugeno.zz.dg.a;
import com.bytedance.adsdk.ugeno.zz.dg.b;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class sf implements com.bytedance.sdk.component.bw.vk {
    private final WeakReference<ImageView> emc;

    public sf(ImageView imageView) {
        this.emc = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.bw.vk
    public void emc(com.bytedance.sdk.component.bw.gbl gblVar) {
        ImageView imageView = this.emc.get();
        if (imageView == null) {
            return;
        }
        try {
            Object objYpw = gblVar.ypw();
            if (objYpw instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objYpw);
                return;
            }
            if (!(objYpw instanceof Drawable)) {
                imageView.setVisibility(8);
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && a.a(objYpw)) {
                b.a(objYpw).start();
            }
            imageView.setImageDrawable((Drawable) objYpw);
        } catch (Throwable unused) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.bw.vk
    public void emc(int i10, String str, @Nullable Throwable th) {
        ImageView imageView = this.emc.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}

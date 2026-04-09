package com.bytedance.adsdk.ypw.ypw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.ypw.dg;
import com.bytedance.adsdk.ypw.ru;
import com.bytedance.adsdk.ypw.ycc.ycc;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public class ypw {
    private static final Object emc = new Object();
    private final Map<String, ru> bw;
    private dg dg;
    private final String xq;
    private final Context ypw;

    public ypw(Drawable.Callback callback, String str, dg dgVar, Map<String, ru> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.xq = str;
        } else {
            this.xq = str + '/';
        }
        this.bw = map;
        emc(dgVar);
        if (callback instanceof View) {
            this.ypw = ((View) callback).getContext().getApplicationContext();
        } else {
            this.ypw = null;
        }
    }

    private Bitmap ypw(String str, Bitmap bitmap) {
        synchronized (emc) {
            this.bw.get(str).emc(bitmap);
        }
        return bitmap;
    }

    public void emc(dg dgVar) {
        this.dg = dgVar;
    }

    public Bitmap emc(String str, Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmapGbl = this.bw.get(str).gbl();
            ypw(str, bitmap);
            return bitmapGbl;
        }
        ru ruVar = this.bw.get(str);
        Bitmap bitmapGbl2 = ruVar.gbl();
        ruVar.emc(null);
        return bitmapGbl2;
    }

    public Bitmap emc(String str) {
        ru ruVar = this.bw.get(str);
        if (ruVar == null) {
            return null;
        }
        Bitmap bitmapGbl = ruVar.gbl();
        if (bitmapGbl != null) {
            return bitmapGbl;
        }
        dg dgVar = this.dg;
        if (dgVar != null) {
            return dgVar.emc(ruVar);
        }
        Context context = this.ypw;
        if (context == null) {
            return null;
        }
        String strZz = ruVar.zz();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strZz.startsWith("data:") && strZz.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strZz.substring(strZz.indexOf(44) + 1), 0);
                return ypw(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.xq)) {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.xq + strZz), null, options);
                    if (bitmapDecodeStream == null) {
                        return null;
                    }
                    return ypw(str, ycc.emc(bitmapDecodeStream, ruVar.emc(), ruVar.ypw()));
                } catch (IllegalArgumentException unused2) {
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException unused3) {
            return null;
        }
    }

    public boolean emc(Context context) {
        return (context == null && this.ypw == null) || this.ypw.equals(context);
    }
}

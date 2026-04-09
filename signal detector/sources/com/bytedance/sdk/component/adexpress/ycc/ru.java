package com.bytedance.sdk.component.adexpress.ycc;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public class ru extends com.bytedance.adsdk.ypw.ycc {
    private Map<String, Bitmap> emc;
    private String ypw;

    public static class emc implements com.bytedance.sdk.component.bw.vk {
        private final Map<String, Bitmap> dg;
        private final WeakReference<ru> emc;
        private final String xq;
        private final com.bytedance.adsdk.ypw.ru ypw;

        public emc(ru ruVar, com.bytedance.adsdk.ypw.ru ruVar2, String str, Map<String, Bitmap> map) {
            this.emc = new WeakReference<>(ruVar);
            this.ypw = ruVar2;
            this.xq = str;
            this.dg = map;
        }

        @Override // com.bytedance.sdk.component.bw.vk
        public void emc(int i, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.bw.vk
        public void emc(com.bytedance.sdk.component.bw.gbl gblVar) {
            Object objYpw = gblVar.ypw();
            if (objYpw instanceof Bitmap) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) objYpw, this.ypw.emc(), this.ypw.ypw(), false);
                this.dg.put(this.xq, bitmapCreateScaledBitmap);
                ru ruVar = this.emc.get();
                if (ruVar != null) {
                    ruVar.emc(this.ypw.msw(), bitmapCreateScaledBitmap);
                }
            }
        }
    }

    public ru(Context context) {
        super(context);
        this.emc = new HashMap();
    }

    public void msw() {
        if (TextUtils.isEmpty(this.ypw)) {
            return;
        }
        setProgress(0.0f);
        emc(true);
        setAnimationFromUrl(this.ypw);
        setImageAssetDelegate(new com.bytedance.adsdk.ypw.dg() { // from class: com.bytedance.sdk.component.adexpress.ycc.ru.1
            @Override // com.bytedance.adsdk.ypw.dg
            public Bitmap emc(final com.bytedance.adsdk.ypw.ru ruVar) {
                final String strMsw = ruVar.msw();
                String strRu = ruVar.ru();
                String strZz = ruVar.zz();
                if (TextUtils.equals(strMsw, "image_0") && TextUtils.equals(strZz, "Lark20201123-180048_2.png")) {
                    strZz = "hand.png";
                }
                Bitmap bitmap = (Bitmap) ru.this.emc.get(strMsw);
                if (bitmap != null) {
                    return bitmap;
                }
                if (TextUtils.isEmpty(strRu) || !TextUtils.isEmpty(strZz)) {
                    strRu = (TextUtils.isEmpty(strZz) || !TextUtils.isEmpty(strRu)) ? (TextUtils.isEmpty(strZz) || TextUtils.isEmpty(strRu)) ? "" : AbstractC2763b.e(strRu, strZz) : strZz;
                }
                if (TextUtils.isEmpty(strRu)) {
                    return null;
                }
                com.bytedance.sdk.component.bw.ru ruVarEmc = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().bw().emc(strRu).xq(2).emc(new com.bytedance.sdk.component.bw.msw() { // from class: com.bytedance.sdk.component.adexpress.ycc.ru.1.1
                    @Override // com.bytedance.sdk.component.bw.msw
                    public Bitmap emc(Bitmap bitmap2) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, ruVar.emc(), ruVar.ypw(), false);
                        ru.this.emc.put(strMsw, bitmapCreateScaledBitmap);
                        return bitmapCreateScaledBitmap;
                    }
                });
                ru ruVar2 = ru.this;
                ruVarEmc.emc(new emc(ruVar2, ruVar, strMsw, ruVar2.emc));
                return (Bitmap) ru.this.emc.get(strMsw);
            }
        });
        emc();
    }

    public void setAnimationsLoop(boolean z6) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setImageLottieTosPath(String str) {
        this.ypw = str;
    }

    public void setLottieAdDescMaxLength(int i) {
    }

    public void setLottieAdTitleMaxLength(int i) {
    }

    public void setLottieAppNameMaxLength(int i) {
    }
}

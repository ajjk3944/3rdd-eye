package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import d.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class tlj extends com.bytedance.adsdk.vt.le {

    /* renamed from: lh, reason: collision with root package name */
    private Map<String, Bitmap> f7355lh;
    private String yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw implements com.bytedance.sdk.component.fkw.rn {

        /* renamed from: lh, reason: collision with root package name */
        private final String f7357lh;
        private final WeakReference<tlj> ouw;
        private final com.bytedance.adsdk.vt.tlj vt;
        private final Map<String, Bitmap> yu;

        public ouw(tlj tljVar, com.bytedance.adsdk.vt.tlj tljVar2, String str, Map<String, Bitmap> map) {
            this.ouw = new WeakReference<>(tljVar);
            this.vt = tljVar2;
            this.f7357lh = str;
            this.yu = map;
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(int i4, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
            Object objVt = cfVar.vt();
            if (objVt instanceof Bitmap) {
                com.bytedance.adsdk.vt.tlj tljVar = this.vt;
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) objVt, tljVar.ouw, tljVar.vt, false);
                this.yu.put(this.f7357lh, bitmapCreateScaledBitmap);
                tlj tljVar2 = this.ouw.get();
                if (tljVar2 != null) {
                    tljVar2.ouw(this.vt.f7213lh, bitmapCreateScaledBitmap);
                }
            }
        }
    }

    public tlj(Context context) {
        super(context);
        this.f7355lh = new HashMap();
    }

    public void setImageLottieTosPath(String str) {
        this.yu = str;
    }

    public final void yu() {
        if (TextUtils.isEmpty(this.yu)) {
            return;
        }
        setProgress(0.0f);
        ouw(true);
        setAnimationFromUrl(this.yu);
        setImageAssetDelegate(new com.bytedance.adsdk.vt.yu() { // from class: com.bytedance.sdk.component.adexpress.le.tlj.1
            @Override // com.bytedance.adsdk.vt.yu
            public final Bitmap ouw(final com.bytedance.adsdk.vt.tlj tljVar) {
                final String str = tljVar.f7213lh;
                String strS = tljVar.fkw;
                String str2 = tljVar.yu;
                if (TextUtils.equals(str, "image_0") && TextUtils.equals(str2, "Lark20201123-180048_2.png")) {
                    str2 = "hand.png";
                }
                Bitmap bitmap = (Bitmap) tlj.this.f7355lh.get(str);
                if (bitmap != null) {
                    return bitmap;
                }
                com.bytedance.sdk.component.utils.ko.ouw("DynamicLottieView", "dirName is : ", strS, "fileName is : ", str2);
                if (TextUtils.isEmpty(strS) || !TextUtils.isEmpty(str2)) {
                    strS = (TextUtils.isEmpty(str2) || !TextUtils.isEmpty(strS)) ? (TextUtils.isEmpty(str2) || TextUtils.isEmpty(strS)) ? "" : h.s(strS, str2) : str2;
                }
                if (TextUtils.isEmpty(strS)) {
                    return null;
                }
                com.bytedance.sdk.component.fkw.tlj tljVarOuw = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().yu.ouw(strS).lh(2).ouw(new com.bytedance.sdk.component.fkw.pno() { // from class: com.bytedance.sdk.component.adexpress.le.tlj.1.1
                    @Override // com.bytedance.sdk.component.fkw.pno
                    public final Bitmap ouw(Bitmap bitmap2) {
                        com.bytedance.adsdk.vt.tlj tljVar2 = tljVar;
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, tljVar2.ouw, tljVar2.vt, false);
                        tlj.this.f7355lh.put(str, bitmapCreateScaledBitmap);
                        return bitmapCreateScaledBitmap;
                    }
                });
                tlj tljVar2 = tlj.this;
                tljVarOuw.vt(new ouw(tljVar2, tljVar, str, tljVar2.f7355lh));
                return (Bitmap) tlj.this.f7355lh.get(str);
            }
        });
        ouw();
    }

    public void setAnimationsLoop(boolean z3) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setLottieAdDescMaxLength(int i4) {
    }

    public void setLottieAdTitleMaxLength(int i4) {
    }

    public void setLottieAppNameMaxLength(int i4) {
    }
}

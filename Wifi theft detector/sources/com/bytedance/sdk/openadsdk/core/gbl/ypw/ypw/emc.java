package com.bytedance.sdk.openadsdk.core.gbl.ypw.ypw;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.bw;
import com.bytedance.adsdk.ugeno.emc;
import com.bytedance.adsdk.ugeno.uym.msw;
import com.bytedance.adsdk.ugeno.ypw.xq;
import com.bytedance.adsdk.ypw.dg;
import com.bytedance.adsdk.ypw.ru;
import java.util.HashMap;
import org.json.JSONException;

/* loaded from: classes.dex */
public class emc extends xq<ypw> {
    private int dor;
    protected HashMap<String, Bitmap> dpk;
    protected String emc;
    private boolean etw;
    protected ImageView.ScaleType ge;
    private float gyw;
    protected ImageView.ScaleType hh;
    private float kv;
    private boolean nx;
    private String oa;
    private boolean sg;
    private boolean zhk;

    /* renamed from: com.bytedance.sdk.openadsdk.core.gbl.ypw.ypw.emc$1, reason: invalid class name */
    public class AnonymousClass1 implements dg {
        public AnonymousClass1() {
        }

        @Override // com.bytedance.adsdk.ypw.dg
        public Bitmap emc(final ru ruVar) {
            final String strEmc;
            if (ruVar == null) {
                return null;
            }
            String strRu = ruVar.ru();
            String strZz = ruVar.zz();
            if (!TextUtils.isEmpty(strRu) && TextUtils.isEmpty(strZz)) {
                strEmc = com.bytedance.adsdk.ugeno.xq.ypw.emc(strRu, ((xq) emc.this).dg);
            } else if (!TextUtils.isEmpty(strZz) && TextUtils.isEmpty(strRu)) {
                strEmc = com.bytedance.adsdk.ugeno.xq.ypw.emc(strZz, ((xq) emc.this).dg);
            } else if (TextUtils.isEmpty(strZz) || TextUtils.isEmpty(strRu)) {
                strEmc = null;
            } else {
                strEmc = com.bytedance.adsdk.ugeno.xq.ypw.emc(strRu, ((xq) emc.this).dg) + com.bytedance.adsdk.ugeno.xq.ypw.emc(strZz, ((xq) emc.this).dg);
            }
            if (TextUtils.isEmpty(strEmc)) {
                return null;
            }
            Bitmap bitmap = emc.this.dpk.get(strEmc);
            if (bitmap != null) {
                return bitmap;
            }
            bw.emc().ypw().emc(((xq) emc.this).zz, strEmc, new emc.InterfaceC0094emc() { // from class: com.bytedance.sdk.openadsdk.core.gbl.ypw.ypw.emc.1.1
                @Override // com.bytedance.adsdk.ugeno.emc.InterfaceC0094emc
                public void emc(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        final Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, ruVar.emc(), ruVar.ypw(), false);
                        emc.this.dpk.put(strEmc, bitmapCreateScaledBitmap);
                        msw.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gbl.ypw.ypw.emc.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((ypw) ((xq) emc.this).bw).emc(ruVar.msw(), bitmapCreateScaledBitmap);
                            }
                        });
                    }
                }
            });
            return emc.this.dpk.get(strEmc);
        }
    }

    public emc(Context context) {
        super(context);
        this.oa = "images";
        this.etw = true;
        this.gyw = 1.0f;
        this.hh = ImageView.ScaleType.FIT_CENTER;
        this.ge = ImageView.ScaleType.FIT_XY;
        this.dpk = new HashMap<>();
    }

    private ImageView.ScaleType cf(String str) {
        ImageView.ScaleType scaleType;
        scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        switch (str) {
            case "center":
                return ImageView.ScaleType.CENTER;
            case "fitEnd":
                return ImageView.ScaleType.FIT_END;
            case "fitStart":
                return ImageView.ScaleType.FIT_START;
            case "centerInside":
                return ImageView.ScaleType.CENTER_INSIDE;
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private String qh(String str) {
        return (!TextUtils.isEmpty(str) && str.contains("local")) ? str.contains("shake_phone") ? "lottie_json/shake_phone.json" : str.contains("swipe_right") ? "lottie_json/swipe_right.json" : "" : "";
    }

    private ImageView.ScaleType vk(String str) {
        ImageView.ScaleType scaleType;
        scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        switch (str) {
            case "center":
            case "none":
                return ImageView.ScaleType.CENTER;
            case "fit":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    public void dg() {
        T t10 = this.bw;
        if (t10 != 0) {
            ((ypw) t10).emc();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    /* renamed from: xq, reason: merged with bridge method [inline-methods] */
    public ypw emc() {
        ypw ypwVar = new ypw(this.ypw);
        ypwVar.emc(this);
        return ypwVar;
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void ypw() throws JSONException {
        super.ypw();
        ((ypw) this.bw).setProgress(this.kv);
        if (this.gyw <= 0.0f) {
            this.gyw = 1.0f;
        }
        ((ypw) this.bw).setSpeed(this.gyw);
        if (this.emc.startsWith("local")) {
            ((ypw) this.bw).setAnimation(qh(this.emc));
            ((ypw) this.bw).setImageAssetsFolder(this.oa);
        } else {
            ((ypw) this.bw).setAnimationFromUrl(this.emc);
        }
        ((ypw) this.bw).setImageAssetDelegate(new AnonymousClass1());
        if (lt()) {
            ((ypw) this.bw).setScaleType(this.ge);
        } else {
            ((ypw) this.bw).setScaleType(this.hh);
        }
        if (lt()) {
            ((ypw) this.bw).setRepeatCount(this.dor);
        } else {
            ((ypw) this.bw).emc(this.zhk);
        }
        if (!lt()) {
            T t10 = this.bw;
            if (t10 != 0) {
                ((ypw) t10).emc();
                return;
            }
            return;
        }
        T t11 = this.bw;
        if (t11 == 0 || !this.etw) {
            return;
        }
        ((ypw) t11).emc();
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void emc(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.emc(str, str2);
        str.getClass();
        switch (str) {
            case "scaleMode":
                this.ge = vk(str2);
                break;
            case "scaleType":
                this.hh = cf(str2);
                break;
            case "progress":
                this.kv = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f);
                break;
            case "imagePath":
                this.oa = str2;
                break;
            case "autoReverse":
                this.nx = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, false);
                break;
            case "src":
                this.emc = com.bytedance.sdk.openadsdk.core.gbl.dg.emc(str2);
                break;
            case "loop":
                if (lt()) {
                    this.dor = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0);
                    break;
                } else {
                    this.zhk = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, false);
                    break;
                }
            case "speed":
                this.gyw = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 1.0f);
                break;
            case "autoPlay":
                this.sg = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, false);
                break;
            case "autoplay":
                this.etw = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, true);
                break;
        }
    }

    public void emc(AnimatorListenerAdapter animatorListenerAdapter) {
        ((ypw) this.bw).emc(animatorListenerAdapter);
    }
}

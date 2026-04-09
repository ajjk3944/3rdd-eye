package com.bytedance.adsdk.ugeno.zz.xq;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.zz.dg.xq;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class emc extends xq {
    private int oa;

    public emc(Context context) {
        super(context);
        this.oa = -16777216;
    }

    private String vk(String str) {
        String strQh = qh(str);
        return TextUtils.isEmpty(strQh) ? "" : "local://".concat(String.valueOf(strQh));
    }

    @Override // com.bytedance.adsdk.ugeno.zz.dg.xq, com.bytedance.adsdk.ugeno.ypw.xq
    public void emc(String str, String str2) {
        super.emc(str, str2);
        str.getClass();
        if (str.equals("textColor")) {
            this.oa = com.bytedance.adsdk.ugeno.uym.emc.emc(str2);
        }
    }

    public abstract String qh(String str);

    @Override // com.bytedance.adsdk.ugeno.zz.dg.xq
    public String xq() {
        return "drawable";
    }

    @Override // com.bytedance.adsdk.ugeno.zz.dg.xq, com.bytedance.adsdk.ugeno.ypw.xq
    public void ypw() throws JSONException, NumberFormatException {
        ((xq) this).emc = vk(((xq) this).emc);
        super.ypw();
        ((com.bytedance.adsdk.ugeno.zz.dg.emc) this.bw).setColorFilter(this.oa);
        ((com.bytedance.adsdk.ugeno.zz.dg.emc) this.bw).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }
}

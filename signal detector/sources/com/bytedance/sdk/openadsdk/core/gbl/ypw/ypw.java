package com.bytedance.sdk.openadsdk.core.gbl.ypw;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;

/* loaded from: classes.dex */
public class ypw extends com.bytedance.adsdk.ugeno.zz.ycc.ypw {
    private String ge;
    private String hh;

    public ypw(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.zz.ycc.ypw, com.bytedance.adsdk.ugeno.ypw.xq
    public void emc(String str, String str2) {
        super.emc(str, str2);
        str.getClass();
        if (str.equals("before")) {
            this.hh = str2;
        } else if (str.equals("after")) {
            this.ge = str2;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zz.ycc.ypw
    public void qh(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "null")) {
            str = "";
        }
        if (TextUtils.isEmpty(this.ge) || TextUtils.equals(this.ge, "null")) {
            this.ge = "";
        }
        if (TextUtils.isEmpty(this.hh) || TextUtils.equals(this.hh, "null")) {
            this.hh = "";
        }
        String str2 = this.hh + str + this.ge;
        ((com.bytedance.adsdk.ugeno.zz.ycc.ypw) this).emc = str2;
        ((com.bytedance.adsdk.ugeno.zz.ycc.emc) this.bw).setText(str2);
        try {
            float f2 = this.cuf ? this.sb : this.db;
            float f5 = this.rtt ? this.sf : this.db;
            float fMeasureText = ((com.bytedance.adsdk.ugeno.zz.ycc.emc) this.bw).getPaint().measureText(((com.bytedance.adsdk.ugeno.zz.ycc.ypw) this).emc);
            if (fMeasureText >= 0.0f) {
                bw((int) (f2 + fMeasureText + f5));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zz.ycc.ypw, com.bytedance.adsdk.ugeno.ypw.xq
    public void ypw() throws JSONException {
        super.ypw();
        if (TextUtils.isEmpty(this.ge) || TextUtils.equals(this.ge, "null")) {
            this.ge = "";
        }
        if (TextUtils.isEmpty(this.hh) || TextUtils.equals(this.hh, "null")) {
            this.hh = "";
        }
        String str = this.hh + this.ge;
        ((com.bytedance.adsdk.ugeno.zz.ycc.ypw) this).emc = str;
        ((com.bytedance.adsdk.ugeno.zz.ycc.emc) this.bw).setText(str);
        ((com.bytedance.adsdk.ugeno.zz.ycc.emc) this.bw).setGravity(17);
    }
}

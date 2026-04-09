package com.bytedance.sdk.openadsdk.core.cf.vt;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends com.bytedance.adsdk.ugeno.bly.le.vt {
    private String qni;
    private String smu;

    public vt(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.bly.le.vt, com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(String str, String str2) {
        super.ouw(str, str2);
        str.getClass();
        if (str.equals("before")) {
            this.qni = str2;
        } else if (str.equals("after")) {
            this.smu = str2;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bly.le.vt
    public final void ryl(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "null")) {
            str = "";
        }
        if (TextUtils.isEmpty(this.smu) || TextUtils.equals(this.smu, "null")) {
            this.smu = "";
        }
        if (TextUtils.isEmpty(this.qni) || TextUtils.equals(this.qni, "null")) {
            this.qni = "";
        }
        String str2 = this.qni + str + this.smu;
        ((com.bytedance.adsdk.ugeno.bly.le.vt) this).ouw = str2;
        ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setText(str2);
        try {
            float f10 = this.fvf ? this.jae : this.ksc;
            float f11 = this.bs ? this.f6966od : this.ksc;
            float fMeasureText = ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).getPaint().measureText(((com.bytedance.adsdk.ugeno.bly.le.vt) this).ouw);
            if (fMeasureText >= 0.0f) {
                yu((int) (f10 + fMeasureText + f11));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bly.le.vt, com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() throws JSONException {
        super.vt();
        if (TextUtils.isEmpty(this.smu) || TextUtils.equals(this.smu, "null")) {
            this.smu = "";
        }
        if (TextUtils.isEmpty(this.qni) || TextUtils.equals(this.qni, "null")) {
            this.qni = "";
        }
        String str = this.qni + this.smu;
        ((com.bytedance.adsdk.ugeno.bly.le.vt) this).ouw = str;
        ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setText(str);
        ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setGravity(17);
    }
}

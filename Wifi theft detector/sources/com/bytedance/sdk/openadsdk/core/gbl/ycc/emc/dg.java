package com.bytedance.sdk.openadsdk.core.gbl.ycc.emc;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.gbl.ycc.emc.ypw;
import com.bytedance.sdk.openadsdk.core.gbl.ycc.uym;
import com.bytedance.sdk.openadsdk.core.model.cuf;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.zz.hxp;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg extends uym {
    private static Boolean db;
    private final ypw ee;

    public dg(Context context, rie rieVar, boolean z10, com.bytedance.sdk.openadsdk.core.gbl.ycc.emc emcVar, ViewGroup viewGroup, float f10, float f11, boolean z11, String str) throws JSONException {
        super(context, rieVar, z10, emcVar, viewGroup);
        this.ee = ypw.emc.emc(rieVar, emcVar);
        this.sra = str;
        emc(f10, f11, z11, rieVar, str);
    }

    private void emc(float f10, float f11, boolean z10, rie rieVar, String str) throws JSONException {
        JSONObject jSONObjectEmc = com.bytedance.sdk.openadsdk.core.zz.emc.ypw.emc(f10, f11, z10, rieVar, str);
        this.hxp = jSONObjectEmc;
        if (jSONObjectEmc == null) {
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObjectEmc.optJSONObject("xSize");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.put("imageModeRatio", sup());
            }
            JSONObject jSONObjectOptJSONObject2 = this.hxp.optJSONObject("xAdInfo");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.put("isVideoImageMode", rie.bw(this.bw));
                jSONObjectOptJSONObject2.put("feed_draw_purePlayable", sz());
                jSONObjectOptJSONObject2.put("isFeedDraw", qh());
            }
            ypw ypwVar = this.ee;
            if (ypwVar != null) {
                ypwVar.emc(this.hxp);
            }
        } catch (Exception unused) {
        }
    }

    private boolean qh() {
        rie rieVar = this.bw;
        if (rieVar == null) {
            return false;
        }
        int iBlf = rieVar.blf();
        boolean z10 = iBlf == 7 || iBlf == 8;
        int iFu = this.bw.fu();
        return z10 && (iFu == 43 || iFu == 44);
    }

    private boolean sz() {
        return this.bw != null && qh() && dr.xq(this.bw);
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.ycc.uym, com.bytedance.sdk.openadsdk.core.gbl.ycc.dg
    public com.bytedance.adsdk.ugeno.ypw.xq msw() {
        com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar = this.xq;
        if (xqVar == null) {
            return null;
        }
        return xqVar.uym("VideoV3");
    }

    public float sup() {
        rie rieVar = this.bw;
        if (rieVar == null) {
            return 1.0f;
        }
        int iIn = rieVar.in();
        if (iIn == 3) {
            return 1.91f;
        }
        if (iIn == 5) {
            return 1.78f;
        }
        if (iIn == 15 || iIn == 173) {
            return 0.5625f;
        }
        if (iIn != 33 && iIn != 50) {
            if (iIn == 1010) {
                return 1.2f;
            }
            if (iIn == 1011) {
                return 6.4f;
            }
            if (iIn == 1012) {
                return 3.2f;
            }
        }
        return 1.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.ycc.dg, com.bytedance.sdk.component.adexpress.ypw.dg
    public int xq() {
        return 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.ycc.uym, com.bytedance.sdk.openadsdk.core.gbl.ycc.dg
    public JSONObject emc() {
        ypw ypwVar = this.ee;
        if (ypwVar != null) {
            try {
                return new JSONObject(ypwVar.emc());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.ycc.uym
    public JSONObject emc(cuf cufVar) {
        ypw ypwVar = this.ee;
        if (ypwVar != null) {
            return ypwVar.ypw();
        }
        return null;
    }

    public static boolean emc(String str) {
        if (db == null) {
            db = Boolean.valueOf(com.bytedance.sdk.openadsdk.sra.emc.emc("express_backup_type", 0) == 1);
        }
        return db.booleanValue() && (TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video") || hxp.ypw(str));
    }
}

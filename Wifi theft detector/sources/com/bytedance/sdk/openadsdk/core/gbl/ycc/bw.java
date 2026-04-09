package com.bytedance.sdk.openadsdk.core.gbl.ycc;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.sz;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sba;
import com.bytedance.sdk.openadsdk.utils.tp;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bw {
    private com.bytedance.adsdk.ugeno.ypw.xq bw;
    private boolean cf;
    private com.bytedance.adsdk.ugeno.ypw.xq dg;
    private JSONObject gbl;
    private final rie msw;
    private boolean qh;
    private com.bytedance.sdk.openadsdk.core.widget.bw ru;
    private final JSONObject sup;
    private boolean sz;
    private final Context uym;
    private JSONArray vk;
    private com.bytedance.adsdk.ugeno.ypw.xq xq;
    private final String zz;
    private int emc = -1;
    private int ypw = -1;
    private final String ycc = "UGenSwiperEvent";

    public bw(Context context, rie rieVar, String str, JSONObject jSONObject) {
        this.uym = context;
        this.msw = rieVar;
        this.zz = str;
        this.sup = jSONObject;
    }

    public JSONObject dg() {
        return this.gbl;
    }

    public void xq() {
        int i10;
        com.bytedance.adsdk.ugeno.ypw.xq xqVar = this.bw;
        if (!(xqVar instanceof com.bytedance.adsdk.ugeno.xq) || (i10 = this.emc) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.xq) xqVar).emc(i10 + 1);
    }

    public void ypw() {
        int i10;
        com.bytedance.adsdk.ugeno.ypw.xq xqVar = this.bw;
        if (!(xqVar instanceof com.bytedance.adsdk.ugeno.xq) || (i10 = this.emc) == -1) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.xq) xqVar).emc(i10 - 1);
    }

    public void emc(com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar) {
        com.bytedance.adsdk.ugeno.ypw.xq<T> xqVarBw = xqVar.bw("swiperLayout");
        this.bw = xqVarBw;
        if (xqVarBw instanceof com.bytedance.adsdk.ugeno.xq) {
            this.vk = this.sup.optJSONArray("dpa_data");
            this.xq = xqVar.bw("swiperLeftArrow");
            this.dg = xqVar.bw("swiperRightArrow");
            ((com.bytedance.adsdk.ugeno.xq) this.bw).emc(new com.bytedance.adsdk.ugeno.ycc.xq() { // from class: com.bytedance.sdk.openadsdk.core.gbl.ycc.bw.1
                @Override // com.bytedance.adsdk.ugeno.ycc.xq
                public void emc(boolean z10, int i10) {
                }

                @Override // com.bytedance.adsdk.ugeno.ycc.xq
                public void emc(boolean z10, int i10, float f10, int i11) {
                }

                @Override // com.bytedance.adsdk.ugeno.ycc.xq
                public void emc(boolean z10, int i10, int i11, boolean z11, boolean z12) {
                    bw.this.ypw = i10;
                    bw.this.emc = i11;
                    bw.this.sz = z10;
                    bw.this.qh = z11;
                    bw.this.cf = z12;
                    bw.this.emc(z10, z11, z12);
                    bw.this.emc(i10);
                }
            });
        }
    }

    public void emc() {
        emc(this.sz, this.qh, this.cf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(boolean z10, boolean z11, boolean z12) {
        com.bytedance.adsdk.ugeno.ypw.xq xqVar = this.xq;
        if (xqVar == null || this.dg == null) {
            return;
        }
        View viewGbl = xqVar.gbl();
        View viewGbl2 = this.dg.gbl();
        JSONArray jSONArray = this.vk;
        if (jSONArray != null && jSONArray.length() == 1) {
            viewGbl.setVisibility(8);
            viewGbl2.setVisibility(8);
            return;
        }
        if (z10) {
            return;
        }
        if (z11) {
            if (viewGbl instanceof TextView) {
                emc((TextView) viewGbl, 90);
            }
            if (viewGbl2 instanceof TextView) {
                emc((TextView) viewGbl2, 255);
                return;
            }
            return;
        }
        if (z12) {
            if (viewGbl instanceof TextView) {
                emc((TextView) viewGbl, 255);
            }
            if (viewGbl2 instanceof TextView) {
                emc((TextView) viewGbl2, 90);
                return;
            }
            return;
        }
        if (viewGbl instanceof TextView) {
            emc((TextView) viewGbl, 255);
        }
        if (viewGbl2 instanceof TextView) {
            emc((TextView) viewGbl2, 255);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("index", i10);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.msw, this.zz, "carousel_show", jSONObject);
    }

    private void emc(TextView textView, int i10) {
        int currentTextColor = textView.getCurrentTextColor();
        textView.setTextColor(Color.argb(i10, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor)));
    }

    public void emc(com.bytedance.sdk.openadsdk.core.widget.bw bwVar) {
        this.ru = bwVar;
    }

    public boolean emc(sz szVar) {
        JSONObject jSONObjectOptJSONObject;
        this.gbl = null;
        int i10 = this.ypw;
        if (i10 != -1 && i10 != 0) {
            try {
                JSONObject jSONObjectXq = szVar.xq();
                if (jSONObjectXq != null && (jSONObjectOptJSONObject = jSONObjectXq.optJSONObject("related_dpa_click")) != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enableOpenExternalUrl");
                    int iOptInt = jSONObjectOptJSONObject.optInt("landingStyle");
                    if (zOptBoolean && iOptInt != -1) {
                        if (this.vk != null) {
                            String strEmc = com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObjectOptJSONObject.optString("url"), this.vk.optJSONObject(this.ypw));
                            String strEmc2 = com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObjectOptJSONObject.optString("fallback_url"), this.vk.optJSONObject(this.ypw));
                            jSONObjectOptJSONObject.put("url", strEmc);
                            jSONObjectOptJSONObject.put("fallback_url", strEmc2);
                            emc(jSONObjectOptJSONObject, this.vk.optJSONObject(this.ypw));
                        }
                        emc(jSONObjectOptJSONObject, szVar.emc().gbl());
                        return true;
                    }
                    return false;
                }
            } catch (Throwable th) {
                ul.xq("UGenSwiperEvent", th.getMessage());
            }
        }
        return false;
    }

    private void emc(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("clickInfo");
        this.gbl = jSONObjectOptJSONObject;
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    this.gbl.putOpt(next, com.bytedance.adsdk.ugeno.xq.ypw.emc((String) this.gbl.opt(next), jSONObject2));
                } catch (Throwable unused) {
                }
            }
            try {
                jSONObject.putOpt("clickInfo", this.gbl);
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean emc(int r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == r1) goto L1f
            r2 = 2
            if (r4 == r2) goto Lb
            r6 = 3
            if (r4 == r6) goto L1f
            goto L26
        Lb:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 == 0) goto L18
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto L18
            return r0
        L18:
            boolean r4 = com.bytedance.sdk.component.utils.sba.emc(r6)
            if (r4 != 0) goto L26
            return r0
        L1f:
            boolean r4 = com.bytedance.sdk.component.utils.sba.emc(r5)
            if (r4 != 0) goto L26
            return r0
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.gbl.ycc.bw.emc(int, java.lang.String, java.lang.String):boolean");
    }

    private void emc(JSONObject jSONObject, View view) {
        if (emc(jSONObject.optInt("landingStyle"), jSONObject.optString("url"), jSONObject.optString("fallback_url"))) {
            sba.emc(emc(view), this.uym instanceof Activity, jSONObject, this.msw, this.zz, tp.emc(this.zz), null, this.ru);
        }
    }

    private Context emc(View view) {
        Activity activityEmc = view != null ? com.bytedance.sdk.component.utils.ypw.emc(view) : null;
        return activityEmc == null ? this.uym : activityEmc;
    }
}

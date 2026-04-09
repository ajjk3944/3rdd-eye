package com.bytedance.sdk.openadsdk.core.gbl.dg;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.sz;
import com.bytedance.adsdk.ugeno.core.vk;
import com.bytedance.adsdk.ugeno.ypw.xq;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.gbl.dg.emc;
import com.bytedance.sdk.openadsdk.core.gbl.emc.ypw;
import com.bytedance.sdk.openadsdk.core.iyl;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.ul.emc.emc.dg;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw implements vk, emc.InterfaceC0141emc {
    protected static int emc = 8;

    /* renamed from: aa, reason: collision with root package name */
    private float f9282aa;
    private final com.bytedance.sdk.openadsdk.core.gbl.msw.emc bw;
    private float cf;
    private final rie dg;
    private com.bytedance.sdk.openadsdk.core.gbl.uym.emc gbl;
    private String msw;
    private float qh;
    private final com.bytedance.sdk.openadsdk.core.gbl.uym.ypw ru;
    private long sba;
    private String sup;
    private View sz;
    private boolean ul = true;
    private String uym;
    private float vk;
    private final Activity xq;
    private String ycc;
    private emc ypw;
    private long yzg;
    private JSONObject zz;

    public ypw(Activity activity, rie rieVar, com.bytedance.sdk.openadsdk.core.gbl.msw.emc emcVar, String str, com.bytedance.sdk.openadsdk.core.gbl.uym.ypw ypwVar) {
        this.xq = activity;
        this.sup = str;
        this.dg = rieVar;
        this.ru = ypwVar;
        this.bw = emcVar;
    }

    private void ypw() {
        int iSx = this.dg.sx();
        if (iSx != 2 && iSx != 3) {
            if (iSx == 4) {
                dg.emc(this.xq, this.sup).emc(this.dg);
                return;
            } else {
                if (iSx != 5) {
                    return;
                }
                tp.ypw(this.xq, this.dg.dm());
                return;
            }
        }
        if (iSx == 3) {
            String strXst = this.dg.xst();
            if (!TextUtils.isEmpty(strXst) && strXst.contains("play.google.com/store")) {
                if (com.bytedance.sdk.openadsdk.ul.emc.emc.ypw.emc(this.xq, strXst, strXst.substring(strXst.indexOf("?id=") + 4), this.sup, this.dg)) {
                    return;
                }
            }
        }
        Activity activity = this.xq;
        rie rieVar = this.dg;
        int iEmc = tp.emc(this.sup);
        String str = this.sup;
        iyl.emc(activity, rieVar, iEmc, null, null, str, dg.emc(this.xq, str), true, 0);
    }

    public void emc() {
        if (this.dg == null) {
            this.ru.emc(1, "material is null", "net");
            return;
        }
        if (this.bw == null) {
            this.ru.emc(1, "material ugen template is null", "net");
            return;
        }
        this.ypw = new emc(this.xq);
        this.msw = this.bw.xq();
        this.ycc = this.bw.emc();
        this.uym = this.bw.ypw();
        this.zz = this.dg.uie();
        this.ru.emc(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
        com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.emc().emc(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.msw, this.ycc, this.uym, "", new ypw.emc() { // from class: com.bytedance.sdk.openadsdk.core.gbl.dg.ypw.1
            @Override // com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.emc
            public void emc(JSONObject jSONObject, String str) throws JSONException {
                ypw ypwVar = ypw.this;
                ypwVar.emc(jSONObject, ypwVar.zz);
                ypw.this.ru.ypw(str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.emc
            public void emc(int i10, String str, String str2) {
                ypw.this.ru.emc(i10, str, str2);
            }
        });
    }

    public void emc(View view) {
        this.sz = view;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.gbl.uym.emc emcVar) {
        this.gbl = emcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        this.ypw.emc((emc.InterfaceC0141emc) this);
        this.ypw.emc((vk) this);
        this.ru.emc();
        this.ypw.emc(jSONObject, jSONObject2, new com.bytedance.sdk.openadsdk.core.gbl.uym.dg() { // from class: com.bytedance.sdk.openadsdk.core.gbl.dg.ypw.2
            @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.dg
            public void emc(int i10, String str) {
                if (ypw.this.ru != null) {
                    ypw.this.ru.emc(i10, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.dg
            public void emc(xq<View> xqVar) {
                if (ypw.this.ru != null) {
                    ypw.this.ru.emc(xqVar);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.dg.emc.InterfaceC0141emc
    public void emc(sz szVar) throws JSONException {
        String strOptString = szVar.xq().optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
        strOptString.getClass();
        switch (strOptString) {
            case "privacy":
                if (this.xq != null && !TextUtils.isEmpty(aa.dg().xxg())) {
                    TTWebsiteActivity.emc(this.xq, this.dg, this.sup);
                    break;
                }
                break;
            case "close":
                com.bytedance.sdk.openadsdk.core.gbl.uym.emc emcVar = this.gbl;
                if (emcVar != null) {
                    emcVar.ypw();
                    break;
                }
                break;
            case "creative":
                if (this.xq != null && this.dg != null) {
                    ypw();
                    ComponentCallbacks2 componentCallbacks2 = this.xq;
                    if (componentCallbacks2 instanceof com.bytedance.sdk.openadsdk.core.sz.dg.ypw) {
                        ((com.bytedance.sdk.openadsdk.core.sz.dg.ypw) componentCallbacks2).hj();
                    }
                    emc(szVar, this.dg);
                    break;
                }
                break;
        }
    }

    private void emc(sz szVar, rie rieVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("down_x", this.qh);
            jSONObject.put("down_y", this.cf);
            jSONObject.put("down_time", this.sba);
            jSONObject.put("up_x", this.vk);
            jSONObject.put("up_y", this.f9282aa);
            jSONObject.put("up_time", this.yzg);
            View viewGbl = szVar.emc().gbl();
            int i10 = 1;
            if (viewGbl != null) {
                JSONObject jSONObject2 = new JSONObject();
                int[] iArr = new int[2];
                float width = viewGbl.getWidth();
                float height = viewGbl.getHeight();
                viewGbl.getLocationOnScreen(iArr);
                float f10 = iArr[0];
                float f11 = iArr[1];
                jSONObject2.put("width", width);
                jSONObject2.put("height", height);
                jSONObject2.put(TtmlNode.LEFT, f10);
                jSONObject2.put("top", f11);
                jSONObject.put("rectInfo", jSONObject2);
            }
            View view = this.sz;
            if (view != null) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                jSONObject.put("button_x", iArr2[0]);
                jSONObject.put("button_y", iArr2[1]);
                jSONObject.put("button_width", this.sz.getWidth());
                jSONObject.put("button_height", this.sz.getHeight());
            }
            View viewFindViewById = this.xq.findViewById(R.id.content);
            if (viewFindViewById != null) {
                int[] iArr3 = new int[2];
                viewFindViewById.getLocationOnScreen(iArr3);
                jSONObject.put("ad_x", iArr3[0]);
                jSONObject.put("ad_y", iArr3[1]);
                jSONObject.put("width", viewFindViewById.getWidth());
                jSONObject.put("height", viewFindViewById.getHeight());
            }
            jSONObject.put("click_area_type", szVar.emc().mkp());
            jSONObject.put("brick_id", szVar.emc().rtt());
            jSONObject.put("endcard_id", this.ycc);
            jSONObject.put("click_scence", 2);
            if (!this.ul) {
                i10 = 2;
            }
            jSONObject.put("user_behavior_type", i10);
            com.bytedance.sdk.openadsdk.core.gbl.uym.emc emcVar = this.gbl;
            if (emcVar != null) {
                jSONObject.put("endcard_type", emcVar.emc());
            }
            com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, this.sup, CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.vk
    public void emc(xq xqVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.sba = System.currentTimeMillis();
            this.qh = motionEvent.getRawX();
            this.cf = motionEvent.getRawY();
            this.ul = true;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (Math.abs(motionEvent.getRawX() - this.qh) >= emc || Math.abs(motionEvent.getRawY() - this.cf) >= emc) {
                this.ul = false;
                return;
            }
            return;
        }
        this.vk = motionEvent.getRawX();
        this.f9282aa = motionEvent.getRawY();
        if (Math.abs(this.vk - this.qh) >= emc || Math.abs(this.f9282aa - this.cf) >= emc) {
            this.ul = false;
        }
        this.yzg = System.currentTimeMillis();
    }
}

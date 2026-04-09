package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.db;
import com.bytedance.sdk.openadsdk.core.gbl.xq.dg;
import com.bytedance.sdk.openadsdk.core.iyl;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.bytedance.sdk.openadsdk.utils.tp;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sba implements db, dg.emc, com.bytedance.sdk.openadsdk.core.gbl.xq.emc, com.bytedance.sdk.openadsdk.core.zz.cf {
    private final com.bytedance.sdk.openadsdk.core.xq.emc bw;
    private final com.bytedance.sdk.openadsdk.core.ycc.xq dg;
    private final com.bytedance.sdk.openadsdk.component.reward.emc.emc emc;
    private boolean gbl;
    private int msw;
    private boolean ru;
    private final com.bytedance.sdk.openadsdk.core.gbl.xq.ypw xq;
    private rtt ycc;
    private final emc ypw;
    private int uym = 0;
    private int zz = 1;

    public interface emc {
        void bw();

        int dg();

        void emc();

        void xq();

        void ycc();

        void ypw();
    }

    public sba(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar, emc emcVar2) {
        this.emc = emcVar;
        this.ypw = emcVar2;
        this.dg = new com.bytedance.sdk.openadsdk.core.ycc.xq(emcVar.mxo) { // from class: com.bytedance.sdk.openadsdk.core.widget.sba.1
            @Override // android.view.View
            public void onWindowFocusChanged(boolean z10) {
                super.onWindowFocusChanged(z10);
                sba.this.emc(z10);
            }
        };
        com.bytedance.sdk.openadsdk.core.gbl.xq.ypw ypwVar = new com.bytedance.sdk.openadsdk.core.gbl.xq.ypw(emcVar.vw, emcVar.ypw, true);
        this.xq = ypwVar;
        ypwVar.emc((com.bytedance.sdk.openadsdk.core.zz.cf) this);
        ypwVar.emc((com.bytedance.sdk.openadsdk.core.gbl.xq.emc) this);
        com.bytedance.sdk.openadsdk.core.gbl.xq.xq xqVarEmc = ypwVar.emc();
        if (xqVarEmc instanceof com.bytedance.sdk.openadsdk.core.gbl.xq.dg) {
            com.bytedance.sdk.openadsdk.core.gbl.xq.dg dgVar = (com.bytedance.sdk.openadsdk.core.gbl.xq.dg) xqVarEmc;
            dgVar.emc((dg.emc) this);
            rtt rttVarBw = dgVar.bw();
            this.ycc = rttVarBw;
            if (rttVarBw != null) {
                rttVarBw.emc((db) this);
                this.ycc.ypw(emcVar.ypw.bw());
            }
        }
        Context context = emcVar.vw;
        rie rieVar = emcVar.ypw;
        com.bytedance.sdk.openadsdk.core.xq.emc emcVar3 = new com.bytedance.sdk.openadsdk.core.xq.emc(context, rieVar, rieVar.bw(), tp.ypw(emcVar.ypw));
        this.bw = emcVar3;
        emcVar3.emc(com.bytedance.sdk.openadsdk.ul.emc.emc.dg.emc(com.bytedance.sdk.openadsdk.core.aa.emc(), emcVar.ypw.bw()));
        HashMap map = new HashMap();
        if (dr.ypw(emcVar.ypw)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 2);
        }
        emcVar3.emc(map);
    }

    private boolean gbl() {
        return this.dg.isAttachedToWindow() && this.dg.getVisibility() == 0;
    }

    private void ru() throws JSONException {
        this.uym++;
        emc emcVar = this.ypw;
        if (emcVar != null) {
            emcVar.xq();
        }
        emc(true);
        rtt rttVar = this.ycc;
        if (rttVar != null) {
            rttVar.emc("popupDidShow", (JSONObject) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            emc emcVar2 = this.ypw;
            if (emcVar2 != null) {
                jSONObject2.put("click_countdown_remaining", Math.max(emcVar2.dg(), 0));
            }
            jSONObject2.put("popup_sequence", this.uym);
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ul.xq("UserIdleAskDialog", e10.getMessage());
        }
        rie rieVar = this.emc.ypw;
        com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar, rieVar.bw(), "show_popup", jSONObject);
    }

    private void sup() {
        this.dg.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.cf
    public int bw() {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.cf
    public long dg() {
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.cf
    public void emc() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.db
    public void m_() {
    }

    public void msw() {
        this.ru = true;
        ViewParent parent = this.dg.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.dg);
        }
        com.bytedance.sdk.openadsdk.core.gbl.xq.ypw ypwVar = this.xq;
        if (ypwVar != null) {
            ypwVar.dg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.db
    public void n_() {
        if (this.ru || !gbl()) {
            return;
        }
        sup();
        emc emcVar = this.ypw;
        if (emcVar != null) {
            emcVar.ypw();
        }
        emc(false);
        rtt rttVar = this.ycc;
        if (rttVar != null) {
            rttVar.emc("popupDidDismiss", (JSONObject) null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.db
    public int o_() {
        emc emcVar = this.ypw;
        if (emcVar != null) {
            return emcVar.dg();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.db
    public void p_() {
        emc emcVar = this.ypw;
        if (emcVar != null) {
            emcVar.bw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.db
    public void q_() {
        emc emcVar = this.ypw;
        if (emcVar != null) {
            emcVar.ycc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.db
    public void r_() {
        this.zz = 2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.xq.dg.emc
    public void uym() {
        if (this.msw != 1) {
            return;
        }
        this.msw = 3;
        View viewXq = this.xq.xq();
        if (viewXq != null) {
            ViewGroup viewGroup = (ViewGroup) viewXq.getParent();
            if (viewGroup != null) {
                if (viewGroup == this.dg) {
                    return;
                } else {
                    viewGroup.removeView(viewXq);
                }
            }
            if (this.dg != null) {
                viewXq.setVisibility(0);
                this.dg.addView(viewXq, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.cf
    public long xq() {
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.cf
    public void ycc() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.cf
    public void ypw() {
    }

    public boolean zz() {
        if (this.ru || !gbl()) {
            return false;
        }
        n_();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.cf
    public void emc(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.cf
    public void ypw(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.cf
    public void emc(int i10, com.bytedance.sdk.component.adexpress.ypw.qh qhVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.cf
    public boolean ypw(JSONObject jSONObject) {
        return false;
    }

    private boolean ypw(Activity activity) {
        if (!this.dg.isAttachedToWindow()) {
            Window window = activity.getWindow();
            if (window == null) {
                this.gbl = false;
                return false;
            }
            this.gbl = true;
            window.addContentView(this.dg, new WindowManager.LayoutParams(-1, -1));
        }
        this.dg.setVisibility(0);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.cf
    public void emc(int i10, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.cf
    public void emc(boolean z10, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.cf
    public boolean emc(JSONObject jSONObject) {
        return false;
    }

    public void emc(ViewGroup viewGroup) {
        View viewXq = this.xq.xq();
        if (viewXq == null) {
            return;
        }
        viewXq.setVisibility(4);
        viewGroup.addView(viewXq, new ViewGroup.LayoutParams(-1, -1));
        this.xq.ypw();
        this.msw = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(boolean z10) {
        com.bytedance.sdk.openadsdk.core.gbl.xq.xq xqVarEmc = this.xq.emc();
        if (xqVarEmc instanceof com.bytedance.sdk.openadsdk.core.gbl.xq.dg) {
            ((com.bytedance.sdk.openadsdk.core.gbl.xq.dg) xqVarEmc).emc(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.cf
    public void emc(String str, JSONObject jSONObject) {
        emc emcVar;
        if (!"skipToNextAd".equals(str) || (emcVar = this.ypw) == null) {
            return;
        }
        emcVar.emc();
    }

    public boolean emc(Activity activity) throws JSONException {
        if (!this.ru && activity != null && !activity.isFinishing()) {
            if (this.msw == 3 && this.zz == 2) {
                if (this.dg.isAttachedToWindow() && this.dg.getVisibility() == 0) {
                    return true;
                }
                if (ypw(activity)) {
                    ru();
                    return true;
                }
            }
            try {
                HashMap map = new HashMap();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("webview_status", this.msw);
                jSONObject.put("js_finish", this.zz);
                jSONObject.put("has_window", this.gbl ? 1 : 0);
                map.put("pag_json_data", jSONObject.toString());
                rie rieVar = this.emc.ypw;
                com.bytedance.sdk.openadsdk.dg.xq.emc("show_popup_fail", rieVar, rieVar.bw(), map);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.xq.emc
    public void emc(View view, int i10, com.bytedance.sdk.component.adexpress.xq xqVar) {
        if (i10 == 2) {
            com.bytedance.sdk.openadsdk.core.model.vk vkVar = (com.bytedance.sdk.openadsdk.core.model.vk) xqVar;
            String str = vkVar.uym;
            if (vkVar.sup > 0) {
                iyl.emc(true);
            }
            this.bw.emc(str);
            this.bw.emc(view, vkVar.emc, vkVar.ypw, vkVar.xq, vkVar.dg, vkVar.ru, vkVar.gbl);
            this.emc.tp.hj();
            iyl.emc(false);
            com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(this.emc.ypw, 9);
        }
    }
}

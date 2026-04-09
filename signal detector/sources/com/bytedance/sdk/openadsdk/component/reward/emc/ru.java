package com.bytedance.sdk.openadsdk.component.reward.emc;

import android.R;
import android.annotation.SuppressLint;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.component.reward.emc.dg;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.sup;
import com.bytedance.sdk.openadsdk.core.xq.emc;
import com.bytedance.sdk.openadsdk.core.xq.xq;
import com.bytedance.sdk.openadsdk.ee.ypw.bw;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ru {
    private final emc emc;
    private final com.bytedance.sdk.openadsdk.core.xq.bw xq;
    private final com.bytedance.sdk.openadsdk.core.xq.ypw ypw;

    public ru(emc emcVar) {
        this.emc = emcVar;
        this.xq = emc(emcVar, emcVar.ypw);
        this.ypw = new com.bytedance.sdk.openadsdk.core.xq.ypw(emcVar.mxo, emcVar.ypw, emcVar.bw, emcVar.dg ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.ru.1
            @Override // com.bytedance.sdk.openadsdk.core.xq.ypw, com.bytedance.sdk.openadsdk.core.xq.xq
            public void emc(View view, float f2, float f5, float f6, float f7, SparseArray<xq.emc> sparseArray, boolean z6) {
                try {
                    ru.this.emc(view, f2, f5, f6, f7, sparseArray, this.sf, this.db, this.sb);
                } catch (Exception e6) {
                    ul.xq("TTAD.RFReportManager", "onClickReport error :" + e6.getMessage());
                }
                com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(ru.this.emc.ypw, 9);
                ru.this.emc.ylm.ra();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject msw() {
        com.bytedance.sdk.openadsdk.activity.msw mswVar;
        emc emcVar = this.emc;
        if (!emcVar.wbn || (mswVar = emcVar.pe) == null) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.dg.xq.emc(mswVar.gbl + 1);
        } catch (Throwable unused) {
            return null;
        }
    }

    private JSONObject ru() {
        try {
            long jSra = this.emc.ylm.sra();
            int iRie = this.emc.ylm.rie();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", jSra);
                jSONObject.put("percent", iRie);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private boolean uym() {
        emc emcVar = this.emc;
        if (emcVar == null) {
            return true;
        }
        com.bytedance.sdk.openadsdk.activity.msw mswVar = emcVar.pe;
        boolean z6 = mswVar != null && mswVar.wo().ee();
        emc emcVar2 = this.emc;
        boolean z7 = emcVar2.wpn;
        com.bytedance.sdk.openadsdk.activity.msw mswVar2 = emcVar2.pe;
        return z6 && !z7 && (mswVar2 != null && !mswVar2.wd());
    }

    private boolean zz() {
        rie rieVar = this.emc.ypw;
        return rieVar != null && rieVar.qp() == 1;
    }

    public com.bytedance.sdk.openadsdk.core.xq.bw bw() {
        return this.xq;
    }

    public com.bytedance.sdk.openadsdk.core.xq.ypw dg() {
        return this.ypw;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public com.bytedance.sdk.openadsdk.core.xq.bw xq() {
        com.bytedance.sdk.openadsdk.component.reward.top.xq xqVar;
        this.xq.emc(this.emc.mxo.findViewById(R.id.content));
        if (this.emc.sra.xq() != null) {
            this.xq.emc(this.emc.sra.xq());
        }
        this.emc.rie.emc(this.xq);
        this.xq.emc(new emc.InterfaceC0081emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.ru.3
            @Override // com.bytedance.sdk.openadsdk.core.xq.emc.InterfaceC0081emc
            public long getVideoProgress() {
                return ru.this.emc.ylm.sup();
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.view.gbl gblVar = this.emc.mkp;
        com.bytedance.sdk.openadsdk.core.xq.bw bwVar = this.xq;
        gblVar.emc(bwVar, bwVar, this.ypw);
        this.emc.rtt.emc(this.xq);
        if (com.bytedance.sdk.openadsdk.core.model.ul.sup(this.emc.ypw) && (xqVar = this.emc.cuf.emc) != null && xqVar.getITopLayout() != null) {
            vw.emc(this.emc.cuf.emc.getITopLayout(), (View.OnClickListener) this.ypw, "LandPage#TopLayoutEmptyClick");
        }
        return this.xq;
    }

    public void ycc() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.emc.zz.get()) {
                jSONObject.put("endcard_content", this.emc.xmt.xq() ? 1 : this.emc.lt.dg() ? 3 : this.emc.xmt.dg() ? 2 : 0);
            } else {
                jSONObject.put("endCardNotShow", 1);
            }
        } catch (JSONException unused) {
        }
        emc emcVar = this.emc;
        com.bytedance.sdk.openadsdk.dg.xq.ypw(emcVar.ypw, emcVar.bw, "click_close", jSONObject);
    }

    public void ypw() {
        if (uym()) {
            return;
        }
        rie rieVar = this.emc.ypw;
        if (rieVar == null || !rieVar.yz()) {
            JSONObject jSONObject = new JSONObject();
            boolean z6 = false;
            int iGbl = -1;
            try {
                if (this.emc.ypw.ycc()) {
                    emc emcVar = this.emc;
                    if (emcVar.hxp != null && emcVar.ypw.yid() == 2) {
                        jSONObject.put("dynamic_show_type", this.emc.hxp.gbl());
                        this.emc.hxp.emc(jSONObject);
                        iGbl = this.emc.hxp.gbl();
                        z6 = true;
                    }
                }
                View viewFindViewById = this.emc.mxo.findViewById(R.id.content);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", viewFindViewById.getWidth());
                jSONObject2.put("height", viewFindViewById.getHeight());
                jSONObject2.put("alpha", viewFindViewById.getAlpha());
                jSONObject.put("root_view", jSONObject2.toString());
            } catch (Throwable th) {
                ul.emc("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", th);
            }
            emc(jSONObject, msw(), z6, iGbl, false);
        }
    }

    public void emc() {
        rie rieVar;
        if (uym() || (rieVar = this.emc.ypw) == null || rieVar.yz()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectMsw = msw();
        boolean z6 = false;
        int iGbl = -1;
        try {
            if (this.emc.xq()) {
                if (jSONObjectMsw == null) {
                    jSONObjectMsw = new JSONObject();
                }
                int iEmc = this.emc.emc();
                if (1001 == iEmc) {
                    jSONObject.put("dynamic_show_type", iEmc + this.emc.ypw());
                } else {
                    jSONObject.put("dynamic_show_type", iEmc);
                }
            } else if (this.emc.ypw.ycc()) {
                emc emcVar = this.emc;
                if (emcVar.hxp != null && emcVar.ypw.yid() == 2) {
                    jSONObject.put("dynamic_show_type", this.emc.hxp.gbl());
                    this.emc.hxp.emc(jSONObject);
                    iGbl = this.emc.hxp.gbl();
                    z6 = true;
                }
            }
        } catch (JSONException e6) {
            Log.e("TTAD.RFReportManager", "Inject render fail info to pagJsonData failed", e6);
        }
        emc(jSONObject, jSONObjectMsw, z6, iGbl, true);
    }

    public void xq(boolean z6) {
        emc emcVar = this.emc;
        if (emcVar != null && z6 && emcVar.ypw.pdv() && !this.emc.ypw.sb()) {
            this.emc.ypw.ycc(true);
            emc emcVar2 = this.emc;
            rie rieVar = emcVar2.ypw;
            com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, emcVar2.bw, rieVar.du());
        }
    }

    public void ypw(boolean z6) {
        rie rieVar;
        emc emcVar = this.emc;
        if (emcVar == null) {
            return;
        }
        if (!z6 && emcVar.hj > 0 && (rieVar = emcVar.ypw) != null && rieVar.yz()) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.emc.hj);
            emc emcVar2 = this.emc;
            com.bytedance.sdk.openadsdk.dg.xq.emc(strValueOf, emcVar2.ypw, emcVar2.bw, emcVar2.ylm.bw());
            this.emc.hj = 0L;
        } else {
            this.emc.hj = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(this.emc.ypw, z6 ? 4 : 8);
        com.bytedance.sdk.openadsdk.ee.emc.xq.emc(this.emc.ypw, z6 ? 4 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(JSONObject jSONObject, JSONObject jSONObject2, boolean z6, int i, boolean z7) {
        com.bytedance.sdk.openadsdk.core.model.dg dgVarEh;
        emc emcVar = this.emc;
        rie rieVar = emcVar.ypw;
        com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, emcVar.bw, jSONObject, jSONObject2);
        this.emc.tp.ru();
        if (!z6) {
            i = -1;
        }
        bw.emc emcVar2 = new bw.emc(i);
        emc(emcVar2);
        com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(this.emc.mxo.findViewById(R.id.content), rieVar, emcVar2);
        com.bytedance.sdk.openadsdk.ee.emc.xq.emc(rieVar);
        if (!z7 || (dgVarEh = rieVar.eh()) == null) {
            return;
        }
        dgVarEh.emc().emc(0L);
    }

    private void ypw(View view, float f2, float f5, float f6, float f7, SparseArray<xq.emc> sparseArray, int i, int i3, int i6) {
        rie rieVar;
        if (!zz() || (rieVar = this.emc.ypw) == null || view == null) {
            return;
        }
        boolean z6 = com.bytedance.sdk.openadsdk.core.model.ul.sup(rieVar) && (view instanceof TopLayoutDislike2) && this.emc.cuf.emc.getITopLayout() == view;
        int id = view.getId();
        if (z6 || id == com.bytedance.sdk.openadsdk.utils.vk.uym || id == com.bytedance.sdk.openadsdk.utils.vk.ycc || id == com.bytedance.sdk.openadsdk.utils.vk.bw || id == com.bytedance.sdk.openadsdk.utils.vk.dg || id == com.bytedance.sdk.openadsdk.utils.vk.qh || id == com.bytedance.sdk.openadsdk.utils.vk.pxj || id == com.bytedance.sdk.openadsdk.utils.vk.sba || id == 520093705 || id == com.bytedance.sdk.openadsdk.utils.vk.sz || id == 520093707 || id == com.bytedance.sdk.openadsdk.utils.vk.zz) {
            int iRu = vw.ru(com.bytedance.sdk.openadsdk.core.aa.emc());
            com.bytedance.sdk.openadsdk.core.model.sup supVarEmc = new sup.emc().ycc(f2).bw(f5).dg(f6).xq(f7).ypw(System.currentTimeMillis()).emc(0L).emc(vw.emc(this.emc.mkp.gbl())).ypw(vw.xq(this.emc.mkp.gbl())).dg(i3).bw(i6).ycc(i).emc(sparseArray).ypw(com.bytedance.sdk.openadsdk.core.zz.ypw().emc() ? 1 : 2).xq(iRu).emc(vw.msw(com.bytedance.sdk.openadsdk.core.aa.emc())).ypw(vw.zz(com.bytedance.sdk.openadsdk.core.aa.emc())).emc();
            HashMap map = new HashMap();
            map.put("duration", Long.valueOf(this.emc.ylm.sup()));
            emc emcVar = this.emc;
            String str = emcVar.bw;
            if (z6) {
                str = "landingpage_endcard";
            }
            com.bytedance.sdk.openadsdk.dg.xq.emc("click_other", emcVar.ypw, supVarEmc, str, true, (Map<String, Object>) map, -1);
        }
    }

    public void emc(final Map<String, Object> map) {
        if (uym()) {
            return;
        }
        rie rieVar = this.emc.ypw;
        if (rieVar == null || !rieVar.yz()) {
            final View viewFindViewById = this.emc.mxo.findViewById(R.id.content);
            if (viewFindViewById == null) {
                viewFindViewById = this.emc.mxo.getWindow().getDecorView();
            }
            int width = viewFindViewById.getWidth();
            int height = viewFindViewById.getHeight();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.ru.2
                @Override // java.lang.Runnable
                public void run() {
                    boolean z6;
                    int iGbl;
                    Map map2;
                    emc unused = ru.this.emc;
                    JSONObject jSONObject = null;
                    try {
                        jSONObject = map != null ? new JSONObject(map) : new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("width", viewFindViewById.getWidth());
                        jSONObject2.put("height", viewFindViewById.getHeight());
                        jSONObject2.put("alpha", viewFindViewById.getAlpha());
                        jSONObject.put("root_view", jSONObject2.toString());
                    } catch (Throwable th) {
                        ul.emc("TTAD.RFReportManager", "run: ", th);
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (ru.this.emc.hxp == null || (map2 = map) == null || !map2.containsKey("dynamic_show_type")) {
                        z6 = false;
                        iGbl = -1;
                    } else {
                        iGbl = ru.this.emc.hxp.gbl();
                        z6 = true;
                    }
                    int i = iGbl;
                    boolean z7 = z6;
                    ru ruVar = ru.this;
                    ruVar.emc(jSONObject3, ruVar.msw(), z7, i, false);
                }
            };
            Thread.currentThread().getName();
            if (width > 0 && height > 0) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    runnable.run();
                    return;
                } else {
                    viewFindViewById.post(runnable);
                    return;
                }
            }
            viewFindViewById.post(runnable);
        }
    }

    private void emc(bw.emc emcVar) {
        com.bytedance.sdk.openadsdk.activity.msw mswVar;
        emc emcVar2 = this.emc;
        if (!emcVar2.wbn || (mswVar = emcVar2.pe) == null) {
            return;
        }
        emcVar.ypw = mswVar.gbl;
    }

    public void emc(boolean z6) {
        rie rieVar = this.emc.ypw;
        if (rieVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.vk.emc.dg dgVarBw = com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc(z6 ? 7 : 8).xq(String.valueOf(rieVar.tx())).bw(this.emc.ypw.lvs());
        dgVarBw.ypw(this.emc.xmt.sba()).ycc(this.emc.xmt.yzg());
        dgVarBw.uym(this.emc.ypw.wdp()).dg(this.emc.ypw.ye());
        com.bytedance.sdk.openadsdk.vk.xq.emc().ypw(dgVarBw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(View view, float f2, float f5, float f6, float f7, SparseArray<xq.emc> sparseArray, int i, int i3, int i6) {
        if (view == null) {
            return;
        }
        if (view.getId() == com.bytedance.sdk.openadsdk.utils.vk.uym) {
            emc("click_play_star_level", (JSONObject) null);
        } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.vk.ycc && view.getId() != com.bytedance.sdk.openadsdk.utils.vk.zz) {
            if (view.getId() == com.bytedance.sdk.openadsdk.utils.vk.bw) {
                emc("click_play_source", (JSONObject) null);
            } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.vk.dg) {
                emc("click_play_logo", (JSONObject) null);
            } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.vk.qh && view.getId() != com.bytedance.sdk.openadsdk.utils.vk.pxj && view.getId() != com.bytedance.sdk.openadsdk.utils.vk.sba) {
                if (view.getId() == 520093705) {
                    emc("click_start_play", ru());
                } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.vk.sz) {
                    emc("click_video", ru());
                } else if (view.getId() == 520093707 || view.getId() == com.bytedance.sdk.openadsdk.utils.vk.ru) {
                    emc("fallback_endcard_click", ru());
                }
            } else {
                emc("click_start_play_bar", ru());
            }
        } else {
            emc("click_play_star_nums", (JSONObject) null);
        }
        ypw(view, f2, f5, f6, f7, sparseArray, i, i3, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(String str, JSONObject jSONObject) {
        emc emcVar = this.emc;
        rie rieVar = emcVar.ypw;
        String str2 = emcVar.bw;
        if (!emcVar.dg) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, str2, str, jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.xq.bw emc(final emc emcVar, final rie rieVar) {
        return new com.bytedance.sdk.openadsdk.core.xq.bw(emcVar.mxo, rieVar, emcVar.bw, emcVar.dg ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.ru.4
            @Override // com.bytedance.sdk.openadsdk.core.xq.bw
            public void emc(View view, float f2, float f5, float f6, float f7, SparseArray<xq.emc> sparseArray, int i, int i3, int i6, boolean z6) {
                if (rieVar.ak() && view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        emc((String) tag);
                    }
                }
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(emcVar.ylm.sup()));
                if (emcVar.zz.get()) {
                    map.put("click_scence", 2);
                } else {
                    map.put("click_scence", 1);
                }
                com.bytedance.sdk.openadsdk.activity.msw mswVar = emcVar.pe;
                if (mswVar != null) {
                    mswVar.emc(map, f2, f5);
                }
                emc(map);
                emcVar.tp.mkp();
                emcVar.sra.emc(view, f2, f5, f6, f7, sparseArray, i, i3, i6, new dg.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.ru.4.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.emc.dg.emc
                    public void emc(String str, JSONObject jSONObject) {
                        ru.this.emc(str, jSONObject);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.emc.dg.emc
                    public void emc(View view2, float f8, float f9, float f10, float f11, SparseArray<xq.emc> sparseArray2, int i7, int i8, int i9) {
                        ru.this.emc(view2, f8, f9, f10, f11, sparseArray2, i7, i8, i9);
                    }
                });
                com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(rieVar, 9);
                emcVar.ylm.ra();
            }
        };
    }
}

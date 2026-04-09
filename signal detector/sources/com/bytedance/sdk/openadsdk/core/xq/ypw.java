package com.bytedance.sdk.openadsdk.core.xq;

import L1.f;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.iyl;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.sup;
import com.bytedance.sdk.openadsdk.core.model.vk;
import com.bytedance.sdk.openadsdk.core.xq.xq;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw extends xq {
    private static int rtt = Integer.MIN_VALUE;
    protected com.bytedance.sdk.openadsdk.core.dg.emc aa;
    public vk bw;
    protected com.bytedance.sdk.openadsdk.ul.emc.emc.xq cf;
    protected Context dg;
    private String emc;
    protected emc gbl;
    protected final int msw;
    protected boolean qh;
    protected sup ru;
    protected com.bytedance.sdk.openadsdk.core.zz.ypw sba;
    protected PAGNativeAd sup;
    protected f sz;
    protected final String uym;
    protected Map<String, Object> vk;
    private boolean xq;
    protected final rie ycc;
    private WeakReference<Activity> ypw;
    protected int yzg;
    protected WeakReference<View> zz;

    public interface emc {
        void emc(View view, int i);
    }

    public ypw(Context context, rie rieVar, String str, int i) {
        this.qh = false;
        this.yzg = 0;
        this.xq = false;
        this.dg = context;
        this.ycc = rieVar;
        this.uym = str;
        this.msw = i;
    }

    public void bw(boolean z6) {
        this.qh = z6;
    }

    public View dg() {
        WeakReference<Activity> weakReference = this.ypw;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.ypw.get().findViewById(R.id.content);
    }

    public boolean emc(sup supVar, Map<String, Object> map) {
        return false;
    }

    public void xq(int i) {
        this.db = i;
    }

    public void ypw(int i) {
        this.sb = i;
    }

    public static boolean ypw(View view) {
        return 520093705 == view.getId() || 520093707 == view.getId() || 520093703 == view.getId() || emc(view.getContext()) == view.getId() || com.bytedance.sdk.openadsdk.utils.vk.qhy == view.getId() || com.bytedance.sdk.openadsdk.utils.vk.gc == view.getId();
    }

    public String bw() {
        return this.emc;
    }

    public void emc(com.bytedance.sdk.openadsdk.ul.emc.emc.xq xqVar) {
        this.cf = xqVar;
    }

    public void dg(int i) {
        this.yzg = i;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.zz.ypw ypwVar) {
        this.sba = ypwVar;
    }

    public void emc(PAGNativeAd pAGNativeAd) {
        this.sup = pAGNativeAd;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.dg.emc emcVar) {
        this.aa = emcVar;
    }

    public void emc(f fVar) {
        this.sz = fVar;
    }

    public void emc(emc emcVar) {
        this.gbl = emcVar;
    }

    public void emc(Activity activity) {
        if (activity == null) {
            return;
        }
        this.ypw = new WeakReference<>(activity);
    }

    public ypw(Context context, rie rieVar, String str, int i, boolean z6) {
        this(context, rieVar, str, i);
        this.xq = z6;
    }

    public void emc(View view) {
        if (view == null) {
            return;
        }
        this.zz = new WeakReference<>(view);
    }

    public void emc(Map<String, Object> map) {
        Map<String, Object> map2 = this.vk;
        if (map2 != null) {
            map2.putAll(map);
            map.putAll(this.vk);
        }
        this.vk = map;
    }

    public void emc(int i) {
        this.sf = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.Context] */
    @Override // com.bytedance.sdk.openadsdk.core.xq.xq
    public void emc(View view, float f2, float f5, float f6, float f7, SparseArray<xq.emc> sparseArray, boolean z6) {
        int i;
        boolean z7;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
        if (this.dg == null) {
            this.dg = aa.emc();
        }
        if ((this.xq || !emc(view, 1, f2, f5, f6, f7, sparseArray, z6)) && this.dg != null) {
            vk vkVar = this.bw;
            if (vkVar != null) {
                int i3 = vkVar.msw;
                JSONObject jSONObject3 = vkVar.zz;
                JSONObject jSONObject4 = vkVar.sz;
                z7 = vkVar.qh;
                i = i3;
                jSONObject = jSONObject3;
                jSONObject2 = jSONObject4;
            } else {
                i = -1;
                z7 = false;
                jSONObject = null;
                jSONObject2 = null;
            }
            long j6 = this.hxp;
            long j7 = this.ee;
            WeakReference<View> weakReference = this.zz;
            sup supVarEmc = emc(f2, f5, f6, f7, sparseArray, j6, j7, weakReference == null ? null : weakReference.get(), bw(), vw.msw(this.dg), vw.ru(this.dg), vw.zz(this.dg), i, jSONObject, jSONObject2);
            this.ru = supVarEmc;
            if (emc(supVarEmc, this.vk)) {
                return;
            }
            if (this.sz != null) {
                if (this.vk == null) {
                    this.vk = new HashMap();
                }
                this.vk.put("duration", Long.valueOf(this.sz.ycc()));
            }
            rie rieVar = this.ycc;
            if (!this.xq && !z7) {
                emc emcVar = this.gbl;
                if (emcVar != null) {
                    emcVar.emc(view, -1);
                }
                if (emc(view, z6)) {
                    boolean zYpw = dr.ypw(rieVar);
                    String strEmc = zYpw ? this.uym : tp.emc(this.msw);
                    if (view != null) {
                        try {
                            if (Boolean.TRUE.equals(view.getTag(520093762))) {
                                iyl.emc(true);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    Activity activityEmc = view != null ? com.bytedance.sdk.component.utils.ypw.emc(view) : null;
                    boolean zEmc = iyl.emc(activityEmc == null ? this.dg : activityEmc, rieVar, this.msw, this.sup, this.aa, strEmc, this.cf, zYpw, 0);
                    iyl.emc(false);
                    if (zEmc || rieVar == null || rieVar.kda() == null || rieVar.kda().xq() != 2) {
                        if (rieVar != null && !zEmc && TextUtils.isEmpty(rieVar.xst()) && com.bytedance.sdk.openadsdk.dg.ypw.emc(this.uym)) {
                            com.bytedance.sdk.openadsdk.ul.emc.emc.dg.emc(this.dg, this.uym).emc(rieVar);
                        }
                        com.bytedance.sdk.openadsdk.dg.xq.emc("click", rieVar, this.ru, this.uym, zEmc, this.vk, z6 ? 1 : 2);
                        return;
                    }
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.dg.xq.emc("click", rieVar, this.ru, this.uym, true, this.vk, z6 ? 1 : 2);
            com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = rieVar.eh();
            if (dgVarEh == null || rieVar.ak() || (dgVarEmc = dgVarEh.emc()) == null) {
                return;
            }
            f fVar = this.sz;
            dgVarEmc.uym(fVar != null ? fVar.ycc() : 0L);
        }
    }

    public boolean emc(View view, boolean z6) {
        return emc(view, this.ycc, z6);
    }

    public static boolean emc(View view, rie rieVar, boolean z6) {
        if (view != null && rieVar != null) {
            try {
                int i = com.bytedance.sdk.component.adexpress.dynamic.emc.ul;
                String strValueOf = String.valueOf(view.getTag(i));
                if (view.getTag(i) != null && !TextUtils.isEmpty(strValueOf)) {
                    if ("click".equals(strValueOf)) {
                        return z6;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            if (ypw(view)) {
                return rieVar.ltx() != 1 || z6;
            }
            if (rieVar.jp() == 1 && !z6) {
                return false;
            }
        }
        return true;
    }

    public sup emc(float f2, float f5, float f6, float f7, SparseArray<xq.emc> sparseArray, long j6, long j7, View view, String str, float f8, int i, float f9, int i3, JSONObject jSONObject, JSONObject jSONObject2) {
        return new sup.emc().ycc(f2).bw(f5).dg(f6).xq(f7).ypw(j6).emc(j7).emc(vw.emc(view)).ypw(vw.xq(view)).dg(this.db).bw(this.sb).ycc(this.sf).emc(sparseArray).ypw(zz.ypw().emc() ? 1 : 2).emc(str).emc(f8).xq(i).ypw(f9).emc(i3).emc(jSONObject).ypw(jSONObject2).emc();
    }

    public boolean emc(View view, int i, float f2, float f5, float f6, float f7, SparseArray<xq.emc> sparseArray, boolean z6) {
        if (this.sba == null) {
            return false;
        }
        this.sba.emc(view, i, new vk.emc().dg(f2).xq(f5).ypw(f6).emc(f7).ypw(this.hxp).emc(this.ee).emc(sparseArray).emc(z6).emc());
        return true;
    }

    private static int emc(Context context) {
        if (rtt == Integer.MIN_VALUE) {
            rtt = com.bytedance.sdk.component.utils.rie.bw(context, "btn_native_creative");
        }
        return rtt;
    }

    public void emc(String str) {
        this.emc = str;
    }
}

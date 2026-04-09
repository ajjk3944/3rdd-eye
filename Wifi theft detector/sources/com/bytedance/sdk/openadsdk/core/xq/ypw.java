package com.bytedance.sdk.openadsdk.core.xq;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
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
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import s2.b;

/* loaded from: classes.dex */
public class ypw extends xq {
    private static int rtt = Integer.MIN_VALUE;

    /* renamed from: aa, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.dg.emc f9306aa;
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
    protected b sz;
    protected final String uym;
    protected Map<String, Object> vk;
    private boolean xq;
    protected final rie ycc;
    private WeakReference<Activity> ypw;
    protected int yzg;
    protected WeakReference<View> zz;

    public interface emc {
        void emc(View view, int i10);
    }

    public ypw(@NonNull Context context, @NonNull rie rieVar, @NonNull String str, int i10) {
        this.qh = false;
        this.yzg = 0;
        this.xq = false;
        this.dg = context;
        this.ycc = rieVar;
        this.uym = str;
        this.msw = i10;
    }

    public void bw(boolean z10) {
        this.qh = z10;
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

    public void xq(int i10) {
        this.db = i10;
    }

    public void ypw(int i10) {
        this.sb = i10;
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

    public void dg(int i10) {
        this.yzg = i10;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.zz.ypw ypwVar) {
        this.sba = ypwVar;
    }

    public void emc(PAGNativeAd pAGNativeAd) {
        this.sup = pAGNativeAd;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.dg.emc emcVar) {
        this.f9306aa = emcVar;
    }

    public void emc(b bVar) {
        this.sz = bVar;
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

    public ypw(@NonNull Context context, @NonNull rie rieVar, @NonNull String str, int i10, boolean z10) {
        this(context, rieVar, str, i10);
        this.xq = z10;
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

    public void emc(int i10) {
        this.sf = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.Context] */
    @Override // com.bytedance.sdk.openadsdk.core.xq.xq
    public void emc(View view, float f10, float f11, float f12, float f13, SparseArray<xq.emc> sparseArray, boolean z10) {
        int i10;
        boolean z11;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
        if (this.dg == null) {
            this.dg = aa.emc();
        }
        if ((this.xq || !emc(view, 1, f10, f11, f12, f13, sparseArray, z10)) && this.dg != null) {
            vk vkVar = this.bw;
            if (vkVar != null) {
                int i11 = vkVar.msw;
                JSONObject jSONObject3 = vkVar.zz;
                JSONObject jSONObject4 = vkVar.sz;
                z11 = vkVar.qh;
                i10 = i11;
                jSONObject = jSONObject3;
                jSONObject2 = jSONObject4;
            } else {
                i10 = -1;
                z11 = false;
                jSONObject = null;
                jSONObject2 = null;
            }
            long j10 = this.hxp;
            long j11 = this.ee;
            WeakReference<View> weakReference = this.zz;
            sup supVarEmc = emc(f10, f11, f12, f13, sparseArray, j10, j11, weakReference == null ? null : weakReference.get(), bw(), vw.msw(this.dg), vw.ru(this.dg), vw.zz(this.dg), i10, jSONObject, jSONObject2);
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
            if (!this.xq && !z11) {
                emc emcVar = this.gbl;
                if (emcVar != null) {
                    emcVar.emc(view, -1);
                }
                if (emc(view, z10)) {
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
                    boolean zEmc = iyl.emc(activityEmc == null ? this.dg : activityEmc, rieVar, this.msw, this.sup, this.f9306aa, strEmc, this.cf, zYpw, 0);
                    iyl.emc(false);
                    if (zEmc || rieVar == null || rieVar.kda() == null || rieVar.kda().xq() != 2) {
                        if (rieVar != null && !zEmc && TextUtils.isEmpty(rieVar.xst()) && com.bytedance.sdk.openadsdk.dg.ypw.emc(this.uym)) {
                            com.bytedance.sdk.openadsdk.ul.emc.emc.dg.emc(this.dg, this.uym).emc(rieVar);
                        }
                        com.bytedance.sdk.openadsdk.dg.xq.emc(CampaignEx.JSON_NATIVE_VIDEO_CLICK, rieVar, this.ru, this.uym, zEmc, this.vk, z10 ? 1 : 2);
                        return;
                    }
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.dg.xq.emc(CampaignEx.JSON_NATIVE_VIDEO_CLICK, rieVar, this.ru, this.uym, true, this.vk, z10 ? 1 : 2);
            com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = rieVar.eh();
            if (dgVarEh == null || rieVar.ak() || (dgVarEmc = dgVarEh.emc()) == null) {
                return;
            }
            b bVar = this.sz;
            dgVarEmc.uym(bVar != null ? bVar.ycc() : 0L);
        }
    }

    public boolean emc(View view, boolean z10) {
        return emc(view, this.ycc, z10);
    }

    public static boolean emc(View view, rie rieVar, boolean z10) {
        if (view != null && rieVar != null) {
            try {
                int i10 = com.bytedance.sdk.component.adexpress.dynamic.emc.ul;
                String strValueOf = String.valueOf(view.getTag(i10));
                if (view.getTag(i10) != null && !TextUtils.isEmpty(strValueOf)) {
                    if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(strValueOf)) {
                        return z10;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            if (ypw(view)) {
                return rieVar.ltx() != 1 || z10;
            }
            if (rieVar.jp() == 1 && !z10) {
                return false;
            }
        }
        return true;
    }

    public sup emc(float f10, float f11, float f12, float f13, SparseArray<xq.emc> sparseArray, long j10, long j11, View view, String str, float f14, int i10, float f15, int i11, JSONObject jSONObject, JSONObject jSONObject2) {
        return new sup.emc().ycc(f10).bw(f11).dg(f12).xq(f13).ypw(j10).emc(j11).emc(vw.emc(view)).ypw(vw.xq(view)).dg(this.db).bw(this.sb).ycc(this.sf).emc(sparseArray).ypw(zz.ypw().emc() ? 1 : 2).emc(str).emc(f14).xq(i10).ypw(f15).emc(i11).emc(jSONObject).ypw(jSONObject2).emc();
    }

    public boolean emc(View view, int i10, float f10, float f11, float f12, float f13, SparseArray<xq.emc> sparseArray, boolean z10) {
        if (this.sba == null) {
            return false;
        }
        this.sba.emc(view, i10, new vk.emc().dg(f10).xq(f11).ypw(f12).emc(f13).ypw(this.hxp).emc(this.ee).emc(sparseArray).emc(z10).emc());
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

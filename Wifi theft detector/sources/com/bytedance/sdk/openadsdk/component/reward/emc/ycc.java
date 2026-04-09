package com.bytedance.sdk.openadsdk.component.reward.emc;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.bytedance.sdk.openadsdk.core.xq.xq;
import com.bytedance.sdk.openadsdk.core.xq.ypw;
import com.bytedance.sdk.openadsdk.utils.tp;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ycc {

    @NonNull
    private emc emc;
    private boolean ypw;

    public ycc(emc emcVar) {
        this.emc = emcVar;
    }

    private void ypw() {
        com.bytedance.sdk.openadsdk.activity.msw mswVar;
        emc emcVar = this.emc;
        Activity activity = emcVar.mxo;
        rie rieVar = emcVar.ypw;
        String str = emcVar.bw;
        com.bytedance.sdk.openadsdk.core.zz.zz zzVar = new com.bytedance.sdk.openadsdk.core.zz.zz(activity, rieVar, str, tp.emc(str)) { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.ycc.3
            @Override // com.bytedance.sdk.openadsdk.core.xq.ypw, com.bytedance.sdk.openadsdk.core.xq.xq
            public void emc(View view, float f10, float f11, float f12, float f13, SparseArray<xq.emc> sparseArray, boolean z10) {
                super.emc(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        zzVar.emc(new ypw.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.ycc.4
            @Override // com.bytedance.sdk.openadsdk.core.xq.ypw.emc
            public void emc(View view, int i10) {
                ycc.this.emc.tp.mkp();
            }
        });
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        emc emcVar2 = this.emc;
        if (emcVar2.wbn && (mswVar = emcVar2.pe) != null) {
            int i10 = mswVar.gbl + 1;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i10);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
        }
        zzVar.emc(map);
        emc emcVar3 = this.emc;
        Activity activity2 = emcVar3.mxo;
        rie rieVar2 = emcVar3.ypw;
        String str2 = emcVar3.bw;
        com.bytedance.sdk.openadsdk.core.zz.msw mswVar2 = new com.bytedance.sdk.openadsdk.core.zz.msw(activity2, rieVar2, str2, tp.emc(str2)) { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.ycc.5
            @Override // com.bytedance.sdk.openadsdk.core.xq.emc, com.bytedance.sdk.openadsdk.core.xq.ypw, com.bytedance.sdk.openadsdk.core.xq.xq
            public void emc(View view, float f10, float f11, float f12, float f13, SparseArray<xq.emc> sparseArray, boolean z10) {
                HashMap map2 = new HashMap();
                map2.put("duration", Long.valueOf(ycc.this.emc.ylm.sup()));
                if (ycc.this.emc.pe != null) {
                    ycc.this.emc.pe.emc(map2, f10, f11);
                }
                emc(map2);
                super.emc(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        mswVar2.emc(new ypw.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.ycc.6
            @Override // com.bytedance.sdk.openadsdk.core.xq.ypw.emc
            public void emc(View view, int i11) {
                ycc.this.emc.tp.mkp();
            }
        });
        HashMap map2 = new HashMap();
        map2.put("click_scence", 1);
        mswVar2.emc(map2);
        this.emc.hxp.emc(zzVar, mswVar2);
    }

    public void emc(float[] fArr) {
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar;
        this.ypw = true;
        Arrays.toString(fArr);
        AdSlot adSlotBuild = new AdSlot.Builder().setCodeId(String.valueOf(this.emc.ypw.tx())).setExpressViewAcceptedSize(fArr[0], fArr[1]).build();
        emc emcVar = this.emc;
        emcVar.hxp.emc(adSlotBuild, emcVar.mkp.cf);
        emc emcVar2 = this.emc;
        sup supVar = emcVar2.cuf;
        if (supVar != null && (zzVar = emcVar2.hxp) != null) {
            supVar.emc(zzVar.emc());
        }
        this.emc.hxp.emc(new com.bytedance.sdk.openadsdk.core.zz.cf() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.ycc.1
            @Override // com.bytedance.sdk.openadsdk.core.zz.cf
            public int bw() {
                if (ycc.this.emc.hxp.xq()) {
                    return 4;
                }
                if (ycc.this.emc.hxp.dg()) {
                    return 5;
                }
                if (ycc.this.emc.ylm.ru()) {
                    return 1;
                }
                if (ycc.this.emc.ylm.ycc()) {
                    return 2;
                }
                ycc.this.emc.ylm.zz();
                return 3;
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.cf
            public long dg() {
                return ycc.this.emc.ylm.emc();
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.cf
            public void emc(boolean z10, String str) {
                if (ycc.this.emc.yz != z10) {
                    ycc.this.emc.cuf.emc(str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.cf
            public long xq() {
                return ycc.this.emc.ylm.sz();
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.cf
            public void ycc() {
                ycc.this.emc.sf.emc(ycc.this.emc.cn);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.cf
            public boolean ypw(JSONObject jSONObject) {
                return com.bytedance.sdk.openadsdk.component.reward.ypw.emc(ycc.this.emc);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.cf
            public void ypw() {
                if (ycc.this.emc.mkp == null || ycc.this.emc.mkp.ru() == null) {
                    return;
                }
                ycc.this.emc.mkp.ru().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.cf
            public void emc() {
                ycc.this.emc.cuf.dg();
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.cf
            public void emc(String str, JSONObject jSONObject) {
                if (ycc.this.emc == null || ycc.this.emc.tp == null) {
                    return;
                }
                ycc.this.emc.tp.emc(str, jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.cf
            public void ypw(int i10) {
                ycc.this.emc.pxa = i10;
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.cf
            public boolean emc(JSONObject jSONObject) {
                if (ycc.this.emc == null || ycc.this.emc.ylm == null) {
                    return false;
                }
                return ycc.this.emc.ylm.emc(jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.cf
            public void emc(int i10) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ycc.this.emc.ylm.rtt();
                        return;
                    }
                    if (i10 == 3) {
                        ycc.this.emc.ylm.emc(ycc.this.emc.tp);
                        return;
                    } else if (i10 == 4) {
                        ycc.this.emc.ylm.sba();
                        return;
                    } else if (i10 != 5) {
                        return;
                    }
                }
                if (ycc.this.emc.ylm.ycc() || ycc.this.emc.ylm.zz()) {
                    return;
                }
                ycc.this.emc.tp.emc(0L, false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.cf
            public void emc(int i10, String str) {
                ycc.this.emc.ylm.emc(i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.cf
            public void emc(int i10, com.bytedance.sdk.component.adexpress.ypw.qh qhVar) {
                ycc.this.emc.mkp.emc(i10, qhVar);
            }
        });
        this.emc.hxp.emc(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.ycc.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (ycc.this.emc == null || ycc.this.emc.ypw == null || !ycc.this.emc.ypw.yvi()) {
                    return;
                }
                ycc.this.emc.tp.mkp();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i10) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i10) {
                boolean z10 = -1024 == i10;
                ycc.this.emc.emc(i10, str, z10 ? 1002 : 1001);
                ycc.this.emc.db.emc();
                if (z10) {
                    return;
                }
                if (!ycc.this.emc.ypw.tze()) {
                    ycc.this.emc.xmt.emc(true);
                    ycc.this.emc.xmt.bw();
                }
                ycc.this.emc.hxp.bw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.ycc.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ycc.this.emc.cn.emc(false, false, false, 90);
                    }
                });
                ycc.this.emc.mkp.sz();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f10, float f11) {
                ul ulVar;
                if (!ycc.this.emc.ypw.tze()) {
                    if (ycc.this.emc.hxp.zz()) {
                        ycc.this.emc.cn.emc(true);
                        ycc.this.emc.ylm.dg(false);
                    } else {
                        ycc.this.emc.ylm.dg(true);
                    }
                    ycc.this.emc.mkp.emc(8);
                    ycc.this.emc.xmt.emc(true);
                    ycc.this.emc.xmt.bw();
                    if (ycc.this.emc.hxp.zz()) {
                        ycc.this.emc.hxp.ypw().setBackgroundColor(-16777216);
                        ycc.this.emc.cn.emc(ycc.this.emc.mkp.ycc());
                    } else if (ycc.this.emc.ypw.iat() != null && ycc.this.emc.cn.emc()) {
                        ycc.this.emc.wa = true;
                    }
                }
                ycc.this.emc.cn.rie();
                if (ul.xq(ycc.this.emc.ypw) && (ulVar = ycc.this.emc.mkp.cf) != null) {
                    ulVar.xq();
                }
                ycc.this.emc.mkp.sz();
            }
        });
        ypw();
        FrameLayout.LayoutParams layoutParams = (this.emc.ypw.tze() || com.bytedance.sdk.openadsdk.core.gbl.bw.emc(this.emc.ypw.ej()) || ul.xq(this.emc.ypw)) ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.emc.mkp.ycc().addView(this.emc.hxp.emc(), layoutParams);
        if (!this.emc.hxp.zz()) {
            this.emc.cn.emc(false);
        }
        this.emc.hxp.qh();
    }

    public void emc(rie rieVar) {
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar = this.emc.hxp;
        if (zzVar != null) {
            com.bytedance.sdk.openadsdk.component.reward.view.xq xqVarEmc = zzVar.emc();
            ViewParent parent = xqVarEmc.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(xqVarEmc);
            }
            this.emc.mkp.ycc().addView(xqVarEmc);
            if (!this.emc.hxp.zz()) {
                this.emc.cn.emc(false);
            }
            this.emc.hxp.emc(rieVar);
            ypw();
        }
    }

    public boolean emc() {
        return this.ypw;
    }

    public void emc(@NonNull emc emcVar) {
        this.emc = emcVar;
    }
}

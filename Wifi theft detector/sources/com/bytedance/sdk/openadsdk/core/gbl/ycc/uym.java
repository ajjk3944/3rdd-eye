package com.bytedance.sdk.openadsdk.core.gbl.ycc;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.core.gbl;
import com.bytedance.adsdk.ugeno.core.sup;
import com.bytedance.adsdk.ugeno.core.vk;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.model.cuf;
import com.bytedance.sdk.openadsdk.core.model.rie;
import java.util.HashMap;
import org.json.JSONObject;
import org.xbill.DNS.WKSRecord;

/* loaded from: classes.dex */
public class uym extends dg {
    private boolean cuf;
    private com.bytedance.adsdk.ugeno.ypw.xq db;
    private float dr;
    private com.bytedance.adsdk.ugeno.ypw.xq ee;
    private float lt;
    private float rtt;
    private com.bytedance.adsdk.ugeno.ypw.xq sb;
    private com.bytedance.sdk.openadsdk.core.widget.bw sf;
    private boolean xmt;

    public uym(Context context, rie rieVar, boolean z10, emc emcVar, ViewGroup viewGroup) {
        super(context, rieVar, z10, emcVar, viewGroup);
        this.xmt = false;
        this.cuf = true;
        if (TextUtils.equals(this.sra, "fullscreen_interstitial_ad")) {
            this.dr = this.bw.bhr();
        } else if (TextUtils.equals(this.sra, "rewarded_video")) {
            this.dr = this.bw.iw();
        }
    }

    private void cf() {
        com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar = this.xq;
        if (xqVar == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.ypw.xq<T> xqVarYcc = xqVar.ycc("RVCountdown");
        this.ee = xqVarYcc;
        if (xqVarYcc == 0) {
            this.ee = this.xq.ycc("FVCountdown");
        }
        if (this.ee == null) {
            this.ee = this.xq.ycc("AOCountdown");
        }
        com.bytedance.adsdk.ugeno.ypw.xq<T> xqVarYcc2 = this.xq.ycc("RVSkipView");
        this.db = xqVarYcc2;
        if (xqVarYcc2 == 0) {
            this.db = this.xq.ycc("FVSkipView");
        }
        if (this.db == null) {
            this.db = this.xq.ycc("AOSkipView");
        }
    }

    private int qh() {
        sz();
        try {
            this.emc.emc(this.hxp, this.xq);
            if (this.xq != null) {
                cf();
                sup();
            }
            if (this instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.emc.dg) {
                return 0;
            }
            this.ycc.cuf().ypw();
            this.ycc.cuf().xq();
            return 0;
        } catch (NoClassDefFoundError unused) {
            return WKSRecord.Service.EMFIS_DATA;
        } catch (UnsatisfiedLinkError unused2) {
            return WKSRecord.Service.NETBIOS_SSN;
        } catch (Throwable unused3) {
            return WKSRecord.Service.EMFIS_CNTL;
        }
    }

    private void sup() {
        com.bytedance.adsdk.ugeno.ypw.xq xqVar = this.ee;
        if (xqVar != null) {
            xqVar.xq(8);
        }
        com.bytedance.adsdk.ugeno.ypw.xq xqVar2 = this.db;
        if (xqVar2 != null) {
            xqVar2.xq(8);
        }
    }

    private void sz() {
        gbl gblVar = new gbl();
        HashMap map = new HashMap();
        map.put("image_info", this.ycc.gbl());
        map.put("cache_dir", this.ycc.qh());
        gblVar.emc(map);
        gblVar.emc(this.ypw);
        gblVar.emc(this.dg);
        gblVar.ypw(this.hxp);
        this.emc.emc("ad", gblVar);
    }

    private boolean vk() {
        rie rieVar = this.bw;
        return rieVar != null && rieVar.sg() == 1;
    }

    private void xq(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        com.bytedance.adsdk.ugeno.ypw.xq xqVar = this.db;
        if (xqVar != null && (xqVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ypw.ycc)) {
            int i11 = 0;
            if (!z10 && !z11) {
                i11 = 8;
            }
            xqVar.xq(i11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.ycc.dg
    public int dg() {
        if (!this.ycc.rtt()) {
            return zz();
        }
        ul.emc("UGenRender", "renderWidget: only update data");
        return qh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.ycc.dg
    public JSONObject emc() {
        JSONObject jSONObjectXq = this.ycc.xq();
        if (jSONObjectXq != null) {
            return jSONObjectXq.optJSONObject("xTemplate");
        }
        return null;
    }

    public void gbl() {
        sup supVar = this.emc;
        if (supVar != null) {
            supVar.emc(this.xq, "show", new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.ycc.dg
    public com.bytedance.adsdk.ugeno.ypw.xq msw() {
        com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar = this.xq;
        if (xqVar == null) {
            return null;
        }
        return xqVar.ycc("VideoV3");
    }

    public void ru() {
        sup supVar = this.emc;
        if (supVar != null) {
            supVar.emc(this.xq, "videoFail", new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.ycc.dg, com.bytedance.sdk.component.adexpress.dynamic.dg
    public void setSoundMute(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.ycc.dg, com.bytedance.sdk.component.adexpress.dynamic.dg
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) throws NumberFormatException {
        sup supVar;
        if (this.xq == null) {
            return;
        }
        boolean z11 = i10 == 1;
        if (TextUtils.equals(this.sra, "open_ad") && (supVar = this.emc) != null) {
            supVar.emc(this.xq, "countdown", charSequence);
        }
        ypw(charSequence, z11, i11, z10);
        emc(charSequence, z11, i11, z10);
        xq(charSequence, z11, i11, z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.ycc.dg
    public com.bytedance.adsdk.ugeno.ypw.xq uym() {
        com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar = this.xq;
        if (xqVar == null) {
            return null;
        }
        return xqVar.ycc("Playable");
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.ycc.dg
    public JSONObject ypw() {
        return this.ycc.xq();
    }

    public int zz() {
        sz();
        this.emc.emc((cf) this);
        this.emc.emc((vk) this);
        if (vk()) {
            this.emc.emc(new xq());
        }
        cuf cufVarKv = this.bw.kv();
        if (cufVarKv == null) {
            try {
                if (com.bytedance.sdk.openadsdk.core.gbl.ycc.emc.dg.emc(this.sra)) {
                    this.xq = this.emc.emc(this.dg, this.hxp, emc(cufVarKv));
                } else {
                    this.xq = this.emc.emc(this.dg, this.hxp, (JSONObject) null);
                }
            } catch (NoClassDefFoundError unused) {
                return WKSRecord.Service.EMFIS_DATA;
            } catch (UnsatisfiedLinkError unused2) {
                return WKSRecord.Service.NETBIOS_SSN;
            } catch (Throwable unused3) {
                return WKSRecord.Service.EMFIS_CNTL;
            }
        } else {
            this.xq = this.emc.emc(this.dg, this.hxp, emc(cufVarKv));
        }
        if (this.xq != null) {
            cf();
            this.sb = this.xq.ycc("ProgressBar");
            sup();
        }
        if (this instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.emc.dg) {
            return 0;
        }
        this.ycc.cuf().ypw();
        this.ycc.cuf().xq();
        return 0;
    }

    private void ypw(CharSequence charSequence, boolean z10, int i10, boolean z11) throws NumberFormatException {
        int i11;
        com.bytedance.adsdk.ugeno.ypw.xq xqVar = this.sb;
        if (xqVar != null && (xqVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ypw.dg.xq)) {
            try {
                i11 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                ul.xq("UGenRender", "parse duration exception", charSequence);
                i11 = 0;
            }
            if (z11 || i11 <= 0 || z10) {
                ((com.bytedance.sdk.openadsdk.core.gbl.ypw.dg.xq) this.sb).xq(8);
                return;
            }
            if (this.cuf) {
                this.lt = i10;
                this.cuf = false;
            }
            float f10 = (float) (this.rtt + ((0.5d / this.lt) * 100.0d));
            this.rtt = f10;
            this.emc.ypw(this.xq, "ProgressBar://progress", Float.valueOf(f10), Float.valueOf(this.dr));
            ((com.bytedance.sdk.openadsdk.core.gbl.ypw.dg.xq) this.sb).uym(500);
            ((com.bytedance.sdk.openadsdk.core.gbl.ypw.dg.xq) this.sb).emc((int) this.rtt);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.ycc.dg
    public void emc(com.bytedance.sdk.openadsdk.core.widget.bw bwVar) {
        this.sf = bwVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.bytedance.sdk.openadsdk.core.gbl.ycc.dg, com.bytedance.adsdk.ugeno.core.cf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc(com.bytedance.adsdk.ugeno.ypw.xq r13, java.lang.String r14, com.bytedance.adsdk.ugeno.dg.ycc.emc r15) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.gbl.ycc.uym.emc(com.bytedance.adsdk.ugeno.ypw.xq, java.lang.String, com.bytedance.adsdk.ugeno.dg.ycc$emc):void");
    }

    private void emc(CharSequence charSequence, boolean z10, int i10, boolean z11) throws NumberFormatException {
        int i11;
        com.bytedance.adsdk.ugeno.ypw.xq xqVar = this.ee;
        if (xqVar != null && (xqVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ypw.ypw)) {
            try {
                i11 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                ul.xq("UGenRender", "parse duration exception", charSequence);
                i11 = 0;
            }
            if (!z11 && i11 > 0 && !this.xmt) {
                this.ee.xq(0);
                if (!z10 && this.ycc.emc() && com.bytedance.sdk.component.adexpress.dg.ycc.ypw(this.ycc.dg())) {
                    ((com.bytedance.sdk.openadsdk.core.gbl.ypw.ypw) this.ee).qh(String.valueOf(i10));
                    return;
                } else if (!"open_ad".equals(this.ycc.dg()) && this.ycc.emc()) {
                    this.xmt = true;
                    this.ee.xq(8);
                    return;
                } else {
                    ((com.bytedance.sdk.openadsdk.core.gbl.ypw.ypw) this.ee).qh(String.valueOf(charSequence));
                    return;
                }
            }
            this.ee.xq(8);
        }
    }

    private Context emc(View view) {
        Activity activityEmc = view != null ? com.bytedance.sdk.component.utils.ypw.emc(view) : null;
        return activityEmc == null ? this.ypw : activityEmc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.ycc.dg
    public void emc(long j10, long j11) {
        super.emc(j10, j11);
        sup supVar = this.emc;
        if (supVar != null) {
            supVar.emc(this.xq, "videoProgress", Long.valueOf(j10), Long.valueOf(j11));
        }
    }

    public JSONObject emc(cuf cufVar) {
        if (cufVar != null) {
            return cufVar.bw();
        }
        return null;
    }
}

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

    public uym(Context context, rie rieVar, boolean z6, emc emcVar, ViewGroup viewGroup) {
        super(context, rieVar, z6, emcVar, viewGroup);
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
            return 140;
        } catch (UnsatisfiedLinkError unused2) {
            return 139;
        } catch (Throwable unused3) {
            return 141;
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

    private void xq(CharSequence charSequence, boolean z6, int i, boolean z7) {
        com.bytedance.adsdk.ugeno.ypw.xq xqVar = this.db;
        if (xqVar != null && (xqVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ypw.ycc)) {
            int i3 = 0;
            if (!z6 && !z7) {
                i3 = 8;
            }
            xqVar.xq(i3);
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
    public void setSoundMute(boolean z6) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.ycc.dg, com.bytedance.sdk.component.adexpress.dynamic.dg
    public void setTime(CharSequence charSequence, int i, int i3, boolean z6) throws NumberFormatException {
        sup supVar;
        if (this.xq == null) {
            return;
        }
        boolean z7 = i == 1;
        if (TextUtils.equals(this.sra, "open_ad") && (supVar = this.emc) != null) {
            supVar.emc(this.xq, "countdown", charSequence);
        }
        ypw(charSequence, z7, i3, z6);
        emc(charSequence, z7, i3, z6);
        xq(charSequence, z7, i3, z6);
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
                return 140;
            } catch (UnsatisfiedLinkError unused2) {
                return 139;
            } catch (Throwable unused3) {
                return 141;
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

    private void ypw(CharSequence charSequence, boolean z6, int i, boolean z7) throws NumberFormatException {
        int i3;
        com.bytedance.adsdk.ugeno.ypw.xq xqVar = this.sb;
        if (xqVar != null && (xqVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ypw.dg.xq)) {
            try {
                i3 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                ul.xq("UGenRender", "parse duration exception", charSequence);
                i3 = 0;
            }
            if (z7 || i3 <= 0 || z6) {
                ((com.bytedance.sdk.openadsdk.core.gbl.ypw.dg.xq) this.sb).xq(8);
                return;
            }
            if (this.cuf) {
                this.lt = i;
                this.cuf = false;
            }
            float f2 = (float) (((0.5d / this.lt) * 100.0d) + this.rtt);
            this.rtt = f2;
            this.emc.ypw(this.xq, "ProgressBar://progress", Float.valueOf(f2), Float.valueOf(this.dr));
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

    private void emc(CharSequence charSequence, boolean z6, int i, boolean z7) throws NumberFormatException {
        int i3;
        com.bytedance.adsdk.ugeno.ypw.xq xqVar = this.ee;
        if (xqVar != null && (xqVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ypw.ypw)) {
            try {
                i3 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                ul.xq("UGenRender", "parse duration exception", charSequence);
                i3 = 0;
            }
            if (!z7 && i3 > 0 && !this.xmt) {
                this.ee.xq(0);
                if (!z6 && this.ycc.emc() && com.bytedance.sdk.component.adexpress.dg.ycc.ypw(this.ycc.dg())) {
                    ((com.bytedance.sdk.openadsdk.core.gbl.ypw.ypw) this.ee).qh(String.valueOf(i));
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
    public void emc(long j6, long j7) {
        super.emc(j6, j7);
        sup supVar = this.emc;
        if (supVar != null) {
            supVar.emc(this.xq, "videoProgress", Long.valueOf(j6), Long.valueOf(j7));
        }
    }

    public JSONObject emc(cuf cufVar) {
        if (cufVar != null) {
            return cufVar.bw();
        }
        return null;
    }
}

package com.bytedance.sdk.openadsdk.component.reward.emc;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.bytedance.sdk.openadsdk.dg.ypw;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bw {
    private final com.bytedance.sdk.openadsdk.component.reward.emc.emc emc;
    private emc xq;
    private final com.bytedance.sdk.openadsdk.component.reward.view.uym ypw;

    public interface emc {
        void emc(boolean z10, boolean z11, boolean z12, com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar, int i10);
    }

    public bw(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        this.emc = emcVar;
        this.ypw = new com.bytedance.sdk.openadsdk.component.reward.view.uym(emcVar);
    }

    private int ycc() {
        int iJl = this.emc.ypw.jl();
        if (iJl <= 5000 && iJl >= 0) {
            if (iJl < 1000) {
                iJl += 1000;
            }
            int iEmc = com.bytedance.sdk.openadsdk.core.aa.dg().emc(this.emc.ypw.tx());
            if (iEmc <= 5000 && iEmc >= 0) {
                if (iEmc < 1000) {
                    iEmc += 1000;
                }
                return Math.min(iJl, iEmc);
            }
        }
        return -1;
    }

    public boolean bw() {
        return this.ypw.bw();
    }

    public void dg() {
        emc(true);
    }

    public void emc() {
        this.ypw.emc();
    }

    public void xq() {
        this.ypw.dg();
    }

    public void ypw() {
        this.ypw.xq();
    }

    public void emc(com.bytedance.sdk.openadsdk.core.xq.bw bwVar) {
        this.ypw.emc(bwVar);
    }

    public boolean ypw(com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar) {
        boolean z10;
        this.emc.uym = ycc();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.emc;
        int i10 = emcVar.uym;
        if (emcVar.ypw.ul()) {
            return false;
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.emc;
        int i11 = emcVar2.uym;
        if (i11 != -1) {
            if (i11 >= 0) {
                emcVar2.sba.set(false);
                Message messageObtain = Message.obtain();
                messageObtain.what = 700;
                com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar3 = this.emc;
                messageObtain.arg1 = emcVar3.uym;
                emcVar3.ra.sendMessage(messageObtain);
                if (!dr.uym(this.emc.ypw)) {
                    z10 = true;
                }
            }
            z10 = false;
        } else if (emcVar2.pe == null && dr.msw(emcVar2.ypw) && this.emc.xmt.sz()) {
            ypwVar.ylm();
            z10 = false;
        } else {
            ypwVar.sz();
            z10 = true;
        }
        if (this.emc.xmt.ul() ? false : z10) {
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar4 = this.emc;
            if (emcVar4.nw == null || !emcVar4.uym()) {
                return true;
            }
            this.emc.nw.emc(r6.uym);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc(boolean r11, boolean r12, boolean r13, com.bytedance.sdk.openadsdk.component.reward.ypw.ypw r14, int r15) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.emc.bw.emc(boolean, boolean, boolean, com.bytedance.sdk.openadsdk.component.reward.ypw.ypw, int):void");
    }

    private boolean ypw(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.view.xq xqVarEmc;
        if (!ul.xq(this.emc.ypw) || (xqVarEmc = this.emc.hxp.emc()) == null || xqVarEmc.dg != 0 || z10) {
            return true;
        }
        this.emc.cuf.xq(false);
        return false;
    }

    private void emc(boolean z10, boolean z11, boolean z12, int i10) {
        int i11;
        HashMap map = new HashMap();
        if (this.emc.xmt.sf()) {
            i11 = 1;
        } else {
            i11 = !this.emc.xmt.qh() ? -1 : 2;
        }
        map.put("webview_state", Integer.valueOf(i11));
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.emc;
        com.bytedance.sdk.openadsdk.dg.xq.emc(emcVar.ypw, emcVar.bw, z10, z11, z12, emcVar.mxo.isFinishing(), i10, map);
    }

    public void emc(boolean z10, com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar) throws JSONException {
        sz szVar;
        this.emc.cf.set(z10);
        ypwVar.sup();
        this.emc.ypw.ak();
        this.emc.cuf.dg(false);
        this.emc.cuf.xq(false);
        this.emc.xmt.rie();
        ul ulVar = this.emc.mkp.cf;
        if (ulVar != null) {
            ulVar.bw();
        }
        this.emc.mkp.xq();
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar = this.emc.hxp;
        if (zzVar != null) {
            zzVar.ycc();
        }
        msw mswVar = this.emc.rie;
        if (mswVar != null) {
            mswVar.xq(msw.ypw);
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.emc;
        if (!TextUtils.isEmpty(rie.emc(emcVar.vw, emcVar.ypw))) {
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.emc;
            com.bytedance.sdk.openadsdk.utils.rie.emc(emcVar2.mxo, dr.sup(emcVar2.ypw), this.emc.ypw, ypw.emc.xq);
            return;
        }
        if (rie.xq(this.emc.ypw) && (szVar = this.emc.lt) != null) {
            szVar.ycc();
        }
        if (!rie.emc(this.emc.ypw) && (rie.xq(this.emc.ypw) || !this.emc.xmt.xmt())) {
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar3 = this.emc;
            if (rie.emc(emcVar3.ypw, emcVar3.xmt.sz(), this.emc.xmt.rtt(), this.emc.lt.sup(), this.emc.xmt.hxp())) {
                if (!rie.dg(this.emc.ypw) && !rie.xq(this.emc.ypw)) {
                    this.emc.xmt.emc(true, 0, (String) null);
                }
                ypw(ypwVar);
                emc(ypwVar);
                return;
            }
        }
        dg();
    }

    public void emc(com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar) throws JSONException {
        if (!rie.xq(this.emc.ypw)) {
            this.emc.lt.emc(8);
            this.emc.xmt.emc(0);
            this.emc.xmt.lt();
        } else {
            this.emc.xmt.emc(8);
            this.emc.lt.emc(0);
            this.emc.lt.uym();
        }
        this.emc.mkp.dg(8);
        this.emc.mkp.uym();
        if (rie.xq(this.emc.ypw)) {
            this.emc.ra.sendEmptyMessageDelayed(800, 100L);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.emc;
        emcVar.xmt.emc(emcVar.yz, true);
        this.emc.xmt.xq(true);
        this.emc.xmt.ypw(true);
        rtt rttVarZz = this.emc.xmt.zz();
        if (rttVarZz != null) {
            rttVarZz.emc("prerender_page_show", (JSONObject) null);
        }
        if (!dr.ypw(this.emc.ypw)) {
            this.emc.cuf.xq(false);
        }
        com.bytedance.sdk.component.zz.ycc yccVarMsw = this.emc.xmt.msw();
        if (yccVarMsw == null || yccVarMsw.getWebView() == null) {
            return;
        }
        yccVarMsw.sz();
        yccVarMsw.getWebView().resumeTimers();
    }

    public void emc(boolean z10) {
        if (!rie.dg(this.emc.ypw)) {
            this.emc.xmt.emc(false, TTAdConstant.DOWNLOAD_URL_CODE, "end_card_timeout");
        }
        this.emc.xmt.ee();
        this.emc.xmt.emc(8);
        this.emc.lt.emc(8);
        this.emc.mkp.dg(8);
        if (this.emc.ypw.ak()) {
            if (!this.ypw.emc(this.emc.ylm)) {
                this.emc.mxo.finish();
            }
        } else {
            com.bytedance.sdk.openadsdk.activity.msw mswVar = this.emc.pe;
            if (mswVar != null) {
                this.ypw.emc(mswVar.wo().ru());
            }
            this.ypw.ypw();
        }
        this.emc.mkp.uym();
        if (z10) {
            ypw(this.emc.cn);
        }
        this.emc.cuf.xq(false);
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.emc;
        emcVar.db.emc(emcVar.ypw.zc());
    }

    public void emc(emc emcVar) {
        this.xq = emcVar;
    }
}

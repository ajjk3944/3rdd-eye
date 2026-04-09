package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.ey;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.yu.vt;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw {

    /* renamed from: lh, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw f7941lh;
    public final com.bytedance.sdk.openadsdk.component.reward.view.pno ouw;
    public ouw vt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw(boolean z3, boolean z10, boolean z11, int i4);
    }

    public fkw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.f7941lh = ouwVar;
        this.ouw = new com.bytedance.sdk.openadsdk.component.reward.view.pno(ouwVar);
    }

    private void lh() {
        if (!vpp.yu(this.f7941lh.vt)) {
            com.bytedance.sdk.component.utils.ko.vt("TTAD.RFEndM", "TimeTrackLog report 408 from backup page");
            this.f7941lh.bs.ouw(false, TTAdConstant.DOWNLOAD_URL_CODE, "end_card_timeout");
        }
        this.f7941lh.bs.ko();
        this.f7941lh.bs.ouw(8);
        this.f7941lh.fak.ouw(8);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f7941lh;
        if (ouwVar.ra) {
            osn.ouw((View) ouwVar.coz.f8041jg, 8);
            this.f7941lh.ey.le(0);
        }
        this.f7941lh.ey.yu(8);
        if (!this.f7941lh.vt.cd()) {
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.f7941lh.f7959gh;
            if (pnoVar != null) {
                this.ouw.ouw(pnoVar.hun().tlj.tlj());
            }
            this.ouw.ouw();
        } else if (!this.ouw.ouw(this.f7941lh.ex)) {
            this.f7941lh.jvy.finish();
        }
        this.f7941lh.ey.ra();
        vt(this.f7941lh.coz);
        this.f7941lh.uoy.lh(false);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.f7941lh;
        ouwVar2.f7956cd.ouw(ouwVar2.vt.ey());
    }

    private boolean vt(com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar) {
        boolean z3;
        this.f7941lh.pno = vt();
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFEndM", "showEndCard: cT2=" + this.f7941lh.pno);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f7941lh;
        vpp vppVar = ouwVar.vt;
        if (vppVar.an) {
            return false;
        }
        int i4 = ouwVar.pno;
        if (i4 != -1) {
            if (i4 >= 0) {
                ouwVar.zin.set(false);
                Message messageObtain = Message.obtain();
                messageObtain.what = 700;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.f7941lh;
                messageObtain.arg1 = ouwVar2.pno;
                ouwVar2.ux.sendMessage(messageObtain);
                if (!od.ra(this.f7941lh.vt)) {
                    z3 = true;
                }
            }
            z3 = false;
        } else if (ouwVar.f7959gh == null && od.pno(vppVar) && this.f7941lh.bs.ryl.get()) {
            vtVar.zin();
            z3 = false;
        } else {
            vtVar.jg();
            z3 = true;
        }
        if (this.f7941lh.bs.cf() ? false : z3) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.f7941lh;
            if (ouwVar3.f7966sd == null || !ouwVar3.vt()) {
                return true;
            }
            this.f7941lh.f7966sd.ouw(r7.pno);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ouw(boolean r6, boolean r7, boolean r8, com.bytedance.sdk.openadsdk.component.reward.vt.vt r9, int r10) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ouw.fkw.ouw(boolean, boolean, boolean, com.bytedance.sdk.openadsdk.component.reward.vt.vt, int):void");
    }

    private int vt() {
        int i4 = this.f7941lh.vt.xne;
        if (i4 <= 5000 && i4 >= 0) {
            if (i4 < 1000) {
                i4 += 1000;
            }
            com.bytedance.sdk.openadsdk.core.zih.yu();
            int iOuw = com.bytedance.sdk.openadsdk.core.settings.cf.ouw(this.f7941lh.vt.fqk());
            if (iOuw <= 5000 && iOuw >= 0) {
                if (iOuw < 1000) {
                    iOuw += 1000;
                }
                return Math.min(i4, iOuw);
            }
        }
        return -1;
    }

    private void ouw(boolean z3, boolean z10, boolean z11, int i4) {
        int i10;
        HashMap map = new HashMap();
        if (this.f7941lh.bs.vm()) {
            i10 = 1;
        } else {
            i10 = !this.f7941lh.bs.mwh ? -1 : 2;
        }
        map.put("webview_state", Integer.valueOf(i10));
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f7941lh;
        com.bytedance.sdk.openadsdk.yu.lh.ouw(ouwVar.vt, ouwVar.fkw, z3, z10, z11, ouwVar.jvy.isFinishing(), i4, map);
    }

    public final void ouw(boolean z3, com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar) {
        mwh mwhVar;
        this.f7941lh.vm.set(z3);
        vtVar.mwh();
        this.f7941lh.vt.cd();
        this.f7941lh.uoy.yu(false);
        this.f7941lh.uoy.lh(false);
        this.f7941lh.bs.jg();
        th thVar = this.f7941lh.ey.rn;
        if (thVar != null) {
            thVar.yu();
        }
        this.f7941lh.ey.lh();
        com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = this.f7941lh.jae;
        if (tljVar != null) {
            tljVar.vt();
        }
        pno pnoVar = this.f7941lh.ksc;
        if (pnoVar != null) {
            pnoVar.vt(pno.f7971lh);
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f7941lh;
        if (!TextUtils.isEmpty(vpp.ouw(ouwVar.hun, ouwVar.vt))) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.f7941lh;
            com.bytedance.sdk.openadsdk.utils.vpp.ouw(ouwVar2.jvy, od.cf(ouwVar2.vt), this.f7941lh.vt, vt.ouw.f8852lh);
            return;
        }
        if (vpp.lh(this.f7941lh.vt) && (mwhVar = this.f7941lh.fak) != null) {
            mwhVar.pno = SystemClock.elapsedRealtime();
        }
        if (!vpp.ouw(this.f7941lh.vt) && (vpp.lh(this.f7941lh.vt) || !this.f7941lh.bs.th())) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.f7941lh;
            vpp vppVar = ouwVar3.vt;
            boolean z10 = ouwVar3.bs.ryl.get();
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = this.f7941lh;
            if (vpp.ouw(vppVar, z10, ouwVar4.bs.ucs, ouwVar4.fak.yu.get(), this.f7941lh.bs.zih)) {
                if (!vpp.yu(this.f7941lh.vt) && !vpp.lh(this.f7941lh.vt)) {
                    com.bytedance.sdk.component.utils.ko.vt("TTAD.RFEndM", "TimeTrackLog report Success from Android");
                    this.f7941lh.bs.ouw(true, 0, (String) null);
                }
                vt(vtVar);
                ouw(vtVar);
                return;
            }
        }
        lh();
    }

    private void ouw(com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar) {
        if (!vpp.lh(this.f7941lh.vt)) {
            this.f7941lh.fak.ouw(8);
            this.f7941lh.bs.ouw(0);
            this.f7941lh.bs.qbp();
        } else {
            this.f7941lh.bs.ouw(8);
            this.f7941lh.fak.ouw(0);
            this.f7941lh.fak.vt();
        }
        if (this.f7941lh.ra) {
            osn.ouw((View) vtVar.f8041jg, 0);
            this.f7941lh.ey.le(8);
        }
        this.f7941lh.ey.yu(8);
        this.f7941lh.ey.ra();
        if (vpp.lh(this.f7941lh.vt)) {
            this.f7941lh.ux.sendEmptyMessageDelayed(800, 100L);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f7941lh;
        ouwVar.bs.vt(ouwVar.f7958cj);
        this.f7941lh.bs.bly();
        this.f7941lh.bs.le();
        bs bsVar = this.f7941lh.bs.ra;
        if (bsVar != null) {
            bsVar.ouw("prerender_page_show", (JSONObject) null);
        }
        if (!od.vt(this.f7941lh.vt)) {
            this.f7941lh.uoy.lh(false);
        }
        com.bytedance.sdk.component.bly.le leVar = this.f7941lh.bs.f7979le;
        if (leVar == null || leVar.getWebView() == null) {
            return;
        }
        leVar.le();
        leVar.getWebView().resumeTimers();
    }

    public final void ouw() {
        zih zihVar = this.ouw.yu;
        if (zihVar != null) {
            DeviceUtils.AudioInfoReceiver.vt(zihVar);
            com.bytedance.sdk.component.bly.le leVar = zihVar.f7995lh;
            if (leVar != null) {
                ey.ouw(leVar.getWebView());
            }
        }
    }

    private boolean ouw(boolean z3) {
        if (!th.lh(this.f7941lh.vt)) {
            return true;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f7941lh;
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar = ouwVar.jae.ouw;
        if (yuVar == null || yuVar.yu != 0 || z3) {
            return true;
        }
        ouwVar.uoy.lh(false);
        return false;
    }
}

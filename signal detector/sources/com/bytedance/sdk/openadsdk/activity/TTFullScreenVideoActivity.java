package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.emc.emc.emc.xq.c;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.openadsdk.common.vk;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.bytedance.sdk.openadsdk.core.sb;
import com.bytedance.sdk.openadsdk.core.sf;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.cf;
import com.bytedance.sdk.openadsdk.dg.ru;
import com.bytedance.sdk.openadsdk.utils.iyl;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {
    private static com.bytedance.sdk.openadsdk.emc.xq.ypw sba;
    private com.bytedance.sdk.openadsdk.emc.xq.ypw aa;
    private boolean yzg;

    private void dg(int i) {
        this.ypw.cuf.emc(null, String.format(rie.emc(aa.emc(), "tt_skip_ad_time_text"), Integer.valueOf(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mxo() {
        toString();
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            emc("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.emc.xq.ypw ypwVar = this.aa;
        if (ypwVar != null) {
            ypwVar.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean ee() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void emc(String str, JSONObject jSONObject) {
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.sz) {
            return;
        }
        sba = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.ypw != null) {
            com.bytedance.sdk.openadsdk.ycc.ypw.emc().emc("videoForceBreak", this.ypw.ypw);
        }
        try {
            uym();
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void hj() {
        mxo();
        this.ypw.ypw.fwh();
        this.ypw.ypw.xq(true);
        if (com.bytedance.sdk.openadsdk.core.model.rie.bw(this.ypw.ypw)) {
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
            com.bytedance.sdk.openadsdk.core.model.rie rieVar = emcVar.ypw;
            com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar, emcVar.bw, rieVar.ph());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean hxp() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void iyl() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void mkp() {
        if (this.ypw.ypw.kx() != 100.0f) {
            this.yzg = true;
        }
        mxo();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
        if (emcVar == null || com.bytedance.sdk.openadsdk.core.model.rie.bw(emcVar.ypw)) {
            return;
        }
        c cVarIat = this.ypw.ypw.iat();
        if (cVarIat == null) {
            c cVar = new c();
            cVar.f6583d = 10.0d;
            this.ypw.ypw.emc(cVar);
        } else if (cVarIat.f6583d <= 0.0d) {
            cVarIat.f6583d = 10.0d;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        uym();
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            emc("recycleRes");
        }
        emc(isFinishing(), isChangingConfigurations());
        if (this.sz) {
            return;
        }
        this.aa = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.sz) {
            sba = this.aa;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
        if (emcVar == null || !ypw(emcVar.ypw) || emc(this.ypw.ypw)) {
            return;
        }
        if (this.yzg) {
            this.yzg = false;
            finish();
        } else if (this.ypw.xmt.sb()) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void rie() {
        final View viewRu = this.ypw.mkp.ru();
        if (viewRu != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTFullScreenVideoActivity.this.ypw.xmt.ul() && TTFullScreenVideoActivity.this.ypw.zz.get()) {
                        boolean zSz = TTFullScreenVideoActivity.this.ypw.lt.sz();
                        TTFullScreenVideoActivity.this.ypw.xmt.ycc(zSz);
                        TTFullScreenVideoActivity.this.ypw.mkp.ycc(8);
                        View view2 = viewRu;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.ycc.dg) {
                            ((com.bytedance.sdk.openadsdk.core.ycc.dg) view2).setImageResource(rie.dg(TTFullScreenVideoActivity.this.ypw.vw, "tt_close_btn"));
                        }
                        TTFullScreenVideoActivity.this.ypw.ra.sendEmptyMessageDelayed(600, 5000L);
                        if (!com.bytedance.sdk.openadsdk.core.model.rie.xq(TTFullScreenVideoActivity.this.ypw.ypw)) {
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.core.model.rie.xq(TTFullScreenVideoActivity.this.ypw.ypw) && zSz) {
                            return;
                        }
                    }
                    TTFullScreenVideoActivity.this.ypw.xmt.ylm();
                    TTFullScreenVideoActivity.this.ypw.lt.gbl();
                    TTFullScreenVideoActivity.this.ypw.db.ycc();
                    TTFullScreenVideoActivity.this.finish();
                }
            };
            viewRu.setOnClickListener(onClickListener);
            viewRu.setTag(viewRu.getId(), onClickListener);
        }
        this.ypw.cuf.emc(new com.bytedance.sdk.openadsdk.component.reward.top.ypw() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void dg(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void emc(View view) {
                com.bytedance.sdk.openadsdk.core.model.dg dgVarEh;
                com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
                com.bytedance.sdk.openadsdk.component.reward.view.xq xqVarEmc;
                if (dr.ycc(TTFullScreenVideoActivity.this.ypw.ypw) || (dr.bw(TTFullScreenVideoActivity.this.ypw.ypw) && TTFullScreenVideoActivity.this.ypw.rie.dg(com.bytedance.sdk.openadsdk.component.reward.emc.msw.ypw))) {
                    if (dr.msw(TTFullScreenVideoActivity.this.ypw.ypw)) {
                        TTFullScreenVideoActivity.this.ypw.rie.zz();
                        return;
                    }
                    View view2 = viewRu;
                    if (view2 != null) {
                        view2.performClick();
                        return;
                    } else {
                        TTFullScreenVideoActivity.this.finish();
                        return;
                    }
                }
                if (ul.emc(TTFullScreenVideoActivity.this.ypw.ypw) && !TTFullScreenVideoActivity.this.ypw.sz.get()) {
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                cf.emc emcVar = new cf.emc();
                emcVar.ypw(TTFullScreenVideoActivity.this.ypw.ylm.sup());
                emcVar.dg(TTFullScreenVideoActivity.this.ypw.ylm.ee());
                emcVar.xq(TTFullScreenVideoActivity.this.ypw.ylm.vk());
                emcVar.xq(3);
                emcVar.dg(TTFullScreenVideoActivity.this.ypw.ylm.hxp());
                emcVar.emc(TTFullScreenVideoActivity.this.ypw.ylm.ypw());
                com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(TTFullScreenVideoActivity.this.ypw.ylm.msw(), emcVar, TTFullScreenVideoActivity.this.ypw.ylm.bw());
                sb.xq(TTFullScreenVideoActivity.this.ypw.ycc);
                TTFullScreenVideoActivity.this.ypw.ylm.emc("skip", false);
                TTFullScreenVideoActivity.this.ypw.cuf.dg(false);
                com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = TTFullScreenVideoActivity.this.ypw;
                if (!emcVar2.xq || (ul.xq(emcVar2.ypw) && (xqVarEmc = TTFullScreenVideoActivity.this.ypw.hxp.emc()) != null && xqVarEmc.dg == 0)) {
                    TTFullScreenVideoActivity.this.finish();
                } else {
                    TTFullScreenVideoActivity.this.emc(true, 4);
                }
                com.bytedance.sdk.openadsdk.core.model.rie rieVar = TTFullScreenVideoActivity.this.ypw.ypw;
                if (rieVar != null && (dgVarEh = rieVar.eh()) != null && (dgVarEmc = dgVarEh.emc()) != null) {
                    dgVarEmc.ycc(TTFullScreenVideoActivity.this.ypw.ylm.sup());
                    dgVarEmc.bw(TTFullScreenVideoActivity.this.ypw.ylm.sup());
                }
                com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(TTFullScreenVideoActivity.this.ypw.ypw, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void xq(View view) {
                View view2 = viewRu;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void ypw(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.ypw.sf.emc(tTFullScreenVideoActivity.xq);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void emc(View view, String str) {
                com.bytedance.sdk.openadsdk.core.model.dg dgVarEh;
                com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
                com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = TTFullScreenVideoActivity.this.ypw;
                boolean z6 = !emcVar.yz;
                emcVar.yz = z6;
                emcVar.ylm.emc(z6, str);
                if (!dr.vk(TTFullScreenVideoActivity.this.ypw.ypw) || TTFullScreenVideoActivity.this.ypw.zz.get()) {
                    com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = TTFullScreenVideoActivity.this.ypw;
                    emcVar2.xmt.bw(emcVar2.yz);
                    com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar3 = TTFullScreenVideoActivity.this.ypw;
                    emcVar3.rie.ypw(emcVar3.yz);
                    com.bytedance.sdk.openadsdk.core.model.rie rieVar = TTFullScreenVideoActivity.this.ypw.ypw;
                    if (rieVar == null || (dgVarEh = rieVar.eh()) == null || (dgVarEmc = dgVarEh.emc()) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar4 = TTFullScreenVideoActivity.this.ypw;
                    if (emcVar4.yz) {
                        dgVarEmc.msw(emcVar4.ylm.sup());
                    } else {
                        dgVarEmc.zz(emcVar4.ylm.sup());
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void sba() {
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            emc("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.emc.xq.ypw ypwVar = this.aa;
            if (ypwVar != null) {
                ypwVar.emc();
            } else {
                com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
                ru.emc(emcVar != null ? emcVar.ypw : null, "show", 0);
            }
        }
        if (db()) {
            this.ypw.hxp.sz();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sz() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.ypw
            com.bytedance.sdk.openadsdk.core.model.rie r0 = r0.ypw
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.rie.bw(r0)
            r1 = 0
            if (r0 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.ypw
            boolean r2 = r0.xq
            if (r2 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.emc.sup r0 = r0.cuf
            java.lang.String r2 = "X"
            r0.emc(r1, r2)
            goto L24
        L19:
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.ypw
            com.bytedance.sdk.openadsdk.component.reward.emc.sup r0 = r0.cuf
            java.lang.String r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getSkipText()
            r0.emc(r1, r2)
        L24:
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.ypw
            com.bytedance.sdk.openadsdk.component.reward.emc.sup r0 = r0.cuf
            r1 = 1
            r0.bw(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.sz():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void ul() {
        com.bytedance.sdk.openadsdk.component.reward.view.xq xqVarEmc;
        super.ul();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
        if (emcVar == null || (xqVarEmc = emcVar.hxp.emc()) == null) {
            return;
        }
        xqVarEmc.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.bw() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.bw
            public void emc() {
                TTFullScreenVideoActivity.this.mxo();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout xmt() {
        return this.ypw.mkp.ycc();
    }

    public void xq(int i) {
        int iBhr = this.ypw.ypw.bhr();
        if (!aa.dg().ycc(String.valueOf(this.ypw.ycc)) || (!com.bytedance.sdk.openadsdk.core.model.rie.bw(this.ypw.ypw) && !this.ypw.xq)) {
            if (i >= iBhr) {
                com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
                if (!emcVar.ndl) {
                    emcVar.emc(true);
                }
                sz();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.ypw;
        if (!emcVar2.ndl) {
            emcVar2.emc(true);
        }
        if (i > iBhr) {
            sz();
        } else {
            dg(iBhr - i);
            this.ypw.cuf.bw(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void ycc() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void ypw(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public vk zz() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void ypw(boolean z6) {
    }

    private void emc(final String str) {
        iyl.xq(new com.bytedance.sdk.component.msw.msw("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTFullScreenVideoActivity.this.emc(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.ypw.xxg, str);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ul.xq("TTAD.FSVA", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    private boolean ypw(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        if (rieVar == null) {
            return false;
        }
        return aa.dg().ul(String.valueOf(this.ypw.ycc));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void dg() {
        toString();
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            emc("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.emc.xq.ypw ypwVar = this.aa;
        if (ypwVar != null) {
            ypwVar.ypw();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
            ru.emc(emcVar != null ? emcVar.ypw : null, "close", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void emc(Intent intent) {
        super.emc(intent);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void emc(Bundle bundle) {
        if (this.sz) {
            super.emc(bundle);
            this.aa = (com.bytedance.sdk.openadsdk.emc.xq.ypw) sf.emc().emc(this.ru, com.bytedance.sdk.openadsdk.emc.xq.ypw.class);
            return;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            this.aa = sf.emc().xq();
        }
        if (this.aa != null || bundle == null) {
            return;
        }
        this.aa = sba;
        sba = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void emc(long j6, long j7) {
        xq((int) (j6 / 1000));
        int i = this.ycc;
        if (i >= 0) {
            this.ypw.cuf.emc(String.valueOf(i), null);
        }
    }

    private boolean emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        return rieVar == null || rieVar.kx() == 100.0f;
    }
}

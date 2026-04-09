package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.sba;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.emc;
import com.bytedance.sdk.openadsdk.common.vk;
import com.bytedance.sdk.openadsdk.component.reward.sup;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.rie;
import com.bytedance.sdk.openadsdk.core.sf;
import com.bytedance.sdk.openadsdk.core.sra;
import com.bytedance.sdk.openadsdk.core.widget.ypw;
import com.bytedance.sdk.openadsdk.dg.ru;
import com.bytedance.sdk.openadsdk.utils.db;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static String hxp;
    private static String rie;
    private static com.bytedance.sdk.openadsdk.emc.bw.emc sb;
    private static String sra;
    private static String ul;
    private static String ylm;

    /* renamed from: aa, reason: collision with root package name */
    protected int f9249aa;
    private String db;
    private String ee;
    protected int sba;
    private boolean xmt;
    protected com.bytedance.sdk.openadsdk.emc.bw.emc yzg;
    private final AtomicBoolean sf = new AtomicBoolean(false);
    private int dr = -1;

    private JSONObject ra() {
        JSONObject jSONObject = new JSONObject();
        int iDb = (int) this.ypw.ylm.db();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.ypw.ypw.rig());
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.ypw.ypw.pe());
            jSONObject.put("network", sba.xq(getApplicationContext()));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int iNx = this.ypw.ypw.nx();
            String strDg = "unKnow";
            if (iNx == 2) {
                strDg = tp.ypw();
            } else if (iNx == 1) {
                strDg = tp.dg();
            }
            jSONObject.put("user_agent", strDg);
            JSONObject jSONObjectLdy = this.ypw.ypw.ldy();
            jSONObjectLdy.put("gaid", com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.emc().ypw());
            jSONObject.put("extra", jSONObjectLdy);
            jSONObject.put("media_extra", this.ee);
            jSONObject.put("video_duration", this.ypw.ypw.iat().E());
            jSONObject.put("play_start_ts", this.f9249aa);
            jSONObject.put("play_end_ts", this.sba);
            jSONObject.put("duration", iDb);
            jSONObject.put("user_id", this.db);
            jSONObject.put("trans_id", db.emc().replace("-", ""));
            return jSONObject;
        } catch (Throwable th) {
            ul.emc("TTAD.RVA", "", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void tp() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.dg.bw.ypw.cf$emc r0 = new com.bytedance.sdk.openadsdk.dg.bw.ypw.cf$emc
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r1 = r3.ypw
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r1 = r1.ylm
            long r1 = r1.sup()
            r0.ypw(r1)
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r1 = r3.ypw
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r1 = r1.ylm
            long r1 = r1.ee()
            r0.dg(r1)
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r1 = r3.ypw
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r1 = r1.ylm
            long r1 = r1.vk()
            r0.xq(r1)
            r1 = 3
            r0.xq(r1)
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r1 = r3.ypw
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r1 = r1.ylm
            int r1 = r1.hxp()
            r0.dg(r1)
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r1 = r3.ypw
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r1 = r1.ylm
            long r1 = r1.ypw()
            r0.emc(r1)
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r1 = r3.ypw
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r1 = r1.ylm
            w2.a r1 = r1.msw()
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r2 = r3.ypw
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r2 = r2.ylm
            com.bytedance.sdk.openadsdk.dg.uym r2 = r2.bw()
            com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(r1, r0, r2)
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.ypw
            int r0 = r0.ycc
            com.bytedance.sdk.openadsdk.core.sb.xq(r0)
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.ypw
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r0 = r0.ylm
            java.lang.String r1 = "skip"
            r2 = 0
            r0.emc(r1, r2)
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.ypw
            boolean r1 = r0.xq
            if (r1 == 0) goto La1
            com.bytedance.sdk.openadsdk.core.model.rie r0 = r0.ypw
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.ul.xq(r0)
            r1 = 4
            r2 = 1
            if (r0 == 0) goto L8a
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.ypw
            com.bytedance.sdk.openadsdk.component.reward.view.zz r0 = r0.hxp
            com.bytedance.sdk.openadsdk.component.reward.view.xq r0 = r0.emc()
            if (r0 == 0) goto L86
            int r0 = r0.dg
            if (r0 != 0) goto L86
            r3.finish()
            goto L8d
        L86:
            r3.emc(r2, r1)
            goto L8d
        L8a:
            r3.emc(r2, r1)
        L8d:
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.ypw
            com.bytedance.sdk.openadsdk.core.model.rie r0 = r0.ypw
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.ul.emc(r0)
            if (r0 == 0) goto La4
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.ypw
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.sz
            boolean r0 = r0.get()
            if (r0 != 0) goto La4
        La1:
            r3.finish()
        La4:
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.ypw
            com.bytedance.sdk.openadsdk.core.model.rie r0 = r0.ypw
            com.bytedance.sdk.openadsdk.core.model.dg r0 = r0.eh()
            if (r0 == 0) goto Lc2
            com.bytedance.sdk.openadsdk.core.sup.dg r0 = r0.emc()
            if (r0 == 0) goto Lc2
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r1 = r3.ypw
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r1 = r1.ylm
            long r1 = r1.sup()
            r0.ycc(r1)
            r0.bw(r1)
        Lc2:
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.ypw
            com.bytedance.sdk.openadsdk.core.model.rie r0 = r0.ypw
            r1 = 5
            com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.tp():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vw() {
        toString();
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            emc("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.emc.bw.emc emcVar = this.yzg;
        if (emcVar != null) {
            emcVar.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void aa() {
        mxo();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void dr() {
        this.sba = (int) (System.currentTimeMillis() / 1000);
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
        sb = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.ypw != null) {
            com.bytedance.sdk.openadsdk.ycc.ypw.emc().emc("videoForceBreak", this.ypw.ypw);
        }
        uym();
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void hj() {
        vw();
        this.ypw.ypw.fwh();
        this.ypw.ypw.xq(true);
        if (rie.bw(this.ypw.ypw)) {
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
            rie rieVar = emcVar.ypw;
            com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar, emcVar.bw, rieVar.ph());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean hxp() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void iyl() {
        xq(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void mkp() {
        vw();
    }

    public void mxo() {
        xq(0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar;
        rie rieVar;
        super.onCreate(bundle);
        try {
            if (ul == null) {
                ul = com.bytedance.sdk.component.utils.rie.emc(this, "tt_reward_msg");
                ylm = com.bytedance.sdk.component.utils.rie.emc(this, "tt_msgPlayable");
                sra = com.bytedance.sdk.component.utils.rie.emc(this, "tt_negtiveBtnBtnText");
                rie = com.bytedance.sdk.component.utils.rie.emc(this, "tt_postiveBtnText");
                hxp = com.bytedance.sdk.component.utils.rie.emc(this, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            ul.xq("TTAD.RVA", th.getMessage());
        }
        if (bundle == null || (emcVar = this.ypw) == null || (rieVar = emcVar.ypw) == null || !rieVar.wo()) {
            return;
        }
        this.sf.set(true);
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
        this.yzg = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        sup supVar;
        super.onPause();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
        if (emcVar == null || (supVar = emcVar.yid) == null) {
            return;
        }
        supVar.emc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        sup supVar;
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
        if (emcVar == null || (supVar = emcVar.yid) == null) {
            return;
        }
        supVar.ypw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.sz) {
            sb = this.yzg;
        }
        if (this.sf.get() && (emcVar = this.ypw) != null) {
            emcVar.ypw.ra();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void rie() {
        final View viewRu = this.ypw.mkp.ru();
        if (viewRu != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTRewardVideoActivity.this.ypw.xmt.ul() && TTRewardVideoActivity.this.ypw.zz.get()) {
                        boolean zSz = TTRewardVideoActivity.this.ypw.lt.sz();
                        TTRewardVideoActivity.this.ypw.xmt.ycc(zSz);
                        TTRewardVideoActivity.this.ypw.mkp.ycc(8);
                        View view2 = viewRu;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.ycc.dg) {
                            ((com.bytedance.sdk.openadsdk.core.ycc.dg) view2).setImageResource(com.bytedance.sdk.component.utils.rie.dg(TTRewardVideoActivity.this.ypw.vw, "tt_close_btn"));
                        }
                        TTRewardVideoActivity.this.ypw.ra.sendEmptyMessageDelayed(Sdk$SDKError.Reason.NATIVE_ASSET_ERROR_VALUE, 5000L);
                        if (!rie.xq(TTRewardVideoActivity.this.ypw.ypw)) {
                            return;
                        }
                        if (rie.xq(TTRewardVideoActivity.this.ypw.ypw) && zSz) {
                            return;
                        }
                    }
                    TTRewardVideoActivity.this.ypw.xmt.ylm();
                    TTRewardVideoActivity.this.ypw.lt.gbl();
                    TTRewardVideoActivity.this.ypw.db.ycc();
                    if (dr.dg(TTRewardVideoActivity.this.ypw.ypw)) {
                        TTRewardVideoActivity.this.xq(true, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            };
            viewRu.setOnClickListener(onClickListener);
            viewRu.setTag(viewRu.getId(), onClickListener);
        }
        this.ypw.cuf.emc(new com.bytedance.sdk.openadsdk.component.reward.top.ypw() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.6
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void dg(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void emc(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.xq(dr.xq(tTRewardVideoActivity.ypw.ypw), false);
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
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.ypw.sf.emc(tTRewardVideoActivity.xq);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void emc(View view, String str) {
                com.bytedance.sdk.openadsdk.core.model.dg dgVarEh;
                com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
                TTRewardVideoActivity.this.ypw.yz = !r3.yz;
                StringBuilder sb2 = new StringBuilder("will set is Mute ");
                sb2.append(TTRewardVideoActivity.this.ypw.yz);
                sb2.append(" mLastVolume=");
                sb2.append(TTRewardVideoActivity.this.ypw.dr.emc());
                com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = TTRewardVideoActivity.this.ypw;
                emcVar.ylm.emc(emcVar.yz, str);
                if (!dr.vk(TTRewardVideoActivity.this.ypw.ypw) || TTRewardVideoActivity.this.ypw.zz.get()) {
                    com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = TTRewardVideoActivity.this.ypw;
                    emcVar2.xmt.bw(emcVar2.yz);
                    com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar3 = TTRewardVideoActivity.this.ypw;
                    emcVar3.rie.ypw(emcVar3.yz);
                    rie rieVar = TTRewardVideoActivity.this.ypw.ypw;
                    if (rieVar == null || (dgVarEh = rieVar.eh()) == null || (dgVarEmc = dgVarEh.emc()) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar4 = TTRewardVideoActivity.this.ypw;
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
            com.bytedance.sdk.openadsdk.emc.bw.emc emcVar = this.yzg;
            if (emcVar != null) {
                emcVar.emc();
            } else {
                com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.ypw;
                ru.emc(emcVar2 != null ? emcVar2.ypw : null, "show", 0);
            }
        }
        if (db()) {
            this.ypw.hxp.sz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void sf() {
        mxo();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void sz() {
        this.ypw.cuf.emc(null, TTAdDislikeToast.getSkipText());
        this.ypw.cuf.bw(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void ul() {
        com.bytedance.sdk.openadsdk.component.reward.view.xq xqVarEmc;
        super.ul();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
        if (emcVar == null || (xqVarEmc = emcVar.hxp.emc()) == null) {
            return;
        }
        xqVarEmc.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.bw() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.bw
            public void emc() {
                TTRewardVideoActivity.this.vw();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout xmt() {
        return this.ypw.mkp.ycc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void ycc() {
        sup supVar;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
        if (emcVar == null || (supVar = emcVar.yid) == null) {
            return;
        }
        supVar.dg();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public vk zz() {
        return new vk(this.ypw) { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.vk
            public boolean emc() {
                return TTRewardVideoActivity.this.xmt;
            }

            @Override // com.bytedance.sdk.openadsdk.common.vk
            public void xq() {
                TTRewardVideoActivity.this.finish();
            }

            @Override // com.bytedance.sdk.openadsdk.common.vk
            public boolean ypw() {
                return TTRewardVideoActivity.this.sf.get();
            }

            @Override // com.bytedance.sdk.openadsdk.common.vk
            public void emc(boolean z10) {
                TTRewardVideoActivity.this.xmt = z10;
            }

            @Override // com.bytedance.sdk.openadsdk.common.vk
            public void emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
                com.bytedance.sdk.openadsdk.common.emc.emc(emcVar, new emc.ypw() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.2.1
                    @Override // com.bytedance.sdk.openadsdk.common.emc.ypw
                    public void emc(boolean z10, int i10) {
                        TTRewardVideoActivity.this.emc(z10, i10);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.emc.ypw
                    public void emc() {
                        TTRewardVideoActivity.this.finish();
                    }
                });
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void dg() {
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            emc("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.emc.bw.emc emcVar = this.yzg;
        if (emcVar != null) {
            emcVar.ypw();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.ypw;
            ru.emc(emcVar2 != null ? emcVar2.ypw : null, "close", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void xq() {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar;
        super.xq();
        if (this.sf.get() || (emcVar = this.ypw) == null) {
            return;
        }
        emcVar.yid = new sup(new sup.emc() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.sup.emc
            public void emc() {
                if (TTRewardVideoActivity.this.sf.get() || TTRewardVideoActivity.this.xmt) {
                    return;
                }
                TTRewardVideoActivity.this.xq(1);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void ypw(boolean z10, boolean z11) {
        this.f9249aa = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void ypw(int i10) {
        if (i10 == 10000) {
            mxo();
        }
    }

    public void ypw(long j10, long j11) {
        if (j11 <= 0) {
            return;
        }
        if (this.dr == -1) {
            this.dr = Math.min(100, this.ypw.ypw.bv());
        }
        if (((j10 / 1000.0f) / j11) * 100.0f >= this.dr) {
            mxo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xq(final boolean z10, boolean z11) {
        if (!z11 && this.xmt && this.ypw.zz.get() && dr.msw(this.ypw.ypw)) {
            this.ypw.rie.zz();
            return;
        }
        if (!aa.dg().msw(String.valueOf(this.ypw.ycc))) {
            if (!z11 && this.ypw.zz.get() && dr.msw(this.ypw.ypw)) {
                this.ypw.rie.zz();
                return;
            } else if (z10) {
                finish();
                return;
            } else {
                tp();
                return;
            }
        }
        if (this.sf.get()) {
            if (this.ypw.zz.get() && dr.msw(this.ypw.ypw)) {
                this.ypw.rie.zz();
                return;
            } else if (z10) {
                finish();
                return;
            } else {
                tp();
                return;
            }
        }
        if (dr.msw(this.ypw.ypw) && this.ypw.xmt.msw().getVisibility() == 0) {
            this.ypw.rie.zz();
            return;
        }
        this.ypw.f9273aa.set(true);
        this.ypw.ylm.ylm();
        if (z10) {
            this.ypw.rie.ycc();
        }
        final com.bytedance.sdk.openadsdk.core.widget.ypw ypwVar = new com.bytedance.sdk.openadsdk.core.widget.ypw(this);
        this.xq.sup = ypwVar;
        if (z10) {
            ypwVar.emc(ylm).ypw(hxp).xq(sra);
        } else {
            ypwVar.emc(ul).ypw(rie).xq(sra);
        }
        this.xq.sup.emc(new ypw.InterfaceC0165ypw() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.ypw.InterfaceC0165ypw
            public void emc() {
                TTRewardVideoActivity.this.ypw.ylm.ul();
                if (z10) {
                    TTRewardVideoActivity.this.ypw.rie.emc(1000);
                }
                ypwVar.dismiss();
                TTRewardVideoActivity.this.ypw.f9273aa.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ypw.InterfaceC0165ypw
            public void ypw() {
                ypwVar.dismiss();
                TTRewardVideoActivity.this.xmt = true;
                TTRewardVideoActivity.this.ypw.f9273aa.set(false);
                TTRewardVideoActivity.this.ypw.rie.ypw(Integer.MAX_VALUE);
                if (!z10 || !dr.ycc(TTRewardVideoActivity.this.ypw.ypw)) {
                    TTRewardVideoActivity.this.tp();
                } else if (dr.msw(TTRewardVideoActivity.this.ypw.ypw)) {
                    TTRewardVideoActivity.this.ypw.rie.zz();
                } else {
                    TTRewardVideoActivity.this.ypw.db.ycc();
                    TTRewardVideoActivity.this.finish();
                }
            }
        }).show();
    }

    public void emc(String str) {
        emc(str, false, 0, "", 0, "");
    }

    private void emc(final String str, final boolean z10, final int i10, final String str2, final int i11, final String str3) {
        iyl.xq(new com.bytedance.sdk.component.msw.msw("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTRewardVideoActivity.this.emc(0).executeRewardVideoCallback(TTRewardVideoActivity.this.ypw.xxg, str, z10, i10, str2, i11, str3);
                } catch (Throwable th) {
                    ul.xq("TTAD.RVA", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void emc(Bundle bundle) {
        if (this.sz) {
            super.emc(bundle);
            this.yzg = (com.bytedance.sdk.openadsdk.emc.bw.emc) sf.emc().emc(this.ru, com.bytedance.sdk.openadsdk.emc.bw.emc.class);
        } else {
            if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                this.yzg = sf.emc().ypw();
            }
            if (this.yzg == null && bundle != null) {
                this.yzg = sb;
                sb = null;
            }
        }
        Log.e("TTAD.RVA", "initListener: listenerKey = " + this.ru + ",mRewardAdInteractionListener = " + this.yzg + ",savedInstanceState = " + bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void ypw(boolean z10) {
        if (z10) {
            mxo();
            return;
        }
        if ((1.0d - (this.ycc / this.ypw.ylm.iyl())) * 100.0d >= aa.dg().db(String.valueOf(this.ypw.ycc)).ycc) {
            mxo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void emc(@NonNull Intent intent) {
        super.emc(intent);
        this.ee = intent.getStringExtra("media_extra");
        this.db = intent.getStringExtra("user_id");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void emc(long j10, long j11) {
        int i10 = (int) (j10 / 1000);
        int iIw = this.ypw.ypw.iw();
        boolean z10 = iIw >= 0;
        xq(j10, j11);
        if (this.ycc > 0) {
            this.ypw.cuf.dg(true);
            if (z10 && i10 >= iIw) {
                this.ypw.emc(true);
                this.ypw.cuf.emc(String.valueOf(this.ycc), TTAdDislikeToast.getSkipText());
                this.ypw.cuf.bw(true);
                return;
            }
            this.ypw.cuf.emc(String.valueOf(this.ycc), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(final boolean z10, final int i10, final String str, final int i11, final String str2, final int i12) {
        toString();
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            emc("onRewardVerify", z10, i10, str, i11, str2);
            sup.emc(this.ypw.ypw, z10, i12);
        } else {
            iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.8
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.emc.bw.emc emcVar = TTRewardVideoActivity.this.yzg;
                    if (emcVar != null) {
                        emcVar.emc(z10, i10, str, i11, str2);
                        sup.emc(TTRewardVideoActivity.this.ypw.ypw, z10, i12);
                    }
                }
            });
        }
    }

    public void xq(final int i10) {
        if (this.sf.get() || this.xmt) {
            return;
        }
        this.sf.set(true);
        sup supVar = this.ypw.yid;
        if (supVar != null) {
            supVar.xq();
        }
        if (aa.dg().vk(String.valueOf(this.ypw.ycc))) {
            emc(true, this.ypw.ypw.pe(), this.ypw.ypw.rig(), 0, "", i10);
        } else {
            aa.xq().emc(ra(), new sra.ypw() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.9
                @Override // com.bytedance.sdk.openadsdk.core.sra.ypw
                public void emc(int i11, String str) {
                    TTRewardVideoActivity.this.emc(false, 0, "", i11, str, i10);
                }

                @Override // com.bytedance.sdk.openadsdk.core.sra.ypw
                public void emc(rie.ypw ypwVar) {
                    boolean z10 = ypwVar.ypw;
                    TTRewardVideoActivity.this.emc(ypwVar.ypw, ypwVar.xq.emc(), ypwVar.xq.ypw(), 0, "", i10);
                }
            });
        }
    }

    public void xq(long j10, long j11) {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
        boolean z10 = false;
        if (emcVar != null) {
            if (emcVar.ypw.bv() >= 0 && this.ypw.ypw.eg() >= 0) {
                z10 = true;
            }
            if (z10) {
                j11 = this.ypw.ypw.eg();
            }
        }
        long j12 = j10 + (this.ypw.pxa * 1000);
        if (z10) {
            ypw(j12, j11);
            return;
        }
        if (this.dr == -1) {
            this.dr = aa.dg().db(String.valueOf(this.ypw.ycc)).ycc;
        }
        if (j11 <= 0) {
            return;
        }
        if (j11 >= 30000 && j12 >= 27000) {
            mxo();
        } else if ((j12 * 100) / j11 >= this.dr) {
            mxo();
        }
    }
}

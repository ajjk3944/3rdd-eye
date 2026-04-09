package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.ouw;
import com.bytedance.sdk.openadsdk.component.reward.tlj;
import com.bytedance.sdk.openadsdk.core.jqy;
import com.bytedance.sdk.openadsdk.core.model.fvf;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.core.widget.vt;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.ex;
import com.bytedance.sdk.openadsdk.utils.uoy;
import d.h;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static String ex;
    private static com.bytedance.sdk.openadsdk.ouw.fkw.ouw jae;
    private static String jqy;
    private static String qbp;
    private static String vpp;
    private static String zin;
    private String ksc;
    private String tc;

    /* renamed from: th, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.ouw.fkw.ouw f7726th;
    private boolean uq;
    protected int vm;
    protected int zih;

    /* renamed from: od, reason: collision with root package name */
    private final AtomicBoolean f7725od = new AtomicBoolean(false);

    /* renamed from: cd, reason: collision with root package name */
    private int f7724cd = -1;

    private JSONObject fak() {
        JSONObject jSONObject = new JSONObject();
        int iRn = (int) this.vt.ex.rn();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("reward_name", this.vt.vt.mt);
            jSONObject.put("reward_amount", this.vt.vt.xdk);
            jSONObject.put("network", ksc.ouw(getApplicationContext(), 60000L));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int i4 = this.vt.vt.f8316vi;
            String strFkw = "unKnow";
            if (i4 == 2) {
                strFkw = uoy.lh();
            } else if (i4 == 1) {
                strFkw = uoy.fkw();
            }
            jSONObject.put("user_agent", strFkw);
            JSONObject jSONObjectFak = this.vt.vt.fak();
            jSONObjectFak.put("gaid", com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().vt());
            jSONObject.put("extra", jSONObjectFak);
            jSONObject.put("media_extra", this.tc);
            jSONObject.put("video_duration", this.vt.vt.f8309sd.f6576d);
            jSONObject.put("play_start_ts", this.zih);
            jSONObject.put("play_end_ts", this.vm);
            jSONObject.put("duration", iRn);
            jSONObject.put("user_id", this.ksc);
            jSONObject.put("trans_id", ex.ouw().replace("-", ""));
            return jSONObject;
        } catch (Throwable th2) {
            qbp.ouw("TTAD.RVA", "", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fvf() {
        qbp.ouw("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar = this.f7726th;
        if (ouwVar != null) {
            ouwVar.onAdClicked();
        }
    }

    public static /* synthetic */ boolean lh(TTRewardVideoActivity tTRewardVideoActivity) {
        tTRewardVideoActivity.uq = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void pd() {
        /*
            r4 = this;
            com.bytedance.sdk.openadsdk.yu.fkw.vt.ko$ouw r0 = new com.bytedance.sdk.openadsdk.yu.fkw.vt.ko$ouw
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r1 = r1.fkw()
            r0.ouw(r1)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r1 = r1.ko()
            r0.vt(r1)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r1 = r1.pno()
            r0.vt = r1
            r1 = 3
            r0.tlj = r1
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            int r1 = r1.jg()
            r0.ryl = r1
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r2 = r1.f7946jg
            r0.f8763le = r2
            a9.a r1 = r1.lh()
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r2 = r4.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r2 = r2.ex
            com.bytedance.sdk.openadsdk.yu.ra r2 = r2.zin
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(r1, r0, r2)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.vt
            int r0 = r0.f7961le
            com.bytedance.sdk.openadsdk.core.jae.ouw(r0)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r0 = r0.ex
            java.lang.String r1 = "skip"
            r2 = 0
            r0.ouw(r1, r2)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.vt
            boolean r1 = r0.f7962lh
            if (r1 == 0) goto L93
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.th.lh(r0)
            r1 = 4
            r2 = 1
            if (r0 == 0) goto L7c
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.vt
            com.bytedance.sdk.openadsdk.component.reward.view.tlj r0 = r0.jae
            com.bytedance.sdk.openadsdk.component.reward.view.yu r0 = r0.ouw
            if (r0 == 0) goto L78
            int r0 = r0.yu
            if (r0 != 0) goto L78
            r4.finish()
            goto L7f
        L78:
            r4.ouw(r2, r1)
            goto L7f
        L7c:
            r4.ouw(r2, r1)
        L7f:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.vt
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.th.ouw(r0)
            if (r0 == 0) goto L96
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.vt
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.rn
            boolean r0 = r0.get()
            if (r0 != 0) goto L96
        L93:
            r4.finish()
        L96:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.vt
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            com.bytedance.sdk.openadsdk.core.model.yu r0 = r0.sd()
            if (r0 == 0) goto Lb2
            com.bytedance.sdk.openadsdk.core.ryl.yu r0 = r0.ouw
            if (r0 == 0) goto Lb2
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r1 = r1.fkw()
            r0.fkw(r1)
            r0.yu(r1)
        Lb2:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.vt
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            r1 = 5
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.pd():void");
    }

    private void uoy() {
        tlj tljVar;
        if (com.bytedance.sdk.openadsdk.vpp.ouw.ra() && isChangingConfigurations()) {
            qbp.ouw("BVA", "reward callback close is invoke by config change.");
            return;
        }
        if (this.ra) {
            qbp.ouw("BVA", "invoke callback onAdClose has already been called ");
            return;
        }
        this.ra = true;
        qbp.ouw("BVA", "invoke callback onAdClose, ");
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.ko;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        vpp vppVar = ouwVar != null ? ouwVar.vt : null;
        if (vppVar != null && jElapsedRealtime > 0) {
            vppVar.vby = jElapsedRealtime;
        }
        if (vppVar != null) {
            vppVar.ybr = ouwVar.tlj.get() ? 1 : 0;
        }
        com.bytedance.sdk.openadsdk.yu.tlj.ouw(vppVar);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.vt;
        if (ouwVar2 != null && (tljVar = ouwVar2.ycd) != null) {
            tljVar.lh();
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar3 = this.f7726th;
        if (ouwVar3 != null) {
            ouwVar3.vt();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = this.vt;
            com.bytedance.sdk.openadsdk.yu.tlj.ouw(ouwVar4 != null ? ouwVar4.vt : null, "close", false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ey() {
        vt(2);
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.f7700cf) {
            return;
        }
        jae = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.vt != null) {
            com.bytedance.sdk.openadsdk.le.vt.ouw().ouw("videoForceBreak", this.vt.vt);
        }
        uoy();
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void jae() {
        this.vm = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void jg() {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        super.jg();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null || (yuVar = ouwVar.jae.ouw) == null) {
            return;
        }
        yuVar.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.fkw() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.fkw
            public final void ouw() {
                TTRewardVideoActivity.this.fvf();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void jvy() {
        vt(0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void kn() {
        fvf();
        this.vt.vt.pv();
        vpp vppVar = this.vt.vt;
        vppVar.mq = true;
        if (vpp.fkw(vppVar)) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
            vpp vppVar2 = ouwVar.vt;
            com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar2, ouwVar.fkw, vppVar2.uq);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void ksc() {
        this.zih = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void mwh() {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar = this.f7726th;
            if (ouwVar != null) {
                ouwVar.ouw();
            } else {
                ko.vt("BVA", "performShowCallback: mRewardAdInteractionListener is null");
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.vt;
                com.bytedance.sdk.openadsdk.yu.tlj.ouw(ouwVar2 != null ? ouwVar2.vt : null, "show", false);
            }
        }
        if (jqy()) {
            this.vt.jae.le();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout od() {
        return this.vt.ey.le();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar;
        vpp vppVar;
        super.onCreate(bundle);
        try {
            if (qbp == null) {
                qbp = com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_reward_msg");
                zin = com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_msgPlayable");
                vpp = com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_negtiveBtnBtnText");
                jqy = com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_postiveBtnText");
                ex = com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            qbp.lh("TTAD.RVA", th2.getMessage());
        }
        if (bundle == null || (ouwVar = this.vt) == null || (vppVar = ouwVar.vt) == null || !vppVar.amr) {
            return;
        }
        this.f7725od.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        uoy();
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("recycleRes");
        }
        ouw(isFinishing(), isChangingConfigurations());
        this.f7726th = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        tlj tljVar;
        super.onPause();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null || (tljVar = ouwVar.ycd) == null) {
            return;
        }
        tljVar.ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        tlj tljVar;
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null || (tljVar = ouwVar.ycd) == null) {
            return;
        }
        tljVar.vt();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.f7700cf) {
            jae = this.f7726th;
        }
        if (this.f7725od.get() && (ouwVar = this.vt) != null) {
            ouwVar.vt.amr = true;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void osn() {
        fvf();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void pno() {
        this.vt.uoy.ouw(null, TTAdDislikeToast.getSkipText());
        this.vt.uoy.fkw(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void qbp() {
        final View viewTlj = this.vt.ey.tlj();
        if (viewTlj != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (TTRewardVideoActivity.this.vt.bs.cf() && TTRewardVideoActivity.this.vt.tlj.get()) {
                        boolean z3 = TTRewardVideoActivity.this.vt.fak.fkw.get();
                        TTRewardVideoActivity.this.vt.bs.yu(z3);
                        TTRewardVideoActivity.this.vt.ey.le(8);
                        View view2 = viewTlj;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.le.yu) {
                            ((com.bytedance.sdk.openadsdk.core.le.yu) view2).setImageResource(com.bytedance.sdk.component.utils.vpp.yu(TTRewardVideoActivity.this.vt.hun, "tt_close_btn"));
                        }
                        TTRewardVideoActivity.this.vt.ux.sendEmptyMessageDelayed(600, 5000L);
                        if (!vpp.lh(TTRewardVideoActivity.this.vt.vt)) {
                            return;
                        }
                        if (vpp.lh(TTRewardVideoActivity.this.vt.vt) && z3) {
                            return;
                        }
                    }
                    TTRewardVideoActivity.this.vt.bs.ryl();
                    TTRewardVideoActivity.this.vt.fak.fkw();
                    TTRewardVideoActivity.this.vt.f7956cd.lh();
                    if (od.yu(TTRewardVideoActivity.this.vt.vt)) {
                        TTRewardVideoActivity.ouw(TTRewardVideoActivity.this, true, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            };
            viewTlj.setOnClickListener(onClickListener);
            viewTlj.setTag(viewTlj.getId(), onClickListener);
        }
        this.vt.uoy.ouw(new com.bytedance.sdk.openadsdk.component.reward.top.vt() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.6
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void lh() {
                View view = viewTlj;
                if (view != null) {
                    view.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw() {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                TTRewardVideoActivity.ouw(tTRewardVideoActivity, od.lh(tTRewardVideoActivity.vt.vt), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void vt() {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.vt.f7965pd.ouw(tTRewardVideoActivity.f7702lh);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw(String str) {
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = TTRewardVideoActivity.this.f7702lh;
                if (vtVar != null && vtVar.yu() != null) {
                    TTRewardVideoActivity.this.f7702lh.yu().ouw(TTRewardVideoActivity.this.vt.f7958cj);
                }
                TTRewardVideoActivity.this.vt.f7958cj = !r0.f7958cj;
                ko.ouw("TTAD.RVA", "rewarded_video", "will set is Mute " + TTRewardVideoActivity.this.vt.f7958cj + " mLastVolume=" + TTRewardVideoActivity.this.vt.fvf.vt);
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = TTRewardVideoActivity.this.vt;
                ouwVar.ex.ouw(ouwVar.f7958cj, str);
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = TTRewardVideoActivity.this.vt;
                ouwVar2.bs.lh(ouwVar2.f7958cj);
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = TTRewardVideoActivity.this.vt;
                ouwVar3.ksc.ouw(ouwVar3.f7958cj);
                vpp vppVar = TTRewardVideoActivity.this.vt.vt;
                if (vppVar == null || (yuVarSd = vppVar.sd()) == null || (yuVar = yuVarSd.ouw) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = TTRewardVideoActivity.this.vt;
                if (ouwVar4.f7958cj) {
                    yuVar.ra(ouwVar4.ex.fkw());
                } else {
                    yuVar.pno(ouwVar4.ex.fkw());
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void yu() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void tc() {
        vt(0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void vm() {
        vt(0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean vpp() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final boolean zin() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void lh() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar;
        super.lh();
        if (this.f7725od.get() || (ouwVar = this.vt) == null) {
            return;
        }
        ouwVar.ycd = new tlj(new tlj.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.tlj.ouw
            public final void ouw() {
                if (TTRewardVideoActivity.this.f7725od.get() || TTRewardVideoActivity.this.uq) {
                    return;
                }
                TTRewardVideoActivity.this.vt(1);
            }
        });
    }

    public final void vt(final int i4) {
        if (this.f7725od.get() || this.uq) {
            return;
        }
        this.f7725od.set(true);
        tlj tljVar = this.vt.ycd;
        if (tljVar != null) {
            tljVar.ouw = true;
        }
        zih.yu();
        boolean zCf = cf.cf(String.valueOf(this.vt.f7961le));
        ko.vt("TTAD.RVA", "verifyRewardVideo: dir=".concat(String.valueOf(zCf)));
        if (zCf) {
            vpp vppVar = this.vt.vt;
            ouw(true, vppVar.xdk, vppVar.mt, 0, "", i4);
        } else {
            zih.lh().ouw(fak(), new vpp.vt() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.9
                @Override // com.bytedance.sdk.openadsdk.core.vpp.vt
                public final void ouw(int i10, String str) {
                    ko.vt("TTAD.RVA", "onError: " + i10 + ", " + str);
                    TTRewardVideoActivity.this.ouw(false, 0, "", i10, str, i4);
                }

                @Override // com.bytedance.sdk.openadsdk.core.vpp.vt
                public final void ouw(jqy.vt vtVar) {
                    ko.vt("TTAD.RVA", "onVerify: " + vtVar.vt);
                    fvf fvfVar = vtVar.f8190lh;
                    TTRewardVideoActivity.this.ouw(vtVar.vt, fvfVar.f8227lh, fvfVar.yu, 0, "", i4);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final com.bytedance.sdk.openadsdk.common.zih yu() {
        return new com.bytedance.sdk.openadsdk.common.zih(this.vt) { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.zih
            public final boolean lh() {
                return TTRewardVideoActivity.this.f7725od.get();
            }

            @Override // com.bytedance.sdk.openadsdk.common.zih
            public final boolean ouw() {
                return TTRewardVideoActivity.this.uq;
            }

            @Override // com.bytedance.sdk.openadsdk.common.zih
            public final void vt() {
                TTRewardVideoActivity.lh(TTRewardVideoActivity.this);
            }

            @Override // com.bytedance.sdk.openadsdk.common.zih
            public final void yu() {
                TTRewardVideoActivity.this.finish();
            }

            @Override // com.bytedance.sdk.openadsdk.common.zih
            public final void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
                com.bytedance.sdk.openadsdk.common.ouw.ouw(ouwVar, new ouw.vt() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.2.1
                    @Override // com.bytedance.sdk.openadsdk.common.ouw.vt
                    public final void ouw() {
                        TTRewardVideoActivity.this.ouw(true, 4);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.ouw.vt
                    public final void vt() {
                        TTRewardVideoActivity.this.finish();
                    }
                });
            }
        };
    }

    private void ouw(String str) {
        ouw(str, false, 0, "", 0, "");
    }

    private void lh(long j, long j8) {
        if (j8 <= 0) {
            return;
        }
        if (this.f7724cd == -1) {
            this.f7724cd = Math.min(100, this.vt.vt.myk);
        }
        if (((j / 1000.0f) / j8) * 100.0f >= this.f7724cd) {
            StringBuilder sbY = h.y(j, "try verify reward 2 current ", ": duration = ");
            sbY.append(j8);
            sbY.append(" mWatching = ");
            sbY.append(this.f7724cd);
            ko.vt("TTAD.RVA", sbY.toString());
            vt(0);
        }
    }

    private void ouw(final String str, final boolean z3, final int i4, final String str2, final int i10, final String str3) {
        bs.fkw(new com.bytedance.sdk.component.pno.pno("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    TTRewardVideoActivity.this.ouw(0).executeRewardVideoCallback(TTRewardVideoActivity.this.vt.f7968ub, str, z3, i4, str2, i10, str3);
                } catch (Throwable th2) {
                    qbp.yu("TTAD.RVA", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th2);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(Bundle bundle) {
        if (this.f7700cf) {
            super.ouw(bundle);
            this.f7726th = (com.bytedance.sdk.openadsdk.ouw.fkw.ouw) com.bytedance.sdk.openadsdk.core.od.ouw().ouw(this.f7699jg, com.bytedance.sdk.openadsdk.ouw.fkw.ouw.class);
        } else {
            if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                this.f7726th = com.bytedance.sdk.openadsdk.core.od.ouw().vt;
            }
            if (this.f7726th == null && bundle != null) {
                this.f7726th = jae;
                jae = null;
            }
        }
        Log.e("TTAD.RVA", "initListener: listenerKey = " + this.f7699jg + ",mRewardAdInteractionListener = " + this.f7726th + ",savedInstanceState = " + bundle);
    }

    public final void vt(long j, long j8) {
        boolean z3;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar != null) {
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar = ouwVar.vt;
            z3 = vppVar.myk >= 0 && vppVar.fwd() >= 0;
            if (z3) {
                j8 = this.vt.vt.fwd();
            }
        } else {
            z3 = false;
        }
        long j9 = (this.vt.wp * 1000) + j;
        if (z3) {
            lh(j9, j8);
            return;
        }
        if (this.f7724cd == -1) {
            zih.yu();
            this.f7724cd = cf.qbp(String.valueOf(this.vt.f7961le)).f8455le;
        }
        if (j8 <= 0) {
            return;
        }
        if (j8 >= 30000 && j9 >= 27000) {
            ko.vt("TTAD.RVA", "try verify reward 1");
            vt(0);
        } else if ((j9 * 100) / j8 >= this.f7724cd) {
            ko.vt("TTAD.RVA", "try verify reward 2");
            vt(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void ouw(Intent intent) {
        super.ouw(intent);
        this.tc = intent.getStringExtra("media_extra");
        this.ksc = intent.getStringExtra("user_id");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void ouw(long j, long j8) {
        int i4 = (int) (j / 1000);
        int iNg = this.vt.vt.ng();
        boolean z3 = iNg >= 0;
        vt(j, j8);
        if (this.f7701le > 0) {
            this.vt.uoy.yu(true);
            if (z3 && i4 >= iNg) {
                this.vt.ouw(true);
                this.vt.uoy.ouw(String.valueOf(this.f7701le), TTAdDislikeToast.getSkipText());
                this.vt.uoy.fkw(true);
                return;
            }
            this.vt.uoy.ouw(String.valueOf(this.f7701le), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(final boolean z3, final int i4, final String str, final int i10, final String str2, final int i11) {
        qbp.ouw("BVA", "invoke callback onRewardVerify: " + z3 + ", " + i4 + ", " + str + ", " + i10 + ", " + str2 + "; " + this);
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onRewardVerify", z3, i4, str, i10, str2);
            tlj.ouw(this.vt.vt, z3, i11);
        } else {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.8
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar = TTRewardVideoActivity.this.f7726th;
                    if (ouwVar != null) {
                        ouwVar.ouw(z3, i4, str, i10, str2);
                        tlj.ouw(TTRewardVideoActivity.this.vt.vt, z3, i11);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(boolean z3) {
        if (z3) {
            vt(0);
            return;
        }
        zih.yu();
        if ((1.0d - (this.f7701le / this.vt.ex.zin())) * 100.0d >= cf.qbp(String.valueOf(this.vt.f7961le)).f8455le) {
            vt(0);
        }
    }

    public static /* synthetic */ void ouw(TTRewardVideoActivity tTRewardVideoActivity, final boolean z3, boolean z10) {
        if (!z10 && tTRewardVideoActivity.uq && tTRewardVideoActivity.vt.tlj.get() && od.pno(tTRewardVideoActivity.vt.vt)) {
            tTRewardVideoActivity.vt.ksc.ra();
            return;
        }
        zih.yu();
        if (!cf.le(String.valueOf(tTRewardVideoActivity.vt.f7961le))) {
            if (!z10 && tTRewardVideoActivity.vt.tlj.get() && od.pno(tTRewardVideoActivity.vt.vt)) {
                tTRewardVideoActivity.vt.ksc.ra();
                return;
            } else if (z3) {
                tTRewardVideoActivity.finish();
                return;
            } else {
                tTRewardVideoActivity.pd();
                return;
            }
        }
        if (tTRewardVideoActivity.f7725od.get()) {
            if (tTRewardVideoActivity.vt.tlj.get() && od.pno(tTRewardVideoActivity.vt.vt)) {
                tTRewardVideoActivity.vt.ksc.ra();
                return;
            } else if (z3) {
                tTRewardVideoActivity.finish();
                return;
            } else {
                tTRewardVideoActivity.pd();
                return;
            }
        }
        if (od.pno(tTRewardVideoActivity.vt.vt) && tTRewardVideoActivity.vt.bs.f7979le.getVisibility() == 0) {
            tTRewardVideoActivity.vt.ksc.ra();
            return;
        }
        tTRewardVideoActivity.vt.qbp.set(true);
        tTRewardVideoActivity.vt.ex.ryl();
        if (z3) {
            tTRewardVideoActivity.vt.ksc.yu();
        }
        final com.bytedance.sdk.openadsdk.core.widget.vt vtVar = new com.bytedance.sdk.openadsdk.core.widget.vt(tTRewardVideoActivity);
        tTRewardVideoActivity.f7702lh.mwh = vtVar;
        if (z3) {
            vtVar.ouw = zin;
            vtVar.vt = ex;
            vtVar.f8518lh = vpp;
        } else {
            vtVar.ouw = qbp;
            vtVar.vt = jqy;
            vtVar.f8518lh = vpp;
        }
        vtVar.yu = new vt.InterfaceC0101vt() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.vt.InterfaceC0101vt
            public final void ouw() {
                TTRewardVideoActivity.this.vt.ex.cf();
                if (z3) {
                    TTRewardVideoActivity.this.vt.ksc.ouw(1000);
                }
                vtVar.dismiss();
                TTRewardVideoActivity.this.vt.qbp.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.vt.InterfaceC0101vt
            public final void vt() {
                vtVar.dismiss();
                TTRewardVideoActivity.lh(TTRewardVideoActivity.this);
                TTRewardVideoActivity.this.vt.qbp.set(false);
                TTRewardVideoActivity.this.vt.ksc.fkw();
                if (!z3 || !od.le(TTRewardVideoActivity.this.vt.vt)) {
                    TTRewardVideoActivity.this.pd();
                } else if (od.pno(TTRewardVideoActivity.this.vt.vt)) {
                    TTRewardVideoActivity.this.vt.ksc.ra();
                } else {
                    TTRewardVideoActivity.this.vt.f7956cd.lh();
                    TTRewardVideoActivity.this.finish();
                }
            }
        };
        vtVar.show();
    }
}

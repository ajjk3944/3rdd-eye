package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.od;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.yu.tlj;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {
    private static com.bytedance.sdk.openadsdk.ouw.lh.vt vm;

    /* renamed from: th, reason: collision with root package name */
    private boolean f7708th;
    private com.bytedance.sdk.openadsdk.ouw.lh.vt zih;

    private void fvf() {
        if (com.bytedance.sdk.openadsdk.vpp.ouw.ra() && isChangingConfigurations()) {
            qbp.ouw("BVA", "callback close is invoke by config change.");
            return;
        }
        if (this.ra) {
            return;
        }
        this.ra = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.ko;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        vpp vppVar = ouwVar != null ? ouwVar.vt : null;
        if (vppVar != null && jElapsedRealtime > 0) {
            vppVar.vby = jElapsedRealtime;
        }
        if (vppVar != null) {
            vppVar.ybr = ouwVar.tlj.get() ? 1 : 0;
        }
        tlj.ouw(vppVar);
        qbp.ouw("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar = this.zih;
        if (vtVar != null) {
            vtVar.vt();
        } else {
            tlj.ouw(vppVar, "close", false);
        }
    }

    private void lh(int i4) {
        this.vt.uoy.ouw(null, String.format(com.bytedance.sdk.component.utils.vpp.ouw(zih.ouw(), "tt_skip_ad_time_text"), Integer.valueOf(i4)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pd() {
        qbp.ouw("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar = this.zih;
        if (vtVar != null) {
            vtVar.onAdClicked();
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.f7700cf) {
            return;
        }
        vm = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.vt != null) {
            com.bytedance.sdk.openadsdk.le.vt.ouw().ouw("videoForceBreak", this.vt.vt);
        }
        try {
            fvf();
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void jg() {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        super.jg();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null || (yuVar = ouwVar.jae.ouw) == null) {
            return;
        }
        yuVar.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.fkw() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.fkw
            public final void ouw() {
                TTFullScreenVideoActivity.this.pd();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void kn() {
        pd();
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
    public final void mwh() {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar = this.zih;
            if (vtVar != null) {
                vtVar.ouw();
            } else {
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
                tlj.ouw(ouwVar != null ? ouwVar.vt : null, "show", false);
            }
        }
        if (jqy()) {
            this.vt.jae.le();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout od() {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f7702lh;
        return (vtVar == null || !(vtVar instanceof com.bytedance.sdk.openadsdk.component.reward.vt.pno)) ? this.vt.ey.le() : ((com.bytedance.sdk.openadsdk.component.reward.vt.pno) vtVar).ex();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null || vpp.fkw(ouwVar.vt)) {
            return;
        }
        vpp vppVar = this.vt.vt;
        c cVar = vppVar.f8309sd;
        if (cVar == null) {
            c cVar2 = new c();
            cVar2.f6576d = 10.0d;
            vppVar.f8309sd = cVar2;
        } else if (cVar.f6576d <= 0.0d) {
            cVar.f6576d = 10.0d;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        fvf();
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("recycleRes");
        }
        ouw(isFinishing(), isChangingConfigurations());
        this.zih = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.f7700cf) {
            vm = this.zih;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onStop() {
        boolean zKo;
        super.onStop();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null) {
            return;
        }
        if (ouwVar.vt == null) {
            zKo = false;
        } else {
            zih.yu();
            zKo = cf.ko(String.valueOf(this.vt.f7961le));
        }
        if (zKo) {
            vpp vppVar = this.vt.vt;
            boolean z3 = true;
            if (vppVar != null && vppVar.ex() != 100.0f) {
                z3 = false;
            }
            if (z3) {
                return;
            }
            if (this.f7708th) {
                this.f7708th = false;
                finish();
            } else if (this.vt.bs.zih()) {
                finish();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void osn() {
        if (this.vt.vt.ex() != 100.0f) {
            this.f7708th = true;
        }
        pd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(String str, JSONObject jSONObject) {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void pno() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r3.vt
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.vpp.fkw(r0)
            r1 = 0
            if (r0 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r3.vt
            boolean r2 = r0.f7962lh
            if (r2 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.ouw.ryl r0 = r0.uoy
            java.lang.String r2 = "X"
            r0.ouw(r1, r2)
            goto L24
        L19:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r3.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ryl r0 = r0.uoy
            java.lang.String r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getSkipText()
            r0.ouw(r1, r2)
        L24:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r3.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ryl r0 = r0.uoy
            r1 = 1
            r0.fkw(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.pno():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void qbp() {
        final View viewTlj = this.vt.ey.tlj();
        if (viewTlj != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (TTFullScreenVideoActivity.this.vt.bs.cf() && TTFullScreenVideoActivity.this.vt.tlj.get()) {
                        boolean z3 = TTFullScreenVideoActivity.this.vt.fak.fkw.get();
                        TTFullScreenVideoActivity.this.vt.bs.yu(z3);
                        TTFullScreenVideoActivity.this.vt.ey.le(8);
                        View view2 = viewTlj;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.le.yu) {
                            ((com.bytedance.sdk.openadsdk.core.le.yu) view2).setImageResource(com.bytedance.sdk.component.utils.vpp.yu(TTFullScreenVideoActivity.this.vt.hun, "tt_close_btn"));
                        }
                        TTFullScreenVideoActivity.this.vt.ux.sendEmptyMessageDelayed(600, 5000L);
                        if (!vpp.lh(TTFullScreenVideoActivity.this.vt.vt)) {
                            return;
                        }
                        if (vpp.lh(TTFullScreenVideoActivity.this.vt.vt) && z3) {
                            return;
                        }
                    }
                    TTFullScreenVideoActivity.this.vt.bs.ryl();
                    TTFullScreenVideoActivity.this.vt.fak.fkw();
                    TTFullScreenVideoActivity.this.vt.f7956cd.lh();
                    TTFullScreenVideoActivity.this.finish();
                }
            };
            viewTlj.setOnClickListener(onClickListener);
            viewTlj.setTag(viewTlj.getId(), onClickListener);
        }
        this.vt.uoy.ouw(new com.bytedance.sdk.openadsdk.component.reward.top.vt() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void lh() {
                View view = viewTlj;
                if (view != null) {
                    view.performClick();
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void ouw() {
                /*
                    Method dump skipped, instructions count: 321
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.AnonymousClass4.ouw():void");
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void vt() {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.vt.f7965pd.ouw(tTFullScreenVideoActivity.f7702lh);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void yu() {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw(String str) {
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.vt.f7958cj = !r1.f7958cj;
                com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = tTFullScreenVideoActivity.f7702lh;
                if (vtVar != null && vtVar.yu() != null) {
                    TTFullScreenVideoActivity.this.f7702lh.yu().ouw(TTFullScreenVideoActivity.this.vt.f7958cj);
                }
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = TTFullScreenVideoActivity.this.vt;
                ouwVar.ex.ouw(ouwVar.f7958cj, str);
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = TTFullScreenVideoActivity.this.vt;
                ouwVar2.bs.lh(ouwVar2.f7958cj);
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = TTFullScreenVideoActivity.this.vt;
                ouwVar3.ksc.ouw(ouwVar3.f7958cj);
                vpp vppVar = TTFullScreenVideoActivity.this.vt.vt;
                if (vppVar == null || (yuVarSd = vppVar.sd()) == null || (yuVar = yuVarSd.ouw) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = TTFullScreenVideoActivity.this.vt;
                if (ouwVar4.f7958cj) {
                    yuVar.ra(ouwVar4.ex.fkw());
                } else {
                    yuVar.pno(ouwVar4.ex.fkw());
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean vpp() {
        return false;
    }

    public final void vt(int i4) {
        int iMyk = this.vt.vt.myk();
        zih.yu();
        if (!cf.fkw(String.valueOf(this.vt.f7961le)) || (!vpp.fkw(this.vt.vt) && !this.vt.f7962lh)) {
            if (i4 >= iMyk) {
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
                if (!ouwVar.xdk) {
                    ouwVar.ouw(true);
                }
                pno();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.vt;
        if (!ouwVar2.xdk) {
            ouwVar2.ouw(true);
        }
        if (i4 > iMyk) {
            pno();
        } else {
            lh(iMyk - i4);
            this.vt.uoy.fkw(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final com.bytedance.sdk.openadsdk.common.zih yu() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final boolean zin() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(boolean z3) {
    }

    private void ouw(final String str) {
        bs.fkw(new com.bytedance.sdk.component.pno.pno("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    TTFullScreenVideoActivity.this.ouw(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.vt.f7968ub, str);
                } catch (Throwable th2) {
                    qbp.yu("TTAD.FSVA", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th2);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void ouw(Intent intent) {
        super.ouw(intent);
        this.vt.zvq = intent.getBooleanExtra("is_verity_playable", false);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(Bundle bundle) {
        if (this.f7700cf) {
            super.ouw(bundle);
            this.zih = (com.bytedance.sdk.openadsdk.ouw.lh.vt) od.ouw().ouw(this.f7699jg, com.bytedance.sdk.openadsdk.ouw.lh.vt.class);
            return;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            this.zih = od.ouw().f8377lh;
        }
        if (this.zih != null || bundle == null) {
            return;
        }
        this.zih = vm;
        vm = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void ouw(long j, long j8) {
        vt((int) (j / 1000));
        int i4 = this.f7701le;
        if (i4 >= 0) {
            this.vt.uoy.ouw(String.valueOf(i4), null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ey() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void jvy() {
    }
}

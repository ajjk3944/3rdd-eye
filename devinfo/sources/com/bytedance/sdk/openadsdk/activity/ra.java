package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.activity.vt;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.ryl;
import com.bytedance.sdk.openadsdk.component.reward.view.tlj;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.widget.vt;
import com.bytedance.sdk.openadsdk.core.zih;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra extends ouw {
    private static String ex;
    private static String jqy;
    private static String ksc;
    private static String tc;
    private static String vpp;
    private int jae;

    public ra(vt vtVar, vpp vppVar, int i4, int i10, boolean z3) {
        super(vtVar, vppVar, i4, i10, z3);
        this.jae = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void yib() {
        /*
            r4 = this;
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r0 = r0.ex
            r0.zih()
            com.bytedance.sdk.openadsdk.yu.fkw.vt.ko$ouw r0 = new com.bytedance.sdk.openadsdk.yu.fkw.vt.ko$ouw
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r1 = r1.fkw()
            r0.ouw(r1)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r1 = r1.ko()
            r0.vt(r1)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r1 = r1.pno()
            r0.vt = r1
            r1 = 3
            r0.tlj = r1
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            int r1 = r1.jg()
            r0.ryl = r1
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r2 = r1.f7946jg
            r0.f8763le = r2
            a9.a r1 = r1.lh()
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r2 = r4.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r2 = r2.ex
            com.bytedance.sdk.openadsdk.yu.ra r2 = r2.zin
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(r1, r0, r2)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.bly
            int r0 = r0.f7961le
            com.bytedance.sdk.openadsdk.core.jae.ouw(r0)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r0 = r0.ex
            java.lang.String r1 = "skip"
            r2 = 0
            r0.ouw(r1, r2)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.bly
            boolean r0 = r0.f7962lh
            if (r0 == 0) goto L7c
            r4.fkw()
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.bly
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.th.ouw(r0)
            if (r0 == 0) goto L7f
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.bly
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.rn
            boolean r0 = r0.get()
            if (r0 != 0) goto L7f
        L7c:
            r4.lso()
        L7f:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.bly
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            com.bytedance.sdk.openadsdk.core.model.yu r0 = r0.sd()
            if (r0 == 0) goto L9b
            com.bytedance.sdk.openadsdk.core.ryl.yu r0 = r0.ouw
            if (r0 == 0) goto L9b
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r1 = r1.fkw()
            r0.fkw(r1)
            r0.yu(r1)
        L9b:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.bly
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            r1 = 5
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.ra.yib():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void b_() {
        vt vtVar = this.ra;
        if (vtVar != null && vtVar.vpp) {
            super.b_();
            return;
        }
        final View viewTlj = this.bly.ey.tlj();
        if (viewTlj != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.ra.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (ra.this.bly.bs.cf() && ra.this.bly.tlj.get()) {
                        boolean z3 = ra.this.bly.fak.fkw.get();
                        ra.this.bly.bs.yu(z3);
                        ra.this.bly.ey.le(8);
                        ra.this.bly.ux.sendEmptyMessageDelayed(600, 5000L);
                        if (!vpp.lh(ra.this.bly.vt)) {
                            return;
                        }
                        if (vpp.lh(ra.this.bly.vt) && z3) {
                            return;
                        }
                    }
                    ra.this.bly.bs.ryl();
                    ra.this.bly.fak.fkw();
                    ra.this.bly.f7956cd.lh();
                    if (od.yu(ra.this.bly.vt)) {
                        ra.this.ouw(true, true, (Runnable) null);
                    } else {
                        ra.this.lso();
                    }
                }
            };
            viewTlj.setOnClickListener(onClickListener);
            viewTlj.setTag(viewTlj.getId(), onClickListener);
        }
        this.bly.uoy.ouw(new com.bytedance.sdk.openadsdk.component.reward.top.vt() { // from class: com.bytedance.sdk.openadsdk.activity.ra.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void lh() {
                View view = viewTlj;
                if (view != null) {
                    view.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw() {
                ra raVar = ra.this;
                raVar.ouw(od.lh(raVar.bly.vt), false, (Runnable) null);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void vt() {
                ra.this.f_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void yu() {
                ra raVar = ra.this;
                raVar.vt(raVar.bly);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw(String str) {
                ra.this.ouw(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ouw
    public final FrameLayout bly() {
        ryl rylVar;
        tlj tljVar;
        if (this.f7765le.lh()) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
            if (ouwVar == null || (tljVar = ouwVar.jae) == null) {
                return null;
            }
            return tljVar.ouw();
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
        if (ouwVar2 == null || (rylVar = ouwVar2.ey) == null) {
            return null;
        }
        return rylVar.le();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean d_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final String e_() {
        return "rewarded_video";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void f_() {
        this.bly.f7965pd.ouw(((ouw) this).vt);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean g_() {
        return this.bly.f7958cj;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno, com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void jvy() {
        ub();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void rrs() {
        super.rrs();
        this.fkw = false;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        ouwVar.jae.fkw = false;
        ouwVar.ex.tc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ouw, com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void vm() {
        ub();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ouw
    public final void vt() {
        this.bly.uoy.ouw(null, TTAdDislikeToast.getSkipText());
        this.bly.uoy.fkw(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ouw, com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(Activity activity, vt.fkw fkwVar) {
        vt vtVar;
        super.ouw(activity, fkwVar);
        if (com.bytedance.sdk.component.utils.vt.ouw(activity)) {
            return;
        }
        Intent intent = activity.getIntent();
        this.ko = intent.getStringExtra("media_extra");
        this.f7764jg = intent.getStringExtra("user_id");
        try {
            if (tc == null) {
                tc = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_reward_msg");
                vpp = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_msgPlayable");
                ex = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_negtiveBtnBtnText");
                ksc = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_postiveBtnText");
                jqy = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            qbp.lh("TTAD.RewardAdScene", th2.getMessage());
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar == null || (vtVar = this.ra) == null) {
            return;
        }
        ouwVar.ycd = vtVar.f7774le;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(String str) {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar2;
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = ((ouw) this).vt;
        if (vtVar != null && vtVar.yu() != null) {
            ((ouw) this).vt.yu().ouw(this.bly.f7958cj);
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        boolean z3 = !ouwVar.f7958cj;
        ouwVar.f7958cj = z3;
        tlj tljVar = ouwVar.jae;
        if (tljVar != null && (yuVar2 = tljVar.ouw) != null) {
            yuVar2.setSoundMute(z3);
        }
        ko.ouw("TTAD.RewardAdScene", "rewarded_video", "will set is Mute " + this.bly.f7958cj + " mLastVolume=" + this.bly.fvf.vt);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
        ouwVar2.ex.ouw(ouwVar2.f7958cj, str);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.bly;
        ouwVar3.bs.lh(ouwVar3.f7958cj);
        vpp vppVar = this.bly.vt;
        if (vppVar == null || (yuVarSd = vppVar.sd()) == null || (yuVar = yuVarSd.ouw) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = this.bly;
        if (ouwVar4.f7958cj) {
            yuVar.ra(ouwVar4.ex.fkw());
        } else {
            yuVar.pno(ouwVar4.ex.fkw());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ouw(final boolean z3, boolean z10, final Runnable runnable) {
        if (!z10 && this.ra.yu.getBoolean("user_has_give_up_reward", false) && runnable != null) {
            return false;
        }
        zih.yu();
        if (!cf.le(String.valueOf(this.bly.f7961le))) {
            if (runnable == null) {
                if (z3) {
                    lso();
                    return false;
                }
                yib();
            }
            return false;
        }
        if (this.ra.yu.getBoolean("reward_verify", false)) {
            if (runnable == null) {
                if (z3) {
                    lso();
                    return false;
                }
                yib();
            }
            return false;
        }
        this.bly.qbp.set(true);
        this.bly.ex.ryl();
        if (z3) {
            this.bly.ksc.yu();
        }
        final com.bytedance.sdk.openadsdk.core.widget.vt vtVar = new com.bytedance.sdk.openadsdk.core.widget.vt(ux());
        ((ouw) this).vt.mwh = vtVar;
        if (z3) {
            vtVar.ouw = vpp;
            vtVar.vt = jqy;
            vtVar.f8518lh = ex;
        } else {
            vtVar.ouw = tc;
            vtVar.vt = ksc;
            vtVar.f8518lh = ex;
        }
        vtVar.yu = new vt.InterfaceC0101vt() { // from class: com.bytedance.sdk.openadsdk.activity.ra.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.vt.InterfaceC0101vt
            public final void ouw() {
                ra.this.bly.ex.cf();
                if (z3) {
                    ra.this.bly.ksc.ouw(1000);
                }
                vtVar.dismiss();
                ra.this.bly.qbp.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.vt.InterfaceC0101vt
            public final void vt() {
                vtVar.dismiss();
                ra.this.ra.yu.putBoolean("user_has_give_up_reward", true);
                ra.this.bly.qbp.set(false);
                ra.this.bly.ksc.fkw();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (!z3) {
                    ra.this.yib();
                } else {
                    ra.this.bly.f7956cd.lh();
                    ra.this.lso();
                }
            }
        };
        vtVar.show();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ouw, com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(final String str, final JSONObject jSONObject) {
        if ("skipToNextAd".equals(str) && this.bly.f7959gh != null && this.ra.tlj.mwh() == null) {
            vt vtVar = this.ra;
            if (vtVar != null && vtVar.vpp) {
                com.bytedance.sdk.openadsdk.common.zih zihVar = this.zin;
                if (zihVar != null && zihVar.ouw(od.lh(this.bly.vt), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.ra.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ra.super.ouw(str, jSONObject);
                    }
                })) {
                    return;
                }
            } else if (ouw(od.lh(this.bly.vt), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.ra.5
                @Override // java.lang.Runnable
                public final void run() {
                    ra.super.ouw(str, jSONObject);
                }
            })) {
                return;
            }
        }
        super.ouw(str, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // com.bytedance.sdk.openadsdk.activity.pno
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r2) {
        /*
            r1 = this;
            boolean r0 = r2.f7962lh
            if (r0 == 0) goto L17
            r1.fkw()
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r2.vt
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.th.ouw(r0)
            if (r0 == 0) goto L1a
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.rn
            boolean r0 = r0.get()
            if (r0 != 0) goto L1a
        L17:
            r1.lso()
        L1a:
            com.bytedance.sdk.openadsdk.common.ouw.vt(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.ra.ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw):void");
    }
}

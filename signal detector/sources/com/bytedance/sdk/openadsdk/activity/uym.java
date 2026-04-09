package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.ypw;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.vk;
import com.bytedance.sdk.openadsdk.component.reward.view.gbl;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.widget.ypw;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uym extends emc {
    private static String ee;
    private static String hxp;
    private static String rie;
    private static String sra;
    private static String ylm;
    private int db;

    public uym(ypw ypwVar, rie rieVar, int i, int i3, boolean z6) {
        super(ypwVar, rieVar, i, i3, z6);
        this.db = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void nw() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r0 = r0.ylm
            r0.xmt()
            com.bytedance.sdk.openadsdk.dg.bw.ypw.cf$emc r0 = new com.bytedance.sdk.openadsdk.dg.bw.ypw.cf$emc
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r1 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r1 = r1.ylm
            long r1 = r1.sup()
            r0.ypw(r1)
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r1 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r1 = r1.ylm
            long r1 = r1.ee()
            r0.dg(r1)
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r1 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r1 = r1.ylm
            long r1 = r1.vk()
            r0.xq(r1)
            r1 = 3
            r0.xq(r1)
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r1 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r1 = r1.ylm
            int r1 = r1.hxp()
            r0.dg(r1)
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r1 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r1 = r1.ylm
            long r1 = r1.ypw()
            r0.emc(r1)
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r1 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r1 = r1.ylm
            P1.a r1 = r1.msw()
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r2 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r2 = r2.ylm
            com.bytedance.sdk.openadsdk.dg.uym r2 = r2.bw()
            com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(r1, r0, r2)
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.zz
            int r0 = r0.ycc
            com.bytedance.sdk.openadsdk.core.sb.xq(r0)
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r0 = r0.ylm
            java.lang.String r1 = "skip"
            r2 = 0
            r0.emc(r1, r2)
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.zz
            boolean r0 = r0.xq
            if (r0 == 0) goto L8a
            r0 = 1
            r1 = 4
            r3.emc(r0, r1)
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.zz
            com.bytedance.sdk.openadsdk.core.model.rie r0 = r0.ypw
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.ul.emc(r0)
            if (r0 == 0) goto L8d
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.zz
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.sz
            boolean r0 = r0.get()
            if (r0 != 0) goto L8d
        L8a:
            r3.yz()
        L8d:
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.zz
            com.bytedance.sdk.openadsdk.core.model.rie r0 = r0.ypw
            com.bytedance.sdk.openadsdk.core.model.dg r0 = r0.eh()
            if (r0 == 0) goto Lab
            com.bytedance.sdk.openadsdk.core.sup.dg r0 = r0.emc()
            if (r0 == 0) goto Lab
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r1 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.emc.cf r1 = r1.ylm
            long r1 = r1.sup()
            r0.ycc(r1)
            r0.bw(r1)
        Lab:
            com.bytedance.sdk.openadsdk.component.reward.emc.emc r0 = r3.zz
            com.bytedance.sdk.openadsdk.core.model.rie r0 = r0.ypw
            r1 = 5
            com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.uym.nw():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void a_() {
        ypw ypwVar = this.uym;
        if (ypwVar != null && ypwVar.xq()) {
            super.a_();
            return;
        }
        final View viewRu = this.zz.mkp.ru();
        if (viewRu != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.uym.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (uym.this.zz.xmt.ul() && uym.this.zz.zz.get()) {
                        boolean zSz = uym.this.zz.lt.sz();
                        uym.this.zz.xmt.ycc(zSz);
                        uym.this.zz.mkp.ycc(8);
                        uym.this.zz.ra.sendEmptyMessageDelayed(600, 5000L);
                        if (!rie.xq(uym.this.zz.ypw)) {
                            return;
                        }
                        if (rie.xq(uym.this.zz.ypw) && zSz) {
                            return;
                        }
                    }
                    uym.this.zz.xmt.ylm();
                    uym.this.zz.lt.gbl();
                    uym.this.zz.db.ycc();
                    if (dr.dg(uym.this.zz.ypw)) {
                        uym.this.emc(true, true, (Runnable) null);
                    } else {
                        uym.this.yz();
                    }
                }
            };
            viewRu.setOnClickListener(onClickListener);
            viewRu.setTag(viewRu.getId(), onClickListener);
        }
        this.zz.cuf.emc(new com.bytedance.sdk.openadsdk.component.reward.top.ypw() { // from class: com.bytedance.sdk.openadsdk.activity.uym.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void dg(View view) {
                uym uymVar = uym.this;
                uymVar.ypw(uymVar.zz);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void emc(View view) {
                uym uymVar = uym.this;
                uymVar.emc(dr.xq(uymVar.zz.ypw), false, (Runnable) null);
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
                uym.this.e_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void emc(View view, String str) {
                uym.this.emc(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.emc, com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void aa() {
        rqm();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public boolean c_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public String d_() {
        return "rewarded_video";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void e_() {
        this.zz.sf.emc(((emc) this).ypw);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public boolean f_() {
        return this.zz.yz;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void mxo() {
        super.mxo();
        this.bw = false;
        this.zz.hxp.ypw(false);
        this.zz.ylm.wo();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.emc
    public FrameLayout uym() {
        gbl gblVar;
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar;
        if (this.ycc.ycc()) {
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
            if (emcVar == null || (zzVar = emcVar.hxp) == null) {
                return null;
            }
            return zzVar.ypw();
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.zz;
        if (emcVar2 == null || (gblVar = emcVar2.mkp) == null) {
            return null;
        }
        return gblVar.ycc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.emc
    public void ypw() {
        this.zz.cuf.emc(null, TTAdDislikeToast.getSkipText());
        this.zz.cuf.bw(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.emc, com.bytedance.sdk.openadsdk.activity.msw
    public void emc(Activity activity, ypw.bw bwVar) {
        ypw ypwVar;
        super.emc(activity, bwVar);
        if (com.bytedance.sdk.component.utils.ypw.emc(activity)) {
            return;
        }
        Intent intent = activity.getIntent();
        this.cf = intent.getStringExtra("media_extra");
        this.qh = intent.getStringExtra("user_id");
        try {
            if (hxp == null) {
                hxp = com.bytedance.sdk.component.utils.rie.emc(this.zz.vw, "tt_reward_msg");
                ylm = com.bytedance.sdk.component.utils.rie.emc(this.zz.vw, "tt_msgPlayable");
                rie = com.bytedance.sdk.component.utils.rie.emc(this.zz.vw, "tt_negtiveBtnBtnText");
                ee = com.bytedance.sdk.component.utils.rie.emc(this.zz.vw, "tt_postiveBtnText");
                sra = com.bytedance.sdk.component.utils.rie.emc(this.zz.vw, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            ul.xq("TTAD.RewardAdScene", th.getMessage());
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        if (emcVar == null || (ypwVar = this.uym) == null) {
            return;
        }
        emcVar.yid = ypwVar.emc;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw, com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void ypw(int i) {
        if (i == 10000) {
            rqm();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void emc(String str) {
        com.bytedance.sdk.openadsdk.core.model.dg dgVarEh;
        com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        emcVar.yz = !emcVar.yz;
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar = emcVar.hxp;
        if (zzVar != null && zzVar.emc() != null) {
            this.zz.hxp.emc().setSoundMute(this.zz.yz);
        }
        StringBuilder sb = new StringBuilder("will set is Mute ");
        sb.append(this.zz.yz);
        sb.append(" mLastVolume=");
        sb.append(this.zz.dr.emc());
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.zz;
        emcVar2.ylm.emc(emcVar2.yz, str);
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar3 = this.zz;
        emcVar3.xmt.bw(emcVar3.yz);
        rie rieVar = this.zz.ypw;
        if (rieVar == null || (dgVarEh = rieVar.eh()) == null || (dgVarEmc = dgVarEh.emc()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar4 = this.zz;
        if (emcVar4.yz) {
            dgVarEmc.msw(emcVar4.ylm.sup());
        } else {
            dgVarEmc.zz(emcVar4.ylm.sup());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean emc(final boolean z6, boolean z7, final Runnable runnable) {
        if (!z7 && this.uym.sup().getBoolean("user_has_give_up_reward", false) && runnable != null) {
            return false;
        }
        if (!aa.dg().msw(String.valueOf(this.zz.ycc))) {
            if (runnable == null) {
                if (z6) {
                    yz();
                    return false;
                }
                nw();
            }
            return false;
        }
        if (this.uym.sup().getBoolean("reward_verify", false)) {
            if (runnable == null) {
                if (z6) {
                    yz();
                    return false;
                }
                nw();
            }
            return false;
        }
        this.zz.aa.set(true);
        this.zz.ylm.ylm();
        if (z6) {
            this.zz.rie.ycc();
        }
        final com.bytedance.sdk.openadsdk.core.widget.ypw ypwVar = new com.bytedance.sdk.openadsdk.core.widget.ypw(xxg());
        ((emc) this).ypw.sup = ypwVar;
        if (z6) {
            ypwVar.emc(ylm).ypw(sra).xq(rie);
        } else {
            ypwVar.emc(hxp).ypw(ee).xq(rie);
        }
        ((emc) this).ypw.sup.emc(new ypw.InterfaceC0080ypw() { // from class: com.bytedance.sdk.openadsdk.activity.uym.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.ypw.InterfaceC0080ypw
            public void emc() {
                uym.this.zz.ylm.ul();
                if (z6) {
                    uym.this.zz.rie.emc(TTAdConstant.STYLE_SIZE_RADIO_1_1);
                }
                ypwVar.dismiss();
                uym.this.zz.aa.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ypw.InterfaceC0080ypw
            public void ypw() {
                ypwVar.dismiss();
                uym.this.uym.sup().putBoolean("user_has_give_up_reward", true);
                uym.this.zz.aa.set(false);
                uym.this.zz.rie.ypw(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (!z6) {
                    uym.this.nw();
                } else {
                    uym.this.zz.db.ycc();
                    uym.this.yz();
                }
            }
        }).show();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.emc, com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void emc(final String str, final JSONObject jSONObject) {
        if ("skipToNextAd".equals(str) && this.zz.pe != null && this.uym.hxp() == null) {
            ypw ypwVar = this.uym;
            if (ypwVar != null && ypwVar.xq()) {
                vk vkVar = this.ul;
                if (vkVar != null && vkVar.emc(dr.xq(this.zz.ypw), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.uym.4
                    @Override // java.lang.Runnable
                    public void run() {
                        uym.super.emc(str, jSONObject);
                    }
                })) {
                    return;
                }
            } else if (emc(dr.xq(this.zz.ypw), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.uym.5
                @Override // java.lang.Runnable
                public void run() {
                    uym.super.emc(str, jSONObject);
                }
            })) {
                return;
            }
        }
        super.emc(str, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.msw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc r3) {
        /*
            r2 = this;
            boolean r0 = r3.xq
            if (r0 == 0) goto L19
            r0 = 1
            r1 = 4
            r2.emc(r0, r1)
            com.bytedance.sdk.openadsdk.core.model.rie r0 = r3.ypw
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.ul.emc(r0)
            if (r0 == 0) goto L1c
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.sz
            boolean r0 = r0.get()
            if (r0 != 0) goto L1c
        L19:
            r2.yz()
        L1c:
            com.bytedance.sdk.openadsdk.common.emc.ypw(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.uym.emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc):void");
    }
}

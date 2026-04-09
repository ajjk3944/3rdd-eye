package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import b9.e;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.activity.vt;
import com.bytedance.sdk.openadsdk.common.zih;
import com.bytedance.sdk.openadsdk.component.reward.ouw.tlj;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.widget.vt;
import com.bytedance.sdk.openadsdk.utils.uoy;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw extends pno implements jae.ouw {
    private static String ex;
    private static String fkw;
    private static String jqy;
    private static String vpp;
    private static String yu;
    private boolean bs;

    /* renamed from: cd, reason: collision with root package name */
    private boolean f7753cd;
    private boolean fak;
    private int fvf;
    private vt.fkw jae;
    private int ksc;

    /* renamed from: lh, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.component.reward.vt.vt f7754lh;

    /* renamed from: od, reason: collision with root package name */
    private boolean f7755od;
    public boolean ouw;

    /* renamed from: pd, reason: collision with root package name */
    private JSONObject f7756pd;
    private Bundle tc;
    private long uq;
    protected final jae vt;

    public fkw(vt vtVar, vpp vppVar, int i4, int i10, boolean z3, boolean z10, boolean z11) {
        super(vtVar, vppVar, i4, i10, z10);
        jae jaeVar = new jae(Looper.getMainLooper(), this);
        this.vt = jaeVar;
        boolean z12 = false;
        this.ksc = 0;
        this.fak = true;
        this.rn = z3;
        this.mwh = vtVar.ouw();
        this.bs = z3 && od.lh(vppVar);
        this.ouw = z11;
        this.bs = this.rn && od.lh(vppVar);
        Bundle bundle = this.tc;
        Activity activityUx = ux();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = new com.bytedance.sdk.openadsdk.component.reward.ouw.ouw(activityUx, jaeVar, vppVar, this, 2, this.ra.zin);
        this.bly = ouwVar;
        ouwVar.odc = this.rn;
        boolean z13 = this.ouw;
        ouwVar.npr = z13;
        if (ouwVar.euf && !z13) {
            z12 = true;
        }
        ouwVar.xn = z12;
        vt vtVar2 = this.ra;
        ouwVar.euf = vtVar2.bly;
        ouwVar.njr = this.mwh;
        ouwVar.mq = vtVar2.f7772cf;
        if (!z13) {
            ouwVar.an = vtVar2.tlj.ryl();
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
        ouwVar2.f7959gh = this;
        ouwVar2.fvf = this.ra.fkw;
        com.bytedance.sdk.openadsdk.component.reward.ouw.vt.ouw(this.bly, activityUx.getIntent(), bundle);
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVarOuw = com.bytedance.sdk.openadsdk.component.reward.vt.le.ouw(this.bly);
        this.f7754lh = vtVarOuw;
        this.bly.coz = vtVarOuw;
        ko.vt("TTAD.EndCardScene", "init: mAdType = " + this.f7754lh);
    }

    private void fvf() {
        if (this.f7755od) {
            return;
        }
        this.f7755od = true;
        if (this.mwh) {
            this.ra.ouw(this.bly.rrs, fqk());
        } else {
            this.ra.ouw(this.bly.rrs);
        }
        this.f7754lh.jqy();
    }

    private void pd() {
        if (this.f7753cd) {
            return;
        }
        this.f7753cd = true;
        if (!this.ouw) {
            this.bly.an = this.ra.tlj.ryl();
        }
        this.bly.rrs.ouw(this.f7754lh);
        this.f7754lh.ouw(this, this.vt);
        this.f7754lh.cf();
    }

    private void yhj() {
        try {
            pd();
        } catch (Throwable th2) {
            ko.lh("TTAD.EndCardScene", "onCreate: ", th2);
            lso();
        }
        fvf();
        if (!th.le(this.f7765le) || this.ouw) {
            return;
        }
        vh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yib() {
        vt.fkw fkwVar = new vt.fkw(7, this.bly);
        fkwVar.yu = this.bly.f7958cj;
        this.ra.vt(this, fkwVar);
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
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.fkw.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (fkw.this.bly.bs.cf()) {
                        boolean z3 = fkw.this.bly.fak.fkw.get();
                        fkw.this.bly.bs.yu(z3);
                        fkw.this.bly.ey.le(8);
                        View view2 = viewTlj;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.le.yu) {
                            ((com.bytedance.sdk.openadsdk.core.le.yu) view2).setImageResource(com.bytedance.sdk.component.utils.vpp.yu(fkw.this.bly.hun, "tt_close_btn"));
                        }
                        fkw.this.bly.ux.sendEmptyMessageDelayed(600, 5000L);
                        if (!vpp.lh(fkw.this.bly.vt)) {
                            return;
                        }
                        if (vpp.lh(fkw.this.bly.vt) && z3) {
                            return;
                        }
                    }
                    fkw.this.bly.bs.ryl();
                    fkw.this.bly.fak.fkw();
                    fkw.this.bly.f7956cd.lh();
                    if (od.yu(fkw.this.bly.vt) && fkw.this.ouw(true, true, (Runnable) null)) {
                        return;
                    }
                    fkw.this.lso();
                }
            };
            viewTlj.setOnClickListener(onClickListener);
            viewTlj.setTag(viewTlj.getId(), onClickListener);
        }
        this.bly.uoy.ouw(new com.bytedance.sdk.openadsdk.component.reward.top.vt() { // from class: com.bytedance.sdk.openadsdk.activity.fkw.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void lh() {
                View view = viewTlj;
                if (view != null) {
                    view.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw() {
                fkw fkwVar = fkw.this;
                if (fkwVar.ouw(od.lh(fkwVar.bly.vt), false, (Runnable) null) || fkw.this.bly()) {
                    return;
                }
                if (!od.fkw(fkw.this.bly.vt)) {
                    if (!th.ouw(fkw.this.bly.vt) || fkw.this.bly.rn.get()) {
                        fkw.this.lso();
                        return;
                    } else {
                        fkw.this.lso();
                        return;
                    }
                }
                if (od.pno(fkw.this.bly.vt)) {
                    fkw.this.bly.ksc.ra();
                    return;
                }
                View view = viewTlj;
                if (view != null) {
                    view.performClick();
                } else {
                    fkw.this.lso();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void vt() {
                fkw.this.f_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void yu() {
                fkw fkwVar = fkw.this;
                fkwVar.vt(fkwVar.bly);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw(String str) {
                fkw.this.ouw(str);
            }
        });
    }

    public final boolean bly() {
        vt vtVar;
        if (this.ouw || (vtVar = this.ra) == null || !vtVar.tlj.yu()) {
            return false;
        }
        try {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), this.f7765le, this.bly.fkw, "skip", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.fkw.3
                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject ouw() {
                    if (fkw.this.f7756pd != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("scene_type", fkw.this.bly.ouw);
                            return jSONObject;
                        } catch (Throwable unused) {
                        }
                    }
                    return null;
                }

                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject vt() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", fkw.this.uq);
                        jSONObject.put("percent", fkw.this.fvf);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable unused) {
        }
        this.ra.ouw(this, true, false, false, 4);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean c_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void cf() {
        if (this.ra == null) {
            return;
        }
        this.bly.osn.ouw(this.jae.ouw.getBoolean("isSkip", false), this.jae.ouw.getBoolean("force", false), this.jae.ouw.getBoolean("isFromLandingPage", false), this.f7754lh, this.jae.vt);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean d_() {
        return this.bly.yu;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final String e_() {
        return this.bly.fkw;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final String ex() {
        return this.bly.f7968ub;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void f_() {
        this.bly.f7965pd.ouw(this.f7754lh);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean g_() {
        return this.bly.f7958cj;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void jg() {
        super.jg();
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f7754lh;
        if (vtVar == null) {
            return;
        }
        vtVar.zih();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean jqy() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        return ouwVar != null && ouwVar.ex.yu;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ksc() {
        return this.bly;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void le() {
        qbp.ouw("TTAD.EndCardScene", "onPlayableLoadingDismiss()---" + this.tlj + ",scene = " + this);
        vt vtVar = this.ra;
        if (vtVar != null) {
            vtVar.ouw(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void lh(boolean z3) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void mwh() {
        super.mwh();
        if (this.bly == null || com.bytedance.sdk.component.utils.vt.ouw(ux())) {
            return;
        }
        this.bly.bs.rn();
        com.bytedance.sdk.openadsdk.utils.yu.ouw(ux(), this.bly.vt);
    }

    public final boolean od() {
        return this.bly.bs.vm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final boolean ouw(long j, boolean z3) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void qbp() {
        super.qbp();
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f7754lh;
        if (vtVar == null) {
            return;
        }
        vtVar.th();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ra() {
        vt vtVar = this.ra;
        if (vtVar != null) {
            vtVar.vt(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final View rn() {
        return null;
    }

    public final void tc() {
        if (fqk()) {
            return;
        }
        vt.fkw fkwVar = new vt.fkw(8, this.bly);
        fkwVar.yu = this.bly.f7958cj;
        vt vtVar = this.ra;
        if (vtVar != null) {
            vtVar.ouw(this, fkwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void vm() {
        ub();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void zih() {
        if (this.bly.f7960jg.getAndSet(true)) {
            return;
        }
        this.bly.f7956cd.ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void zin() {
        super.zin();
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f7754lh;
        if (vtVar != null) {
            vtVar.qbp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void vt(boolean z3) {
        tlj tljVar;
        long j = this.fak ? this.bly.myk : 0L;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null && (tljVar = ouwVar.f7956cd) != null) {
            tljVar.vt(z3);
            this.bly.f7956cd.lh(z3);
            if (z3 && j > 0) {
                this.bly.myk = j;
            }
        }
        if (z3) {
            this.fak = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void yu() {
        super.yu();
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f7754lh;
        if (vtVar == null) {
            return;
        }
        vtVar.vm();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void lh() {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar;
        boolean z3;
        super.lh();
        if (this.bly == null || (vtVar = this.f7754lh) == null) {
            return;
        }
        vtVar.rn();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        ouwVar.pv = true;
        if (ouwVar.tlj.get() && this.bly.ra) {
            z3 = false;
        } else {
            z3 = this.f7765le.lh() ? this.bly.tlj.get() : true;
        }
        if (z3) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
            ouwVar2.uoy.ouw(ouwVar2.vt.ksc());
        }
        this.bly.ey.ko();
        this.bly.bs.tlj();
        this.bly.ksc.lh();
        if (this.f7754lh.vt()) {
            this.bly.ex.ouw(this.f7754lh);
            this.bly.ex.ouw(this, this.ksc != 0);
        }
        this.ksc++;
        com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = this.bly.jae;
        if (tljVar != null) {
            tljVar.lh();
        }
        this.bly.f7964od.ouw(this.vt);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(Activity activity, Bundle bundle) {
        this.tc = bundle;
        super.ouw(activity, bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final com.bytedance.sdk.openadsdk.component.reward.view.bly ouw() {
        return this.bly.rrs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(Activity activity, vt.fkw fkwVar) {
        vt vtVar;
        vt vtVar2;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar;
        this.jae = fkwVar;
        Intent intent = activity.getIntent();
        this.ko = intent.getStringExtra("media_extra");
        this.f7764jg = intent.getStringExtra("user_id");
        try {
            if (jqy == null) {
                jqy = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_reward_msg");
                yu = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_msgPlayable");
                vpp = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_negtiveBtnBtnText");
                ex = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_postiveBtnText");
                fkw = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            qbp.lh("TTAD.EndCardScene", th2.getMessage());
        }
        if (fkwVar != null && (ouwVar = fkwVar.f7781lh) != null) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
            ouwVar2.myk = ouwVar.myk;
            ouwVar2.f7958cj = ouwVar.f7958cj;
            if ((this.mwh || this.rn) && !fqk()) {
                this.bly.ryl.set(ouwVar.ryl.get());
            }
            if (!this.bs) {
                this.bly.mwh.set(ouwVar.mwh.get());
                this.bly.f7960jg.set(ouwVar.f7960jg.get());
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.bly;
            ouwVar3.ex.zin = ouwVar.ex.zin;
            if (this.mwh && !fqk() && ouwVar3 != null) {
                try {
                    this.uq = ouwVar.ex.pno;
                    if (this.f7765le.ryl()) {
                        this.uq = ouwVar.ouw();
                    }
                    this.fvf = ouwVar.ex.mwh();
                    vpp vppVar = this.f7765le;
                    long jPno = ouwVar.ex.pno();
                    e eVar = ouwVar.ex.ra;
                    this.f7756pd = uoy.ouw(vppVar, jPno, eVar != null ? eVar.zin() : null);
                } catch (Throwable th3) {
                    ko.lh("TTAD.EndCardScene", "saveLastAdScenePlayDuration: ", th3);
                }
            }
        }
        if (this.mwh || this.rn) {
            try {
                pd();
            } catch (Throwable th4) {
                ko.lh("TTAD.EndCardScene", "onCreate: ", th4);
                lso();
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = this.bly;
        if (ouwVar4 != null && (vtVar2 = this.ra) != null) {
            ouwVar4.ycd = vtVar2.f7774le;
        }
        fvf();
        b_();
        cf();
        if (!this.ouw || (vtVar = this.ra) == null || vtVar.f7775lh == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar5 = this.bly;
        int i4 = ouwVar5 != null ? ouwVar5.tlj.get() : -1;
        this.ra.f7775lh.ybr = i4;
        ko.vt("TTAD.EndCardScene", "showEndCard: isAggregateEndCard =" + this.ouw + " hasShowEnd =" + i4);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void bs() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ko() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ryl() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(String str) {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f7754lh;
        if (vtVar != null && vtVar.yu() != null) {
            this.f7754lh.yu().ouw(this.bly.f7958cj);
        }
        this.bly.f7958cj = !r0.f7958cj;
        ko.ouw("TTAD.EndCardScene", "rewarded_video", "will set is Mute " + this.bly.f7958cj + " mLastVolume=" + this.bly.fvf.vt);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        ouwVar.ex.ouw(ouwVar.f7958cj, str);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
        ouwVar2.bs.lh(ouwVar2.f7958cj);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.bly;
        ouwVar3.ksc.ouw(ouwVar3.f7958cj);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(Activity activity) {
        super.ouw(activity);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar == null) {
            return;
        }
        ouwVar.f7964od.ouw();
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f7754lh;
        if (vtVar == null) {
            return;
        }
        vtVar.ouw(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(String str, JSONObject jSONObject) {
        if (str == null || !"skipToNextAd".equals(str) || this.ra == null || fqk()) {
            return;
        }
        vt vtVar = this.ra;
        if (vtVar != null && vtVar.tlj.mwh() == null) {
            if (this.ra.vpp) {
                zih zihVar = this.zin;
                if (zihVar != null && zihVar.ouw(od.lh(this.bly.vt), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.fkw.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        fkw.this.yib();
                    }
                })) {
                    return;
                }
            } else if (ouw(od.lh(this.bly.vt), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.fkw.5
                @Override // java.lang.Runnable
                public final void run() {
                    fkw.this.yib();
                }
            })) {
                return;
            }
        }
        yib();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(boolean z3) {
        if (!z3 || this.bly.euf) {
            return;
        }
        ub();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(pno pnoVar, pno pnoVar2, vt.fkw fkwVar) {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar;
        super.ouw(pnoVar, pnoVar2, fkwVar);
        qbp.ouw("TTAD.EndCardScene", "【onActiveSceneChanged】" + this.tlj + ",scene = " + this + ",newScene = " + pnoVar2 + ",oldScene = " + pnoVar + ",isPlayable = " + this.rn);
        boolean z3 = this.tlj == pnoVar2.tlj + 1;
        if (pnoVar != null && (ouwVar = this.bly) != null) {
            ouwVar.f7958cj = fkwVar.yu;
        }
        if (z3) {
            qbp.ouw("TTAD.EndCardScene", "preload index =" + this.tlj + ",new index =" + pnoVar2.tlj + ",isPlayableProxy = " + this.rn);
            yhj();
        }
        if (pnoVar == null && this.ouw) {
            qbp.ouw("TTAD.EndCardScene", "preload agg-endcard =" + this.tlj + ",new index =" + pnoVar2.tlj + ",isPlayableProxy = " + this.rn);
            yhj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ouw(final boolean z3, boolean z10, final Runnable runnable) {
        if (this.bly.yu && !this.ra.yu.getBoolean("reward_verify", false)) {
            vt vtVar = this.ra;
            if (!vtVar.rn) {
                if (!z10 && vtVar.yu.getBoolean("user_has_give_up_reward", false)) {
                    return false;
                }
                com.bytedance.sdk.openadsdk.core.zih.yu();
                if (!cf.le(String.valueOf(this.bly.f7961le))) {
                    if (!z10) {
                        return false;
                    }
                    if (runnable == null && z3) {
                        lso();
                        return true;
                    }
                }
                this.bly.qbp.set(true);
                if (z3) {
                    this.bly.ksc.yu();
                }
                final com.bytedance.sdk.openadsdk.core.widget.vt vtVar2 = new com.bytedance.sdk.openadsdk.core.widget.vt(this.bly.jvy);
                this.f7754lh.mwh = vtVar2;
                if (z3) {
                    vtVar2.ouw = yu;
                    vtVar2.vt = fkw;
                    vtVar2.f8518lh = vpp;
                } else {
                    vtVar2.ouw = jqy;
                    vtVar2.vt = ex;
                    vtVar2.f8518lh = vpp;
                }
                vtVar2.yu = new vt.InterfaceC0101vt() { // from class: com.bytedance.sdk.openadsdk.activity.fkw.6
                    @Override // com.bytedance.sdk.openadsdk.core.widget.vt.InterfaceC0101vt
                    public final void ouw() {
                        if (z3) {
                            fkw.this.bly.ksc.ouw(1000);
                        }
                        vtVar2.dismiss();
                        fkw.this.bly.qbp.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.vt.InterfaceC0101vt
                    public final void vt() {
                        vtVar2.dismiss();
                        fkw.this.ra.yu.putBoolean("user_has_give_up_reward", true);
                        fkw.this.bly.qbp.set(false);
                        fkw.this.bly.ksc.fkw();
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        } else if (!z3) {
                            fkw.this.bly();
                        } else {
                            fkw.this.bly.f7956cd.lh();
                            fkw.this.lso();
                        }
                    }
                };
                vtVar2.show();
                return true;
            }
        }
        return false;
    }
}

package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.ypw;
import com.bytedance.sdk.openadsdk.common.vk;
import com.bytedance.sdk.openadsdk.component.reward.emc.ru;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.bytedance.sdk.openadsdk.core.widget.ypw;
import com.bytedance.sdk.openadsdk.utils.tp;
import j$.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bw extends msw implements sf.emc {
    private static String bw;
    private static String dg;
    private static String rie;
    private static String sra;
    private static String ylm;
    private boolean cuf;
    private ypw.bw db;
    private long dr;
    private int ee;
    public boolean emc;
    private Bundle hxp;
    private int lt;
    private boolean sb;
    private boolean sf;
    private JSONObject xmt;
    protected com.bytedance.sdk.openadsdk.component.reward.ypw.ypw xq;
    protected final sf ypw;

    public bw(ypw ypwVar, rie rieVar, int i, int i3, boolean z6, boolean z7, boolean z8) {
        super(ypwVar, rieVar, i, i3, z7);
        this.ypw = new sf(Looper.getMainLooper(), this);
        this.ee = 0;
        this.cuf = true;
        this.vk = z6;
        this.sz = ypwVar.bw();
        this.emc = z8;
        emc(rieVar, this.hxp);
    }

    private void dr() {
        if (this.sf) {
            return;
        }
        this.sf = true;
        if (!this.emc) {
            this.zz.rig = this.uym.rie();
        }
        this.zz.iyl.emc(this.xq);
        this.xq.emc(this, this.ypw);
        this.xq.ru();
    }

    private void jp() {
        try {
            dr();
        } catch (Throwable unused) {
            yz();
        }
        xmt();
        if (!ul.ycc(this.ycc) || this.emc) {
            return;
        }
        cn();
    }

    private boolean nw() {
        if (this.ycc.ycc()) {
            return this.zz.zz.get();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wbn() {
        ypw.bw bwVar = new ypw.bw(7, this.zz);
        bwVar.dg = this.zz.yz;
        this.uym.ypw(this, bwVar);
    }

    private void xmt() {
        if (this.sb) {
            return;
        }
        this.sb = true;
        if (this.sz) {
            this.uym.emc(emc(), tp());
        } else {
            this.uym.emc(emc());
        }
        this.xq.hxp();
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
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.bw.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (bw.this.zz.xmt.ul()) {
                        boolean zSz = bw.this.zz.lt.sz();
                        bw.this.zz.xmt.ycc(zSz);
                        bw.this.zz.mkp.ycc(8);
                        View view2 = viewRu;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.ycc.dg) {
                            ((com.bytedance.sdk.openadsdk.core.ycc.dg) view2).setImageResource(com.bytedance.sdk.component.utils.rie.dg(bw.this.zz.vw, "tt_close_btn"));
                        }
                        bw.this.zz.ra.sendEmptyMessageDelayed(600, 5000L);
                        if (!rie.xq(bw.this.zz.ypw)) {
                            return;
                        }
                        if (rie.xq(bw.this.zz.ypw) && zSz) {
                            return;
                        }
                    }
                    bw.this.zz.xmt.ylm();
                    bw.this.zz.lt.gbl();
                    bw.this.zz.db.ycc();
                    if (dr.dg(bw.this.zz.ypw) && bw.this.emc(true, true, (Runnable) null)) {
                        return;
                    }
                    bw.this.yz();
                }
            };
            viewRu.setOnClickListener(onClickListener);
            viewRu.setTag(viewRu.getId(), onClickListener);
        }
        this.zz.cuf.emc(new com.bytedance.sdk.openadsdk.component.reward.top.ypw() { // from class: com.bytedance.sdk.openadsdk.activity.bw.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void dg(View view) {
                bw bwVar = bw.this;
                bwVar.ypw(bwVar.zz);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void emc(View view) {
                bw bwVar = bw.this;
                if (bwVar.emc(dr.xq(bwVar.zz.ypw), false, (Runnable) null) || bw.this.msw()) {
                    return;
                }
                if (!dr.bw(bw.this.zz.ypw)) {
                    if (!ul.emc(bw.this.zz.ypw) || bw.this.zz.sz.get()) {
                        bw.this.yz();
                        return;
                    } else {
                        bw.this.yz();
                        return;
                    }
                }
                if (dr.msw(bw.this.zz.ypw)) {
                    bw.this.zz.rie.zz();
                    return;
                }
                View view2 = viewRu;
                if (view2 != null) {
                    view2.performClick();
                } else {
                    bw.this.yz();
                }
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
                bw.this.e_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void emc(View view, String str) {
                bw.this.emc(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void aa() {
        rqm();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public boolean b_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void bw() {
        com.bytedance.sdk.component.utils.ul.emc("TTAD.EndCardScene", "onPlayableLoadingDismiss()---" + this.ru + ",scene = " + this);
        ypw ypwVar = this.uym;
        if (ypwVar != null) {
            ypwVar.emc(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public boolean c_() {
        return this.zz.dg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public final void cf() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public String d_() {
        return this.zz.bw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void dg(boolean z6) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void e_() {
        this.zz.sf.emc(this.xq);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public com.bytedance.sdk.openadsdk.component.reward.emc.emc ee() {
        return this.zz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public boolean emc(long j6, boolean z6) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public boolean f_() {
        return this.zz.yz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public final void gbl() {
        if (this.uym == null) {
            return;
        }
        this.zz.rtt.emc(this.db.emc.getBoolean("isSkip", false), this.db.emc.getBoolean("force", false), this.db.emc.getBoolean("isFromLandingPage", false), this.xq, this.db.ypw);
    }

    public boolean hxp() {
        return this.zz.xmt.sf();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void lt() {
    }

    public boolean msw() {
        ypw ypwVar;
        if (this.emc || (ypwVar = this.uym) == null || !ypwVar.yzg()) {
            return false;
        }
        try {
            com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), this.ycc, this.zz.bw, "skip", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.activity.bw.3
                @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                public JSONObject emc() {
                    if (bw.this.xmt != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("scene_type", bw.this.zz.emc);
                            return jSONObject;
                        } catch (Throwable unused) {
                        }
                    }
                    return null;
                }

                @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                public JSONObject ypw() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", bw.this.dr);
                        jSONObject.put("percent", bw.this.lt);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable unused) {
        }
        this.uym.emc(this, true, false, false, 4);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public final void qh() {
        super.qh();
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar = this.xq;
        if (ypwVar == null) {
            return;
        }
        ypwVar.aa();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public String rie() {
        return this.zz.xxg;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public boolean sra() {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        return emcVar != null && emcVar.ylm.lt();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void sup() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public final void sz() {
        super.sz();
        if (this.zz == null || com.bytedance.sdk.component.utils.ypw.emc(xxg())) {
            return;
        }
        this.zz.xmt.db();
        com.bytedance.sdk.openadsdk.utils.dg.emc(xxg(), this.zz.ypw);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void ul() {
        super.ul();
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar = this.xq;
        if (ypwVar != null) {
            ypwVar.ul();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public final View vk() {
        return null;
    }

    public void ylm() {
        if (tp()) {
            return;
        }
        ypw.bw bwVar = new ypw.bw(8, this.zz);
        bwVar.dg = this.zz.yz;
        ypw ypwVar = this.uym;
        if (ypwVar != null) {
            ypwVar.emc(this, bwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void yzg() {
        super.yzg();
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar = this.xq;
        if (ypwVar == null) {
            return;
        }
        ypwVar.yzg();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public final void xq() {
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar;
        super.xq();
        if (this.zz == null || (ypwVar = this.xq) == null) {
            return;
        }
        ypwVar.cf();
        this.zz.wpn = true;
        if (nw()) {
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
            emcVar.cuf.emc(emcVar.ypw.lr());
        }
        this.zz.mkp.cf();
        this.zz.xmt.aa();
        this.zz.rie.bw();
        if (this.xq.ypw()) {
            this.zz.ylm.emc(this.xq);
            this.zz.ylm.emc(false, this, this.ee != 0);
        }
        this.ee++;
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar = this.zz.hxp;
        if (zzVar != null) {
            zzVar.uym();
        }
        this.zz.ee.emc(this.ypw);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void ypw(boolean z6) {
        if (!z6 || this.zz.wbn) {
            return;
        }
        rqm();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void dg() {
        super.dg();
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar = this.xq;
        if (ypwVar == null) {
            return;
        }
        ypwVar.sba();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public final void emc(Activity activity, Bundle bundle) {
        this.hxp = bundle;
        super.emc(activity, bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public final com.bytedance.sdk.openadsdk.component.reward.view.msw emc() {
        return this.zz.iyl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void emc(Activity activity, ypw.bw bwVar) {
        ypw ypwVar;
        ypw ypwVar2;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar;
        this.db = bwVar;
        Intent intent = activity.getIntent();
        this.cf = intent.getStringExtra("media_extra");
        this.qh = intent.getStringExtra("user_id");
        try {
            if (sra == null) {
                sra = com.bytedance.sdk.component.utils.rie.emc(this.zz.vw, "tt_reward_msg");
                dg = com.bytedance.sdk.component.utils.rie.emc(this.zz.vw, "tt_msgPlayable");
                ylm = com.bytedance.sdk.component.utils.rie.emc(this.zz.vw, "tt_negtiveBtnBtnText");
                rie = com.bytedance.sdk.component.utils.rie.emc(this.zz.vw, "tt_postiveBtnText");
                bw = com.bytedance.sdk.component.utils.rie.emc(this.zz.vw, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("TTAD.EndCardScene", th.getMessage());
        }
        if (bwVar != null && (emcVar = bwVar.xq) != null) {
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.zz;
            emcVar2.hj = emcVar.hj;
            emcVar2.yz = emcVar.yz;
            if ((this.sz || this.vk) && !tp()) {
                this.zz.gbl.set(emcVar.gbl.get());
            }
            this.zz.ylm.emc(emcVar.ylm.bw());
            emc(this.zz, emcVar);
        }
        if (this.sz || this.vk) {
            try {
                dr();
            } catch (Throwable unused) {
                yz();
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar3 = this.zz;
        if (emcVar3 != null && (ypwVar2 = this.uym) != null) {
            emcVar3.yid = ypwVar2.emc;
        }
        xmt();
        a_();
        gbl();
        if (!this.emc || (ypwVar = this.uym) == null || ypwVar.emc() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar4 = this.zz;
        this.uym.emc().bw(emcVar4 != null ? emcVar4.zz.get() : -1);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void xq(boolean z6) {
        ru ruVar;
        long j6 = this.cuf ? this.zz.hj : 0L;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        if (emcVar != null && (ruVar = emcVar.db) != null) {
            ruVar.ypw(z6);
            this.zz.db.xq(z6);
            if (z6 && j6 > 0) {
                this.zz.hj = j6;
            }
        }
        if (z6) {
            this.cuf = false;
        }
    }

    private void emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar, com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2) {
        if (!this.sz || tp() || emcVar == null || emcVar2 == null) {
            return;
        }
        try {
            this.dr = emcVar2.ylm.sz();
            if (this.ycc.but()) {
                this.dr = emcVar2.ycc();
            }
            this.lt = emcVar2.ylm.rie();
            this.xmt = tp.emc(this.ycc, emcVar2.ylm.vk(), emcVar2.ylm.aa());
        } catch (Throwable unused) {
        }
    }

    private void emc(rie rieVar, Bundle bundle) {
        Activity activityXxg = xxg();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = new com.bytedance.sdk.openadsdk.component.reward.emc.emc(activityXxg, this.ypw, rieVar, this, 2, this.uym.ypw());
        this.zz = emcVar;
        emcVar.bv = this.vk;
        boolean z6 = this.emc;
        emcVar.ipv = z6;
        emcVar.rgy = emcVar.wbn && !z6;
        emcVar.wbn = this.uym.ycc();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.zz;
        emcVar2.jp = this.sz;
        emcVar2.ltx = this.uym.dg();
        if (!this.emc) {
            this.zz.rig = this.uym.rie();
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar3 = this.zz;
        emcVar3.pe = this;
        emcVar3.dr = this.uym.ylm();
        com.bytedance.sdk.openadsdk.component.reward.emc.ypw.emc(this.zz, activityXxg.getIntent(), bundle);
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVarEmc = com.bytedance.sdk.openadsdk.component.reward.ypw.ycc.emc(this.zz);
        this.xq = ypwVarEmc;
        this.zz.cn = ypwVarEmc;
        Objects.toString(ypwVarEmc);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void emc(String str) {
        this.zz.yz = !r0.yz;
        StringBuilder sb = new StringBuilder("will set is Mute ");
        sb.append(this.zz.yz);
        sb.append(" mLastVolume=");
        sb.append(this.zz.dr.emc());
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        emcVar.ylm.emc(emcVar.yz, str);
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.zz;
        emcVar2.xmt.bw(emcVar2.yz);
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar3 = this.zz;
        emcVar3.rie.ypw(emcVar3.yz);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void emc(Activity activity) {
        super.emc(activity);
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        if (emcVar == null) {
            return;
        }
        emcVar.ee.emc();
    }

    @Override // com.bytedance.sdk.component.utils.sf.emc
    public final void emc(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar = this.xq;
        if (ypwVar == null) {
            return;
        }
        ypwVar.emc(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void emc(String str, JSONObject jSONObject) {
        if (str == null || !"skipToNextAd".equals(str) || this.uym == null || tp()) {
            return;
        }
        ypw ypwVar = this.uym;
        if (ypwVar != null && ypwVar.hxp() == null) {
            if (this.uym.xq()) {
                vk vkVar = this.ul;
                if (vkVar != null && vkVar.emc(dr.xq(this.zz.ypw), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.bw.4
                    @Override // java.lang.Runnable
                    public void run() {
                        bw.this.wbn();
                    }
                })) {
                    return;
                }
            } else if (emc(dr.xq(this.zz.ypw), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.bw.5
                @Override // java.lang.Runnable
                public void run() {
                    bw.this.wbn();
                }
            })) {
                return;
            }
        }
        wbn();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void emc(boolean z6) {
        ypw ypwVar = this.uym;
        if (ypwVar != null) {
            ypwVar.emc(this, z6);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void emc(msw mswVar, msw mswVar2, ypw.bw bwVar) {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar;
        super.emc(mswVar, mswVar2, bwVar);
        com.bytedance.sdk.component.utils.ul.emc("TTAD.EndCardScene", "【onActiveSceneChanged】" + this.ru + ",scene = " + this + ",newScene = " + mswVar2 + ",oldScene = " + mswVar + ",isPlayable = " + this.vk);
        boolean z6 = this.ru == mswVar2.ru + 1;
        if (mswVar != null && (emcVar = this.zz) != null) {
            emcVar.yz = bwVar.dg;
        }
        if (z6) {
            com.bytedance.sdk.component.utils.ul.emc("TTAD.EndCardScene", "preload index =" + this.ru + ",new index =" + mswVar2.ru + ",isPlayableProxy = " + this.vk);
            jp();
        }
        if (mswVar == null && this.emc) {
            com.bytedance.sdk.component.utils.ul.emc("TTAD.EndCardScene", "preload agg-endcard =" + this.ru + ",new index =" + mswVar2.ru + ",isPlayableProxy = " + this.vk);
            jp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean emc(final boolean z6, boolean z7, final Runnable runnable) {
        if (!this.zz.dg || this.uym.sup().getBoolean("reward_verify", false) || this.uym.vk()) {
            return false;
        }
        if (!z7 && this.uym.sup().getBoolean("user_has_give_up_reward", false)) {
            return false;
        }
        if (!aa.dg().msw(String.valueOf(this.zz.ycc))) {
            if (!z7) {
                return false;
            }
            if (runnable == null && z6) {
                yz();
                return true;
            }
        }
        this.zz.aa.set(true);
        if (z6) {
            this.zz.rie.ycc();
        }
        final com.bytedance.sdk.openadsdk.core.widget.ypw ypwVar = new com.bytedance.sdk.openadsdk.core.widget.ypw(this.zz.mxo);
        this.xq.sup = ypwVar;
        if (z6) {
            ypwVar.emc(dg).ypw(bw).xq(ylm);
        } else {
            ypwVar.emc(sra).ypw(rie).xq(ylm);
        }
        this.xq.sup.emc(new ypw.InterfaceC0080ypw() { // from class: com.bytedance.sdk.openadsdk.activity.bw.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.ypw.InterfaceC0080ypw
            public void emc() {
                if (z6) {
                    bw.this.zz.rie.emc(TTAdConstant.STYLE_SIZE_RADIO_1_1);
                }
                ypwVar.dismiss();
                bw.this.zz.aa.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ypw.InterfaceC0080ypw
            public void ypw() {
                ypwVar.dismiss();
                bw.this.uym.sup().putBoolean("user_has_give_up_reward", true);
                bw.this.zz.aa.set(false);
                bw.this.zz.rie.ypw(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (!z6) {
                    bw.this.msw();
                } else {
                    bw.this.zz.db.ycc();
                    bw.this.yz();
                }
            }
        }).show();
        return true;
    }
}

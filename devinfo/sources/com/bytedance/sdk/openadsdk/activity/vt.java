package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.component.reward.ouw.cf;
import com.bytedance.sdk.openadsdk.component.reward.ryl;
import com.bytedance.sdk.openadsdk.component.reward.tlj;
import com.bytedance.sdk.openadsdk.core.model.cd;
import com.bytedance.sdk.openadsdk.core.model.ex;
import com.bytedance.sdk.openadsdk.core.model.jqy;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import je.u;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    static com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouw;
    static com.bytedance.sdk.openadsdk.ouw.lh.vt vt;
    final boolean bly;

    /* renamed from: cf, reason: collision with root package name */
    final boolean f7772cf;
    final com.bytedance.sdk.openadsdk.mwh.bly fkw;

    /* renamed from: jg, reason: collision with root package name */
    Bundle f7773jg;
    private final boolean jqy;
    boolean ko;

    /* renamed from: le, reason: collision with root package name */
    public tlj f7774le;

    /* renamed from: lh, reason: collision with root package name */
    final vpp f7775lh;
    int mwh;
    com.bytedance.sdk.openadsdk.ouw.lh.vt pno;
    boolean qbp;
    com.bytedance.sdk.openadsdk.ouw.fkw.ouw ra;
    public boolean rn;
    Activity ryl;

    /* renamed from: th, reason: collision with root package name */
    public boolean f7776th;
    public com.bytedance.sdk.openadsdk.activity.lh tlj;
    final boolean vpp;
    Runnable zih;
    final boolean zin;
    final Bundle yu = new Bundle();
    final cf.vt vm = new cf.vt();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class fkw {
        public boolean fkw;

        /* renamed from: lh, reason: collision with root package name */
        public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw f7781lh;
        public final Bundle ouw = new Bundle();
        public final int vt;
        public boolean yu;

        public fkw(int i4, com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
            this.vt = i4;
            this.f7781lh = ouwVar;
        }

        public final String toString() {
            return super.toString();
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class lh implements Runnable {
        private final vpp ouw;

        public lh(vpp vppVar) {
            this.ouw = vppVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            vpp vppVar = this.ouw;
            if (vppVar.zn) {
                return;
            }
            if (vppVar.ey()) {
                ryl.ouw(zih.ouw()).ouw(this.ouw.yiz);
            } else {
                com.bytedance.sdk.openadsdk.component.reward.fkw.ouw(zih.ouw()).ouw(this.ouw.yiz);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw extends AbstractC0066vt {
        public ouw(vt vtVar, vpp vppVar, com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar) {
            super(vtVar, vppVar, lhVar);
        }

        @Override // com.bytedance.sdk.openadsdk.activity.vt.AbstractC0066vt
        public final int ouw(vpp vppVar) {
            String strValueOf;
            ex exVar;
            if (vppVar != null) {
                com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = vppVar.vm;
                if (ouwVar != null && (exVar = ouwVar.f8252le) != null) {
                    return exVar.f8221le;
                }
                AdSlot adSlot = vppVar.yiz;
                if (adSlot != null) {
                    strValueOf = adSlot.getCodeId();
                } else {
                    int iFqk = vppVar.fqk();
                    strValueOf = iFqk != 0 ? String.valueOf(iFqk) : null;
                }
                if (strValueOf != null) {
                    zih.yu();
                    return com.bytedance.sdk.openadsdk.core.settings.cf.jg(strValueOf);
                }
            }
            return 5;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.activity.vt$vt, reason: collision with other inner class name */
    public static abstract class AbstractC0066vt implements Handler.Callback {
        private int bs;

        /* renamed from: cd, reason: collision with root package name */
        private int f7782cd;

        /* renamed from: cf, reason: collision with root package name */
        int f7783cf;
        private boolean ey;
        protected int fkw;
        private int fqk;
        private boolean fvf;
        private int hun;
        private boolean jae;

        /* renamed from: jg, reason: collision with root package name */
        int f7784jg;
        private final Context jqy;
        private boolean jvy;
        boolean ko;
        private boolean ksc;

        /* renamed from: le, reason: collision with root package name */
        protected int f7785le;

        /* renamed from: lh, reason: collision with root package name */
        protected float f7786lh;
        private boolean lso;
        int mwh;

        /* renamed from: od, reason: collision with root package name */
        private boolean f7787od;
        private int osn;
        protected final vt ouw;

        /* renamed from: pd, reason: collision with root package name */
        private int f7788pd;
        float pno;
        boolean qbp;
        private boolean rrs;
        int ryl;
        private boolean tc;

        /* renamed from: th, reason: collision with root package name */
        boolean f7789th;
        int tlj;
        private int uoy;
        private boolean uq;
        private int ux;
        int vm;
        private final com.bytedance.sdk.openadsdk.component.reward.top.lh vpp;
        protected vpp vt;
        protected int yu;
        private final Handler zin = new Handler(Looper.getMainLooper(), this);
        private final int ex = 1000;
        protected int ra = -1;
        int bly = 1000;
        private boolean fak = false;
        boolean rn = false;
        public int zih = -1;

        public AbstractC0066vt(vt vtVar, vpp vppVar, com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar) {
            this.ouw = vtVar;
            this.vt = vppVar;
            this.vpp = lhVar;
            this.jqy = lhVar.getContext();
            this.yu = ouw(vppVar);
        }

        private void bly() {
            ko.vt("TTAD.AdSceneManager", "sendPlayableCountDownMessage: startPlayableCountDown=" + this.lso + ",isPlayableLoadingDismiss=" + this.uq + ",isHappenInteraction=" + this.ko);
            if (this.lso) {
                this.f7785le = 4;
                ouw(4, 1000);
            }
        }

        private void cf() {
            if (this.uq && this.lso) {
                if (this.jae) {
                    this.lso = false;
                }
                if (this.fvf) {
                    return;
                }
                ko.vt("TTAD.AdSceneManager", "onPlayableCountDown: playableCountDown=" + this.f7788pd + ",isPlayableLoadingDismiss=" + this.uq + ",isHappenInteraction=" + this.ko + ",isLastAd=" + this.fvf);
                int i4 = this.f7788pd + 1;
                this.f7788pd = i4;
                if (this.ko) {
                    this.mwh = this.ryl;
                } else {
                    this.mwh = this.tlj + this.f7783cf;
                }
                if (i4 >= this.tlj) {
                    if (!this.rn) {
                        this.bs++;
                        this.rn = true;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("click_countdown_remaining", this.yu);
                            jSONObject.put("hint_sequence", this.bs);
                            com.bytedance.sdk.openadsdk.yu.lh.yu(this.vt, this.ouw.tlj.cf().e_(), jSONObject);
                        } catch (Throwable unused) {
                        }
                    }
                    com.bytedance.sdk.openadsdk.activity.lh lhVar = this.ouw.tlj;
                    int i10 = this.f7784jg;
                    this.f7784jg = i10 - 1;
                    lhVar.ouw(i10, this.yu);
                    ko.vt("TTAD.AdSceneManager", "wait tips show time = " + this.f7784jg + ",hitSequence =" + this.bs + ",hasHitSequenceAssigned=" + this.rn);
                } else {
                    this.rn = false;
                    this.ouw.tlj.ouw(-1, this.yu);
                }
                if (this.ko && this.f7788pd >= this.f7782cd) {
                    ko.vt("TTAD.AdSceneManager", "next ad  show  = " + this.f7788pd + ",hasShowSkip=" + this.ksc + ",hasShowClose=" + this.jae);
                    if (!this.ksc && !this.jae) {
                        this.vpp.setShowPlayableNextAd(true, this.vt);
                    }
                }
                if (this.f7788pd >= this.mwh) {
                    ko.vt("TTAD.AdSceneManager", "prepare skip to next  ad " + this.f7784jg);
                    if (this.ouw.tlj.cf() != null) {
                        pno pnoVarCf = this.ouw.tlj.cf();
                        if (pnoVarCf instanceof com.bytedance.sdk.openadsdk.activity.fkw) {
                            this.zin.removeMessages(4);
                            ((com.bytedance.sdk.openadsdk.activity.fkw) pnoVarCf).tc();
                        }
                    }
                }
            }
        }

        private void jg() {
            ko.vt("TTAD.AdSceneManager", "onLandingPageCountDownForDialogStyle: lastInteractionTime=" + this.vm + ",showAfterInactivityMs=" + this.fqk + ",hasShowDialog=" + this.qbp + ",popupCount =" + this.ux + ",maxTime =" + this.hun);
            if (this.vm < this.fqk || this.qbp) {
                return;
            }
            int i4 = this.ux;
            if (i4 >= this.hun) {
                this.f7789th = false;
            } else {
                this.ux = i4 + 1;
                ko();
            }
        }

        private void ko() {
            pno pnoVarCf;
            this.qbp = true;
            this.vm = 0;
            vt vtVar = this.ouw;
            if (vtVar == null || (pnoVarCf = vtVar.tlj.cf()) == null || pnoVarCf.ucs()) {
                return;
            }
            mwh();
        }

        private void mwh() {
            com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
            if (this.fvf || this.ksc || this.jae || (lhVar = this.vpp) == null) {
                return;
            }
            lhVar.setShowEndCardNextAd(true, this.vt);
        }

        private void pno() {
            if (this.ra <= 0 || !this.f7787od) {
                return;
            }
            this.f7785le = 3;
            ouw(3, 1000);
        }

        private void ra() {
            int i4 = this.ra;
            if (i4 > 0) {
                this.ra = i4 - 1;
                ko.vt("TTAD.AdSceneManager", "onEndCardCountDownloadFinish: ,endCardTime " + this.ra);
            }
            if (this.ra == 0 && this.f7787od) {
                this.f7787od = false;
                vt vtVar = this.ouw;
                if (vtVar == null || vtVar.tlj.cf() == null) {
                    return;
                }
                pno pnoVarCf = this.ouw.tlj.cf();
                if (pnoVarCf instanceof com.bytedance.sdk.openadsdk.activity.fkw) {
                    ((com.bytedance.sdk.openadsdk.activity.fkw) pnoVarCf).tc();
                }
            }
        }

        private void ryl() {
            if (this.uq && this.f7789th && !this.fvf) {
                ko.vt("TTAD.AdSceneManager", "onCountDownLPStart: countDownNew=" + this.uoy + ",lastInteractionTime=" + this.vm + ",countDown=" + this.yu + ",isHappenInteraction =" + this.ko);
                int i4 = this.uoy + 1;
                this.uoy = i4;
                this.vm = this.vm + 1;
                if (this.ko && i4 >= this.osn) {
                    mwh();
                }
                if (this.rrs || this.ey) {
                    jg();
                }
            }
        }

        private void tlj() {
            if (this.ouw.tlj.yu()) {
                this.vpp.showSkipButton();
                this.ksc = true;
            } else {
                this.jae = true;
                this.vpp.showCloseButton();
            }
            this.vpp.setShowPlayableNextAd(false, this.vt);
            ko.vt("TTAD.AdSceneManager", "onCountDownFinish: hasShowSkip=" + this.ksc + ", hasShowClose=" + this.jae);
        }

        public final void fkw() {
            ko.vt("TTAD.AdSceneManager", "onPlaybleLoadingDismiss countDownload =" + this.yu + ",waitTipsTime=" + this.tlj + ",changeToNextTime=" + this.f7783cf + ",nextAdTipsShowTime=" + this.f7782cd + ",maxShowTime=" + this.ryl);
            this.uq = true;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1 || i4 == 2) {
                ouw(message);
            } else if (i4 == 3) {
                if (this.ra > 0) {
                    ra();
                    if (this.ra >= 0) {
                        ouw(message.what, 1000);
                    }
                }
            } else if (i4 == 4) {
                if (this.lso) {
                    cf();
                    if (this.lso && !this.fvf) {
                        ouw(message.what, 1000);
                    }
                }
            } else if (i4 == 5 && this.f7789th) {
                ryl();
                if (this.f7789th && !this.fvf) {
                    ouw(message.what, 1000);
                }
            }
            return true;
        }

        public final void le() {
            ko.vt("TTAD.AdSceneManager", "onDialogHide: ");
            if (this.f7789th) {
                mwh();
                this.qbp = false;
            }
        }

        public final void lh() {
            this.zin.removeMessages(this.f7785le);
        }

        public final int ouw() {
            return this.yu;
        }

        public abstract int ouw(vpp vppVar);

        public final void vt() {
            this.lso = false;
            this.f7789th = false;
            this.rn = false;
            this.bs = 0;
            this.zih = -1;
            this.qbp = false;
            this.hun = 0;
            this.vm = 0;
            this.uoy = 0;
            this.ko = false;
            this.ux = 0;
            this.fak = false;
            com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = this.vpp;
            if (lhVar != null) {
                lhVar.setShowPlayableNextAd(false, this.vt);
            }
            ko.vt("TTAD.AdSceneManager", "resetPlayableStatus: lastPlayState=" + this.zih);
        }

        public final void yu() {
            if (this.ksc || this.jae) {
                return;
            }
            ouw(-1);
            this.fak = true;
            com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = this.vpp;
            if (lhVar != null) {
                lhVar.setCountDownFor1InN("", -1);
                this.vpp.setShowEndCardNextAd(true, this.vt);
            }
        }

        public final void lh(int i4) {
            this.ra = i4;
            if (i4 > 0) {
                this.f7787od = true;
                if (this.yu <= 0 || this.ksc) {
                    pno();
                }
            }
        }

        public final void ouw(int i4) {
            ko.vt("TTAD.AdSceneManager", "pause: " + this.yu + ",hasShowSkip =" + this.ksc + ",hasShowClose=" + this.jae + ",msgType =" + this.f7785le + ",playState=" + i4);
            if (i4 != -1) {
                this.zih = i4;
            }
            this.zin.removeMessages(this.f7785le);
        }

        private void ouw(Message message) {
            if (this.yu > 0) {
                int i4 = (int) (((r1 - r0) * 100.0d) / this.fkw);
                com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = this.vpp;
                StringBuilder sb2 = new StringBuilder();
                int i10 = this.yu;
                this.yu = i10 - 1;
                sb2.append(i10);
                sb2.append("s");
                lhVar.setCountDownFor1InN(sb2.toString(), i4);
                ra();
                cf();
                if (this.yu >= 0) {
                    ouw(message.what, this.bly);
                }
                ryl();
                return;
            }
            pno();
            bly();
            ouw(true);
            tlj();
        }

        public final void vt(int i4) {
            if (this.zih == 2 && i4 != 1) {
                ko.vt("TTAD.AdSceneManager", "resume: pause by state is pause ,but resume is not by play");
                return;
            }
            if (i4 != -1) {
                this.zih = i4;
            }
            if (this.zin.hasMessages(this.f7785le)) {
                ko.vt("TTAD.AdSceneManager", "resume: has already msgType =" + this.f7785le);
                return;
            }
            if (this.fak) {
                ko.vt("TTAD.AdSceneManager", "resume: pause by endcard show,need not resume ");
                return;
            }
            vt vtVar = this.ouw;
            if (vtVar == null || vtVar.tlj.cf() == null || this.ouw.tlj.cf().ksc() == null || !this.ouw.tlj.cf().ksc().f7957cf.get()) {
                ko.vt("TTAD.AdSceneManager", "resume: countDownSeconds =" + this.yu + ",hasShowSkip =" + this.ksc + ",newState=" + i4 + ",msgType =" + this.f7785le + ",lastPlayState =" + this.zih);
                int i10 = this.f7785le;
                if (i10 == 1 || i10 == 2) {
                    if (this.yu < 0 || this.ksc || this.jae) {
                        return;
                    }
                    this.zin.sendEmptyMessageDelayed(i10, this.bly);
                    return;
                }
                if (i10 == 3) {
                    pno();
                } else if (i10 == 4) {
                    bly();
                } else if (i10 == 5) {
                    ouw(true);
                }
            }
        }

        private void ouw(int i4, int i10) {
            if (this.fak) {
                ko.vt("TTAD.AdSceneManager", "sendNextMessageDelayInterval: isPause=" + this.fak);
            } else {
                this.zin.removeMessages(i4);
                this.zin.sendEmptyMessageDelayed(i4, i10);
            }
        }

        private void ouw(boolean z3) {
            if (this.f7789th) {
                this.f7785le = 5;
                if (z3) {
                    ouw(5, 1000);
                } else {
                    this.zin.sendEmptyMessage(5);
                }
            }
        }

        public final void ouw(vpp vppVar, boolean z3) {
            this.tlj = od.mwh(vppVar);
            this.f7783cf = od.rn(vppVar);
            od odVarOuw = od.ouw(vppVar);
            this.f7782cd = odVarOuw == null ? 0 : odVarOuw.f8248jg;
            od odVarOuw2 = od.ouw(vppVar);
            this.ryl = odVarOuw2 == null ? 0 : odVarOuw2.ko;
            this.f7784jg = this.f7783cf;
            this.uq = false;
            this.ko = false;
            this.f7788pd = 0;
            this.lso = true;
            com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = this.vpp;
            if (lhVar != null) {
                lhVar.setShowPlayableNextAd(false, vppVar);
            }
            this.fvf = z3;
            if (this.yu <= 0 || this.ksc) {
                bly();
            }
            ko.vt("TTAD.AdSceneManager", "onCountDownPlayable: waitTipsTime=" + this.tlj + ",changeToNextTime=" + this.f7783cf + ",nextAdTipsShowTime=" + this.f7782cd + ",maxShowTime=" + this.ryl);
        }

        public final void ouw(pno pnoVar) {
            vpp vppVar;
            jqy jqyVar;
            if (pnoVar == null || (vppVar = pnoVar.f7765le) == null || (jqyVar = vppVar.f8297jg) == null) {
                return;
            }
            this.osn = jqyVar.f8231lh;
            this.fvf = pnoVar.zih;
            this.hun = jqyVar.ouw;
            this.jvy = pnoVar.rn;
            this.fqk = jqyVar.vt;
            this.ey = th.le(vppVar);
            this.rrs = th.fkw(pnoVar.f7765le);
            this.f7789th = true;
            if ((this.yu <= 0 || this.ksc) && !this.zin.hasMessages(5)) {
                ouw(false);
            }
        }

        public void ouw(int i4, vpp vppVar) {
            cd cdVar;
            if (vppVar != null && (cdVar = vppVar.f8311tj) != null) {
                this.pno = cdVar.ouw;
                this.vt = vppVar;
            }
            StringBuilder sbW = u.w(i4, "onSceneChanged: newTotalVideoDuration=", ", countDownSeconds=");
            sbW.append(this.yu);
            sbW.append(", hasShowSkip=");
            sbW.append(this.ksc);
            sbW.append(", hasShowClose=");
            sbW.append(this.jae);
            sbW.append(", msgType=");
            sbW.append(this.f7785le);
            ko.vt("TTAD.AdSceneManager", sbW.toString());
            if (this.ksc || this.jae) {
                return;
            }
            float f10 = i4;
            this.f7786lh = f10;
            int i10 = this.f7785le;
            if (f10 <= this.yu) {
                this.f7785le = 2;
                this.yu = (int) f10;
            } else if (i10 == 0) {
                this.f7785le = 1;
            }
            if (!this.tc) {
                this.fkw = this.yu;
                this.tc = true;
            }
            int i11 = this.f7785le;
            if (i10 == i11 && this.zin.hasMessages(i11)) {
                return;
            }
            this.zin.removeCallbacksAndMessages(null);
            this.zin.sendEmptyMessage(this.f7785le);
        }
    }

    public vt(Activity activity, vpp vppVar, boolean z3) {
        this.f7775lh = vppVar;
        this.qbp = z3;
        this.ryl = activity;
        boolean zBly = com.bytedance.sdk.openadsdk.vpp.ouw.bly();
        this.vpp = zBly;
        qbp.ouw("BVA", "AdSceneManager() called with: enableIvRvTopBarNewArch = [" + zBly + "]");
        this.fkw = new com.bytedance.sdk.openadsdk.mwh.bly(activity.getApplicationContext());
        boolean z10 = vppVar.tpk;
        this.bly = z10;
        this.jqy = z10 && 39 == vppVar.fvf;
        this.f7772cf = z10 && 40 == vppVar.fvf;
        int i4 = vppVar.fvf;
        if (i4 == 43 || i4 == 44) {
            this.tlj = new com.bytedance.sdk.openadsdk.activity.yu(this.ryl, vppVar, this);
        } else {
            this.tlj = new bly(this.ryl, vppVar, this);
        }
        boolean z11 = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("adapt_decor_size", 0) == 1;
        this.zin = z11;
        qbp.ouw("BVA", "scene manager isAdaptDecorSize =" + z11);
        this.tlj.ouw();
        if (vppVar.ey()) {
            this.f7774le = new tlj(new tlj.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.vt.1
                @Override // com.bytedance.sdk.openadsdk.component.reward.tlj.ouw
                public final void ouw() {
                    pno pnoVarCf;
                    if (vt.this.yu.getBoolean("reward_verify", false)) {
                        return;
                    }
                    vt vtVar = vt.this;
                    if (vtVar.rn || vtVar.yu.getBoolean("user_has_give_up_reward", false) || (pnoVarCf = vt.this.tlj.cf()) == null) {
                        return;
                    }
                    pnoVarCf.lh(1);
                }
            });
        }
    }

    public final void fkw() {
        this.ko = true;
        this.tlj.rn();
    }

    public final Activity lh() {
        com.bytedance.sdk.openadsdk.activity.lh lhVar = this.tlj;
        return lhVar == null ? this.ryl : lhVar.ouw;
    }

    public final boolean ouw() {
        if (this.f7775lh != null && this.bly) {
            return this.jqy || this.f7772cf;
        }
        return false;
    }

    public final void vt() {
        Activity activity = this.ryl;
        if (activity != null) {
            activity.finish();
        }
    }

    public final void yu() {
        com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar = this.ra;
        if (ouwVar != null) {
            ouwVar.onAdClicked();
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar = this.pno;
        if (vtVar != null) {
            vtVar.onAdClicked();
        }
    }

    public final void vt(pno pnoVar) {
        com.bytedance.sdk.openadsdk.activity.lh lhVar = this.tlj;
        if (lhVar == null) {
            return;
        }
        lhVar.ouw(pnoVar, true);
    }

    public final void lh(pno pnoVar) {
        pnoVar.ouw(this.ryl, this.f7773jg);
        int i4 = this.mwh;
        if (i4 == 2) {
            pnoVar.mwh();
            return;
        }
        if (i4 == 3) {
            pnoVar.mwh();
            pnoVar.lh();
            pnoVar.vt(true);
        } else if (i4 == 4) {
            pnoVar.vt(false);
            pnoVar.jg();
        } else {
            if (i4 != 5) {
                return;
            }
            pnoVar.yu();
        }
    }

    public final void ouw(pno pnoVar, fkw fkwVar) {
        this.tlj.ouw(pnoVar, null, fkwVar);
    }

    public final void ouw(final pno pnoVar, final boolean z3, final int i4, final String str, final int i10, final String str2) {
        Activity activity;
        if (!this.ko) {
            this.zih = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.vt.2
                @Override // java.lang.Runnable
                public final void run() {
                    vt.this.ouw(pnoVar, z3, i4, str, i10, str2);
                }
            };
            return;
        }
        if (this.rn) {
            return;
        }
        this.rn = true;
        tlj tljVar = this.f7774le;
        if (tljVar != null) {
            tljVar.ouw = true;
        }
        if (this.ra == null || (activity = this.ryl) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.vt.3
            @Override // java.lang.Runnable
            public final void run() {
                vt.this.ra.ouw(z3, i4, str, i10, str2);
            }
        });
        if (this.bly) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), pnoVar.f7765le, pnoVar.e_(), z3 ? "reward_success" : "reward_fail");
        }
    }

    public final void vt(pno pnoVar, fkw fkwVar) {
        this.tlj.ouw(pnoVar, fkwVar);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class yu extends AbstractC0066vt {
        private boolean jqy;
        private int vpp;
        private final int zin;

        public yu(vt vtVar, vpp vppVar, com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar) {
            super(vtVar, vppVar, lhVar);
            if (vppVar == null) {
                this.zin = 100;
                return;
            }
            int i4 = vppVar.myk;
            if (i4 >= 0) {
                this.zin = Math.min(100, i4);
            } else {
                zih.yu();
                this.zin = com.bytedance.sdk.openadsdk.core.settings.cf.qbp(String.valueOf(vppVar.fqk())).f8455le;
            }
        }

        @Override // com.bytedance.sdk.openadsdk.activity.vt.AbstractC0066vt, android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (!this.jqy && this.yu <= this.vpp) {
                this.jqy = true;
                pno pnoVarCf = this.ouw.tlj.cf();
                if (pnoVarCf != null) {
                    pnoVarCf.ub();
                }
            }
            super.handleMessage(message);
            return true;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.vt.AbstractC0066vt
        public final void ouw(int i4, vpp vppVar) {
            boolean z3 = this.f7785le == 0;
            int i10 = this.yu;
            super.ouw(i4, vppVar);
            if (!z3) {
                if (this.f7786lh < i10) {
                    this.vpp = (int) ((1.0f - (this.zin / 100.0f)) * this.yu);
                    return;
                }
                return;
            }
            if (this.f7785le == 1) {
                this.vpp = 3;
            } else {
                this.vpp = (int) ((1.0f - (this.zin / 100.0f)) * this.f7786lh);
            }
            tlj tljVar = this.ouw.f7774le;
            if (tljVar != null) {
                tljVar.ouw(this.yu);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.activity.vt.AbstractC0066vt
        public final int ouw(vpp vppVar) {
            String strValueOf;
            ex exVar;
            if (vppVar != null) {
                com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = vppVar.vm;
                if (ouwVar != null && (exVar = ouwVar.f8252le) != null) {
                    return exVar.f8221le;
                }
                AdSlot adSlot = vppVar.yiz;
                if (adSlot != null) {
                    strValueOf = adSlot.getCodeId();
                } else {
                    int iFqk = vppVar.fqk();
                    strValueOf = iFqk != 0 ? String.valueOf(iFqk) : null;
                }
                if (strValueOf != null) {
                    zih.yu();
                    return com.bytedance.sdk.openadsdk.core.settings.cf.qbp(strValueOf).ryl;
                }
            }
            return 30;
        }
    }

    public final void ouw(pno pnoVar) {
        com.bytedance.sdk.openadsdk.activity.lh lhVar = this.tlj;
        if (lhVar == null) {
            return;
        }
        lhVar.ouw(pnoVar);
    }

    public final void ouw(View view) {
        this.tlj.ouw(view);
    }

    public final void ouw(View view, boolean z3) {
        this.tlj.ouw(view, z3);
    }

    public final void ouw(int i4) {
        this.tlj.ouw(i4);
    }

    public final void ouw(pno pnoVar, int i4) {
        this.tlj.vt(pnoVar, i4);
    }

    public final void ouw(pno pnoVar, boolean z3, boolean z10, boolean z11, int i4) {
        this.tlj.ouw(pnoVar, z3, z10, z11, i4);
    }
}

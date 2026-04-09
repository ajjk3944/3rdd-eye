package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b9.e;
import com.bytedance.sdk.component.adexpress.vt.jg;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.bly.ex;
import com.bytedance.sdk.openadsdk.core.bly.ko;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.bly.zih;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.tc.vt.fkw;
import com.bytedance.sdk.openadsdk.utils.osn;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends qbp {
    public static float ouw = 100.0f;
    private final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw fkw;

    /* renamed from: le, reason: collision with root package name */
    private float f8036le;

    /* renamed from: lh, reason: collision with root package name */
    zih f8037lh;
    private com.bytedance.sdk.openadsdk.zin.ouw.ouw ra;
    ko vt;
    public int yu;

    public yu(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar, AdSlot adSlot, String str) {
        super(ouwVar.jvy, ouwVar.vt, adSlot, str, ouwVar.f7958cj, !ouwVar.euf);
        this.yu = 1;
        this.f8036le = -1.0f;
        this.fkw = ouwVar;
        setVideoBusiness(ouwVar.fqk);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final boolean bly() {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.fkw.f7959gh;
        if (pnoVar == null || !(pnoVar.hun().tlj instanceof com.bytedance.sdk.openadsdk.activity.yu)) {
            return true;
        }
        return this.fkw.pv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final void cf() {
        super.cf();
        if (this.ra != null) {
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.fkw.f7959gh;
            if (pnoVar != null && pnoVar.hun() != null) {
                this.ra.ouw(this.fkw.f7959gh.hun().tlj.fkw());
            }
            this.ra.vt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        th thVar;
        ryl rylVar = this.fkw.ey;
        if (rylVar != null && (thVar = rylVar.rn) != null && thVar.fkw()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f8036le = motionEvent.getY();
            } else if (action == 1) {
            }
            if (osn.ouw(this.f8036le, motionEvent.getY(), this.ryl)) {
                thVar.vt(5);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final long fkw() {
        ko koVar = this.vt;
        if (koVar != null) {
            return koVar.fkw();
        }
        return 0L;
    }

    public final View getBackupContainerBackgroundView() {
        if (zih()) {
            return this.f8037lh.getBackupContainerBackgroundView();
        }
        return null;
    }

    public final FrameLayout getVideoFrameLayout() {
        return zih() ? this.f8037lh.getVideoContainer() : this.rn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final boolean l_() {
        return com.bytedance.sdk.openadsdk.component.reward.ouw.ouw(this.fkw);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final int le() {
        ko koVar = this.vt;
        if (koVar == null) {
            return 0;
        }
        int iLe = koVar.le();
        le(iLe);
        return iLe;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void lh() {
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.lh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final void mwh() {
        try {
            com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.ra;
            if (ouwVar != null) {
                ouwVar.yu();
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.ouw("TTAD.FRExpressView", th2);
        }
        super.mwh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final void pno() {
        this.vm = true;
        this.rn = new FrameLayout(this.ryl);
        if (!com.bytedance.sdk.openadsdk.core.cf.yu.ouw(this.ko) && !com.bytedance.sdk.openadsdk.core.cf.yu.vt(this.ko)) {
            addView(this.rn, new FrameLayout.LayoutParams(-1, -1));
        }
        super.pno();
        com.bytedance.sdk.component.bly.le webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        setBackupListener(new com.bytedance.sdk.component.adexpress.vt.lh() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.yu.2
            @Override // com.bytedance.sdk.component.adexpress.vt.lh
            public final boolean ouw(ViewGroup viewGroup) {
                try {
                    ((qbp) viewGroup).rn();
                    yu.this.f8037lh = new zih(viewGroup.getContext());
                    yu yuVar = yu.this;
                    yuVar.f8037lh.ouw(yuVar.ko, (qbp) viewGroup, yu.this.fkw.rrs);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.mwh.ra() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.yu.1
            @Override // com.bytedance.sdk.openadsdk.mwh.ra
            public final void ouw(jg jgVar) {
                yu.this.ouw(jgVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ra() {
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ra();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final void ryl() {
        super.ryl();
        if (this.ra != null) {
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.fkw.f7959gh;
            if (pnoVar != null && pnoVar.hun() != null) {
                this.ra.ouw(true);
            }
            this.ra.lh();
        }
    }

    public final void setExpressVideoListenerProxy(ko koVar) {
        this.vt = koVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.component.adexpress.dynamic.yu
    public final void setSoundMute(boolean z3) {
        super.setSoundMute(z3);
        com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.ra;
        if (ouwVar != null) {
            ouwVar.ouw(z3);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final boolean tlj() {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.fkw.f7959gh;
        return pnoVar == null || !(pnoVar.hun().tlj instanceof com.bytedance.sdk.openadsdk.activity.yu);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final long yu() {
        ko koVar = this.vt;
        if (koVar != null) {
            return koVar.yu();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.component.adexpress.vt.ko
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar, jg jgVar) {
        FrameLayout frameLayout;
        boolean z3;
        boolean z10;
        bs bsVar;
        this.fvf = yuVar;
        vpp vppVar = this.ko;
        if (vppVar != null && vppVar.lso()) {
            super.ouw(yuVar, jgVar);
            return;
        }
        if ((yuVar instanceof ex) && (bsVar = ((ex) yuVar).f8054jg) != null) {
            bsVar.f8104cf = this;
        }
        if (jgVar != null && jgVar.vt) {
            ouw(jgVar);
            this.yu = yuVar.vt();
            if ((this.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) && od.lh(this.ko)) {
                try {
                    if ((jgVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.vt) && (frameLayout = ((com.bytedance.sdk.openadsdk.core.cf.le.vt) jgVar).f8132th) != null) {
                        com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.fkw.f7959gh;
                        if (pnoVar == null || pnoVar.hun() == null) {
                            z3 = true;
                            z10 = false;
                        } else {
                            com.bytedance.sdk.openadsdk.activity.pno pnoVarCf = this.fkw.f7959gh.hun().tlj.cf();
                            com.bytedance.sdk.openadsdk.activity.pno pnoVar2 = this.fkw.f7959gh;
                            z10 = pnoVarCf == pnoVar2;
                            z3 = pnoVar2.hun().tlj.fkw() || !z10;
                        }
                        com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = new com.bytedance.sdk.openadsdk.zin.ouw.ouw(this.ryl, this.ko, this.fkw.ucs, z3, frameLayout);
                        this.ra = ouwVar;
                        ouwVar.ouw(this.fkw.fqk);
                        this.ra.ouw(false, (com.bytedance.sdk.openadsdk.mwh.le) null);
                        this.ra.ouw();
                        com.bytedance.sdk.component.utils.qbp.ouw("TTAD.FRExpressView", "initPlayable success mute = " + this.fkw.f7958cj + ",isCurrentScene->" + z10 + ",isMute = " + z3);
                    }
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.ouw("TTAD.FRExpressView", th2);
                }
            }
            if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu) {
                com.bytedance.sdk.openadsdk.component.reward.ouw.ko koVar = this.fkw.ex;
                koVar.f7945cf = true;
                e eVar = koVar.ra;
                if (eVar instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
                    ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) eVar).wp = true;
                }
            }
        }
        super.ouw(yuVar, jgVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void vt(int i4) {
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.vt(i4);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final fkw.ouw lh(int i4) {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        fkw.ouw ouwVarLh = super.lh(i4);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.fkw;
        if (ouwVar.euf && (pnoVar = ouwVar.f7959gh) != null) {
            ouwVarLh.vt = pnoVar.f7763cf;
        }
        return ouwVarLh;
    }

    public final void ouw(final jg jgVar) {
        if (jgVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.yu.3
            @Override // java.lang.Runnable
            public final void run() {
                yu.ouw(yu.this, jgVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(String str, JSONObject jSONObject) {
        super.ouw(str, jSONObject);
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ouw(str, jSONObject);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(boolean z3, String str) {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.FRExpressView", "onMuteVideo,mute:".concat(String.valueOf(z3)));
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ouw(z3, str);
        }
        setSoundMute(z3);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final boolean ouw(JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.FRExpressView", "setPlaybackSpeed,params:".concat(String.valueOf(jSONObject)));
        ko koVar = this.vt;
        if (koVar != null) {
            return koVar.ouw(jSONObject);
        }
        return super.ouw(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw() {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.FRExpressView", "onSkipVideo");
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ouw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i4) {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.FRExpressView", "onChangeVideoState,stateType:".concat(String.valueOf(i4)));
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ouw(i4);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i4, jg jgVar) {
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ouw(i4, jgVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.component.adexpress.vt.pno
    public final void ouw(View view, int i4, com.bytedance.sdk.component.adexpress.lh lhVar) {
        if (i4 != -1 && lhVar != null && i4 == 3) {
            ra();
        } else {
            super.ouw(view, i4, lhVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i4, String str) {
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ouw(i4, str);
        }
    }

    public final void ouw(long j, long j8) {
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) {
            ((com.bytedance.sdk.openadsdk.core.cf.le.yu) yuVar).ouw(j, j8);
        }
    }

    public static /* synthetic */ void ouw(yu yuVar, jg jgVar) {
        if (jgVar != null) {
            double d10 = jgVar.fkw;
            double d11 = jgVar.f7392le;
            double d12 = jgVar.f7390cf;
            double d13 = jgVar.ryl;
            int iOuw = osn.ouw(yuVar.ryl, (float) d10);
            int iOuw2 = osn.ouw(yuVar.ryl, (float) d11);
            int iOuw3 = osn.ouw(yuVar.ryl, (float) d12);
            int iOuw4 = osn.ouw(yuVar.ryl, (float) d13);
            com.bytedance.sdk.component.utils.ko.vt("ExpressView", "vW x vH =" + d12 + "x" + d13);
            if ((d13 != 0.0d && d12 != 0.0d) || yuVar.fvf.vt() == 7 || yuVar.fvf.vt() == 10 || (yuVar.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu)) {
                if ((yuVar.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) && (jgVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.vt)) {
                    FrameLayout frameLayout = ((com.bytedance.sdk.openadsdk.core.cf.le.vt) jgVar).zih;
                    if (frameLayout != null) {
                        if (yuVar.rn.getParent() != null) {
                            ((ViewGroup) yuVar.rn.getParent()).removeView(yuVar.rn);
                        }
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.gravity = 17;
                        frameLayout.addView(yuVar.rn, layoutParams);
                        return;
                    }
                    return;
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) yuVar.rn.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new FrameLayout.LayoutParams(iOuw3, iOuw4);
                }
                layoutParams2.width = iOuw3;
                layoutParams2.height = iOuw4;
                layoutParams2.topMargin = iOuw2;
                layoutParams2.leftMargin = iOuw;
                layoutParams2.setMarginStart(iOuw);
                layoutParams2.setMarginEnd(layoutParams2.rightMargin);
                yuVar.rn.setLayoutParams(layoutParams2);
            }
        }
    }
}

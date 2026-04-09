package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.ypw.qh;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.zz.aa;
import com.bytedance.sdk.openadsdk.core.zz.cf;
import com.bytedance.sdk.openadsdk.core.zz.hxp;
import com.bytedance.sdk.openadsdk.core.zz.ul;
import com.bytedance.sdk.openadsdk.ee.ypw.bw;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.vw;
import j$.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xq extends ul {
    public static float emc = 100.0f;
    private final com.bytedance.sdk.openadsdk.component.reward.emc.emc bw;
    public int dg;
    private com.bytedance.sdk.openadsdk.ylm.emc.emc uym;
    aa xq;
    private float ycc;
    cf ypw;

    public xq(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar, AdSlot adSlot, String str) {
        super(emcVar.mxo, emcVar.ypw, adSlot, str, emcVar.yz, !emcVar.wbn);
        this.dg = 1;
        this.ycc = -1.0f;
        this.bw = emcVar;
        setVideoBusiness(emcVar.tp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dg(qh qhVar) {
        if (qhVar == null) {
            return;
        }
        double dBw = qhVar.bw();
        double dYcc = qhVar.ycc();
        double dUym = qhVar.uym();
        double dMsw = qhVar.msw();
        int iYpw = vw.ypw(this.zz, (float) dBw);
        int iYpw2 = vw.ypw(this.zz, (float) dYcc);
        int iYpw3 = vw.ypw(this.zz, (float) dUym);
        int iYpw4 = vw.ypw(this.zz, (float) dMsw);
        if ((dMsw != 0.0d && dUym != 0.0d) || this.sf.xq() == 7 || this.sf.xq() == 10 || (this.sf instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.dg)) {
            if ((this.sf instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.dg) && (qhVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.ypw)) {
                FrameLayout frameLayoutCf = ((com.bytedance.sdk.openadsdk.core.gbl.ycc.ypw) qhVar).cf();
                if (frameLayoutCf != null) {
                    if (this.sz.getParent() != null) {
                        ((ViewGroup) this.sz.getParent()).removeView(this.sz);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    frameLayoutCf.addView(this.sz, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.sz.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(iYpw3, iYpw4);
            }
            layoutParams2.width = iYpw3;
            layoutParams2.height = iYpw4;
            layoutParams2.topMargin = iYpw2;
            layoutParams2.leftMargin = iYpw;
            layoutParams2.setMarginStart(iYpw);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.sz.setLayoutParams(layoutParams2);
        }
    }

    private void sz() {
        setBackupListener(new com.bytedance.sdk.component.adexpress.ypw.xq() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.xq.2
            @Override // com.bytedance.sdk.component.adexpress.ypw.xq
            public boolean emc(ViewGroup viewGroup, int i) {
                try {
                    ((ul) viewGroup).ul();
                    xq.this.xq = new aa(viewGroup.getContext());
                    xq xqVar = xq.this;
                    xqVar.xq.emc(((ul) xqVar).sup, (ul) viewGroup, xq.this.bw.iyl);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    private void xq(qh qhVar) {
        FrameLayout frameLayoutVk;
        boolean z6;
        try {
            if (!(qhVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.ypw) || (frameLayoutVk = ((com.bytedance.sdk.openadsdk.core.gbl.ycc.ypw) qhVar).vk()) == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.activity.msw mswVar = this.bw.pe;
            boolean z7 = true;
            if (mswVar == null || mswVar.wo() == null) {
                z6 = false;
            } else {
                com.bytedance.sdk.openadsdk.activity.msw mswVarGbl = this.bw.pe.wo().gbl();
                com.bytedance.sdk.openadsdk.activity.msw mswVar2 = this.bw.pe;
                z6 = mswVarGbl == mswVar2;
                if (!mswVar2.wo().sra() && z6) {
                    z7 = false;
                }
            }
            boolean z8 = z7;
            com.bytedance.sdk.openadsdk.ylm.emc.emc emcVar = new com.bytedance.sdk.openadsdk.ylm.emc.emc(this.zz, this.sup, this.bw.rqm, z8, frameLayoutVk);
            this.uym = emcVar;
            emcVar.emc(this.bw.tp);
            this.uym.emc(false, (com.bytedance.sdk.openadsdk.sz.ycc) null);
            this.uym.emc();
            com.bytedance.sdk.component.utils.ul.emc("TTAD.FRExpressView", "initPlayable success mute = " + this.bw.yz + ",isCurrentScene->" + z6 + ",isMute = " + z8);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public int bw() {
        cf cfVar = this.ypw;
        if (cfVar == null) {
            return 0;
        }
        int iBw = cfVar.bw();
        uym(iBw);
        return iBw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.model.ul ulVar;
        gbl gblVar = this.bw.mkp;
        if (gblVar != null && (ulVar = gblVar.cf) != null && ulVar.zz()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.ycc = motionEvent.getY();
            } else if (action == 1) {
            }
            if (vw.emc(this.ycc, motionEvent.getY(), this.zz)) {
                ulVar.ypw(5);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul
    public void gbl() {
        super.gbl();
        if (this.uym != null) {
            com.bytedance.sdk.openadsdk.activity.msw mswVar = this.bw.pe;
            if (mswVar != null && mswVar.wo() != null) {
                this.uym.emc(true);
            }
            this.uym.xq();
        }
    }

    public View getBackupContainerBackgroundView() {
        if (ylm()) {
            return this.xq.getBackupContainerBackgroundView();
        }
        return null;
    }

    public FrameLayout getVideoFrameLayout() {
        return ylm() ? this.xq.getVideoContainer() : this.sz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul
    public boolean msw() {
        com.bytedance.sdk.openadsdk.activity.msw mswVar = this.bw.pe;
        if (mswVar == null || !mswVar.wo().ee()) {
            return true;
        }
        return this.bw.wpn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul
    public void ru() {
        super.ru();
        if (this.uym != null) {
            com.bytedance.sdk.openadsdk.activity.msw mswVar = this.bw.pe;
            if (mswVar != null && mswVar.wo() != null) {
                this.uym.emc(this.bw.pe.wo().sra());
            }
            this.uym.ypw();
        }
    }

    public void setExpressVideoListenerProxy(cf cfVar) {
        this.ypw = cfVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.component.adexpress.dynamic.dg
    public void setSoundMute(boolean z6) {
        super.setSoundMute(z6);
        com.bytedance.sdk.openadsdk.ylm.emc.emc emcVar = this.uym;
        if (emcVar != null) {
            emcVar.emc(z6);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul
    public void sup() {
        try {
            com.bytedance.sdk.openadsdk.ylm.emc.emc emcVar = this.uym;
            if (emcVar != null) {
                emcVar.dg();
            }
        } catch (Throwable unused) {
        }
        if (!rie() && (getExpressInteractionListener() instanceof PAGRewardFullExpressAdListenerProxy)) {
            ((PAGRewardFullExpressAdListenerProxy) getExpressInteractionListener()).triggerUnfinishedFail(this);
        }
        super.sup();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul
    public void uym() {
        this.cf = true;
        this.sz = new FrameLayout(this.zz);
        if (!com.bytedance.sdk.openadsdk.core.gbl.bw.emc(this.sup) && !com.bytedance.sdk.openadsdk.core.gbl.bw.ypw(this.sup)) {
            addView(this.sz, new FrameLayout.LayoutParams(-1, -1));
        }
        super.uym();
        com.bytedance.sdk.component.zz.ycc webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        sz();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.sz.uym() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.xq.1
            @Override // com.bytedance.sdk.openadsdk.sz.uym
            public void emc(qh qhVar) {
                xq.this.emc(qhVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void ycc() {
        cf cfVar = this.ypw;
        if (cfVar != null) {
            cfVar.ycc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul
    public boolean zz() {
        com.bytedance.sdk.openadsdk.activity.msw mswVar = this.bw.pe;
        return mswVar == null || !mswVar.wo().ee();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public boolean ypw(JSONObject jSONObject) {
        return com.bytedance.sdk.openadsdk.component.reward.ypw.emc(this.bw);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.component.adexpress.ypw.cf
    public void emc(com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar, qh qhVar) {
        this.sf = dgVar;
        rie rieVar = this.sup;
        if (rieVar != null && rieVar.tze()) {
            super.emc(dgVar, qhVar);
            return;
        }
        if (dgVar instanceof hxp) {
            hxp hxpVar = (hxp) dgVar;
            if (hxpVar.vk() != null) {
                hxpVar.vk().emc((cf) this);
            }
        }
        if (qhVar != null && qhVar.ypw()) {
            emc(qhVar);
            this.dg = dgVar.xq();
            if ((this.sf instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.dg) && dr.xq(this.sup)) {
                xq(qhVar);
            }
            if (dgVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.emc.dg) {
                this.bw.ylm.bw(true);
            }
        }
        super.emc(dgVar, qhVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void ypw() {
        cf cfVar = this.ypw;
        if (cfVar != null) {
            cfVar.ypw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void ypw(int i) {
        cf cfVar = this.ypw;
        if (cfVar != null) {
            cfVar.ypw(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public long xq() {
        cf cfVar = this.ypw;
        if (cfVar != null) {
            return cfVar.xq();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul
    public bw.emc xq(int i) {
        com.bytedance.sdk.openadsdk.activity.msw mswVar;
        bw.emc emcVarXq = super.xq(i);
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.bw;
        if (emcVar.wbn && (mswVar = emcVar.pe) != null) {
            emcVarXq.ypw = mswVar.gbl;
        }
        return emcVarXq;
    }

    public void emc(final qh qhVar) {
        if (qhVar == null) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.xq.3
            @Override // java.lang.Runnable
            public void run() {
                xq.this.dg(qhVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void emc(String str, JSONObject jSONObject) {
        super.emc(str, jSONObject);
        cf cfVar = this.ypw;
        if (cfVar != null) {
            cfVar.emc(str, jSONObject);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void emc(boolean z6, String str) {
        cf cfVar = this.ypw;
        if (cfVar != null) {
            cfVar.emc(z6, str);
        }
        setSoundMute(z6);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public boolean emc(JSONObject jSONObject) {
        Objects.toString(jSONObject);
        cf cfVar = this.ypw;
        if (cfVar != null) {
            return cfVar.emc(jSONObject);
        }
        return super.emc(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public long dg() {
        cf cfVar = this.ypw;
        if (cfVar != null) {
            return cfVar.dg();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void emc() {
        cf cfVar = this.ypw;
        if (cfVar != null) {
            cfVar.emc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void emc(int i) {
        cf cfVar = this.ypw;
        if (cfVar != null) {
            cfVar.emc(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void emc(int i, qh qhVar) {
        cf cfVar = this.ypw;
        if (cfVar != null) {
            cfVar.emc(i, qhVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.component.adexpress.ypw.msw
    public void emc(View view, int i, com.bytedance.sdk.component.adexpress.xq xqVar) {
        if (i != -1 && xqVar != null && i == 3) {
            ycc();
        } else {
            super.emc(view, i, xqVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void emc(int i, String str) {
        cf cfVar = this.ypw;
        if (cfVar != null) {
            cfVar.emc(i, str);
        }
    }

    public void emc(long j6, long j7) {
        com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar = this.sf;
        if (dgVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.dg) {
            ((com.bytedance.sdk.openadsdk.core.gbl.ycc.dg) dgVar).emc(j6, j7);
        }
    }
}

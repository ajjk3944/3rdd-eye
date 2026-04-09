package com.bytedance.sdk.openadsdk.core.zz;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.o;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.sz.ypw.ycc;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.vw;
import org.json.JSONException;
import s2.b;

/* loaded from: classes.dex */
public class yzg extends ul implements b.a, b.c {
    int bw;
    private com.bytedance.sdk.openadsdk.emc.ypw.xq cuf;
    boolean dg;
    private com.bytedance.sdk.openadsdk.multipro.ypw.emc dr;
    private vk emc;
    private long lt;
    private com.bytedance.sdk.openadsdk.core.sz.ypw.ycc mkp;
    int msw;
    private boolean rtt;
    boolean uym;
    private long xmt;
    boolean xq;
    boolean ycc;
    int ypw;

    public yzg(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.rie rieVar, AdSlot adSlot, String str, boolean z10) {
        super(context, rieVar, adSlot, str, false, true);
        this.ypw = 1;
        this.xq = false;
        this.dg = true;
        this.ycc = true;
        this.uym = true;
        this.msw = -1;
        this.rtt = z10;
        qh();
    }

    private void ee() {
        try {
            this.dr = new com.bytedance.sdk.openadsdk.multipro.ypw.emc();
            vk vkVar = new vk(this.zz, this.sup, this.ru, this.ee, this.rtt);
            this.emc = vkVar;
            vkVar.setShouldCheckNetChange(false);
            this.emc.setControllerStatusCallBack(new ycc.ypw() { // from class: com.bytedance.sdk.openadsdk.core.zz.yzg.2
                @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.ycc.ypw
                public void emc(boolean z10, long j10, long j11, long j12, boolean z11) {
                    yzg.this.dr.emc = z10;
                    yzg.this.dr.bw = j10;
                    yzg.this.dr.ycc = j11;
                    yzg.this.dr.uym = j12;
                    yzg.this.dr.dg = z11;
                }
            });
            this.emc.setVideoAdLoadListener(this);
            this.emc.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.ru)) {
                this.emc.setIsAutoPlay(this.xq ? this.gbl.isAutoPlay() : this.dg);
            } else if ("open_ad".equals(this.ru)) {
                this.emc.setIsAutoPlay(true);
            } else {
                this.emc.setIsAutoPlay(this.dg);
            }
            if ("open_ad".equals(this.ru)) {
                this.emc.emc(true, "initVideo");
            } else {
                boolean zXq = com.bytedance.sdk.openadsdk.core.aa.dg().xq(String.valueOf(this.bw));
                this.sra = zXq;
                this.emc.emc(zXq, "initVideo");
            }
            this.emc.dg();
        } catch (Exception unused) {
            this.emc = null;
        }
    }

    private void setShowAdInteractionView(boolean z10) {
        vk vkVar = this.emc;
        if (vkVar != null) {
            vkVar.setShowAdInteractionView(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xq(@NonNull com.bytedance.sdk.component.adexpress.ypw.qh qhVar) {
        com.bytedance.sdk.openadsdk.core.sz.ypw.xq videoController;
        if (emc(qhVar, false)) {
            this.sz.removeAllViews();
            if (this.emc != null) {
                if ((this.sf instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.dg) && (qhVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.ypw)) {
                    FrameLayout frameLayoutCf = ((com.bytedance.sdk.openadsdk.core.gbl.ycc.ypw) qhVar).cf();
                    if (frameLayoutCf != null) {
                        frameLayoutCf.removeAllViews();
                        if (this.msw == 10) {
                            this.emc.setClickable(false);
                        }
                        frameLayoutCf.addView(this.emc, new FrameLayout.LayoutParams(-1, -1));
                    }
                    if ((this.sf instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.emc.dg) && (videoController = getVideoController()) != null) {
                        videoController.ycc(false);
                    }
                } else if (qhVar.emc() == null) {
                    this.sz.addView(this.emc);
                } else if (this.uym) {
                    qhVar.emc().setTag(com.bytedance.sdk.component.adexpress.dynamic.emc.ycc, 1);
                    ((FrameLayout) qhVar.emc()).removeAllViews();
                    ((FrameLayout) qhVar.emc()).addView(this.emc, new FrameLayout.LayoutParams(-1, -1));
                    this.uym = false;
                }
                this.emc.emc(0L, true, false);
                dg(this.bw);
                if (!com.bytedance.sdk.component.utils.sba.dg(this.zz) && !this.dg && this.ycc) {
                    this.emc.bw();
                }
                if (TextUtils.equals("embeded_ad", this.ru)) {
                    return;
                }
                setShowAdInteractionView(false);
            }
        }
    }

    public void aa() {
        com.bytedance.sdk.openadsdk.core.sz.ypw.xq videoController = getVideoController();
        if (o.a(videoController)) {
            videoController.emc(3, true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public int bw() {
        vk vkVar;
        if (this.ypw == 3 && (vkVar = this.emc) != null) {
            vkVar.dg();
        }
        vk vkVar2 = this.emc;
        if (vkVar2 != null && vkVar2.getNativeVideoController().qh()) {
            this.ypw = 1;
        }
        uym(this.ypw);
        return this.ypw;
    }

    public void cf() {
        com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar = this.mkp;
        if (yccVar != null) {
            yccVar.sz();
            return;
        }
        vk vkVar = this.emc;
        if (vkVar != null) {
            vkVar.sz();
        }
    }

    public void dg(int i10) {
        int iYpw = com.bytedance.sdk.openadsdk.core.aa.dg().ypw(i10);
        if (3 == iYpw) {
            this.xq = false;
            this.dg = false;
        } else if (4 == iYpw) {
            this.xq = true;
        } else {
            int iXq = com.bytedance.sdk.component.utils.sba.xq(com.bytedance.sdk.openadsdk.core.aa.emc());
            if (1 == iYpw) {
                this.xq = false;
                this.dg = tp.dg(iXq);
            } else if (2 == iYpw) {
                if (tp.bw(iXq) || tp.dg(iXq) || tp.ycc(iXq)) {
                    this.xq = false;
                    this.dg = true;
                }
            } else if (5 == iYpw && (tp.dg(iXq) || tp.ycc(iXq))) {
                this.xq = false;
                this.dg = true;
            }
        }
        if (this.dg) {
            return;
        }
        this.ypw = 3;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void emc() {
    }

    @Override // s2.b.c
    public void g_() {
        this.ycc = false;
        this.ypw = 2;
        com.bytedance.sdk.openadsdk.emc.ypw.xq xqVar = this.cuf;
        if (xqVar != null) {
            xqVar.emc(null);
        }
    }

    public vk getExpressVideoView() {
        return this.emc;
    }

    public com.bytedance.sdk.openadsdk.emc.ypw.xq getVideoAdListener() {
        return this.cuf;
    }

    @Nullable
    public com.bytedance.sdk.openadsdk.core.sz.ypw.xq getVideoController() {
        vk vkVar = this.emc;
        if (vkVar != null) {
            return vkVar.getNativeVideoController();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.multipro.ypw.emc getVideoModel() {
        return this.dr;
    }

    @Override // s2.b.c
    public void h_() {
        this.ycc = false;
        this.qh = true;
        this.ypw = 3;
        com.bytedance.sdk.openadsdk.emc.ypw.xq xqVar = this.cuf;
        if (xqVar != null) {
            xqVar.ypw(null);
        }
    }

    @Override // s2.b.c
    public void i_() {
        this.ycc = false;
        this.qh = false;
        this.ypw = 2;
    }

    @Override // s2.b.c
    public void j_() {
        this.ycc = false;
        this.ypw = 5;
        com.bytedance.sdk.component.adexpress.ypw.ypw ypwVar = this.sb;
        if (ypwVar != null && ypwVar.ypw() != null) {
            this.sb.ypw().onvideoComplate();
        }
        com.bytedance.sdk.openadsdk.emc.ypw.xq xqVar = this.cuf;
        if (xqVar != null) {
            xqVar.xq(null);
        }
        com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar = this.sf;
        if (dgVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.dg) {
            ((com.bytedance.sdk.openadsdk.core.gbl.ycc.dg) dgVar).onvideoComplate();
        }
    }

    public void qh() {
        this.sz = new FrameLayout(this.zz);
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.sup;
        int iTx = rieVar != null ? rieVar.tx() : 0;
        this.bw = iTx;
        dg(iTx);
        ee();
        addView(this.sz, new FrameLayout.LayoutParams(-1, -1));
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.sz.uym() { // from class: com.bytedance.sdk.openadsdk.core.zz.yzg.1
            @Override // com.bytedance.sdk.openadsdk.sz.uym
            public void emc(final com.bytedance.sdk.component.adexpress.ypw.qh qhVar) {
                iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.yzg.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        yzg.this.emc(qhVar, true);
                    }
                });
            }
        });
    }

    public void setBackupVideoView(com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar) {
        this.mkp = yccVar;
    }

    public void setVideoAdListener(com.bytedance.sdk.openadsdk.emc.ypw.xq xqVar) {
        this.cuf = xqVar;
    }

    public boolean sz() {
        return this.rtt;
    }

    public void vk() {
        com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar = this.mkp;
        if (yccVar != null) {
            yccVar.cf();
            return;
        }
        vk vkVar = this.emc;
        if (vkVar != null) {
            vkVar.cf();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void ycc() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void ypw() {
    }

    private void ypw(long j10, long j11) throws JSONException {
        int iAbs = (int) Math.abs(this.sba - j10);
        int i10 = this.sba;
        if (i10 < 0 || iAbs > 500 || i10 > j11 || iAbs >= 500 || this.ul.contains(this.yzg)) {
            return;
        }
        if (this.sba > j10) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.yzg.4
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    yzg.this.emc.setCanInterruptVideoPlay(true);
                    yzg.this.emc.performClick();
                    yzg yzgVar = yzg.this;
                    yzgVar.ypw(yzgVar.sba, yzgVar.yzg);
                }
            }, iAbs);
        } else {
            this.emc.setCanInterruptVideoPlay(true);
            this.emc.performClick();
            ypw(this.sba, this.yzg);
        }
        this.ul.add(this.yzg);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.component.adexpress.ypw.cf
    public void emc(com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar, com.bytedance.sdk.component.adexpress.ypw.qh qhVar) {
        this.sf = dgVar;
        this.msw = dgVar.xq();
        com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar2 = this.sf;
        if ((dgVar2 instanceof hxp) && ((hxp) dgVar2).vk() != null) {
            ((hxp) this.sf).vk().emc((cf) this);
        }
        if (qhVar != null && qhVar.ypw()) {
            emc(qhVar);
        }
        super.emc(dgVar, qhVar);
    }

    private void emc(final com.bytedance.sdk.component.adexpress.ypw.qh qhVar) {
        if (qhVar == null) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.yzg.3
            @Override // java.lang.Runnable
            public void run() {
                yzg.this.xq(qhVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean emc(com.bytedance.sdk.component.adexpress.ypw.qh qhVar, boolean z10) {
        int i10;
        double dBw = qhVar.bw();
        double dYcc = qhVar.ycc();
        double dUym = qhVar.uym();
        double dMsw = qhVar.msw();
        if ((dUym == 0.0d || dMsw == 0.0d) && (i10 = this.msw) != 7 && i10 != 10 && i10 != 9 && !(this.sf instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.dg)) {
            return false;
        }
        int iYpw = vw.ypw(this.zz, (float) dBw);
        int iYpw2 = vw.ypw(this.zz, (float) dYcc);
        int iYpw3 = vw.ypw(this.zz, (float) dUym);
        int iYpw4 = vw.ypw(this.zz, (float) dMsw);
        float fMin = Math.min(Math.min(vw.ypw(this.zz, qhVar.gbl()), vw.ypw(this.zz, qhVar.sup())), Math.min(vw.ypw(this.zz, qhVar.sz()), vw.ypw(this.zz, qhVar.qh())));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.sz.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(iYpw3, iYpw4);
        }
        layoutParams.width = iYpw3;
        layoutParams.height = iYpw4;
        layoutParams.topMargin = iYpw2;
        layoutParams.leftMargin = iYpw;
        layoutParams.setMarginStart(iYpw);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        this.sz.setLayoutParams(layoutParams);
        vw.ypw(this.sz, fMin);
        vk vkVar = this.emc;
        if (vkVar == null || !z10) {
            return true;
        }
        vkVar.emc(iYpw3, iYpw4);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public long dg() {
        return this.xmt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public long xq() {
        return this.xmt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void emc(boolean z10, String str) {
        vk vkVar;
        if (this.sup.uh() || (vkVar = this.emc) == null) {
            return;
        }
        vkVar.emc(z10, str);
        setSoundMute(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void emc(int i10) {
        vk vkVar = this.emc;
        if (vkVar == null) {
            return;
        }
        if (i10 == 1) {
            vkVar.emc(0L, true, false);
            return;
        }
        if (i10 == 2 || i10 == 3) {
            vkVar.setCanInterruptVideoPlay(true);
            this.emc.performClick();
        } else if (i10 == 4) {
            vkVar.getNativeVideoController().bw();
        } else {
            if (i10 != 5) {
                return;
            }
            vkVar.emc(0L, true, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.component.adexpress.ypw.msw
    public void emc(View view, int i10, com.bytedance.sdk.component.adexpress.xq xqVar) {
        if (i10 == -1 || xqVar == null) {
            return;
        }
        if (i10 == 11) {
            try {
                vk vkVar = this.emc;
                if (vkVar != null) {
                    vkVar.setCanInterruptVideoPlay(true);
                    this.emc.performClick();
                    if (this.qh) {
                        this.emc.findViewById(com.bytedance.sdk.openadsdk.utils.vk.hs).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.emc(view, i10, xqVar);
    }

    @Override // s2.b.c
    public void emc(long j10, long j11) throws JSONException {
        this.ycc = false;
        int i10 = this.ypw;
        if (i10 != 5 && i10 != 3 && j10 > this.xmt) {
            this.ypw = 2;
        }
        this.xmt = j10;
        this.lt = j11;
        com.bytedance.sdk.component.adexpress.ypw.ypw ypwVar = this.sb;
        if (ypwVar != null && ypwVar.ypw() != null) {
            this.sb.ypw().setTimeUpdate(((int) (j11 - j10)) / 1000);
        }
        com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar = this.sf;
        if (dgVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.dg) {
            ((com.bytedance.sdk.openadsdk.core.gbl.ycc.dg) dgVar).setTimeUpdate(((int) (j11 - j10)) / 1000);
            ((com.bytedance.sdk.openadsdk.core.gbl.ycc.dg) this.sf).emc(j10, j11);
        }
        ypw(j10, j11);
    }

    @Override // s2.b.a
    public void emc(int i10, int i11) {
        this.xmt = this.lt;
        this.ypw = 4;
        com.bytedance.sdk.openadsdk.emc.ypw.xq xqVar = this.cuf;
        if (xqVar != null) {
            xqVar.emc(i10, i11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.ul, com.bytedance.sdk.openadsdk.core.zz.cf
    public void emc(int i10, String str) {
        this.sba = i10;
        this.yzg = str;
    }
}

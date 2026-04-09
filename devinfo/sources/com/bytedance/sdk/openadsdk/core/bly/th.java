package com.bytedance.sdk.openadsdk.core.bly;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import b9.a;
import b9.d;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.mwh.vt.le;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class th extends qbp implements a, d {
    int bly;
    private long bs;

    /* renamed from: cf, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.mwh.vt.le f8093cf;
    private long fak;
    boolean fkw;

    /* renamed from: le, reason: collision with root package name */
    int f8094le;

    /* renamed from: lh, reason: collision with root package name */
    int f8095lh;
    private com.bytedance.sdk.openadsdk.multipro.vt.ouw ouw;
    boolean pno;
    boolean ra;
    public boolean tlj;
    private com.bytedance.sdk.openadsdk.ouw.vt.lh uoy;
    public rn vt;
    boolean yu;

    public th(Context context, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, AdSlot adSlot, String str, boolean z3) {
        super(context, vppVar, adSlot, str, false, true);
        this.f8095lh = 1;
        this.yu = false;
        this.fkw = true;
        this.ra = true;
        this.pno = true;
        this.bly = -1;
        this.tlj = z3;
        this.rn = new FrameLayout(this.ryl);
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.ko;
        int iFqk = vppVar2 != null ? vppVar2.fqk() : 0;
        this.f8094le = iFqk;
        ra(iFqk);
        try {
            this.ouw = new com.bytedance.sdk.openadsdk.multipro.vt.ouw();
            rn rnVar = new rn(this.ryl, this.ko, this.mwh, this.f8079od, this.tlj);
            this.vt = rnVar;
            rnVar.setShouldCheckNetChange(false);
            this.vt.setControllerStatusCallBack(new le.vt() { // from class: com.bytedance.sdk.openadsdk.core.bly.th.2
                @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le.vt
                public final void ouw(boolean z10, long j, long j8, long j9, boolean z11) {
                    th.this.ouw.ouw = z10;
                    th.this.ouw.fkw = j;
                    th.this.ouw.f8595le = j8;
                    th.this.ouw.ra = j9;
                    th.this.ouw.yu = z11;
                }
            });
            this.vt.setVideoAdLoadListener(this);
            this.vt.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.mwh)) {
                this.vt.setIsAutoPlay(this.yu ? this.f8075jg.isAutoPlay() : this.fkw);
            } else if ("open_ad".equals(this.mwh)) {
                this.vt.setIsAutoPlay(true);
            } else {
                this.vt.setIsAutoPlay(this.fkw);
            }
            if ("open_ad".equals(this.mwh)) {
                this.vt.ouw(true, "initVideo");
            } else {
                com.bytedance.sdk.openadsdk.core.zih.yu();
                boolean zVt = com.bytedance.sdk.openadsdk.core.settings.cf.vt(String.valueOf(this.f8094le));
                this.tc = zVt;
                this.vt.ouw(zVt, "initVideo");
            }
            this.vt.yu();
        } catch (Exception unused) {
            this.vt = null;
        }
        addView(this.rn, new FrameLayout.LayoutParams(-1, -1));
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.mwh.ra() { // from class: com.bytedance.sdk.openadsdk.core.bly.th.1
            @Override // com.bytedance.sdk.openadsdk.mwh.ra
            public final void ouw(final com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
                bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.th.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        th.ouw(th.this, jgVar);
                    }
                });
            }
        });
    }

    private void setShowAdInteractionView(boolean z3) {
        rn rnVar = this.vt;
        if (rnVar != null) {
            rnVar.setShowAdInteractionView(z3);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final long fkw() {
        return this.bs;
    }

    public rn getExpressVideoView() {
        return this.vt;
    }

    public com.bytedance.sdk.openadsdk.ouw.vt.lh getVideoAdListener() {
        return this.uoy;
    }

    public com.bytedance.sdk.openadsdk.core.mwh.vt.lh getVideoController() {
        rn rnVar = this.vt;
        if (rnVar != null) {
            return rnVar.getNativeVideoController();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.multipro.vt.ouw getVideoModel() {
        return this.ouw;
    }

    @Override // b9.a
    public final void h_() {
        this.ra = false;
        com.bytedance.sdk.component.utils.ko.vt("TTAD.NativeExpressVideoView", "onVideoAdStartPlay");
        this.f8095lh = 2;
        com.bytedance.sdk.openadsdk.ouw.vt.lh lhVar = this.uoy;
        if (lhVar != null) {
            lhVar.vt();
        }
    }

    @Override // b9.a
    public final void i_() {
        this.ra = false;
        com.bytedance.sdk.component.utils.ko.vt("TTAD.NativeExpressVideoView", "onVideoAdContinuePlay");
        this.zih = false;
        this.f8095lh = 2;
    }

    @Override // b9.a
    public final void j_() {
        this.ra = false;
        com.bytedance.sdk.component.utils.ko.vt("TTAD.NativeExpressVideoView", "onVideoComplete");
        this.f8095lh = 5;
        com.bytedance.sdk.component.adexpress.vt.vt vtVar = this.f8080pd;
        if (vtVar != null && vtVar.vt() != null) {
            this.f8080pd.vt().onvideoComplate();
        }
        com.bytedance.sdk.openadsdk.ouw.vt.lh lhVar = this.uoy;
        if (lhVar != null) {
            lhVar.yu();
        }
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) {
            ((com.bytedance.sdk.openadsdk.core.cf.le.yu) yuVar).onvideoComplate();
        }
    }

    @Override // b9.d
    public final void k_() {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.NativeExpressVideoView", "onVideoLoad");
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final int le() {
        rn rnVar;
        if (this.f8095lh == 3 && (rnVar = this.vt) != null) {
            rnVar.yu();
        }
        rn rnVar2 = this.vt;
        if (rnVar2 != null && rnVar2.getNativeVideoController().tc) {
            this.f8095lh = 1;
        }
        le(this.f8095lh);
        return this.f8095lh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ra() {
    }

    public void setBackupVideoView(com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar) {
        this.f8093cf = leVar;
    }

    public void setVideoAdListener(com.bytedance.sdk.openadsdk.ouw.vt.lh lhVar) {
        this.uoy = lhVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final long yu() {
        return this.bs;
    }

    public static /* synthetic */ boolean ouw(th thVar, com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
        return thVar.ouw(jgVar, true);
    }

    private void ra(int i4) {
        com.bytedance.sdk.openadsdk.core.zih.yu();
        int iVt = com.bytedance.sdk.openadsdk.core.settings.cf.vt(i4);
        if (3 == iVt) {
            this.yu = false;
            this.fkw = false;
        } else if (4 == iVt) {
            this.yu = true;
        } else {
            int iOuw = ksc.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 60000L);
            if (1 == iVt) {
                this.yu = false;
                this.fkw = uoy.yu(iOuw);
            } else if (2 == iVt) {
                if (uoy.fkw(iOuw) || uoy.yu(iOuw) || uoy.le(iOuw)) {
                    this.yu = false;
                    this.fkw = true;
                }
            } else if (5 == iVt && (uoy.yu(iOuw) || uoy.le(iOuw))) {
                this.yu = false;
                this.fkw = true;
            }
        }
        if (!this.fkw) {
            this.f8095lh = 3;
        }
        com.bytedance.sdk.component.utils.ko.lh("NativeVideoAdView", "mIsAutoPlay=" + this.fkw + ",status=" + iVt);
    }

    @Override // b9.a
    public final void vt() {
        this.ra = false;
        com.bytedance.sdk.component.utils.ko.vt("TTAD.NativeExpressVideoView", "onVideoAdPaused");
        this.zih = true;
        this.f8095lh = 3;
        com.bytedance.sdk.openadsdk.ouw.vt.lh lhVar = this.uoy;
        if (lhVar != null) {
            lhVar.lh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.component.adexpress.vt.ko
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar, final com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
        this.fvf = yuVar;
        this.bly = yuVar.vt();
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar2 = this.fvf;
        if ((yuVar2 instanceof ex) && ((ex) yuVar2).f8054jg != null) {
            ((ex) yuVar2).f8054jg.f8104cf = this;
        }
        if (jgVar != null && jgVar.vt) {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.th.3
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    th.vt(th.this, jgVar);
                }
            });
        }
        super.ouw(yuVar, jgVar);
    }

    public static /* synthetic */ void vt(th thVar, com.bytedance.sdk.component.adexpress.vt.jg jgVar) throws JSONException {
        com.bytedance.sdk.openadsdk.core.mwh.vt.lh videoController;
        if (thVar.ouw(jgVar, false)) {
            thVar.rn.removeAllViews();
            rn rnVar = thVar.vt;
            if (rnVar != null) {
                if ((thVar.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) && (jgVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.vt)) {
                    FrameLayout frameLayout = ((com.bytedance.sdk.openadsdk.core.cf.le.vt) jgVar).zih;
                    if (frameLayout != null) {
                        frameLayout.removeAllViews();
                        if (thVar.bly == 10) {
                            thVar.vt.setClickable(false);
                        }
                        frameLayout.addView(thVar.vt, new FrameLayout.LayoutParams(-1, -1));
                    }
                    if ((thVar.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu) && (videoController = thVar.getVideoController()) != null) {
                        videoController.rrs = false;
                    }
                } else {
                    View view = jgVar.rn;
                    if (view != null) {
                        if (thVar.pno) {
                            view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ouw.f7274le, 1);
                            ((FrameLayout) jgVar.rn).removeAllViews();
                            ((FrameLayout) jgVar.rn).addView(thVar.vt, new FrameLayout.LayoutParams(-1, -1));
                            thVar.pno = false;
                        }
                    } else {
                        thVar.rn.addView(rnVar);
                    }
                }
                thVar.vt.ouw(0L, true, false);
                thVar.ra(thVar.f8094le);
                if (!com.bytedance.sdk.component.utils.vm.ouw(thVar.ryl) && !thVar.fkw && thVar.ra) {
                    thVar.vt.fkw();
                }
                if (TextUtils.equals("embeded_ad", thVar.mwh)) {
                    return;
                }
                thVar.setShowAdInteractionView(false);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(boolean z3, String str) {
        rn rnVar;
        com.bytedance.sdk.component.utils.ko.ouw("TTAD.NativeExpressVideoView", "onMuteVideo,mute:", Boolean.valueOf(z3), str);
        if (this.ko.jvy() || (rnVar = this.vt) == null) {
            return;
        }
        rnVar.ouw(z3, str);
        setSoundMute(z3);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw() {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.NativeExpressVideoView", "onSkipVideo");
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i4) throws JSONException {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.NativeExpressVideoView", "onChangeVideoState,stateType:".concat(String.valueOf(i4)));
        rn rnVar = this.vt;
        if (rnVar == null) {
            com.bytedance.sdk.component.utils.ko.fkw("TTAD.NativeExpressVideoView", "onChangeVideoState,ExpressVideoView is null !!!!!!!!!!!!");
            return;
        }
        if (i4 == 1) {
            rnVar.ouw(0L, true, false);
            return;
        }
        if (i4 == 2 || i4 == 3) {
            rnVar.setCanInterruptVideoPlay(true);
            this.vt.performClick();
        } else if (i4 == 4) {
            rnVar.getNativeVideoController().ko();
        } else {
            if (i4 != 5) {
                return;
            }
            rnVar.ouw(0L, true, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void lh() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.component.adexpress.vt.pno
    public final void ouw(View view, int i4, com.bytedance.sdk.component.adexpress.lh lhVar) {
        if (i4 == -1 || lhVar == null) {
            return;
        }
        if (i4 == 11) {
            try {
                rn rnVar = this.vt;
                if (rnVar != null) {
                    rnVar.setCanInterruptVideoPlay(true);
                    this.vt.performClick();
                    if (this.zih) {
                        this.vt.findViewById(com.bytedance.sdk.openadsdk.utils.rn.f8719ki).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.ouw(view, i4, lhVar);
    }

    @Override // b9.a
    public final void ouw(long j, long j8) throws JSONException {
        this.ra = false;
        int i4 = this.f8095lh;
        if (i4 != 5 && i4 != 3 && j > this.bs) {
            this.f8095lh = 2;
        }
        this.bs = j;
        this.fak = j8;
        com.bytedance.sdk.component.adexpress.vt.vt vtVar = this.f8080pd;
        if (vtVar != null && vtVar.vt() != null) {
            this.f8080pd.vt().setTimeUpdate(((int) (j8 - j)) / 1000);
        }
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) {
            ((com.bytedance.sdk.openadsdk.core.cf.le.yu) yuVar).setTimeUpdate(((int) (j8 - j)) / 1000);
            ((com.bytedance.sdk.openadsdk.core.cf.le.yu) this.fvf).ouw(j, j8);
        }
        int iAbs = (int) Math.abs(this.zin - j);
        int i10 = this.zin;
        if (i10 < 0 || iAbs > 500 || i10 > j8 || iAbs >= 500 || this.jqy.contains(this.vpp)) {
            return;
        }
        if (this.zin > j) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.th.4
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    th.this.vt.setCanInterruptVideoPlay(true);
                    th.this.vt.performClick();
                    th thVar = th.this;
                    thVar.vt(thVar.zin, thVar.vpp);
                }
            }, iAbs);
        } else {
            this.vt.setCanInterruptVideoPlay(true);
            this.vt.performClick();
            vt(this.zin, this.vpp);
        }
        this.jqy.add(this.vpp);
    }

    @Override // b9.d
    public final void ouw(int i4, int i10) {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.NativeExpressVideoView", "onVideoError,errorCode:" + i4 + ",extraCode:" + i10);
        this.bs = this.fak;
        this.f8095lh = 4;
        com.bytedance.sdk.openadsdk.ouw.vt.lh lhVar = this.uoy;
        if (lhVar != null) {
            lhVar.ouw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i4, String str) {
        this.zin = i4;
        this.vpp = str;
    }

    private boolean ouw(com.bytedance.sdk.component.adexpress.vt.jg jgVar, boolean z3) {
        int i4;
        double d10 = jgVar.fkw;
        double d11 = jgVar.f7392le;
        double d12 = jgVar.f7390cf;
        double d13 = jgVar.ryl;
        com.bytedance.sdk.component.utils.ko.vt("TTAD.NativeExpressVideoView", "videoWH=" + d12 + "x" + d13);
        if ((d12 == 0.0d || d13 == 0.0d) && (i4 = this.bly) != 7 && i4 != 10 && i4 != 9 && !(this.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu)) {
            return false;
        }
        int iOuw = osn.ouw(this.ryl, (float) d10);
        int iOuw2 = osn.ouw(this.ryl, (float) d11);
        int iOuw3 = osn.ouw(this.ryl, (float) d12);
        int iOuw4 = osn.ouw(this.ryl, (float) d13);
        float fMin = Math.min(Math.min(osn.ouw(this.ryl, jgVar.ra), osn.ouw(this.ryl, jgVar.pno)), Math.min(osn.ouw(this.ryl, jgVar.bly), osn.ouw(this.ryl, jgVar.tlj)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.rn.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(iOuw3, iOuw4);
        }
        layoutParams.width = iOuw3;
        layoutParams.height = iOuw4;
        layoutParams.topMargin = iOuw2;
        layoutParams.leftMargin = iOuw;
        layoutParams.setMarginStart(iOuw);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        this.rn.setLayoutParams(layoutParams);
        osn.vt(this.rn, fMin);
        rn rnVar = this.vt;
        if (rnVar == null || !z3) {
            return true;
        }
        rnVar.ouw(iOuw3, iOuw4);
        return true;
    }
}

package com.bytedance.sdk.openadsdk.core.yu;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.bly.th;
import com.bytedance.sdk.openadsdk.core.lh.vt;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ra;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.yu.ra;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.ex;
import com.bytedance.sdk.openadsdk.utils.ey;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    boolean bly;

    /* renamed from: cf, reason: collision with root package name */
    qbp f8528cf;
    final Context fkw;

    /* renamed from: jg, reason: collision with root package name */
    boolean f8529jg;

    /* renamed from: le, reason: collision with root package name */
    protected AdSlot f8530le;

    /* renamed from: lh, reason: collision with root package name */
    protected yu f8531lh;
    final boolean pno;
    ra ryl;

    /* renamed from: th, reason: collision with root package name */
    private long f8532th;
    com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh tlj;
    private final View.OnAttachStateChangeListener vm;
    vpp vt;
    PAGBannerAdWrapperListener yu;
    String ouw = "banner_ad";
    long ra = 0;
    final AtomicBoolean mwh = new AtomicBoolean(false);
    private final int rn = 1;
    private final int zih = 0;
    int ko = -1;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.core.yu.ouw$ouw, reason: collision with other inner class name */
    public static class C0102ouw extends com.bytedance.sdk.component.pno.pno {

        /* renamed from: lh, reason: collision with root package name */
        WeakReference<ouw> f8536lh;
        boolean ouw;
        vpp vt;

        public C0102ouw(boolean z3, vpp vppVar, ouw ouwVar) {
            super("ReportWindowFocusChangedAdShow");
            this.ouw = z3;
            this.vt = vppVar;
            this.f8536lh = new WeakReference<>(ouwVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<ouw> weakReference = this.f8536lh;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            ouw ouwVar = this.f8536lh.get();
            boolean z3 = this.ouw;
            vpp vppVar = this.vt;
            try {
                if (z3) {
                    ouwVar.ra = System.currentTimeMillis();
                } else {
                    if (ouwVar.ra <= 0 || ouwVar.f8528cf == null) {
                        return;
                    }
                    String strValueOf = String.valueOf(System.currentTimeMillis() - ouwVar.ra);
                    ouwVar.ra = 0L;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(strValueOf, vppVar, ouwVar.ouw, ouwVar.f8528cf.getAdShowTime());
                }
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.qbp.lh("PAGBannerAdImpl", e2.getMessage());
            }
        }
    }

    public ouw(Context context, vpp vppVar, AdSlot adSlot, ra raVar, boolean z3) {
        this.f8529jg = false;
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.ouw.1
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                vpp vppVar2;
                final ouw ouwVar = ouw.this;
                if (ouwVar.ko == 0 || ouwVar.bly) {
                    return;
                }
                final qbp curView = ouwVar.f8531lh.getCurView();
                final vpp vppVar3 = ouw.this.vt;
                if (curView == null || vppVar3 == null) {
                    return;
                }
                ouwVar.vt = vppVar3;
                com.bytedance.sdk.openadsdk.core.ra raVar2 = null;
                ouwVar.tlj = vppVar3.f8305pd == 4 ? com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(ouwVar.fkw, ouwVar.ouw) : null;
                ouwVar.f8528cf = curView;
                final String strOuw = ex.ouw();
                final ra.ouw ouwVar2 = new ra.ouw() { // from class: com.bytedance.sdk.openadsdk.core.yu.ouw.7
                    @Override // com.bytedance.sdk.openadsdk.core.yu.ra.ouw
                    public final void ouw() {
                        int width = ouw.this.f8528cf.getWidth();
                        int height = ouw.this.f8528cf.getHeight();
                        boolean z10 = ((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d);
                        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(ouw.this.fkw);
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        lhVar.setBackgroundColor(-1);
                        lhVar.setLayoutParams(layoutParams);
                        View view2 = new View(ouw.this.fkw);
                        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                        view2.setAlpha(0.3f);
                        view2.setBackgroundColor(Color.parseColor("#F3F7F8"));
                        lhVar.addView(view2, layoutParams2);
                        com.bytedance.sdk.openadsdk.core.le.lh lhVar2 = new com.bytedance.sdk.openadsdk.core.le.lh(ouw.this.fkw);
                        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                        if (z10) {
                            lhVar2.setBackground(com.bytedance.sdk.component.utils.vpp.lh(ouw.this.fkw, "tt_ad_closed_background_300_250"));
                        } else {
                            lhVar2.setBackground(com.bytedance.sdk.component.utils.vpp.lh(ouw.this.fkw, "tt_ad_closed_background_320_50"));
                        }
                        lhVar.addView(lhVar2, layoutParams3);
                        ouw ouwVar3 = ouw.this;
                        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(ouwVar3.fkw, ouwVar3.vt);
                        pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093739);
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                        if (z10) {
                            int iOuw = osn.ouw(ouw.this.fkw, 16.0f);
                            layoutParams4.width = osn.ouw(ouw.this.fkw, 77.0f);
                            layoutParams4.height = osn.ouw(ouw.this.fkw, 14.0f);
                            layoutParams4.leftMargin = iOuw;
                            layoutParams4.topMargin = iOuw;
                        } else {
                            int iOuw2 = osn.ouw(ouw.this.fkw, 8.0f);
                            layoutParams4.width = osn.ouw(ouw.this.fkw, 45.0f);
                            layoutParams4.height = osn.ouw(ouw.this.fkw, 8.18f);
                            layoutParams4.leftMargin = iOuw2;
                            layoutParams4.topMargin = iOuw2;
                        }
                        lhVar2.addView(pAGLogoViewCreatePAGLogoViewByMaterial, layoutParams4);
                        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(ouw.this.fkw);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams5.gravity = 17;
                        pnoVar.setAlpha(0.5f);
                        pnoVar.setLines(1);
                        pnoVar.setText(com.bytedance.sdk.component.utils.vpp.ouw(ouw.this.fkw, "tt_ad_is_closed"));
                        if (z10) {
                            pnoVar.setTextSize(18.0f);
                        } else {
                            pnoVar.setTextSize(12.0f);
                        }
                        lhVar2.addView(pnoVar, layoutParams5);
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.ouw.7.1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                ouw ouwVar4 = ouw.this;
                                TTWebsiteActivity.ouw(ouwVar4.fkw, ouwVar4.vt, ouwVar4.ouw);
                            }
                        };
                        pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(onClickListener);
                        pnoVar.setOnClickListener(onClickListener);
                        ouw.this.f8528cf.vm();
                        ouw.this.f8528cf.removeAllViews();
                        ouw.this.f8528cf.addView(lhVar, new ViewGroup.LayoutParams(width, height));
                        ouw.this.f8528cf.setClickCreativeListener(null);
                        ouw.this.f8528cf.setClickListener(null);
                        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = ouw.this.yu;
                        if (pAGBannerAdWrapperListener != null) {
                            pAGBannerAdWrapperListener.onAdDismissed();
                        }
                        ouw.this.bly = true;
                    }
                };
                curView.setClosedListenerKey(strOuw);
                curView.setBannerClickClosedListener(ouwVar2);
                curView.setBackupListener(new com.bytedance.sdk.component.adexpress.vt.lh() { // from class: com.bytedance.sdk.openadsdk.core.yu.ouw.2
                    @Override // com.bytedance.sdk.component.adexpress.vt.lh
                    public final boolean ouw(ViewGroup viewGroup) {
                        try {
                            curView.rn();
                            if (!ouw.this.vt.cd()) {
                                vt vtVar = new vt(curView.getContext());
                                vtVar.setClosedListenerKey(strOuw);
                                vtVar.ouw(ouw.this.vt, curView);
                                vtVar.setAdInteractionListener(ouw.this.yu);
                                return true;
                            }
                            bly blyVar = new bly(curView.getContext());
                            blyVar.setClosedListenerKey(strOuw);
                            ouw ouwVar3 = ouw.this;
                            blyVar.ouw(ouwVar3.vt, curView, ouwVar3.tlj);
                            blyVar.setAdInteractionListener(ouw.this.yu);
                            curView.setVastVideoHelper(blyVar);
                            return true;
                        } catch (Exception unused) {
                            return false;
                        }
                    }
                });
                if (ouwVar.pno) {
                    vppVar2 = vppVar3;
                    ey.ouw(curView, true, 1, ouwVar.ryl.yu, new ey.vt() { // from class: com.bytedance.sdk.openadsdk.core.yu.ouw.4
                        @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
                        public final void ouw(boolean z10) {
                            ouw.ouw(ouw.this, z10, vppVar3);
                        }

                        @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
                        public final void vt() {
                            ouw ouwVar3 = ouw.this;
                            ouwVar3.ouw(ouwVar3.vt);
                        }

                        @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
                        public final void ouw() {
                            ouw ouwVar3 = ouw.this;
                            if (ouwVar3.ko != 0) {
                                ouw.ouw(ouwVar3);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
                        public final void ouw(View view2, boolean z10) throws JSONException {
                            if (!z10) {
                                com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(ouw.this.vt, 8);
                                return;
                            }
                            com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(ouw.this.vt, 4);
                            if (ouw.this.mwh.compareAndSet(false, true)) {
                                ouw.ouw(ouw.this, view2, curView, vppVar3, strOuw, ouwVar2);
                            }
                            yu yuVar = ouw.this.f8531lh;
                            if (yuVar == null || yuVar.getCurView() == null) {
                                return;
                            }
                            ouw.this.f8531lh.getCurView().cf();
                            ouw.this.f8531lh.getCurView().jg();
                            ouw.this.f8531lh.setIsShow(true);
                        }
                    }, null);
                    curView = curView;
                } else {
                    com.bytedance.sdk.openadsdk.core.ra raVarOuw = ouw.ouw(curView);
                    if (raVarOuw == null) {
                        raVarOuw = new com.bytedance.sdk.openadsdk.core.ra(curView, ouwVar.ryl.yu);
                        curView.addView(raVarOuw);
                    }
                    raVar2 = raVarOuw;
                    raVar2.setAdType(1);
                    raVar2.setCallback(new ra.ouw() { // from class: com.bytedance.sdk.openadsdk.core.yu.ouw.3
                        @Override // com.bytedance.sdk.openadsdk.core.ra.ouw
                        public final void ouw(boolean z10) {
                            ouw.ouw(ouw.this, z10, vppVar3);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.ra.ouw
                        public final void vt() {
                            ouw ouwVar3 = ouw.this;
                            ouwVar3.ouw(ouwVar3.vt);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.ra.ouw
                        public final void ouw() {
                            ouw ouwVar3 = ouw.this;
                            if (ouwVar3.ko != 0) {
                                ouw.ouw(ouwVar3);
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.ra.ouw
                        public final void ouw(View view2) throws JSONException {
                            if (ouw.this.mwh.compareAndSet(false, true)) {
                                ouw.ouw(ouw.this, view2, curView, vppVar3, strOuw, ouwVar2);
                            }
                            yu yuVar = ouw.this.f8531lh;
                            if (yuVar == null || yuVar.getCurView() == null) {
                                return;
                            }
                            ouw.this.f8531lh.getCurView().cf();
                            ouw.this.f8531lh.getCurView().jg();
                            ouw.this.f8531lh.setIsShow(true);
                        }
                    });
                    vppVar2 = vppVar3;
                }
                Context contextOuw = com.bytedance.sdk.component.utils.vt.ouw(curView);
                if (contextOuw == null) {
                    contextOuw = ouwVar.fkw;
                }
                com.bytedance.sdk.openadsdk.core.bly.bly blyVar = new com.bytedance.sdk.openadsdk.core.bly.bly(contextOuw, vppVar2, ouwVar.ouw, 2);
                blyVar.ouw(curView);
                blyVar.ouw(ouwVar);
                blyVar.ouw(ouwVar.tlj);
                blyVar.ouw(new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.core.yu.ouw.5
                    @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
                    public final void ouw(View view2, int i4) {
                        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = ouw.this.yu;
                        if (pAGBannerAdWrapperListener != null) {
                            pAGBannerAdWrapperListener.onAdClicked();
                        }
                    }
                });
                curView.setClickListener(blyVar);
                com.bytedance.sdk.openadsdk.core.bly.pno pnoVar = new com.bytedance.sdk.openadsdk.core.bly.pno(ouwVar.fkw, vppVar2, ouwVar.ouw, 2);
                pnoVar.ouw((View) curView);
                pnoVar.ouw(ouwVar);
                pnoVar.ouw(new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.core.yu.ouw.6
                    @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
                    public final void ouw(View view2, int i4) {
                        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = ouw.this.yu;
                        if (pAGBannerAdWrapperListener != null) {
                            pAGBannerAdWrapperListener.onAdClicked();
                        }
                    }
                });
                qbp qbpVar = ouwVar.f8528cf;
                if (qbpVar instanceof th) {
                    pnoVar.ouw(((th) qbpVar).getVideoController());
                }
                pnoVar.ouw(ouwVar.tlj);
                curView.setClickCreativeListener(pnoVar);
                if (ouwVar.pno) {
                    return;
                }
                raVar2.setNeedCheckingShow(true);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                ouw ouwVar = ouw.this;
                if (ouwVar.f8529jg) {
                    ouwVar.ko = 0;
                } else {
                    ouwVar.yu();
                }
            }
        };
        this.vm = onAttachStateChangeListener;
        this.fkw = context;
        this.vt = vppVar;
        this.f8530le = adSlot;
        this.ryl = raVar;
        this.f8529jg = z3;
        if (vppVar.f8309sd != null) {
            lh lhVar = new lh(context, vppVar, adSlot, this.f8529jg);
            this.f8531lh = lhVar;
            lhVar.addOnAttachStateChangeListener(onAttachStateChangeListener);
        } else {
            yu yuVar = new yu(context, vppVar, adSlot, this.f8529jg);
            this.f8531lh = yuVar;
            yuVar.addOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.pno = false;
        this.bly = false;
    }

    public final void fkw() {
        if (this.f8531lh != null) {
            ko.vt("PAGBannerAdImpl", "PAGBanner destroy");
            try {
                yu();
                this.f8531lh.removeOnAttachStateChangeListener(this.vm);
            } catch (Throwable unused) {
            }
        }
    }

    public final void le() {
        yu yuVar = this.f8531lh;
        if (yuVar instanceof lh) {
            ((lh) yuVar).vt();
        }
    }

    public final com.bytedance.sdk.openadsdk.multipro.vt.ouw lh() {
        yu yuVar = this.f8531lh;
        if (yuVar instanceof lh) {
            return ((lh) yuVar).getVideoModel();
        }
        return null;
    }

    public final void ouw(int i4) {
        yu yuVar = this.f8531lh;
        if (yuVar != null) {
            yuVar.setCurrentIndex(i4);
        }
    }

    public final void ra() {
        yu yuVar = this.f8531lh;
        if (yuVar instanceof lh) {
            ((lh) yuVar).ouw();
        }
    }

    public final boolean vt() {
        return this.f8531lh instanceof lh;
    }

    public final void yu() {
        this.ko = 1;
        this.f8531lh.yu();
    }

    public final void ouw(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        pno pnoVar = new pno(pAGBannerAdInteractionCallback);
        this.yu = pnoVar;
        this.f8531lh.setExpressInteractionListener(pnoVar);
    }

    public final void ouw(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        pno pnoVar = new pno(pAGBannerAdInteractionListener);
        this.yu = pnoVar;
        this.f8531lh.setExpressInteractionListener(pnoVar);
    }

    public final View ouw() {
        com.bytedance.sdk.openadsdk.utils.vt.ouw(this.vt);
        IPBroadcastReceiver.vt(this.fkw, this.vt);
        return this.f8531lh;
    }

    public final void ouw(vpp vppVar) {
        if (this.ra <= 0 || vppVar == null) {
            return;
        }
        try {
            if (this.f8528cf != null) {
                String strValueOf = String.valueOf(System.currentTimeMillis() - this.ra);
                this.ra = 0L;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(strValueOf, vppVar, this.ouw, this.f8528cf.getAdShowTime());
            }
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.qbp.lh("PAGBannerAdImpl", e2.getMessage());
        }
    }

    public static com.bytedance.sdk.openadsdk.core.ra ouw(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            try {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt instanceof com.bytedance.sdk.openadsdk.core.ra) {
                    return (com.bytedance.sdk.openadsdk.core.ra) childAt;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final void ouw(final com.bytedance.sdk.openadsdk.ouw.ouw.vt vtVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f8532th > 500) {
            this.f8532th = jCurrentTimeMillis;
            yu yuVar = this.f8531lh;
            if (yuVar instanceof lh) {
                yuVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.yu.ouw.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((lh) ouw.this.f8531lh).ouw(vtVar);
                    }
                }, 500L);
            }
        }
    }

    public static /* synthetic */ void ouw(ouw ouwVar, boolean z3, vpp vppVar) {
        if (z3) {
            if (ouwVar.vt.cj()) {
                vpp vppVar2 = ouwVar.vt;
                if (!vppVar2.vr) {
                    vppVar2.vr = true;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar2, ouwVar.ouw, vppVar2.f8304od);
                }
            }
            ko.ouw("PAGBannerAdImpl", "banner_ad", "Get focus, start timing");
        } else {
            ko.ouw("PAGBannerAdImpl", "banner_ad", "Lose focus, stop timing");
        }
        bs.vt(new C0102ouw(z3, vppVar, ouwVar), 10);
    }

    public static /* synthetic */ void ouw(ouw ouwVar) {
        ouwVar.vt.ouw = SystemClock.elapsedRealtime();
        ouwVar.f8531lh.fkw();
    }

    public static /* synthetic */ void ouw(ouw ouwVar, View view, qbp qbpVar, vpp vppVar, String str, ra.ouw ouwVar2) throws JSONException {
        com.bytedance.sdk.openadsdk.core.bly.ouw().ouw(str, ouwVar2);
        ouwVar.ra = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject();
            if (qbpVar != null) {
                jSONObject.put("dynamic_show_type", qbpVar.getDynamicShowType());
                qbpVar.ouw(jSONObject, vppVar);
            }
            if (view != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("width", view.getWidth());
                    jSONObject2.put("height", view.getHeight());
                    jSONObject2.put("alpha", view.getAlpha());
                } catch (Throwable unused) {
                }
                jSONObject.put("root_view", jSONObject2.toString());
            }
            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, ouwVar.ouw, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(vppVar);
        } catch (JSONException unused2) {
            com.bytedance.sdk.component.utils.qbp.lh("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = ouwVar.yu;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, vppVar.f8305pd);
        }
        if (vppVar.odc) {
            uoy.vt();
        }
    }
}

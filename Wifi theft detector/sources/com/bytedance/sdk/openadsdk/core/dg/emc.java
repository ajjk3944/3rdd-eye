package com.bytedance.sdk.openadsdk.core.dg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.dg.uym;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.uym;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.xq.ypw;
import com.bytedance.sdk.openadsdk.core.zz.ul;
import com.bytedance.sdk.openadsdk.core.zz.yzg;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.db;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.ra;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    private PAGBannerAdWrapperListener bw;
    private rie dg;
    protected dg emc;
    private ul gbl;
    private final boolean msw;
    private boolean qh;
    private com.bytedance.sdk.openadsdk.ul.emc.emc.xq ru;
    private uym sup;
    private final Context ycc;
    protected AdSlot ypw;
    private long yzg;
    private boolean zz;
    private String xq = "banner_ad";
    private long uym = 0;
    private final AtomicBoolean sz = new AtomicBoolean(false);
    private final int cf = 1;
    private final int vk = 0;

    /* renamed from: aa, reason: collision with root package name */
    private int f9280aa = -1;
    private final View.OnAttachStateChangeListener sba = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.dg.emc.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (emc.this.f9280aa == 0 || emc.this.zz) {
                return;
            }
            emc emcVar = emc.this;
            emcVar.emc(emcVar.emc.getCurView(), emc.this.dg);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (emc.this.qh) {
                emc.this.f9280aa = 0;
            } else {
                emc.this.ycc();
            }
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.core.dg.emc$emc, reason: collision with other inner class name */
    public static class C0138emc extends com.bytedance.sdk.component.msw.msw {
        boolean emc;
        WeakReference<emc> xq;
        rie ypw;

        public C0138emc(boolean z10, rie rieVar, emc emcVar) {
            super("ReportWindowFocusChangedAdShow");
            this.emc = z10;
            this.ypw = rieVar;
            this.xq = new WeakReference<>(emcVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<emc> weakReference = this.xq;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.xq.get().ypw(this.emc, this.ypw);
        }
    }

    public emc(Context context, rie rieVar, AdSlot adSlot, uym uymVar, boolean z10) {
        this.qh = false;
        this.ycc = context;
        this.dg = rieVar;
        this.ypw = adSlot;
        this.sup = uymVar;
        this.qh = z10;
        emc(context, rieVar, adSlot);
        this.msw = false;
        this.zz = false;
    }

    private void sup() {
        this.dg.emc(SystemClock.elapsedRealtime());
        this.emc.bw();
    }

    private uym.emc gbl() {
        return new uym.emc() { // from class: com.bytedance.sdk.openadsdk.core.dg.emc.7
            @Override // com.bytedance.sdk.openadsdk.core.dg.uym.emc
            public void emc() {
                int width = emc.this.gbl.getWidth();
                int height = emc.this.gbl.getHeight();
                View viewEmc = emc(((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d));
                emc.this.gbl.sra();
                emc.this.gbl.removeAllViews();
                emc.this.gbl.addView(viewEmc, new ViewGroup.LayoutParams(width, height));
                emc.this.gbl.setClickCreativeListener(null);
                emc.this.gbl.setClickListener(null);
                if (emc.this.bw != null) {
                    emc.this.bw.onAdDismissed();
                }
                emc.this.zz = true;
            }

            private View emc(boolean z10) {
                com.bytedance.sdk.openadsdk.core.ycc.xq xqVar = new com.bytedance.sdk.openadsdk.core.ycc.xq(emc.this.ycc);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                xqVar.setBackgroundColor(-1);
                xqVar.setLayoutParams(layoutParams);
                View view = new View(emc.this.ycc);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                view.setAlpha(0.3f);
                view.setBackgroundColor(Color.parseColor("#F3F7F8"));
                xqVar.addView(view, layoutParams2);
                com.bytedance.sdk.openadsdk.core.ycc.xq xqVar2 = new com.bytedance.sdk.openadsdk.core.ycc.xq(emc.this.ycc);
                ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                if (z10) {
                    xqVar2.setBackground(com.bytedance.sdk.component.utils.rie.xq(emc.this.ycc, "tt_ad_closed_background_300_250"));
                } else {
                    xqVar2.setBackground(com.bytedance.sdk.component.utils.rie.xq(emc.this.ycc, "tt_ad_closed_background_320_50"));
                }
                xqVar.addView(xqVar2, layoutParams3);
                PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(emc.this.ycc, emc.this.dg);
                pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093739);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                if (z10) {
                    int iYpw = vw.ypw(emc.this.ycc, 16.0f);
                    layoutParams4.width = vw.ypw(emc.this.ycc, 77.0f);
                    layoutParams4.height = vw.ypw(emc.this.ycc, 14.0f);
                    layoutParams4.leftMargin = iYpw;
                    layoutParams4.topMargin = iYpw;
                } else {
                    int iYpw2 = vw.ypw(emc.this.ycc, 8.0f);
                    layoutParams4.width = vw.ypw(emc.this.ycc, 45.0f);
                    layoutParams4.height = vw.ypw(emc.this.ycc, 8.18f);
                    layoutParams4.leftMargin = iYpw2;
                    layoutParams4.topMargin = iYpw2;
                }
                xqVar2.addView(pAGLogoViewCreatePAGLogoViewByMaterial, layoutParams4);
                com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(emc.this.ycc);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                mswVar.setAlpha(0.5f);
                mswVar.setLines(1);
                mswVar.setText(com.bytedance.sdk.component.utils.rie.emc(emc.this.ycc, "tt_ad_is_closed"));
                if (z10) {
                    mswVar.setTextSize(18.0f);
                } else {
                    mswVar.setTextSize(12.0f);
                }
                xqVar2.addView(mswVar, layoutParams5);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.dg.emc.7.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.emc(emc.this.ycc, emc.this.dg, emc.this.xq);
                    }
                };
                pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(onClickListener);
                mswVar.setOnClickListener(onClickListener);
                return xqVar;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ru() {
        sup();
    }

    public void bw() {
        this.uym = System.currentTimeMillis();
    }

    public void dg() {
        ypw(this.dg);
        this.uym = 0L;
    }

    public void msw() {
        dg dgVar = this.emc;
        if (dgVar instanceof xq) {
            ((xq) dgVar).ypw();
        }
    }

    public void uym() {
        if (this.emc != null) {
            try {
                ycc();
                this.emc.removeOnAttachStateChangeListener(this.sba);
            } catch (Throwable unused) {
            }
        }
    }

    public com.bytedance.sdk.openadsdk.multipro.ypw.emc xq() {
        dg dgVar = this.emc;
        if (dgVar instanceof xq) {
            return ((xq) dgVar).getVideoModel();
        }
        return null;
    }

    public void ycc() {
        this.f9280aa = 1;
        this.emc.dg();
    }

    public void zz() {
        dg dgVar = this.emc;
        if (dgVar instanceof xq) {
            ((xq) dgVar).emc();
        }
    }

    public boolean ypw() {
        return this.emc instanceof xq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(boolean z10, rie rieVar) {
        try {
            if (z10) {
                this.uym = System.currentTimeMillis();
            } else {
                if (this.uym <= 0 || this.gbl == null) {
                    return;
                }
                String strValueOf = String.valueOf(System.currentTimeMillis() - this.uym);
                this.uym = 0L;
                com.bytedance.sdk.openadsdk.dg.xq.emc(strValueOf, rieVar, this.xq, this.gbl.getAdShowTime());
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ul.xq("PAGBannerAdImpl", e10.getMessage());
        }
    }

    public void emc(int i10) {
        dg dgVar = this.emc;
        if (dgVar != null) {
            dgVar.setCurrentIndex(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(rie rieVar) {
        if (this.uym <= 0 || rieVar == null) {
            return;
        }
        try {
            if (this.gbl != null) {
                String strValueOf = String.valueOf(System.currentTimeMillis() - this.uym);
                this.uym = 0L;
                com.bytedance.sdk.openadsdk.dg.xq.emc(strValueOf, rieVar, this.xq, this.gbl.getAdShowTime());
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ul.xq("PAGBannerAdImpl", e10.getMessage());
        }
    }

    public void emc(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        msw mswVar = new msw(pAGBannerAdInteractionCallback);
        this.bw = mswVar;
        this.emc.setExpressInteractionListener(mswVar);
    }

    public void emc(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        msw mswVar = new msw(pAGBannerAdInteractionListener);
        this.bw = mswVar;
        this.emc.setExpressInteractionListener(mswVar);
    }

    public View emc() {
        com.bytedance.sdk.openadsdk.utils.ypw.emc(this.dg);
        IPBroadcastReceiver.ypw(this.ycc, this.dg);
        return this.emc;
    }

    private void emc(Context context, rie rieVar, AdSlot adSlot) {
        if (rieVar.iat() != null) {
            xq xqVar = new xq(context, rieVar, adSlot, this.qh);
            this.emc = xqVar;
            xqVar.addOnAttachStateChangeListener(this.sba);
        } else {
            dg dgVar = new dg(context, rieVar, adSlot, this.qh);
            this.emc = dgVar;
            dgVar.addOnAttachStateChangeListener(this.sba);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(boolean z10, rie rieVar) {
        if (z10 && this.dg.pdv() && !this.dg.sb()) {
            this.dg.ycc(true);
            rie rieVar2 = this.dg;
            com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar2, this.xq, rieVar2.du());
        }
        iyl.ypw(new C0138emc(z10, rieVar, this), 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(View view, ul ulVar, rie rieVar, String str, uym.emc emcVar) throws JSONException {
        com.bytedance.sdk.openadsdk.core.zz.ypw().emc(str, emcVar);
        this.uym = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject();
            if (ulVar != null) {
                jSONObject.put("dynamic_show_type", ulVar.getDynamicShowType());
                ulVar.emc(jSONObject, rieVar);
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
            com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, this.xq, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.ee.emc.xq.emc(rieVar);
        } catch (JSONException unused2) {
            com.bytedance.sdk.component.utils.ul.xq("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.bw;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, rieVar.sx());
        }
        if (rieVar.dsx()) {
            tp.emc(rieVar, view);
        }
    }

    private com.bytedance.sdk.openadsdk.ul.emc.emc.xq emc(rie rieVar) {
        if (rieVar.sx() == 4) {
            return com.bytedance.sdk.openadsdk.ul.emc.emc.dg.emc(this.ycc, this.xq);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void emc(@NonNull final ul ulVar, @NonNull final rie rieVar) {
        emc emcVar;
        rie rieVar2;
        final ul ulVar2;
        com.bytedance.sdk.openadsdk.core.uym uymVar;
        if (ulVar == null || rieVar == null) {
            return;
        }
        this.dg = rieVar;
        this.ru = emc(rieVar);
        this.gbl = ulVar;
        final String strEmc = db.emc();
        final uym.emc emcVarGbl = gbl();
        ulVar.setClosedListenerKey(strEmc);
        ulVar.setBannerClickClosedListener(emcVarGbl);
        ulVar.setBackupListener(new com.bytedance.sdk.component.adexpress.ypw.xq() { // from class: com.bytedance.sdk.openadsdk.core.dg.emc.2
            @Override // com.bytedance.sdk.component.adexpress.ypw.xq
            public boolean emc(ViewGroup viewGroup, int i10) {
                try {
                    ulVar.ul();
                    if (!emc.this.dg.ak()) {
                        ypw ypwVar = new ypw(ulVar.getContext());
                        ypwVar.setClosedListenerKey(strEmc);
                        ypwVar.emc(emc.this.dg, ulVar, emc.this.ru);
                        ypwVar.setAdInteractionListener(emc.this.bw);
                        return true;
                    }
                    zz zzVar = new zz(ulVar.getContext());
                    zzVar.setClosedListenerKey(strEmc);
                    zzVar.emc(emc.this.dg, ulVar, emc.this.ru);
                    zzVar.setAdInteractionListener(emc.this.bw);
                    ulVar.setVastVideoHelper(zzVar);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        if (!this.msw) {
            com.bytedance.sdk.openadsdk.core.uym uymVarEmc = emc(ulVar);
            if (uymVarEmc == null) {
                uymVarEmc = new com.bytedance.sdk.openadsdk.core.uym(this.ycc, ulVar, this.sup.emc());
                ulVar.addView(uymVarEmc);
            }
            uymVarEmc.setAdType(1);
            ulVar2 = ulVar;
            uymVarEmc.setCallback(new uym.emc() { // from class: com.bytedance.sdk.openadsdk.core.dg.emc.3
                @Override // com.bytedance.sdk.openadsdk.core.uym.emc
                public void emc(boolean z10) {
                    emc.this.emc(z10, rieVar);
                }

                @Override // com.bytedance.sdk.openadsdk.core.uym.emc
                public void ypw() {
                    emc emcVar2 = emc.this;
                    emcVar2.ypw(emcVar2.dg);
                }

                @Override // com.bytedance.sdk.openadsdk.core.uym.emc
                public void emc() {
                    if (emc.this.f9280aa != 0) {
                        emc.this.ru();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.uym.emc
                public void emc(View view) throws JSONException {
                    if (emc.this.sz.compareAndSet(false, true)) {
                        emc.this.emc(view, ulVar2, rieVar, strEmc, emcVarGbl);
                    }
                    dg dgVar = emc.this.emc;
                    if (dgVar == null || dgVar.getCurView() == null) {
                        return;
                    }
                    emc.this.emc.getCurView().ru();
                    emc.this.emc.getCurView().sba();
                    emc.this.emc.setIsShow(true);
                }
            });
            uymVar = uymVarEmc;
            emcVar = this;
            rieVar2 = rieVar;
        } else {
            boolean zEmc = this.sup.emc();
            ra.ypw ypwVar = new ra.ypw() { // from class: com.bytedance.sdk.openadsdk.core.dg.emc.4
                @Override // com.bytedance.sdk.openadsdk.utils.ra.ypw
                public void emc(boolean z10) {
                    emc.this.emc(z10, rieVar);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.ra.ypw
                public void ypw() {
                    emc emcVar2 = emc.this;
                    emcVar2.ypw(emcVar2.dg);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.ra.ypw
                public void emc() {
                    if (emc.this.f9280aa != 0) {
                        emc.this.ru();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.utils.ra.ypw
                public void emc(View view, boolean z10) throws JSONException {
                    if (!z10) {
                        com.bytedance.sdk.openadsdk.ee.emc.xq.emc(emc.this.dg, 8);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.ee.emc.xq.emc(emc.this.dg, 4);
                    if (emc.this.sz.compareAndSet(false, true)) {
                        emc.this.emc(view, ulVar, rieVar, strEmc, emcVarGbl);
                    }
                    dg dgVar = emc.this.emc;
                    if (dgVar == null || dgVar.getCurView() == null) {
                        return;
                    }
                    emc.this.emc.getCurView().ru();
                    emc.this.emc.getCurView().sba();
                    emc.this.emc.setIsShow(true);
                }
            };
            emcVar = this;
            rieVar2 = rieVar;
            ra.emc(ulVar, true, 1, zEmc, ypwVar, null);
            ulVar2 = ulVar;
            uymVar = null;
        }
        Context contextEmc = com.bytedance.sdk.component.utils.ypw.emc(ulVar2);
        if (contextEmc == null) {
            contextEmc = emcVar.ycc;
        }
        com.bytedance.sdk.openadsdk.core.zz.zz zzVar = new com.bytedance.sdk.openadsdk.core.zz.zz(contextEmc, rieVar2, emcVar.xq, 2);
        zzVar.emc(ulVar2);
        zzVar.emc(this);
        zzVar.emc(emcVar.ru);
        zzVar.emc(new ypw.emc() { // from class: com.bytedance.sdk.openadsdk.core.dg.emc.5
            @Override // com.bytedance.sdk.openadsdk.core.xq.ypw.emc
            public void emc(View view, int i10) {
                if (emc.this.bw != null) {
                    emc.this.bw.onAdClicked();
                }
            }
        });
        ulVar2.setClickListener(zzVar);
        com.bytedance.sdk.openadsdk.core.zz.msw mswVar = new com.bytedance.sdk.openadsdk.core.zz.msw(emcVar.ycc, rieVar2, emcVar.xq, 2);
        mswVar.emc((View) ulVar2);
        mswVar.emc(this);
        mswVar.emc(new ypw.emc() { // from class: com.bytedance.sdk.openadsdk.core.dg.emc.6
            @Override // com.bytedance.sdk.openadsdk.core.xq.ypw.emc
            public void emc(View view, int i10) {
                if (emc.this.bw != null) {
                    emc.this.bw.onAdClicked();
                }
            }
        });
        ul ulVar3 = emcVar.gbl;
        if (ulVar3 instanceof yzg) {
            mswVar.emc(((yzg) ulVar3).getVideoController());
        }
        mswVar.emc(emcVar.ru);
        ulVar2.setClickCreativeListener(mswVar);
        if (emcVar.msw) {
            return;
        }
        uymVar.setNeedCheckingShow(true);
    }

    private com.bytedance.sdk.openadsdk.core.uym emc(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            try {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof com.bytedance.sdk.openadsdk.core.uym) {
                    return (com.bytedance.sdk.openadsdk.core.uym) childAt;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void emc(final com.bytedance.sdk.openadsdk.emc.emc.ypw ypwVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.yzg > 500) {
            this.yzg = jCurrentTimeMillis;
            dg dgVar = this.emc;
            if (dgVar instanceof xq) {
                dgVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dg.emc.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ((xq) emc.this.emc).emc(ypwVar);
                    }
                }, 500L);
            }
        }
    }
}

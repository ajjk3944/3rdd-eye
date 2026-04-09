package com.bytedance.sdk.openadsdk.emc.ypw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.sba;
import com.bytedance.sdk.openadsdk.core.settings.gbl;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.xq.xq;
import com.bytedance.sdk.openadsdk.core.zz.ul;
import com.bytedance.sdk.openadsdk.core.zz.yzg;
import com.bytedance.sdk.openadsdk.core.zz.zz;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public class emc {
    private WeakReference<com.bytedance.sdk.openadsdk.core.sz.ypw.ycc> bw;
    private boolean dg;
    protected final rie emc;
    private com.bytedance.sdk.openadsdk.core.xq.emc gbl;
    private PAGMediaView msw;
    private WeakReference<com.bytedance.sdk.openadsdk.core.sup.ycc> qh;
    private PAGMediaView ru;
    private com.bytedance.sdk.openadsdk.core.xq.ypw sup;
    private boolean sz = false;
    private com.bytedance.sdk.openadsdk.emc.ypw.emc.xq uym;
    private final String xq;
    private ypw ycc;
    private final Context ypw;
    private ul zz;

    public emc(Context context, rie rieVar, String str) {
        this.ypw = context;
        this.emc = rieVar;
        this.xq = str;
    }

    private PAGMediaView qh() {
        if (!rie.bw(this.emc)) {
            com.bytedance.sdk.openadsdk.emc.ypw.emc.xq xqVar = this.uym;
            if (xqVar == null) {
                return null;
            }
            ul ulVarDg = xqVar.dg();
            ulVarDg.setTag(520093762, Boolean.TRUE);
            if (!this.sz) {
                this.uym.bw();
            }
            this.sz = true;
            return emc(ulVarDg);
        }
        com.bytedance.sdk.openadsdk.emc.ypw.emc.xq xqVar2 = this.uym;
        if (xqVar2 == null || !(xqVar2 instanceof com.bytedance.sdk.openadsdk.emc.ypw.emc.ypw)) {
            return null;
        }
        yzg yzgVar = (yzg) xqVar2.dg();
        yzgVar.setTag(520093762, Boolean.TRUE);
        if (!this.sz) {
            this.uym.bw();
        }
        this.sz = true;
        return emc(yzgVar);
    }

    public String bw() {
        rie rieVar = this.emc;
        if (rieVar != null) {
            return ypw(rieVar);
        }
        return null;
    }

    public String dg() {
        rie rieVar = this.emc;
        if (rieVar != null) {
            return emc(rieVar);
        }
        return null;
    }

    public void emc(ypw ypwVar) {
        this.ycc = ypwVar;
    }

    public View gbl() {
        rie rieVar;
        if (aa.emc() == null || (rieVar = this.emc) == null || !rieVar.ak() || !this.emc.rie()) {
            return null;
        }
        ImageView imageView = new ImageView(aa.emc());
        com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc((int) vw.emc(aa.emc(), 14.0f, true), imageView, this.emc);
        return imageView;
    }

    public PAGMediaView msw() {
        return this.ru;
    }

    public View ru() {
        if (aa.emc() == null) {
            return null;
        }
        PAGLogoView pAGLogoView = new PAGLogoView(aa.emc()) { // from class: com.bytedance.sdk.openadsdk.emc.ypw.emc.4
            int emc = 0;
            int ypw = 0;

            @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
            public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
                super.onLayout(z10, i10, i11, i12, i13);
                try {
                    Object parent = getParent();
                    if (parent == null || this.emc == 0 || this.ypw == 0) {
                        return;
                    }
                    int width = ((View) parent).getWidth();
                    int height = ((View) parent).getHeight();
                    int i14 = this.emc;
                    if (width < i14 || height < this.ypw) {
                        float fMin = Math.min(height / this.ypw, width / i14);
                        int i15 = (width - this.emc) / 2;
                        if (fMin != 1.0f) {
                            setScaleX(fMin);
                            setScaleY(fMin);
                            setTranslationX(i15);
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.PAGLogoView, android.widget.LinearLayout, android.view.View
            public void onMeasure(int i10, int i11) {
                if (this.emc == 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), i11);
                    this.emc = getMeasuredWidth();
                    this.ypw = this.containerHeight;
                }
                setMeasuredDimension(this.emc, this.ypw);
            }
        };
        pAGLogoView.initData(this.emc);
        pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.emc.ypw.emc.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                emc.this.sup();
            }
        });
        return pAGLogoView;
    }

    public void sup() {
        Context context = this.ypw;
        if (context != null) {
            TTWebsiteActivity.emc(context, this.emc, this.xq);
        }
    }

    public void sz() {
        com.bytedance.sdk.openadsdk.core.sup.ycc yccVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.sup.ycc> weakReference = this.qh;
        if (weakReference == null || (yccVar = weakReference.get()) == null) {
            return;
        }
        yccVar.emc(13);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public PAGMediaView uym() {
        PAGMediaView pAGMediaViewZz;
        com.bytedance.sdk.openadsdk.utils.ypw.emc(this.emc);
        if (this.emc.yid() == 2) {
            pAGMediaViewZz = qh();
            emc(pAGMediaViewZz);
        } else {
            pAGMediaViewZz = zz();
        }
        if (pAGMediaViewZz != null) {
            pAGMediaViewZz.setMrcTrackerKey(com.bytedance.sdk.openadsdk.ee.ypw.bw.ypw(this.emc));
        } else {
            pAGMediaViewZz = new PAGMediaView(this.ypw) { // from class: com.bytedance.sdk.openadsdk.emc.ypw.emc.1
                @Override // android.view.ViewGroup, android.view.View
                public void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    com.bytedance.sdk.openadsdk.utils.dg.emc(this, emc.this.emc);
                }
            };
        }
        if (pAGMediaViewZz instanceof PAGVideoMediaView) {
            ((PAGVideoMediaView) pAGMediaViewZz).setMaterialMeta(this.emc);
        }
        this.ru = pAGMediaViewZz;
        return pAGMediaViewZz;
    }

    public PAGImageItem xq() {
        rie rieVar = this.emc;
        if (rieVar == null || rieVar.ya() == null) {
            return null;
        }
        return new PAGImageItem(this.emc.ya().xq(), this.emc.ya().ypw(), this.emc.ya().emc(), (float) this.emc.ya().dg());
    }

    public String ycc() {
        rie rieVar = this.emc;
        if (rieVar != null) {
            return rieVar.xxo();
        }
        return null;
    }

    public ul ypw() {
        return this.zz;
    }

    public PAGMediaView zz() {
        if (!rie.bw(this.emc)) {
            List<sba> listRr = this.emc.rr();
            if (listRr == null || listRr.isEmpty()) {
                ApmHelper.reportCustomError("images empty", "getMediaView return null", new RuntimeException());
                return null;
            }
            ImageView imageView = new ImageView(this.ypw);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            sba sbaVar = listRr.get(0);
            if (sbaVar != null) {
                com.bytedance.sdk.openadsdk.ru.dg.emc(sbaVar).xq(1).emc(com.bytedance.sdk.openadsdk.ru.xq.emc(this.emc, sbaVar.emc(), imageView));
            }
            PAGMediaView pAGMediaViewEmc = emc(imageView);
            if (this.gbl == null || !gbl.xq().dg(String.valueOf(this.emc.tx()))) {
                pAGMediaViewEmc.setOnClickListener(null);
                pAGMediaViewEmc.setOnTouchListener(null);
            } else {
                pAGMediaViewEmc.setOnClickListener(this.gbl);
                pAGMediaViewEmc.setOnTouchListener(this.gbl);
            }
            pAGMediaViewEmc.setTag(520093762, Boolean.TRUE);
            PAGMediaView pAGMediaView = this.msw;
            if (pAGMediaView != null) {
                pAGMediaView.setOnClickListener(null);
                this.msw.setOnTouchListener(null);
            }
            this.msw = pAGMediaViewEmc;
            return pAGMediaViewEmc;
        }
        ypw ypwVar = this.ycc;
        if (ypwVar == null) {
            ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new RuntimeException());
            return null;
        }
        View viewBw = ypwVar.bw();
        if (viewBw == null) {
            ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new RuntimeException());
            return null;
        }
        if (viewBw.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewBw.getParent()).removeView(viewBw);
        }
        PAGMediaView pAGMediaView2 = this.msw;
        if (pAGMediaView2 != null) {
            pAGMediaView2.setOnClickListener(null);
            this.msw.setOnTouchListener(null);
        }
        PAGVideoMediaView pAGVideoMediaView = new PAGVideoMediaView(this.ypw, viewBw, this);
        pAGVideoMediaView.setTag(520093762, Boolean.TRUE);
        if (this.gbl == null || !gbl.xq().dg(String.valueOf(this.emc.tx()))) {
            com.bytedance.sdk.openadsdk.core.xq.xq xqVar = new com.bytedance.sdk.openadsdk.core.xq.xq() { // from class: com.bytedance.sdk.openadsdk.emc.ypw.emc.2
                @Override // com.bytedance.sdk.openadsdk.core.xq.xq
                public void emc(View view, float f10, float f11, float f12, float f13, SparseArray<xq.emc> sparseArray, boolean z10) {
                    try {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    } catch (Exception unused) {
                    }
                }
            };
            pAGVideoMediaView.setOnClickListener(xqVar);
            pAGVideoMediaView.setOnTouchListener(xqVar);
        } else {
            pAGVideoMediaView.setOnClickListener(this.gbl);
            pAGVideoMediaView.setOnTouchListener(this.gbl);
        }
        this.msw = pAGVideoMediaView;
        pAGVideoMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return pAGVideoMediaView;
    }

    private String ypw(rie rieVar) {
        return !TextUtils.isEmpty(rieVar.xou()) ? rieVar.xou() : !TextUtils.isEmpty(rieVar.vyk()) ? rieVar.vyk() : "";
    }

    public void emc(com.bytedance.sdk.openadsdk.emc.ypw.emc.xq xqVar) {
        this.uym = xqVar;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar) {
        this.bw = new WeakReference<>(yccVar);
    }

    public void emc(boolean z10) {
        this.dg = z10;
    }

    public PAGMediaView emc() {
        return this.msw;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.xq.emc emcVar) {
        this.gbl = emcVar;
    }

    private String emc(rie rieVar) {
        if (rieVar.mjd() != null && !TextUtils.isEmpty(rieVar.mjd().ypw())) {
            return rieVar.mjd().ypw();
        }
        if (!TextUtils.isEmpty(rieVar.hs())) {
            return rieVar.hs();
        }
        if (!TextUtils.isEmpty(rieVar.xou())) {
            return rieVar.xou();
        }
        return "";
    }

    private xq ypw(final PAGVideoAdListener pAGVideoAdListener) {
        return new xq() { // from class: com.bytedance.sdk.openadsdk.emc.ypw.emc.6
            @Override // com.bytedance.sdk.openadsdk.emc.ypw.xq
            public void emc(int i10, int i11) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.emc.ypw.xq
            public void xq(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.emc.ypw.xq
            public void ypw(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.emc.ypw.xq
            public void emc(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }
        };
    }

    public void emc(com.bytedance.sdk.openadsdk.core.xq.ypw ypwVar) {
        this.sup = ypwVar;
    }

    private void emc(PAGMediaView pAGMediaView) {
        if (pAGMediaView == null) {
            return;
        }
        try {
            pAGMediaView.setBackgroundColor(-16777216);
        } catch (Exception unused) {
        }
    }

    private PAGMediaView emc(final View view) {
        int i10;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        ul ulVar = this.zz;
        if (ulVar != null) {
            ulVar.setClickListener(null);
            this.zz.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.xq.ypw ypwVar = this.sup;
        if (ypwVar != null && (ypwVar instanceof zz) && (view instanceof ul)) {
            ((ul) view).setClickListener((zz) ypwVar);
        }
        com.bytedance.sdk.openadsdk.core.xq.emc emcVar = this.gbl;
        if (emcVar != null && (emcVar instanceof com.bytedance.sdk.openadsdk.core.zz.msw) && (view instanceof ul)) {
            ((ul) view).setClickCreativeListener((com.bytedance.sdk.openadsdk.core.zz.msw) emcVar);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.ypw) { // from class: com.bytedance.sdk.openadsdk.emc.ypw.emc.3
            private void emc(boolean z10) {
                Integer num = this.emc;
                if (num != null) {
                    com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(num), z10 ? 4 : 8);
                }
                rie rieVar = emc.this.emc;
                if (rieVar != null) {
                    com.bytedance.sdk.openadsdk.ee.emc.xq.emc(rieVar, z10);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.dg.emc(this, emc.this.emc);
            }

            @Override // android.view.View
            public void onWindowFocusChanged(boolean z10) {
                super.onWindowFocusChanged(z10);
                if (view instanceof ul) {
                    return;
                }
                emc(z10);
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                emc.this.emc(pAGVideoAdListener);
            }
        };
        int i11 = -1;
        pAGMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i11 = layoutParams.width;
            i10 = layoutParams.height;
        } else {
            i10 = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i11, i10);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof ul) {
            this.zz = (ul) view;
        }
        return pAGMediaView;
    }

    public void emc(PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.emc.ypw.emc.xq xqVar;
        if (this.emc.yid() == 2 && rie.bw(this.emc) && (xqVar = this.uym) != null && (xqVar instanceof com.bytedance.sdk.openadsdk.emc.ypw.emc.ypw)) {
            yzg yzgVar = (yzg) xqVar.dg();
            if (yzgVar != null) {
                yzgVar.setVideoAdListener(ypw(pAGVideoAdListener));
                return;
            }
            return;
        }
        ypw ypwVar = this.ycc;
        if (ypwVar != null) {
            ypwVar.emc(ypw(pAGVideoAdListener));
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.core.sup.ycc yccVar) {
        this.qh = new WeakReference<>(yccVar);
    }
}

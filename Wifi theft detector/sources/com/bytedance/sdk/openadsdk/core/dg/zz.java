package com.bytedance.sdk.openadsdk.core.dg;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.o;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.vk;
import com.bytedance.sdk.openadsdk.core.sz.ypw.ycc;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.sup;
import com.bytedance.sdk.openadsdk.core.zz.sba;
import com.bytedance.sdk.openadsdk.core.zz.ul;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import s2.b;

/* loaded from: classes.dex */
public class zz extends com.bytedance.sdk.openadsdk.core.zz.emc implements b.a, b.c {

    /* renamed from: aa, reason: collision with root package name */
    private PAGBannerAdWrapperListener f9281aa;
    private String cf;
    public boolean emc;
    private com.bytedance.sdk.openadsdk.core.sz.ypw.ycc qh;
    private ul sup;
    private com.bytedance.sdk.openadsdk.ul.emc.emc.xq sz;
    private long vk;

    public static class emc {
        public com.bytedance.sdk.openadsdk.core.ycc.dg bw;
        public PAGLogoView dg;
        public FrameLayout emc;
        public com.bytedance.sdk.openadsdk.core.ycc.dg xq;
        public sup ypw;

        private emc() {
        }
    }

    public zz(@NonNull Context context) {
        super(context);
        this.emc = true;
        this.ypw = context;
    }

    private void bw() {
        sba sbaVarEmc = ypw.emc(this.sup.getExpectExpressWidth(), this.sup.getExpectExpressHeight());
        if (this.sup.getExpectExpressWidth() <= 0 || this.sup.getExpectExpressHeight() <= 0) {
            int iXq = vw.xq(this.ypw);
            this.uym = iXq;
            this.msw = Float.valueOf(iXq / sbaVarEmc.ypw).intValue();
        } else {
            this.uym = vw.ypw(this.ypw, this.sup.getExpectExpressWidth());
            this.msw = vw.ypw(this.ypw, this.sup.getExpectExpressHeight());
        }
        int i10 = this.uym;
        if (i10 > 0 && i10 > vw.xq(this.ypw)) {
            this.uym = vw.xq(this.ypw);
            this.msw = Float.valueOf(this.msw * (vw.xq(this.ypw) / this.uym)).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.uym, this.msw);
        }
        layoutParams.width = this.uym;
        layoutParams.height = this.msw;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        emc(sbaVarEmc);
    }

    @Override // s2.b.a
    public void emc(int i10, int i11) {
    }

    @Override // s2.b.c
    public void g_() {
    }

    public long getVideoProgress() {
        return this.vk;
    }

    @Override // s2.b.c
    public void h_() {
    }

    @Override // s2.b.c
    public void i_() {
    }

    @Override // s2.b.c
    public void j_() {
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.f9281aa = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.cf = str;
    }

    private emc ypw(sba sbaVar) {
        emc emcVar = new emc();
        emcVar.emc = new FrameLayout(this.ypw);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        layoutParams.width = -1;
        layoutParams.height = -1;
        emcVar.emc.setLayoutParams(layoutParams);
        emcVar.ypw = new sup(this.ypw);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        emcVar.ypw.setLayoutParams(layoutParams2);
        emcVar.emc.addView(emcVar.ypw);
        int iYpw = vw.ypw(this.ypw, 5.0f);
        if (sbaVar == null || sbaVar.emc != 1) {
            emcVar.xq = com.bytedance.sdk.openadsdk.core.widget.ycc.ypw(getContext());
        } else {
            emcVar.xq = com.bytedance.sdk.openadsdk.core.widget.ycc.emc(getContext());
        }
        emcVar.xq.setId(520093697);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388613;
        layoutParams3.setMargins(iYpw, iYpw, iYpw, iYpw);
        emcVar.xq.setLayoutParams(layoutParams3);
        emcVar.emc.addView(emcVar.xq);
        emcVar.dg = PAGLogoView.createPAGLogoViewByMaterial(this.ypw, this.xq);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 8388691;
        layoutParams4.setMargins(iYpw, iYpw, iYpw, iYpw);
        emcVar.dg.setLayoutParams(layoutParams4);
        emcVar.emc.addView(emcVar.dg);
        emcVar.bw = new com.bytedance.sdk.openadsdk.core.ycc.dg(this.ypw);
        int iYpw2 = vw.ypw(this.ypw, 11.0f);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iYpw2, iYpw2);
        layoutParams5.gravity = 8388693;
        layoutParams5.rightMargin = iYpw;
        layoutParams5.bottomMargin = iYpw;
        emcVar.bw.setVisibility(8);
        emcVar.bw.setScaleType(ImageView.ScaleType.FIT_CENTER);
        emcVar.bw.setLayoutParams(layoutParams5);
        emcVar.emc.addView(emcVar.bw);
        return emcVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.emc
    public void emc(View view, int i10, vk vkVar) {
        ul ulVar = this.sup;
        if (ulVar != null) {
            ulVar.emc(view, i10, vkVar);
            com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar = this.qh;
            if (yccVar == null || !o.a(yccVar.getNativeVideoController())) {
                return;
            }
            this.qh.getNativeVideoController().mxo();
        }
    }

    public void emc(rie rieVar, ul ulVar, com.bytedance.sdk.openadsdk.ul.emc.emc.xq xqVar) {
        setBackgroundColor(-16777216);
        this.xq = rieVar;
        this.sup = ulVar;
        this.sz = xqVar;
        this.ycc = "banner_ad";
        ulVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        bw();
    }

    private void emc(sba sbaVar) {
        View view;
        rie rieVar = this.xq;
        if (rieVar != null) {
            int iIn = rieVar.in();
            emc emcVarYpw = ypw(sbaVar);
            if (emcVarYpw == null || (view = emcVarYpw.emc) == null) {
                return;
            }
            addView(view);
            com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = emcVarYpw.xq;
            PAGLogoView pAGLogoView = emcVarYpw.dg;
            com.bytedance.sdk.openadsdk.core.ycc.dg dgVar2 = emcVarYpw.bw;
            if (dgVar2 != null && this.xq.rie()) {
                vw.emc((View) dgVar2, 0);
                com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc((int) vw.emc(aa.emc(), 11.0f, true), dgVar2, this.xq);
            }
            com.bytedance.sdk.openadsdk.core.sz.ypw.ycc videoView = getVideoView();
            if (o.a(videoView)) {
                this.qh = videoView;
                videoView.setVideoAdLoadListener(this);
                this.qh.setVideoAdInteractionListener(this);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair(dgVar, FriendlyObstructionPurpose.CLOSE_AD));
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                arrayList.add(new Pair(pAGLogoView, friendlyObstructionPurpose));
                arrayList.add(new Pair(dgVar2, friendlyObstructionPurpose));
                this.qh.emc(arrayList);
                this.qh.setAdCreativeClickListener(new ycc.emc() { // from class: com.bytedance.sdk.openadsdk.core.dg.zz.1
                    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.ycc.emc
                    public void emc(View view2, int i10) {
                        if (zz.this.f9281aa != null) {
                            zz.this.f9281aa.onAdClicked();
                        }
                    }
                });
            }
            if (pAGLogoView != null) {
                pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.dg.zz.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.emc(((com.bytedance.sdk.openadsdk.core.zz.emc) zz.this).ypw, ((com.bytedance.sdk.openadsdk.core.zz.emc) zz.this).xq, ((com.bytedance.sdk.openadsdk.core.zz.emc) zz.this).ycc);
                    }
                });
            }
            if (dgVar != null) {
                dgVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.dg.zz.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        zz.this.emc();
                    }
                });
            }
            sup supVar = emcVarYpw.ypw;
            rie rieVar2 = this.xq;
            if (rieVar2 != null && rieVar2.qio() != null && supVar != null) {
                int iGbl = this.xq.qio().gbl();
                float fSup = this.xq.qio().sup();
                if (iGbl > 0 && fSup > 0.0f) {
                    supVar.setRatio(iGbl / fSup);
                } else if (iIn == 15) {
                    supVar.setRatio(0.5625f);
                } else if (iIn == 5) {
                    supVar.setRatio(1.7777778f);
                } else {
                    supVar.setRatio(1.0f);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (videoView != null && supVar != null) {
                supVar.addView(videoView, layoutParams);
                videoView.setTag(520093762, Boolean.TRUE);
            }
            emc((View) videoView, true);
            emc((View) this, true);
            emc(supVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.emc
    public void emc() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.bw;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.xq.xq xqVar = this.dg;
        if (xqVar != null) {
            xqVar.emc();
        } else {
            TTDelegateActivity.emc(this.xq, this.cf);
        }
    }

    @Override // s2.b.c
    public void emc(long j10, long j11) {
        this.vk = j10;
    }
}

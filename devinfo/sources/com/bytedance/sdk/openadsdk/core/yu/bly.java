package com.bytedance.sdk.openadsdk.core.yu;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b9.a;
import b9.d;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.bly.vm;
import com.bytedance.sdk.openadsdk.core.model.ko;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.mwh.vt.le;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.ryl;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class bly extends com.bytedance.sdk.openadsdk.core.bly.ouw implements a, d {

    /* renamed from: jg, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh f8521jg;
    private com.bytedance.sdk.openadsdk.core.mwh.vt.le ko;
    private qbp mwh;
    public boolean ouw;
    private String rn;
    private PAGBannerAdWrapperListener vm;
    private long zih;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        public com.bytedance.sdk.openadsdk.core.le.yu fkw;

        /* renamed from: lh, reason: collision with root package name */
        public com.bytedance.sdk.openadsdk.core.le.yu f8522lh;
        public FrameLayout ouw;
        public ryl vt;
        public PAGLogoView yu;

        private ouw() {
        }

        public /* synthetic */ ouw(byte b10) {
            this();
        }
    }

    public bly(Context context) {
        super(context);
        this.ouw = true;
        this.vt = context;
    }

    public long getVideoProgress() {
        return this.zih;
    }

    @Override // b9.d
    public final void ouw(int i4, int i10) {
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.vm = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.rn = str;
    }

    @Override // b9.a
    public final void vt() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw
    public final void ouw(View view, int i4, ko koVar) {
        com.bytedance.sdk.openadsdk.core.ryl.le leVar;
        qbp qbpVar = this.mwh;
        if (qbpVar != null) {
            qbpVar.ouw(view, i4, koVar);
            com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar2 = this.ko;
            if (leVar2 == null || leVar2.getNativeVideoController() == null || (leVar = this.ko.getNativeVideoController().f8333cd) == null) {
                return;
            }
            leVar.ouw(13);
        }
    }

    public final void ouw(vpp vppVar, qbp qbpVar, com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh lhVar) {
        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar;
        setBackgroundColor(-16777216);
        this.f8071lh = vppVar;
        this.mwh = qbpVar;
        this.f8521jg = lhVar;
        this.f8070le = "banner_ad";
        qbpVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        vm vmVarOuw = vt.ouw(this.mwh.getExpectExpressWidth(), this.mwh.getExpectExpressHeight());
        if (this.mwh.getExpectExpressWidth() > 0 && this.mwh.getExpectExpressHeight() > 0) {
            this.ra = osn.ouw(this.vt, this.mwh.getExpectExpressWidth());
            this.pno = osn.ouw(this.vt, this.mwh.getExpectExpressHeight());
        } else {
            int iYu = osn.yu(this.vt);
            this.ra = iYu;
            this.pno = Float.valueOf(iYu / vmVarOuw.vt).intValue();
        }
        int i4 = this.ra;
        if (i4 > 0 && i4 > osn.yu(this.vt)) {
            this.ra = osn.yu(this.vt);
            this.pno = Float.valueOf(this.pno * (osn.yu(this.vt) / this.ra)).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.ra, this.pno);
        }
        layoutParams.width = this.ra;
        layoutParams.height = this.pno;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        vpp vppVar2 = this.f8071lh;
        if (vppVar2 != null) {
            int i10 = vppVar2.ucs;
            ouw ouwVar2 = new ouw((byte) 0);
            ouwVar2.ouw = new FrameLayout(this.vt);
            ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            ouwVar2.ouw.setLayoutParams(layoutParams2);
            ouwVar2.vt = new ryl(this.vt);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -1);
            layoutParams3.gravity = 17;
            ouwVar2.vt.setLayoutParams(layoutParams3);
            ouwVar2.ouw.addView(ouwVar2.vt);
            int iOuw = osn.ouw(this.vt, 5.0f);
            if (vmVarOuw != null && vmVarOuw.ouw == 1) {
                ouwVar2.f8522lh = com.bytedance.sdk.openadsdk.core.widget.le.ouw(getContext());
            } else {
                ouwVar2.f8522lh = com.bytedance.sdk.openadsdk.core.widget.le.vt(getContext());
            }
            ouwVar2.f8522lh.setId(520093697);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 8388613;
            layoutParams4.setMargins(iOuw, iOuw, iOuw, iOuw);
            ouwVar2.f8522lh.setLayoutParams(layoutParams4);
            ouwVar2.ouw.addView(ouwVar2.f8522lh);
            ouwVar2.yu = PAGLogoView.createPAGLogoViewByMaterial(this.vt, this.f8071lh);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams5.gravity = 8388691;
            layoutParams5.setMargins(iOuw, iOuw, iOuw, iOuw);
            ouwVar2.yu.setLayoutParams(layoutParams5);
            ouwVar2.ouw.addView(ouwVar2.yu);
            ouwVar2.fkw = new com.bytedance.sdk.openadsdk.core.le.yu(this.vt);
            int iOuw2 = osn.ouw(this.vt, 11.0f);
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(iOuw2, iOuw2);
            layoutParams6.gravity = 8388693;
            layoutParams6.rightMargin = iOuw;
            layoutParams6.bottomMargin = iOuw;
            ouwVar2.fkw.setVisibility(8);
            ouwVar2.fkw.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ouwVar2.fkw.setLayoutParams(layoutParams6);
            ouwVar2.ouw.addView(ouwVar2.fkw);
            View view = ouwVar2.ouw;
            if (view != null) {
                addView(view);
                com.bytedance.sdk.openadsdk.core.le.yu yuVar = ouwVar2.f8522lh;
                PAGLogoView pAGLogoView = ouwVar2.yu;
                com.bytedance.sdk.openadsdk.core.le.yu yuVar2 = ouwVar2.fkw;
                if (yuVar2 != null && this.f8071lh.le()) {
                    osn.ouw((View) yuVar2, 0);
                    com.bytedance.sdk.openadsdk.th.vt.ouw().ouw((int) osn.ouw(zih.ouw(), 11.0f, true), yuVar2, this.f8071lh);
                }
                com.bytedance.sdk.openadsdk.core.mwh.vt.le videoView = getVideoView();
                if (videoView != null) {
                    this.ko = videoView;
                    videoView.setVideoAdLoadListener(this);
                    this.ko.setVideoAdInteractionListener(this);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Pair(yuVar, FriendlyObstructionPurpose.CLOSE_AD));
                    FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                    arrayList.add(new Pair(pAGLogoView, friendlyObstructionPurpose));
                    arrayList.add(new Pair(yuVar2, friendlyObstructionPurpose));
                    this.ko.ouw(arrayList);
                    this.ko.setAdCreativeClickListener(new le.ouw() { // from class: com.bytedance.sdk.openadsdk.core.yu.bly.1
                        @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le.ouw
                        public final void ouw(View view2, int i11) {
                            if (bly.this.vm != null) {
                                bly.this.vm.onAdClicked();
                            }
                        }
                    });
                }
                if (pAGLogoView != null) {
                    pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.bly.2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            TTWebsiteActivity.ouw(bly.this.vt, bly.this.f8071lh, bly.this.f8070le);
                        }
                    });
                }
                if (yuVar != null) {
                    yuVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.bly.3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            bly.this.ouw();
                        }
                    });
                }
                ryl rylVar = ouwVar2.vt;
                vpp vppVar3 = this.f8071lh;
                if (vppVar3 != null && (ouwVar = vppVar3.cu) != null && rylVar != null) {
                    int i11 = ouwVar.bly;
                    float f10 = ouwVar.tlj;
                    if (i11 > 0 && f10 > 0.0f) {
                        rylVar.setRatio(i11 / f10);
                    } else if (i10 == 15) {
                        rylVar.setRatio(0.5625f);
                    } else if (i10 == 5) {
                        rylVar.setRatio(1.7777778f);
                    } else {
                        rylVar.setRatio(1.0f);
                    }
                }
                FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
                if (videoView != null && rylVar != null) {
                    rylVar.addView(videoView, layoutParams7);
                    videoView.setTag(520093762, Boolean.TRUE);
                }
                ouw((View) videoView, true);
                ouw((View) this, true);
                ouw(rylVar);
            }
        }
    }

    @Override // b9.a
    public final void h_() {
    }

    @Override // b9.a
    public final void i_() {
    }

    @Override // b9.a
    public final void j_() {
    }

    @Override // b9.d
    public final void k_() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw
    public final void ouw() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.fkw;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.lh.lh lhVar = this.yu;
        if (lhVar != null) {
            lhVar.ouw();
        } else {
            TTDelegateActivity.ouw(this.f8071lh, this.rn);
        }
    }

    @Override // b9.a
    public final void ouw(long j, long j8) {
        this.zih = j;
    }
}

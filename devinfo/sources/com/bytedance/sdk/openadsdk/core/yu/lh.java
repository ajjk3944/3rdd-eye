package com.bytedance.sdk.openadsdk.core.yu;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.bly.rn;
import com.bytedance.sdk.openadsdk.core.bly.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.tc.vt.fkw;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh extends yu {
    private int bly;
    private com.bytedance.sdk.openadsdk.ouw.ouw.vt pno;
    private int tlj;

    public lh(Context context, vpp vppVar, AdSlot adSlot, boolean z3) {
        super(context, vppVar, adSlot, z3);
        this.bly = 1;
        this.tlj = -1;
    }

    public final com.bytedance.sdk.openadsdk.multipro.vt.ouw getVideoModel() {
        qbp qbpVar = this.vt;
        if (qbpVar != null) {
            return ((th) qbpVar).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.yu.yu
    public final void lh() {
        th thVar = new th(this.ouw, this.f8544lh, this.yu, this.f8543le, this.ra) { // from class: com.bytedance.sdk.openadsdk.core.yu.lh.1
            @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
            public final fkw.ouw lh(int i4) {
                return lh.this.ouw(super.lh(i4));
            }
        };
        this.vt = thVar;
        com.bytedance.sdk.openadsdk.core.mwh.vt.lh videoController = thVar.getVideoController();
        if (videoController != null) {
            videoController.hun = this.bly;
        }
        addView(this.vt, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.fkw;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
        qbp qbpVar = this.vt;
        if (qbpVar != null) {
            ((th) qbpVar).setVideoAdListener(new com.bytedance.sdk.openadsdk.ouw.vt.lh() { // from class: com.bytedance.sdk.openadsdk.core.yu.lh.2
                @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
                public final void vt() {
                    if (lh.this.tlj == 3) {
                        lh lhVar = lh.this;
                        lhVar.ouw(lhVar.pno);
                    } else if (lh.this.tlj == 2) {
                        lh.this.ouw();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
                public final void yu() {
                    if (lh.this.pno != null) {
                        lh.this.pno.ouw();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
                public final void lh() {
                }

                @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
                public final void ouw() {
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.yu.yu
    public final void yu() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.lh videoController;
        qbp qbpVar = this.vt;
        if ((qbpVar instanceof th) && (videoController = ((th) qbpVar).getVideoController()) != null) {
            this.bly = videoController.hun;
        }
        super.yu();
    }

    public final void ouw(com.bytedance.sdk.openadsdk.ouw.ouw.vt vtVar) {
        qbp qbpVar = this.vt;
        if (qbpVar != null) {
            th thVar = (th) qbpVar;
            com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = thVar.f8093cf;
            if (leVar != null) {
                leVar.ryl();
            } else {
                rn rnVar = thVar.vt;
                if (rnVar != null) {
                    rnVar.ryl();
                }
            }
            this.pno = vtVar;
            this.tlj = 3;
        }
    }

    public final void vt() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.lh videoController;
        qbp qbpVar = this.vt;
        if (qbpVar == null || (videoController = ((th) qbpVar).getVideoController()) == null) {
            return;
        }
        videoController.fkw(true);
    }

    public final void ouw() {
        qbp qbpVar = this.vt;
        if (qbpVar != null) {
            th thVar = (th) qbpVar;
            com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = thVar.f8093cf;
            if (leVar != null) {
                leVar.tlj();
            } else {
                rn rnVar = thVar.vt;
                if (rnVar != null) {
                    rnVar.tlj();
                }
            }
            this.tlj = 2;
        }
    }
}

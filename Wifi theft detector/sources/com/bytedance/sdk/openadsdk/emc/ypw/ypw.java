package com.bytedance.sdk.openadsdk.emc.ypw;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.sba;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sz.ypw.ycc;
import com.bytedance.sdk.openadsdk.core.vk;
import com.bytedance.sdk.openadsdk.multipro.ypw.emc;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.List;
import s2.b;

/* loaded from: classes.dex */
public class ypw extends msw implements b.a, b.c, emc.InterfaceC0179emc {
    private boolean gbl;
    private xq msw;
    private boolean ru;
    private AdSlot sup;
    private long sz;
    private final com.bytedance.sdk.openadsdk.multipro.ypw.emc zz;

    public ypw(@NonNull Context context, @NonNull rie rieVar, int i10, AdSlot adSlot) {
        super(context, rieVar, i10, true);
        this.ru = false;
        this.gbl = true;
        this.bw = i10;
        this.sup = adSlot;
        this.zz = new com.bytedance.sdk.openadsdk.multipro.ypw.emc();
        emc(this.ycc);
        emc("embeded_ad");
        this.dg.emc(this);
    }

    public View bw() {
        com.bytedance.sdk.openadsdk.core.sz.ypw.ycc yccVar;
        rie rieVar = this.ypw;
        if (rieVar != null && this.xq != null) {
            if (rie.bw(rieVar)) {
                try {
                    yccVar = new com.bytedance.sdk.openadsdk.core.sz.ypw.ycc(this.xq, this.ypw, this.emc.emc());
                    rie rieVar2 = this.ypw;
                    if (rieVar2 != null && rieVar2.ak()) {
                        com.bytedance.sdk.openadsdk.core.sup.ycc yccVarEmc = yccVar.emc((List<Pair<View, FriendlyObstructionPurpose>>) null);
                        emc emcVar = this.dg;
                        if (emcVar != null) {
                            emcVar.emc(yccVarEmc);
                        }
                    }
                    this.emc.emc(yccVar.getNativeVideoController());
                    emc emcVar2 = this.dg;
                    if (emcVar2 != null) {
                        emcVar2.emc(yccVar);
                    }
                    yccVar.setVideoAdClickListenerTTNativeAd(this);
                    yccVar.setAdCreativeClickListener(new ycc.emc() { // from class: com.bytedance.sdk.openadsdk.emc.ypw.ypw.1
                        @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.ycc.emc
                        public void emc(View view, int i10) {
                            vk vkVar = ypw.this.emc;
                            if (vkVar != null) {
                                vkVar.emc(view, i10);
                            }
                        }
                    });
                    yccVar.setControllerStatusCallBack(new ycc.ypw() { // from class: com.bytedance.sdk.openadsdk.emc.ypw.ypw.2
                        @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.ycc.ypw
                        public void emc(boolean z10, long j10, long j11, long j12, boolean z11) {
                            ypw.this.zz.emc = z10;
                            ypw.this.zz.bw = j10;
                            ypw.this.zz.ycc = j11;
                            ypw.this.zz.uym = j12;
                            ypw.this.zz.dg = z11;
                        }
                    });
                    yccVar.setVideoAdLoadListener(this);
                    yccVar.setVideoAdInteractionListener(this);
                    if (5 == this.bw) {
                        yccVar.setIsAutoPlay(this.ru ? this.sup.isAutoPlay() : this.gbl);
                    } else {
                        yccVar.setIsAutoPlay(this.gbl);
                    }
                    yccVar.emc(aa.dg().xq(String.valueOf(this.ycc)), "feedGetAdView");
                } catch (Exception e10) {
                    ApmHelper.reportCustomError("", "getAdView null", e10);
                }
                if (!rie.bw(this.ypw) && yccVar != null && yccVar.emc(0L, true, false)) {
                    return yccVar;
                }
                ApmHelper.reportCustomError(this.ypw.in() + "," + yccVar, "getAdView null", new RuntimeException());
            } else {
                yccVar = null;
                if (!rie.bw(this.ypw)) {
                }
                ApmHelper.reportCustomError(this.ypw.in() + "," + yccVar, "getAdView null", new RuntimeException());
            }
        }
        return null;
    }

    @Override // s2.b.c
    public void g_() {
        xq xqVar = this.msw;
        if (xqVar != null) {
            xqVar.emc(this);
        }
    }

    @Override // s2.b.c
    public void h_() {
        xq xqVar = this.msw;
        if (xqVar != null) {
            xqVar.ypw(this);
        }
    }

    @Override // s2.b.c
    public void i_() {
    }

    @Override // s2.b.c
    public void j_() {
        xq xqVar = this.msw;
        if (xqVar != null) {
            xqVar.xq(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.emc.ypw.msw, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
        emc emcVar = this.dg;
        if (emcVar != null) {
            emcVar.sup();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ypw.emc.InterfaceC0179emc
    public com.bytedance.sdk.openadsdk.multipro.ypw.emc ycc() {
        return this.zz;
    }

    private void emc(int i10) {
        int iYpw = aa.dg().ypw(i10);
        int iXq = sba.xq(aa.emc());
        if (3 == iYpw) {
            this.ru = false;
            this.gbl = false;
        } else {
            if (1 == iYpw && tp.dg(iXq)) {
                this.ru = false;
            } else if (2 == iYpw) {
                if (tp.bw(iXq) || tp.dg(iXq) || tp.ycc(iXq)) {
                    this.ru = false;
                }
            } else if (4 == iYpw) {
                this.ru = true;
            } else if (5 == iYpw && (tp.dg(iXq) || tp.ycc(iXq))) {
            }
            this.gbl = true;
        }
        emc emcVar = this.dg;
        if (emcVar != null) {
            emcVar.emc(this.ru);
        }
    }

    public ypw(@NonNull Context context, @NonNull rie rieVar, int i10, AdSlot adSlot, emc emcVar, vk vkVar) {
        super(context, rieVar, i10, false);
        this.ru = false;
        this.gbl = true;
        this.dg = emcVar;
        this.emc = vkVar;
        this.bw = i10;
        this.sup = adSlot;
        this.zz = new com.bytedance.sdk.openadsdk.multipro.ypw.emc();
        emc(this.ycc);
        emc("embeded_ad");
        emcVar.emc(this);
    }

    public void emc(xq xqVar) {
        this.msw = xqVar;
    }

    @Override // s2.b.a
    public void emc(int i10, int i11) {
        xq xqVar = this.msw;
        if (xqVar != null) {
            xqVar.emc(i10, i11);
        }
    }

    @Override // s2.b.c
    public void emc(long j10, long j11) {
        this.sz = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.emc.ypw.msw
    public void emc(String str) {
        super.emc(str);
    }
}

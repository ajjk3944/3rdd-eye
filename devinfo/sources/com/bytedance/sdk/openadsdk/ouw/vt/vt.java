package com.bytedance.sdk.openadsdk.ouw.vt;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import b9.a;
import b9.d;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.mwh.vt.le;
import com.bytedance.sdk.openadsdk.core.rn;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.multipro.vt.ouw;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends pno implements a, d, ouw.InterfaceC0106ouw {
    private final com.bytedance.sdk.openadsdk.multipro.vt.ouw bly;

    /* renamed from: cf, reason: collision with root package name */
    private boolean f8617cf;
    private long mwh;
    public lh ouw;
    private AdSlot ryl;
    private boolean tlj;

    public vt(Context context, vpp vppVar, AdSlot adSlot) {
        super(context, vppVar, true);
        this.tlj = false;
        this.f8617cf = true;
        this.f8615le = 5;
        this.ryl = adSlot;
        this.bly = new com.bytedance.sdk.openadsdk.multipro.vt.ouw();
        ouw(this.ra);
        super.ouw("embeded_ad");
        this.fkw.yu = this;
    }

    @Override // b9.a
    public final void h_() {
        lh lhVar = this.ouw;
        if (lhVar != null) {
            lhVar.vt();
        }
    }

    @Override // b9.a
    public final void j_() {
        lh lhVar = this.ouw;
        if (lhVar != null) {
            lhVar.yu();
        }
    }

    public final View le() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar;
        vpp vppVar = this.f8616lh;
        if (vppVar != null && this.yu != null) {
            if (vpp.fkw(vppVar)) {
                try {
                    leVar = new com.bytedance.sdk.openadsdk.core.mwh.vt.le(this.yu, this.f8616lh, this.vt.f8389lh);
                    vpp vppVar2 = this.f8616lh;
                    if (vppVar2 != null && vppVar2.cd()) {
                        com.bytedance.sdk.openadsdk.core.ryl.le leVarOuw = leVar.ouw((List<Pair<View, FriendlyObstructionPurpose>>) null);
                        ouw ouwVar = this.fkw;
                        if (ouwVar != null) {
                            ouwVar.f8608cf = new WeakReference<>(leVarOuw);
                        }
                    }
                    this.vt.ouw(leVar.getNativeVideoController());
                    ouw ouwVar2 = this.fkw;
                    if (ouwVar2 != null) {
                        ouwVar2.f8611lh = new WeakReference<>(leVar);
                    }
                    leVar.setVideoAdClickListenerTTNativeAd(this);
                    leVar.setAdCreativeClickListener(new le.ouw() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.vt.1
                        @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le.ouw
                        public final void ouw(View view, int i4) {
                            le leVar2;
                            rn rnVar = vt.this.vt;
                            if (rnVar == null || (leVar2 = rnVar.vt) == null) {
                                return;
                            }
                            leVar2.onAdClicked();
                        }
                    });
                    leVar.setControllerStatusCallBack(new le.vt() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.vt.2
                        @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le.vt
                        public final void ouw(boolean z3, long j, long j8, long j9, boolean z10) {
                            vt.this.bly.ouw = z3;
                            vt.this.bly.fkw = j;
                            vt.this.bly.f8595le = j8;
                            vt.this.bly.ra = j9;
                            vt.this.bly.yu = z10;
                        }
                    });
                    leVar.setVideoAdLoadListener(this);
                    leVar.setVideoAdInteractionListener(this);
                    if (5 == this.f8615le) {
                        leVar.setIsAutoPlay(this.tlj ? this.ryl.isAutoPlay() : this.f8617cf);
                    } else {
                        leVar.setIsAutoPlay(this.f8617cf);
                    }
                    zih.yu();
                    leVar.ouw(cf.vt(String.valueOf(this.ra)), "feedGetAdView");
                } catch (Exception e2) {
                    ApmHelper.reportCustomError("", "getAdView null", e2);
                }
                if (!vpp.fkw(this.f8616lh) && leVar != null && leVar.ouw(0L, true, false)) {
                    return leVar;
                }
                ApmHelper.reportCustomError(this.f8616lh.ucs + "," + leVar, "getAdView null", new RuntimeException());
            } else {
                leVar = null;
                if (!vpp.fkw(this.f8616lh)) {
                }
                ApmHelper.reportCustomError(this.f8616lh.ucs + "," + leVar, "getAdView null", new RuntimeException());
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.vt.ouw.InterfaceC0106ouw
    public final com.bytedance.sdk.openadsdk.multipro.vt.ouw ra() {
        return this.bly;
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.vt.pno, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public final void showPrivacyActivity() {
        ouw ouwVar = this.fkw;
        if (ouwVar != null) {
            ouwVar.bly();
        }
    }

    @Override // b9.a
    public final void vt() {
        lh lhVar = this.ouw;
        if (lhVar != null) {
            lhVar.lh();
        }
    }

    private void ouw(int i4) {
        zih.yu();
        int iVt = cf.vt(i4);
        int iOuw = ksc.ouw(zih.ouw(), 60000L);
        if (3 == iVt) {
            this.tlj = false;
            this.f8617cf = false;
        } else {
            if (1 == iVt && uoy.yu(iOuw)) {
                this.tlj = false;
            } else if (2 == iVt) {
                if (uoy.fkw(iOuw) || uoy.yu(iOuw) || uoy.le(iOuw)) {
                    this.tlj = false;
                }
            } else if (4 == iVt) {
                this.tlj = true;
            } else if (5 == iVt && (uoy.yu(iOuw) || uoy.le(iOuw))) {
            }
            this.f8617cf = true;
        }
        ouw ouwVar = this.fkw;
        if (ouwVar != null) {
            ouwVar.vt = this.tlj;
        }
    }

    public vt(Context context, vpp vppVar, AdSlot adSlot, ouw ouwVar, rn rnVar) {
        super(context, vppVar, false);
        this.tlj = false;
        this.f8617cf = true;
        this.fkw = ouwVar;
        this.vt = rnVar;
        this.f8615le = 5;
        this.ryl = adSlot;
        this.bly = new com.bytedance.sdk.openadsdk.multipro.vt.ouw();
        ouw(this.ra);
        super.ouw("embeded_ad");
        ouwVar.yu = this;
    }

    @Override // b9.d
    public final void ouw(int i4, int i10) {
        lh lhVar = this.ouw;
        if (lhVar != null) {
            lhVar.ouw();
        }
    }

    @Override // b9.a
    public final void ouw(long j, long j8) {
        this.mwh = j;
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.vt.pno
    public final void ouw(String str) {
        super.ouw(str);
    }

    @Override // b9.a
    public final void i_() {
    }

    @Override // b9.d
    public final void k_() {
    }
}

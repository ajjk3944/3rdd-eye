package com.bytedance.sdk.openadsdk.component.lh;

import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.yu.tlj;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements com.bytedance.sdk.openadsdk.ouw.lh.vt {
    private final PAGInterstitialAdInteractionListener ouw;
    private final vpp yu;
    private final AtomicBoolean vt = new AtomicBoolean(false);

    /* renamed from: lh, reason: collision with root package name */
    private final AtomicBoolean f7898lh = new AtomicBoolean(false);

    public ouw(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        this.ouw = pAGInterstitialAdInteractionListener;
        this.yu = ouwVar != null ? ouwVar.lh() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public final void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.ouw;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.lh.vt
    public final void ouw() throws JSONException {
        tlj.ouw("show_callback", this.f7898lh.get(), this.vt.get(), this.yu);
        if (this.vt.compareAndSet(false, true)) {
            qbp.ouw("BVA", "full video onAdShow");
            PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.ouw;
            if (pAGInterstitialAdInteractionListener != null) {
                pAGInterstitialAdInteractionListener.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.lh.vt
    public final void vt() throws JSONException {
        tlj.ouw("close_callback", this.f7898lh.get(), this.vt.get(), this.yu);
        if (this.f7898lh.compareAndSet(false, true)) {
            qbp.ouw("BVA", "full video onAdClose");
            PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.ouw;
            if (pAGInterstitialAdInteractionListener != null) {
                pAGInterstitialAdInteractionListener.onAdDismissed();
            }
        }
    }
}

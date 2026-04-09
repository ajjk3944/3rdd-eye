package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw implements com.bytedance.sdk.openadsdk.ouw.yu.vt {
    private final PAGAppOpenAdInteractionListener ouw;
    private final AtomicBoolean vt = new AtomicBoolean(false);

    /* renamed from: lh, reason: collision with root package name */
    private final AtomicBoolean f7873lh = new AtomicBoolean(false);

    public fkw(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.ouw = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.yu.vt
    public final void lh() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.vt.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.ouw) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public final void onAdClicked() {
        qbp.ouw("BVA", "onAdClicked");
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.ouw;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.yu.vt
    public final void ouw() {
        if (this.f7873lh.compareAndSet(false, true)) {
            qbp.ouw("BVA", "onAdShow");
            PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.ouw;
            if (pAGAppOpenAdInteractionListener != null) {
                pAGAppOpenAdInteractionListener.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.yu.vt
    public final void vt() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        qbp.ouw("BVA", "onAdSkip");
        if (this.vt.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.ouw) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }
}

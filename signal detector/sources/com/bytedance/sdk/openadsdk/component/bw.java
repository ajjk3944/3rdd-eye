package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class bw implements com.bytedance.sdk.openadsdk.emc.dg.ypw {
    private final PAGAppOpenAdInteractionListener emc;
    private final AtomicBoolean ypw = new AtomicBoolean(false);
    private final AtomicBoolean xq = new AtomicBoolean(false);

    public bw(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.emc = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.emc.dg.ypw
    public void emc() {
        if (this.xq.compareAndSet(false, true)) {
            ul.emc("BVA", "onAdShow");
            PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.emc;
            if (pAGAppOpenAdInteractionListener != null) {
                pAGAppOpenAdInteractionListener.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        ul.emc("BVA", "onAdClicked");
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.emc;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.emc.dg.ypw
    public void xq() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.ypw.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.emc) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }

    @Override // com.bytedance.sdk.openadsdk.emc.dg.ypw
    public void ypw() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        ul.emc("BVA", "onAdSkip");
        if (this.ypw.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.emc) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }
}

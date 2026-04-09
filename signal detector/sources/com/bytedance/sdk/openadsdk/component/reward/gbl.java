package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.rie;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class gbl implements com.bytedance.sdk.openadsdk.emc.bw.emc {
    private final AtomicBoolean bw;
    private final AtomicBoolean dg;
    private final PAGRewardedAdInteractionListener emc;
    private final AtomicBoolean xq;
    private final rie ycc;
    private final PAGRewardedAdInteractionCallback ypw;

    public gbl(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener, com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        this.xq = new AtomicBoolean(false);
        this.dg = new AtomicBoolean(false);
        this.bw = new AtomicBoolean(false);
        this.emc = pAGRewardedAdInteractionListener;
        this.ypw = null;
        this.ycc = emcVar != null ? emcVar.ycc() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.emc.bw.emc
    public void emc() {
        this.xq.get();
        com.bytedance.sdk.openadsdk.dg.ru.emc("show_callback", this.dg.get(), this.xq.get(), this.ycc);
        if (this.xq.compareAndSet(false, true)) {
            com.bytedance.sdk.component.utils.ul.emc("BVA", "reward video onAdShow");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.emc;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdShowed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.ypw;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.emc;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.ypw;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.emc.bw.emc
    public void ypw() {
        this.dg.get();
        com.bytedance.sdk.openadsdk.dg.ru.emc("close_callback", this.dg.get(), this.xq.get(), this.ycc);
        if (this.dg.compareAndSet(false, true)) {
            com.bytedance.sdk.component.utils.ul.emc("BVA", "reward video onAdClose");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.emc;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdDismissed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.ypw;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdDismissed();
            }
        }
    }

    public gbl(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback, com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        this.xq = new AtomicBoolean(false);
        this.dg = new AtomicBoolean(false);
        this.bw = new AtomicBoolean(false);
        this.ypw = pAGRewardedAdInteractionCallback;
        this.emc = null;
        this.ycc = emcVar != null ? emcVar.ycc() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.emc.bw.emc
    public void emc(boolean z6, int i, String str, int i3, String str2) {
        if (this.bw.compareAndSet(false, true)) {
            com.bytedance.sdk.component.utils.ul.emc("BVA", "reward video onRewardVerify");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.emc;
            if (pAGRewardedAdInteractionListener != null) {
                if (z6) {
                    pAGRewardedAdInteractionListener.onUserEarnedReward(new PAGRewardItem(i, str));
                    return;
                } else {
                    pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i3, str2);
                    return;
                }
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.ypw;
            if (pAGRewardedAdInteractionCallback != null) {
                if (z6) {
                    pAGRewardedAdInteractionCallback.onUserEarnedReward(new PAGRewardItem(i, str));
                } else {
                    pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new PAGErrorModel(i3, str2));
                }
            }
        }
    }
}

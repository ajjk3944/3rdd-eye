package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly implements com.bytedance.sdk.openadsdk.ouw.fkw.ouw {
    private final AtomicBoolean fkw;

    /* renamed from: le, reason: collision with root package name */
    private final vpp f7911le;

    /* renamed from: lh, reason: collision with root package name */
    private final AtomicBoolean f7912lh;
    private final PAGRewardedAdInteractionListener ouw;
    private final PAGRewardedAdInteractionCallback vt;
    private final AtomicBoolean yu;

    public bly(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        this.f7912lh = new AtomicBoolean(false);
        this.yu = new AtomicBoolean(false);
        this.fkw = new AtomicBoolean(false);
        this.ouw = pAGRewardedAdInteractionListener;
        this.vt = null;
        this.f7911le = ouwVar != null ? ouwVar.lh() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public final void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.ouw;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.vt;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.fkw.ouw
    public final void ouw() throws JSONException {
        ko.vt("BVA", "onAdShow  mAdShowInvoked = " + this.f7912lh.get());
        com.bytedance.sdk.openadsdk.yu.tlj.ouw("show_callback", this.yu.get(), this.f7912lh.get(), this.f7911le);
        if (this.f7912lh.compareAndSet(false, true)) {
            qbp.ouw("BVA", "reward video onAdShow");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.ouw;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdShowed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.vt;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.fkw.ouw
    public final void vt() throws JSONException {
        ko.vt("BVA", "onAdClose  mAdCloseInvoked = " + this.yu.get());
        com.bytedance.sdk.openadsdk.yu.tlj.ouw("close_callback", this.yu.get(), this.f7912lh.get(), this.f7911le);
        if (this.yu.compareAndSet(false, true)) {
            qbp.ouw("BVA", "reward video onAdClose");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.ouw;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdDismissed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.vt;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdDismissed();
            }
        }
    }

    public bly(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        this.f7912lh = new AtomicBoolean(false);
        this.yu = new AtomicBoolean(false);
        this.fkw = new AtomicBoolean(false);
        this.vt = pAGRewardedAdInteractionCallback;
        this.ouw = null;
        this.f7911le = ouwVar != null ? ouwVar.lh() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.fkw.ouw
    public final void ouw(boolean z3, int i4, String str, int i10, String str2) {
        if (this.fkw.compareAndSet(false, true)) {
            qbp.ouw("BVA", "reward video onRewardVerify");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.ouw;
            if (pAGRewardedAdInteractionListener != null) {
                if (z3) {
                    pAGRewardedAdInteractionListener.onUserEarnedReward(new PAGRewardItem(i4, str));
                    return;
                } else {
                    pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i10, str2);
                    return;
                }
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.vt;
            if (pAGRewardedAdInteractionCallback != null) {
                if (z3) {
                    pAGRewardedAdInteractionCallback.onUserEarnedReward(new PAGRewardItem(i4, str));
                } else {
                    pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new PAGErrorModel(i10, str2));
                }
            }
        }
    }
}

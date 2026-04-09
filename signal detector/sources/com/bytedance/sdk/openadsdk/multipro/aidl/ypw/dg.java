package com.bytedance.sdk.openadsdk.multipro.aidl.ypw;

import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.iyl;

/* loaded from: classes.dex */
public class dg extends IRewardAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.emc.bw.emc emc;

    public dg(com.bytedance.sdk.openadsdk.emc.bw.emc emcVar) {
        this.emc = emcVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdClose() {
        if (this.emc == null) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ypw.dg.3
            @Override // java.lang.Runnable
            public void run() {
                if (dg.this.emc != null) {
                    dg.this.emc.ypw();
                }
                dg.this.emc();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdShow() {
        if (this.emc == null) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ypw.dg.1
            @Override // java.lang.Runnable
            public void run() {
                if (dg.this.emc != null) {
                    dg.this.emc.emc();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdVideoBarClick() {
        if (this.emc == null) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ypw.dg.2
            @Override // java.lang.Runnable
            public void run() {
                if (dg.this.emc != null) {
                    dg.this.emc.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onDestroy() {
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onRewardVerify(final boolean z6, final int i, final String str, final int i3, final String str2) {
        if (this.emc == null) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ypw.dg.4
            @Override // java.lang.Runnable
            public void run() {
                if (dg.this.emc != null) {
                    dg.this.emc.emc(z6, i, str, i3, str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc() {
        this.emc = null;
    }
}

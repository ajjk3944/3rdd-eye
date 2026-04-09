package com.bytedance.sdk.openadsdk.multipro.aidl.ypw;

import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.iyl;

/* loaded from: classes.dex */
public class xq extends IFullScreenVideoAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.emc.xq.ypw emc;

    public xq(com.bytedance.sdk.openadsdk.emc.xq.ypw ypwVar) {
        this.emc = ypwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdClose() {
        if (this.emc == null) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ypw.xq.3
            @Override // java.lang.Runnable
            public void run() {
                if (xq.this.emc != null) {
                    xq.this.emc.ypw();
                }
                xq.this.emc();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdShow() {
        if (this.emc == null) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ypw.xq.1
            @Override // java.lang.Runnable
            public void run() {
                if (xq.this.emc != null) {
                    xq.this.emc.emc();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdVideoBarClick() {
        if (this.emc == null) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ypw.xq.2
            @Override // java.lang.Runnable
            public void run() {
                if (xq.this.emc != null) {
                    xq.this.emc.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onDestroy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc() {
        this.emc = null;
    }
}

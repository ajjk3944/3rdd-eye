package com.bytedance.sdk.openadsdk.multipro.aidl.ypw;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.iyl;

/* loaded from: classes.dex */
public class emc extends IAppOpenAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.emc.dg.ypw emc;

    public emc(com.bytedance.sdk.openadsdk.emc.dg.ypw ypwVar) {
        this.emc = ypwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdClicked() throws RemoteException {
        if (this.emc == null) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ypw.emc.2
            @Override // java.lang.Runnable
            public void run() {
                if (emc.this.emc != null) {
                    emc.this.emc.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.emc == null) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ypw.emc.1
            @Override // java.lang.Runnable
            public void run() {
                if (emc.this.emc != null) {
                    emc.this.emc.emc();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdSkip() throws RemoteException {
        if (this.emc == null) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ypw.emc.3
            @Override // java.lang.Runnable
            public void run() {
                if (emc.this.emc != null) {
                    emc.this.emc.ypw();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdTimeOver() throws RemoteException {
        if (this.emc == null) {
            return;
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ypw.emc.4
            @Override // java.lang.Runnable
            public void run() {
                if (emc.this.emc != null) {
                    emc.this.emc.xq();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onDestroy() throws RemoteException {
        emc();
    }

    private void emc() {
        this.emc = null;
    }
}

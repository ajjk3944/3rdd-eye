package com.bytedance.sdk.openadsdk.multipro.aidl.vt;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.bs;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends IRewardAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouw;

    public yu(com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar) {
        this.ouw = ouwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public final void onAdClose() throws RemoteException {
        if (this.ouw == null) {
            return;
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.vt.yu.3
            @Override // java.lang.Runnable
            public final void run() {
                if (yu.this.ouw != null) {
                    yu.this.ouw.vt();
                }
                yu.this.ouw = null;
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public final void onAdShow() throws RemoteException {
        if (this.ouw == null) {
            return;
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.vt.yu.1
            @Override // java.lang.Runnable
            public final void run() {
                if (yu.this.ouw != null) {
                    yu.this.ouw.ouw();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public final void onAdVideoBarClick() throws RemoteException {
        if (this.ouw == null) {
            return;
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.vt.yu.2
            @Override // java.lang.Runnable
            public final void run() {
                if (yu.this.ouw != null) {
                    yu.this.ouw.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public final void onRewardVerify(final boolean z3, final int i4, final String str, final int i10, final String str2) throws RemoteException {
        if (this.ouw == null) {
            return;
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.vt.yu.4
            @Override // java.lang.Runnable
            public final void run() {
                if (yu.this.ouw != null) {
                    yu.this.ouw.ouw(z3, i4, str, i10, str2);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public final void onDestroy() throws RemoteException {
    }
}

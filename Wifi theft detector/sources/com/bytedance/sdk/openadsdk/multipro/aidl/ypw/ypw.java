package com.bytedance.sdk.openadsdk.multipro.aidl.ypw;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.core.dg.uym;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.xq.ru;

/* loaded from: classes.dex */
public class ypw extends IDislikeClosedListener.Stub {
    private final uym.emc emc;
    private final String ypw;

    public ypw(String str, uym.emc emcVar) {
        this.ypw = str;
        this.emc = emcVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
    public void onItemClickClosed() throws RemoteException {
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ypw.ypw.1
            @Override // java.lang.Runnable
            public void run() {
                if (ypw.this.emc != null) {
                    ypw.this.emc.emc();
                    ru.emc(6, ypw.this.ypw);
                }
            }
        });
    }
}

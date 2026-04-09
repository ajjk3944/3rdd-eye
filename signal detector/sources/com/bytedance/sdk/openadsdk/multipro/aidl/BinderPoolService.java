package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.bytedance.sdk.component.utils.zz;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.settings.gbl;
import com.bytedance.sdk.openadsdk.multipro.aidl.emc.bw;
import com.bytedance.sdk.openadsdk.multipro.aidl.emc.dg;
import com.bytedance.sdk.openadsdk.multipro.aidl.emc.uym;
import com.bytedance.sdk.openadsdk.multipro.aidl.emc.ycc;

/* loaded from: classes.dex */
public class BinderPoolService extends Service {
    public static volatile boolean emc;
    private static boolean xq;
    private final Binder ypw = new emc();

    public static class emc extends IBinderPool.Stub {
        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public IBinder queryBinder(int i) {
            if (i == 0) {
                return uym.emc();
            }
            if (i == 1) {
                return bw.emc();
            }
            if (i == 4) {
                return com.bytedance.sdk.openadsdk.multipro.aidl.emc.xq.emc();
            }
            if (i == 5) {
                return ycc.ypw();
            }
            if (i == 6) {
                return dg.emc();
            }
            if (i != 7) {
                return null;
            }
            return com.bytedance.sdk.openadsdk.multipro.aidl.emc.ypw.emc();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.ypw;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        aa.ypw(getApplicationContext());
        emc = true;
        if (!xq) {
            zz.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.1
                @Override // java.lang.Runnable
                public void run() {
                    gbl.xq().xq(BinderPoolService.this.getApplicationContext());
                }
            });
        }
        xq = true;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }
}

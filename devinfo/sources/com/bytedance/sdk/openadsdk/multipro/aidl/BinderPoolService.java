package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.bly;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.multipro.aidl.ouw.fkw;
import com.bytedance.sdk.openadsdk.multipro.aidl.ouw.le;
import com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ra;
import com.bytedance.sdk.openadsdk.multipro.aidl.ouw.yu;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class BinderPoolService extends Service {

    /* renamed from: lh, reason: collision with root package name */
    private static boolean f8588lh;
    public static volatile boolean ouw;
    private final Binder vt = new ouw();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw extends IBinderPool.Stub {
        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public final IBinder queryBinder(int i4) throws RemoteException {
            ko.lh("MultiProcess", "queryBinder...........binderCode=".concat(String.valueOf(i4)));
            if (i4 == 0) {
                return ra.ouw();
            }
            if (i4 == 1) {
                return fkw.ouw();
            }
            if (i4 == 4) {
                return com.bytedance.sdk.openadsdk.multipro.aidl.ouw.lh.ouw();
            }
            if (i4 == 5) {
                return le.vt();
            }
            if (i4 == 6) {
                return yu.ouw();
            }
            if (i4 != 7) {
                return null;
            }
            return com.bytedance.sdk.openadsdk.multipro.aidl.ouw.vt.ouw();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        ko.vt("TTAD.BinderPoolService", "BinderPoolService onBind ! ");
        return this.vt;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        ko.vt("TTAD.BinderPoolService", "BinderPoolService has been created ! ");
        zih.vt(getApplicationContext());
        ouw = true;
        if (!f8588lh) {
            bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.1
                @Override // java.lang.Runnable
                public final void run() {
                    cf cfVarVt = cf.vt();
                    Context applicationContext = BinderPoolService.this.getApplicationContext();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("_tryFetRemoDat");
                    try {
                        if (Build.VERSION.SDK_INT >= 33) {
                            applicationContext.registerReceiver(cfVarVt.ryl, intentFilter, 4);
                        } else {
                            applicationContext.registerReceiver(cfVarVt.ryl, intentFilter);
                        }
                    } catch (Exception e2) {
                        qbp.ouw("TTAD.SdkSettings", "", e2);
                    }
                    if (cfVarVt.bly) {
                        cfVarVt.ouw(1, false);
                        cfVarVt.uoy();
                    }
                }
            });
        }
        f8588lh = true;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ko.vt("TTAD.BinderPoolService", "BinderPoolService is destroy ! ");
    }
}

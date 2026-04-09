package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.multipro.aidl.emc.bw;
import com.bytedance.sdk.openadsdk.multipro.aidl.emc.dg;
import com.bytedance.sdk.openadsdk.multipro.aidl.emc.uym;
import com.bytedance.sdk.openadsdk.multipro.aidl.emc.ycc;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;

/* loaded from: classes.dex */
public class emc {
    private static final emc ypw = new emc();
    private IBinderPool emc;
    private ypw xq;
    private long dg = 0;
    private final ServiceConnection bw = new ServiceConnection() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.emc.2
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            iyl.emc(new msw("onServiceConnected") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.emc.2.1
                @Override // java.lang.Runnable
                public void run() throws RemoteException {
                    emc.this.emc = IBinderPool.Stub.asInterface(iBinder);
                    try {
                        emc.this.emc.asBinder().linkToDeath(emc.this.ycc, 0);
                    } catch (RemoteException e10) {
                        ul.emc("TTAD.BinderPool", "onServiceConnected throws :", e10);
                    }
                    System.currentTimeMillis();
                    long unused = emc.this.dg;
                    if (emc.this.xq != null) {
                        emc.this.xq.emc();
                    }
                }
            }, 5);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };
    private final IBinder.DeathRecipient ycc = new IBinder.DeathRecipient() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.emc.3
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            iyl.emc(new msw("binderDied") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.emc.3.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (emc.this.emc.asBinder().isBinderAlive()) {
                            emc.this.emc.asBinder().unlinkToDeath(emc.this.ycc, 0);
                        }
                    } catch (Exception e10) {
                        ul.xq("TTAD.BinderPool", e10.getMessage());
                    }
                    emc.this.emc = null;
                    emc.this.dg();
                }
            }, 5);
        }
    };

    private emc() {
        dg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dg() {
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            xq();
        }
    }

    public void xq() {
        try {
            Context contextEmc = aa.emc();
            contextEmc.bindService(new Intent(contextEmc, (Class<?>) BinderPoolService.class), this.bw, 1);
            this.dg = System.currentTimeMillis();
        } catch (Throwable unused) {
        }
    }

    public void ypw() {
        try {
            Context contextEmc = aa.emc();
            contextEmc.startService(new Intent(contextEmc, (Class<?>) BinderPoolService.class));
        } catch (Exception unused) {
        }
    }

    public static emc emc() {
        return ypw;
    }

    public void emc(ypw ypwVar) {
        this.xq = ypwVar;
        if (this.emc != null) {
            iyl.emc(new msw("onServiceConnected2") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.emc.1
                @Override // java.lang.Runnable
                public void run() {
                    if (emc.this.xq != null) {
                        emc.this.xq.emc();
                    }
                }
            }, 5);
        }
    }

    public IBinder emc(int i10) {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                try {
                    IBinderPool iBinderPool = this.emc;
                    if (iBinderPool != null) {
                        return iBinderPool.queryBinder(i10);
                    }
                } catch (RemoteException e10) {
                    ul.xq("TTAD.BinderPool", e10.getMessage());
                    tp.msw("queryBinder error");
                }
            } else {
                if (i10 == 0) {
                    return uym.emc();
                }
                if (i10 == 1) {
                    return bw.emc();
                }
                if (i10 == 5) {
                    return ycc.ypw();
                }
                if (i10 == 6) {
                    return dg.emc();
                }
                if (i10 == 7) {
                    return com.bytedance.sdk.openadsdk.multipro.aidl.emc.ypw.emc();
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}

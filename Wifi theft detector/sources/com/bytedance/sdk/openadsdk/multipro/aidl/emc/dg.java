package com.bytedance.sdk.openadsdk.multipro.aidl.emc;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class dg extends emc {
    public static ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> emc = new ConcurrentHashMap<>();
    private static volatile dg ypw;

    public static dg emc() {
        if (ypw == null) {
            synchronized (dg.class) {
                try {
                    if (ypw == null) {
                        ypw = new dg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ypw;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.emc.emc, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        emc(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.emc.emc, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iDislikeClosedListener);
        emc.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.emc.emc, com.bytedance.sdk.openadsdk.IListenerManager
    public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        emc.remove(str);
    }

    private synchronized void emc(String str, String str2) {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList;
        try {
            ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> concurrentHashMap = emc;
            if (concurrentHashMap != null && (remoteCallbackList = concurrentHashMap.get(str)) != null) {
                int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                    try {
                        IDislikeClosedListener iDislikeClosedListener = (IDislikeClosedListener) remoteCallbackList.getBroadcastItem(i10);
                        if (iDislikeClosedListener != null && "onItemClickClosed".equals(str2)) {
                            iDislikeClosedListener.onItemClickClosed();
                        }
                    } catch (Throwable th) {
                        ul.emc("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th);
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th2) {
            ul.emc("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th2);
        }
    }
}

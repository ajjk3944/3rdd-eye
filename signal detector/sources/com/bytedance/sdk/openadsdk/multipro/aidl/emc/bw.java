package com.bytedance.sdk.openadsdk.multipro.aidl.emc;

import android.os.RemoteCallbackList;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class bw extends emc {
    private static final Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> emc = DesugarCollections.synchronizedMap(new HashMap());
    private static volatile bw ypw;

    public static bw emc() {
        if (ypw == null) {
            synchronized (bw.class) {
                try {
                    if (ypw == null) {
                        ypw = new bw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ypw;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.emc.emc, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeFullVideoCallback(String str, String str2) {
        emc(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.emc.emc, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iFullScreenVideoAdInteractionListener);
        emc.put(str, remoteCallbackList);
    }

    private synchronized void emc(String str, String str2) {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackListRemove;
        try {
            Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> map = emc;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackListRemove = map.remove(str);
                } else {
                    remoteCallbackListRemove = map.get(str);
                }
                if (remoteCallbackListRemove != null) {
                    int iBeginBroadcast = remoteCallbackListRemove.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener = (IFullScreenVideoAdInteractionListener) remoteCallbackListRemove.getBroadcastItem(i);
                            if (iFullScreenVideoAdInteractionListener != null) {
                                if ("onAdShow".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onAdShow();
                                } else if ("onAdClose".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onAdClose();
                                } else if ("onAdVideoBarClick".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onAdVideoBarClick();
                                } else if ("recycleRes".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onDestroy();
                                }
                            }
                        } catch (Throwable th) {
                            ul.emc("MultiProcess", "fullScreen2 method " + str2 + " throws Exception :", th);
                        }
                    }
                    remoteCallbackListRemove.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackListRemove.kill();
                    }
                }
            }
        } catch (Throwable th2) {
            ul.emc("MultiProcess", "fullScreen1 method " + str2 + " throws Exception :", th2);
        }
    }
}

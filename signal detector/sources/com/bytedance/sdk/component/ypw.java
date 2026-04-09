package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.emc;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class ypw {
    private static volatile Handler ypw;
    private static final Object emc = new Object();
    private static final LinkedList<Runnable> xq = new LinkedList<>();
    private static Object dg = new Object();

    public static class emc extends Handler {
        public emc(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    ypw.xq();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void xq() {
        LinkedList linkedList;
        synchronized (dg) {
            try {
                synchronized (emc) {
                    LinkedList<Runnable> linkedList2 = xq;
                    linkedList = (LinkedList) linkedList2.clone();
                    linkedList2.clear();
                    ypw().removeMessages(1);
                }
                if (linkedList.size() > 0) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Handler ypw() {
        Handler handler;
        if (ypw != null) {
            return ypw;
        }
        synchronized (emc) {
            try {
                if (ypw == null) {
                    emc.InterfaceC0033emc interfaceC0033emc = com.bytedance.sdk.component.emc.emc;
                    HandlerThread handlerThreadEmc = interfaceC0033emc != null ? interfaceC0033emc.emc("queued-work-looper", -2) : null;
                    if (handlerThreadEmc == null) {
                        handlerThreadEmc = new HandlerThread("queued-work-looper", -2);
                        handlerThreadEmc.start();
                    }
                    ypw = new emc(handlerThreadEmc.getLooper());
                }
                handler = ypw;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public static void emc(Runnable runnable, boolean z6) {
        try {
            Handler handlerYpw = ypw();
            synchronized (emc) {
                try {
                    xq.add(runnable);
                    if (z6) {
                        handlerYpw.sendEmptyMessageDelayed(1, 100L);
                    } else {
                        handlerYpw.sendEmptyMessage(1);
                    }
                } finally {
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }
}

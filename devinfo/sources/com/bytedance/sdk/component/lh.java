package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.vt;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {
    private static volatile Handler vt;
    private static final Object ouw = new Object();

    /* renamed from: lh, reason: collision with root package name */
    private static final LinkedList<Runnable> f7587lh = new LinkedList<>();
    private static Object yu = new Object();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw extends Handler {
        public ouw(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    lh.ouw();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }

    public static void ouw(Runnable runnable, boolean z3) {
        try {
            Handler handlerVt = vt();
            synchronized (ouw) {
                try {
                    f7587lh.add(runnable);
                    if (z3) {
                        handlerVt.sendEmptyMessageDelayed(1, 100L);
                    } else {
                        handlerVt.sendEmptyMessage(1);
                    }
                } finally {
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }

    private static Handler vt() {
        Handler handler;
        if (vt != null) {
            return vt;
        }
        synchronized (ouw) {
            try {
                if (vt == null) {
                    vt.ouw ouwVar = vt.ouw;
                    HandlerThread handlerThreadOuw = ouwVar != null ? ouwVar.ouw("queued-work-looper") : null;
                    if (handlerThreadOuw == null) {
                        handlerThreadOuw = new HandlerThread("queued-work-looper", -2);
                        handlerThreadOuw.start();
                    }
                    vt = new ouw(handlerThreadOuw.getLooper());
                }
                handler = vt;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public static /* synthetic */ void ouw() {
        LinkedList linkedList;
        synchronized (yu) {
            try {
                synchronized (ouw) {
                    LinkedList<Runnable> linkedList2 = f7587lh;
                    linkedList = (LinkedList) linkedList2.clone();
                    linkedList2.clear();
                    vt().removeMessages(1);
                }
                if (linkedList.size() > 0) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

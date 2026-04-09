package com.singular.sdk.internal;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes2.dex */
public class SingularWorkerThread extends HandlerThread {
    private Handler handler;

    public SingularWorkerThread(String str) {
        super(str);
    }

    private synchronized void ensureInit() {
        if (this.handler == null) {
            this.handler = new Handler(getLooper());
        }
    }

    public Handler getHandler() {
        ensureInit();
        return this.handler;
    }

    public void post(Runnable runnable) {
        getHandler().post(runnable);
    }

    public void postAtFront(Runnable runnable) {
        getHandler().postAtFrontOfQueue(runnable);
    }

    public void postDelayed(Runnable runnable, int i) {
        getHandler().postDelayed(runnable, i);
    }
}

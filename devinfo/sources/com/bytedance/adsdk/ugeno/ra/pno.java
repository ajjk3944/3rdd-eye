package com.bytedance.adsdk.ugeno.ra;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno extends Handler {
    private final WeakReference<ouw> ouw;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw(Message message);
    }

    public pno(Looper looper, ouw ouwVar) {
        super(looper);
        this.ouw = new WeakReference<>(ouwVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ouw ouwVar = this.ouw.get();
        if (ouwVar == null || message == null) {
            return;
        }
        ouwVar.ouw(message);
    }
}

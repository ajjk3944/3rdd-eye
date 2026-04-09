package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class jae extends Handler {
    protected WeakReference<ouw> vt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw(Message message);
    }

    public jae(ouw ouwVar) {
        this.vt = new WeakReference<>(ouwVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        ouw ouwVar;
        WeakReference<ouw> weakReference = this.vt;
        if (weakReference == null || (ouwVar = weakReference.get()) == null || message == null) {
            return;
        }
        ouwVar.ouw(message);
    }

    public jae(Looper looper, ouw ouwVar) {
        super(looper);
        if (ouwVar != null) {
            this.vt = new WeakReference<>(ouwVar);
        }
    }
}

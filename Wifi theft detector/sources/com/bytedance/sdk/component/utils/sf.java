package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class sf extends Handler {
    protected WeakReference<emc> emc;

    public interface emc {
        void emc(Message message);
    }

    public sf(emc emcVar) {
        if (emcVar != null) {
            this.emc = new WeakReference<>(emcVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        emc emcVar;
        WeakReference<emc> weakReference = this.emc;
        if (weakReference == null || (emcVar = weakReference.get()) == null || message == null) {
            return;
        }
        emcVar.emc(message);
    }

    public sf(Looper looper, emc emcVar) {
        super(looper);
        if (emcVar != null) {
            this.emc = new WeakReference<>(emcVar);
        }
    }
}

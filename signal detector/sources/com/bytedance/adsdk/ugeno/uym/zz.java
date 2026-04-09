package com.bytedance.adsdk.ugeno.uym;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class zz extends Handler {
    private final WeakReference<emc> emc;

    public interface emc {
        void emc(Message message);
    }

    public zz(Looper looper, emc emcVar) {
        super(looper);
        this.emc = new WeakReference<>(emcVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        emc emcVar = this.emc.get();
        if (emcVar == null || message == null) {
            return;
        }
        emcVar.emc(message);
    }
}

package com.bytedance.sdk.component.msw.emc;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.sf;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class ypw extends sf implements xq {
    private final HandlerThread ypw;

    public ypw(HandlerThread handlerThread, sf.emc emcVar) {
        super(handlerThread.getLooper(), emcVar);
        this.ypw = handlerThread;
    }

    @Override // com.bytedance.sdk.component.msw.emc.xq
    public void emc() {
        removeCallbacksAndMessages(null);
        WeakReference<sf.emc> weakReference = this.emc;
        if (weakReference != null) {
            weakReference.clear();
            this.emc = null;
        }
    }

    public void ypw() {
        HandlerThread handlerThread = this.ypw;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    public void emc(sf.emc emcVar) {
        this.emc = new WeakReference<>(emcVar);
    }
}

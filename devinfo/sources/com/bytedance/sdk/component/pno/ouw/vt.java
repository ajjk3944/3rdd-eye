package com.bytedance.sdk.component.pno.ouw;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.jae;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends jae implements lh {
    public final HandlerThread ouw;

    public vt(HandlerThread handlerThread, jae.ouw ouwVar) {
        super(handlerThread.getLooper(), ouwVar);
        this.ouw = handlerThread;
    }

    @Override // com.bytedance.sdk.component.pno.ouw.lh
    public final void ouw() {
        removeCallbacksAndMessages(null);
        WeakReference<jae.ouw> weakReference = this.vt;
        if (weakReference != null) {
            weakReference.clear();
            this.vt = null;
        }
    }

    public final void ouw(jae.ouw ouwVar) {
        this.vt = new WeakReference<>(ouwVar);
    }
}

package com.bytedance.sdk.component.pno.ouw;

import android.os.Handler;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.pno;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw {
    public final yu<vt> ouw;
    private Handler vt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.component.pno.ouw.ouw$ouw, reason: collision with other inner class name */
    public static class C0057ouw {
        private static final ouw ouw = new ouw(0);
    }

    public /* synthetic */ ouw(byte b10) {
        this();
    }

    public static ouw ouw() {
        return C0057ouw.ouw;
    }

    public final Handler vt() {
        if (this.vt == null) {
            synchronized (ouw.class) {
                try {
                    if (this.vt == null) {
                        this.vt = ouw(null, "csj_io_handler");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.vt;
    }

    private ouw() {
        this.ouw = new yu<>();
    }

    public final jae ouw(jae.ouw ouwVar, final String str) {
        vt vtVar = (vt) this.ouw.ouw();
        if (vtVar == null) {
            return vt(ouwVar, str);
        }
        vtVar.ouw(ouwVar);
        vtVar.post(new Runnable() { // from class: com.bytedance.sdk.component.pno.ouw.ouw.1
            @Override // java.lang.Runnable
            public final void run() {
                Thread.currentThread().setName(str);
            }
        });
        return vtVar;
    }

    private static vt vt(jae.ouw ouwVar, String str) {
        return new vt(pno.ouw(str, 0), ouwVar);
    }
}

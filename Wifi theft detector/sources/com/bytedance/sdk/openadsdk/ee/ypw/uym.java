package com.bytedance.sdk.openadsdk.ee.ypw;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.ul;

/* loaded from: classes.dex */
public class uym {
    private static emc emc;
    private static HandlerThread ypw;

    public static class emc extends Handler {
        public emc(Looper looper) {
            super(looper);
        }

        public void emc(ypw ypwVar) {
            if (ypwVar == null) {
                return;
            }
            int iIntValue = ypwVar.gbl().intValue();
            if (hasMessages(iIntValue)) {
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = iIntValue;
            messageObtain.obj = ypwVar;
            sendMessageDelayed(messageObtain, ypwVar.ycc());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ypw ypwVar = (ypw) message.obj;
            if (ypwVar == null) {
                return;
            }
            int iYpw = ypwVar.ypw();
            if (iYpw == 1) {
                ypwVar.uym();
            } else {
                if (iYpw != 2) {
                    bw.ypw(ypwVar.gbl());
                    return;
                }
                ypwVar.msw();
            }
            if (ypwVar.zz()) {
                bw.ypw(ypwVar.gbl());
            } else if (ypwVar.sup()) {
                emc(ypwVar);
            }
        }
    }

    public static void emc() {
    }

    public static void ypw(ypw ypwVar) {
        if (ypwVar == null || emc == null) {
            return;
        }
        try {
            int iIntValue = ypwVar.gbl().intValue();
            if (emc.hasMessages(iIntValue)) {
                emc.removeMessages(iIntValue);
            }
        } catch (Exception unused) {
        }
    }

    public static void emc(ypw ypwVar) {
        if (ypwVar == null) {
            return;
        }
        ypw();
        emc emcVar = emc;
        if (emcVar != null) {
            emcVar.emc(ypwVar);
        }
    }

    public static void ypw() {
        if (emc != null) {
            return;
        }
        try {
            HandlerThread handlerThread = ypw;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (uym.class) {
                try {
                    HandlerThread handlerThread2 = ypw;
                    if (handlerThread2 == null || !handlerThread2.isAlive()) {
                        ypw = com.bytedance.sdk.component.utils.msw.emc("csj_MRC");
                        emc = new emc(ypw.getLooper());
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            ul.xq("MRC", th.getMessage());
        }
    }
}

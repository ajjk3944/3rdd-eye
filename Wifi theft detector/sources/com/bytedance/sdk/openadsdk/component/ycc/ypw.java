package com.bytedance.sdk.openadsdk.component.ycc;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class ypw implements Handler.Callback {
    private long gbl;
    private long ru;
    private boolean sup;
    private boolean uym;
    private emc xq;
    private final com.bytedance.sdk.openadsdk.component.msw.emc ypw;
    private Handler emc = new Handler(Looper.myLooper(), this);
    private int dg = 0;
    private int bw = 5;
    private int ycc = 0;
    private final int msw = 1000;
    private int zz = 1000;

    public ypw(com.bytedance.sdk.openadsdk.component.msw.emc emcVar) {
        this.ypw = emcVar;
    }

    public void bw() {
        this.emc.removeCallbacksAndMessages(null);
        this.emc = null;
    }

    public void dg() {
        Handler handler = this.emc;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    public void emc(int i10) {
        this.dg = i10;
        int i11 = this.bw - i10;
        this.ypw.ypw(i11 * 1000);
        boolean z10 = true;
        if (i10 <= 0) {
            emc emcVar = this.xq;
            if (emcVar != null && !this.uym) {
                emcVar.ypw();
                this.uym = true;
            }
            i10 = 0;
        }
        emc emcVar2 = this.xq;
        if (emcVar2 != null) {
            int iMax = Math.max(this.ycc - i11, 0);
            if (i10 != 0 && i11 < this.ycc) {
                z10 = false;
            }
            emcVar2.emc(iMax, z10);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 100 && this.emc != null) {
            int i10 = message.arg1;
            emc(i10);
            if (i10 > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i10 - 1;
                this.emc.sendMessageDelayed(messageObtain, this.zz);
            }
        }
        return true;
    }

    public void xq() {
        if (this.emc != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.arg1 = this.dg;
            this.emc.sendMessage(messageObtain);
        }
    }

    public void ypw(int i10) {
        this.ycc = Math.min(i10, this.bw);
    }

    public void ypw() {
        Handler handler = this.emc;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.bw, 0));
        }
    }

    public void emc(float f10) {
        int i10 = (int) f10;
        this.bw = i10;
        if (i10 <= 0) {
            this.bw = 5;
        }
    }

    public void emc(emc emcVar) {
        this.xq = emcVar;
    }

    public int emc() {
        return this.ycc;
    }

    public void emc(int i10, float f10, boolean z10) {
        com.bytedance.sdk.openadsdk.component.msw.emc emcVar;
        if ((i10 == 1 || i10 == 2) && this.sup != z10) {
            this.sup = z10;
            if (i10 == 1 && (emcVar = this.ypw) != null) {
                emcVar.emc(z10);
            }
            if (z10) {
                try {
                    this.zz = (int) (1000.0f / f10);
                    this.gbl = System.currentTimeMillis();
                    return;
                } catch (Throwable unused) {
                }
            } else {
                long jCurrentTimeMillis = this.ru + (System.currentTimeMillis() - this.gbl);
                this.ru = jCurrentTimeMillis;
                com.bytedance.sdk.openadsdk.component.msw.emc emcVar2 = this.ypw;
                if (emcVar2 != null) {
                    emcVar2.emc(jCurrentTimeMillis);
                }
            }
            this.zz = 1000;
        }
    }
}

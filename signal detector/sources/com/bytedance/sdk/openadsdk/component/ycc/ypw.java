package com.bytedance.sdk.openadsdk.component.ycc;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.openadsdk.TTAdConstant;

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
    private final int msw = TTAdConstant.STYLE_SIZE_RADIO_1_1;
    private int zz = TTAdConstant.STYLE_SIZE_RADIO_1_1;

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

    public void emc(int i) {
        this.dg = i;
        int i3 = this.bw - i;
        this.ypw.ypw(i3 * 1000);
        boolean z6 = true;
        if (i <= 0) {
            emc emcVar = this.xq;
            if (emcVar != null && !this.uym) {
                emcVar.ypw();
                this.uym = true;
            }
            i = 0;
        }
        emc emcVar2 = this.xq;
        if (emcVar2 != null) {
            int iMax = Math.max(this.ycc - i3, 0);
            if (i != 0 && i3 < this.ycc) {
                z6 = false;
            }
            emcVar2.emc(iMax, z6);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 100 && this.emc != null) {
            int i = message.arg1;
            emc(i);
            if (i > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i - 1;
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

    public void ypw(int i) {
        this.ycc = Math.min(i, this.bw);
    }

    public void ypw() {
        Handler handler = this.emc;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.bw, 0));
        }
    }

    public void emc(float f2) {
        int i = (int) f2;
        this.bw = i;
        if (i <= 0) {
            this.bw = 5;
        }
    }

    public void emc(emc emcVar) {
        this.xq = emcVar;
    }

    public int emc() {
        return this.ycc;
    }

    public void emc(int i, float f2, boolean z6) {
        com.bytedance.sdk.openadsdk.component.msw.emc emcVar;
        if ((i == 1 || i == 2) && this.sup != z6) {
            this.sup = z6;
            if (i == 1 && (emcVar = this.ypw) != null) {
                emcVar.emc(z6);
            }
            if (z6) {
                try {
                    this.zz = (int) (1000.0f / f2);
                    this.gbl = System.currentTimeMillis();
                    return;
                } catch (Throwable unused) {
                }
            } else {
                long jCurrentTimeMillis = (System.currentTimeMillis() - this.gbl) + this.ru;
                this.ru = jCurrentTimeMillis;
                com.bytedance.sdk.openadsdk.component.msw.emc emcVar2 = this.ypw;
                if (emcVar2 != null) {
                    emcVar2.emc(jCurrentTimeMillis);
                }
            }
            this.zz = TTAdConstant.STYLE_SIZE_RADIO_1_1;
        }
    }
}

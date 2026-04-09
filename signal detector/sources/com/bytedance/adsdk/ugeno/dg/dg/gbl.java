package com.bytedance.adsdk.ugeno.dg.dg;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.uym.zz;

/* loaded from: classes.dex */
public class gbl extends xq implements zz.emc {
    private int gbl;
    private boolean sup;
    private Handler sz;

    public gbl(Context context) {
        super(context);
        this.gbl = 500;
        this.sz = new com.bytedance.adsdk.ugeno.uym.zz(Looper.getMainLooper(), this);
    }

    @Override // com.bytedance.adsdk.ugeno.dg.dg.xq
    public boolean emc(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        this.gbl = com.bytedance.adsdk.ugeno.uym.xq.emc(this.bw.get("delay"), 500);
        return emc(this.ypw, motionEvent);
    }

    private boolean emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.dg.gbl gblVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.sz.sendEmptyMessageDelayed(1102, this.gbl);
        } else {
            if (action == 1) {
                if (this.sup && (gblVar = this.emc) != null) {
                    gblVar.emc(this.ypw, this.ycc, this.xq.ypw());
                    this.sup = false;
                    Handler handler = this.sz;
                    if (handler != null) {
                        handler.removeMessages(1102);
                    }
                    return true;
                }
                Handler handler2 = this.sz;
                if (handler2 != null) {
                    handler2.removeMessages(1102);
                }
                this.sup = false;
                return false;
            }
            if (action == 3) {
                Handler handler3 = this.sz;
                if (handler3 != null) {
                    handler3.removeMessages(1102);
                }
                this.sup = false;
            }
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.uym.zz.emc
    public void emc(Message message) {
        if (message.what != 1102) {
            return;
        }
        this.sup = true;
        Handler handler = this.sz;
        if (handler != null) {
            handler.removeMessages(1102);
        }
    }
}

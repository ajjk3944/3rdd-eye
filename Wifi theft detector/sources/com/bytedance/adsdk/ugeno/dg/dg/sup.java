package com.bytedance.adsdk.ugeno.dg.dg;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.uym.zz;

/* loaded from: classes.dex */
public class sup extends xq implements zz.emc {
    private int gbl;
    private Handler sup;

    public sup(Context context) {
        super(context);
        this.gbl = 500;
        this.sup = new com.bytedance.adsdk.ugeno.uym.zz(Looper.getMainLooper(), this);
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
        int action = motionEvent.getAction();
        if (action == 0) {
            this.sup.sendEmptyMessageDelayed(1101, this.gbl);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        this.sup.removeMessages(1101);
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.uym.zz.emc
    public void emc(Message message) {
        if (message.what != 1101) {
            return;
        }
        com.bytedance.adsdk.ugeno.dg.gbl gblVar = this.emc;
        if (gblVar != null) {
            gblVar.emc(this.ypw, this.ycc, this.xq.ypw());
        }
        Handler handler = this.sup;
        if (handler != null) {
            handler.removeMessages(1101);
        }
    }
}

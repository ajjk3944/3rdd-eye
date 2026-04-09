package com.bytedance.adsdk.ugeno.dg.dg;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.adsdk.ugeno.uym.zz;
import java.util.Map;

/* loaded from: classes.dex */
public class ru extends xq implements zz.emc {
    private int gbl;
    private int qh;
    private int sup;
    private Handler sz;

    public ru(Context context) {
        super(context);
        this.sup = 0;
        this.sz = new com.bytedance.adsdk.ugeno.uym.zz(Looper.getMainLooper(), this);
        this.qh = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.dg.dg.xq
    public boolean emc(Object... objArr) {
        Map<String, String> map = this.bw;
        if (map != null) {
            int iEmc = com.bytedance.adsdk.ugeno.uym.xq.emc(map.get("loop"), 0);
            this.gbl = iEmc;
            if (iEmc <= 0) {
                this.qh = -1;
            } else {
                this.qh = iEmc;
            }
            this.sup = com.bytedance.adsdk.ugeno.uym.xq.emc(this.bw.get("duration"), 0);
        }
        this.sz.sendEmptyMessageDelayed(1001, this.sup);
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.uym.zz.emc
    public void emc(Message message) {
        int i10;
        int i11;
        if (message.what != 1001) {
            return;
        }
        Log.d("UGBaseEventMonitor", "handleMsg: execute timer event" + this.qh);
        this.emc.emc(this.ypw, this.ycc, this.xq.ypw());
        int i12 = this.qh + (-1);
        this.qh = i12;
        if (i12 < 0 && (i11 = this.sup) != 0) {
            this.sz.sendEmptyMessageDelayed(1001, i11);
        } else if (i12 > 0 && (i10 = this.sup) != 0) {
            this.sz.sendEmptyMessageDelayed(1001, i10);
        } else {
            this.sz.removeMessages(1001);
        }
    }
}

package com.bytedance.adsdk.ugeno.dg.dg;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.adsdk.ugeno.uym.zz;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
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
        this.sz.sendEmptyMessageDelayed(BackupConstant.SCENE_RENDER_FAIL, this.sup);
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.uym.zz.emc
    public void emc(Message message) {
        int i;
        int i3;
        if (message.what != 1001) {
            return;
        }
        Log.d("UGBaseEventMonitor", "handleMsg: execute timer event" + this.qh);
        this.emc.emc(this.ypw, this.ycc, this.xq.ypw());
        int i6 = this.qh + (-1);
        this.qh = i6;
        if (i6 < 0 && (i3 = this.sup) != 0) {
            this.sz.sendEmptyMessageDelayed(BackupConstant.SCENE_RENDER_FAIL, i3);
        } else if (i6 > 0 && (i = this.sup) != 0) {
            this.sz.sendEmptyMessageDelayed(BackupConstant.SCENE_RENDER_FAIL, i);
        } else {
            this.sz.removeMessages(BackupConstant.SCENE_RENDER_FAIL);
        }
    }
}

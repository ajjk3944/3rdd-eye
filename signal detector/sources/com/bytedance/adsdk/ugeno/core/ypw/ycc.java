package com.bytedance.adsdk.ugeno.core.ypw;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.core.sz;
import com.bytedance.adsdk.ugeno.uym.zz;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ycc implements zz.emc {
    private sz bw;
    private Context dg;
    private boolean emc;
    private Handler uym = new zz(Looper.getMainLooper(), this);
    private cf xq;
    private com.bytedance.adsdk.ugeno.ypw.xq ycc;
    private int ypw;

    public ycc(Context context, sz szVar, com.bytedance.adsdk.ugeno.ypw.xq xqVar) {
        this.dg = context;
        this.bw = szVar;
        this.ycc = xqVar;
    }

    public void emc(cf cfVar) {
        this.xq = cfVar;
    }

    public void emc() {
        sz szVar = this.bw;
        if (szVar == null) {
            return;
        }
        JSONObject jSONObjectXq = szVar.xq();
        try {
            this.ypw = Integer.parseInt(com.bytedance.adsdk.ugeno.xq.ypw.emc(jSONObjectXq.optString("interval", "8000"), this.ycc.sup()));
            this.emc = jSONObjectXq.optBoolean("repeat");
            this.uym.sendEmptyMessageDelayed(BackupConstant.SCENE_RENDER_FAIL, this.ypw);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.uym.zz.emc
    public void emc(Message message) {
        if (message.what != 1001) {
            return;
        }
        cf cfVar = this.xq;
        if (cfVar != null) {
            sz szVar = this.bw;
            com.bytedance.adsdk.ugeno.ypw.xq xqVar = this.ycc;
            cfVar.emc(szVar, xqVar, xqVar);
        }
        if (this.emc) {
            this.uym.sendEmptyMessageDelayed(BackupConstant.SCENE_RENDER_FAIL, this.ypw);
        } else {
            this.uym.removeMessages(BackupConstant.SCENE_RENDER_FAIL);
        }
    }
}

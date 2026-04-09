package com.bytedance.adsdk.ugeno.core.ypw;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.core.ru;
import com.bytedance.adsdk.ugeno.core.sz;
import com.bytedance.adsdk.ugeno.uym.zz;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw implements zz.emc {
    private com.bytedance.adsdk.ugeno.ypw.xq bw;
    private sz dg;
    private int emc;
    private Context xq;
    private Handler ycc = new zz(Looper.getMainLooper(), this);
    private cf ypw;

    public ypw(Context context, sz szVar, com.bytedance.adsdk.ugeno.ypw.xq xqVar) {
        this.xq = context;
        this.dg = szVar;
        this.bw = xqVar;
    }

    public void emc(cf cfVar) {
        this.ypw = cfVar;
    }

    public void emc() {
        sz szVar = this.dg;
        if (szVar == null) {
            return;
        }
        try {
            int i10 = Integer.parseInt(com.bytedance.adsdk.ugeno.xq.ypw.emc(szVar.xq().optString("delay"), this.bw.sup()));
            this.emc = i10;
            this.ycc.sendEmptyMessageDelayed(1001, i10);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.uym.zz.emc
    public void emc(Message message) {
        if (message.what != 1001) {
            return;
        }
        JSONObject jSONObjectXq = this.dg.xq();
        if (TextUtils.equals(jSONObjectXq.optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE), "onAnimation")) {
            String strOptString = jSONObjectXq.optString("nodeId");
            com.bytedance.adsdk.ugeno.ypw.xq xqVar = this.bw;
            com.bytedance.adsdk.ugeno.ypw.xq xqVarBw = xqVar.ypw(xqVar).bw(strOptString);
            new ru(xqVarBw.gbl(), com.bytedance.adsdk.ugeno.core.emc.emc(jSONObjectXq.optJSONObject("animatorSet"), xqVarBw)).emc();
        } else {
            cf cfVar = this.ypw;
            if (cfVar != null) {
                sz szVar = this.dg;
                com.bytedance.adsdk.ugeno.ypw.xq xqVar2 = this.bw;
                cfVar.emc(szVar, xqVar2, xqVar2);
            }
        }
        this.ycc.removeMessages(1001);
    }
}

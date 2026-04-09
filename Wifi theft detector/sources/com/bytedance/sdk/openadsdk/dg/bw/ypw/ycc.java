package com.bytedance.sdk.openadsdk.dg.bw.ypw;

import android.os.SystemClock;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.utils.ul;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import u2.b;

/* loaded from: classes.dex */
public class ycc extends xq {
    private int dg = 0;
    private final com.bykv.vk.openvk.emc.emc.emc.xq.xq emc;
    private long xq;
    private long ypw;

    public ycc(com.bykv.vk.openvk.emc.emc.emc.xq.xq xqVar) {
        this.emc = xqVar;
    }

    public void emc(long j10) {
        this.ypw = j10;
    }

    public void ypw(long j10) {
        this.xq = j10;
    }

    public void emc(int i10) {
        this.dg = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.dg.bw.ypw.xq
    public void emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.ypw);
            jSONObject.put("buffers_time", this.xq);
            jSONObject.put("video_backup", this.dg);
        } catch (Throwable th) {
            ul.xq("FeedOverModel", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.dg.bw.ypw.xq
    public void emc(emc emcVar) throws JSONException {
        super.emc(emcVar);
        JSONObject jSONObjectDg = emcVar.dg();
        if (com.bytedance.sdk.openadsdk.sra.emc.emc("re_vi_en_le", 0) != 1) {
            return;
        }
        File file = new File(this.emc.bw(), this.emc.aa());
        if (file.exists()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                jSONObjectDg.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, b.b(file.getAbsolutePath()));
                jSONObjectDg.put("level_cost_time", SystemClock.elapsedRealtime() - jElapsedRealtime);
            } catch (JSONException unused) {
            }
        }
    }
}

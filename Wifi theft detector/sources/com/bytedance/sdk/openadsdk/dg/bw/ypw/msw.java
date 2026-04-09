package com.bytedance.sdk.openadsdk.dg.bw.ypw;

import com.bytedance.sdk.component.utils.ul;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import y2.b;

/* loaded from: classes.dex */
public class msw extends xq {
    private int dg;
    private final com.bykv.vk.openvk.emc.emc.emc.xq.xq emc;
    private long xq;
    private long ypw;

    public msw(com.bykv.vk.openvk.emc.emc.emc.xq.xq xqVar) {
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
            jSONObject.put("video_start_duration", this.ypw);
            jSONObject.put("video_cache_size", this.xq);
            jSONObject.put("is_auto_play", this.dg);
        } catch (Throwable th) {
            ul.xq("FeedPlayModel", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.dg.bw.ypw.xq
    public void emc(emc emcVar) throws Throwable {
        if (this.emc.db()) {
            String strBw = this.emc.bw();
            String strAa = this.emc.aa();
            File fileD = b.d(strBw, strAa);
            File fileC = b.c(strBw, strAa);
            if (fileC.exists()) {
                fileD = fileC;
            }
            try {
                emcVar.dg().put("moov_box_pos", u2.b.a(fileD));
            } catch (JSONException unused) {
            }
        }
    }
}

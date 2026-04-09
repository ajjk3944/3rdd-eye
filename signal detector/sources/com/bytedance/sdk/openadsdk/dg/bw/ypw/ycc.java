package com.bytedance.sdk.openadsdk.dg.bw.ypw;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.bykv.vk.openvk.emc.emc.emc.xq.b;
import com.bytedance.sdk.component.utils.ul;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ycc extends xq {
    private int dg = 0;
    private final b emc;
    private long xq;
    private long ypw;

    public ycc(b bVar) {
        this.emc = bVar;
    }

    public void emc(long j6) {
        this.ypw = j6;
    }

    public void ypw(long j6) {
        this.xq = j6;
    }

    public void emc(int i) {
        this.dg = i;
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
        MediaExtractor mediaExtractor;
        int integer;
        super.emc(emcVar);
        JSONObject jSONObjectDg = emcVar.dg();
        if (com.bytedance.sdk.openadsdk.sra.emc.emc("re_vi_en_le", 0) != 1) {
            return;
        }
        File file = new File(this.emc.bw(), this.emc.aa());
        if (file.exists()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            String absolutePath = file.getAbsolutePath();
            try {
                mediaExtractor = new MediaExtractor();
                try {
                    mediaExtractor.setDataSource(absolutePath);
                    int trackCount = mediaExtractor.getTrackCount();
                    for (int i = 0; i < trackCount; i++) {
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                        String string = trackFormat.getString("mime");
                        if (string != null && (("video/avc".equals(string) || "video/hevc".equals(string)) && trackFormat.containsKey("level"))) {
                            integer = trackFormat.getInteger("level");
                            mediaExtractor.release();
                            break;
                        }
                    }
                } catch (Throwable unused) {
                    if (mediaExtractor != null) {
                        mediaExtractor.release();
                    }
                    integer = -1;
                    jSONObjectDg.put("level", integer);
                    jSONObjectDg.put("level_cost_time", SystemClock.elapsedRealtime() - jElapsedRealtime);
                }
            } catch (Throwable unused2) {
                mediaExtractor = null;
            }
            mediaExtractor.release();
            integer = -1;
            try {
                jSONObjectDg.put("level", integer);
                jSONObjectDg.put("level_cost_time", SystemClock.elapsedRealtime() - jElapsedRealtime);
            } catch (JSONException unused3) {
            }
        }
    }
}

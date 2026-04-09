package com.bytedance.sdk.openadsdk.dg.bw.ypw;

import com.bykv.vk.openvk.emc.emc.emc.xq.b;
import com.bytedance.sdk.component.utils.ul;
import java.io.File;
import java.io.FileInputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class msw extends xq {
    private int dg;
    private final b emc;
    private long xq;
    private long ypw;

    public msw(b bVar) {
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
            jSONObject.put("video_start_duration", this.ypw);
            jSONObject.put("video_cache_size", this.xq);
            jSONObject.put("is_auto_play", this.dg);
        } catch (Throwable th) {
            ul.xq("FeedPlayModel", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.dg.bw.ypw.xq
    public void emc(emc emcVar) throws Throwable {
        FileInputStream fileInputStream;
        int i;
        if (this.emc.db()) {
            String strBw = this.emc.bw();
            String strAa = this.emc.aa();
            File fileA = R3.b.A(strBw, strAa);
            File fileZ = R3.b.z(strBw, strAa);
            if (fileZ.exists()) {
                fileA = fileZ;
            }
            int i3 = -1;
            if (fileA.exists()) {
                long length = fileA.length();
                if (length > 0) {
                    FileInputStream fileInputStream2 = null;
                    try {
                        try {
                            fileInputStream = new FileInputStream(fileA);
                            i = 8;
                        } catch (Exception unused) {
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            byte[] bArr = new byte[8];
                            long j6 = 0;
                            while (fileInputStream.read(bArr) == i) {
                                int i6 = i;
                                long j7 = ((bArr[1] & 255) << 16) | ((bArr[0] & 255) << 24) | ((bArr[2] & 255) << i6) | (bArr[3] & 255);
                                if (bArr[4] != 109 || bArr[5] != 111 || bArr[6] != 111 || bArr[7] != 118) {
                                    long j8 = j7 - 8;
                                    if (j8 > 0 && fileInputStream.skip(j8) < j8) {
                                        break;
                                    }
                                    j6 += j7;
                                    i = i6;
                                } else {
                                    break;
                                }
                            }
                            i3 = (int) ((j6 * 100.0f) / length);
                            fileInputStream.close();
                        } catch (Exception unused2) {
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            emcVar.dg().put("moov_box_pos", i3);
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                try {
                                    fileInputStream2.close();
                                } catch (Exception unused3) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception unused4) {
                    }
                }
            }
            try {
                emcVar.dg().put("moov_box_pos", i3);
            } catch (JSONException unused5) {
            }
        }
    }
}

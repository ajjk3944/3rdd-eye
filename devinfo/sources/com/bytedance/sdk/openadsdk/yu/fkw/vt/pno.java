package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bykv.vk.openvk.ouw.ouw.ouw.lh.a;
import com.bytedance.sdk.component.utils.qbp;
import com.google.android.gms.internal.play_billing.m1;
import java.io.File;
import java.io.FileInputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno extends lh {

    /* renamed from: lh, reason: collision with root package name */
    public int f8769lh;
    public long ouw;
    public long vt;
    private final a yu;

    public pno(a aVar) {
        this.yu = aVar;
    }

    @Override // com.bytedance.sdk.openadsdk.yu.fkw.vt.lh
    public final void ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("video_start_duration", this.ouw);
            jSONObject.put("video_cache_size", this.vt);
            jSONObject.put("is_auto_play", this.f8769lh);
        } catch (Throwable th2) {
            qbp.lh("FeedPlayModel", th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.yu.fkw.vt.lh
    public final void ouw(ouw ouwVar) throws Throwable {
        FileInputStream fileInputStream;
        int i4;
        a aVar = this.yu;
        if (aVar.fkw) {
            String str = aVar.f6567lh;
            String strBly = aVar.bly();
            File fileA = m1.A(str, strBly);
            File fileG = m1.G(str, strBly);
            if (fileG.exists()) {
                fileA = fileG;
            }
            int i10 = -1;
            if (fileA.exists()) {
                long length = fileA.length();
                if (length > 0) {
                    FileInputStream fileInputStream2 = null;
                    try {
                        try {
                            fileInputStream = new FileInputStream(fileA);
                            i4 = 8;
                        } catch (Exception unused) {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            byte[] bArr = new byte[8];
                            long j = 0;
                            while (fileInputStream.read(bArr) == i4) {
                                int i11 = i4;
                                long j8 = ((bArr[1] & 255) << 16) | ((bArr[0] & 255) << 24) | ((bArr[2] & 255) << i11) | (bArr[3] & 255);
                                if (bArr[4] != 109 || bArr[5] != 111 || bArr[6] != 111 || bArr[7] != 118) {
                                    long j9 = j8 - 8;
                                    if (j9 > 0 && fileInputStream.skip(j9) < j9) {
                                        break;
                                    }
                                    j += j8;
                                    i4 = i11;
                                } else {
                                    break;
                                }
                            }
                            i10 = (int) ((j * 100.0f) / length);
                            fileInputStream.close();
                        } catch (Exception unused2) {
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            ouwVar.vt().put("moov_box_pos", i10);
                        } catch (Throwable th3) {
                            th = th3;
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
                ouwVar.vt().put("moov_box_pos", i10);
            } catch (JSONException unused5) {
            }
        }
    }
}

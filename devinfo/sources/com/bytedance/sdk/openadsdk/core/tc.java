package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class tc {

    /* renamed from: lh, reason: collision with root package name */
    private static final AtomicInteger f8461lh;
    private static final AtomicInteger ouw;
    private static final AtomicInteger vt;
    private static final AtomicInteger yu;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        ouw = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        vt = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        f8461lh = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        yu = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    public static void ouw() {
        try {
            long jOuw = com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "upload_time_key", 0L);
            if (jOuw <= 0 || System.currentTimeMillis() - jOuw < 86400000) {
                if (jOuw <= 0 || jOuw > System.currentTimeMillis()) {
                    com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            AtomicInteger atomicInteger = ouw;
            final int i4 = atomicInteger.get();
            AtomicInteger atomicInteger2 = vt;
            final int i10 = atomicInteger2.get();
            AtomicInteger atomicInteger3 = f8461lh;
            final int i11 = atomicInteger3.get();
            AtomicInteger atomicInteger4 = yu;
            final int i12 = atomicInteger4.get();
            com.bytedance.sdk.openadsdk.rn.lh.ouw("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.core.tc.1
                @Override // com.bytedance.sdk.openadsdk.rn.vt
                public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("encrypt_success_count", i4);
                        jSONObject.put("encrypt_fail_count", i10);
                        jSONObject.put("decrypt_success_count", i11);
                        jSONObject.put("decrypt_fail_count", i12);
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                    yuVar.ouw = "crypt_v4_statistics";
                    yuVar.bly = jSONObject.toString();
                    return yuVar;
                }
            });
            synchronized (tc.class) {
                atomicInteger.set(0);
                atomicInteger2.set(0);
                atomicInteger3.set(0);
                atomicInteger4.set(0);
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file");
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized void vt(boolean z3) {
        if (z3) {
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(ouw.incrementAndGet()));
        } else {
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(vt.incrementAndGet()));
        }
    }

    public static void ouw(final int i4, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i10) {
        com.bytedance.sdk.openadsdk.rn.lh.ouw("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.core.tc.2
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i4);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i10);
                    if (i10 == 6) {
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put("vendor", Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                yuVar.ouw = "crypt_v4_fail";
                yuVar.bly = jSONObject.toString();
                return yuVar;
            }
        });
    }

    public static synchronized void ouw(boolean z3) {
        if (z3) {
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(f8461lh.incrementAndGet()));
        } else {
            com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(f8461lh.incrementAndGet()));
        }
    }

    public static void ouw(JSONObject jSONObject) {
        vt(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }
}

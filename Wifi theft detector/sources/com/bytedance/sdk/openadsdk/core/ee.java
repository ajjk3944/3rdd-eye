package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ee {
    private static final AtomicInteger dg;
    private static final AtomicInteger emc;
    private static final AtomicInteger xq;
    private static final AtomicInteger ypw;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        emc = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        ypw = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        xq = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        dg = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    public static void emc() {
        try {
            long jEmc = com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("encrypt_statistics_file", "upload_time_key", 0L);
            if (jEmc <= 0 || System.currentTimeMillis() - jEmc < SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                if (jEmc <= 0 || jEmc > System.currentTimeMillis()) {
                    com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            ypw();
            synchronized (ee.class) {
                emc.set(0);
                ypw.set(0);
                xq.set(0);
                dg.set(0);
                com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("encrypt_statistics_file");
                com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    private static void ypw() {
        final int i10 = emc.get();
        final int i11 = ypw.get();
        final int i12 = xq.get();
        final int i13 = dg.get();
        com.bytedance.sdk.openadsdk.vk.xq.emc("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.core.ee.1
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            @Nullable
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i10);
                    jSONObject.put("encrypt_fail_count", i11);
                    jSONObject.put("decrypt_success_count", i12);
                    jSONObject.put("decrypt_fail_count", i13);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc("crypt_v4_statistics").ypw(jSONObject.toString());
            }
        });
    }

    public static synchronized void ypw(boolean z10) {
        if (z10) {
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(emc.incrementAndGet()));
        } else {
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(ypw.incrementAndGet()));
        }
    }

    public static void emc(final int i10, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i11) {
        com.bytedance.sdk.openadsdk.vk.xq.emc("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.core.ee.2
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            @Nullable
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i10);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i11);
                    if (i11 == 6) {
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put("vendor", Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc("crypt_v4_fail").ypw(jSONObject.toString());
            }
        });
    }

    public static synchronized void emc(boolean z10) {
        if (z10) {
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(xq.incrementAndGet()));
        } else {
            com.bytedance.sdk.openadsdk.multipro.dg.dg.emc("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(xq.incrementAndGet()));
        }
    }

    public static void emc(JSONObject jSONObject) {
        ypw(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }
}

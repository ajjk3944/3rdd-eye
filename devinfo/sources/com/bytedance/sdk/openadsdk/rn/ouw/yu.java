package com.bytedance.sdk.openadsdk.rn.ouw;

import android.os.Build;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import com.bytedance.sdk.openadsdk.utils.ex;
import com.bytedance.sdk.openadsdk.utils.uoy;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu<T extends yu> implements lh {
    public String bly;
    public String fkw;

    /* renamed from: lh, reason: collision with root package name */
    public String f8642lh;
    private String mwh;
    public String ouw;
    public String pno;
    public String ra;
    public String tlj;
    public String vt;

    /* renamed from: cf, reason: collision with root package name */
    private final String f8640cf = BuildConfig.VERSION_NAME;
    private long ryl = System.currentTimeMillis() / 1000;
    public int yu = 0;

    /* renamed from: le, reason: collision with root package name */
    public int f8641le = 0;

    public yu() {
        try {
            this.mwh = ex.ouw();
        } catch (Throwable unused) {
            this.mwh = "default";
        }
    }

    private static JSONObject lh() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("os", 1);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("package_name", uoy.ra());
            jSONObject.put("ua", uoy.fkw());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static yu<yu> vt() {
        return new yu<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[PHI: r3
  0x003f: PHI (r3v3 int) = (r3v1 int), (r3v5 int) binds: [B:10:0x0036, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.sdk.openadsdk.rn.ouw.lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject ouw() {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.rn.ouw.yu.ouw():org.json.JSONObject");
    }

    public final T vt(String str) {
        this.bly = str;
        return this;
    }

    public final T ouw(String str) {
        this.ouw = str;
        return this;
    }
}

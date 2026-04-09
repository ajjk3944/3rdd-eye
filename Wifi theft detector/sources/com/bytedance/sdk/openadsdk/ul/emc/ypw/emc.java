package com.bytedance.sdk.openadsdk.ul.emc.ypw;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.settings.gbl;
import com.bytedance.sdk.openadsdk.core.sup;
import com.bytedance.sdk.openadsdk.core.xq;
import com.bytedance.sdk.openadsdk.utils.db;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.vk.emc.dg;
import com.bytedance.sdk.openadsdk.vk.ypw;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.unity3d.ads.BuildConfig;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    private static volatile emc zz;
    private final AtomicBoolean emc = new AtomicBoolean(false);
    private volatile Boolean ypw = null;
    private AtomicLong xq = new AtomicLong(0);
    private int dg = 0;
    private String bw = "";
    private final CountDownLatch ycc = new CountDownLatch(1);
    private volatile boolean uym = false;
    private String msw = "";

    private emc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean dg() {
        if (this.ypw == null) {
            synchronized (this) {
                try {
                    if (this.ypw == null) {
                        this.ypw = Boolean.valueOf(((int) ((Math.random() * 100.0d) + 1.0d)) <= gbl.xq().emc("gid_status", 100));
                        if (this.ypw.booleanValue()) {
                            try {
                                this.msw = db.emc();
                            } catch (Throwable unused) {
                                this.msw = BuildConfig.FLAVOR;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.ypw.booleanValue();
    }

    public boolean xq() {
        return gbl.xq().sb("gaid");
    }

    public String ypw() {
        if (!xq()) {
            return "";
        }
        if (aa.dg().hoq() != 1) {
            return this.bw;
        }
        if (iyl.ycc()) {
            return this.bw;
        }
        if (!this.uym) {
            try {
                this.ycc.await(4L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                this.uym = true;
                this.ycc.countDown();
                throw th;
            }
            this.uym = true;
            this.ycc.countDown();
        }
        return this.bw;
    }

    public static emc emc() {
        if (zz == null) {
            synchronized (emc.class) {
                try {
                    if (zz == null) {
                        zz = new emc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zz;
    }

    public void emc(boolean z10) {
        if (xq()) {
            if (this.dg == 1 || !TextUtils.isEmpty(this.bw)) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (z10 || this.xq.get() <= jElapsedRealtime) {
                this.xq.set(jElapsedRealtime + 300000);
                final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                iyl.emc(new msw("pag_gaid") { // from class: com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v5, types: [com.bytedance.sdk.openadsdk.core.xq] */
                    /* JADX WARN: Type inference failed for: r4v0 */
                    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
                    /* JADX WARN: Type inference failed for: r4v3 */
                    /* JADX WARN: Type inference failed for: r4v4 */
                    /* JADX WARN: Type inference failed for: r4v5 */
                    /* JADX WARN: Type inference failed for: r4v6 */
                    @Override // java.lang.Runnable
                    public void run() {
                        ?? r42;
                        try {
                            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(aa.emc());
                            if (advertisingIdInfo != null) {
                                boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                                if (zIsLimitAdTrackingEnabled) {
                                    emc.this.dg = 1;
                                    emc.this.emc(2, "lmt", SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                }
                                r42 = zIsLimitAdTrackingEnabled;
                                if (!emc.this.xq()) {
                                    emc.this.emc(1, "not in privacy fields allowed", SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                    r42 = zIsLimitAdTrackingEnabled;
                                } else if (!zIsLimitAdTrackingEnabled) {
                                    String id = advertisingIdInfo.getId();
                                    String str = emc.this.bw;
                                    if (TextUtils.isEmpty(id)) {
                                        emc.this.emc(4, "empty gaid", SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                    } else {
                                        emc.this.bw = id;
                                        emc.this.emc(true, SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                    }
                                    r42 = zIsLimitAdTrackingEnabled;
                                    if (!str.equals(id)) {
                                        sup.emc();
                                        r42 = zIsLimitAdTrackingEnabled;
                                    }
                                }
                            } else {
                                r42 = -1;
                            }
                            if (r42 != -1) {
                                xq.emc().emc("limit_ad_track", r42);
                            }
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        if (!this.emc.getAndSet(true)) {
            emc(1, "not in privacy fields allowed", 0L);
        }
        this.uym = true;
        this.ycc.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String ypw(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(th.toString());
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb.append("\n\tat ");
                sb.append(stackTraceElement.toString());
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public void emc(JSONObject jSONObject) throws JSONException {
        if (!xq() || jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("gaid", ypw());
        } catch (JSONException unused) {
        }
    }

    public void emc(boolean z10, long j10) {
        emc(z10, 0, "", null, j10);
    }

    public void emc(int i10, String str, long j10) {
        emc(false, i10, str, null, j10);
    }

    public void emc(int i10, Throwable th, long j10) {
        emc(false, i10, "", th, j10);
    }

    public void emc(final boolean z10, final int i10, final String str, final Throwable th, final long j10) {
        if ((this.ypw == null || this.ypw.booleanValue()) && aa.emc() != null) {
            aa.bw().emc(new ypw() { // from class: com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.2
                @Override // com.bytedance.sdk.openadsdk.vk.ypw
                public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws Exception {
                    if (!emc.this.dg()) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("session_id", emc.this.msw);
                    jSONObject.put("is_success", z10);
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_msg", TextUtils.isEmpty(str) ? emc.ypw(th) : str);
                    jSONObject.put("duration", j10);
                    jSONObject.put("has_setting", gbl.xq().yid() > 0);
                    return dg.ypw().emc("gid_status").ypw(jSONObject.toString());
                }
            }, false);
        }
    }
}

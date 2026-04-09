package com.bytedance.sdk.openadsdk.qbp.ouw.vt;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.rn.ouw.lh;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import com.bytedance.sdk.openadsdk.rn.vt;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.ex;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw {
    private static volatile ouw ra;

    /* renamed from: lh, reason: collision with root package name */
    private AtomicLong f8624lh = new AtomicLong(0);
    public int ouw = 0;
    public String vt = "";
    private final AtomicBoolean yu = new AtomicBoolean(false);
    private volatile Boolean fkw = null;

    /* renamed from: le, reason: collision with root package name */
    private String f8623le = "";

    private ouw() {
    }

    public static boolean lh() {
        return cf.vt().zin("gaid");
    }

    public final String vt() {
        return lh() ? this.vt : "";
    }

    public static ouw ouw() {
        if (ra == null) {
            synchronized (ouw.class) {
                try {
                    if (ra == null) {
                        ra = new ouw();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String vt(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(th2.toString());
            for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                sb2.append("\n\tat ");
                sb2.append(stackTraceElement.toString());
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final void ouw(boolean z3) {
        if (lh()) {
            if (this.ouw == 1 || !TextUtils.isEmpty(this.vt)) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (z3 || this.f8624lh.get() <= jElapsedRealtime) {
                this.f8624lh.set(jElapsedRealtime + 300000);
                bs.ouw((pno) new DeviceUtils.lh());
                return;
            }
            return;
        }
        if (this.yu.getAndSet(true)) {
            return;
        }
        ouw().ouw(1, "not in privacy fields allowed");
    }

    public final void ouw(JSONObject jSONObject) {
        if (lh()) {
            try {
                jSONObject.put("gaid", this.vt);
            } catch (JSONException unused) {
            }
        }
    }

    public final void ouw(int i4, String str) {
        ouw(false, i4, str, null);
    }

    public final void ouw(final boolean z3, final int i4, final String str, final Throwable th2) {
        if (this.fkw == null) {
            synchronized (this) {
                try {
                    if (this.fkw == null) {
                        this.fkw = Boolean.valueOf(((int) ((Math.random() * 100.0d) + 1.0d)) <= cf.vt().ouw("gid_status", 100));
                        if (this.fkw.booleanValue()) {
                            try {
                                this.f8623le = ex.ouw();
                            } catch (Throwable unused) {
                                this.f8623le = "default";
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        if (!this.fkw.booleanValue() || zih.ouw() == null) {
            return;
        }
        zih.fkw().ouw(new vt() { // from class: com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.1
            @Override // com.bytedance.sdk.openadsdk.rn.vt
            public final lh ouw() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("session_id", ouw.this.f8623le);
                jSONObject.put("is_success", z3);
                jSONObject.put("error_code", i4);
                jSONObject.put("error_msg", TextUtils.isEmpty(str) ? ouw.vt(th2) : str);
                jSONObject.put("has_setting", cf.vt().fak() > 0);
                yu yuVar = new yu();
                yuVar.ouw = "gid_status";
                yuVar.bly = jSONObject.toString();
                return yuVar;
            }
        }, false);
    }
}

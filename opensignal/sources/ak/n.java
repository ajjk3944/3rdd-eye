package ak;

import com.google.android.gms.internal.measurement.e5;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final List f619a;

    static {
        v0 v0Var = new v0("update_config", "", new o0(0L, 60000L, -1, false, true, "ROLLING_WINDOW", 0L), e5.H("UPDATE_CONFIG"), true, 61312);
        v0 v0Var2 = new v0("manual", "/android/v3/speed", new o0(0L, 0L, 0, true, false, "FIXED_WINDOW", 0L), e5.I("OPTIONAL_LOCATION", "CORE", "LATENCY", "DOWNLOAD_SPEED", "UPLOAD_SPEED", "SEND_RESULTS"), false, 61376);
        f619a = e5.I(v0Var, v0Var2, v0.a(v0Var2, "manual_video", "/android/v3/video", e5.I("OPTIONAL_LOCATION", "CORE", "VIDEO", "SEND_SINGLE_TASK_RESULT"), 262132), v0.a(v0Var2, "manual_throughput", "/android/v3/throughput", e5.I("OPTIONAL_LOCATION", "PUBLIC_IP", "CORE", "THROUGHPUT_SERVER_RESPONSE", "THROUGHPUT_DOWNLOAD", "THROUGHPUT_UPLOAD", "THROUGHPUT_ICMP", "SEND_RESULTS"), 258036), new v0("manual_http_head_latency_assistant", "/android/v3/http_head_latency", new o0(0L, 0L, 0, true, false, "FIXED_WINDOW", 0L), e5.I("CORE", "HTTP_HEAD_LATENCY", "CONNECTIVITY_ASSISTANT"), false, 61312), new v0("manual_core_assistant", "/android/v3/core", new o0(0L, 0L, 0, true, false, "FIXED_WINDOW", 0L), e5.I("OPTIONAL_LOCATION", "CORE", "CONNECTIVITY_ASSISTANT"), false, 61376));
    }
}

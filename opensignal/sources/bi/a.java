package bi;

import bh.e;
import bh.g;
import bh.m;
import com.google.android.gms.internal.measurement.e5;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List f2761a;

    static {
        List listI = e5.I(new b("core.NC_IS_INTERNET_AVAILABLE", "=", "0"), new b("core.NC_IS_NOT_SUSPENDED", "=", "0"));
        bh.c cVar = bh.c.NO_INTERNET_CONNECTION;
        e eVar = e.PROBLEM_WITH_INTERNET_CONNECTION;
        g gVar = g.CONNECTED_TO_MOBILE_NO_INTERNET;
        m mVar = m.CONNECT_TO_ANOTHER_WIFI_ROUTER;
        m mVar2 = m.TURN_AIRPLANE_MODE_ON_OFF;
        c cVar2 = new c("no_internet_connectivity", (List) null, listI, new bh.a(1, 900, cVar, eVar, gVar, e5.I(mVar, mVar2)), 5);
        List listI2 = e5.I(new b("core.NETWORK_CONNECTION_TYPE", "<", "1"), new b("core.DATA_DISABLED_REASONS", "!=", "[]"));
        e eVar2 = e.MOBILE_DATA_DISABLED;
        g gVar2 = g.NO_MOBILE_CONNECTION;
        m mVar3 = m.TURN_ON_MOBILE_DATA;
        m mVar4 = m.CONNECT_TO_WIFI_ROUTER;
        f2761a = e5.I(cVar2, new c("is_mobile_data_disabled", listI2, (List) null, new bh.a(1, 901, cVar, eVar2, gVar2, e5.I(mVar3, mVar4)), 9), new c("slow_data_connection", e5.I(new b("http_head_latency.HTTP_HEAD_LATENCY.1.endpoint_type", "=", "1"), new b("http_head_latency.HTTP_HEAD_LATENCY.1.latency_ms", "!=", "-1"), new b("http_head_latency.HTTP_HEAD_LATENCY.1.latency_ms", ">", "500")), (List) null, new bh.a(200, 902, bh.c.POSSIBLE_INTERNET_ISSUES, e.MOBILE_CONNECTION_SLOW, g.WEAK_MOBILE_CONNECTION, e5.I(mVar4, mVar2)), 9));
    }
}

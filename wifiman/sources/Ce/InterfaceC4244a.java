package ce;

import Rj.o;
import Rj.p;
import Rj.s;
import gg.AbstractC5912b;
import gg.z;
import java.util.List;
import kotlin.Metadata;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0002H'¢\u0006\u0004\b\b\u0010\u0005J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\n\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lce/a;", "", "Lgg/z;", "Lce/b;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Lgg/z;", "", "Lce/c;", SnmpConfigurator.O_BIND_ADDRESS, "Lce/f;", "report", "Lce/g;", SnmpConfigurator.O_COMMUNITY, "(Lce/f;)Lgg/z;", "", "resultId", "Lce/e;", "Lgg/b;", "d", "(Ljava/lang/String;Lce/e;)Lgg/b;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: ce.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4244a {
    @Rj.f("/proxy/")
    z<ApiNetworkWifimanDeviceInfo> a();

    @Rj.f("/proxy/devices")
    z<List<ApiNetworkWifimanLanNeighbour>> b();

    @o("/proxy/feedback")
    z<ApiNetworkWifimanSpeedtestReportResult> c(@Rj.a ApiNetworkWifimanSpeedtestReport report);

    @p("/proxy/feedback/{feedbackId}/wifi_experience")
    AbstractC5912b d(@s("feedbackId") String resultId, @Rj.a ApiNetworkWifimanSpeedtestFeedbackReport report);
}

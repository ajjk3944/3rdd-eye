package c8;

import Rj.i;
import Rj.o;
import com.ubnt.usurvey.speedtest.model.SpeedTestReport;
import com.ubnt.usurvey.speedtest.model.SpeedTestReportResult;
import gg.z;
import kotlin.Metadata;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lc8/b;", "", "", "token", "userAgent", "Lcom/ubnt/usurvey/speedtest/model/SpeedTestReport;", "params", "Lgg/z;", "Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportResult;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Ljava/lang/String;Ljava/lang/String;Lcom/ubnt/usurvey/speedtest/model/SpeedTestReport;)Lgg/z;", "speedtest-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: c8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4230b {
    @o("/api/v2/results")
    z<SpeedTestReportResult> a(@i("x-test-token") String token, @i("User-Agent") String userAgent, @Rj.a SpeedTestReport params);
}

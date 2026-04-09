package Xd;

import Rj.o;
import Yd.ApiUispAuthParams;
import Yd.ApiUispAuthResponse;
import Yd.ApiUispIspInfo;
import Yd.ApiUispSpeedtestReportParams;
import gg.AbstractC5912b;
import gg.z;
import kotlin.Metadata;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H'¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LXd/a;", "", "LYd/a;", "params", "Lgg/z;", "LYd/b;", SnmpConfigurator.O_COMMUNITY, "(LYd/a;)Lgg/z;", "LYd/d;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Lgg/z;", "LYd/e;", "Lgg/b;", SnmpConfigurator.O_BIND_ADDRESS, "(LYd/e;)Lgg/b;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {
    @Rj.f("/nms/api/v2.1/nms/info")
    z<ApiUispIspInfo> a();

    @o("/nms/api/v2.1/nms/speed/report")
    AbstractC5912b b(@Rj.a ApiUispSpeedtestReportParams params);

    @o("/nms/api/v2.1/nms/info/login")
    z<ApiUispAuthResponse> c(@Rj.a ApiUispAuthParams params);
}

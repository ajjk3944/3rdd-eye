package K7;

import Mj.w;
import Rj.f;
import Rj.o;
import Rj.s;
import Rj.t;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudRequest;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudRequestResponse;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportSiteInfo;
import gg.z;
import kotlin.Metadata;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\tH'¢\u0006\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"LK7/a;", "", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;", "request", "Lgg/z;", "LMj/w;", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestResponse;", SnmpConfigurator.O_COMMUNITY, "(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;)Lgg/z;", "", "requestId", "Lcom/ubnt/teleport/unifi/cloud/api/a;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Ljava/lang/String;)Lgg/z;", "token", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;", SnmpConfigurator.O_BIND_ADDRESS, "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface a {
    @f("/teleport/{requestId}")
    z<w<com.ubnt.teleport.unifi.cloud.api.a>> a(@s("requestId") String requestId);

    @f("/teleport/metadata")
    z<w<ApiTeleportSiteInfo>> b(@t("token") String token);

    @o("/teleport")
    z<w<ApiTeleportCloudRequestResponse>> c(@Rj.a ApiTeleportCloudRequest request);
}

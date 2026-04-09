package Pd;

import Rj.f;
import com.ui.wifiman.model.ubiquiti.cloud.status.api.ApiUbiquitiCloudStatus;
import gg.z;
import kotlin.Metadata;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LPd/d;", "", "Lgg/z;", "Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Lgg/z;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface d {
    @f("/api/v2/components.json")
    z<ApiUbiquitiCloudStatus> a();
}

package db;

import Rj.f;
import gg.z;
import kotlin.Metadata;
import lb.CloudConfig;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldb/b;", "", "Lgg/z;", "Llb/a;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Lgg/z;", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: db.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC5340b {
    @f("/cloudAccessConfig.json")
    z<CloudConfig> a();
}

package jb;

import Rj.o;
import gg.z;
import java.util.List;
import kotlin.Metadata;
import lb.CloudCredentials;
import lb.CreateCredentials;
import mb.UcoreDevice;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0004H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ljb/n;", "", "Llb/d;", "createCredentials", "Lgg/z;", "Llb/b;", SnmpConfigurator.O_BIND_ADDRESS, "(Llb/d;)Lgg/z;", "", "Llb/h;", "Lmb/y;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Lgg/z;", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface n {
    @Rj.f("/devices?type=ucore&withUserData=true")
    z<List<lb.h<UcoreDevice>>> a();

    @o("/create-credentials")
    z<CloudCredentials> b(@Rj.a CreateCredentials createCredentials);
}

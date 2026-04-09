package ib;

import Rj.l;
import Rj.o;
import Rj.p;
import Rj.q;
import Rj.y;
import gg.AbstractC5912b;
import gg.z;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lib/e;", "", "Lib/a;", "body", "Lgg/z;", "Lib/b;", SnmpConfigurator.O_BIND_ADDRESS, "(Lib/a;)Lgg/z;", "", "url", "Lokhttp3/MultipartBody$Part;", "logFile", "Lgg/b;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;)Lgg/b;", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface e {
    @l
    @p
    AbstractC5912b a(@y String url, @q MultipartBody.Part logFile);

    @o("crash")
    z<UploadUrlResponse> b(@Rj.a UploadUrlRequest body);
}

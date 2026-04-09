package okhttp3.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.Cookie;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/Cookie;", "cookie", "", "forObsoleteRfc2965", "", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/Cookie;Z)Ljava/lang/String;", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Internal {
    public static final String a(Cookie cookie, boolean z10) {
        AbstractC6492s.i(cookie, "cookie");
        return cookie.f(z10);
    }
}

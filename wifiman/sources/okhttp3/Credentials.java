package okhttp3;

import ej.h;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lokhttp3/Credentials;", "", "<init>", "()V", "", "username", "password", "Ljava/nio/charset/Charset;", "charset", SnmpConfigurator.O_AUTH_PROTOCOL, "(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Credentials {

    /* renamed from: a, reason: collision with root package name */
    public static final Credentials f56000a = new Credentials();

    private Credentials() {
    }

    public static final String a(String username, String password, Charset charset) {
        AbstractC6492s.i(username, "username");
        AbstractC6492s.i(password, "password");
        AbstractC6492s.i(charset, "charset");
        return "Basic " + h.f46470d.c(username + ':' + password, charset).c();
    }
}

package okhttp3.logging;

import Zg.d0;
import ej.C5481e;
import ej.InterfaceC5483g;
import ej.m;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import jh.AbstractC6329b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\"#B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R*\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b\u001c\u0010 ¨\u0006$"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "Lokhttp3/Headers;", "headers", "", "i", "LYg/J;", "d", "(Lokhttp3/Headers;I)V", "", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/Headers;)Z", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "", "Ljava/util/Set;", "headersToRedact", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "<set-?>", SnmpConfigurator.O_COMMUNITY, "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "getLevel", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "level", "Level", "Logger", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HttpLoggingInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Logger logger;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile Set headersToRedact;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private volatile Level level;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "", "message", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Ljava/lang/String;)V", "Companion", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Logger {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = Companion.f56865a;

        /* renamed from: b, reason: collision with root package name */
        public static final Logger f56864b = new Companion.DefaultLogger();

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "()V", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DefaultLogger", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f56865a = new Companion();

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion$DefaultLogger;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "()V", "", "message", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Ljava/lang/String;)V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
            private static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void a(String message) {
                    AbstractC6492s.i(message, "message");
                    Platform.l(Platform.INSTANCE.g(), message, 0, null, 6, null);
                }
            }

            private Companion() {
            }
        }

        void a(String message);
    }

    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean b(Headers headers) {
        String strB = headers.b("Content-Encoding");
        return (strB == null || t.C(strB, "identity", true) || t.C(strB, "gzip", true)) ? false : true;
    }

    private final void d(Headers headers, int i10) {
        String strJ = this.headersToRedact.contains(headers.e(i10)) ? "██" : headers.j(i10);
        this.logger.a(headers.e(i10) + ": " + strJ);
    }

    @Override // okhttp3.Interceptor
    public Response a(Interceptor.Chain chain) throws Exception {
        String string;
        String str;
        char c10;
        String string2;
        Charset UTF_8;
        Charset UTF_82;
        AbstractC6492s.i(chain, "chain");
        Level level = this.level;
        Request requestJ = chain.getRequest();
        if (level == Level.NONE) {
            return chain.b(requestJ);
        }
        boolean z10 = level == Level.BODY;
        boolean z11 = z10 || level == Level.HEADERS;
        RequestBody body = requestJ.getBody();
        Connection connectionC = chain.c();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--> ");
        sb2.append(requestJ.getMethod());
        sb2.append(' ');
        sb2.append(requestJ.getUrl());
        if (connectionC != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(' ');
            sb3.append(connectionC.a());
            string = sb3.toString();
        } else {
            string = "";
        }
        sb2.append(string);
        String string3 = sb2.toString();
        if (!z11 && body != null) {
            string3 = string3 + " (" + body.a() + "-byte body)";
        }
        this.logger.a(string3);
        if (z11) {
            Headers headers = requestJ.getHeaders();
            if (body != null) {
                MediaType f56169b = body.getContentType();
                if (f56169b != null && headers.b("Content-Type") == null) {
                    this.logger.a("Content-Type: " + f56169b);
                }
                if (body.a() != -1 && headers.b("Content-Length") == null) {
                    this.logger.a("Content-Length: " + body.a());
                }
            }
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                d(headers, i10);
            }
            if (!z10 || body == null) {
                this.logger.a("--> END " + requestJ.getMethod());
            } else if (b(requestJ.getHeaders())) {
                this.logger.a("--> END " + requestJ.getMethod() + " (encoded body omitted)");
            } else if (body.f()) {
                this.logger.a("--> END " + requestJ.getMethod() + " (duplex request body omitted)");
            } else if (body.g()) {
                this.logger.a("--> END " + requestJ.getMethod() + " (one-shot body omitted)");
            } else {
                C5481e c5481e = new C5481e();
                body.h(c5481e);
                MediaType f56169b2 = body.getContentType();
                if (f56169b2 == null || (UTF_82 = f56169b2.c(StandardCharsets.UTF_8)) == null) {
                    UTF_82 = StandardCharsets.UTF_8;
                    AbstractC6492s.h(UTF_82, "UTF_8");
                }
                this.logger.a("");
                if (Utf8Kt.a(c5481e)) {
                    this.logger.a(c5481e.G(UTF_82));
                    this.logger.a("--> END " + requestJ.getMethod() + " (" + body.a() + "-byte body)");
                } else {
                    this.logger.a("--> END " + requestJ.getMethod() + " (binary " + body.a() + "-byte body omitted)");
                }
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseB = chain.b(requestJ);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody body2 = responseB.getBody();
            AbstractC6492s.f(body2);
            long contentLength = body2.getContentLength();
            String str2 = contentLength != -1 ? contentLength + "-byte" : "unknown-length";
            Logger logger = this.logger;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<-- ");
            sb4.append(responseB.getCode());
            if (responseB.getMessage().length() == 0) {
                str = "-byte body omitted)";
                string2 = "";
                c10 = ' ';
            } else {
                String message = responseB.getMessage();
                StringBuilder sb5 = new StringBuilder();
                str = "-byte body omitted)";
                c10 = ' ';
                sb5.append(' ');
                sb5.append(message);
                string2 = sb5.toString();
            }
            sb4.append(string2);
            sb4.append(c10);
            sb4.append(responseB.getRequest().getUrl());
            sb4.append(" (");
            sb4.append(millis);
            sb4.append("ms");
            sb4.append(z11 ? "" : ", " + str2 + " body");
            sb4.append(')');
            logger.a(sb4.toString());
            if (z11) {
                Headers headers2 = responseB.getHeaders();
                int size2 = headers2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    d(headers2, i11);
                }
                if (!z10 || !HttpHeaders.b(responseB)) {
                    this.logger.a("<-- END HTTP");
                } else if (b(responseB.getHeaders())) {
                    this.logger.a("<-- END HTTP (encoded body omitted)");
                } else {
                    InterfaceC5483g bodySource = body2.getSource();
                    bodySource.request(Long.MAX_VALUE);
                    C5481e c5481eB = bodySource.b();
                    Long l10 = null;
                    if (t.C("gzip", headers2.b("Content-Encoding"), true)) {
                        Long lValueOf = Long.valueOf(c5481eB.D0());
                        m mVar = new m(c5481eB.clone());
                        try {
                            c5481eB = new C5481e();
                            c5481eB.e0(mVar);
                            AbstractC6329b.a(mVar, null);
                            l10 = lValueOf;
                        } finally {
                        }
                    }
                    MediaType f56210c = body2.getF56210c();
                    if (f56210c == null || (UTF_8 = f56210c.c(StandardCharsets.UTF_8)) == null) {
                        UTF_8 = StandardCharsets.UTF_8;
                        AbstractC6492s.h(UTF_8, "UTF_8");
                    }
                    if (!Utf8Kt.a(c5481eB)) {
                        this.logger.a("");
                        this.logger.a("<-- END HTTP (binary " + c5481eB.D0() + str);
                        return responseB;
                    }
                    if (contentLength != 0) {
                        this.logger.a("");
                        this.logger.a(c5481eB.clone().G(UTF_8));
                    }
                    if (l10 != null) {
                        this.logger.a("<-- END HTTP (" + c5481eB.D0() + "-byte, " + l10 + "-gzipped-byte body)");
                    } else {
                        this.logger.a("<-- END HTTP (" + c5481eB.D0() + "-byte body)");
                    }
                }
            }
            return responseB;
        } catch (Exception e10) {
            this.logger.a("<-- HTTP FAILED: " + e10);
            throw e10;
        }
    }

    public final void c(Level level) {
        AbstractC6492s.i(level, "<set-?>");
        this.level = level;
    }

    public HttpLoggingInterceptor(Logger logger) {
        AbstractC6492s.i(logger, "logger");
        this.logger = logger;
        this.headersToRedact = d0.e();
        this.level = Level.NONE;
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Logger.f56864b : logger);
    }
}

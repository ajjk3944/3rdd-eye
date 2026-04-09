package okhttp3;

import Zg.AbstractC3689v;
import Zg.d0;
import ej.C5481e;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.p;
import kotlin.text.t;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import org.snmp4j.util.SnmpConfigurator;
import sh.AbstractC7978m;
import sh.C7972g;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\"\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002JKBc\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b\u0004\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b\u0005\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010(R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0007¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001e\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00105R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b\f\u0010\u001aR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010+R\u0017\u0010=\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<R\u0011\u0010>\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b8\u0010\u001aR\u0011\u0010?\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b.\u0010\u001aR\u0011\u0010@\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b/\u0010\u001aR\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020\t8G¢\u0006\u0006\u001a\u0004\b1\u00107R\u0013\u0010B\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b4\u0010\u001aR\u0013\u0010D\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\bC\u0010\u001aR\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00020E8G¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0013\u0010I\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b-\u0010\u001a¨\u0006L"}, d2 = {"Lokhttp3/HttpUrl;", "", "", "scheme", "username", "password", "host", "", "port", "", "pathSegments", "queryNamesAndValues", "fragment", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/net/URL;", SnmpConfigurator.O_VERSION, "()Ljava/net/URL;", "Ljava/net/URI;", SnmpConfigurator.O_SECURITY_NAME, "()Ljava/net/URI;", "name", "q", "(Ljava/lang/String;)Ljava/util/List;", SnmpConfigurator.O_RETRIES, "()Ljava/lang/String;", "link", "s", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "Lokhttp3/HttpUrl$Builder;", "k", "()Lokhttp3/HttpUrl$Builder;", "l", "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_TIMEOUT, SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_COMMUNITY, "d", "i", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "I", SnmpConfigurator.O_CONTEXT_NAME, "f", "Ljava/util/List;", "m", "()Ljava/util/List;", "g", "h", "j", "Z", "()Z", "isHttps", "encodedUsername", "encodedPassword", "encodedPath", "encodedPathSegments", "encodedQuery", SnmpConfigurator.O_OPERATION, "query", "", "p", "()Ljava/util/Set;", "queryParameterNames", "encodedFragment", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HttpUrl {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: l, reason: collision with root package name */
    private static final char[] f56032l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String scheme;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String username;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String password;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String host;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int port;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List pathSegments;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List queryNamesAndValues;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String fragment;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean isHttps;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\b\r\u0018\u0000 \u00142\u00020\u0001:\u0001UB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001aJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010\u001aJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0007¢\u0006\u0004\b%\u0010\u001aJ\u0017\u0010'\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b'\u0010\u001aJ\u001f\u0010*\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b.\u0010+J\u000f\u0010/\u001a\u00020\u0000H\u0000¢\u0006\u0004\b/\u00100J\r\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0007H\u0016¢\u0006\u0004\b4\u00105J!\u00107\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u0001012\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b7\u00108R$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u00109\u001a\u0004\b:\u00105\"\u0004\b;\u0010<R\"\u0010?\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u00109\u001a\u0004\b=\u00105\"\u0004\b>\u0010<R\"\u0010B\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u00109\u001a\u0004\b@\u00105\"\u0004\bA\u0010<R$\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00109\u001a\u0004\bC\u00105\"\u0004\bD\u0010<R\"\u0010!\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010HR \u0010M\u001a\b\u0012\u0004\u0012\u00020\u00070I8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010J\u001a\u0004\bK\u0010LR,\u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010I8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010J\u001a\u0004\bN\u0010L\"\u0004\bO\u0010PR$\u0010T\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u00109\u001a\u0004\bR\u00105\"\u0004\bS\u0010<¨\u0006V"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "<init>", "()V", "", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()I", "", "input", "startPos", "limit", "LYg/J;", "q", "(Ljava/lang/String;II)V", "pos", "", "addTrailingSlash", "alreadyEncoded", SnmpConfigurator.O_OPERATION, "(Ljava/lang/String;IIZZ)V", "i", "(Ljava/lang/String;)Z", "j", "m", "scheme", SnmpConfigurator.O_RETRIES, "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "username", SnmpConfigurator.O_PRIV_PROTOCOL, "password", "l", "host", "h", "port", SnmpConfigurator.O_CONTEXT_NAME, "(I)Lokhttp3/HttpUrl$Builder;", "pathSegment", SnmpConfigurator.O_BIND_ADDRESS, "encodedQuery", "f", "name", "value", SnmpConfigurator.O_COMMUNITY, "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "encodedName", "encodedValue", SnmpConfigurator.O_AUTH_PROTOCOL, "p", "()Lokhttp3/HttpUrl$Builder;", "Lokhttp3/HttpUrl;", "d", "()Lokhttp3/HttpUrl;", "toString", "()Ljava/lang/String;", "base", "k", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "Ljava/lang/String;", "getScheme$okhttp", "x", "(Ljava/lang/String;)V", "getEncodedUsername$okhttp", SnmpConfigurator.O_SECURITY_NAME, "encodedUsername", "getEncodedPassword$okhttp", SnmpConfigurator.O_TIMEOUT, "encodedPassword", "getHost$okhttp", SnmpConfigurator.O_VERSION, "I", "getPort$okhttp", "w", "(I)V", "", "Ljava/util/List;", "g", "()Ljava/util/List;", "encodedPathSegments", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedQueryNamesAndValues", "getEncodedFragment$okhttp", "s", "encodedFragment", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String scheme;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String host;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final List encodedPathSegments;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private List encodedQueryNamesAndValues;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private String encodedFragment;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String encodedUsername = "";

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String encodedPassword = "";

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int port = -1;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "<init>", "()V", "", "input", "", "pos", "limit", "g", "(Ljava/lang/String;II)I", "h", "f", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "INVALID_HOST", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(String input, int pos, int limit) throws NumberFormatException {
                try {
                    int i10 = Integer.parseInt(Companion.b(HttpUrl.INSTANCE, input, pos, limit, "", false, false, false, false, null, 248, null));
                    if (1 > i10 || i10 >= 65536) {
                        return -1;
                    }
                    return i10;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int f(String input, int pos, int limit) {
                while (pos < limit) {
                    char cCharAt = input.charAt(pos);
                    if (cCharAt == '[') {
                        do {
                            pos++;
                            if (pos < limit) {
                            }
                        } while (input.charAt(pos) != ']');
                    } else if (cCharAt == ':') {
                        return pos;
                    }
                    pos++;
                }
                return limit;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int g(String input, int pos, int limit) {
                if (limit - pos < 2) {
                    return -1;
                }
                char cCharAt = input.charAt(pos);
                if ((AbstractC6492s.k(cCharAt, 97) < 0 || AbstractC6492s.k(cCharAt, 122) > 0) && (AbstractC6492s.k(cCharAt, 65) < 0 || AbstractC6492s.k(cCharAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    pos++;
                    if (pos >= limit) {
                        return -1;
                    }
                    char cCharAt2 = input.charAt(pos);
                    if ('a' > cCharAt2 || cCharAt2 >= '{') {
                        if ('A' > cCharAt2 || cCharAt2 >= '[') {
                            if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return pos;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int h(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i12++;
                    i10++;
                }
                return i12;
            }

            private Companion() {
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int e() {
            int i10 = this.port;
            if (i10 != -1) {
                return i10;
            }
            Companion companion = HttpUrl.INSTANCE;
            String str = this.scheme;
            AbstractC6492s.f(str);
            return companion.c(str);
        }

        private final boolean i(String input) {
            return AbstractC6492s.d(input, ".") || t.C(input, "%2e", true);
        }

        private final boolean j(String input) {
            return AbstractC6492s.d(input, "..") || t.C(input, "%2e.", true) || t.C(input, ".%2e", true) || t.C(input, "%2e%2e", true);
        }

        private final void m() {
            if (((String) this.encodedPathSegments.remove(r0.size() - 1)).length() != 0 || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            } else {
                this.encodedPathSegments.set(r0.size() - 1, "");
            }
        }

        private final void o(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String strB = Companion.b(HttpUrl.INSTANCE, input, pos, limit, " \"<>^`{}|/\\?#", alreadyEncoded, false, false, false, null, 240, null);
            if (i(strB)) {
                return;
            }
            if (j(strB)) {
                m();
                return;
            }
            if (((CharSequence) this.encodedPathSegments.get(r2.size() - 1)).length() == 0) {
                this.encodedPathSegments.set(r2.size() - 1, strB);
            } else {
                this.encodedPathSegments.add(strB);
            }
            if (addTrailingSlash) {
                this.encodedPathSegments.add("");
            }
        }

        private final void q(String input, int startPos, int limit) {
            if (startPos == limit) {
                return;
            }
            char cCharAt = input.charAt(startPos);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                startPos++;
            } else {
                List list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i10 = startPos;
                while (i10 < limit) {
                    startPos = Util.q(input, "/\\", i10, limit);
                    boolean z10 = startPos < limit;
                    o(input, i10, startPos, z10, true);
                    if (z10) {
                        i10 = startPos + 1;
                    }
                }
                return;
            }
        }

        public final Builder a(String encodedName, String encodedValue) {
            AbstractC6492s.i(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List list = this.encodedQueryNamesAndValues;
            AbstractC6492s.f(list);
            Companion companion = HttpUrl.INSTANCE;
            list.add(Companion.b(companion, encodedName, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            List list2 = this.encodedQueryNamesAndValues;
            AbstractC6492s.f(list2);
            list2.add(encodedValue != null ? Companion.b(companion, encodedValue, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null) : null);
            return this;
        }

        public final Builder b(String pathSegment) {
            AbstractC6492s.i(pathSegment, "pathSegment");
            o(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        public final Builder c(String name, String value) {
            AbstractC6492s.i(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List list = this.encodedQueryNamesAndValues;
            AbstractC6492s.f(list);
            Companion companion = HttpUrl.INSTANCE;
            list.add(Companion.b(companion, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            List list2 = this.encodedQueryNamesAndValues;
            AbstractC6492s.f(list2);
            list2.add(value != null ? Companion.b(companion, value, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null) : null);
            return this;
        }

        public final HttpUrl d() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.INSTANCE;
            String strH = Companion.h(companion, this.encodedUsername, 0, 0, false, 7, null);
            String strH2 = Companion.h(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iE = e();
            List list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.h(HttpUrl.INSTANCE, (String) it.next(), 0, 0, false, 7, null));
            }
            List list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                List<String> list3 = list2;
                arrayList = new ArrayList(AbstractC3689v.w(list3, 10));
                for (String str3 : list3) {
                    arrayList.add(str3 != null ? Companion.h(HttpUrl.INSTANCE, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, strH, strH2, str2, iE, arrayList2, arrayList, str4 != null ? Companion.h(HttpUrl.INSTANCE, str4, 0, 0, false, 7, null) : null, toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.HttpUrl.Builder f(java.lang.String r14) {
            /*
                r13 = this;
                if (r14 == 0) goto L1d
                okhttp3.HttpUrl$Companion r12 = okhttp3.HttpUrl.INSTANCE
                r10 = 211(0xd3, float:2.96E-43)
                r11 = 0
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"'<>#"
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r0 = r12
                r1 = r14
                java.lang.String r14 = okhttp3.HttpUrl.Companion.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L1d
                java.util.List r14 = r12.j(r14)
                goto L1e
            L1d:
                r14 = 0
            L1e:
                r13.encodedQueryNamesAndValues = r14
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.f(java.lang.String):okhttp3.HttpUrl$Builder");
        }

        /* renamed from: g, reason: from getter */
        public final List getEncodedPathSegments() {
            return this.encodedPathSegments;
        }

        public final Builder h(String host) {
            AbstractC6492s.i(host, "host");
            String strE = HostnamesKt.e(Companion.h(HttpUrl.INSTANCE, host, 0, 0, false, 7, null));
            if (strE != null) {
                this.host = strE;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final Builder k(HttpUrl base, String input) throws NumberFormatException {
            int iQ;
            int i10;
            int i11;
            boolean z10;
            int i12;
            boolean z11;
            String input2 = input;
            AbstractC6492s.i(input2, "input");
            int iA = Util.A(input2, 0, 0, 3, null);
            int iC = Util.C(input2, iA, 0, 2, null);
            Companion companion = INSTANCE;
            int iG = companion.g(input2, iA, iC);
            boolean z12 = true;
            char c10 = 65535;
            if (iG != -1) {
                if (t.M(input2, "https:", iA, true)) {
                    this.scheme = "https";
                    iA += 6;
                } else {
                    if (!t.M(input2, "http:", iA, true)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input2.substring(0, iG);
                        AbstractC6492s.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.scheme = "http";
                    iA += 5;
                }
            } else {
                if (base == null) {
                    if (input.length() > 6) {
                        input2 = t.x1(input2, 6) + "...";
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + input2);
                }
                this.scheme = base.getScheme();
            }
            int iH = companion.h(input2, iA, iC);
            char c11 = '?';
            char c12 = '#';
            if (iH >= 2 || base == null || !AbstractC6492s.d(base.getScheme(), this.scheme)) {
                boolean z13 = false;
                boolean z14 = false;
                int i13 = iA + iH;
                while (true) {
                    iQ = Util.q(input2, "@/\\?#", i13, iC);
                    char cCharAt = iQ != iC ? input2.charAt(iQ) : c10;
                    if (cCharAt == c10 || cCharAt == c12 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c11) {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (z13) {
                            i11 = iQ;
                            z10 = z12;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.encodedPassword);
                            sb3.append("%40");
                            i12 = iC;
                            sb3.append(Companion.b(HttpUrl.INSTANCE, input, i13, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb3.toString();
                        } else {
                            int iP = Util.p(input2, ':', i13, iQ);
                            Companion companion2 = HttpUrl.INSTANCE;
                            z10 = z12;
                            String strB = Companion.b(companion2, input, i13, iP, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z14) {
                                strB = this.encodedUsername + "%40" + strB;
                            }
                            this.encodedUsername = strB;
                            if (iP != iQ) {
                                i11 = iQ;
                                this.encodedPassword = Companion.b(companion2, input, iP + 1, iQ, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z11 = z10;
                            } else {
                                i11 = iQ;
                                z11 = z13;
                            }
                            z13 = z11;
                            i12 = iC;
                            z14 = z10;
                        }
                        i13 = i11 + 1;
                        z12 = z10;
                        iC = i12;
                        c12 = '#';
                        c11 = '?';
                        c10 = 65535;
                    }
                }
                i10 = iC;
                Companion companion3 = INSTANCE;
                int iF = companion3.f(input2, i13, iQ);
                int i14 = iF + 1;
                if (i14 < iQ) {
                    this.host = HostnamesKt.e(Companion.h(HttpUrl.INSTANCE, input, i13, iF, false, 4, null));
                    int iE = companion3.e(input2, i14, iQ);
                    this.port = iE;
                    if (iE == -1) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String strSubstring2 = input2.substring(i14, iQ);
                        AbstractC6492s.h(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb4.append(strSubstring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    Companion companion4 = HttpUrl.INSTANCE;
                    this.host = HostnamesKt.e(Companion.h(companion4, input, i13, iF, false, 4, null));
                    String str = this.scheme;
                    AbstractC6492s.f(str);
                    this.port = companion4.c(str);
                }
                if (this.host == null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String strSubstring3 = input2.substring(i13, iF);
                    AbstractC6492s.h(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb5.append(strSubstring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iA = iQ;
            } else {
                this.encodedUsername = base.g();
                this.encodedPassword = base.c();
                this.host = base.getHost();
                this.port = base.getPort();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.e());
                if (iA == iC || input2.charAt(iA) == '#') {
                    f(base.f());
                }
                i10 = iC;
            }
            int i15 = i10;
            int iQ2 = Util.q(input2, "?#", iA, i15);
            q(input2, iA, iQ2);
            if (iQ2 < i15 && input2.charAt(iQ2) == '?') {
                int iP2 = Util.p(input2, '#', iQ2, i15);
                Companion companion5 = HttpUrl.INSTANCE;
                this.encodedQueryNamesAndValues = companion5.j(Companion.b(companion5, input, iQ2 + 1, iP2, " \"'<>#", true, false, true, false, null, 208, null));
                iQ2 = iP2;
            }
            if (iQ2 < i15 && input2.charAt(iQ2) == '#') {
                this.encodedFragment = Companion.b(HttpUrl.INSTANCE, input, iQ2 + 1, i15, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder l(String password) {
            AbstractC6492s.i(password, "password");
            this.encodedPassword = Companion.b(HttpUrl.INSTANCE, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final Builder n(int port) {
            if (1 <= port && port < 65536) {
                this.port = port;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + port).toString());
        }

        public final Builder p() {
            String str = this.host;
            this.host = str != null ? new p("[\"<>^`{|}]").n(str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i10 = 0; i10 < size; i10++) {
                List list = this.encodedPathSegments;
                list.set(i10, Companion.b(HttpUrl.INSTANCE, (String) list.get(i10), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = (String) list2.get(i11);
                    list2.set(i11, str2 != null ? Companion.b(HttpUrl.INSTANCE, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.b(HttpUrl.INSTANCE, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final Builder r(String scheme) {
            AbstractC6492s.i(scheme, "scheme");
            if (t.C(scheme, "http", true)) {
                this.scheme = "http";
            } else {
                if (!t.C(scheme, "https", true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
                this.scheme = "https";
            }
            return this;
        }

        public final void s(String str) {
            this.encodedFragment = str;
        }

        public final void t(String str) {
            AbstractC6492s.i(str, "<set-?>");
            this.encodedPassword = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.encodedUsername
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L69
                kotlin.jvm.internal.AbstractC6492s.f(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = kotlin.text.t.V(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L64
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L69
            L64:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L69:
                int r1 = r6.port
                r3 = -1
                if (r1 != r3) goto L72
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L8b
            L72:
                int r1 = r6.e()
                java.lang.String r3 = r6.scheme
                if (r3 == 0) goto L85
                okhttp3.HttpUrl$Companion r4 = okhttp3.HttpUrl.INSTANCE
                kotlin.jvm.internal.AbstractC6492s.f(r3)
                int r3 = r4.c(r3)
                if (r1 == r3) goto L8b
            L85:
                r0.append(r2)
                r0.append(r1)
            L8b:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.INSTANCE
                java.util.List r2 = r6.encodedPathSegments
                r1.i(r2, r0)
                java.util.List r2 = r6.encodedQueryNamesAndValues
                if (r2 == 0) goto La3
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.encodedQueryNamesAndValues
                kotlin.jvm.internal.AbstractC6492s.f(r2)
                r1.k(r2, r0)
            La3:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto Lb1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            Lb1:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.AbstractC6492s.h(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final void u(String str) {
            AbstractC6492s.i(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void v(String str) {
            this.host = str;
        }

        public final void w(int i10) {
            this.port = i10;
        }

        public final void x(String str) {
            this.scheme = str;
        }

        public final Builder y(String username) {
            AbstractC6492s.i(username, "username");
            this.encodedUsername = Companion.b(HttpUrl.INSTANCE, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0019\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\n*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J]\u0010\u0018\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010!\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00050\u001d2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0000¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u00020\f*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001d2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0000¢\u0006\u0004\b#\u0010\"J\u001b\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050$*\u00020\u0005H\u0000¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020'*\u00020\u0005H\u0007¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u0004\u0018\u00010'*\u00020\u0005H\u0007¢\u0006\u0004\b*\u0010)J1\u0010+\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b+\u0010,Jc\u0010-\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u00100R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u00100R\u0014\u00107\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u00100R\u0014\u00108\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u00100R\u0014\u00109\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b9\u00100R\u0014\u0010:\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u00100R\u0014\u0010;\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u00100R\u0014\u0010<\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u00100R\u0014\u0010=\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b=\u00100¨\u0006>"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "<init>", "()V", "Lej/e;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "LYg/J;", "m", "(Lej/e;Ljava/lang/String;IIZ)V", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Ljava/lang/String;II)Z", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "l", "(Lej/e;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "scheme", SnmpConfigurator.O_COMMUNITY, "(Ljava/lang/String;)I", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "i", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "k", "", "j", "(Ljava/lang/String;)Ljava/util/List;", "Lokhttp3/HttpUrl;", "d", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "f", "g", "(Ljava/lang/String;IIZ)Ljava/lang/String;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String b(Companion companion, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            return companion.a(str, (i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? str.length() : i11, str2, (i12 & 8) != 0 ? false : z10, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? null : charset);
        }

        private final boolean e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && Util.I(str.charAt(i10 + 1)) != -1 && Util.I(str.charAt(i12)) != -1;
        }

        public static /* synthetic */ String h(Companion companion, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return companion.g(str, i10, i11, z10);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0093 A[LOOP:1: B:50:0x008d->B:52:0x0093, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void l(ej.C5481e r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) throws java.io.EOFException {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lbc
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L28
                r8 = 9
                if (r7 == r8) goto L23
                r8 = 10
                if (r7 == r8) goto L23
                r8 = 12
                if (r7 == r8) goto L23
                r8 = 13
                if (r7 != r8) goto L28
            L23:
                r8 = r14
                r12 = r19
                goto Lb5
            L28:
                r8 = 43
                if (r7 != r8) goto L39
                if (r22 == 0) goto L39
                if (r20 == 0) goto L33
                java.lang.String r8 = "+"
                goto L35
            L33:
                java.lang.String r8 = "%2B"
            L35:
                r15.F(r8)
                goto L23
            L39:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L4a
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L4a
                r8 = 128(0x80, float:1.8E-43)
                if (r7 < r8) goto L4e
                if (r23 == 0) goto L4a
                goto L4e
            L4a:
                r8 = r14
                r12 = r19
                goto L6f
            L4e:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = kotlin.text.t.V(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L69
                if (r7 != r9) goto L67
                if (r20 == 0) goto L69
                if (r21 == 0) goto L67
                r8 = r14
                boolean r10 = r14.e(r1, r5, r2)
                if (r10 != 0) goto L6b
                goto L6f
            L67:
                r8 = r14
                goto L6b
            L69:
                r8 = r14
                goto L6f
            L6b:
                r15.U0(r7)
                goto Lb5
            L6f:
                if (r6 != 0) goto L76
                ej.e r6 = new ej.e
                r6.<init>()
            L76:
                if (r3 == 0) goto L8a
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.AbstractC6492s.d(r3, r10)
                if (r10 == 0) goto L81
                goto L8a
            L81:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.R0(r1, r5, r10, r3)
                goto L8d
            L8a:
                r6.U0(r7)
            L8d:
                boolean r10 = r6.t()
                if (r10 != 0) goto Lb5
                byte r10 = r6.readByte()
                r11 = r10 & 255(0xff, float:3.57E-43)
                r15.u(r9)
                char[] r13 = okhttp3.HttpUrl.a()
                int r11 = r11 >> 4
                r11 = r11 & 15
                char r11 = r13[r11]
                r15.u(r11)
                char[] r11 = okhttp3.HttpUrl.a()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.u(r10)
                goto L8d
            Lb5:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lbc:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.l(ej.e, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void m(C5481e c5481e, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                int iCodePointAt = str.codePointAt(i10);
                if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int I10 = Util.I(str.charAt(i10 + 1));
                    int I11 = Util.I(str.charAt(i12));
                    if (I10 == -1 || I11 == -1) {
                        c5481e.U0(iCodePointAt);
                        i10 += Character.charCount(iCodePointAt);
                    } else {
                        c5481e.u((I10 << 4) + I11);
                        i10 = Character.charCount(iCodePointAt) + i12;
                    }
                } else if (iCodePointAt == 43 && z10) {
                    c5481e.u(32);
                    i10++;
                } else {
                    c5481e.U0(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String a(java.lang.String r14, int r15, int r16, java.lang.String r17, boolean r18, boolean r19, boolean r20, boolean r21, java.nio.charset.Charset r22) throws java.io.EOFException {
            /*
                r13 = this;
                r2 = r14
                r4 = r16
                r5 = r17
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.AbstractC6492s.i(r14, r0)
                java.lang.String r0 = "encodeSet"
                kotlin.jvm.internal.AbstractC6492s.i(r5, r0)
                r3 = r15
            L10:
                if (r3 >= r4) goto L71
                int r0 = r14.codePointAt(r3)
                r1 = 32
                if (r0 < r1) goto L25
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == r1) goto L25
                r1 = 128(0x80, float:1.8E-43)
                if (r0 < r1) goto L27
                if (r21 == 0) goto L25
                goto L27
            L25:
                r11 = r13
                goto L4f
            L27:
                char r1 = (char) r0
                r6 = 2
                r7 = 0
                r8 = 0
                boolean r1 = kotlin.text.t.V(r5, r1, r8, r6, r7)
                if (r1 != 0) goto L25
                r1 = 37
                if (r0 != r1) goto L41
                if (r18 == 0) goto L25
                if (r19 == 0) goto L41
                r11 = r13
                boolean r1 = r13.e(r14, r3, r4)
                if (r1 == 0) goto L4f
                goto L42
            L41:
                r11 = r13
            L42:
                r1 = 43
                if (r0 != r1) goto L49
                if (r20 == 0) goto L49
                goto L4f
            L49:
                int r0 = java.lang.Character.charCount(r0)
                int r3 = r3 + r0
                goto L10
            L4f:
                ej.e r12 = new ej.e
                r12.<init>()
                r0 = r15
                r12.H(r14, r15, r3)
                r0 = r13
                r1 = r12
                r2 = r14
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r10 = r22
                r0.l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r0 = r12.z0()
                return r0
            L71:
                r11 = r13
                r0 = r15
                java.lang.String r0 = r14.substring(r15, r16)
                java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.AbstractC6492s.h(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.a(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):java.lang.String");
        }

        public final int c(String scheme) {
            AbstractC6492s.i(scheme, "scheme");
            if (AbstractC6492s.d(scheme, "http")) {
                return 80;
            }
            return AbstractC6492s.d(scheme, "https") ? 443 : -1;
        }

        public final HttpUrl d(String str) {
            AbstractC6492s.i(str, "<this>");
            return new Builder().k(null, str).d();
        }

        public final HttpUrl f(String str) {
            AbstractC6492s.i(str, "<this>");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String g(String str, int i10, int i11, boolean z10) {
            AbstractC6492s.i(str, "<this>");
            for (int i12 = i10; i12 < i11; i12++) {
                char cCharAt = str.charAt(i12);
                if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                    C5481e c5481e = new C5481e();
                    c5481e.H(str, i10, i12);
                    m(c5481e, str, i12, i11, z10);
                    return c5481e.z0();
                }
            }
            String strSubstring = str.substring(i10, i11);
            AbstractC6492s.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void i(List list, StringBuilder out) {
            AbstractC6492s.i(list, "<this>");
            AbstractC6492s.i(out, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                out.append('/');
                out.append((String) list.get(i10));
            }
        }

        public final List j(String str) {
            AbstractC6492s.i(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int iJ0 = t.j0(str, '&', i10, false, 4, null);
                if (iJ0 == -1) {
                    iJ0 = str.length();
                }
                int i11 = iJ0;
                int iJ02 = t.j0(str, '=', i10, false, 4, null);
                if (iJ02 == -1 || iJ02 > i11) {
                    String strSubstring = str.substring(i10, i11);
                    AbstractC6492s.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i10, iJ02);
                    AbstractC6492s.h(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iJ02 + 1, i11);
                    AbstractC6492s.h(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i10 = i11 + 1;
            }
            return arrayList;
        }

        public final void k(List list, StringBuilder out) {
            AbstractC6492s.i(list, "<this>");
            AbstractC6492s.i(out, "out");
            C7972g c7972gR = AbstractC7978m.r(AbstractC7978m.s(0, list.size()), 2);
            int i10 = c7972gR.i();
            int iJ = c7972gR.j();
            int iK = c7972gR.k();
            if ((iK <= 0 || i10 > iJ) && (iK >= 0 || iJ > i10)) {
                return;
            }
            while (true) {
                String str = (String) list.get(i10);
                String str2 = (String) list.get(i10 + 1);
                if (i10 > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (i10 == iJ) {
                    return;
                } else {
                    i10 += iK;
                }
            }
        }

        private Companion() {
        }
    }

    public HttpUrl(String scheme, String username, String password, String host, int i10, List pathSegments, List list, String str, String url) {
        AbstractC6492s.i(scheme, "scheme");
        AbstractC6492s.i(username, "username");
        AbstractC6492s.i(password, "password");
        AbstractC6492s.i(host, "host");
        AbstractC6492s.i(pathSegments, "pathSegments");
        AbstractC6492s.i(url, "url");
        this.scheme = scheme;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = i10;
        this.pathSegments = pathSegments;
        this.queryNamesAndValues = list;
        this.fragment = str;
        this.url = url;
        this.isHttps = AbstractC6492s.d(scheme, "https");
    }

    public static final HttpUrl h(String str) {
        return INSTANCE.d(str);
    }

    public final String b() {
        if (this.fragment == null) {
            return null;
        }
        String strSubstring = this.url.substring(t.j0(this.url, '#', 0, false, 6, null) + 1);
        AbstractC6492s.h(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String c() {
        if (this.password.length() == 0) {
            return "";
        }
        String strSubstring = this.url.substring(t.j0(this.url, ':', this.scheme.length() + 3, false, 4, null) + 1, t.j0(this.url, '@', 0, false, 6, null));
        AbstractC6492s.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String d() {
        int iJ0 = t.j0(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        String strSubstring = this.url.substring(iJ0, Util.q(str, "?#", iJ0, str.length()));
        AbstractC6492s.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List e() {
        int iJ0 = t.j0(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int iQ = Util.q(str, "?#", iJ0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iJ0 < iQ) {
            int i10 = iJ0 + 1;
            int iP = Util.p(this.url, '/', i10, iQ);
            String strSubstring = this.url.substring(i10, iP);
            AbstractC6492s.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iJ0 = iP;
        }
        return arrayList;
    }

    public boolean equals(Object other) {
        return (other instanceof HttpUrl) && AbstractC6492s.d(((HttpUrl) other).url, this.url);
    }

    public final String f() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iJ0 = t.j0(this.url, '?', 0, false, 6, null) + 1;
        String str = this.url;
        String strSubstring = this.url.substring(iJ0, Util.p(str, '#', iJ0, str.length()));
        AbstractC6492s.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String g() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String strSubstring = this.url.substring(length, Util.q(str, ":@", length, str.length()));
        AbstractC6492s.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsHttps() {
        return this.isHttps;
    }

    public final Builder k() {
        Builder builder = new Builder();
        builder.x(this.scheme);
        builder.u(g());
        builder.t(c());
        builder.v(this.host);
        builder.w(this.port != INSTANCE.c(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments().clear();
        builder.getEncodedPathSegments().addAll(e());
        builder.f(f());
        builder.s(b());
        return builder;
    }

    public final Builder l(String link) {
        AbstractC6492s.i(link, "link");
        try {
            return new Builder().k(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: m, reason: from getter */
    public final List getPathSegments() {
        return this.pathSegments;
    }

    /* renamed from: n, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    public final String o() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        INSTANCE.k(this.queryNamesAndValues, sb2);
        return sb2.toString();
    }

    public final Set p() {
        if (this.queryNamesAndValues == null) {
            return d0.e();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C7972g c7972gR = AbstractC7978m.r(AbstractC7978m.s(0, this.queryNamesAndValues.size()), 2);
        int i10 = c7972gR.i();
        int iJ = c7972gR.j();
        int iK = c7972gR.k();
        if ((iK > 0 && i10 <= iJ) || (iK < 0 && iJ <= i10)) {
            while (true) {
                Object obj = this.queryNamesAndValues.get(i10);
                AbstractC6492s.f(obj);
                linkedHashSet.add(obj);
                if (i10 == iJ) {
                    break;
                }
                i10 += iK;
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        AbstractC6492s.h(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final List q(String name) {
        AbstractC6492s.i(name, "name");
        if (this.queryNamesAndValues == null) {
            return AbstractC3689v.l();
        }
        ArrayList arrayList = new ArrayList();
        C7972g c7972gR = AbstractC7978m.r(AbstractC7978m.s(0, this.queryNamesAndValues.size()), 2);
        int i10 = c7972gR.i();
        int iJ = c7972gR.j();
        int iK = c7972gR.k();
        if ((iK > 0 && i10 <= iJ) || (iK < 0 && iJ <= i10)) {
            while (true) {
                if (AbstractC6492s.d(name, this.queryNamesAndValues.get(i10))) {
                    arrayList.add(this.queryNamesAndValues.get(i10 + 1));
                }
                if (i10 == iJ) {
                    break;
                }
                i10 += iK;
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        AbstractC6492s.h(listUnmodifiableList, "unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public final String r() {
        Builder builderL = l("/...");
        AbstractC6492s.f(builderL);
        return builderL.y("").l("").d().getUrl();
    }

    public final HttpUrl s(String link) {
        AbstractC6492s.i(link, "link");
        Builder builderL = l(link);
        if (builderL != null) {
            return builderL.d();
        }
        return null;
    }

    /* renamed from: t, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    /* renamed from: toString, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    public final URI u() {
        String string = k().p().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new p("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").n(string, ""));
                AbstractC6492s.h(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL v() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }
}

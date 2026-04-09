package okhttp3.internal.cache;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy;", "", "Lokhttp3/Request;", "networkRequest", "Lokhttp3/Response;", "cacheResponse", "<init>", "(Lokhttp3/Request;Lokhttp3/Response;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Lokhttp3/Request;", SnmpConfigurator.O_BIND_ADDRESS, "()Lokhttp3/Request;", "Lokhttp3/Response;", "()Lokhttp3/Response;", SnmpConfigurator.O_COMMUNITY, "Companion", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CacheStrategy {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Request networkRequest;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Response cacheResponse;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Companion;", "", "<init>", "()V", "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "request", "", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/Response;Lokhttp3/Request;)Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(okhttp3.Response r5, okhttp3.Request r6) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.AbstractC6492s.i(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.AbstractC6492s.i(r6, r0)
                int r0 = r5.getCode()
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 0
                if (r0 == r1) goto L65
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L65
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L65
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L65
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L65
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L65
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L3b
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L65
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L65
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L65
                switch(r0) {
                    case 300: goto L65;
                    case 301: goto L65;
                    case 302: goto L3b;
                    default: goto L3a;
                }
            L3a:
                return r2
            L3b:
                java.lang.String r0 = "Expires"
                r1 = 2
                r3 = 0
                java.lang.String r0 = okhttp3.Response.C(r5, r0, r3, r1, r3)
                if (r0 != 0) goto L65
                okhttp3.CacheControl r0 = r5.g()
                int r0 = r0.getMaxAgeSeconds()
                r1 = -1
                if (r0 != r1) goto L65
                okhttp3.CacheControl r0 = r5.g()
                boolean r0 = r0.getIsPublic()
                if (r0 != 0) goto L65
                okhttp3.CacheControl r0 = r5.g()
                boolean r0 = r0.getIsPrivate()
                if (r0 != 0) goto L65
                return r2
            L65:
                okhttp3.CacheControl r5 = r5.g()
                boolean r5 = r5.getNoStore()
                if (r5 != 0) goto L7a
                okhttp3.CacheControl r5 = r6.b()
                boolean r5 = r5.getNoStore()
                if (r5 != 0) goto L7a
                r2 = 1
            L7a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.CacheStrategy.Companion.a(okhttp3.Response, okhttp3.Request):boolean");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0018\u0010#\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0018\u0010%\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0016R\u0016\u0010)\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0016R\u0018\u0010+\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Factory;", "", "", "nowMillis", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "cacheResponse", "<init>", "(JLokhttp3/Request;Lokhttp3/Response;)V", "", "f", "()Z", "Lokhttp3/internal/cache/CacheStrategy;", SnmpConfigurator.O_COMMUNITY, "()Lokhttp3/internal/cache/CacheStrategy;", "d", "()J", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Lokhttp3/Request;)Z", SnmpConfigurator.O_BIND_ADDRESS, "J", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "Lokhttp3/Response;", "Ljava/util/Date;", "Ljava/util/Date;", "servedDate", "", "Ljava/lang/String;", "servedDateString", "lastModified", "g", "lastModifiedString", "h", "expires", "i", "sentRequestMillis", "j", "receivedResponseMillis", "k", "etag", "", "l", "I", "ageSeconds", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Factory {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long nowMillis;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Request request;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Response cacheResponse;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Date servedDate;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private String servedDateString;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Date lastModified;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private String lastModifiedString;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Date expires;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private long sentRequestMillis;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private long receivedResponseMillis;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private String etag;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private int ageSeconds;

        public Factory(long j10, Request request, Response response) {
            AbstractC6492s.i(request, "request");
            this.nowMillis = j10;
            this.request = request;
            this.cacheResponse = response;
            this.ageSeconds = -1;
            if (response != null) {
                this.sentRequestMillis = response.getSentRequestAtMillis();
                this.receivedResponseMillis = response.getReceivedResponseAtMillis();
                Headers headers = response.getHeaders();
                int size = headers.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strE = headers.e(i10);
                    String strJ = headers.j(i10);
                    if (t.C(strE, "Date", true)) {
                        this.servedDate = DatesKt.a(strJ);
                        this.servedDateString = strJ;
                    } else if (t.C(strE, "Expires", true)) {
                        this.expires = DatesKt.a(strJ);
                    } else if (t.C(strE, "Last-Modified", true)) {
                        this.lastModified = DatesKt.a(strJ);
                        this.lastModifiedString = strJ;
                    } else if (t.C(strE, "ETag", true)) {
                        this.etag = strJ;
                    } else if (t.C(strE, "Age", true)) {
                        this.ageSeconds = Util.Y(strJ, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.servedDate;
            long jMax = date != null ? Math.max(0L, this.receivedResponseMillis - date.getTime()) : 0L;
            int i10 = this.ageSeconds;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.receivedResponseMillis;
            return jMax + (j10 - this.sentRequestMillis) + (this.nowMillis - j10);
        }

        private final CacheStrategy c() {
            String str;
            if (this.cacheResponse == null) {
                return new CacheStrategy(this.request, null);
            }
            if ((!this.request.g() || this.cacheResponse.getHandshake() != null) && CacheStrategy.INSTANCE.a(this.cacheResponse, this.request)) {
                CacheControl cacheControlB = this.request.b();
                if (cacheControlB.getNoCache() || e(this.request)) {
                    return new CacheStrategy(this.request, null);
                }
                CacheControl cacheControlG = this.cacheResponse.g();
                long jA = a();
                long jD = d();
                if (cacheControlB.getMaxAgeSeconds() != -1) {
                    jD = Math.min(jD, TimeUnit.SECONDS.toMillis(cacheControlB.getMaxAgeSeconds()));
                }
                long millis = 0;
                long millis2 = cacheControlB.getMinFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(cacheControlB.getMinFreshSeconds()) : 0L;
                if (!cacheControlG.getMustRevalidate() && cacheControlB.getMaxStaleSeconds() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(cacheControlB.getMaxStaleSeconds());
                }
                if (!cacheControlG.getNoCache()) {
                    long j10 = millis2 + jA;
                    if (j10 < millis + jD) {
                        Response.Builder builderY = this.cacheResponse.Y();
                        if (j10 >= jD) {
                            builderY.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jA > 86400000 && f()) {
                            builderY.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new CacheStrategy(null, builderY.c());
                    }
                }
                String str2 = this.etag;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.lastModified != null) {
                        str2 = this.lastModifiedString;
                    } else {
                        if (this.servedDate == null) {
                            return new CacheStrategy(this.request, null);
                        }
                        str2 = this.servedDateString;
                    }
                    str = "If-Modified-Since";
                }
                Headers.Builder builderG = this.request.getHeaders().g();
                AbstractC6492s.f(str2);
                builderG.d(str, str2);
                return new CacheStrategy(this.request.i().d(builderG.f()).b(), this.cacheResponse);
            }
            return new CacheStrategy(this.request, null);
        }

        private final long d() {
            Response response = this.cacheResponse;
            AbstractC6492s.f(response);
            if (response.g().getMaxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.getMaxAgeSeconds());
            }
            Date date = this.expires;
            if (date != null) {
                Date date2 = this.servedDate;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.receivedResponseMillis);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.lastModified == null || this.cacheResponse.getRequest().getUrl().o() != null) {
                return 0L;
            }
            Date date3 = this.servedDate;
            long time2 = date3 != null ? date3.getTime() : this.sentRequestMillis;
            Date date4 = this.lastModified;
            AbstractC6492s.f(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / 10;
            }
            return 0L;
        }

        private final boolean e(Request request) {
            return (request.d("If-Modified-Since") == null && request.d("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            Response response = this.cacheResponse;
            AbstractC6492s.f(response);
            return response.g().getMaxAgeSeconds() == -1 && this.expires == null;
        }

        public final CacheStrategy b() {
            CacheStrategy cacheStrategyC = c();
            return (cacheStrategyC.getNetworkRequest() == null || !this.request.b().getOnlyIfCached()) ? cacheStrategyC : new CacheStrategy(null, null);
        }
    }

    public CacheStrategy(Request request, Response response) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }

    /* renamed from: a, reason: from getter */
    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    /* renamed from: b, reason: from getter */
    public final Request getNetworkRequest() {
        return this.networkRequest;
    }
}

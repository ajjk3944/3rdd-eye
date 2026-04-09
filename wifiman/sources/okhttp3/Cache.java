package okhttp3;

import Yg.J;
import Zg.AbstractC3689v;
import Zg.d0;
import ej.C5481e;
import ej.InterfaceC5474B;
import ej.InterfaceC5476D;
import ej.InterfaceC5482f;
import ej.InterfaceC5483g;
import ej.h;
import ej.j;
import ej.k;
import ej.p;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import jh.AbstractC6329b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import kotlin.text.t;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u00046789J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0018\u00010\u0003R\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001f\u0010\u0019R\u001a\u0010#\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\u0016\u00101\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010&R\u0016\u00103\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010&R\u0016\u00105\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010&¨\u0006:"}, d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "g", "(Lokhttp3/Request;)Lokhttp3/Response;", "response", "Lokhttp3/internal/cache/CacheRequest;", "p", "(Lokhttp3/Response;)Lokhttp3/internal/cache/CacheRequest;", "s", "(Lokhttp3/Request;)V", "cached", "network", "P", "(Lokhttp3/Response;Lokhttp3/Response;)V", "flush", "()V", "close", "Lokhttp3/internal/cache/CacheStrategy;", "cacheStrategy", "J", "(Lokhttp3/internal/cache/CacheStrategy;)V", "C", "Lokhttp3/internal/cache/DiskLruCache;", "getCache$okhttp", "()Lokhttp3/internal/cache/DiskLruCache;", "cache", "", SnmpConfigurator.O_BIND_ADDRESS, "I", "j", "()I", SnmpConfigurator.O_PRIV_PROTOCOL, "(I)V", "writeSuccessCount", SnmpConfigurator.O_COMMUNITY, "h", SnmpConfigurator.O_VERSION, "writeAbortCount", "d", "networkCount", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "hitCount", "f", "requestCount", "CacheResponseBody", "Companion", "Entry", "RealCacheRequest", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Cache implements Closeable, Flushable {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final DiskLruCache cache;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int writeSuccessCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int writeAbortCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int networkCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int hitCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int requestCount;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot", "", "contentType", "contentLength", "<init>", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V", "Lokhttp3/MediaType;", "s", "()Lokhttp3/MediaType;", "", "p", "()J", "Lej/g;", SnmpConfigurator.O_PRIV_PROTOCOL, "()Lej/g;", SnmpConfigurator.O_COMMUNITY, "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "J", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "d", "Ljava/lang/String;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "f", "Lej/g;", "bodySource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class CacheResponseBody extends ResponseBody {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final DiskLruCache.Snapshot snapshot;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String contentType;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String contentLength;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5483g bodySource;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            AbstractC6492s.i(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = p.d(new k(snapshot.g(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // ej.k, ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    this.getSnapshot().close();
                    super.close();
                }
            });
        }

        /* renamed from: J, reason: from getter */
        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: p */
        public long getContentLength() {
            String str = this.contentLength;
            if (str != null) {
                return Util.X(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: s */
        public MediaType getF56210c() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.INSTANCE.b(str);
            }
            return null;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: y, reason: from getter */
        public InterfaceC5483g getSource() {
            return this.bodySource;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u00020\u001b*\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u00020\u0004*\u00020\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010#¨\u0006'"}, d2 = {"Lokhttp3/Cache$Companion;", "", "<init>", "()V", "Lokhttp3/Headers;", "", "", "d", "(Lokhttp3/Headers;)Ljava/util/Set;", "requestHeaders", "responseHeaders", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Lokhttp3/Headers;Lokhttp3/Headers;)Lokhttp3/Headers;", "Lokhttp3/HttpUrl;", "url", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/HttpUrl;)Ljava/lang/String;", "Lej/g;", "source", "", SnmpConfigurator.O_COMMUNITY, "(Lej/g;)I", "Lokhttp3/Response;", "cachedResponse", "cachedRequest", "Lokhttp3/Request;", "newRequest", "", "g", "(Lokhttp3/Response;Lokhttp3/Headers;Lokhttp3/Request;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/Response;)Z", "f", "(Lokhttp3/Response;)Lokhttp3/Headers;", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set d(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (t.C("Vary", headers.e(i10), true)) {
                    String strJ = headers.j(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(t.E(U.f51694a));
                    }
                    Iterator it = t.P0(strJ, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(t.q1((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? d0.e() : treeSet;
        }

        private final Headers e(Headers requestHeaders, Headers responseHeaders) {
            Set setD = d(responseHeaders);
            if (setD.isEmpty()) {
                return Util.f56217b;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = requestHeaders.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strE = requestHeaders.e(i10);
                if (setD.contains(strE)) {
                    builder.a(strE, requestHeaders.j(i10));
                }
            }
            return builder.f();
        }

        public final boolean a(Response response) {
            AbstractC6492s.i(response, "<this>");
            return d(response.getHeaders()).contains("*");
        }

        public final String b(HttpUrl url) {
            AbstractC6492s.i(url, "url");
            return h.f46470d.d(url.getUrl()).B().t();
        }

        public final int c(InterfaceC5483g source) throws IOException {
            AbstractC6492s.i(source, "source");
            try {
                long jA = source.A();
                String strQ = source.Q();
                if (jA >= 0 && jA <= 2147483647L && strQ.length() <= 0) {
                    return (int) jA;
                }
                throw new IOException("expected an int but was \"" + jA + strQ + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final Headers f(Response response) {
            AbstractC6492s.i(response, "<this>");
            Response networkResponse = response.getNetworkResponse();
            AbstractC6492s.f(networkResponse);
            return e(networkResponse.getRequest().getHeaders(), response.getHeaders());
        }

        public final boolean g(Response cachedResponse, Headers cachedRequest, Request newRequest) {
            AbstractC6492s.i(cachedResponse, "cachedResponse");
            AbstractC6492s.i(cachedRequest, "cachedRequest");
            AbstractC6492s.i(newRequest, "newRequest");
            Set<String> setD = d(cachedResponse.getHeaders());
            if ((setD instanceof Collection) && setD.isEmpty()) {
                return true;
            }
            for (String str : setD) {
                if (!AbstractC6492s.d(cachedRequest.k(str), newRequest.e(str))) {
                    return false;
                }
            }
            return true;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "<init>", "(Lokhttp3/Cache;Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "()V", "Lej/B;", SnmpConfigurator.O_BIND_ADDRESS, "()Lej/B;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lej/B;", "cacheOut", SnmpConfigurator.O_COMMUNITY, "body", "", "d", "Z", "()Z", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Z)V", "done", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class RealCacheRequest implements CacheRequest {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final DiskLruCache.Editor editor;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5474B cacheOut;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5474B body;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean done;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Cache f55792e;

        public RealCacheRequest(final Cache cache, DiskLruCache.Editor editor) {
            AbstractC6492s.i(editor, "editor");
            this.f55792e = cache;
            this.editor = editor;
            InterfaceC5474B interfaceC5474BF = editor.f(1);
            this.cacheOut = interfaceC5474BF;
            this.body = new j(interfaceC5474BF) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // ej.j, ej.InterfaceC5474B, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    Cache cache2 = cache;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.getDone()) {
                            return;
                        }
                        realCacheRequest.e(true);
                        cache2.y(cache2.getWriteSuccessCount() + 1);
                        super.close();
                        this.editor.b();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void a() throws IOException {
            Cache cache = this.f55792e;
            synchronized (cache) {
                if (this.done) {
                    return;
                }
                this.done = true;
                cache.v(cache.getWriteAbortCount() + 1);
                Util.m(this.cacheOut);
                try {
                    this.editor.a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        /* renamed from: b, reason: from getter */
        public InterfaceC5474B getBody() {
            return this.body;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getDone() {
            return this.done;
        }

        public final void e(boolean z10) {
            this.done = z10;
        }
    }

    private final void a(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.a();
            } catch (IOException unused) {
            }
        }
    }

    public final synchronized void C() {
        this.hitCount++;
    }

    public final synchronized void J(CacheStrategy cacheStrategy) {
        try {
            AbstractC6492s.i(cacheStrategy, "cacheStrategy");
            this.requestCount++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.hitCount++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void P(Response cached, Response network) {
        DiskLruCache.Editor editorA;
        AbstractC6492s.i(cached, "cached");
        AbstractC6492s.i(network, "network");
        Entry entry = new Entry(network);
        ResponseBody body = cached.getBody();
        AbstractC6492s.g(body, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            editorA = ((CacheResponseBody) body).getSnapshot().a();
            if (editorA == null) {
                return;
            }
            try {
                entry.f(editorA);
                editorA.b();
            } catch (IOException unused) {
                a(editorA);
            }
        } catch (IOException unused2) {
            editorA = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.cache.close();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.cache.flush();
    }

    public final Response g(Request request) throws IOException {
        AbstractC6492s.i(request, "request");
        try {
            DiskLruCache.Snapshot snapshotY = this.cache.Y(INSTANCE.b(request.getUrl()));
            if (snapshotY == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshotY.g(0));
                Response responseD = entry.d(snapshotY);
                if (entry.b(request, responseD)) {
                    return responseD;
                }
                ResponseBody body = responseD.getBody();
                if (body != null) {
                    Util.m(body);
                }
                return null;
            } catch (IOException unused) {
                Util.m(snapshotY);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    /* renamed from: h, reason: from getter */
    public final int getWriteAbortCount() {
        return this.writeAbortCount;
    }

    /* renamed from: j, reason: from getter */
    public final int getWriteSuccessCount() {
        return this.writeSuccessCount;
    }

    public final CacheRequest p(Response response) {
        DiskLruCache.Editor editorT;
        AbstractC6492s.i(response, "response");
        String method = response.getRequest().getMethod();
        if (HttpMethod.f56465a.a(response.getRequest().getMethod())) {
            try {
                s(response.getRequest());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!AbstractC6492s.d(method, "GET")) {
            return null;
        }
        Companion companion = INSTANCE;
        if (companion.a(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editorT = DiskLruCache.T(this.cache, companion.b(response.getRequest().getUrl()), 0L, 2, null);
            if (editorT == null) {
                return null;
            }
            try {
                entry.f(editorT);
                return new RealCacheRequest(this, editorT);
            } catch (IOException unused2) {
                a(editorT);
                return null;
            }
        } catch (IOException unused3) {
            editorT = null;
        }
    }

    public final void s(Request request) {
        AbstractC6492s.i(request, "request");
        this.cache.u0(INSTANCE.b(request.getUrl()));
    }

    public final void v(int i10) {
        this.writeAbortCount = i10;
    }

    public final void y(int i10) {
        this.writeSuccessCount = i10;
    }

    @Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\b\u0002\u0018\u0000 B2\u00020\u0001:\u0001CB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0015R\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00062\n\u0010 \u001a\u00060\u001fR\u00020\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0014\u00103\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010+R\u0014\u00105\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010(R\u0016\u00109\u001a\u0004\u0018\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0014\u0010A\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010@¨\u0006D"}, d2 = {"Lokhttp3/Cache$Entry;", "", "Lej/D;", "rawSource", "<init>", "(Lej/D;)V", "Lokhttp3/Response;", "response", "(Lokhttp3/Response;)V", "Lej/g;", "source", "", "Ljava/security/cert/Certificate;", SnmpConfigurator.O_COMMUNITY, "(Lej/g;)Ljava/util/List;", "Lej/f;", "sink", "certificates", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Lej/f;Ljava/util/List;)V", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "f", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "Lokhttp3/Request;", "request", "", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/Request;Lokhttp3/Response;)Z", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "d", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;)Lokhttp3/Response;", "Lokhttp3/HttpUrl;", SnmpConfigurator.O_AUTH_PROTOCOL, "Lokhttp3/HttpUrl;", "url", "Lokhttp3/Headers;", "Lokhttp3/Headers;", "varyHeaders", "", "Ljava/lang/String;", "requestMethod", "Lokhttp3/Protocol;", "Lokhttp3/Protocol;", "protocol", "", "I", "code", "message", "g", "responseHeaders", "Lokhttp3/Handshake;", "h", "Lokhttp3/Handshake;", "handshake", "", "i", "J", "sentRequestMillis", "j", "receivedResponseMillis", "()Z", "isHttps", "k", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Entry {

        /* renamed from: l, reason: collision with root package name */
        private static final String f55776l;

        /* renamed from: m, reason: collision with root package name */
        private static final String f55777m;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final HttpUrl url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Headers varyHeaders;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String requestMethod;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Protocol protocol;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int code;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final Headers responseHeaders;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Handshake handshake;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final long sentRequestMillis;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final long receivedResponseMillis;

        static {
            StringBuilder sb2 = new StringBuilder();
            Platform.Companion companion = Platform.INSTANCE;
            sb2.append(companion.g().g());
            sb2.append("-Sent-Millis");
            f55776l = sb2.toString();
            f55777m = companion.g().g() + "-Received-Millis";
        }

        public Entry(InterfaceC5476D rawSource) {
            AbstractC6492s.i(rawSource, "rawSource");
            try {
                InterfaceC5483g interfaceC5483gD = p.d(rawSource);
                String strQ = interfaceC5483gD.Q();
                HttpUrl httpUrlF = HttpUrl.INSTANCE.f(strQ);
                if (httpUrlF == null) {
                    IOException iOException = new IOException("Cache corruption for " + strQ);
                    Platform.INSTANCE.g().k("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.url = httpUrlF;
                this.requestMethod = interfaceC5483gD.Q();
                Headers.Builder builder = new Headers.Builder();
                int iC = Cache.INSTANCE.c(interfaceC5483gD);
                for (int i10 = 0; i10 < iC; i10++) {
                    builder.c(interfaceC5483gD.Q());
                }
                this.varyHeaders = builder.f();
                StatusLine statusLineA = StatusLine.INSTANCE.a(interfaceC5483gD.Q());
                this.protocol = statusLineA.protocol;
                this.code = statusLineA.code;
                this.message = statusLineA.message;
                Headers.Builder builder2 = new Headers.Builder();
                int iC2 = Cache.INSTANCE.c(interfaceC5483gD);
                for (int i11 = 0; i11 < iC2; i11++) {
                    builder2.c(interfaceC5483gD.Q());
                }
                String str = f55776l;
                String strG = builder2.g(str);
                String str2 = f55777m;
                String strG2 = builder2.g(str2);
                builder2.i(str);
                builder2.i(str2);
                this.sentRequestMillis = strG != null ? Long.parseLong(strG) : 0L;
                this.receivedResponseMillis = strG2 != null ? Long.parseLong(strG2) : 0L;
                this.responseHeaders = builder2.f();
                if (a()) {
                    String strQ2 = interfaceC5483gD.Q();
                    if (strQ2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strQ2 + '\"');
                    }
                    this.handshake = Handshake.INSTANCE.b(!interfaceC5483gD.t() ? TlsVersion.INSTANCE.a(interfaceC5483gD.Q()) : TlsVersion.SSL_3_0, CipherSuite.INSTANCE.b(interfaceC5483gD.Q()), c(interfaceC5483gD), c(interfaceC5483gD));
                } else {
                    this.handshake = null;
                }
                J j10 = J.f24997a;
                AbstractC6329b.a(rawSource, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC6329b.a(rawSource, th2);
                    throw th3;
                }
            }
        }

        private final boolean a() {
            return AbstractC6492s.d(this.url.getScheme(), "https");
        }

        private final List c(InterfaceC5483g source) throws IOException, CertificateException {
            int iC = Cache.INSTANCE.c(source);
            if (iC == -1) {
                return AbstractC3689v.l();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iC);
                for (int i10 = 0; i10 < iC; i10++) {
                    String strQ = source.Q();
                    C5481e c5481e = new C5481e();
                    h hVarA = h.f46470d.a(strQ);
                    if (hVarA == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    c5481e.R(hVarA);
                    arrayList.add(certificateFactory.generateCertificate(c5481e.l0()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private final void e(InterfaceC5482f sink, List certificates) throws IOException, CertificateEncodingException {
            try {
                sink.h0(certificates.size()).u(10);
                Iterator it = certificates.iterator();
                while (it.hasNext()) {
                    byte[] bytes = ((Certificate) it.next()).getEncoded();
                    h.a aVar = h.f46470d;
                    AbstractC6492s.h(bytes, "bytes");
                    sink.F(h.a.f(aVar, bytes, 0, 0, 3, null).c()).u(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean b(Request request, Response response) {
            AbstractC6492s.i(request, "request");
            AbstractC6492s.i(response, "response");
            return AbstractC6492s.d(this.url, request.getUrl()) && AbstractC6492s.d(this.requestMethod, request.getMethod()) && Cache.INSTANCE.g(response, this.varyHeaders, request);
        }

        public final Response d(DiskLruCache.Snapshot snapshot) {
            AbstractC6492s.i(snapshot, "snapshot");
            String strB = this.responseHeaders.b("Content-Type");
            String strB2 = this.responseHeaders.b("Content-Length");
            return new Response.Builder().r(new Request.Builder().i(this.url).e(this.requestMethod, null).d(this.varyHeaders).b()).p(this.protocol).g(this.code).m(this.message).k(this.responseHeaders).b(new CacheResponseBody(snapshot, strB, strB2)).i(this.handshake).s(this.sentRequestMillis).q(this.receivedResponseMillis).c();
        }

        public final void f(DiskLruCache.Editor editor) {
            AbstractC6492s.i(editor, "editor");
            InterfaceC5482f interfaceC5482fC = p.c(editor.f(0));
            try {
                interfaceC5482fC.F(this.url.getUrl()).u(10);
                interfaceC5482fC.F(this.requestMethod).u(10);
                interfaceC5482fC.h0(this.varyHeaders.size()).u(10);
                int size = this.varyHeaders.size();
                for (int i10 = 0; i10 < size; i10++) {
                    interfaceC5482fC.F(this.varyHeaders.e(i10)).F(": ").F(this.varyHeaders.j(i10)).u(10);
                }
                interfaceC5482fC.F(new StatusLine(this.protocol, this.code, this.message).toString()).u(10);
                interfaceC5482fC.h0(this.responseHeaders.size() + 2).u(10);
                int size2 = this.responseHeaders.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    interfaceC5482fC.F(this.responseHeaders.e(i11)).F(": ").F(this.responseHeaders.j(i11)).u(10);
                }
                interfaceC5482fC.F(f55776l).F(": ").h0(this.sentRequestMillis).u(10);
                interfaceC5482fC.F(f55777m).F(": ").h0(this.receivedResponseMillis).u(10);
                if (a()) {
                    interfaceC5482fC.u(10);
                    Handshake handshake = this.handshake;
                    AbstractC6492s.f(handshake);
                    interfaceC5482fC.F(handshake.getCipherSuite().getJavaName()).u(10);
                    e(interfaceC5482fC, this.handshake.d());
                    e(interfaceC5482fC, this.handshake.getLocalCertificates());
                    interfaceC5482fC.F(this.handshake.getTlsVersion().javaName()).u(10);
                }
                J j10 = J.f24997a;
                AbstractC6329b.a(interfaceC5482fC, null);
            } finally {
            }
        }

        public Entry(Response response) {
            AbstractC6492s.i(response, "response");
            this.url = response.getRequest().getUrl();
            this.varyHeaders = Cache.INSTANCE.f(response);
            this.requestMethod = response.getRequest().getMethod();
            this.protocol = response.getProtocol();
            this.code = response.getCode();
            this.message = response.getMessage();
            this.responseHeaders = response.getHeaders();
            this.handshake = response.getHandshake();
            this.sentRequestMillis = response.getSentRequestAtMillis();
            this.receivedResponseMillis = response.getReceivedResponseAtMillis();
        }
    }
}

package okhttp3;

import ej.C5481e;
import ej.InterfaceC5482f;
import ej.h;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.internal.Util;
import org.snmp4j.asn1.BER;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 (2\u00020\u0001:\u0003)*+B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0005\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010#\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0011\u0010'\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Lej/h;", "boundaryByteString", "Lokhttp3/MediaType;", "type", "", "Lokhttp3/MultipartBody$Part;", "parts", "<init>", "(Lej/h;Lokhttp3/MediaType;Ljava/util/List;)V", "Lej/f;", "sink", "", "countBytes", "", "j", "(Lej/f;Z)J", SnmpConfigurator.O_BIND_ADDRESS, "()Lokhttp3/MediaType;", SnmpConfigurator.O_AUTH_PROTOCOL, "()J", "LYg/J;", "h", "(Lej/f;)V", "Lej/h;", SnmpConfigurator.O_COMMUNITY, "Lokhttp3/MediaType;", "d", "Ljava/util/List;", "()Ljava/util/List;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "contentType", "f", "J", "contentLength", "", "i", "()Ljava/lang/String;", "boundary", "g", "Builder", "Companion", "Part", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MultipartBody extends RequestBody {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    public static final MediaType f56063h;

    /* renamed from: i, reason: collision with root package name */
    public static final MediaType f56064i;

    /* renamed from: j, reason: collision with root package name */
    public static final MediaType f56065j;

    /* renamed from: k, reason: collision with root package name */
    public static final MediaType f56066k;

    /* renamed from: l, reason: collision with root package name */
    public static final MediaType f56067l;

    /* renamed from: m, reason: collision with root package name */
    private static final byte[] f56068m;

    /* renamed from: n, reason: collision with root package name */
    private static final byte[] f56069n;

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f56070o;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h boundaryByteString;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final MediaType type;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List parts;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final MediaType contentType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long contentLength;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b¨\u0006\u001d"}, d2 = {"Lokhttp3/MultipartBody$Builder;", "", "", "boundary", "<init>", "(Ljava/lang/String;)V", "Lokhttp3/MediaType;", "type", "d", "(Lokhttp3/MediaType;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/Headers;", "headers", "Lokhttp3/RequestBody;", "body", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/Headers;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/MultipartBody$Part;", "part", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/MultipartBody$Part;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/MultipartBody;", SnmpConfigurator.O_COMMUNITY, "()Lokhttp3/MultipartBody;", "Lej/h;", "Lej/h;", "Lokhttp3/MediaType;", "", "Ljava/util/List;", "parts", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final h boundary;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private MediaType type;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List parts;

        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Builder a(Headers headers, RequestBody body) {
            AbstractC6492s.i(body, "body");
            b(Part.INSTANCE.a(headers, body));
            return this;
        }

        public final Builder b(Part part) {
            AbstractC6492s.i(part, "part");
            this.parts.add(part);
            return this;
        }

        public final MultipartBody c() {
            if (this.parts.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new MultipartBody(this.boundary, this.type, Util.V(this.parts));
        }

        public final Builder d(MediaType type) {
            AbstractC6492s.i(type, "type");
            if (AbstractC6492s.d(type.getType(), "multipart")) {
                this.type = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        public Builder(String boundary) {
            AbstractC6492s.i(boundary, "boundary");
            this.boundary = h.f46470d.d(boundary);
            this.type = MultipartBody.f56063h;
            this.parts = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Builder(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i10 & 1) != 0) {
                str = UUID.randomUUID().toString();
                AbstractC6492s.h(str, "randomUUID().toString()");
            }
            this(str);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lokhttp3/MultipartBody$Companion;", "", "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "key", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "Lokhttp3/MediaType;", "ALTERNATIVE", "Lokhttp3/MediaType;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(StringBuilder sb2, String key) {
            AbstractC6492s.i(sb2, "<this>");
            AbstractC6492s.i(key, "key");
            sb2.append('\"');
            int length = key.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = key.charAt(i10);
                if (cCharAt == '\n') {
                    sb2.append("%0A");
                } else if (cCharAt == '\r') {
                    sb2.append("%0D");
                } else if (cCharAt == '\"') {
                    sb2.append("%22");
                } else {
                    sb2.append(cCharAt);
                }
            }
            sb2.append('\"');
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u0010"}, d2 = {"Lokhttp3/MultipartBody$Part;", "", "Lokhttp3/Headers;", "headers", "Lokhttp3/RequestBody;", "body", "<init>", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Lokhttp3/Headers;", SnmpConfigurator.O_BIND_ADDRESS, "()Lokhttp3/Headers;", "Lokhttp3/RequestBody;", "()Lokhttp3/RequestBody;", SnmpConfigurator.O_COMMUNITY, "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Part {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Headers headers;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final RequestBody body;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "<init>", "()V", "Lokhttp3/Headers;", "headers", "Lokhttp3/RequestBody;", "body", "Lokhttp3/MultipartBody$Part;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/Headers;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;", "", "name", "filename", SnmpConfigurator.O_BIND_ADDRESS, "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Part a(Headers headers, RequestBody body) {
                AbstractC6492s.i(body, "body");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if ((headers != null ? headers.b("Content-Type") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((headers != null ? headers.b("Content-Length") : null) == null) {
                    return new Part(headers, body, defaultConstructorMarker);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            public final Part b(String name, String filename, RequestBody body) {
                AbstractC6492s.i(name, "name");
                AbstractC6492s.i(body, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                Companion companion = MultipartBody.INSTANCE;
                companion.a(sb2, name);
                if (filename != null) {
                    sb2.append("; filename=");
                    companion.a(sb2, filename);
                }
                String string = sb2.toString();
                AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
                return a(new Headers.Builder().e("Content-Disposition", string).f(), body);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, DefaultConstructorMarker defaultConstructorMarker) {
            this(headers, requestBody);
        }

        /* renamed from: a, reason: from getter */
        public final RequestBody getBody() {
            return this.body;
        }

        /* renamed from: b, reason: from getter */
        public final Headers getHeaders() {
            return this.headers;
        }

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }
    }

    static {
        MediaType.Companion companion = MediaType.INSTANCE;
        f56063h = companion.a("multipart/mixed");
        f56064i = companion.a("multipart/alternative");
        f56065j = companion.a("multipart/digest");
        f56066k = companion.a("multipart/parallel");
        f56067l = companion.a("multipart/form-data");
        f56068m = new byte[]{58, BER.ASN_CONSTRUCTOR};
        f56069n = new byte[]{13, 10};
        f56070o = new byte[]{45, 45};
    }

    public MultipartBody(h boundaryByteString, MediaType type, List parts) {
        AbstractC6492s.i(boundaryByteString, "boundaryByteString");
        AbstractC6492s.i(type, "type");
        AbstractC6492s.i(parts, "parts");
        this.boundaryByteString = boundaryByteString;
        this.type = type;
        this.parts = parts;
        this.contentType = MediaType.INSTANCE.a(type + "; boundary=" + i());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long j(InterfaceC5482f sink, boolean countBytes) throws EOFException {
        C5481e c5481e;
        if (countBytes) {
            sink = new C5481e();
            c5481e = sink;
        } else {
            c5481e = 0;
        }
        int size = this.parts.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Part part = (Part) this.parts.get(i10);
            Headers headers = part.getHeaders();
            RequestBody body = part.getBody();
            AbstractC6492s.f(sink);
            sink.X(f56070o);
            sink.R(this.boundaryByteString);
            sink.X(f56069n);
            if (headers != null) {
                int size2 = headers.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    sink.F(headers.e(i11)).X(f56068m).F(headers.j(i11)).X(f56069n);
                }
            }
            MediaType contentType = body.getContentType();
            if (contentType != null) {
                sink.F("Content-Type: ").F(contentType.getMediaType()).X(f56069n);
            }
            long jA = body.a();
            if (jA != -1) {
                sink.F("Content-Length: ").h0(jA).X(f56069n);
            } else if (countBytes) {
                AbstractC6492s.f(c5481e);
                c5481e.clear();
                return -1L;
            }
            byte[] bArr = f56069n;
            sink.X(bArr);
            if (countBytes) {
                j10 += jA;
            } else {
                body.h(sink);
            }
            sink.X(bArr);
        }
        AbstractC6492s.f(sink);
        byte[] bArr2 = f56070o;
        sink.X(bArr2);
        sink.R(this.boundaryByteString);
        sink.X(bArr2);
        sink.X(f56069n);
        if (!countBytes) {
            return j10;
        }
        AbstractC6492s.f(c5481e);
        long jD0 = j10 + c5481e.D0();
        c5481e.clear();
        return jD0;
    }

    @Override // okhttp3.RequestBody
    public long a() throws EOFException {
        long j10 = this.contentLength;
        if (j10 != -1) {
            return j10;
        }
        long j11 = j(null, true);
        this.contentLength = j11;
        return j11;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: b, reason: from getter */
    public MediaType getContentType() {
        return this.contentType;
    }

    @Override // okhttp3.RequestBody
    public void h(InterfaceC5482f sink) throws EOFException {
        AbstractC6492s.i(sink, "sink");
        j(sink, false);
    }

    public final String i() {
        return this.boundaryByteString.q0();
    }
}

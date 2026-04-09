package okhttp3;

import ej.InterfaceC5482f;
import ej.h;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C6510d;
import okhttp3.internal.Util;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 \b2\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0014"}, d2 = {"Lokhttp3/RequestBody;", "", "<init>", "()V", "Lokhttp3/MediaType;", SnmpConfigurator.O_BIND_ADDRESS, "()Lokhttp3/MediaType;", "", SnmpConfigurator.O_AUTH_PROTOCOL, "()J", "Lej/f;", "sink", "LYg/J;", "h", "(Lej/f;)V", "", "f", "()Z", "g", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class RequestBody {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0018\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokhttp3/RequestBody$Companion;", "", "<init>", "()V", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/RequestBody;", SnmpConfigurator.O_BIND_ADDRESS, "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "Lej/h;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lej/h;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "", "", "offset", "byteCount", "g", "([BLokhttp3/MediaType;II)Lokhttp3/RequestBody;", "content", "d", "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;", SnmpConfigurator.O_COMMUNITY, "(Lokhttp3/MediaType;Lej/h;)Lokhttp3/RequestBody;", "f", "(Lokhttp3/MediaType;[BII)Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ RequestBody h(Companion companion, MediaType mediaType, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return companion.f(mediaType, bArr, i10, i11);
        }

        public static /* synthetic */ RequestBody i(Companion companion, byte[] bArr, MediaType mediaType, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                mediaType = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return companion.g(bArr, mediaType, i10, i11);
        }

        public final RequestBody a(final h hVar, final MediaType mediaType) {
            AbstractC6492s.i(hVar, "<this>");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                public long a() {
                    return hVar.b0();
                }

                @Override // okhttp3.RequestBody
                /* renamed from: b, reason: from getter */
                public MediaType getF56173b() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void h(InterfaceC5482f sink) {
                    AbstractC6492s.i(sink, "sink");
                    sink.R(hVar);
                }
            };
        }

        public final RequestBody b(String str, MediaType mediaType) {
            AbstractC6492s.i(str, "<this>");
            Charset charset = C6510d.f52215b;
            if (mediaType != null) {
                Charset charsetD = MediaType.d(mediaType, null, 1, null);
                if (charsetD == null) {
                    mediaType = MediaType.INSTANCE.b(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetD;
                }
            }
            byte[] bytes = str.getBytes(charset);
            AbstractC6492s.h(bytes, "this as java.lang.String).getBytes(charset)");
            return g(bytes, mediaType, 0, bytes.length);
        }

        public final RequestBody c(MediaType contentType, h content) {
            AbstractC6492s.i(content, "content");
            return a(content, contentType);
        }

        public final RequestBody d(MediaType contentType, String content) {
            AbstractC6492s.i(content, "content");
            return b(content, contentType);
        }

        public final RequestBody e(MediaType mediaType, byte[] content) {
            AbstractC6492s.i(content, "content");
            return h(this, mediaType, content, 0, 0, 12, null);
        }

        public final RequestBody f(MediaType contentType, byte[] content, int offset, int byteCount) {
            AbstractC6492s.i(content, "content");
            return g(content, contentType, offset, byteCount);
        }

        public final RequestBody g(final byte[] bArr, final MediaType mediaType, final int i10, final int i11) {
            AbstractC6492s.i(bArr, "<this>");
            Util.l(bArr.length, i10, i11);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public long a() {
                    return i11;
                }

                @Override // okhttp3.RequestBody
                /* renamed from: b, reason: from getter */
                public MediaType getF56173b() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void h(InterfaceC5482f sink) {
                    AbstractC6492s.i(sink, "sink");
                    sink.write(bArr, i10, i11);
                }
            };
        }

        private Companion() {
        }
    }

    public static final RequestBody c(MediaType mediaType, h hVar) {
        return INSTANCE.c(mediaType, hVar);
    }

    public static final RequestBody d(MediaType mediaType, String str) {
        return INSTANCE.d(mediaType, str);
    }

    public static final RequestBody e(MediaType mediaType, byte[] bArr) {
        return INSTANCE.e(mediaType, bArr);
    }

    public long a() {
        return -1L;
    }

    /* renamed from: b */
    public abstract MediaType getF56173b();

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public abstract void h(InterfaceC5482f sink);
}

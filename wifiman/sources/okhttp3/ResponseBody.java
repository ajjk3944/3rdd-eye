package okhttp3;

import Yg.J;
import ej.C5481e;
import ej.InterfaceC5483g;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import jh.AbstractC6329b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C6510d;
import okhttp3.internal.Util;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000  2\u00020\u0001:\u0002!\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u0003R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001e¨\u0006#"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", "Ljava/nio/charset/Charset;", "j", "()Ljava/nio/charset/Charset;", "Lokhttp3/MediaType;", "s", "()Lokhttp3/MediaType;", "", "p", "()J", "Ljava/io/InputStream;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Ljava/io/InputStream;", "Lej/g;", SnmpConfigurator.O_PRIV_PROTOCOL, "()Lej/g;", "", "g", "()[B", "Ljava/io/Reader;", "h", "()Ljava/io/Reader;", "", "C", "()Ljava/lang/String;", "LYg/J;", "close", "Ljava/io/Reader;", "reader", SnmpConfigurator.O_BIND_ADDRESS, "BomAwareReader", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ResponseBody implements Closeable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Reader reader;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "Lej/g;", "source", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lej/g;Ljava/nio/charset/Charset;)V", "", "cbuf", "", "off", "len", "read", "([CII)I", "LYg/J;", "close", "()V", SnmpConfigurator.O_AUTH_PROTOCOL, "Lej/g;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/nio/charset/Charset;", "", SnmpConfigurator.O_COMMUNITY, "Z", "closed", "d", "Ljava/io/Reader;", "delegate", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BomAwareReader extends Reader {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5483g source;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Charset charset;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Reader delegate;

        public BomAwareReader(InterfaceC5483g source, Charset charset) {
            AbstractC6492s.i(source, "source");
            AbstractC6492s.i(charset, "charset");
            this.source = source;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            J j10;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                j10 = J.f24997a;
            } else {
                j10 = null;
            }
            if (j10 == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int off, int len) throws IOException {
            AbstractC6492s.i(cbuf, "cbuf");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.l0(), Util.J(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, off, len);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "<init>", "()V", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/ResponseBody;", SnmpConfigurator.O_COMMUNITY, "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lej/g;", "", "contentLength", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lej/g;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "content", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/MediaType;JLej/g;)Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ResponseBody d(Companion companion, byte[] bArr, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.c(bArr, mediaType);
        }

        public final ResponseBody a(final InterfaceC5483g interfaceC5483g, final MediaType mediaType, final long j10) {
            AbstractC6492s.i(interfaceC5483g, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                /* renamed from: p, reason: from getter */
                public long getF56211d() {
                    return j10;
                }

                @Override // okhttp3.ResponseBody
                /* renamed from: s, reason: from getter */
                public MediaType getF56210c() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                /* renamed from: y, reason: from getter */
                public InterfaceC5483g getF56212e() {
                    return interfaceC5483g;
                }
            };
        }

        public final ResponseBody b(MediaType contentType, long contentLength, InterfaceC5483g content) {
            AbstractC6492s.i(content, "content");
            return a(content, contentType, contentLength);
        }

        public final ResponseBody c(byte[] bArr, MediaType mediaType) {
            AbstractC6492s.i(bArr, "<this>");
            return a(new C5481e().X(bArr), mediaType, bArr.length);
        }

        private Companion() {
        }
    }

    private final Charset j() {
        Charset charsetC;
        MediaType mediaTypeS = getF56210c();
        return (mediaTypeS == null || (charsetC = mediaTypeS.c(C6510d.f52215b)) == null) ? C6510d.f52215b : charsetC;
    }

    public static final ResponseBody v(MediaType mediaType, long j10, InterfaceC5483g interfaceC5483g) {
        return INSTANCE.b(mediaType, j10, interfaceC5483g);
    }

    public final String C() {
        InterfaceC5483g interfaceC5483gY = getF56212e();
        try {
            String strG = interfaceC5483gY.G(Util.J(interfaceC5483gY, j()));
            AbstractC6329b.a(interfaceC5483gY, null);
            return strG;
        } finally {
        }
    }

    public final InputStream a() {
        return getF56212e().l0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.m(getF56212e());
    }

    public final byte[] g() throws IOException {
        long jP = getF56211d();
        if (jP > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jP);
        }
        InterfaceC5483g interfaceC5483gY = getF56212e();
        try {
            byte[] bArrR = interfaceC5483gY.r();
            AbstractC6329b.a(interfaceC5483gY, null);
            int length = bArrR.length;
            if (jP == -1 || jP == length) {
                return bArrR;
            }
            throw new IOException("Content-Length (" + jP + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader h() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(getF56212e(), j());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    /* renamed from: p */
    public abstract long getF56211d();

    /* renamed from: s */
    public abstract MediaType getF56210c();

    /* renamed from: y */
    public abstract InterfaceC5483g getF56212e();
}

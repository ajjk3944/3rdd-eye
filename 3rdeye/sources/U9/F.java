package U9;

import N7.H7;
import U9.v;
import b9.C1992A;
import g0.C4356c;
import ia.C4468d;
import io.appmetrica.analytics.impl.Oo;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import y9.C5819a;

/* compiled from: ResponseBody.kt */
/* loaded from: classes3.dex */
public abstract class F implements Closeable {
    public static final b Companion = new b();
    private Reader reader;

    /* compiled from: ResponseBody.kt */
    public static final class a extends Reader {

        /* renamed from: b, reason: collision with root package name */
        public final ia.g f12587b;

        /* renamed from: c, reason: collision with root package name */
        public final Charset f12588c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f12589d;

        /* renamed from: e, reason: collision with root package name */
        public InputStreamReader f12590e;

        public a(ia.g source, Charset charset) {
            kotlin.jvm.internal.l.f(source, "source");
            kotlin.jvm.internal.l.f(charset, "charset");
            this.f12587b = source;
            this.f12588c = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            C1992A c1992a;
            this.f12589d = true;
            InputStreamReader inputStreamReader = this.f12590e;
            if (inputStreamReader != null) {
                inputStreamReader.close();
                c1992a = C1992A.f18074a;
            } else {
                c1992a = null;
            }
            if (c1992a == null) {
                this.f12587b.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cbuf, int i, int i10) throws IOException {
            kotlin.jvm.internal.l.f(cbuf, "cbuf");
            if (this.f12589d) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.f12590e;
            if (inputStreamReader == null) {
                ia.g gVar = this.f12587b;
                inputStreamReader = new InputStreamReader(gVar.L0(), V9.b.r(gVar, this.f12588c));
                this.f12590e = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i, i10);
        }
    }

    /* compiled from: ResponseBody.kt */
    public static final class b {
        public static G a(v vVar, long j4, ia.g gVar) {
            kotlin.jvm.internal.l.f(gVar, "<this>");
            return new G(vVar, j4, gVar);
        }

        public static G b(String string, v vVar) {
            kotlin.jvm.internal.l.f(string, "<this>");
            Charset charset = C5819a.f48359b;
            if (vVar != null) {
                Pattern pattern = v.f12729d;
                Charset charsetA = vVar.a(null);
                if (charsetA == null) {
                    vVar = v.a.b(vVar + "; charset=utf-8");
                } else {
                    charset = charsetA;
                }
            }
            C4468d c4468d = new C4468d();
            kotlin.jvm.internal.l.f(charset, "charset");
            int length = string.length();
            kotlin.jvm.internal.l.f(string, "string");
            if (length < 0) {
                throw new IllegalArgumentException(H7.n(length, 0, "endIndex < beginIndex: ", " < ").toString());
            }
            if (length > string.length()) {
                StringBuilder sbJ = C4356c.j(length, "endIndex > string.length: ", " > ");
                sbJ.append(string.length());
                throw new IllegalArgumentException(sbJ.toString().toString());
            }
            if (charset.equals(C5819a.f48359b)) {
                c4468d.Q0(0, length, string);
            } else {
                String strSubstring = string.substring(0, length);
                kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
                byte[] bytes = strSubstring.getBytes(charset);
                kotlin.jvm.internal.l.e(bytes, "getBytes(...)");
                c4468d.B0(bytes, 0, bytes.length);
            }
            return a(vVar, c4468d.f38643c, c4468d);
        }

        public static G c(byte[] bArr, v vVar) {
            kotlin.jvm.internal.l.f(bArr, "<this>");
            C4468d c4468d = new C4468d();
            c4468d.B0(bArr, 0, bArr.length);
            return a(vVar, bArr.length, c4468d);
        }
    }

    private final Charset charset() {
        Charset charsetA;
        v vVarContentType = contentType();
        return (vVarContentType == null || (charsetA = vVarContentType.a(C5819a.f48359b)) == null) ? C5819a.f48359b : charsetA;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(p9.l<? super ia.g, ? extends T> lVar, p9.l<? super T, Integer> lVar2) throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(Oo.d(jContentLength, "Cannot buffer entire body for content length: "));
        }
        ia.g gVarSource = source();
        try {
            T tInvoke = lVar.invoke(gVarSource);
            A9.I.o(gVarSource, null);
            int iIntValue = lVar2.invoke(tInvoke).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return tInvoke;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iIntValue + ") disagree");
        } finally {
        }
    }

    public static final F create(v vVar, long j4, ia.g content) {
        Companion.getClass();
        kotlin.jvm.internal.l.f(content, "content");
        return b.a(vVar, j4, content);
    }

    public final InputStream byteStream() {
        return source().L0();
    }

    public final ia.h byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(Oo.d(jContentLength, "Cannot buffer entire body for content length: "));
        }
        ia.g gVarSource = source();
        try {
            ia.h hVarH0 = gVarSource.h0();
            gVarSource.close();
            int iC = hVarH0.c();
            if (jContentLength == -1 || jContentLength == iC) {
                return hVarH0;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iC + ") disagree");
        } finally {
        }
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(Oo.d(jContentLength, "Cannot buffer entire body for content length: "));
        }
        ia.g gVarSource = source();
        try {
            byte[] bArrI = gVarSource.I();
            gVarSource.close();
            int length = bArrI.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrI;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(source(), charset());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        V9.b.c(source());
    }

    public abstract long contentLength();

    public abstract v contentType();

    public abstract ia.g source();

    public final String string() throws IOException {
        ia.g gVarSource = source();
        try {
            String strD0 = gVarSource.d0(V9.b.r(gVarSource, charset()));
            gVarSource.close();
            return strD0;
        } finally {
        }
    }

    public static final F create(v vVar, ia.h content) {
        Companion.getClass();
        kotlin.jvm.internal.l.f(content, "content");
        C4468d c4468d = new C4468d();
        c4468d.y0(content);
        return b.a(vVar, content.c(), c4468d);
    }

    public static final F create(v vVar, String content) {
        Companion.getClass();
        kotlin.jvm.internal.l.f(content, "content");
        return b.b(content, vVar);
    }

    public static final F create(v vVar, byte[] content) {
        Companion.getClass();
        kotlin.jvm.internal.l.f(content, "content");
        return b.c(content, vVar);
    }

    public static final F create(ia.g gVar, v vVar, long j4) {
        Companion.getClass();
        return b.a(vVar, j4, gVar);
    }

    public static final F create(String str, v vVar) {
        Companion.getClass();
        return b.b(str, vVar);
    }

    public static final F create(byte[] bArr, v vVar) {
        Companion.getClass();
        return b.c(bArr, vVar);
    }

    public static final F create(ia.h hVar, v vVar) {
        Companion.getClass();
        kotlin.jvm.internal.l.f(hVar, "<this>");
        C4468d c4468d = new C4468d();
        c4468d.y0(hVar);
        return b.a(vVar, hVar.c(), c4468d);
    }
}

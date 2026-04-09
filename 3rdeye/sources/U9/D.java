package U9;

import U9.v;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import y9.C5819a;

/* compiled from: RequestBody.kt */
/* loaded from: classes3.dex */
public abstract class D {
    public static final a Companion = new a();

    /* compiled from: RequestBody.kt */
    public static final class a {
        public static C a(v vVar, byte[] bArr, int i, int i10) {
            kotlin.jvm.internal.l.f(bArr, "<this>");
            long length = bArr.length;
            long j4 = i;
            long j10 = i10;
            byte[] bArr2 = V9.b.f13053a;
            if ((j4 | j10) < 0 || j4 > length || length - j4 < j10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return new C(vVar, bArr, i10, i);
        }

        public static C b(String str, v vVar) {
            kotlin.jvm.internal.l.f(str, "<this>");
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
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.l.e(bytes, "this as java.lang.String).getBytes(charset)");
            return a(vVar, bytes, 0, bytes.length);
        }

        public static C c(a aVar, v vVar, byte[] bArr, int i, int i10) {
            if ((i10 & 4) != 0) {
                i = 0;
            }
            int length = bArr.length;
            aVar.getClass();
            return a(vVar, bArr, i, length);
        }

        public static /* synthetic */ C d(a aVar, byte[] bArr, v vVar, int i, int i10) {
            if ((i10 & 1) != 0) {
                vVar = null;
            }
            if ((i10 & 2) != 0) {
                i = 0;
            }
            int length = bArr.length;
            aVar.getClass();
            return a(vVar, bArr, i, length);
        }
    }

    public static final D create(v vVar, ia.h content) {
        Companion.getClass();
        kotlin.jvm.internal.l.f(content, "content");
        return new B(vVar, content);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract v contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(ia.f fVar) throws IOException;

    public static final D create(v vVar, File file) {
        Companion.getClass();
        kotlin.jvm.internal.l.f(file, "file");
        return new A(vVar, file);
    }

    public static final D create(v vVar, String content) {
        Companion.getClass();
        kotlin.jvm.internal.l.f(content, "content");
        return a.b(content, vVar);
    }

    public static final D create(v vVar, byte[] content) {
        a aVar = Companion;
        aVar.getClass();
        kotlin.jvm.internal.l.f(content, "content");
        return a.c(aVar, vVar, content, 0, 12);
    }

    public static final D create(v vVar, byte[] content, int i) {
        a aVar = Companion;
        aVar.getClass();
        kotlin.jvm.internal.l.f(content, "content");
        return a.c(aVar, vVar, content, i, 8);
    }

    public static final D create(String str, v vVar) {
        Companion.getClass();
        return a.b(str, vVar);
    }

    public static final D create(byte[] bArr) {
        a aVar = Companion;
        aVar.getClass();
        kotlin.jvm.internal.l.f(bArr, "<this>");
        return a.d(aVar, bArr, null, 0, 7);
    }

    public static final D create(byte[] bArr, v vVar) {
        a aVar = Companion;
        aVar.getClass();
        kotlin.jvm.internal.l.f(bArr, "<this>");
        return a.d(aVar, bArr, vVar, 0, 6);
    }

    public static final D create(byte[] bArr, v vVar, int i) {
        a aVar = Companion;
        aVar.getClass();
        kotlin.jvm.internal.l.f(bArr, "<this>");
        return a.d(aVar, bArr, vVar, i, 4);
    }

    public static final D create(byte[] bArr, v vVar, int i, int i10) {
        Companion.getClass();
        return a.a(vVar, bArr, i, i10);
    }

    public static final D create(ia.h hVar, v vVar) {
        Companion.getClass();
        kotlin.jvm.internal.l.f(hVar, "<this>");
        return new B(vVar, hVar);
    }

    public static final D create(File file, v vVar) {
        Companion.getClass();
        kotlin.jvm.internal.l.f(file, "<this>");
        return new A(vVar, file);
    }

    public static final D create(v vVar, byte[] content, int i, int i10) {
        Companion.getClass();
        kotlin.jvm.internal.l.f(content, "content");
        return a.a(vVar, content, i, i10);
    }
}

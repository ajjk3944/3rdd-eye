package okhttp3.internal.publicsuffix;

import a.a;
import com.google.android.gms.internal.measurement.e5;
import cv.p;
import cv.z;
import et.d;
import g4.j;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import mq.o;
import mq.w;
import tt.l;
import xu.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "et/d", "okhttp"}, k = 1, mv = {1, j.BYTES_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f19540e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final List f19541f = e5.H("*");

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f19542g = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f19543a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f19544b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f19545c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f19546d;

    public static List c(String str) {
        List listO0 = l.O0(str, new char[]{'.'});
        return br.l.a(o.z0(listO0), "") ? o.n0(listO0) : listO0;
    }

    public final String a(String str) throws InterruptedException {
        String strA;
        String strA2;
        String strA3;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        br.l.d(unicode, "unicodeDomain");
        List listC = c(unicode);
        List listO0 = w.f16945a;
        int i10 = 0;
        if (this.f19543a.get() || !this.f19543a.compareAndSet(false, true)) {
            try {
                this.f19544b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z10 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z10 = true;
                    } catch (IOException e4) {
                        n nVar = n.f25563a;
                        n.f25563a.getClass();
                        n.i("Failed to read public suffix list", 5, e4);
                        if (z10) {
                        }
                    }
                } finally {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f19545c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i11 = 0; i11 < size3; i11++) {
            String str2 = (String) listC.get(i11);
            Charset charset = StandardCharsets.UTF_8;
            br.l.d(charset, "UTF_8");
            byte[] bytes = str2.getBytes(charset);
            br.l.d(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i11] = bytes;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= size3) {
                strA = null;
                break;
            }
            byte[] bArr2 = this.f19545c;
            if (bArr2 == null) {
                br.l.l("publicSuffixListBytes");
                throw null;
            }
            strA = d.a(bArr2, bArr, i12);
            if (strA != null) {
                break;
            }
            i12++;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i13 = 0; i13 < length; i13++) {
                bArr3[i13] = f19540e;
                byte[] bArr4 = this.f19545c;
                if (bArr4 == null) {
                    br.l.l("publicSuffixListBytes");
                    throw null;
                }
                strA2 = d.a(bArr4, bArr3, i13);
                if (strA2 != null) {
                    break;
                }
            }
            strA2 = null;
        } else {
            strA2 = null;
        }
        if (strA2 != null) {
            int i14 = size3 - 1;
            for (int i15 = 0; i15 < i14; i15++) {
                byte[] bArr5 = this.f19546d;
                if (bArr5 == null) {
                    br.l.l("publicSuffixExceptionListBytes");
                    throw null;
                }
                strA3 = d.a(bArr5, bArr, i15);
                if (strA3 != null) {
                    break;
                }
            }
            strA3 = null;
        } else {
            strA3 = null;
        }
        if (strA3 != null) {
            listO0 = l.O0("!".concat(strA3), new char[]{'.'});
        } else if (strA == null && strA2 == null) {
            listO0 = f19541f;
        } else {
            List listO02 = strA != null ? l.O0(strA, new char[]{'.'}) : listO0;
            if (strA2 != null) {
                listO0 = l.O0(strA2, new char[]{'.'});
            }
            if (listO02.size() > listO0.size()) {
                listO0 = listO02;
            }
        }
        if (listC.size() == listO0.size() && ((String) listO0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listO0.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listO0.size();
        } else {
            size = listC.size();
            size2 = listO0.size() + 1;
        }
        st.j jVarY = st.l.Y(o.j0(c(str)), size - size2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        for (Object obj : jVarY) {
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) ".");
            }
            e5.c(sb2, obj, null);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                z zVarE = a.e(new p(a.E(resourceAsStream)));
                try {
                    long j = zVarE.readInt();
                    zVarE.g0(j);
                    byte[] bArrG = zVarE.f6754d.G(j);
                    long j7 = zVarE.readInt();
                    zVarE.g0(j7);
                    byte[] bArrG2 = zVarE.f6754d.G(j7);
                    zVarE.close();
                    synchronized (this) {
                        this.f19545c = bArrG;
                        this.f19546d = bArrG2;
                    }
                } finally {
                }
            }
        } finally {
            this.f19544b.countDown();
        }
    }
}

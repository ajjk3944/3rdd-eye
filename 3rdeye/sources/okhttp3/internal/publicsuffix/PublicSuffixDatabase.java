package okhttp3.internal.publicsuffix;

import E.u;
import V9.b;
import b9.C1992A;
import c9.C2097r;
import c9.C2099t;
import da.h;
import ia.n;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import y9.q;

/* compiled from: PublicSuffixDatabase.kt */
/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f44941e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final List<String> f44942f = u.G("*");

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f44943g = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f44944a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f44945b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f44946c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f44947d;

    /* compiled from: PublicSuffixDatabase.kt */
    public static final class a {
        public static final String a(byte[] bArr, byte[][] bArr2, int i) {
            int i10;
            boolean z10;
            int i11;
            int i12;
            int i13 = -1;
            byte[] bArr3 = PublicSuffixDatabase.f44941e;
            int length = bArr.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = (i14 + length) / 2;
                while (i15 > i13 && bArr[i15] != 10) {
                    i15 += i13;
                }
                int i16 = i15 + 1;
                int i17 = 1;
                while (true) {
                    i10 = i16 + i17;
                    if (bArr[i10] == 10) {
                        break;
                    }
                    i17++;
                }
                int i18 = i10 - i16;
                int i19 = i;
                boolean z11 = false;
                int i20 = 0;
                int i21 = 0;
                while (true) {
                    if (z11) {
                        i11 = 46;
                        z10 = false;
                    } else {
                        byte b10 = bArr2[i19][i20];
                        byte[] bArr4 = b.f13053a;
                        int i22 = b10 & 255;
                        z10 = z11;
                        i11 = i22;
                    }
                    byte b11 = bArr[i16 + i21];
                    byte[] bArr5 = b.f13053a;
                    i12 = i11 - (b11 & 255);
                    if (i12 != 0) {
                        break;
                    }
                    i21++;
                    i20++;
                    if (i21 == i18) {
                        break;
                    }
                    if (bArr2[i19].length != i20) {
                        z11 = z10;
                    } else {
                        if (i19 == bArr2.length - 1) {
                            break;
                        }
                        i19++;
                        z11 = true;
                        i20 = -1;
                    }
                }
                if (i12 >= 0) {
                    if (i12 <= 0) {
                        int i23 = i18 - i21;
                        int length2 = bArr2[i19].length - i20;
                        int length3 = bArr2.length;
                        for (int i24 = i19 + 1; i24 < length3; i24++) {
                            length2 += bArr2[i24].length;
                        }
                        if (length2 >= i23) {
                            if (length2 <= i23) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                l.e(UTF_8, "UTF_8");
                                return new String(bArr, i16, i18, UTF_8);
                            }
                        }
                        length = i15;
                    }
                    i14 = i10 + 1;
                } else {
                    length = i15;
                }
                i13 = -1;
            }
            return null;
        }
    }

    public static List c(String str) {
        List listQ0 = q.q0(str, new char[]{'.'});
        return l.b(C2097r.v0(listQ0), "") ? C2097r.m0(listQ0) : listQ0;
    }

    public final String a(String str) throws InterruptedException {
        String strA;
        String strA2;
        String strA3;
        List<String> listQ0;
        String unicodeDomain = IDN.toUnicode(str);
        l.e(unicodeDomain, "unicodeDomain");
        List listC = c(unicodeDomain);
        if (this.f44944a.get() || !this.f44944a.compareAndSet(false, true)) {
            try {
                this.f44945b.await();
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
                        h hVar = h.f37600a;
                        h.f37600a.getClass();
                        h.i(5, "Failed to read public suffix list", e4);
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
        if (this.f44946c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = listC.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            String str2 = (String) listC.get(i);
            Charset UTF_8 = StandardCharsets.UTF_8;
            l.e(UTF_8, "UTF_8");
            byte[] bytes = str2.getBytes(UTF_8);
            l.e(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                strA = null;
                break;
            }
            byte[] bArr2 = this.f44946c;
            if (bArr2 == null) {
                l.l("publicSuffixListBytes");
                throw null;
            }
            strA = a.a(bArr2, bArr, i10);
            if (strA != null) {
                break;
            }
            i10++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i11 = 0; i11 < length; i11++) {
                bArr3[i11] = f44941e;
                byte[] bArr4 = this.f44946c;
                if (bArr4 == null) {
                    l.l("publicSuffixListBytes");
                    throw null;
                }
                strA2 = a.a(bArr4, bArr3, i11);
                if (strA2 != null) {
                    break;
                }
            }
            strA2 = null;
        } else {
            strA2 = null;
        }
        if (strA2 != null) {
            int i12 = size - 1;
            for (int i13 = 0; i13 < i12; i13++) {
                byte[] bArr5 = this.f44947d;
                if (bArr5 == null) {
                    l.l("publicSuffixExceptionListBytes");
                    throw null;
                }
                strA3 = a.a(bArr5, bArr, i13);
                if (strA3 != null) {
                    break;
                }
            }
            strA3 = null;
        } else {
            strA3 = null;
        }
        if (strA3 != null) {
            listQ0 = q.q0("!".concat(strA3), new char[]{'.'});
        } else if (strA == null && strA2 == null) {
            listQ0 = f44942f;
        } else {
            List<String> listQ02 = C2099t.f18581b;
            List<String> listQ03 = strA != null ? q.q0(strA, new char[]{'.'}) : listQ02;
            if (strA2 != null) {
                listQ02 = q.q0(strA2, new char[]{'.'});
            }
            listQ0 = listQ03.size() > listQ02.size() ? listQ03 : listQ02;
        }
        if (listC.size() != listQ0.size() || listQ0.get(0).charAt(0) == '!') {
            return x9.l.I(x9.l.E(C2097r.j0(c(str)), listQ0.get(0).charAt(0) == '!' ? listC.size() - listQ0.size() : listC.size() - (listQ0.size() + 1)), ".", null, 62);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    public final void b() throws IOException {
        try {
            w wVar = new w();
            w wVar2 = new w();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                ia.w wVarC = ia.q.c(new n(ia.q.g(resourceAsStream)));
                try {
                    long j4 = wVarC.readInt();
                    wVarC.F0(j4);
                    wVar.f43660b = wVarC.f38685c.F(j4);
                    long j10 = wVarC.readInt();
                    wVarC.F0(j10);
                    wVar2.f43660b = wVarC.f38685c.F(j10);
                    C1992A c1992a = C1992A.f18074a;
                    wVarC.close();
                    synchronized (this) {
                        T t10 = wVar.f43660b;
                        l.c(t10);
                        this.f44946c = (byte[]) t10;
                        T t11 = wVar2.f43660b;
                        l.c(t11);
                        this.f44947d = (byte[]) t11;
                    }
                } finally {
                }
            }
        } finally {
            this.f44945b.countDown();
        }
    }
}

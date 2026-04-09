package com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix;

import E.u;
import b9.C1992A;
import c9.C2097r;
import c9.C2099t;
import com.yandex.mobile.ads.impl.lh1;
import com.yandex.mobile.ads.impl.t82;
import ia.n;
import ia.q;
import ia.w;
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

/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f23651e = {42};

    /* renamed from: f, reason: collision with root package name */
    private static final List<String> f23652f = u.G("*");

    /* renamed from: g, reason: collision with root package name */
    private static final PublicSuffixDatabase f23653g = new PublicSuffixDatabase();

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f23654h = 0;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f23655a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final CountDownLatch f23656b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    private byte[] f23657c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f23658d;

    public static final class a {
        public /* synthetic */ a(int i) {
            this();
        }

        public static final String a(byte[] bArr, byte[][] bArr2, int i) {
            int i10;
            boolean z10;
            int i11;
            int i12;
            int i13 = -1;
            int i14 = PublicSuffixDatabase.f23654h;
            int length = bArr.length;
            int i15 = 0;
            while (i15 < length) {
                int i16 = (i15 + length) / 2;
                while (i16 > i13 && bArr[i16] != 10) {
                    i16 += i13;
                }
                int i17 = i16 + 1;
                int i18 = 1;
                while (true) {
                    i10 = i17 + i18;
                    if (bArr[i10] == 10) {
                        break;
                    }
                    i18++;
                }
                int i19 = i10 - i17;
                int i20 = i;
                boolean z11 = false;
                int i21 = 0;
                int i22 = 0;
                while (true) {
                    if (z11) {
                        i11 = 46;
                        z10 = false;
                    } else {
                        byte b10 = bArr2[i20][i21];
                        byte[] bArr3 = t82.f33480a;
                        int i23 = b10 & 255;
                        z10 = z11;
                        i11 = i23;
                    }
                    byte b11 = bArr[i17 + i22];
                    byte[] bArr4 = t82.f33480a;
                    i12 = i11 - (b11 & 255);
                    if (i12 != 0) {
                        break;
                    }
                    i22++;
                    i21++;
                    if (i22 == i19) {
                        break;
                    }
                    if (bArr2[i20].length != i21) {
                        z11 = z10;
                    } else {
                        if (i20 == bArr2.length - 1) {
                            break;
                        }
                        i20++;
                        z11 = true;
                        i21 = -1;
                    }
                }
                if (i12 >= 0) {
                    if (i12 <= 0) {
                        int i24 = i19 - i22;
                        int length2 = bArr2[i20].length - i21;
                        int length3 = bArr2.length;
                        for (int i25 = i20 + 1; i25 < length3; i25++) {
                            length2 += bArr2[i25].length;
                        }
                        if (length2 >= i24) {
                            if (length2 <= i24) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                l.e(UTF_8, "UTF_8");
                                return new String(bArr, i17, i19, UTF_8);
                            }
                        }
                        length = i16;
                    }
                    i15 = i10 + 1;
                } else {
                    length = i16;
                }
                i13 = -1;
            }
            return null;
        }

        private a() {
        }
    }

    private final void b() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        w wVarC = q.c(new n(q.g(resourceAsStream)));
        try {
            long j4 = wVarC.readInt();
            wVarC.F0(j4);
            byte[] bArrF = wVarC.f38685c.F(j4);
            long j10 = wVarC.readInt();
            wVarC.F0(j10);
            byte[] bArrF2 = wVarC.f38685c.F(j10);
            C1992A c1992a = C1992A.f18074a;
            wVarC.close();
            synchronized (this) {
                this.f23657c = bArrF;
                this.f23658d = bArrF2;
            }
            this.f23656b.countDown();
        } finally {
        }
    }

    public final String a(String domain) throws InterruptedException {
        int size;
        int size2;
        l.f(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        l.c(unicode);
        List<String> listQ0 = y9.q.q0(unicode, new char[]{'.'});
        if (l.b(C2097r.v0(listQ0), "")) {
            listQ0 = C2097r.m0(listQ0);
        }
        List<String> listA = a(listQ0);
        if (listQ0.size() == listA.size() && listA.get(0).charAt(0) != '!') {
            return null;
        }
        if (listA.get(0).charAt(0) == '!') {
            size = listQ0.size();
            size2 = listA.size();
        } else {
            size = listQ0.size();
            size2 = listA.size() + 1;
        }
        int i = size - size2;
        List listQ02 = y9.q.q0(domain, new char[]{'.'});
        if (l.b(C2097r.v0(listQ02), "")) {
            listQ02 = C2097r.m0(listQ02);
        }
        return x9.l.I(x9.l.E(C2097r.j0(listQ02), i), ".", null, 62);
    }

    private final List<String> a(List<String> list) throws InterruptedException {
        String str;
        String strA;
        String strA2;
        if (this.f23655a.get() || !this.f23655a.compareAndSet(false, true)) {
            try {
                this.f23656b.await();
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
                        int i = lh1.f30001c;
                        lh1.f29999a.getClass();
                        lh1.a(5, "Failed to read public suffix list", e4);
                        if (z10) {
                        }
                    }
                } catch (Throwable th) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f23657c != null) {
            int size = list.size();
            byte[][] bArr = new byte[size][];
            for (int i10 = 0; i10 < size; i10++) {
                String str2 = list.get(i10);
                Charset UTF_8 = StandardCharsets.UTF_8;
                l.e(UTF_8, "UTF_8");
                byte[] bytes = str2.getBytes(UTF_8);
                l.e(bytes, "getBytes(...)");
                bArr[i10] = bytes;
            }
            int i11 = 0;
            while (true) {
                str = null;
                if (i11 >= size) {
                    strA = null;
                    break;
                }
                byte[] bArr2 = this.f23657c;
                if (bArr2 == null) {
                    l.l("publicSuffixListBytes");
                    throw null;
                }
                strA = a.a(bArr2, bArr, i11);
                if (strA != null) {
                    break;
                }
                i11++;
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                for (int i12 = 0; i12 < length; i12++) {
                    bArr3[i12] = f23651e;
                    byte[] bArr4 = this.f23657c;
                    if (bArr4 == null) {
                        l.l("publicSuffixListBytes");
                        throw null;
                    }
                    strA2 = a.a(bArr4, bArr3, i12);
                    if (strA2 != null) {
                        break;
                    }
                }
                strA2 = null;
            } else {
                strA2 = null;
            }
            if (strA2 != null) {
                int i13 = size - 1;
                int i14 = 0;
                while (true) {
                    if (i14 >= i13) {
                        break;
                    }
                    byte[] bArr5 = this.f23658d;
                    if (bArr5 == null) {
                        l.l("publicSuffixExceptionListBytes");
                        throw null;
                    }
                    String strA3 = a.a(bArr5, bArr, i14);
                    if (strA3 != null) {
                        str = strA3;
                        break;
                    }
                    i14++;
                }
            }
            if (str != null) {
                return y9.q.q0("!".concat(str), new char[]{'.'});
            }
            if (strA == null && strA2 == null) {
                return f23652f;
            }
            List<String> listQ0 = C2099t.f18581b;
            List<String> listQ02 = strA != null ? y9.q.q0(strA, new char[]{'.'}) : listQ0;
            if (strA2 != null) {
                listQ0 = y9.q.q0(strA2, new char[]{'.'});
            }
            return listQ02.size() > listQ0.size() ? listQ02 : listQ0;
        }
        throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
    }
}

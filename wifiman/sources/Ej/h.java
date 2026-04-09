package ej;

import Zg.AbstractC3682n;
import fj.AbstractC5835b;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.asn1.BER;

/* loaded from: classes4.dex */
public class h implements Serializable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final a f46470d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final h f46471e = new h(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f46472a;

    /* renamed from: b, reason: collision with root package name */
    private transient int f46473b;

    /* renamed from: c, reason: collision with root package name */
    private transient String f46474c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ h f(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = AbstractC5478b.c();
            }
            return aVar.e(bArr, i10, i11);
        }

        public final h a(String str) {
            AbstractC6492s.i(str, "<this>");
            byte[] bArrA = AbstractC5477a.a(str);
            if (bArrA != null) {
                return new h(bArrA);
            }
            return null;
        }

        public final h b(String str) {
            AbstractC6492s.i(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((AbstractC5835b.e(str.charAt(i11)) << 4) + AbstractC5835b.e(str.charAt(i11 + 1)));
            }
            return new h(bArr);
        }

        public final h c(String str, Charset charset) {
            AbstractC6492s.i(str, "<this>");
            AbstractC6492s.i(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            AbstractC6492s.h(bytes, "getBytes(...)");
            return new h(bytes);
        }

        public final h d(String str) {
            AbstractC6492s.i(str, "<this>");
            h hVar = new h(G.a(str));
            hVar.K(str);
            return hVar;
        }

        public final h e(byte[] bArr, int i10, int i11) {
            AbstractC6492s.i(bArr, "<this>");
            int iF = AbstractC5478b.f(bArr, i11);
            AbstractC5478b.b(bArr.length, i10, iF);
            return new h(AbstractC3682n.r(bArr, i10, iF + i10));
        }

        private a() {
        }
    }

    public h(byte[] data) {
        AbstractC6492s.i(data, "data");
        this.f46472a = data;
    }

    public static final h g(String str) {
        return f46470d.b(str);
    }

    public static final h j(String str) {
        return f46470d.d(str);
    }

    public final h B() {
        return h("MD5");
    }

    public boolean C(int i10, h other, int i11, int i12) {
        AbstractC6492s.i(other, "other");
        return other.E(i11, n(), i10, i12);
    }

    public void C0(C5481e buffer, int i10, int i11) {
        AbstractC6492s.i(buffer, "buffer");
        AbstractC5835b.d(this, buffer, i10, i11);
    }

    public boolean E(int i10, byte[] other, int i11, int i12) {
        AbstractC6492s.i(other, "other");
        return i10 >= 0 && i10 <= n().length - i12 && i11 >= 0 && i11 <= other.length - i12 && AbstractC5478b.a(n(), i10, other, i11, i12);
    }

    public final void J(int i10) {
        this.f46473b = i10;
    }

    public final void K(String str) {
        this.f46474c = str;
    }

    public final h P() {
        return h("SHA-1");
    }

    public final h T() {
        return h("SHA-256");
    }

    public ByteBuffer a() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(this.f46472a).asReadOnlyBuffer();
        AbstractC6492s.h(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    public final int b0() {
        return r();
    }

    public String c() {
        return AbstractC5477a.c(n(), null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(ej.h r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.AbstractC6492s.i(r10, r0)
            int r0 = r9.b0()
            int r1 = r10.b0()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.l(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.l(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ej.h.compareTo(ej.h):int");
    }

    public final boolean d0(h prefix) {
        AbstractC6492s.i(prefix, "prefix");
        return C(0, prefix, 0, prefix.b0());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.b0() == n().length && hVar.E(0, n(), 0, n().length)) {
                return true;
            }
        }
        return false;
    }

    public h f0() {
        for (int i10 = 0; i10 < n().length; i10++) {
            byte b10 = n()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrN = n();
                byte[] bArrCopyOf = Arrays.copyOf(bArrN, bArrN.length);
                AbstractC6492s.h(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + BER.ASN_CONSTRUCTOR);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + BER.ASN_CONSTRUCTOR);
                    }
                }
                return new h(bArrCopyOf);
            }
        }
        return this;
    }

    public h h(String algorithm) throws NoSuchAlgorithmException {
        AbstractC6492s.i(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f46472a, 0, b0());
        byte[] bArrDigest = messageDigest.digest();
        AbstractC6492s.f(bArrDigest);
        return new h(bArrDigest);
    }

    public int hashCode() {
        int iP = p();
        if (iP != 0) {
            return iP;
        }
        int iHashCode = Arrays.hashCode(n());
        J(iHashCode);
        return iHashCode;
    }

    public final byte l(int i10) {
        return y(i10);
    }

    public final byte[] n() {
        return this.f46472a;
    }

    public final int p() {
        return this.f46473b;
    }

    public String q0() {
        String strS = s();
        if (strS != null) {
            return strS;
        }
        String strB = G.b(v());
        K(strB);
        return strB;
    }

    public int r() {
        return n().length;
    }

    public final String s() {
        return this.f46474c;
    }

    public String t() {
        char[] cArr = new char[n().length * 2];
        int i10 = 0;
        for (byte b10 : n()) {
            int i11 = i10 + 1;
            cArr[i10] = AbstractC5835b.f()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = AbstractC5835b.f()[b10 & 15];
        }
        return kotlin.text.t.v(cArr);
    }

    public String toString() {
        String str;
        if (n().length == 0) {
            str = "[size=0]";
        } else {
            int iC = AbstractC5835b.c(n(), 64);
            if (iC != -1) {
                String strQ0 = q0();
                String strSubstring = strQ0.substring(0, iC);
                AbstractC6492s.h(strSubstring, "substring(...)");
                String strL = kotlin.text.t.L(kotlin.text.t.L(kotlin.text.t.L(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (iC >= strQ0.length()) {
                    return "[text=" + strL + ']';
                }
                return "[size=" + n().length + " text=" + strL + "…]";
            }
            if (n().length > 64) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(n().length);
                sb2.append(" hex=");
                int iE = AbstractC5478b.e(this, 64);
                if (iE <= n().length) {
                    if (iE < 0) {
                        throw new IllegalArgumentException("endIndex < beginIndex");
                    }
                    sb2.append((iE == n().length ? this : new h(AbstractC3682n.r(n(), 0, iE))).t());
                    sb2.append("…]");
                    return sb2.toString();
                }
                throw new IllegalArgumentException(("endIndex > length(" + n().length + ')').toString());
            }
            str = "[hex=" + t() + ']';
        }
        return str;
    }

    public byte[] v() {
        return n();
    }

    public byte y(int i10) {
        return n()[i10];
    }
}

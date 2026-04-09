package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class jc implements Serializable, Comparable {
    public static final char[] i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final jc j = new jc((byte[]) new byte[0].clone());
    public final byte[] f;
    public transient int g;
    public transient String h;

    public jc(byte[] bArr) {
        this.f = bArr;
    }

    public static jc a(String str) {
        jc jcVar = new jc(str.getBytes(j41.a));
        jcVar.h = str;
        return jcVar;
    }

    public byte b(int i2) {
        return this.f[i2];
    }

    public String c() {
        byte[] bArr = this.f;
        char[] cArr = new char[bArr.length * 2];
        int i2 = 0;
        for (byte b : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = i;
            cArr[i2] = cArr2[(b >> 4) & 15];
            i2 += 2;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        jc jcVar = (jc) obj;
        int iG = g();
        int iG2 = jcVar.g();
        int iMin = Math.min(iG, iG2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iB = b(i2) & 255;
            int iB2 = jcVar.b(i2) & 255;
            if (iB != iB2) {
                return iB < iB2 ? -1 : 1;
            }
        }
        if (iG == iG2) {
            return 0;
        }
        return iG < iG2 ? -1 : 1;
    }

    public byte[] d() {
        return this.f;
    }

    public boolean e(int i2, int i3, int i4, byte[] bArr) {
        if (i2 >= 0) {
            byte[] bArr2 = this.f;
            if (i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4) {
                Charset charset = j41.a;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (bArr2[i5 + i2] == bArr[i5 + i3]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jc) {
            jc jcVar = (jc) obj;
            int iG = jcVar.g();
            byte[] bArr = this.f;
            if (iG == bArr.length && jcVar.e(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(jc jcVar, int i2) {
        return jcVar.e(0, 0, i2, this.f);
    }

    public int g() {
        return this.f.length;
    }

    public jc h() {
        byte[] bArr = this.f;
        if (64 > bArr.length) {
            throw new IllegalArgumentException(ex0.i(new StringBuilder("endIndex > length("), bArr.length, ")"));
        }
        if (64 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, 64);
        return new jc(bArr2);
    }

    public int hashCode() {
        int i2 = this.g;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.f);
        this.g = iHashCode;
        return iHashCode;
    }

    public String i() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f, j41.a);
        this.h = str2;
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        r4 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            byte[] r0 = r10.f
            int r1 = r0.length
            if (r1 != 0) goto L8
            java.lang.String r0 = "[size=0]"
            return r0
        L8:
            java.lang.String r1 = r10.i()
            int r2 = r1.length()
            r3 = 0
            r4 = r3
            r5 = r4
        L13:
            r6 = -1
            r7 = 64
            if (r4 >= r2) goto L3c
            if (r5 != r7) goto L1b
            goto L40
        L1b:
            int r8 = r1.codePointAt(r4)
            boolean r9 = java.lang.Character.isISOControl(r8)
            if (r9 == 0) goto L2d
            r9 = 10
            if (r8 == r9) goto L2d
            r9 = 13
            if (r8 != r9) goto L32
        L2d:
            r9 = 65533(0xfffd, float:9.1831E-41)
            if (r8 != r9) goto L34
        L32:
            r4 = r6
            goto L40
        L34:
            int r5 = r5 + 1
            int r6 = java.lang.Character.charCount(r8)
            int r4 = r4 + r6
            goto L13
        L3c:
            int r4 = r1.length()
        L40:
            java.lang.String r2 = "…]"
            java.lang.String r5 = "[size="
            java.lang.String r8 = "]"
            if (r4 != r6) goto L82
            int r1 = r0.length
            if (r1 > r7) goto L61
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[hex="
            r0.<init>(r1)
            java.lang.String r1 = r10.c()
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            return r0
        L61:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            int r0 = r0.length
            r1.append(r0)
            java.lang.String r0 = " hex="
            r1.append(r0)
            jc r0 = r10.h()
            java.lang.String r0 = r0.c()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
        L82:
            java.lang.String r3 = r1.substring(r3, r4)
            java.lang.String r6 = "\\"
            java.lang.String r7 = "\\\\"
            java.lang.String r3 = r3.replace(r6, r7)
            java.lang.String r6 = "\n"
            java.lang.String r7 = "\\n"
            java.lang.String r3 = r3.replace(r6, r7)
            java.lang.String r6 = "\r"
            java.lang.String r7 = "\\r"
            java.lang.String r3 = r3.replace(r6, r7)
            int r1 = r1.length()
            if (r4 >= r1) goto Lbd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            int r0 = r0.length
            r1.append(r0)
            java.lang.String r0 = " text="
            r1.append(r0)
            r1.append(r3)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
        Lbd:
            java.lang.String r0 = "[text="
            java.lang.String r0 = defpackage.ex0.h(r0, r3, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc.toString():java.lang.String");
    }
}

package com.bytedance.sdk.component.vt.ouw.vt;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class yu implements Serializable, Comparable<yu> {
    transient int fkw;

    /* renamed from: le, reason: collision with root package name */
    transient String f7673le;
    final byte[] yu;
    static final char[] ouw = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Charset vt = Charset.forName("UTF-8");

    /* renamed from: lh, reason: collision with root package name */
    public static final yu f7672lh = new yu((byte[]) new byte[0].clone());

    public yu(byte[] bArr) {
        this.yu = bArr;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(yu yuVar) {
        yu yuVar2 = yuVar;
        int iLh = lh();
        int iLh2 = yuVar2.lh();
        int iMin = Math.min(iLh, iLh2);
        for (int i4 = 0; i4 < iMin; i4++) {
            int iOuw = ouw(i4) & 255;
            int iOuw2 = yuVar2.ouw(i4) & 255;
            if (iOuw != iOuw2) {
                return iOuw < iOuw2 ? -1 : 1;
            }
        }
        if (iLh == iLh2) {
            return 0;
        }
        return iLh < iLh2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yu) {
            yu yuVar = (yu) obj;
            int iLh = yuVar.lh();
            byte[] bArr = this.yu;
            if (iLh == bArr.length && yuVar.ouw(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i4 = this.fkw;
        if (i4 != 0) {
            return i4;
        }
        int iHashCode = Arrays.hashCode(this.yu);
        this.fkw = iHashCode;
        return iHashCode;
    }

    public int lh() {
        return this.yu.length;
    }

    public String ouw() {
        String str = this.f7673le;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.yu, vt);
        this.f7673le = str2;
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        r3 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            byte[] r0 = r9.yu
            int r0 = r0.length
            if (r0 != 0) goto L8
            java.lang.String r0 = "[size=0]"
            return r0
        L8:
            java.lang.String r0 = r9.ouw()
            int r1 = r0.length()
            r2 = 0
            r3 = r2
            r4 = r3
        L13:
            r5 = -1
            r6 = 64
            if (r3 >= r1) goto L3c
            if (r4 != r6) goto L1b
            goto L40
        L1b:
            int r7 = r0.codePointAt(r3)
            boolean r8 = java.lang.Character.isISOControl(r7)
            if (r8 == 0) goto L2d
            r8 = 10
            if (r7 == r8) goto L2d
            r8 = 13
            if (r7 != r8) goto L32
        L2d:
            r8 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r8) goto L34
        L32:
            r3 = r5
            goto L40
        L34:
            int r4 = r4 + 1
            int r5 = java.lang.Character.charCount(r7)
            int r3 = r3 + r5
            goto L13
        L3c:
            int r3 = r0.length()
        L40:
            java.lang.String r1 = "…]"
            java.lang.String r4 = "[size="
            java.lang.String r7 = "]"
            if (r3 != r5) goto L86
            byte[] r0 = r9.yu
            int r0 = r0.length
            if (r0 > r6) goto L63
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[hex="
            r0.<init>(r1)
            java.lang.String r1 = r9.vt()
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            return r0
        L63:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            byte[] r3 = r9.yu
            int r3 = r3.length
            r0.append(r3)
            java.lang.String r3 = " hex="
            r0.append(r3)
            com.bytedance.sdk.component.vt.ouw.vt.yu r2 = r9.ouw(r2, r6)
            java.lang.String r2 = r2.vt()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L86:
            java.lang.String r2 = r0.substring(r2, r3)
            java.lang.String r5 = "\\"
            java.lang.String r6 = "\\\\"
            java.lang.String r2 = r2.replace(r5, r6)
            java.lang.String r5 = "\n"
            java.lang.String r6 = "\\n"
            java.lang.String r2 = r2.replace(r5, r6)
            java.lang.String r5 = "\r"
            java.lang.String r6 = "\\r"
            java.lang.String r2 = r2.replace(r5, r6)
            int r0 = r0.length()
            if (r3 >= r0) goto Lc3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            byte[] r3 = r9.yu
            int r3 = r3.length
            r0.append(r3)
            java.lang.String r3 = " text="
            r0.append(r3)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        Lc3:
            java.lang.String r0 = "[text="
            java.lang.String r0 = d.h.t(r0, r2, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.vt.ouw.vt.yu.toString():java.lang.String");
    }

    public String vt() {
        byte[] bArr = this.yu;
        char[] cArr = new char[bArr.length * 2];
        int i4 = 0;
        for (byte b10 : bArr) {
            int i10 = i4 + 1;
            char[] cArr2 = ouw;
            cArr[i4] = cArr2[(b10 >> 4) & 15];
            i4 += 2;
            cArr[i10] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] yu() {
        return (byte[]) this.yu.clone();
    }

    public yu ouw(int i4, int i10) {
        if (i4 >= 0) {
            byte[] bArr = this.yu;
            if (i10 > bArr.length) {
                throw new IllegalArgumentException(c.j(this.yu.length, ")", new StringBuilder("endIndex > length(")));
            }
            int i11 = i10 - i4;
            if (i11 >= 0) {
                if (i4 == 0 && i10 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i11];
                System.arraycopy(bArr, i4, bArr2, 0, i11);
                return new yu(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte ouw(int i4) {
        return this.yu[i4];
    }

    public boolean ouw(int i4, byte[] bArr, int i10, int i11) {
        if (i4 < 0) {
            return false;
        }
        byte[] bArr2 = this.yu;
        return i4 <= bArr2.length - i11 && i10 >= 0 && i10 <= bArr.length - i11 && bly.ouw(bArr2, i4, bArr, i10, i11);
    }
}

package ba;

import ia.h;

/* compiled from: Http2.kt */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f18138a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final ia.h f18139b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f18140c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f18141d;

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f18142e;

    static {
        ia.h hVar = ia.h.f38646e;
        f18139b = h.a.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f18140c = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f18141d = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            kotlin.jvm.internal.l.e(binaryString, "toBinaryString(it)");
            strArr[i] = y9.n.Y(' ', '0', V9.b.h("%8s", binaryString));
        }
        f18142e = strArr;
        String[] strArr2 = f18141d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i10 = iArr[0];
        strArr2[i10 | 8] = B4.f.c(new StringBuilder(), strArr2[i10], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            int i13 = iArr[0];
            String[] strArr3 = f18141d;
            int i14 = i13 | i12;
            strArr3[i14] = strArr3[i13] + '|' + strArr3[i12];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i13]);
            sb.append('|');
            strArr3[i14 | 8] = B4.f.c(sb, strArr3[i12], "|PADDED");
        }
        int length = f18141d.length;
        for (int i15 = 0; i15 < length; i15++) {
            String[] strArr4 = f18141d;
            if (strArr4[i15] == null) {
                strArr4[i15] = f18142e[i15];
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r0 = 5
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 4
            r5 = 1
            java.lang.String[] r6 = ba.e.f18140c
            int r7 = r6.length
            if (r13 >= r7) goto Le
            r6 = r6[r13]
            goto L1c
        Le:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r3] = r6
            java.lang.String r6 = "0x%02x"
            java.lang.String r6 = V9.b.h(r6, r7)
        L1c:
            if (r14 != 0) goto L21
            java.lang.String r13 = ""
            goto L6a
        L21:
            java.lang.String[] r7 = ba.e.f18142e
            if (r13 == r2) goto L68
            if (r13 == r1) goto L68
            if (r13 == r4) goto L60
            r8 = 6
            if (r13 == r8) goto L60
            r8 = 7
            if (r13 == r8) goto L68
            r8 = 8
            if (r13 == r8) goto L68
            java.lang.String[] r8 = ba.e.f18141d
            int r9 = r8.length
            if (r14 >= r9) goto L3e
            r7 = r8[r14]
            kotlin.jvm.internal.l.c(r7)
            goto L40
        L3e:
            r7 = r7[r14]
        L40:
            if (r13 != r0) goto L4f
            r8 = r14 & 4
            if (r8 == 0) goto L4f
            java.lang.String r13 = "HEADERS"
            java.lang.String r14 = "PUSH_PROMISE"
            java.lang.String r13 = y9.n.X(r7, r13, r14)
            goto L6a
        L4f:
            if (r13 != 0) goto L5e
            r13 = r14 & 32
            if (r13 == 0) goto L5e
            java.lang.String r13 = "PRIORITY"
            java.lang.String r14 = "COMPRESSED"
            java.lang.String r13 = y9.n.X(r7, r13, r14)
            goto L6a
        L5e:
            r13 = r7
            goto L6a
        L60:
            if (r14 != r5) goto L65
            java.lang.String r13 = "ACK"
            goto L6a
        L65:
            r13 = r7[r14]
            goto L6a
        L68:
            r13 = r7[r14]
        L6a:
            if (r10 == 0) goto L6f
            java.lang.String r10 = "<<"
            goto L71
        L6f:
            java.lang.String r10 = ">>"
        L71:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r14 = new java.lang.Object[r0]
            r14[r3] = r10
            r14[r5] = r11
            r14[r2] = r12
            r14[r1] = r6
            r14[r4] = r13
            java.lang.String r10 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r10 = V9.b.h(r10, r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.e.a(boolean, int, int, int, int):java.lang.String");
    }
}

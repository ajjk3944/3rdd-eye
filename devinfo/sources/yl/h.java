package yl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final hm.h f37699a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f37700b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f37701c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f37702d;

    static {
        hm.h hVar = hm.h.f25175d;
        f37699a = ec.y.f("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f37700b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f37701c = new String[64];
        String[] strArr = new String[256];
        for (int i4 = 0; i4 < 256; i4++) {
            String binaryString = Integer.toBinaryString(i4);
            nk.k.d(binaryString, "toBinaryString(...)");
            strArr[i4] = vk.p.t0(sl.h.d("%8s", binaryString), ' ', '0');
        }
        f37702d = strArr;
        String[] strArr2 = f37701c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i10 = iArr[0];
        strArr2[i10 | 8] = d.h.w(new StringBuilder(), strArr2[i10], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            int i13 = iArr[0];
            String[] strArr3 = f37701c;
            int i14 = i13 | i12;
            strArr3[i14] = strArr3[i13] + '|' + strArr3[i12];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i13]);
            sb2.append('|');
            strArr3[i14 | 8] = d.h.w(sb2, strArr3[i12], "|PADDED");
        }
        int length = f37701c.length;
        for (int i15 = 0; i15 < length; i15++) {
            String[] strArr4 = f37701c;
            if (strArr4[i15] == null) {
                strArr4[i15] = f37702d[i15];
            }
        }
    }

    public static String a(int i4) {
        String[] strArr = f37700b;
        return i4 < strArr.length ? strArr[i4] : sl.h.d("0x%02x", Integer.valueOf(i4));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(boolean r9, int r10, int r11, int r12, int r13) {
        /*
            java.lang.String r0 = a(r12)
            r1 = 1
            r2 = 5
            r3 = 3
            r4 = 2
            r5 = 4
            if (r13 != 0) goto Le
            java.lang.String r12 = ""
            goto L57
        Le:
            java.lang.String[] r6 = yl.h.f37702d
            if (r12 == r4) goto L55
            if (r12 == r3) goto L55
            if (r12 == r5) goto L4d
            r7 = 6
            if (r12 == r7) goto L4d
            r7 = 7
            if (r12 == r7) goto L55
            r7 = 8
            if (r12 == r7) goto L55
            java.lang.String[] r7 = yl.h.f37701c
            int r8 = r7.length
            if (r13 >= r8) goto L2b
            r6 = r7[r13]
            nk.k.b(r6)
            goto L2d
        L2b:
            r6 = r6[r13]
        L2d:
            if (r12 != r2) goto L3c
            r7 = r13 & 4
            if (r7 == 0) goto L3c
            java.lang.String r12 = "HEADERS"
            java.lang.String r13 = "PUSH_PROMISE"
            java.lang.String r12 = vk.p.u0(r6, r12, r13)
            goto L57
        L3c:
            if (r12 != 0) goto L4b
            r12 = r13 & 32
            if (r12 == 0) goto L4b
            java.lang.String r12 = "PRIORITY"
            java.lang.String r13 = "COMPRESSED"
            java.lang.String r12 = vk.p.u0(r6, r12, r13)
            goto L57
        L4b:
            r12 = r6
            goto L57
        L4d:
            if (r13 != r1) goto L52
            java.lang.String r12 = "ACK"
            goto L57
        L52:
            r12 = r6[r13]
            goto L57
        L55:
            r12 = r6[r13]
        L57:
            if (r9 == 0) goto L5c
            java.lang.String r9 = "<<"
            goto L5e
        L5c:
            java.lang.String r9 = ">>"
        L5e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r2 = 0
            r13[r2] = r9
            r13[r1] = r10
            r13[r4] = r11
            r13[r3] = r0
            r13[r5] = r12
            java.lang.String r9 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r9 = sl.h.d(r9, r13)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yl.h.b(boolean, int, int, int, int):java.lang.String");
    }

    public static String c(int i4, int i10, long j, boolean z3) {
        return sl.h.d("%s 0x%08x %5d %-13s %d", z3 ? "<<" : ">>", Integer.valueOf(i4), Integer.valueOf(i10), a(8), Long.valueOf(j));
    }
}

package com.yandex.mobile.ads.impl;

import N7.G8;
import ia.h;

/* loaded from: classes3.dex */
public final class rg0 {

    /* renamed from: a, reason: collision with root package name */
    public static final rg0 f32624a = new rg0();

    /* renamed from: b, reason: collision with root package name */
    public static final ia.h f32625b;

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f32626c;

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f32627d;

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f32628e;

    static {
        ia.h hVar = ia.h.f38646e;
        f32625b = h.a.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f32626c = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f32627d = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            kotlin.jvm.internal.l.e(binaryString, "toBinaryString(...)");
            strArr[i] = y9.n.Y(' ', '0', t82.a("%8s", binaryString));
        }
        f32628e = strArr;
        String[] strArr2 = f32627d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i10 = iArr[0];
        strArr2[i10 | 8] = G8.s(strArr2[i10], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            int i13 = iArr[0];
            String[] strArr3 = f32627d;
            int i14 = i13 | i12;
            strArr3[i14] = B4.g.o(strArr3[i13], "|", strArr3[i12]);
            strArr3[i14 | 8] = F3.h.i(strArr3[i13], "|", strArr3[i12], "|PADDED");
        }
        int length = f32627d.length;
        for (int i15 = 0; i15 < length; i15++) {
            String[] strArr4 = f32627d;
            if (strArr4[i15] == null) {
                strArr4[i15] = f32628e[i15];
            }
        }
    }

    private rg0() {
    }

    public static String a(int i) {
        String[] strArr = f32626c;
        return i < strArr.length ? strArr[i] : t82.a("0x%02x", Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            r0 = 1
            r1 = 5
            r2 = 3
            r3 = 2
            r4 = 4
            java.lang.String r5 = a(r11)
            if (r12 != 0) goto Le
            java.lang.String r11 = ""
            goto L5b
        Le:
            if (r11 == r3) goto L57
            if (r11 == r2) goto L57
            if (r11 == r4) goto L4d
            r6 = 6
            if (r11 == r6) goto L4d
            r6 = 7
            if (r11 == r6) goto L57
            r6 = 8
            if (r11 == r6) goto L57
            java.lang.String[] r6 = com.yandex.mobile.ads.impl.rg0.f32627d
            int r7 = r6.length
            if (r12 >= r7) goto L29
            r6 = r6[r12]
            kotlin.jvm.internal.l.c(r6)
            goto L2d
        L29:
            java.lang.String[] r6 = com.yandex.mobile.ads.impl.rg0.f32628e
            r6 = r6[r12]
        L2d:
            if (r11 != r1) goto L3c
            r7 = r12 & 4
            if (r7 == 0) goto L3c
            java.lang.String r11 = "HEADERS"
            java.lang.String r12 = "PUSH_PROMISE"
            java.lang.String r11 = y9.n.X(r6, r11, r12)
            goto L5b
        L3c:
            if (r11 != 0) goto L4b
            r11 = r12 & 32
            if (r11 == 0) goto L4b
            java.lang.String r11 = "PRIORITY"
            java.lang.String r12 = "COMPRESSED"
            java.lang.String r11 = y9.n.X(r6, r11, r12)
            goto L5b
        L4b:
            r11 = r6
            goto L5b
        L4d:
            if (r12 != r0) goto L52
            java.lang.String r11 = "ACK"
            goto L5b
        L52:
            java.lang.String[] r11 = com.yandex.mobile.ads.impl.rg0.f32628e
            r11 = r11[r12]
            goto L5b
        L57:
            java.lang.String[] r11 = com.yandex.mobile.ads.impl.rg0.f32628e
            r11 = r11[r12]
        L5b:
            if (r8 == 0) goto L60
            java.lang.String r8 = "<<"
            goto L62
        L60:
            java.lang.String r8 = ">>"
        L62:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r1 = 0
            r12[r1] = r8
            r12[r0] = r9
            r12[r3] = r10
            r12[r2] = r5
            r12[r4] = r11
            java.lang.String r8 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r8 = com.yandex.mobile.ads.impl.t82.a(r8, r12)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rg0.a(boolean, int, int, int, int):java.lang.String");
    }
}

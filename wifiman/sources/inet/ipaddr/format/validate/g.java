package inet.ipaddr.format.validate;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final Integer[] f49380a = new Integer[javax.jmdns.impl.constants.d.CLASS_MASK];

    static {
        for (int i10 = 0; i10 <= 128; i10++) {
            f49380a[i10] = Integer.valueOf(i10);
        }
    }

    public static Integer a(int i10) {
        if (i10 >= 0) {
            Integer[] numArr = f49380a;
            if (i10 < numArr.length) {
                Integer num = numArr[i10];
                if (num != null) {
                    return num;
                }
                Integer numValueOf = Integer.valueOf(i10);
                numArr[i10] = numValueOf;
                return numValueOf;
            }
        }
        return Integer.valueOf(i10);
    }

    public static Integer b(int i10, int i11) {
        if (i11 <= 0) {
            return a(0);
        }
        if (i11 <= i10) {
            return a(i11);
        }
        return null;
    }

    public static int c(int i10, int i11, int i12) {
        return i11 > 1 ? i11 == 2 ? i10 >> 4 : i10 / i12 : i10 >> 3;
    }

    public static Integer d(int i10, int i11, int i12) {
        return a((i10 == 8 ? i12 << 3 : i10 == 16 ? i12 << 4 : i10 * i12) + i11);
    }

    public static int e(int i10, int i11, int i12) {
        return i11 > 1 ? i11 == 2 ? (i10 - 1) >> 4 : (i10 - 1) / i12 : (i10 - 1) >> 3;
    }

    public static Integer f(int i10, int i11, int i12) {
        return b(i10, i11 - (i10 == 8 ? i12 << 3 : i10 == 16 ? i12 << 4 : i12 * i10));
    }

    public static Integer g(int i10, Integer num, int i11) {
        if (num != null) {
            return f(i10, num.intValue(), i11);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab A[LOOP:0: B:26:0x004b->B:66:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ad A[EDGE_INSN: B:69:0x00ad->B:67:0x00ad BREAK  A[LOOP:0: B:26:0x004b->B:66:0x00ab], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean h(inet.ipaddr.a.InterfaceC1855a r3, inet.ipaddr.a.InterfaceC1855a r4, int r5, int r6, int r7, int r8, java.lang.Integer r9, inet.ipaddr.c.b r10, boolean r11) {
        /*
            r0 = 0
            if (r9 == 0) goto Lae
            boolean r1 = r10.prefixedSubnetsAreExplicit()
            if (r1 == 0) goto Lb
            goto Lae
        Lb:
            int r1 = r9.intValue()
            if (r1 >= 0) goto L16
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            goto L2d
        L16:
            r1 = 8
            if (r7 != r1) goto L1d
            int r1 = r5 << 3
            goto L26
        L1d:
            r1 = 16
            if (r7 != r1) goto L24
            int r1 = r5 << 4
            goto L26
        L24:
            int r1 = r5 * r7
        L26:
            int r2 = r9.intValue()
            if (r2 < r1) goto L2d
            return r0
        L2d:
            boolean r10 = r10.allPrefixedAddressesAreSubnets()
            r1 = 1
            if (r10 == 0) goto L35
            return r1
        L35:
            int r10 = r9.intValue()
            int r6 = c(r10, r6, r7)
            if (r6 >= r5) goto Lad
            int r9 = r9.intValue()
            java.lang.Integer r9 = f(r7, r9, r6)
            int r9 = r9.intValue()
        L4b:
            int r10 = r3.a(r6)
            if (r9 != 0) goto L6b
            if (r10 == 0) goto L54
            return r0
        L54:
            int r9 = r4.a(r6)
            if (r11 == 0) goto L5d
            if (r9 == r8) goto La6
            return r0
        L5d:
            int r10 = ~r9
            int r10 = java.lang.Integer.numberOfTrailingZeros(r10)
            if (r10 <= 0) goto L68
            int r9 = r9 >>> r10
            if (r9 == 0) goto La5
            return r0
        L68:
            if (r9 == 0) goto La6
            return r0
        L6b:
            if (r9 >= r7) goto La6
            int r9 = r7 - r9
            r2 = -1
            if (r11 == 0) goto L81
            int r9 = r2 << r9
            int r9 = ~r9
            r10 = r10 & r9
            if (r10 == 0) goto L79
            return r0
        L79:
            int r10 = r4.a(r6)
            r10 = r10 & r9
            if (r10 == r9) goto La6
            return r0
        L81:
            int r10 = java.lang.Integer.numberOfTrailingZeros(r10)
            if (r10 >= r9) goto L88
            return r0
        L88:
            int r10 = r4.a(r6)
            int r11 = ~r10
            int r11 = java.lang.Integer.numberOfTrailingZeros(r11)
            if (r11 >= r9) goto La5
            int r2 = r2 << r7
            r10 = r10 | r2
            int r10 = r10 >>> r11
            int r10 = java.lang.Integer.numberOfTrailingZeros(r10)
            int r10 = r10 + r11
            if (r10 >= r9) goto L9e
            return r0
        L9e:
            if (r11 <= 0) goto La2
            r9 = r1
            goto La3
        La2:
            r9 = r0
        La3:
            r11 = r9
            goto La6
        La5:
            r11 = r1
        La6:
            int r6 = r6 + 1
            if (r6 < r5) goto Lab
            goto Lad
        Lab:
            r9 = r0
            goto L4b
        Lad:
            return r1
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.format.validate.g.h(inet.ipaddr.a$a, inet.ipaddr.a$a, int, int, int, int, java.lang.Integer, inet.ipaddr.c$b, boolean):boolean");
    }
}

package Ug;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22459a;

    /* renamed from: b, reason: collision with root package name */
    private static final int f22460b;

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f22461c;

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f22462d;

    static {
        String property = System.getProperty("line.separator");
        f22459a = property;
        f22460b = property.length();
        f22461c = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        f22462d = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.io.PrintStream r11, byte[] r12, int r13, int r14) {
        /*
            if (r14 != 0) goto L3
            return
        L3:
            int r0 = r14 % 16
            int r1 = r14 / 16
            if (r0 != 0) goto La
            goto Lc
        La:
            int r1 = r1 + 1
        Lc:
            int r2 = Ug.d.f22460b
            int r2 = r2 + 74
            int r1 = r1 * r2
            char[] r1 = new char[r1]
            r2 = 16
            char[] r3 = new char[r2]
            r4 = 0
            r5 = r4
            r6 = r5
        L1a:
            r7 = 5
            b(r5, r1, r6, r7)
            int r7 = r6 + 5
            int r6 = r6 + 6
            r8 = 58
            r1[r7] = r8
        L26:
            r7 = 32
            if (r5 != r14) goto L38
            int r8 = 16 - r0
            char[] r9 = Ug.d.f22461c
            int r10 = r8 * 3
            java.lang.System.arraycopy(r9, r4, r1, r6, r10)
            int r6 = r6 + r10
            java.lang.System.arraycopy(r9, r4, r3, r0, r8)
            goto L63
        L38:
            int r8 = r6 + 1
            r1[r6] = r7
            int r9 = r13 + r5
            r9 = r12[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = 2
            b(r9, r1, r8, r10)
            int r6 = r6 + 3
            if (r9 < 0) goto L57
            char r8 = (char) r9
            boolean r9 = java.lang.Character.isISOControl(r8)
            if (r9 == 0) goto L52
            goto L57
        L52:
            int r9 = r5 % 16
            r3[r9] = r8
            goto L5d
        L57:
            int r8 = r5 % 16
            r9 = 46
            r3[r8] = r9
        L5d:
            int r5 = r5 + 1
            int r8 = r5 % 16
            if (r8 != 0) goto L26
        L63:
            int r8 = r6 + 1
            r1[r6] = r7
            int r9 = r6 + 2
            r1[r8] = r7
            int r7 = r6 + 3
            r8 = 124(0x7c, float:1.74E-43)
            r1[r9] = r8
            java.lang.System.arraycopy(r3, r4, r1, r7, r2)
            int r7 = r6 + 19
            int r6 = r6 + 20
            r1[r7] = r8
            java.lang.String r7 = Ug.d.f22459a
            int r8 = Ug.d.f22460b
            r7.getChars(r4, r8, r1, r6)
            int r6 = r6 + r8
            if (r5 < r14) goto L1a
            r11.println(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ug.d.a(java.io.PrintStream, byte[], int, int):void");
    }

    public static void b(int i10, char[] cArr, int i11, int i12) {
        while (i12 > 0) {
            int i13 = (i11 + i12) - 1;
            if (i13 < cArr.length) {
                cArr[i13] = f22462d[i10 & 15];
            }
            if (i10 != 0) {
                i10 >>>= 4;
            }
            i12--;
        }
    }

    public static String c(int i10, int i11) {
        char[] cArr = new char[i11];
        b(i10, cArr, 0, i11);
        return new String(cArr);
    }

    public static String d(byte[] bArr, int i10, int i11) {
        char[] cArr = new char[i11];
        int i12 = i11 % 2 == 0 ? i11 / 2 : (i11 / 2) + 1;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = i13 + 1;
            char[] cArr2 = f22462d;
            byte b10 = bArr[i14];
            cArr[i13] = cArr2[(b10 >> 4) & 15];
            if (i15 == i11) {
                break;
            }
            i13 += 2;
            cArr[i15] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }
}

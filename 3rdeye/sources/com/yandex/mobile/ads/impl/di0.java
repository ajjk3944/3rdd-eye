package com.yandex.mobile.ads.impl;

import com.singular.sdk.internal.Constants;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class di0 extends hy1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f26184b = new J0(1);

    /* renamed from: a, reason: collision with root package name */
    private final a f26185a;

    public interface a {
        boolean a(int i, int i10, int i11, int i12, int i13);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f26186a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26187b;

        /* renamed from: c, reason: collision with root package name */
        private final int f26188c;

        public b(int i, int i10, boolean z10) {
            this.f26186a = i;
            this.f26187b = z10;
            this.f26188c = i10;
        }
    }

    public di0(a aVar) {
        this.f26185a = aVar;
    }

    private static int a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(int i, int i10, int i11, int i12, int i13) {
        return false;
    }

    private static yk1 d(int i, uf1 uf1Var) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        uf1Var.a(bArr, 0, i);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i10 = iB + 1;
        return new yk1(str, i <= i10 ? s82.f32904f : Arrays.copyOfRange(bArr, i10, i));
    }

    private static g42 e(int i, uf1 uf1Var) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iT = uf1Var.t();
        String strB = b(iT);
        int i10 = i - 1;
        byte[] bArr = new byte[i10];
        uf1Var.a(bArr, 0, i10);
        int iA = a(bArr, 0, iT);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = iA + a(iT);
        return new g42("TXXX", str, a(iA2, a(bArr, iA2, iT), strB, bArr));
    }

    private static e82 f(int i, uf1 uf1Var) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iT = uf1Var.t();
        String strB = b(iT);
        int i10 = i - 1;
        byte[] bArr = new byte[i10];
        uf1Var.a(bArr, 0, i10);
        int iA = a(bArr, 0, iT);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = iA + a(iT);
        return new e82("WXXX", str, a(iA2, b(iA2, bArr), "ISO-8859-1", bArr));
    }

    private static int g(int i, uf1 uf1Var) {
        byte[] bArrC = uf1Var.c();
        int iD = uf1Var.d();
        int i10 = iD;
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= iD + i) {
                return i;
            }
            if ((bArrC[i10] & 255) == 255 && bArrC[i11] == 0) {
                System.arraycopy(bArrC, i10 + 2, bArrC, i11, (i - (i10 - iD)) - 2);
                i--;
            }
            i10 = i11;
        }
    }

    private static Cdo b(uf1 uf1Var, int i, int i10, boolean z10, int i11, a aVar) throws Throwable {
        int iD = uf1Var.d();
        int iB = b(iD, uf1Var.c());
        String str = new String(uf1Var.c(), iD, iB - iD, "ISO-8859-1");
        uf1Var.e(iB + 1);
        int iT = uf1Var.t();
        boolean z11 = (iT & 2) != 0;
        boolean z12 = (iT & 1) != 0;
        int iT2 = uf1Var.t();
        String[] strArr = new String[iT2];
        for (int i12 = 0; i12 < iT2; i12++) {
            int iD2 = uf1Var.d();
            int iB2 = b(iD2, uf1Var.c());
            strArr[i12] = new String(uf1Var.c(), iD2, iB2 - iD2, "ISO-8859-1");
            uf1Var.e(iB2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i13 = iD + i;
        while (uf1Var.d() < i13) {
            ei0 ei0VarA = a(i10, uf1Var, z10, i11, aVar);
            if (ei0VarA != null) {
                arrayList.add(ei0VarA);
            }
        }
        return new Cdo(str, z11, z12, strArr, (ei0[]) arrayList.toArray(new ei0[0]));
    }

    private static m01 c(int i, uf1 uf1Var) {
        int iZ = uf1Var.z();
        int iW = uf1Var.w();
        int iW2 = uf1Var.w();
        int iT = uf1Var.t();
        int iT2 = uf1Var.t();
        tf1 tf1Var = new tf1();
        tf1Var.a(uf1Var.e(), uf1Var.c());
        tf1Var.c(uf1Var.d() * 8);
        int i10 = ((i - 10) * 8) / (iT + iT2);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iB = tf1Var.b(iT);
            int iB2 = tf1Var.b(iT2);
            iArr[i11] = iB;
            iArr2[i11] = iB2;
        }
        return new m01(iZ, iW, iW2, iArr, iArr2);
    }

    @Override // com.yandex.mobile.ads.impl.hy1
    public final yz0 a(b01 b01Var, ByteBuffer byteBuffer) {
        return a(byteBuffer.limit(), byteBuffer.array());
    }

    private static yd a(int i, int i10, uf1 uf1Var) throws UnsupportedEncodingException {
        int iB;
        String strB;
        byte[] bArrCopyOfRange;
        int iT = uf1Var.t();
        String strB2 = b(iT);
        int i11 = i - 1;
        byte[] bArr = new byte[i11];
        uf1Var.a(bArr, 0, i11);
        if (i10 == 2) {
            String str = "image/" + xf.b(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            strB = str;
            iB = 2;
        } else {
            iB = b(0, bArr);
            strB = xf.b(new String(bArr, 0, iB, "ISO-8859-1"));
            if (strB.indexOf(47) == -1) {
                strB = "image/".concat(strB);
            }
        }
        int i12 = bArr[iB + 1] & 255;
        int i13 = iB + 2;
        int iA = a(bArr, i13, iT);
        String str2 = new String(bArr, i13, iA - i13, strB2);
        int iA2 = iA + a(iT);
        if (i11 <= iA2) {
            bArrCopyOfRange = s82.f32904f;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, iA2, i11);
        }
        return new yd(strB, str2, i12, bArrCopyOfRange);
    }

    private static de0 b(int i, uf1 uf1Var) throws UnsupportedEncodingException {
        byte[] bArrCopyOfRange;
        int iT = uf1Var.t();
        String strB = b(iT);
        int i10 = i - 1;
        byte[] bArr = new byte[i10];
        uf1Var.a(bArr, 0, i10);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i11 = iB + 1;
        int iA = a(bArr, i11, iT);
        String strA = a(i11, iA, strB, bArr);
        int iA2 = iA + a(iT);
        int iA3 = a(bArr, iA2, iT);
        String strA2 = a(iA2, iA3, strB, bArr);
        int iA4 = iA3 + a(iT);
        if (i10 <= iA4) {
            bArrCopyOfRange = s82.f32904f;
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArr, iA4, i10);
        }
        return new de0(str, strA, strA2, bArrCopyOfRange);
    }

    private static co a(uf1 uf1Var, int i, int i10, boolean z10, int i11, a aVar) throws Throwable {
        int iD = uf1Var.d();
        int iB = b(iD, uf1Var.c());
        String str = new String(uf1Var.c(), iD, iB - iD, "ISO-8859-1");
        uf1Var.e(iB + 1);
        int iH = uf1Var.h();
        int iH2 = uf1Var.h();
        long jV = uf1Var.v();
        if (jV == 4294967295L) {
            jV = -1;
        }
        long jV2 = uf1Var.v();
        long j4 = jV2 == 4294967295L ? -1L : jV2;
        ArrayList arrayList = new ArrayList();
        int i12 = iD + i;
        while (uf1Var.d() < i12) {
            ei0 ei0VarA = a(i10, uf1Var, z10, i11, aVar);
            if (ei0VarA != null) {
                arrayList.add(ei0VarA);
            }
        }
        return new co(str, iH, iH2, jV, j4, (ei0[]) arrayList.toArray(new ei0[0]));
    }

    private static e82 b(int i, uf1 uf1Var, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        uf1Var.a(bArr, 0, i);
        return new e82(str, null, new String(bArr, 0, b(0, bArr), "ISO-8859-1"));
    }

    private static nq a(int i, uf1 uf1Var) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int iT = uf1Var.t();
        String strB = b(iT);
        byte[] bArr = new byte[3];
        uf1Var.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i10 = i - 4;
        byte[] bArr2 = new byte[i10];
        uf1Var.a(bArr2, 0, i10);
        int iA = a(bArr2, 0, iT);
        String str2 = new String(bArr2, 0, iA, strB);
        int iA2 = iA + a(iT);
        return new nq(str, str2, a(iA2, a(bArr2, iA2, iT), strB, bArr2));
    }

    private static String b(int i) {
        if (i == 1) {
            return "UTF-16";
        }
        if (i == 2) {
            return "UTF-16BE";
        }
        if (i != 3) {
            return "ISO-8859-1";
        }
        return Constants.ENCODING;
    }

    private static int b(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0220 A[Catch: all -> 0x0209, UnsupportedEncodingException -> 0x0251, TryCatch #1 {UnsupportedEncodingException -> 0x0251, blocks: (B:176:0x0232, B:163:0x0204, B:173:0x021b, B:174:0x0220), top: B:187:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0232 A[Catch: all -> 0x0209, UnsupportedEncodingException -> 0x0251, TRY_LEAVE, TryCatch #1 {UnsupportedEncodingException -> 0x0251, blocks: (B:176:0x0232, B:163:0x0204, B:173:0x021b, B:174:0x0220), top: B:187:0x011e }] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.yandex.mobile.ads.impl.uf1] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.yandex.mobile.ads.impl.uf1] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.yandex.mobile.ads.impl.ei0 a(int r19, com.yandex.mobile.ads.impl.uf1 r20, boolean r21, int r22, com.yandex.mobile.ads.impl.di0.a r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.di0.a(int, com.yandex.mobile.ads.impl.uf1, boolean, int, com.yandex.mobile.ads.impl.di0$a):com.yandex.mobile.ads.impl.ei0");
    }

    private static String a(int i, int i10, String str, byte[] bArr) throws UnsupportedEncodingException {
        if (i10 > i && i10 <= bArr.length) {
            return new String(bArr, i, i10 - i, str);
        }
        return "";
    }

    private static g42 a(int i, uf1 uf1Var, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iT = uf1Var.t();
        String strB = b(iT);
        int i10 = i - 1;
        byte[] bArr = new byte[i10];
        uf1Var.a(bArr, 0, i10);
        return new g42(str, null, new String(bArr, 0, a(bArr, 0, iT), strB));
    }

    private static String a(int i, int i10, int i11, int i12, int i13) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    private static int a(byte[] bArr, int i, int i10) {
        int iB = b(i, bArr);
        if (i10 == 0 || i10 == 3) {
            return iB;
        }
        while (iB < bArr.length - 1) {
            if ((iB - i) % 2 == 0 && bArr[iB + 1] == 0) {
                return iB;
            }
            iB = b(iB + 1, bArr);
        }
        return bArr.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008a A[PHI: r3
  0x008a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:41:0x0087, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(com.yandex.mobile.ads.impl.uf1 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.d()
        L8:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r1.h()     // Catch: java.lang.Throwable -> L22
            long r8 = r1.v()     // Catch: java.lang.Throwable -> L22
            int r10 = r1.z()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lb2
        L25:
            int r7 = r1.w()     // Catch: java.lang.Throwable -> L22
            int r8 = r1.w()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3d
            if (r10 != 0) goto L3d
            r1.e(r2)
            return r4
        L3d:
            r7 = 4
            if (r0 != r7) goto L6e
            if (r21 != 0) goto L6e
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4e
            r1.e(r2)
            return r6
        L4e:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6e:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r3 = r4
            goto L77
        L76:
            r3 = r6
        L77:
            r7 = r10 & 1
            if (r7 == 0) goto L8a
            goto L8e
        L7c:
            if (r0 != r3) goto L8c
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L8a
            goto L8e
        L8a:
            r4 = r6
            goto L8e
        L8c:
            r3 = r6
            r4 = r3
        L8e:
            if (r4 == 0) goto L92
            int r3 = r3 + 4
        L92:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9b
            r1.e(r2)
            return r6
        L9b:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La8
            r1.e(r2)
            return r6
        La8:
            int r3 = (int) r8
            r1.f(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        Lae:
            r1.e(r2)
            return r4
        Lb2:
            r1.e(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.di0.a(com.yandex.mobile.ads.impl.uf1, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.yz0 a(int r13, byte[] r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.di0.a(int, byte[]):com.yandex.mobile.ads.impl.yz0");
    }
}

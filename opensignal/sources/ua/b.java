package ua;

import a5.u;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import fb.f;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import pa.c;
import qb.v;
import xu.l;

/* loaded from: classes.dex */
public final class b extends ic.a {

    /* renamed from: r, reason: collision with root package name */
    public static final p5.b f23506r = new p5.b(22);

    /* renamed from: g, reason: collision with root package name */
    public final a f23507g;

    public b(p5.b bVar) {
        this.f23507g = bVar;
    }

    public static ApicFrame T(f fVar, int i10, int i11) {
        int iK0;
        String strA0;
        int iO = fVar.o();
        String strH0 = h0(iO);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        fVar.c(bArr, 0, i12);
        if (i11 == 2) {
            String strValueOf = String.valueOf(l.a0(new String(bArr, 0, 3, "ISO-8859-1")));
            strA0 = strValueOf.length() != 0 ? "image/".concat(strValueOf) : new String("image/");
            if ("image/jpg".equals(strA0)) {
                strA0 = "image/jpeg";
            }
            iK0 = 2;
        } else {
            iK0 = k0(0, bArr);
            strA0 = l.a0(new String(bArr, 0, iK0, "ISO-8859-1"));
            if (strA0.indexOf(47) == -1) {
                strA0 = strA0.length() != 0 ? "image/".concat(strA0) : new String("image/");
            }
        }
        int i13 = bArr[iK0 + 1] & 255;
        int i14 = iK0 + 2;
        int iJ0 = j0(bArr, i14, iO);
        String str = new String(bArr, i14, iJ0 - i14, strH0);
        int iG0 = g0(iO) + iJ0;
        return new ApicFrame(strA0, str, i13, i12 <= iG0 ? v.f20833f : Arrays.copyOfRange(bArr, iG0, i12));
    }

    public static ChapterFrame U(f fVar, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        int i13 = fVar.f8801b;
        int iK0 = k0(i13, fVar.f8800a);
        String str = new String(fVar.f8800a, i13, iK0 - i13, "ISO-8859-1");
        fVar.y(iK0 + 1);
        int iD = fVar.d();
        int iD2 = fVar.d();
        long jP = fVar.p();
        if (jP == 4294967295L) {
            jP = -1;
        }
        long jP2 = fVar.p();
        long j = jP2 == 4294967295L ? -1L : jP2;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (fVar.f8801b < i14) {
            Id3Frame id3FrameX = X(i11, fVar, z10, i12, aVar);
            if (id3FrameX != null) {
                arrayList.add(id3FrameX);
            }
        }
        return new ChapterFrame(str, iD, iD2, jP, j, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ChapterTocFrame V(f fVar, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        int i13 = fVar.f8801b;
        int iK0 = k0(i13, fVar.f8800a);
        String str = new String(fVar.f8800a, i13, iK0 - i13, "ISO-8859-1");
        fVar.y(iK0 + 1);
        int iO = fVar.o();
        boolean z11 = (iO & 2) != 0;
        boolean z12 = (iO & 1) != 0;
        int iO2 = fVar.o();
        String[] strArr = new String[iO2];
        for (int i14 = 0; i14 < iO2; i14++) {
            int i15 = fVar.f8801b;
            int iK02 = k0(i15, fVar.f8800a);
            strArr[i14] = new String(fVar.f8800a, i15, iK02 - i15, "ISO-8859-1");
            fVar.y(iK02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (fVar.f8801b < i16) {
            Id3Frame id3FrameX = X(i11, fVar, z10, i12, aVar);
            if (id3FrameX != null) {
                arrayList.add(id3FrameX);
            }
        }
        return new ChapterTocFrame(str, z11, z12, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static CommentFrame W(int i10, f fVar) {
        if (i10 < 4) {
            return null;
        }
        int iO = fVar.o();
        String strH0 = h0(iO);
        byte[] bArr = new byte[3];
        fVar.c(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        fVar.c(bArr2, 0, i11);
        int iJ0 = j0(bArr2, 0, iO);
        String str2 = new String(bArr2, 0, iJ0, strH0);
        int iG0 = g0(iO) + iJ0;
        return new CommentFrame(str, str2, b0(iG0, j0(bArr2, iG0, iO), strH0, bArr2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020e A[Catch: all -> 0x01f9, UnsupportedEncodingException -> 0x024a, TryCatch #5 {all -> 0x01f9, blocks: (B:174:0x0220, B:177:0x024a, B:162:0x01f4, B:171:0x0209, B:172:0x020e), top: B:185:0x0109 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0220 A[Catch: all -> 0x01f9, UnsupportedEncodingException -> 0x024a, TRY_LEAVE, TryCatch #5 {all -> 0x01f9, blocks: (B:174:0x0220, B:177:0x024a, B:162:0x01f4, B:171:0x0209, B:172:0x020e), top: B:185:0x0109 }] */
    /* JADX WARN: Type inference failed for: r1v12, types: [fb.f] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [fb.f] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.metadata.id3.Id3Frame X(int r19, fb.f r20, boolean r21, int r22, ua.a r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.b.X(int, fb.f, boolean, int, ua.a):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    public static GeobFrame Y(int i10, f fVar) {
        int iO = fVar.o();
        String strH0 = h0(iO);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        fVar.c(bArr, 0, i11);
        int iK0 = k0(0, bArr);
        String str = new String(bArr, 0, iK0, "ISO-8859-1");
        int i12 = iK0 + 1;
        int iJ0 = j0(bArr, i12, iO);
        String strB0 = b0(i12, iJ0, strH0, bArr);
        int iG0 = g0(iO) + iJ0;
        int iJ02 = j0(bArr, iG0, iO);
        String strB02 = b0(iG0, iJ02, strH0, bArr);
        int iG02 = g0(iO) + iJ02;
        return new GeobFrame(str, strB0, strB02, i11 <= iG02 ? v.f20833f : Arrays.copyOfRange(bArr, iG02, i11));
    }

    public static MlltFrame Z(int i10, f fVar) {
        int iT = fVar.t();
        int iQ = fVar.q();
        int iQ2 = fVar.q();
        int iO = fVar.o();
        int iO2 = fVar.o();
        u uVar = new u(3);
        uVar.n(fVar.f8802c, fVar.f8800a);
        uVar.p(fVar.f8801b * 8);
        int i11 = ((i10 - 10) * 8) / (iO + iO2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = uVar.i(iO);
            int i14 = uVar.i(iO2);
            iArr[i12] = i13;
            iArr2[i12] = i14;
        }
        return new MlltFrame(iT, iQ, iQ2, iArr, iArr2);
    }

    public static PrivFrame a0(int i10, f fVar) {
        byte[] bArr = new byte[i10];
        fVar.c(bArr, 0, i10);
        int iK0 = k0(0, bArr);
        String str = new String(bArr, 0, iK0, "ISO-8859-1");
        int i11 = iK0 + 1;
        return new PrivFrame(str, i10 <= i11 ? v.f20833f : Arrays.copyOfRange(bArr, i11, i10));
    }

    public static String b0(int i10, int i11, String str, byte[] bArr) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    public static TextInformationFrame c0(int i10, f fVar, String str) {
        if (i10 < 1) {
            return null;
        }
        int iO = fVar.o();
        String strH0 = h0(iO);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        fVar.c(bArr, 0, i11);
        return new TextInformationFrame(str, null, new String(bArr, 0, j0(bArr, 0, iO), strH0));
    }

    public static TextInformationFrame d0(int i10, f fVar) {
        if (i10 < 1) {
            return null;
        }
        int iO = fVar.o();
        String strH0 = h0(iO);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        fVar.c(bArr, 0, i11);
        int iJ0 = j0(bArr, 0, iO);
        String str = new String(bArr, 0, iJ0, strH0);
        int iG0 = g0(iO) + iJ0;
        return new TextInformationFrame("TXXX", str, b0(iG0, j0(bArr, iG0, iO), strH0, bArr));
    }

    public static UrlLinkFrame e0(int i10, f fVar, String str) {
        byte[] bArr = new byte[i10];
        fVar.c(bArr, 0, i10);
        return new UrlLinkFrame(str, null, new String(bArr, 0, k0(0, bArr), "ISO-8859-1"));
    }

    public static UrlLinkFrame f0(int i10, f fVar) {
        if (i10 < 1) {
            return null;
        }
        int iO = fVar.o();
        String strH0 = h0(iO);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        fVar.c(bArr, 0, i11);
        int iJ0 = j0(bArr, 0, iO);
        String str = new String(bArr, 0, iJ0, strH0);
        int iG0 = g0(iO) + iJ0;
        return new UrlLinkFrame("WXXX", str, b0(iG0, k0(iG0, bArr), "ISO-8859-1", bArr));
    }

    public static int g0(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static String h0(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    public static String i0(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int j0(byte[] bArr, int i10, int i11) {
        int iK0 = k0(i10, bArr);
        if (i11 == 0 || i11 == 3) {
            return iK0;
        }
        while (iK0 < bArr.length - 1) {
            if ((iK0 - i10) % 2 == 0 && bArr[iK0 + 1] == 0) {
                return iK0;
            }
            iK0 = k0(iK0 + 1, bArr);
        }
        return bArr.length;
    }

    public static int k0(int i10, byte[] bArr) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int l0(int i10, f fVar) {
        byte[] bArr = fVar.f8800a;
        int i11 = fVar.f8801b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11 + i10) {
                return i10;
            }
            if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                i10--;
            }
            i12 = i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m0(fb.f r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f8801b
        L6:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.d()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.p()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.t()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r1.q()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.q()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.y(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.y(r2)
            return r6
        L4c:
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
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.y(r2)
            return r6
        L99:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.y(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.z(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.y(r2)
            return r4
        Lb0:
            r1.y(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.b.m0(fb.f, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.metadata.Metadata S(int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.b.S(int, byte[]):com.google.android.exoplayer2.metadata.Metadata");
    }

    @Override // ic.a
    public final Metadata m(c cVar, ByteBuffer byteBuffer) {
        return S(byteBuffer.limit(), byteBuffer.array());
    }
}

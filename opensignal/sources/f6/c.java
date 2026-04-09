package f6;

import a5.d0;
import a5.u;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.ChapterFrame;
import androidx.media3.extractor.metadata.id3.ChapterTocFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.GeobFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import com.google.android.gms.internal.measurement.b4;
import d5.v;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import ne.g;
import oe.e0;
import oe.f0;
import oe.h0;
import oe.s;
import oe.u0;
import xu.l;

/* loaded from: classes.dex */
public final class c extends b4 {

    /* renamed from: d, reason: collision with root package name */
    public static final v f8634d = new v(4);

    /* renamed from: c, reason: collision with root package name */
    public final a f8635c;

    public c(a aVar) {
        this.f8635c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0(a5.v r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f166b
        L6:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.g()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.u()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.y()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r1.v()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.v()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.E(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.E(r2)
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
            r1.E(r2)
            return r6
        L99:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.E(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.F(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.E(r2)
            return r4
        Lb0:
            r1.E(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.c.A0(a5.v, int, int, boolean):boolean");
    }

    public static ApicFrame l0(a5.v vVar, int i10, int i11) {
        int iY0;
        String strConcat;
        int iT = vVar.t();
        Charset charsetV0 = v0(iT);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        vVar.e(bArr, 0, i12);
        if (i11 == 2) {
            strConcat = "image/" + l.a0(new String(bArr, 0, 3, g.f17523b));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iY0 = 2;
        } else {
            iY0 = y0(0, bArr);
            String strA0 = l.a0(new String(bArr, 0, iY0, g.f17523b));
            strConcat = strA0.indexOf(47) == -1 ? "image/".concat(strA0) : strA0;
        }
        int i13 = bArr[iY0 + 1] & 255;
        int i14 = iY0 + 2;
        int iX0 = x0(bArr, i14, iT);
        String str = new String(bArr, i14, iX0 - i14, charsetV0);
        int iU0 = u0(iT) + iX0;
        return new ApicFrame(strConcat, str, i13, i12 <= iU0 ? d0.f109e : Arrays.copyOfRange(bArr, iU0, i12));
    }

    public static ChapterFrame m0(a5.v vVar, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        int i13 = vVar.f166b;
        int iY0 = y0(i13, vVar.f165a);
        String str = new String(vVar.f165a, i13, iY0 - i13, g.f17523b);
        vVar.E(iY0 + 1);
        int iG = vVar.g();
        int iG2 = vVar.g();
        long jU = vVar.u();
        if (jU == 4294967295L) {
            jU = -1;
        }
        long jU2 = vVar.u();
        long j = jU2 == 4294967295L ? -1L : jU2;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (vVar.f166b < i14) {
            Id3Frame id3FrameP0 = p0(i11, vVar, z10, i12, aVar);
            if (id3FrameP0 != null) {
                arrayList.add(id3FrameP0);
            }
        }
        return new ChapterFrame(str, iG, iG2, jU, j, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ChapterTocFrame n0(a5.v vVar, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        int i13 = vVar.f166b;
        int iY0 = y0(i13, vVar.f165a);
        String str = new String(vVar.f165a, i13, iY0 - i13, g.f17523b);
        vVar.E(iY0 + 1);
        int iT = vVar.t();
        boolean z11 = (iT & 2) != 0;
        boolean z12 = (iT & 1) != 0;
        int iT2 = vVar.t();
        String[] strArr = new String[iT2];
        for (int i14 = 0; i14 < iT2; i14++) {
            int i15 = vVar.f166b;
            int iY02 = y0(i15, vVar.f165a);
            strArr[i14] = new String(vVar.f165a, i15, iY02 - i15, g.f17523b);
            vVar.E(iY02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (vVar.f166b < i16) {
            Id3Frame id3FrameP0 = p0(i11, vVar, z10, i12, aVar);
            if (id3FrameP0 != null) {
                arrayList.add(id3FrameP0);
            }
        }
        return new ChapterTocFrame(str, z11, z12, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static CommentFrame o0(int i10, a5.v vVar) {
        if (i10 < 4) {
            return null;
        }
        int iT = vVar.t();
        Charset charsetV0 = v0(iT);
        byte[] bArr = new byte[3];
        vVar.e(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        vVar.e(bArr2, 0, i11);
        int iX0 = x0(bArr2, 0, iT);
        String str2 = new String(bArr2, 0, iX0, charsetV0);
        int iU0 = u0(iT) + iX0;
        return new CommentFrame(str, str2, s0(bArr2, iU0, x0(bArr2, iU0, iT), charsetV0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x029d A[Catch: all -> 0x0286, TryCatch #2 {all -> 0x0286, blocks: (B:183:0x02ae, B:170:0x0281, B:180:0x0298, B:181:0x029d), top: B:190:0x0111 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ae A[Catch: all -> 0x0286, TRY_LEAVE, TryCatch #2 {all -> 0x0286, blocks: (B:183:0x02ae, B:170:0x0281, B:180:0x0298, B:181:0x029d), top: B:190:0x0111 }] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [a5.v] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.extractor.metadata.id3.Id3Frame p0(int r20, a5.v r21, boolean r22, int r23, f6.a r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.c.p0(int, a5.v, boolean, int, f6.a):androidx.media3.extractor.metadata.id3.Id3Frame");
    }

    public static GeobFrame q0(int i10, a5.v vVar) {
        int iT = vVar.t();
        Charset charsetV0 = v0(iT);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        vVar.e(bArr, 0, i11);
        int iY0 = y0(0, bArr);
        String str = new String(bArr, 0, iY0, g.f17523b);
        int i12 = iY0 + 1;
        int iX0 = x0(bArr, i12, iT);
        String strS0 = s0(bArr, i12, iX0, charsetV0);
        int iU0 = u0(iT) + iX0;
        int iX02 = x0(bArr, iU0, iT);
        String strS02 = s0(bArr, iU0, iX02, charsetV0);
        int iU02 = u0(iT) + iX02;
        return new GeobFrame(str, strS0, strS02, i11 <= iU02 ? d0.f109e : Arrays.copyOfRange(bArr, iU02, i11));
    }

    public static MlltFrame r0(int i10, a5.v vVar) {
        int iY = vVar.y();
        int iV = vVar.v();
        int iV2 = vVar.v();
        int iT = vVar.t();
        int iT2 = vVar.t();
        u uVar = new u(0);
        uVar.o(vVar);
        int i11 = ((i10 - 10) * 8) / (iT + iT2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = uVar.i(iT);
            int i14 = uVar.i(iT2);
            iArr[i12] = i13;
            iArr2[i12] = i14;
        }
        return new MlltFrame(iY, iV, iV2, iArr, iArr2);
    }

    public static String s0(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    public static u0 t0(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return h0.p("");
        }
        f0 f0Var = h0.f19336d;
        s.c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int iX0 = x0(bArr, i11, i10);
        int i12 = 0;
        while (i11 < iX0) {
            String str = new String(bArr, i11, iX0 - i11, v0(i10));
            int i13 = i12 + 1;
            if (objArrCopyOf.length < i13) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, e0.e(objArrCopyOf.length, i13));
            }
            objArrCopyOf[i12] = str;
            int iU0 = iX0 + u0(i10);
            i12 = i13;
            i11 = iU0;
            iX0 = x0(bArr, iU0, i10);
        }
        u0 u0VarK = h0.k(i12, objArrCopyOf);
        return u0VarK.isEmpty() ? h0.p("") : u0VarK;
    }

    public static int u0(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static Charset v0(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? g.f17523b : g.f17524c : g.f17525d : g.f17527f;
    }

    public static String w0(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int x0(byte[] bArr, int i10, int i11) {
        int iY0 = y0(i10, bArr);
        if (i11 == 0 || i11 == 3) {
            return iY0;
        }
        while (iY0 < bArr.length - 1) {
            if ((iY0 - i10) % 2 == 0 && bArr[iY0 + 1] == 0) {
                return iY0;
            }
            iY0 = y0(iY0 + 1, bArr);
        }
        return bArr.length;
    }

    public static int y0(int i10, byte[] bArr) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int z0(int i10, a5.v vVar) {
        byte[] bArr = vVar.f165a;
        int i11 = vVar.f166b;
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

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.media3.common.Metadata k0(int r13, byte[] r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.c.k0(int, byte[]):androidx.media3.common.Metadata");
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final Metadata x(a6.a aVar, ByteBuffer byteBuffer) {
        return k0(byteBuffer.limit(), byteBuffer.array());
    }
}

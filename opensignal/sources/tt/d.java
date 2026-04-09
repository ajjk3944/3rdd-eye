package tt;

import com.google.android.gms.internal.measurement.b4;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f22988a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f22989b;

    static {
        int[] iArr = new int[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = "0123456789abcdef".charAt(i11 & 15) | ("0123456789abcdef".charAt(i11 >> 4) << '\b');
        }
        f22988a = iArr;
        int[] iArr2 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = "0123456789ABCDEF".charAt(i12 & 15) | ("0123456789ABCDEF".charAt(i12 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        long[] jArr = new long[256];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i19)] = i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i10)] = i21;
            i10++;
            i21++;
        }
        f22989b = jArr;
    }

    public static final void a(String str, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 < 1) {
            String strSubstring = str.substring(i10, i11);
            br.l.d(strSubstring, "substring(...)");
            throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i10 + ", but was \"" + strSubstring + "\" of length " + i12);
        }
        if (i12 > 16) {
            int i13 = (i12 + i10) - 16;
            while (i10 < i13) {
                if (str.charAt(i10) != '0') {
                    StringBuilder sbU = h0.b.u("Expected the hexadecimal digit '0' at index ", i10, ", but was '");
                    sbU.append(str.charAt(i10));
                    sbU.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbU.toString());
                }
                i10++;
            }
        }
    }

    public static long b(String str, int i10, int i11) {
        g gVar = g.f22993d;
        br.l.e(gVar, "format");
        b4.e(i10, i11, str.length());
        if (gVar.f22996c.f22992a) {
            a(str, i10, i11);
            return c(str, i10, i11);
        }
        if (i11 - i10 > 0) {
            a(str, i10, i11);
            return c(str, i10, i11);
        }
        String strSubstring = str.substring(i10, i11);
        br.l.d(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(strSubstring));
    }

    public static final long c(String str, int i10, int i11) {
        long j = 0;
        while (i10 < i11) {
            long j7 = j << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') == 0) {
                long j10 = f22989b[cCharAt];
                if (j10 >= 0) {
                    j = j7 | j10;
                    i10++;
                }
            }
            StringBuilder sbU = h0.b.u("Expected a hexadecimal digit at index ", i10, ", but was ");
            sbU.append(str.charAt(i10));
            throw new NumberFormatException(sbU.toString());
        }
        return j;
    }
}

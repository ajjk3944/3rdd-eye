package na;

import N7.G8;
import g0.C4356c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: HijrahDate.java */
/* loaded from: classes3.dex */
public final class j extends na.a<j> {

    /* renamed from: A, reason: collision with root package name */
    public static final Integer[] f44436A;

    /* renamed from: B, reason: collision with root package name */
    public static final Integer[] f44437B;

    /* renamed from: C, reason: collision with root package name */
    public static final Integer[] f44438C;

    /* renamed from: D, reason: collision with root package name */
    public static final Integer[] f44439D;

    /* renamed from: E, reason: collision with root package name */
    public static final Integer[] f44440E;

    /* renamed from: F, reason: collision with root package name */
    public static final Integer[] f44441F;

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f44442j = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f44443k = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f44444l = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f44445m = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f44446n = {0, 1, 0, 1, 0, 1, 1};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f44447o = {1, 9999, 11, 51, 5, 29, 354};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f44448p = {1, 9999, 11, 52, 6, 30, 355};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f44449q = {0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};

    /* renamed from: r, reason: collision with root package name */
    public static final char f44450r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f44451s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f44452t;

    /* renamed from: u, reason: collision with root package name */
    public static final HashMap<Integer, Integer[]> f44453u;

    /* renamed from: v, reason: collision with root package name */
    public static final HashMap<Integer, Integer[]> f44454v;

    /* renamed from: w, reason: collision with root package name */
    public static final HashMap<Integer, Integer[]> f44455w;

    /* renamed from: x, reason: collision with root package name */
    public static final Long[] f44456x;

    /* renamed from: y, reason: collision with root package name */
    public static final Integer[] f44457y;

    /* renamed from: z, reason: collision with root package name */
    public static final Integer[] f44458z;

    /* renamed from: c, reason: collision with root package name */
    public final transient k f44459c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f44460d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f44461e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f44462f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f44463g;

    /* renamed from: h, reason: collision with root package name */
    public final transient ma.b f44464h;
    public final long i;

    /* compiled from: HijrahDate.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44465a;

        static {
            int[] iArr = new int[qa.a.values().length];
            f44465a = iArr;
            try {
                iArr[qa.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44465a[qa.a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44465a[qa.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44465a[qa.a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44465a[qa.a.DAY_OF_WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44465a[qa.a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44465a[qa.a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44465a[qa.a.EPOCH_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44465a[qa.a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44465a[qa.a.MONTH_OF_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f44465a[qa.a.YEAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f44465a[qa.a.ERA.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        int i = 0;
        char c10 = File.separatorChar;
        f44450r = c10;
        f44451s = File.pathSeparator;
        f44452t = "org" + c10 + "threeten" + c10 + "bp" + c10 + "chrono";
        f44453u = new HashMap<>();
        f44454v = new HashMap<>();
        f44455w = new HashMap<>();
        f44437B = new Integer[12];
        int i10 = 0;
        while (true) {
            int[] iArr = f44442j;
            if (i10 >= 12) {
                break;
            }
            f44437B[i10] = Integer.valueOf(iArr[i10]);
            i10++;
        }
        f44438C = new Integer[12];
        int i11 = 0;
        while (true) {
            int[] iArr2 = f44443k;
            if (i11 >= 12) {
                break;
            }
            f44438C[i11] = Integer.valueOf(iArr2[i11]);
            i11++;
        }
        f44439D = new Integer[12];
        int i12 = 0;
        while (true) {
            int[] iArr3 = f44444l;
            if (i12 >= 12) {
                break;
            }
            f44439D[i12] = Integer.valueOf(iArr3[i12]);
            i12++;
        }
        f44440E = new Integer[12];
        int i13 = 0;
        while (true) {
            int[] iArr4 = f44445m;
            if (i13 >= 12) {
                break;
            }
            f44440E[i13] = Integer.valueOf(iArr4[i13]);
            i13++;
        }
        f44441F = new Integer[30];
        int i14 = 0;
        while (true) {
            int[] iArr5 = f44449q;
            if (i14 >= 30) {
                break;
            }
            f44441F[i14] = Integer.valueOf(iArr5[i14]);
            i14++;
        }
        f44456x = new Long[334];
        int i15 = 0;
        while (true) {
            Long[] lArr = f44456x;
            if (i15 >= lArr.length) {
                break;
            }
            lArr[i15] = Long.valueOf(i15 * 10631);
            i15++;
        }
        f44457y = new Integer[7];
        int i16 = 0;
        while (true) {
            int[] iArr6 = f44446n;
            if (i16 >= 7) {
                break;
            }
            f44457y[i16] = Integer.valueOf(iArr6[i16]);
            i16++;
        }
        f44458z = new Integer[7];
        int i17 = 0;
        while (true) {
            int[] iArr7 = f44447o;
            if (i17 >= 7) {
                break;
            }
            f44458z[i17] = Integer.valueOf(iArr7[i17]);
            i17++;
        }
        f44436A = new Integer[7];
        while (true) {
            int[] iArr8 = f44448p;
            if (i >= 7) {
                try {
                    G0();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            } else {
                f44436A[i] = Integer.valueOf(iArr8[i]);
                i++;
            }
        }
    }

    public j(long j4) {
        int i;
        int iIntValue;
        int iA0;
        int iY0;
        int value;
        int i10;
        Long l5;
        Long[] lArr = f44456x;
        long j10 = j4 - (-492148);
        if (j10 >= 0) {
            int i11 = 0;
            while (true) {
                try {
                    if (i11 >= lArr.length) {
                        i10 = ((int) j10) / 10631;
                        break;
                    } else {
                        if (j10 < lArr[i11].longValue()) {
                            i10 = i11 - 1;
                            break;
                        }
                        i11++;
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    i10 = ((int) j10) / 10631;
                }
            }
            try {
                l5 = lArr[i10];
            } catch (ArrayIndexOutOfBoundsException unused2) {
                l5 = null;
            }
            int iLongValue = (int) (j10 - (l5 == null ? Long.valueOf(i10 * 10631) : l5).longValue());
            int iB0 = B0(i10, iLongValue);
            Integer[] numArrW0 = w0(i10);
            iIntValue = iLongValue > 0 ? iLongValue - numArrW0[iB0].intValue() : iLongValue + numArrW0[iB0].intValue();
            i = (i10 * 30) + iB0 + 1;
            iA0 = A0(iIntValue, i);
            iY0 = y0(iIntValue, iA0, i) + 1;
            value = k.AH.getValue();
        } else {
            int i12 = (int) j10;
            int i13 = i12 / 10631;
            int i14 = i12 % 10631;
            if (i14 == 0) {
                i13++;
                i14 = -10631;
            }
            int iB02 = B0(i13, i14);
            Integer[] numArrW02 = w0(i13);
            int iIntValue2 = i14 > 0 ? i14 - numArrW02[iB02].intValue() : i14 + numArrW02[iB02].intValue();
            i = 1 - ((i13 * 30) - iB02);
            iIntValue = C0((long) i) ? iIntValue2 + 355 : iIntValue2 + 354;
            iA0 = A0(iIntValue, i);
            iY0 = y0(iIntValue, iA0, i) + 1;
            value = k.BEFORE_AH.getValue();
        }
        int i15 = iY0;
        int i16 = (int) ((j4 - (-492153)) % 7);
        int[] iArr = {value, i, iA0 + 1, i15, iIntValue + 1, i16 + (i16 <= 0 ? 7 : 0)};
        int i17 = iArr[1];
        if (i17 < 1 || i17 > 9999) {
            throw new ma.a("Invalid year of Hijrah Era");
        }
        int i18 = iArr[2];
        if (i18 < 1 || i18 > 12) {
            throw new ma.a("Invalid month of Hijrah date");
        }
        v0(iArr[3]);
        int i19 = iArr[4];
        if (i19 < 1 || i19 > f44436A[6].intValue()) {
            throw new ma.a("Invalid day of year of Hijrah date");
        }
        this.f44459c = k.of(iArr[0]);
        this.f44460d = iArr[1];
        this.f44461e = iArr[2];
        this.f44462f = iArr[3];
        this.f44463g = iArr[4];
        this.f44464h = ma.b.of(iArr[5]);
        this.i = j4;
    }

    public static int A0(int i, int i10) {
        Integer[] numArrX0 = x0(i10);
        int i11 = 0;
        if (i >= 0) {
            while (i11 < numArrX0.length) {
                if (i < numArrX0[i11].intValue()) {
                    return i11 - 1;
                }
                i11++;
            }
            return 11;
        }
        int i12 = C0((long) i10) ? i + 355 : i + 354;
        while (i11 < numArrX0.length) {
            if (i12 < numArrX0[i11].intValue()) {
                return i11 - 1;
            }
            i11++;
        }
        return 11;
    }

    public static int B0(int i, long j4) {
        Integer[] numArrW0 = w0(i);
        int i10 = 0;
        if (j4 == 0) {
            return 0;
        }
        if (j4 > 0) {
            while (i10 < numArrW0.length) {
                if (j4 < numArrW0[i10].intValue()) {
                    return i10 - 1;
                }
                i10++;
            }
            return 29;
        }
        long j10 = -j4;
        while (i10 < numArrW0.length) {
            if (j10 <= numArrW0[i10].intValue()) {
                return i10 - 1;
            }
            i10++;
        }
        return 29;
    }

    public static boolean C0(long j4) {
        if (j4 <= 0) {
            j4 = -j4;
        }
        return ((j4 * 11) + 14) % 30 < 11;
    }

    public static j D0(k kVar, int i, int i10, int i11) {
        com.google.gson.internal.c.v(kVar, "era");
        if (i < 1 || i > 9999) {
            throw new ma.a("Invalid year of Hijrah Era");
        }
        if (i10 < 1 || i10 > 12) {
            throw new ma.a("Invalid month of Hijrah date");
        }
        v0(i11);
        return new j(z0(kVar.prolepticYear(i), i10, i11));
    }

    public static void E0(int i, String str) throws NumberFormatException, ParseException {
        int i10;
        int i11;
        int i12;
        int i13;
        Long[] lArr;
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(58);
            if (iIndexOf == -1) {
                throw new ParseException(C4356c.i(i, "Offset has incorrect format at line ", "."), i);
            }
            try {
                int i14 = Integer.parseInt(strNextToken.substring(iIndexOf + 1, strNextToken.length()));
                int iIndexOf2 = strNextToken.indexOf(45);
                if (iIndexOf2 == -1) {
                    throw new ParseException(C4356c.i(i, "Start and end year/month has incorrect format at line ", "."), i);
                }
                String strSubstring = strNextToken.substring(0, iIndexOf2);
                String strSubstring2 = strNextToken.substring(iIndexOf2 + 1, iIndexOf);
                int iIndexOf3 = strSubstring.indexOf(47);
                int iIndexOf4 = strSubstring2.indexOf(47);
                if (iIndexOf3 == -1) {
                    throw new ParseException(C4356c.i(i, "Start year/month has incorrect format at line ", "."), i);
                }
                String strSubstring3 = strSubstring.substring(0, iIndexOf3);
                String strSubstring4 = strSubstring.substring(iIndexOf3 + 1, strSubstring.length());
                try {
                    int i15 = Integer.parseInt(strSubstring3);
                    try {
                        int i16 = Integer.parseInt(strSubstring4);
                        if (iIndexOf4 == -1) {
                            throw new ParseException(C4356c.i(i, "End year/month has incorrect format at line ", "."), i);
                        }
                        String strSubstring5 = strSubstring2.substring(0, iIndexOf4);
                        String strSubstring6 = strSubstring2.substring(iIndexOf4 + 1, strSubstring2.length());
                        try {
                            int i17 = Integer.parseInt(strSubstring5);
                            try {
                                int i18 = Integer.parseInt(strSubstring6);
                                if (i15 == -1 || i16 == -1 || i17 == -1 || i18 == -1) {
                                    throw new ParseException(C4356c.i(i, "Unknown error at line ", "."), i);
                                }
                                if (i15 < 1) {
                                    throw new IllegalArgumentException("startYear < 1");
                                }
                                if (i17 < 1) {
                                    throw new IllegalArgumentException("endYear < 1");
                                }
                                if (i16 < 0 || i16 > 11) {
                                    throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
                                }
                                if (i18 < 0 || i18 > 11) {
                                    throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
                                }
                                if (i17 > 9999) {
                                    throw new IllegalArgumentException("endYear > 9999");
                                }
                                if (i17 < i15) {
                                    throw new IllegalArgumentException("startYear > endYear");
                                }
                                if (i17 == i15 && i18 < i16) {
                                    throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
                                }
                                boolean zC0 = C0(i15);
                                Integer numValueOf = Integer.valueOf(i15);
                                HashMap<Integer, Integer[]> map = f44453u;
                                Integer[] numArr = map.get(numValueOf);
                                int[] iArr = f44442j;
                                int[] iArr2 = f44443k;
                                if (numArr == null) {
                                    if (zC0) {
                                        numArr = new Integer[iArr2.length];
                                        for (int i19 = 0; i19 < iArr2.length; i19++) {
                                            numArr[i19] = Integer.valueOf(iArr2[i19]);
                                        }
                                    } else {
                                        numArr = new Integer[iArr.length];
                                        for (int i20 = 0; i20 < iArr.length; i20++) {
                                            numArr[i20] = Integer.valueOf(iArr[i20]);
                                        }
                                    }
                                }
                                Integer[] numArr2 = new Integer[numArr.length];
                                for (int i21 = 0; i21 < 12; i21++) {
                                    if (i21 > i16) {
                                        numArr2[i21] = Integer.valueOf(numArr[i21].intValue() - i14);
                                    } else {
                                        Integer num = numArr[i21];
                                        num.intValue();
                                        numArr2[i21] = num;
                                    }
                                }
                                map.put(Integer.valueOf(i15), numArr2);
                                Integer numValueOf2 = Integer.valueOf(i15);
                                HashMap<Integer, Integer[]> map2 = f44454v;
                                Integer[] numArr3 = map2.get(numValueOf2);
                                int[] iArr3 = f44444l;
                                int[] iArr4 = f44445m;
                                if (numArr3 == null) {
                                    if (zC0) {
                                        numArr3 = new Integer[iArr4.length];
                                        for (int i22 = 0; i22 < iArr4.length; i22++) {
                                            numArr3[i22] = Integer.valueOf(iArr4[i22]);
                                        }
                                    } else {
                                        numArr3 = new Integer[iArr3.length];
                                        for (int i23 = 0; i23 < iArr3.length; i23++) {
                                            numArr3[i23] = Integer.valueOf(iArr3[i23]);
                                        }
                                    }
                                }
                                Integer[] numArr4 = new Integer[numArr3.length];
                                StringTokenizer stringTokenizer2 = stringTokenizer;
                                for (int i24 = 0; i24 < 12; i24++) {
                                    if (i24 == i16) {
                                        numArr4[i24] = Integer.valueOf(numArr3[i24].intValue() - i14);
                                    } else {
                                        Integer num2 = numArr3[i24];
                                        num2.intValue();
                                        numArr4[i24] = num2;
                                    }
                                }
                                map2.put(Integer.valueOf(i15), numArr4);
                                if (i15 != i17) {
                                    int i25 = i15 - 1;
                                    int i26 = i25 / 30;
                                    int i27 = i25 % 30;
                                    Integer numValueOf3 = Integer.valueOf(i26);
                                    HashMap<Integer, Integer[]> map3 = f44455w;
                                    Integer[] numArr5 = map3.get(numValueOf3);
                                    int[] iArr5 = f44449q;
                                    if (numArr5 == null) {
                                        int length = iArr5.length;
                                        i10 = i16;
                                        Integer[] numArr6 = new Integer[length];
                                        for (int i28 = 0; i28 < length; i28++) {
                                            numArr6[i28] = Integer.valueOf(iArr5[i28]);
                                        }
                                        numArr5 = numArr6;
                                    } else {
                                        i10 = i16;
                                    }
                                    i11 = i15;
                                    for (int i29 = i27 + 1; i29 < iArr5.length; i29++) {
                                        numArr5[i29] = Integer.valueOf(numArr5[i29].intValue() - i14);
                                    }
                                    map3.put(Integer.valueOf(i26), numArr5);
                                    int i30 = i17 - 1;
                                    int i31 = i30 / 30;
                                    if (i26 != i31) {
                                        int i32 = i26 + 1;
                                        while (true) {
                                            lArr = f44456x;
                                            i12 = i30;
                                            if (i32 >= lArr.length) {
                                                break;
                                            }
                                            int i33 = i32;
                                            lArr[i33] = Long.valueOf(lArr[i32].longValue() - i14);
                                            i32 = i33 + 1;
                                            i30 = i12;
                                        }
                                        int i34 = i31 + 1;
                                        while (i34 < lArr.length) {
                                            int i35 = i34;
                                            lArr[i35] = Long.valueOf(lArr[i34].longValue() + i14);
                                            i34 = i35 + 1;
                                        }
                                    } else {
                                        i12 = i30;
                                    }
                                    int i36 = i12 % 30;
                                    Integer[] numArr7 = map3.get(Integer.valueOf(i31));
                                    if (numArr7 == null) {
                                        int length2 = iArr5.length;
                                        Integer[] numArr8 = new Integer[length2];
                                        i13 = i36;
                                        for (int i37 = 0; i37 < length2; i37++) {
                                            numArr8[i37] = Integer.valueOf(iArr5[i37]);
                                        }
                                        numArr7 = numArr8;
                                    } else {
                                        i13 = i36;
                                    }
                                    for (int i38 = i13 + 1; i38 < iArr5.length; i38++) {
                                        numArr7[i38] = Integer.valueOf(numArr7[i38].intValue() + i14);
                                    }
                                    map3.put(Integer.valueOf(i31), numArr7);
                                } else {
                                    i10 = i16;
                                    i11 = i15;
                                }
                                boolean zC02 = C0(i17);
                                Integer[] numArr9 = map.get(Integer.valueOf(i17));
                                if (numArr9 == null) {
                                    if (zC02) {
                                        numArr9 = new Integer[iArr2.length];
                                        for (int i39 = 0; i39 < iArr2.length; i39++) {
                                            numArr9[i39] = Integer.valueOf(iArr2[i39]);
                                        }
                                    } else {
                                        numArr9 = new Integer[iArr.length];
                                        for (int i40 = 0; i40 < iArr.length; i40++) {
                                            numArr9[i40] = Integer.valueOf(iArr[i40]);
                                        }
                                    }
                                }
                                Integer[] numArr10 = new Integer[numArr9.length];
                                for (int i41 = 0; i41 < 12; i41++) {
                                    if (i41 > i18) {
                                        numArr10[i41] = Integer.valueOf(numArr9[i41].intValue() + i14);
                                    } else {
                                        Integer num3 = numArr9[i41];
                                        num3.intValue();
                                        numArr10[i41] = num3;
                                    }
                                }
                                map.put(Integer.valueOf(i17), numArr10);
                                Integer[] numArr11 = map2.get(Integer.valueOf(i17));
                                if (numArr11 == null) {
                                    if (zC02) {
                                        numArr11 = new Integer[iArr4.length];
                                        for (int i42 = 0; i42 < iArr4.length; i42++) {
                                            numArr11[i42] = Integer.valueOf(iArr4[i42]);
                                        }
                                    } else {
                                        numArr11 = new Integer[iArr3.length];
                                        for (int i43 = 0; i43 < iArr3.length; i43++) {
                                            numArr11[i43] = Integer.valueOf(iArr3[i43]);
                                        }
                                    }
                                }
                                Integer[] numArr12 = new Integer[numArr11.length];
                                for (int i44 = 0; i44 < 12; i44++) {
                                    if (i44 == i18) {
                                        numArr12[i44] = Integer.valueOf(numArr11[i44].intValue() + i14);
                                    } else {
                                        Integer num4 = numArr11[i44];
                                        num4.intValue();
                                        numArr12[i44] = num4;
                                    }
                                }
                                map2.put(Integer.valueOf(i17), numArr12);
                                Integer[] numArr13 = map2.get(Integer.valueOf(i11));
                                Integer[] numArr14 = map2.get(Integer.valueOf(i17));
                                Integer[] numArr15 = map.get(Integer.valueOf(i11));
                                Integer[] numArr16 = map.get(Integer.valueOf(i17));
                                int iIntValue = numArr13[i10].intValue();
                                int iIntValue2 = numArr14[i18].intValue();
                                int iIntValue3 = numArr13[11].intValue() + numArr15[11].intValue();
                                int iIntValue4 = numArr14[11].intValue() + numArr16[11].intValue();
                                Integer[] numArr17 = f44436A;
                                int iIntValue5 = numArr17[5].intValue();
                                Integer[] numArr18 = f44458z;
                                int iIntValue6 = numArr18[5].intValue();
                                if (iIntValue5 < iIntValue) {
                                    iIntValue5 = iIntValue;
                                }
                                if (iIntValue5 < iIntValue2) {
                                    iIntValue5 = iIntValue2;
                                }
                                numArr17[5] = Integer.valueOf(iIntValue5);
                                if (iIntValue6 <= iIntValue) {
                                    iIntValue = iIntValue6;
                                }
                                if (iIntValue <= iIntValue2) {
                                    iIntValue2 = iIntValue;
                                }
                                numArr18[5] = Integer.valueOf(iIntValue2);
                                int iIntValue7 = numArr17[6].intValue();
                                int iIntValue8 = numArr18[6].intValue();
                                if (iIntValue7 < iIntValue3) {
                                    iIntValue7 = iIntValue3;
                                }
                                if (iIntValue7 < iIntValue4) {
                                    iIntValue7 = iIntValue4;
                                }
                                numArr17[6] = Integer.valueOf(iIntValue7);
                                if (iIntValue8 <= iIntValue3) {
                                    iIntValue3 = iIntValue8;
                                }
                                if (iIntValue3 <= iIntValue4) {
                                    iIntValue4 = iIntValue3;
                                }
                                numArr18[6] = Integer.valueOf(iIntValue4);
                                stringTokenizer = stringTokenizer2;
                            } catch (NumberFormatException unused) {
                                throw new ParseException(C4356c.i(i, "End month is not properly set at line ", "."), i);
                            }
                        } catch (NumberFormatException unused2) {
                            throw new ParseException(C4356c.i(i, "End year is not properly set at line ", "."), i);
                        }
                    } catch (NumberFormatException unused3) {
                        throw new ParseException(C4356c.i(i, "Start month is not properly set at line ", "."), i);
                    }
                } catch (NumberFormatException unused4) {
                    throw new ParseException(C4356c.i(i, "Start year is not properly set at line ", "."), i);
                }
            } catch (NumberFormatException unused5) {
                throw new ParseException(C4356c.i(i, "Offset is not properly set at line ", "."), i);
            }
        }
    }

    public static void G0() throws Throwable {
        InputStream fileInputStream;
        ZipFile zipFile;
        String property = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigFile");
        if (property == null) {
            property = "hijrah_deviation.cfg";
        }
        String property2 = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigDir");
        BufferedReader bufferedReader = null;
        char c10 = f44450r;
        if (property2 != null) {
            if (property2.length() != 0 || !property2.endsWith(System.getProperty("file.separator"))) {
                StringBuilder sbU = G8.u(property2);
                sbU.append(System.getProperty("file.separator"));
                property2 = sbU.toString();
            }
            File file = new File(property2 + c10 + property);
            fileInputStream = file.exists() ? new FileInputStream(file) : null;
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.class.path"), f44451s);
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                File file2 = new File(strNextToken);
                if (file2.exists()) {
                    boolean zIsDirectory = file2.isDirectory();
                    String str = f44452t;
                    if (zIsDirectory) {
                        if (new File(strNextToken + c10 + str, property).exists()) {
                            fileInputStream = new FileInputStream(strNextToken + c10 + str + c10 + property);
                            break;
                        }
                    } else {
                        try {
                            zipFile = new ZipFile(file2);
                        } catch (IOException unused) {
                            zipFile = null;
                        }
                        if (zipFile != null) {
                            String strReplace = str + c10 + property;
                            ZipEntry entry = zipFile.getEntry(strReplace);
                            if (entry == null) {
                                if (c10 == '/') {
                                    strReplace = strReplace.replace('/', '\\');
                                } else if (c10 == '\\') {
                                    strReplace = strReplace.replace('\\', '/');
                                }
                                entry = zipFile.getEntry(strReplace);
                            }
                            if (entry != null) {
                                fileInputStream = zipFile.getInputStream(entry);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        if (fileInputStream == null) {
            return;
        }
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(fileInputStream));
            int i = 0;
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        bufferedReader2.close();
                        return;
                    } else {
                        i++;
                        E0(i, line.trim());
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static j H0(int i, int i10, int i11) {
        int iIntValue = x0(i)[i10 - 1].intValue();
        if (i11 > iIntValue) {
            i11 = iIntValue;
        }
        return i >= 1 ? D0(k.AH, i, i10, i11) : D0(k.BEFORE_AH, 1 - i, i10, i11);
    }

    private Object readResolve() {
        return new j(this.i);
    }

    public static void v0(int i) {
        Integer[] numArr = f44436A;
        if (i < 1 || i > numArr[5].intValue()) {
            StringBuilder sbJ = C4356c.j(i, "Invalid day of month of Hijrah date, day ", " greater than ");
            sbJ.append(numArr[5].intValue());
            sbJ.append(" or less than 1");
            throw new ma.a(sbJ.toString());
        }
    }

    public static Integer[] w0(int i) {
        Integer[] numArr;
        try {
            numArr = f44455w.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? f44441F : numArr;
    }

    private Object writeReplace() {
        return new t((byte) 3, this);
    }

    public static Integer[] x0(int i) {
        Integer[] numArr;
        try {
            numArr = f44453u.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? C0((long) i) ? f44438C : f44437B : numArr;
    }

    public static int y0(int i, int i10, int i11) {
        int iIntValue;
        Integer[] numArrX0 = x0(i11);
        if (i < 0) {
            i = C0((long) i11) ? i + 355 : i + 354;
            if (i10 <= 0) {
                return i;
            }
            iIntValue = numArrX0[i10].intValue();
        } else {
            if (i10 <= 0) {
                return i;
            }
            iIntValue = numArrX0[i10].intValue();
        }
        return i - iIntValue;
    }

    public static long z0(int i, int i10, int i11) {
        Long lValueOf;
        int i12 = i - 1;
        int i13 = i12 / 30;
        int i14 = i12 % 30;
        int iIntValue = w0(i13)[Math.abs(i14)].intValue();
        if (i14 < 0) {
            iIntValue = -iIntValue;
        }
        try {
            lValueOf = f44456x[i13];
        } catch (ArrayIndexOutOfBoundsException unused) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            lValueOf = Long.valueOf(i13 * 10631);
        }
        return ((lValueOf.longValue() + iIntValue) - 492149) + x0(i)[i10 - 1].intValue() + i11;
    }

    @Override // na.a
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final j s0(long j4) {
        return new j(this.i + j4);
    }

    @Override // na.b
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public final j r0(long j4, qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return (j) hVar.adjustInto(this, j4);
        }
        qa.a aVar = (qa.a) hVar;
        aVar.checkValidValue(j4);
        int i = (int) j4;
        int i10 = a.f44465a[aVar.ordinal()];
        int i11 = this.f44462f;
        int i12 = this.f44461e;
        int i13 = this.f44460d;
        switch (i10) {
            case 1:
                return H0(i13, i12, i);
            case 2:
                int i14 = i - 1;
                return H0(i13, (i14 / 30) + 1, (i14 % 30) + 1);
            case 3:
                return s0((j4 - getLong(qa.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                if (i13 < 1) {
                    i = 1 - i;
                }
                return H0(i, i12, i11);
            case 5:
                return s0(j4 - this.f44464h.getValue());
            case 6:
                return s0(j4 - getLong(qa.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return s0(j4 - getLong(qa.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return new j(i);
            case 9:
                return s0((j4 - getLong(qa.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 10:
                return H0(i13, i, i11);
            case 11:
                return H0(i, i12, i11);
            case 12:
                return H0(1 - i13, i12, i11);
            default:
                throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
        }
    }

    @Override // na.b, qa.d
    /* renamed from: e */
    public final qa.d s0(ma.e eVar) {
        return (j) super.s0(eVar);
    }

    @Override // pa.a, qa.e
    public final long getLong(qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return hVar.getFrom(this);
        }
        int i = a.f44465a[((qa.a) hVar).ordinal()];
        int i10 = this.f44460d;
        int i11 = this.f44462f;
        int i12 = this.f44463g;
        switch (i) {
            case 1:
                return i11;
            case 2:
                return i12;
            case 3:
                return C4356c.c(i11, 1, 7, 1);
            case 4:
                return i10;
            case 5:
                return this.f44464h.getValue();
            case 6:
                return ((i11 - 1) % 7) + 1;
            case 7:
                return ((i12 - 1) % 7) + 1;
            case 8:
                return o0();
            case 9:
                return C4356c.c(i12, 1, 7, 1);
            case 10:
                return this.f44461e;
            case 11:
                return i10;
            case 12:
                return this.f44459c.getValue();
            default:
                throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
        }
    }

    @Override // na.a, na.b
    public final c<j> i0(ma.g gVar) {
        return new d(this, gVar);
    }

    @Override // na.b
    public final g k0() {
        return i.f44435d;
    }

    @Override // na.b
    public final h l0() {
        return this.f44459c;
    }

    @Override // na.b
    /* renamed from: m0 */
    public final b u(long j4, qa.k kVar) {
        return (j) super.u(j4, kVar);
    }

    @Override // na.a, na.b
    /* renamed from: n0 */
    public final b q(long j4, qa.k kVar) {
        return (j) super.q(j4, kVar);
    }

    @Override // na.b
    public final long o0() {
        return z0(this.f44460d, this.f44461e, this.f44462f);
    }

    @Override // na.a, na.b, qa.d
    public final qa.d q(long j4, qa.k kVar) {
        return (j) super.q(j4, kVar);
    }

    @Override // na.b
    /* renamed from: q0 */
    public final b s0(qa.f fVar) {
        return (j) super.s0(fVar);
    }

    @Override // na.a
    /* renamed from: r0 */
    public final na.a q(long j4, qa.k kVar) {
        return (j) super.q(j4, kVar);
    }

    @Override // I9.g, qa.e
    public final qa.m range(qa.h hVar) {
        int iIntValue;
        if (!(hVar instanceof qa.a)) {
            return hVar.rangeRefinedBy(this);
        }
        if (!isSupported(hVar)) {
            throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
        }
        qa.a aVar = (qa.a) hVar;
        int i = a.f44465a[aVar.ordinal()];
        Integer[] numArr = null;
        int i10 = this.f44460d;
        if (i == 1) {
            int i11 = this.f44461e - 1;
            try {
                numArr = f44454v.get(Integer.valueOf(i10));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (numArr == null) {
                numArr = C0((long) i10) ? f44440E : f44439D;
            }
            return qa.m.c(1L, numArr[i11].intValue());
        }
        if (i != 2) {
            if (i == 3) {
                return qa.m.c(1L, 5L);
            }
            if (i == 4) {
                return qa.m.c(1L, 1000L);
            }
            i.f44435d.getClass();
            return aVar.range();
        }
        int i12 = i10 - 1;
        int i13 = i12 / 30;
        try {
            numArr = f44455w.get(Integer.valueOf(i13));
        } catch (ArrayIndexOutOfBoundsException unused2) {
        }
        if (numArr != null) {
            int i14 = i12 % 30;
            if (i14 == 29) {
                Long[] lArr = f44456x;
                iIntValue = (lArr[i13 + 1].intValue() - lArr[i13].intValue()) - numArr[i14].intValue();
            } else {
                iIntValue = numArr[i14 + 1].intValue() - numArr[i14].intValue();
            }
        } else {
            iIntValue = C0((long) i10) ? 355 : 354;
        }
        return qa.m.c(1L, iIntValue);
    }

    @Override // na.a
    public final na.a t0(long j4) {
        if (j4 == 0) {
            return this;
        }
        int i = (this.f44461e - 1) + ((int) j4);
        int i10 = i / 12;
        int i11 = i % 12;
        while (i11 < 0) {
            i11 += 12;
            int i12 = i10 - 1;
            if ((i10 ^ i12) < 0 && (i10 ^ 1) < 0) {
                throw new ArithmeticException(C4356c.i(i10, "Subtraction overflows an int: ", " - 1"));
            }
            i10 = i12;
        }
        return D0(this.f44459c, com.google.gson.internal.c.A(this.f44460d, i10), i11 + 1, this.f44462f);
    }

    @Override // na.b, pa.a, qa.d
    public final qa.d u(long j4, qa.k kVar) {
        return (j) super.u(j4, kVar);
    }

    @Override // na.a
    public final na.a u0(long j4) {
        if (j4 == 0) {
            return this;
        }
        return D0(this.f44459c, com.google.gson.internal.c.A(this.f44460d, (int) j4), this.f44461e, this.f44462f);
    }
}

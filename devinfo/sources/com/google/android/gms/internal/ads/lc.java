package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lc {

    /* renamed from: a, reason: collision with root package name */
    public Object f13452a;

    /* renamed from: b, reason: collision with root package name */
    public long f13453b;

    /* renamed from: c, reason: collision with root package name */
    public double f13454c;

    /* renamed from: d, reason: collision with root package name */
    public rb f13455d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f13456e;

    /* renamed from: f, reason: collision with root package name */
    public ec f13457f;
    public int g = 1;

    public static lc a(Object obj) {
        lc lcVar = new lc();
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        int i4 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iM = d7.m((i10 & (~i4)) | i11, (i4 & i12) | i13, i14, i15);
        lcVar.r();
        lcVar.g = (i16 % 1937477084) ^ iM;
        lcVar.f13452a = obj;
        return lcVar;
    }

    public static lc b(long j) {
        lc lcVar = new lc();
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        int i4 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iM = d7.m((i10 & (~i4)) | i11, (i4 & i12) | i13, i14, i15);
        lcVar.r();
        lcVar.g = (i16 % 327254586) ^ iM;
        lcVar.f13453b = j;
        return lcVar;
    }

    public static lc c(double d10) {
        lc lcVar = new lc();
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        int i4 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iM = d7.m((i10 & (~i4)) | i11, (i4 & i12) | i13, i14, i15);
        lcVar.r();
        lcVar.g = (i16 % 1605908235) ^ iM;
        lcVar.f13454c = d10;
        return lcVar;
    }

    public static lc d(rb rbVar) {
        lc lcVar = new lc();
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        int i4 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iM = d7.m((i10 & (~i4)) | i11, (i4 & i12) | i13, i14, i15);
        lcVar.r();
        lcVar.g = (i16 % 1402586708) ^ iM;
        lcVar.f13455d = rbVar;
        return lcVar;
    }

    public static lc e(ArrayList arrayList) {
        lc lcVar = new lc();
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        int i4 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iM = d7.m((i10 & (~i4)) | i11, (i4 & i12) | i13, i14, i15);
        lcVar.r();
        lcVar.g = (i16 % 324763920) ^ iM;
        lcVar.f13456e = arrayList;
        return lcVar;
    }

    public static lc f(ec ecVar) {
        lc lcVar = new lc();
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        int i4 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iM = d7.m((i10 & (~i4)) | i11, (i4 & i12) | i13, i14, i15);
        lcVar.r();
        lcVar.g = (i16 % 474613996) ^ iM;
        lcVar.f13457f = ecVar;
        return lcVar;
    }

    public static lc g(Object obj) {
        if (obj instanceof Long) {
            return b(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return b(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Integer) {
            return b(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return c(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return c(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return b(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return b(((Byte) obj).byteValue());
        }
        if (obj instanceof rb) {
            return d((rb) obj);
        }
        if (obj instanceof String) {
            return d(rb.e(((String) obj).getBytes(Charset.forName(qb.a("Hn2H4l0=")))));
        }
        if (!(obj instanceof ArrayList)) {
            return a(obj);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(g(arrayList2.get(i4)));
        }
        return e(arrayList);
    }

    public static lc j(lc lcVar) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i4 = 0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iM = d7.m((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        int i18 = i17 % 552812661;
        try {
            int i19 = lcVar.g;
            int i20 = (i18 ^ iM) + i19;
            if (i19 == 0) {
                throw null;
            }
            switch (i20) {
                case 0:
                    return new lc();
                case 1:
                    return a(lcVar.l());
                case 2:
                    return b(lcVar.m());
                case 3:
                    return d(lcVar.n());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = (ArrayList) lcVar.o();
                    int size = arrayList2.size();
                    while (i4 < size) {
                        Object obj = arrayList2.get(i4);
                        i4++;
                        arrayList.add(j((lc) obj));
                    }
                    return e(arrayList);
                case 5:
                    return f(lcVar.p());
                case 6:
                    return c(lcVar.q());
                default:
                    throw new AssertionError(qb.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
            }
        } catch (jc e2) {
            throw new AssertionError(qb.a("CEiv6BFfPnitUE+D"), e2);
        }
    }

    public final Object h() throws jc {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i4 = 0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iM = d7.m((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        int i18 = this.g;
        int i19 = ((i17 % 473891334) ^ iM) + i18;
        if (i18 == 0) {
            throw null;
        }
        switch (i19) {
            case 0:
            case 5:
                throw new jc();
            case 1:
                return l();
            case 2:
                return Long.valueOf(m());
            case 3:
                return n().a();
            case 4:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) o();
                int size = arrayList2.size();
                while (i4 < size) {
                    Object obj = arrayList2.get(i4);
                    i4++;
                    arrayList.add(((lc) obj).h());
                }
                return arrayList;
            case 6:
                return Double.valueOf(q());
            default:
                throw new AssertionError(qb.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x01f4, code lost:
    
        if (r18.equals(java.lang.Object.class) != false) goto L150;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.Class r18) throws java.lang.ArrayIndexOutOfBoundsException, java.lang.IllegalArgumentException, com.google.android.gms.internal.ads.jc, java.lang.NegativeArraySizeException {
        /*
            Method dump skipped, instructions count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lc.i(java.lang.Class):java.lang.Object");
    }

    public final void k(ByteArrayOutputStream byteArrayOutputStream) throws IOException, jc {
        long[] jArr = {1269833163, 1628598594, 308676977, 1629286434, 15633520, 3337700125L, 1402923307, 613197917, 297598514};
        int i4 = 0;
        long j = jArr[0];
        long j8 = jArr[1];
        long j9 = jArr[2];
        long j10 = jArr[3];
        long j11 = jArr[4];
        long j12 = jArr[5];
        long j13 = jArr[6];
        long j14 = jArr[7];
        long j15 = (((((~j) & j8) | j9) + ((j & j10) | j11)) - j12) + j13;
        long j16 = j14 % 297598514;
        int i10 = this.g;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        int i12 = 8;
        switch (i11) {
            case 0:
            case 1:
            case 5:
                throw new jc();
            case 2:
                w5.x(m(), new fk0(i12, byteArrayOutputStream), true);
                return;
            case 3:
                byte[] bArr = n().f15610a;
                w5.x(bArr.length * (j15 ^ j16), new fk0(i12, byteArrayOutputStream), true);
                byteArrayOutputStream.write(bArr);
                return;
            case 4:
                ArrayList arrayList = (ArrayList) o();
                w5.x(arrayList.size(), new fk0(i12, byteArrayOutputStream), true);
                int size = arrayList.size();
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((lc) obj).k(byteArrayOutputStream);
                }
                return;
            case 6:
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(q());
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.putLong(jDoubleToRawLongBits);
                byte[] bArrArray = byteBufferAllocate.array();
                int length = bArrArray.length;
                while (i4 < length) {
                    byteArrayOutputStream.write(bArrArray[i4]);
                    i4++;
                }
                int length2 = byteBufferAllocate.array().length;
                return;
            default:
                return;
        }
    }

    public final Object l() throws jc {
        int[] iArr = {427355115, 404248040, 1318670750, 874677346, 1819730563, -970011213, 126401947, 1858504292, 235745791};
        int i4 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        s((iArr[7] % 235745791) ^ d7.m((i10 & (~i4)) | i11, (i4 & i12) | i13, i14, i15));
        return this.f13452a;
    }

    public final long m() throws jc {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i4 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        s((iArr[7] % 733327814) ^ d7.m((i10 & (~i4)) | i11, (i4 & i12) | i13, i14, i15));
        return this.f13453b;
    }

    public final rb n() throws jc {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i4 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        s((iArr[7] % 1140384172) ^ d7.m((i10 & (~i4)) | i11, (i4 & i12) | i13, i14, i15));
        return this.f13455d;
    }

    public final List o() throws jc {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i4 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        s((iArr[7] % 1250801052) ^ d7.m((i10 & (~i4)) | i11, (i4 & i12) | i13, i14, i15));
        return this.f13456e;
    }

    public final ec p() throws jc {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i4 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        s((iArr[7] % 395191309) ^ d7.m((i10 & (~i4)) | i11, (i4 & i12) | i13, i14, i15));
        return this.f13457f;
    }

    public final double q() throws jc {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i4 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        s((iArr[7] % 846930886) ^ d7.m((i10 & (~i4)) | i11, (i4 & i12) | i13, i14, i15));
        return this.f13454c;
    }

    public final void r() {
        this.g = 1;
        this.f13453b = 0L;
        this.f13452a = null;
        this.f13455d = null;
        this.f13456e = null;
        this.f13457f = null;
    }

    public final void s(int i4) throws jc {
        if (i4 != this.g) {
            throw new jc();
        }
    }
}

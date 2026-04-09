package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class E5 {

    /* renamed from: a, reason: collision with root package name */
    public Object f7905a;

    /* renamed from: b, reason: collision with root package name */
    public long f7906b;

    /* renamed from: c, reason: collision with root package name */
    public double f7907c;

    /* renamed from: d, reason: collision with root package name */
    public C1458l5 f7908d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f7909e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2105x5 f7910f;

    /* renamed from: g, reason: collision with root package name */
    public int f7911g = 1;

    public static E5 a(Object obj) {
        E5 e52 = new E5();
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        int i = iArr[0];
        int i3 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int iD = A.f.d((i3 & (~i)) | i6, (i & i7) | i8, i9, i10);
        e52.r();
        e52.f7911g = (i11 % 1937477084) ^ iD;
        e52.f7905a = obj;
        return e52;
    }

    public static E5 b(long j6) {
        E5 e52 = new E5();
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        int i = iArr[0];
        int i3 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int iD = A.f.d((i3 & (~i)) | i6, (i & i7) | i8, i9, i10);
        e52.r();
        e52.f7911g = (i11 % 327254586) ^ iD;
        e52.f7906b = j6;
        return e52;
    }

    public static E5 c(double d6) {
        E5 e52 = new E5();
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        int i = iArr[0];
        int i3 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int iD = A.f.d((i3 & (~i)) | i6, (i & i7) | i8, i9, i10);
        e52.r();
        e52.f7911g = (i11 % 1605908235) ^ iD;
        e52.f7907c = d6;
        return e52;
    }

    public static E5 d(C1458l5 c1458l5) {
        E5 e52 = new E5();
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        int i = iArr[0];
        int i3 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int iD = A.f.d((i3 & (~i)) | i6, (i & i7) | i8, i9, i10);
        e52.r();
        e52.f7911g = (i11 % 1402586708) ^ iD;
        e52.f7908d = c1458l5;
        return e52;
    }

    public static E5 e(ArrayList arrayList) {
        E5 e52 = new E5();
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        int i = iArr[0];
        int i3 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int iD = A.f.d((i3 & (~i)) | i6, (i & i7) | i8, i9, i10);
        e52.r();
        e52.f7911g = (i11 % 324763920) ^ iD;
        e52.f7909e = arrayList;
        return e52;
    }

    public static E5 f(InterfaceC2105x5 interfaceC2105x5) {
        E5 e52 = new E5();
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        int i = iArr[0];
        int i3 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int iD = A.f.d((i3 & (~i)) | i6, (i & i7) | i8, i9, i10);
        e52.r();
        e52.f7911g = (i11 % 474613996) ^ iD;
        e52.f7910f = interfaceC2105x5;
        return e52;
    }

    public static E5 g(Object obj) {
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
        if (obj instanceof C1458l5) {
            return d((C1458l5) obj);
        }
        if (obj instanceof String) {
            return d(C1458l5.e(((String) obj).getBytes(Charset.forName(AbstractC1404k5.a("Hn2H4l0=")))));
        }
        if (!(obj instanceof ArrayList)) {
            return a(obj);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(g(arrayList2.get(i)));
        }
        return e(arrayList);
    }

    public static E5 j(E5 e52) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i = 0;
        int i3 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        int i12 = iArr[7];
        int iD = A.f.d((i6 & (~i3)) | i7, (i3 & i8) | i9, i10, i11);
        int i13 = i12 % 552812661;
        try {
            int i14 = e52.f7911g;
            int i15 = (i13 ^ iD) + i14;
            if (i14 == 0) {
                throw null;
            }
            switch (i15) {
                case 0:
                    return new E5();
                case 1:
                    return a(e52.l());
                case 2:
                    return b(e52.m());
                case 3:
                    return d(e52.n());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = (ArrayList) e52.o();
                    int size = arrayList2.size();
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        arrayList.add(j((E5) obj));
                    }
                    return e(arrayList);
                case 5:
                    return f(e52.p());
                case 6:
                    return c(e52.q());
                default:
                    throw new AssertionError(AbstractC1404k5.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
            }
        } catch (C5 e6) {
            throw new AssertionError(AbstractC1404k5.a("CEiv6BFfPnitUE+D"), e6);
        }
    }

    public final Object h() throws C5 {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i = 0;
        int i3 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        int i12 = iArr[7];
        int iD = A.f.d((i6 & (~i3)) | i7, (i3 & i8) | i9, i10, i11);
        int i13 = this.f7911g;
        int i14 = ((i12 % 473891334) ^ iD) + i13;
        if (i13 == 0) {
            throw null;
        }
        switch (i14) {
            case 0:
            case 5:
                throw new C5();
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
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    arrayList.add(((E5) obj).h());
                }
                return arrayList;
            case 6:
                return Double.valueOf(q());
            default:
                throw new AssertionError(AbstractC1404k5.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x01f4, code lost:
    
        if (r18.equals(java.lang.Object.class) != false) goto L150;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.Class r18) throws com.google.android.gms.internal.ads.C5, java.lang.ArrayIndexOutOfBoundsException, java.lang.IllegalArgumentException, java.lang.NegativeArraySizeException {
        /*
            Method dump skipped, instructions count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.E5.i(java.lang.Class):java.lang.Object");
    }

    public final void k(ByteArrayOutputStream byteArrayOutputStream) throws C5, IOException {
        long[] jArr = {1269833163, 1628598594, 308676977, 1629286434, 15633520, 3337700125L, 1402923307, 613197917, 297598514};
        int i = 0;
        long j6 = jArr[0];
        long j7 = jArr[1];
        long j8 = jArr[2];
        long j9 = jArr[3];
        long j10 = jArr[4];
        int i3 = 5;
        long j11 = jArr[5];
        long j12 = jArr[6];
        long j13 = jArr[7];
        long j14 = (((((~j6) & j7) | j8) + ((j6 & j9) | j10)) - j11) + j12;
        long j15 = j13 % 297598514;
        int i6 = this.f7911g;
        int i7 = i6 - 1;
        if (i6 == 0) {
            throw null;
        }
        switch (i7) {
            case 0:
            case 1:
            case 5:
                throw new C5();
            case 2:
                C1994v2.w(m(), new Rx(i3, byteArrayOutputStream), true);
                return;
            case 3:
                byte[] bArr = n().f15350a;
                C1994v2.w(bArr.length * (j14 ^ j15), new Rx(i3, byteArrayOutputStream), true);
                byteArrayOutputStream.write(bArr);
                return;
            case 4:
                ArrayList arrayList = (ArrayList) o();
                C1994v2.w(arrayList.size(), new Rx(i3, byteArrayOutputStream), true);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((E5) obj).k(byteArrayOutputStream);
                }
                return;
            case 6:
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(q());
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.putLong(jDoubleToRawLongBits);
                byte[] bArrArray = byteBufferAllocate.array();
                int length = bArrArray.length;
                while (i < length) {
                    byteArrayOutputStream.write(bArrArray[i]);
                    i++;
                }
                int length2 = byteBufferAllocate.array().length;
                return;
            default:
                return;
        }
    }

    public final Object l() throws C5 {
        int[] iArr = {427355115, 404248040, 1318670750, 874677346, 1819730563, -970011213, 126401947, 1858504292, 235745791};
        int i = iArr[0];
        int i3 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        s((iArr[7] % 235745791) ^ A.f.d((i3 & (~i)) | i6, (i & i7) | i8, i9, i10));
        return this.f7905a;
    }

    public final long m() throws C5 {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i = iArr[0];
        int i3 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        s((iArr[7] % 733327814) ^ A.f.d((i3 & (~i)) | i6, (i & i7) | i8, i9, i10));
        return this.f7906b;
    }

    public final C1458l5 n() throws C5 {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i = iArr[0];
        int i3 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        s((iArr[7] % 1140384172) ^ A.f.d((i3 & (~i)) | i6, (i & i7) | i8, i9, i10));
        return this.f7908d;
    }

    public final List o() throws C5 {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i = iArr[0];
        int i3 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        s((iArr[7] % 1250801052) ^ A.f.d((i3 & (~i)) | i6, (i & i7) | i8, i9, i10));
        return this.f7909e;
    }

    public final InterfaceC2105x5 p() throws C5 {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i = iArr[0];
        int i3 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        s((iArr[7] % 395191309) ^ A.f.d((i3 & (~i)) | i6, (i & i7) | i8, i9, i10));
        return this.f7910f;
    }

    public final double q() throws C5 {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i = iArr[0];
        int i3 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        s((iArr[7] % 846930886) ^ A.f.d((i3 & (~i)) | i6, (i & i7) | i8, i9, i10));
        return this.f7907c;
    }

    public final void r() {
        this.f7911g = 1;
        this.f7906b = 0L;
        this.f7905a = null;
        this.f7908d = null;
        this.f7909e = null;
        this.f7910f = null;
    }

    public final void s(int i) throws C5 {
        if (i != this.f7911g) {
            throw new C5();
        }
    }
}

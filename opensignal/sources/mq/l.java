package mq;

import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class l extends i4 {
    public static List A0(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new j(objArr, false)) : e5.H(objArr[0]) : w.f16945a;
    }

    public static Set B0(Object[] objArr) {
        br.l.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return y.f16947a;
        }
        if (length == 1) {
            return i3.g.H(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(b0.P(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static ArrayList C0(Object[] objArr, Object[] objArr2) {
        br.l.e(objArr, "<this>");
        br.l.e(objArr2, "other");
        int iMin = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new lq.l(objArr[i10], objArr2[i10]));
        }
        return arrayList;
    }

    public static List X(Object[] objArr) {
        br.l.e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        br.l.d(listAsList, "asList(...)");
        return listAsList;
    }

    public static st.j Y(Object[] objArr) {
        return objArr.length == 0 ? st.d.f22279a : new n(0, objArr);
    }

    public static boolean Z(Object obj, Object[] objArr) {
        br.l.e(objArr, "<this>");
        return r0(obj, objArr) >= 0;
    }

    public static void a0(int i10, int i11, int i12, byte[] bArr, byte[] bArr2) {
        br.l.e(bArr, "<this>");
        br.l.e(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
    }

    public static void b0(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        br.l.e(iArr, "<this>");
        br.l.e(iArr2, "destination");
        System.arraycopy(iArr, i11, iArr2, i10, i12 - i11);
    }

    public static void c0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        br.l.e(objArr, "<this>");
        br.l.e(objArr2, "destination");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
    }

    public static void d0(long[] jArr, long[] jArr2, int i10, int i11, int i12) {
        br.l.e(jArr, "<this>");
        br.l.e(jArr2, "destination");
        System.arraycopy(jArr, i11, jArr2, i10, i12 - i11);
    }

    public static /* synthetic */ void e0(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = iArr.length;
        }
        b0(i10, 0, i11, iArr, iArr2);
    }

    public static /* synthetic */ void f0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        c0(0, i10, i11, objArr, objArr2);
    }

    public static byte[] g0(byte[] bArr, int i10, int i11) {
        br.l.e(bArr, "<this>");
        i4.j(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        br.l.d(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] h0(Object[] objArr, int i10, int i11) {
        br.l.e(objArr, "<this>");
        i4.j(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        br.l.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void i0(Object[] objArr, int i10, int i11) {
        br.l.e(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, (Object) null);
    }

    public static void j0(long[] jArr, long j) {
        int length = jArr.length;
        br.l.e(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j);
    }

    public static ArrayList l0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object m0(Object[] objArr) {
        br.l.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object n0(Object[] objArr) {
        br.l.e(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static int o0(long[] jArr) {
        br.l.e(jArr, "<this>");
        return jArr.length - 1;
    }

    public static Integer p0(int[] iArr, int i10) {
        br.l.e(iArr, "<this>");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    public static Object q0(int i10, Object[] objArr) {
        br.l.e(objArr, "<this>");
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }

    public static int r0(Object obj, Object[] objArr) {
        br.l.e(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final void s0(Object[] objArr, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, ar.k kVar) {
        br.l.e(objArr, "<this>");
        sb2.append(charSequence2);
        int i10 = 0;
        for (Object obj : objArr) {
            i10++;
            if (i10 > 1) {
                sb2.append(charSequence);
            }
            e5.c(sb2, obj, kVar);
        }
        sb2.append(charSequence3);
    }

    public static String t0(byte[] bArr, String str, ar.k kVar, int i10) {
        String str2 = (i10 & 2) != 0 ? "" : "[";
        String str3 = (i10 & 4) == 0 ? "]" : "";
        if ((i10 & 32) != 0) {
            kVar = null;
        }
        br.l.e(bArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int i11 = 0;
        for (byte b2 : bArr) {
            i11++;
            if (i11 > 1) {
                sb2.append((CharSequence) str);
            }
            if (kVar != null) {
                sb2.append((CharSequence) kVar.a(Byte.valueOf(b2)));
            } else {
                sb2.append((CharSequence) String.valueOf((int) b2));
            }
        }
        sb2.append((CharSequence) str3);
        return sb2.toString();
    }

    public static String u0(Object[] objArr, String str, String str2, ar.k kVar, int i10) {
        String str3 = (i10 & 1) != 0 ? ", " : "";
        String str4 = (i10 & 2) != 0 ? "" : str;
        String str5 = (i10 & 4) != 0 ? "" : str2;
        if ((i10 & 32) != 0) {
            kVar = null;
        }
        br.l.e(objArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        s0(objArr, sb2, str3, str4, str5, "...", kVar);
        return sb2.toString();
    }

    public static Object v0(Object[] objArr) {
        br.l.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static char w0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object x0(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static void y0(Object[] objArr, Comparator comparator) {
        br.l.e(objArr, "<this>");
        br.l.e(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static void z0(Object[] objArr, Comparator comparator, int i10, int i11) {
        br.l.e(objArr, "<this>");
        br.l.e(comparator, "comparator");
        Arrays.sort(objArr, i10, i11, comparator);
    }
}

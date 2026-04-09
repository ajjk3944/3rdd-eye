package Zg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC6492s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: Zg.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3685q extends AbstractC3684p {

    /* renamed from: Zg.q$a */
    public static final class a extends AbstractC3672d implements RandomAccess {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f25388b;

        a(int[] iArr) {
            this.f25388b = iArr;
        }

        public int C(int i10) {
            return AbstractC3686s.k0(this.f25388b, i10);
        }

        public int J(int i10) {
            return AbstractC3686s.L0(this.f25388b, i10);
        }

        @Override // Zg.AbstractC3670b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return v(((Number) obj).intValue());
            }
            return false;
        }

        @Override // Zg.AbstractC3672d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return C(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // Zg.AbstractC3670b, java.util.Collection
        public boolean isEmpty() {
            return this.f25388b.length == 0;
        }

        @Override // Zg.AbstractC3670b
        public int j() {
            return this.f25388b.length;
        }

        @Override // Zg.AbstractC3672d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return J(((Number) obj).intValue());
            }
            return -1;
        }

        public boolean v(int i10) {
            return AbstractC3682n.S(this.f25388b, i10);
        }

        @Override // Zg.AbstractC3672d, java.util.List
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public Integer get(int i10) {
            return Integer.valueOf(this.f25388b[i10]);
        }
    }

    public static int[] A(int[] iArr, int i10) {
        AbstractC6492s.i(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i10;
        AbstractC6492s.f(iArrCopyOf);
        return iArrCopyOf;
    }

    public static int[] B(int[] iArr, int[] elements) {
        AbstractC6492s.i(iArr, "<this>");
        AbstractC6492s.i(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        AbstractC6492s.f(iArrCopyOf);
        return iArrCopyOf;
    }

    public static long[] C(long[] jArr, long[] elements) {
        AbstractC6492s.i(jArr, "<this>");
        AbstractC6492s.i(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, jArrCopyOf, length, length2);
        AbstractC6492s.f(jArrCopyOf);
        return jArrCopyOf;
    }

    public static Object[] D(Object[] objArr, Object obj) {
        AbstractC6492s.i(objArr, "<this>");
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        AbstractC6492s.f(objArrCopyOf);
        return objArrCopyOf;
    }

    public static Object[] E(Object[] objArr, Object[] elements) {
        AbstractC6492s.i(objArr, "<this>");
        AbstractC6492s.i(elements, "elements");
        int length = objArr.length;
        int length2 = elements.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(elements, 0, objArrCopyOf, length, length2);
        AbstractC6492s.f(objArrCopyOf);
        return objArrCopyOf;
    }

    public static boolean[] F(boolean[] zArr, boolean[] elements) {
        AbstractC6492s.i(zArr, "<this>");
        AbstractC6492s.i(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, zArrCopyOf, length, length2);
        AbstractC6492s.f(zArrCopyOf);
        return zArrCopyOf;
    }

    public static void G(int[] iArr, int i10, int i11) {
        AbstractC6492s.i(iArr, "<this>");
        Arrays.sort(iArr, i10, i11);
    }

    public static void H(Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static final void I(Object[] objArr, Comparator comparator) {
        AbstractC6492s.i(objArr, "<this>");
        AbstractC6492s.i(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static void J(Object[] objArr, Comparator comparator, int i10, int i11) {
        AbstractC6492s.i(objArr, "<this>");
        AbstractC6492s.i(comparator, "comparator");
        Arrays.sort(objArr, i10, i11, comparator);
    }

    public static Boolean[] K(boolean[] zArr) {
        AbstractC6492s.i(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    public static Float[] L(float[] fArr) {
        AbstractC6492s.i(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    public static Integer[] M(int[] iArr) {
        AbstractC6492s.i(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    public static Long[] N(long[] jArr) {
        AbstractC6492s.i(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    public static List d(int[] iArr) {
        AbstractC6492s.i(iArr, "<this>");
        return new a(iArr);
    }

    public static List e(Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        List listA = AbstractC3687t.a(objArr);
        AbstractC6492s.h(listA, "asList(...)");
        return listA;
    }

    public static final int f(float[] fArr, float f10, int i10, int i11) {
        AbstractC6492s.i(fArr, "<this>");
        return Arrays.binarySearch(fArr, i10, i11, f10);
    }

    public static /* synthetic */ int g(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        return f(fArr, f10, i10, i11);
    }

    public static byte[] h(byte[] bArr, byte[] destination, int i10, int i11, int i12) {
        AbstractC6492s.i(bArr, "<this>");
        AbstractC6492s.i(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static char[] i(char[] cArr, char[] destination, int i10, int i11, int i12) {
        AbstractC6492s.i(cArr, "<this>");
        AbstractC6492s.i(destination, "destination");
        System.arraycopy(cArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static float[] j(float[] fArr, float[] destination, int i10, int i11, int i12) {
        AbstractC6492s.i(fArr, "<this>");
        AbstractC6492s.i(destination, "destination");
        System.arraycopy(fArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static int[] k(int[] iArr, int[] destination, int i10, int i11, int i12) {
        AbstractC6492s.i(iArr, "<this>");
        AbstractC6492s.i(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static long[] l(long[] jArr, long[] destination, int i10, int i11, int i12) {
        AbstractC6492s.i(jArr, "<this>");
        AbstractC6492s.i(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static Object[] m(Object[] objArr, Object[] destination, int i10, int i11, int i12) {
        AbstractC6492s.i(objArr, "<this>");
        AbstractC6492s.i(destination, "destination");
        System.arraycopy(objArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ byte[] n(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return AbstractC3682n.h(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ float[] o(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return AbstractC3682n.j(fArr, fArr2, i10, i11, i12);
    }

    public static /* synthetic */ int[] p(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return AbstractC3682n.k(iArr, iArr2, i10, i11, i12);
    }

    public static /* synthetic */ Object[] q(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return AbstractC3682n.m(objArr, objArr2, i10, i11, i12);
    }

    public static byte[] r(byte[] bArr, int i10, int i11) {
        AbstractC6492s.i(bArr, "<this>");
        AbstractC3683o.b(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        AbstractC6492s.h(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] s(Object[] objArr, int i10, int i11) {
        AbstractC6492s.i(objArr, "<this>");
        AbstractC3683o.b(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        AbstractC6492s.h(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static final void t(int[] iArr, int i10, int i11, int i12) {
        AbstractC6492s.i(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static final void u(long[] jArr, long j10, int i10, int i11) {
        AbstractC6492s.i(jArr, "<this>");
        Arrays.fill(jArr, i10, i11, j10);
    }

    public static void v(Object[] objArr, Object obj, int i10, int i11) {
        AbstractC6492s.i(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, obj);
    }

    public static /* synthetic */ void w(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        t(iArr, i10, i11, i12);
    }

    public static /* synthetic */ void x(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        u(jArr, j10, i10, i11);
    }

    public static /* synthetic */ void y(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        AbstractC3682n.v(objArr, obj, i10, i11);
    }

    public static float[] z(float[] fArr, float[] elements) {
        AbstractC6492s.i(fArr, "<this>");
        AbstractC6492s.i(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, fArrCopyOf, length, length2);
        AbstractC6492s.f(fArrCopyOf);
        return fArrCopyOf;
    }
}

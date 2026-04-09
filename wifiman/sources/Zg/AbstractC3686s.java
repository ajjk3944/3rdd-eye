package Zg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6477c;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import nh.InterfaceC6944a;
import sh.AbstractC7978m;
import sh.C7974i;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: Zg.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3686s extends AbstractC3685q {

    /* renamed from: Zg.s$a */
    public static final class a implements Iterable, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f25390a;

        public a(Object[] objArr) {
            this.f25390a = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC6477c.a(this.f25390a);
        }
    }

    /* renamed from: Zg.s$b */
    public static final class b implements InterfaceC8780j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f25391a;

        public b(Object[] objArr) {
            this.f25391a = objArr;
        }

        @Override // zi.InterfaceC8780j
        public Iterator iterator() {
            return AbstractC6477c.a(this.f25391a);
        }
    }

    public static final String A0(long[] jArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(jArr, "<this>");
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        return ((StringBuilder) s0(jArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC6835l)).toString();
    }

    public static final String B0(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(objArr, "<this>");
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        return ((StringBuilder) t0(objArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC6835l)).toString();
    }

    public static final String C0(short[] sArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(sArr, "<this>");
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        return ((StringBuilder) u0(sArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC6835l)).toString();
    }

    public static /* synthetic */ String D0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC6835l interfaceC6835l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC6835l = null;
        }
        return w0(bArr, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC6835l);
    }

    public static /* synthetic */ String E0(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC6835l interfaceC6835l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC6835l = null;
        }
        return x0(dArr, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC6835l);
    }

    public static /* synthetic */ String F0(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC6835l interfaceC6835l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC6835l = null;
        }
        return y0(fArr, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC6835l);
    }

    public static /* synthetic */ String G0(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC6835l interfaceC6835l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC6835l = null;
        }
        return z0(iArr, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC6835l);
    }

    public static /* synthetic */ String H0(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC6835l interfaceC6835l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC6835l = null;
        }
        return A0(jArr, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC6835l);
    }

    public static /* synthetic */ String I0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC6835l interfaceC6835l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC6835l = null;
        }
        return B0(objArr, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC6835l);
    }

    public static /* synthetic */ String J0(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC6835l interfaceC6835l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC6835l = null;
        }
        return C0(sArr, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC6835l);
    }

    public static Object K0(Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[AbstractC3682n.g0(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int L0(int[] iArr, int i10) {
        AbstractC6492s.i(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (i10 == iArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    public static int M0(Object[] objArr, Object obj) {
        AbstractC6492s.i(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (AbstractC6492s.d(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    public static List N0(Object[] objArr, InterfaceC6835l transform) {
        AbstractC6492s.i(objArr, "<this>");
        AbstractC6492s.i(transform, "transform");
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(transform.invoke(obj));
        }
        return arrayList;
    }

    public static void O0(byte[] bArr) {
        AbstractC6492s.i(bArr, "<this>");
        int length = (bArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iD0 = AbstractC3682n.d0(bArr);
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[iD0];
            bArr[iD0] = b10;
            iD0--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static Iterable P(Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        return objArr.length == 0 ? AbstractC3689v.l() : new a(objArr);
    }

    public static char P0(char[] cArr) {
        AbstractC6492s.i(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static InterfaceC8780j Q(Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        return objArr.length == 0 ? AbstractC8783m.i() : new b(objArr);
    }

    public static Object Q0(Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static boolean R(byte[] bArr, byte b10) {
        AbstractC6492s.i(bArr, "<this>");
        return j0(bArr, b10) >= 0;
    }

    public static Object R0(Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static boolean S(int[] iArr, int i10) {
        AbstractC6492s.i(iArr, "<this>");
        return k0(iArr, i10) >= 0;
    }

    public static final Object[] S0(Object[] objArr, Comparator comparator) {
        AbstractC6492s.i(objArr, "<this>");
        AbstractC6492s.i(comparator, "comparator");
        if (objArr.length == 0) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC6492s.h(objArrCopyOf, "copyOf(...)");
        AbstractC3685q.I(objArrCopyOf, comparator);
        return objArrCopyOf;
    }

    public static boolean T(long[] jArr, long j10) {
        AbstractC6492s.i(jArr, "<this>");
        return l0(jArr, j10) >= 0;
    }

    public static List T0(Object[] objArr, Comparator comparator) {
        AbstractC6492s.i(objArr, "<this>");
        AbstractC6492s.i(comparator, "comparator");
        return AbstractC3682n.e(S0(objArr, comparator));
    }

    public static boolean U(Object[] objArr, Object obj) {
        AbstractC6492s.i(objArr, "<this>");
        return AbstractC3682n.m0(objArr, obj) >= 0;
    }

    public static int U0(int[] iArr) {
        AbstractC6492s.i(iArr, "<this>");
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }

    public static boolean V(short[] sArr, short s10) {
        AbstractC6492s.i(sArr, "<this>");
        return n0(sArr, s10) >= 0;
    }

    public static final List V0(Object[] objArr, int i10) {
        AbstractC6492s.i(objArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return AbstractC3689v.l();
        }
        int length = objArr.length;
        if (i10 >= length) {
            return AbstractC3682n.d1(objArr);
        }
        if (i10 == 1) {
            return AbstractC3689v.e(objArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(objArr[i11]);
        }
        return arrayList;
    }

    public static List W(Object[] objArr, int i10) {
        AbstractC6492s.i(objArr, "<this>");
        if (i10 >= 0) {
            return V0(objArr, AbstractC7978m.d(objArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final Collection W0(Object[] objArr, Collection destination) {
        AbstractC6492s.i(objArr, "<this>");
        AbstractC6492s.i(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    public static List X(Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        return (List) Y(objArr, new ArrayList());
    }

    public static List X0(byte[] bArr) {
        AbstractC6492s.i(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? g1(bArr) : AbstractC3689v.e(Byte.valueOf(bArr[0])) : AbstractC3689v.l();
    }

    public static final Collection Y(Object[] objArr, Collection destination) {
        AbstractC6492s.i(objArr, "<this>");
        AbstractC6492s.i(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static List Y0(char[] cArr) {
        AbstractC6492s.i(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? h1(cArr) : AbstractC3689v.e(Character.valueOf(cArr[0])) : AbstractC3689v.l();
    }

    public static Object Z(Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static List Z0(double[] dArr) {
        AbstractC6492s.i(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? i1(dArr) : AbstractC3689v.e(Double.valueOf(dArr[0])) : AbstractC3689v.l();
    }

    public static Object a0(Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static List a1(float[] fArr) {
        AbstractC6492s.i(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? j1(fArr) : AbstractC3689v.e(Float.valueOf(fArr[0])) : AbstractC3689v.l();
    }

    public static C7974i b0(int[] iArr) {
        AbstractC6492s.i(iArr, "<this>");
        return new C7974i(0, AbstractC3682n.e0(iArr));
    }

    public static List b1(int[] iArr) {
        AbstractC6492s.i(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? AbstractC3682n.k1(iArr) : AbstractC3689v.e(Integer.valueOf(iArr[0])) : AbstractC3689v.l();
    }

    public static C7974i c0(Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        return new C7974i(0, AbstractC3682n.g0(objArr));
    }

    public static List c1(long[] jArr) {
        AbstractC6492s.i(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? l1(jArr) : AbstractC3689v.e(Long.valueOf(jArr[0])) : AbstractC3689v.l();
    }

    public static int d0(byte[] bArr) {
        AbstractC6492s.i(bArr, "<this>");
        return bArr.length - 1;
    }

    public static List d1(Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? AbstractC3682n.m1(objArr) : AbstractC3689v.e(objArr[0]) : AbstractC3689v.l();
    }

    public static int e0(int[] iArr) {
        AbstractC6492s.i(iArr, "<this>");
        return iArr.length - 1;
    }

    public static List e1(short[] sArr) {
        AbstractC6492s.i(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? n1(sArr) : AbstractC3689v.e(Short.valueOf(sArr[0])) : AbstractC3689v.l();
    }

    public static int f0(long[] jArr) {
        AbstractC6492s.i(jArr, "<this>");
        return jArr.length - 1;
    }

    public static List f1(boolean[] zArr) {
        AbstractC6492s.i(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? o1(zArr) : AbstractC3689v.e(Boolean.valueOf(zArr[0])) : AbstractC3689v.l();
    }

    public static int g0(Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        return objArr.length - 1;
    }

    public static final List g1(byte[] bArr) {
        AbstractC6492s.i(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    public static Integer h0(int[] iArr, int i10) {
        AbstractC6492s.i(iArr, "<this>");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    public static final List h1(char[] cArr) {
        AbstractC6492s.i(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    public static Object i0(Object[] objArr, int i10) {
        AbstractC6492s.i(objArr, "<this>");
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }

    public static final List i1(double[] dArr) {
        AbstractC6492s.i(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    public static final int j0(byte[] bArr, byte b10) {
        AbstractC6492s.i(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final List j1(float[] fArr) {
        AbstractC6492s.i(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static final int k0(int[] iArr, int i10) {
        AbstractC6492s.i(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static List k1(int[] iArr) {
        AbstractC6492s.i(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static final int l0(long[] jArr, long j10) {
        AbstractC6492s.i(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final List l1(long[] jArr) {
        AbstractC6492s.i(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static int m0(Object[] objArr, Object obj) {
        AbstractC6492s.i(objArr, "<this>");
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
            if (AbstractC6492s.d(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static List m1(Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        return new ArrayList(AbstractC3691x.i(objArr));
    }

    public static final int n0(short[] sArr, short s10) {
        AbstractC6492s.i(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final List n1(short[] sArr) {
        AbstractC6492s.i(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    public static final Appendable o0(byte[] bArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) throws IOException {
        AbstractC6492s.i(bArr, "<this>");
        AbstractC6492s.i(buffer, "buffer");
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (interfaceC6835l != null) {
                buffer.append((CharSequence) interfaceC6835l.invoke(Byte.valueOf(b10)));
            } else {
                buffer.append(String.valueOf((int) b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final List o1(boolean[] zArr) {
        AbstractC6492s.i(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static final Appendable p0(double[] dArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) throws IOException {
        AbstractC6492s.i(dArr, "<this>");
        AbstractC6492s.i(buffer, "buffer");
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (double d10 : dArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (interfaceC6835l != null) {
                buffer.append((CharSequence) interfaceC6835l.invoke(Double.valueOf(d10)));
            } else {
                buffer.append(String.valueOf(d10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static Set p1(Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) W0(objArr, new LinkedHashSet(U.d(objArr.length))) : d0.c(objArr[0]) : d0.e();
    }

    public static final Appendable q0(float[] fArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) throws IOException {
        AbstractC6492s.i(fArr, "<this>");
        AbstractC6492s.i(buffer, "buffer");
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (float f10 : fArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (interfaceC6835l != null) {
                buffer.append((CharSequence) interfaceC6835l.invoke(Float.valueOf(f10)));
            } else {
                buffer.append(String.valueOf(f10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static Iterable q1(final Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        return new O(new InterfaceC6824a() { // from class: Zg.r
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return AbstractC3686s.r1(objArr);
            }
        });
    }

    public static final Appendable r0(int[] iArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) throws IOException {
        AbstractC6492s.i(iArr, "<this>");
        AbstractC6492s.i(buffer, "buffer");
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (int i12 : iArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (interfaceC6835l != null) {
                buffer.append((CharSequence) interfaceC6835l.invoke(Integer.valueOf(i12)));
            } else {
                buffer.append(String.valueOf(i12));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator r1(Object[] objArr) {
        return AbstractC6477c.a(objArr);
    }

    public static final Appendable s0(long[] jArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) throws IOException {
        AbstractC6492s.i(jArr, "<this>");
        AbstractC6492s.i(buffer, "buffer");
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (long j10 : jArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (interfaceC6835l != null) {
                buffer.append((CharSequence) interfaceC6835l.invoke(Long.valueOf(j10)));
            } else {
                buffer.append(String.valueOf(j10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static List s1(Object[] objArr, Iterable other) {
        AbstractC6492s.i(objArr, "<this>");
        AbstractC6492s.i(other, "other");
        int length = objArr.length;
        ArrayList arrayList = new ArrayList(Math.min(AbstractC3689v.w(other, 10), length));
        int i10 = 0;
        for (Object obj : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(Yg.z.a(objArr[i10], obj));
            i10++;
        }
        return arrayList;
    }

    public static final Appendable t0(Object[] objArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) throws IOException {
        AbstractC6492s.i(objArr, "<this>");
        AbstractC6492s.i(buffer, "buffer");
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            kotlin.text.t.a(buffer, obj, interfaceC6835l);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static List t1(Object[] objArr, Object[] other) {
        AbstractC6492s.i(objArr, "<this>");
        AbstractC6492s.i(other, "other");
        int iMin = Math.min(objArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(Yg.z.a(objArr[i10], other[i10]));
        }
        return arrayList;
    }

    public static final Appendable u0(short[] sArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) throws IOException {
        AbstractC6492s.i(sArr, "<this>");
        AbstractC6492s.i(buffer, "buffer");
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (short s10 : sArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (interfaceC6835l != null) {
                buffer.append((CharSequence) interfaceC6835l.invoke(Short.valueOf(s10)));
            } else {
                buffer.append(String.valueOf((int) s10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String w0(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(bArr, "<this>");
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        return ((StringBuilder) o0(bArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC6835l)).toString();
    }

    public static final String x0(double[] dArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(dArr, "<this>");
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        return ((StringBuilder) p0(dArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC6835l)).toString();
    }

    public static final String y0(float[] fArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(fArr, "<this>");
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        return ((StringBuilder) q0(fArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC6835l)).toString();
    }

    public static final String z0(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(iArr, "<this>");
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        return ((StringBuilder) r0(iArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC6835l)).toString();
    }
}

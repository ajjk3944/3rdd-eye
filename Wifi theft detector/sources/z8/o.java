package z8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class o extends m {
    public static Object A(Object[] objArr) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object B(Object[] objArr) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static int C(long[] jArr) {
        kotlin.jvm.internal.p.e(jArr, "<this>");
        return jArr.length - 1;
    }

    public static int D(Object[] objArr) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Object E(Object[] objArr, int i10) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }

    public static final int F(byte[] bArr, byte b10) {
        kotlin.jvm.internal.p.e(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int G(char[] cArr, char c10) {
        kotlin.jvm.internal.p.e(cArr, "<this>");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int H(int[] iArr, int i10) {
        kotlin.jvm.internal.p.e(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static final int I(long[] jArr, long j10) {
        kotlin.jvm.internal.p.e(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static int J(Object[] objArr, Object obj) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
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
            if (kotlin.jvm.internal.p.a(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final int K(short[] sArr, short s10) {
        kotlin.jvm.internal.p.e(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final Appendable L(Object[] objArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, l9.l lVar) throws IOException {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        kotlin.jvm.internal.p.e(buffer, "buffer");
        kotlin.jvm.internal.p.e(separator, "separator");
        kotlin.jvm.internal.p.e(prefix, "prefix");
        kotlin.jvm.internal.p.e(postfix, "postfix");
        kotlin.jvm.internal.p.e(truncated, "truncated");
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
            s9.h.a(buffer, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String M(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, l9.l lVar) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        kotlin.jvm.internal.p.e(separator, "separator");
        kotlin.jvm.internal.p.e(prefix, "prefix");
        kotlin.jvm.internal.p.e(postfix, "postfix");
        kotlin.jvm.internal.p.e(truncated, "truncated");
        return ((StringBuilder) L(objArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
    }

    public static /* synthetic */ String N(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l9.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        l9.l lVar2 = lVar;
        return M(objArr, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public static char O(char[] cArr) {
        kotlin.jvm.internal.p.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object P(Object[] objArr) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static final Collection Q(Object[] objArr, Collection destination) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        kotlin.jvm.internal.p.e(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    public static List R(Object[] objArr) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? S(objArr) : q.e(objArr[0]) : r.j();
    }

    public static List S(Object[] objArr) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        return new ArrayList(r.g(objArr));
    }

    public static final Set T(Object[] objArr) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) Q(objArr, new LinkedHashSet(h0.e(objArr.length))) : i0.c(objArr[0]) : j0.d();
    }

    public static Iterable U(final Object[] objArr) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        return new c0(new l9.a() { // from class: z8.n
            @Override // l9.a
            public final Object invoke() {
                return o.V(objArr);
            }
        });
    }

    public static final Iterator V(Object[] objArr) {
        return kotlin.jvm.internal.b.a(objArr);
    }

    public static boolean s(byte[] bArr, byte b10) {
        kotlin.jvm.internal.p.e(bArr, "<this>");
        return F(bArr, b10) >= 0;
    }

    public static boolean t(char[] cArr, char c10) {
        kotlin.jvm.internal.p.e(cArr, "<this>");
        return G(cArr, c10) >= 0;
    }

    public static boolean u(int[] iArr, int i10) {
        kotlin.jvm.internal.p.e(iArr, "<this>");
        return H(iArr, i10) >= 0;
    }

    public static boolean v(long[] jArr, long j10) {
        kotlin.jvm.internal.p.e(jArr, "<this>");
        return I(jArr, j10) >= 0;
    }

    public static boolean w(Object[] objArr, Object obj) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        return J(objArr, obj) >= 0;
    }

    public static boolean x(short[] sArr, short s10) {
        kotlin.jvm.internal.p.e(sArr, "<this>");
        return K(sArr, s10) >= 0;
    }

    public static List y(Object[] objArr) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        return (List) z(objArr, new ArrayList());
    }

    public static final Collection z(Object[] objArr, Collection destination) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        kotlin.jvm.internal.p.e(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }
}

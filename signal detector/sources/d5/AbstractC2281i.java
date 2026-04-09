package d5;

import a.AbstractC0241a;
import java.util.Arrays;
import java.util.List;

/* renamed from: d5.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2281i extends AbstractC0241a {
    public static List Q(Object[] objArr) {
        q5.i.e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        q5.i.d(listAsList, "asList(...)");
        return listAsList;
    }

    public static void R(int i, int i3, int i6, int[] iArr, int[] iArr2) {
        q5.i.e(iArr, "<this>");
        q5.i.e(iArr2, "destination");
        System.arraycopy(iArr, i3, iArr2, i, i6 - i3);
    }

    public static void S(int i, int i3, int i6, Object[] objArr, Object[] objArr2) {
        q5.i.e(objArr, "<this>");
        q5.i.e(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i, i6 - i3);
    }

    public static /* synthetic */ void T(int i, int i3, int i6, Object[] objArr, Object[] objArr2) {
        if ((i6 & 4) != 0) {
            i = 0;
        }
        S(0, i, i3, objArr, objArr2);
    }

    public static Object[] U(Object[] objArr, int i, int i3) {
        q5.i.e(objArr, "<this>");
        int length = objArr.length;
        if (i3 <= length) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i3);
            q5.i.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + length + ").");
    }

    public static String V(Object[] objArr, D4.d dVar, int i) {
        String str = (i & 1) != 0 ? ", " : ".";
        if ((i & 32) != 0) {
            dVar = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i3 = 0;
        for (Object obj : objArr) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            com.bumptech.glide.c.a(sb, obj, dVar);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static Integer W(int[] iArr) {
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int i3 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i6 = iArr[i3];
                if (i < i6) {
                    i = i6;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return Integer.valueOf(i);
    }

    public static Integer X(int[] iArr) {
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int i3 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i6 = iArr[i3];
                if (i > i6) {
                    i = i6;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return Integer.valueOf(i);
    }
}

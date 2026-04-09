package zj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class m extends ci.b {
    public static List I(Object[] objArr) {
        nk.k.e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        nk.k.d(listAsList, "asList(...)");
        return listAsList;
    }

    public static boolean J(int i4, int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (i4 == iArr[i10]) {
                break;
            }
            i10++;
        }
        return i10 >= 0;
    }

    public static boolean K(Object obj, Object[] objArr) {
        nk.k.e(objArr, "<this>");
        return b0(obj, objArr) >= 0;
    }

    public static boolean L(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                Object obj = objArr[i4];
                Object obj2 = objArr2[i4];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!L((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof yj.o) && (obj2 instanceof yj.o)) {
                            if (!Arrays.equals((byte[]) null, (byte[]) null)) {
                            }
                        } else if ((obj instanceof yj.t) && (obj2 instanceof yj.t)) {
                            if (!Arrays.equals((short[]) null, (short[]) null)) {
                            }
                        } else if ((obj instanceof yj.p) && (obj2 instanceof yj.p)) {
                            if (!Arrays.equals((int[]) null, (int[]) null)) {
                            }
                        } else if ((obj instanceof yj.r) && (obj2 instanceof yj.r)) {
                            if (!Arrays.equals((long[]) null, (long[]) null)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void M(int i4, int i10, int i11, int[] iArr, int[] iArr2) {
        nk.k.e(iArr, "<this>");
        nk.k.e(iArr2, "destination");
        System.arraycopy(iArr, i10, iArr2, i4, i11 - i10);
    }

    public static void N(int i4, int i10, int i11, Object[] objArr, Object[] objArr2) {
        nk.k.e(objArr, "<this>");
        nk.k.e(objArr2, "destination");
        System.arraycopy(objArr, i10, objArr2, i4, i11 - i10);
    }

    public static void O(byte[] bArr, int i4, byte[] bArr2, int i10, int i11) {
        nk.k.e(bArr, "<this>");
        nk.k.e(bArr2, "destination");
        System.arraycopy(bArr, i10, bArr2, i4, i11 - i10);
    }

    public static void P(long[] jArr, long[] jArr2, int i4, int i10, int i11) {
        nk.k.e(jArr, "<this>");
        nk.k.e(jArr2, "destination");
        System.arraycopy(jArr, i10, jArr2, i4, i11 - i10);
    }

    public static /* synthetic */ void Q(int i4, int i10, int i11, int[] iArr, int[] iArr2) {
        if ((i11 & 2) != 0) {
            i4 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = iArr.length;
        }
        M(i4, 0, i10, iArr, iArr2);
    }

    public static /* synthetic */ void R(int i4, int i10, int i11, Object[] objArr, Object[] objArr2) {
        if ((i11 & 4) != 0) {
            i4 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = objArr.length;
        }
        N(0, i4, i10, objArr, objArr2);
    }

    public static byte[] S(int i4, int i10, byte[] bArr) {
        nk.k.e(bArr, "<this>");
        ci.b.g(i10, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i10);
        nk.k.d(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] T(Object[] objArr, int i4, int i10) {
        nk.k.e(objArr, "<this>");
        ci.b.g(i10, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i4, i10);
        nk.k.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void U(int i4, int i10, Object obj, Object[] objArr) {
        nk.k.e(objArr, "<this>");
        Arrays.fill(objArr, i4, i10, obj);
    }

    public static void V(int i4, int[] iArr) {
        int length = iArr.length;
        nk.k.e(iArr, "<this>");
        Arrays.fill(iArr, 0, length, i4);
    }

    public static void W(long[] jArr, long j) {
        int length = jArr.length;
        nk.k.e(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j);
    }

    public static ArrayList Y(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int Z(long[] jArr) {
        nk.k.e(jArr, "<this>");
        return jArr.length - 1;
    }

    public static Object a0(Object[] objArr, int i4) {
        nk.k.e(objArr, "<this>");
        if (i4 < 0 || i4 >= objArr.length) {
            return null;
        }
        return objArr[i4];
    }

    public static int b0(Object obj, Object[] objArr) {
        nk.k.e(objArr, "<this>");
        int i4 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i4 < length) {
                if (objArr[i4] == null) {
                    return i4;
                }
                i4++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i4 < length2) {
            if (obj.equals(objArr[i4])) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static String c0(Object[] objArr, String str, sl.b bVar, int i4) {
        if ((i4 & 1) != 0) {
            str = ", ";
        }
        String str2 = (i4 & 2) != 0 ? "" : "innermostOf(";
        String str3 = (i4 & 4) == 0 ? ")" : "";
        if ((i4 & 32) != 0) {
            bVar = null;
        }
        nk.k.e(objArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int i10 = 0;
        for (Object obj : objArr) {
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) str);
            }
            com.bumptech.glide.e.l(sb2, obj, bVar);
        }
        sb2.append((CharSequence) str3);
        return sb2.toString();
    }

    public static void d0(Object[] objArr, Comparator comparator, int i4, int i10) {
        nk.k.e(objArr, "<this>");
        nk.k.e(comparator, "comparator");
        Arrays.sort(objArr, i4, i10, comparator);
    }

    public static List e0(Object[] objArr) {
        nk.k.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new k(objArr, false)) : cm.g.s(objArr[0]) : s.f38317a;
    }
}

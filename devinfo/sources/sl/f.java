package sl;

import ec.y;
import hm.n;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import nk.k;
import vk.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f33832a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final n f33833b;

    static {
        hm.h hVar = hm.h.f25175d;
        f33833b = wb.e.I(y.e("efbbbf"), y.e("feff"), y.e("fffe0000"), y.e("fffe"), y.e("0000feff"));
    }

    public static final void a(long j, long j8, long j9) {
        if ((j8 | j9) < 0 || j8 > j || j - j8 < j9) {
            StringBuilder sbY = d.h.y(j, "length=", ", offset=");
            sbY.append(j8);
            sbY.append(", count=");
            sbY.append(j8);
            throw new ArrayIndexOutOfBoundsException(sbY.toString());
        }
    }

    public static final void b(Closeable closeable) throws IOException {
        k.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final int c(String str, char c9, int i4, int i10) {
        k.e(str, "<this>");
        while (i4 < i10) {
            if (str.charAt(i4) == c9) {
                return i4;
            }
            i4++;
        }
        return i10;
    }

    public static final int d(String str, String str2, int i4, int i10) {
        k.e(str, "<this>");
        while (i4 < i10) {
            if (i.z0(str2, str.charAt(i4))) {
                return i4;
            }
            i4++;
        }
        return i10;
    }

    public static final boolean e(String[] strArr, String[] strArr2, Comparator comparator) {
        k.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int f(String str) {
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = str.charAt(i4);
            if (k.f(cCharAt, 31) <= 0 || k.f(cCharAt, 127) >= 0) {
                return i4;
            }
        }
        return -1;
    }

    public static final int g(String str, int i4, int i10) {
        k.e(str, "<this>");
        while (i4 < i10) {
            char cCharAt = str.charAt(i4);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i4;
            }
            i4++;
        }
        return i10;
    }

    public static final int h(String str, int i4, int i10) {
        k.e(str, "<this>");
        int i11 = i10 - 1;
        if (i4 <= i11) {
            while (true) {
                char cCharAt = str.charAt(i11);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i11 + 1;
                }
                if (i11 == i4) {
                    break;
                }
                i11--;
            }
        }
        return i4;
    }

    public static final String[] i(String[] strArr, String[] strArr2, Comparator comparator) {
        k.e(strArr, "<this>");
        k.e(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i4]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i4++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean j(String str) {
        k.e(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int k(char c9) {
        if ('0' <= c9 && c9 < ':') {
            return c9 - '0';
        }
        if ('a' <= c9 && c9 < 'g') {
            return c9 - 'W';
        }
        if ('A' > c9 || c9 >= 'G') {
            return -1;
        }
        return c9 - '7';
    }

    public static final int l(hm.g gVar) {
        k.e(gVar, "<this>");
        return (gVar.readByte() & 255) | ((gVar.readByte() & 255) << 16) | ((gVar.readByte() & 255) << 8);
    }

    public static final int m(String str, int i4) throws NumberFormatException {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i4;
    }

    public static final String n(String str, int i4, int i10) {
        int iG = g(str, i4, i10);
        String strSubstring = str.substring(iG, h(str, iG, i10));
        k.d(strSubstring, "substring(...)");
        return strSubstring;
    }
}

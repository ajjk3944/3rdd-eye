package B5;

import java.util.TimeZone;

/* compiled from: ISO8601Utils.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f510a = TimeZone.getTimeZone("UTC");

    public static boolean a(char c10, String str, int i) {
        return i < str.length() && str.charAt(i) == c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f6 A[Catch: IllegalArgumentException -> 0x00d5, NumberFormatException -> 0x00d8, IndexOutOfBoundsException -> 0x00db, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x00d5, IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:37:0x009e, B:39:0x00a4, B:44:0x00b1, B:46:0x00bb, B:63:0x00f0, B:65:0x00f6, B:91:0x01a8, B:73:0x0108, B:74:0x0123, B:75:0x0124, B:79:0x0141, B:81:0x014e, B:84:0x0157, B:86:0x0176, B:89:0x0185, B:90:0x01a7, B:78:0x0130, B:93:0x01d9, B:94:0x01e0, B:50:0x00cb, B:51:0x00ce, B:45:0x00b6), top: B:105:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d9 A[Catch: IllegalArgumentException -> 0x00d5, NumberFormatException -> 0x00d8, IndexOutOfBoundsException -> 0x00db, TryCatch #2 {IllegalArgumentException -> 0x00d5, IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:37:0x009e, B:39:0x00a4, B:44:0x00b1, B:46:0x00bb, B:63:0x00f0, B:65:0x00f6, B:91:0x01a8, B:73:0x0108, B:74:0x0123, B:75:0x0124, B:79:0x0141, B:81:0x014e, B:84:0x0157, B:86:0x0176, B:89:0x0185, B:90:0x01a7, B:78:0x0130, B:93:0x01d9, B:94:0x01e0, B:50:0x00cb, B:51:0x00ce, B:45:0x00b6), top: B:105:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date b(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B5.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(int i, int i10, String str) throws NumberFormatException {
        int i11;
        int i12;
        if (i < 0 || i10 > str.length() || i > i10) {
            throw new NumberFormatException(str);
        }
        if (i < i10) {
            i12 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i10));
            }
            i11 = -iDigit;
        } else {
            i11 = 0;
            i12 = i;
        }
        while (i12 < i10) {
            int i13 = i12 + 1;
            int iDigit2 = Character.digit(str.charAt(i12), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i10));
            }
            i11 = (i11 * 10) - iDigit2;
            i12 = i13;
        }
        return -i11;
    }
}

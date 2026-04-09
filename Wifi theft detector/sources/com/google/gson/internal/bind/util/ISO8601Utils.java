package com.google.gson.internal.bind.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private static boolean checkOffset(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    private static int indexOfNonDigit(String str, int i10) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '0' || cCharAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i10, int i11) {
        String string = Integer.toString(i10);
        for (int length = i11 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0 A[Catch: IllegalArgumentException -> 0x004c, NumberFormatException -> 0x004f, IndexOutOfBoundsException -> 0x0052, TryCatch #2 {IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c, blocks: (B:3:0x0006, B:5:0x0019, B:6:0x001b, B:8:0x0027, B:9:0x0029, B:11:0x0038, B:13:0x003e, B:23:0x005c, B:25:0x006c, B:26:0x006e, B:28:0x007a, B:29:0x007d, B:31:0x0083, B:35:0x008d, B:40:0x009d, B:42:0x00a5, B:53:0x00da, B:55:0x00e0, B:57:0x00e6, B:81:0x0192, B:61:0x00f0, B:62:0x0109, B:63:0x010a, B:67:0x0127, B:69:0x0134, B:72:0x013d, B:74:0x015c, B:77:0x016b, B:78:0x018d, B:80:0x0190, B:66:0x0116, B:83:0x01c4, B:84:0x01cb, B:46:0x00bd, B:47:0x00c0), top: B:95:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c4 A[Catch: IllegalArgumentException -> 0x004c, NumberFormatException -> 0x004f, IndexOutOfBoundsException -> 0x0052, TryCatch #2 {IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c, blocks: (B:3:0x0006, B:5:0x0019, B:6:0x001b, B:8:0x0027, B:9:0x0029, B:11:0x0038, B:13:0x003e, B:23:0x005c, B:25:0x006c, B:26:0x006e, B:28:0x007a, B:29:0x007d, B:31:0x0083, B:35:0x008d, B:40:0x009d, B:42:0x00a5, B:53:0x00da, B:55:0x00e0, B:57:0x00e6, B:81:0x0192, B:61:0x00f0, B:62:0x0109, B:63:0x010a, B:67:0x0127, B:69:0x0134, B:72:0x013d, B:74:0x015c, B:77:0x016b, B:78:0x018d, B:80:0x0190, B:66:0x0116, B:83:0x01c4, B:84:0x01cb, B:46:0x00bd, B:47:0x00c0), top: B:95:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date parse(java.lang.String r18, java.text.ParsePosition r19) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int parseInt(String str, int i10, int i11) throws NumberFormatException {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -iDigit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int iDigit2 = Character.digit(str.charAt(i13), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - iDigit2;
            i13 = i14;
        }
        return -i12;
    }

    public static String format(Date date, boolean z10) {
        return format(date, z10, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z10, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z10 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        if (z10) {
            sb.append('.');
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i10 = offset / 60000;
            int iAbs = Math.abs(i10 / 60);
            int iAbs2 = Math.abs(i10 % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, iAbs, 2);
            sb.append(':');
            padInt(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }
}

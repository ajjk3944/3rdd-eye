package d7;

import java.util.Locale;
import kotlin.jvm.internal.l;
import y9.q;

/* compiled from: Color.kt */
/* renamed from: d7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4278a {

    /* renamed from: a, reason: collision with root package name */
    public final int f37526a;

    /* compiled from: Color.kt */
    /* renamed from: d7.a$a, reason: collision with other inner class name */
    public static final class C0440a {
        public static int a(String colorString) throws IllegalArgumentException {
            String str;
            l.f(colorString, "colorString");
            if (colorString.length() <= 0) {
                throw new IllegalArgumentException("Expected color string, actual string is empty");
            }
            if (colorString.charAt(0) != '#') {
                throw new IllegalArgumentException("Unknown color ".concat(colorString).toString());
            }
            int length = colorString.length();
            if (length == 4) {
                char cCharAt = colorString.charAt(1);
                char cCharAt2 = colorString.charAt(2);
                char cCharAt3 = colorString.charAt(3);
                str = new String(new char[]{'f', 'f', cCharAt, cCharAt, cCharAt2, cCharAt2, cCharAt3, cCharAt3});
            } else if (length == 5) {
                char cCharAt4 = colorString.charAt(1);
                char cCharAt5 = colorString.charAt(2);
                char cCharAt6 = colorString.charAt(3);
                char cCharAt7 = colorString.charAt(4);
                str = new String(new char[]{cCharAt4, cCharAt4, cCharAt5, cCharAt5, cCharAt6, cCharAt6, cCharAt7, cCharAt7});
            } else if (length == 7) {
                String strSubstring = colorString.substring(1);
                l.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                str = "ff".concat(strSubstring);
            } else {
                if (length != 9) {
                    throw new IllegalArgumentException("Unknown color ".concat(colorString));
                }
                str = colorString.substring(1);
                l.e(str, "this as java.lang.String).substring(startIndex)");
            }
            com.google.gson.internal.c.e(16);
            return (int) Long.parseLong(str, 16);
        }
    }

    public /* synthetic */ C4278a(int i) {
        this.f37526a = i;
    }

    public static String a(int i) {
        String hexString = Integer.toHexString(i);
        l.e(hexString, "toHexString(value)");
        String upperCase = q.l0(8, hexString).toUpperCase(Locale.ROOT);
        l.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return "#".concat(upperCase);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4278a) {
            return this.f37526a == ((C4278a) obj).f37526a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37526a;
    }

    public final String toString() {
        return a(this.f37526a);
    }
}

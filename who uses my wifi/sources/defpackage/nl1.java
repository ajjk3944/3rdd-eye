package defpackage;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nl1 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final kz2 a = new kz2();
    public final StringBuilder b = new StringBuilder();

    public static void a(kz2 kz2Var) {
        while (true) {
            for (boolean z = true; kz2Var.B() > 0 && z; z = false) {
                int i = kz2Var.b;
                byte[] bArr = kz2Var.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    kz2Var.G(1);
                } else {
                    int i2 = kz2Var.c;
                    if (i + 2 <= i2) {
                        int i3 = i + 1;
                        if (b == 47) {
                            int i4 = i + 2;
                            if (bArr[i3] == 42) {
                                while (true) {
                                    int i5 = i4 + 1;
                                    if (i5 >= i2) {
                                        break;
                                    }
                                    if (((char) bArr[i4]) == '*' && ((char) bArr[i5]) == '/') {
                                        i2 = i4 + 2;
                                        i4 = i2;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                kz2Var.G(i2 - kz2Var.b);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    public static String b(kz2 kz2Var, StringBuilder sb) {
        a(kz2Var);
        if (kz2Var.B() == 0) {
            return null;
        }
        String strC = c(kz2Var, sb);
        if (!strC.isEmpty()) {
            return strC;
        }
        char cK = (char) kz2Var.K();
        StringBuilder sb2 = new StringBuilder(String.valueOf(cK).length());
        sb2.append(cK);
        return sb2.toString();
    }

    public static String c(kz2 kz2Var, StringBuilder sb) {
        boolean z;
        char c2;
        sb.setLength(0);
        int i = kz2Var.b;
        int i2 = kz2Var.c;
        loop0: while (true) {
            for (false; i < i2 && !z; true) {
                c2 = (char) kz2Var.a[i];
                z = (c2 < 'A' || c2 > 'Z') && (c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_');
            }
            sb.append(c2);
            i++;
        }
        kz2Var.G(i - kz2Var.b);
        return sb.toString();
    }
}

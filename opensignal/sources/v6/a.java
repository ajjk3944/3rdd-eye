package v6;

import a5.v;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f23860c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f23861d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final v f23862a = new v();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f23863b = new StringBuilder();

    public static String a(v vVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i10 = vVar.f166b;
        int i11 = vVar.f167c;
        while (i10 < i11 && !z10) {
            char c4 = (char) vVar.f165a[i10];
            if ((c4 < 'A' || c4 > 'Z') && ((c4 < 'a' || c4 > 'z') && !((c4 >= '0' && c4 <= '9') || c4 == '#' || c4 == '-' || c4 == '.' || c4 == '_'))) {
                z10 = true;
            } else {
                i10++;
                sb2.append(c4);
            }
        }
        vVar.F(i10 - vVar.f166b);
        return sb2.toString();
    }

    public static String b(v vVar, StringBuilder sb2) {
        c(vVar);
        if (vVar.a() == 0) {
            return null;
        }
        String strA = a(vVar, sb2);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) vVar.t());
    }

    public static void c(v vVar) {
        while (true) {
            for (boolean z10 = true; vVar.a() > 0 && z10; z10 = false) {
                int i10 = vVar.f166b;
                byte[] bArr = vVar.f165a;
                byte b2 = bArr[i10];
                char c4 = (char) b2;
                if (c4 == '\t' || c4 == '\n' || c4 == '\f' || c4 == '\r' || c4 == ' ') {
                    vVar.F(1);
                } else {
                    int i11 = vVar.f167c;
                    int i12 = i10 + 2;
                    if (i12 <= i11) {
                        int i13 = i10 + 1;
                        if (b2 == 47 && bArr[i13] == 42) {
                            while (true) {
                                int i14 = i12 + 1;
                                if (i14 >= i11) {
                                    break;
                                }
                                if (((char) bArr[i12]) == '*' && ((char) bArr[i14]) == '/') {
                                    i12 += 2;
                                    i11 = i12;
                                } else {
                                    i12 = i14;
                                }
                            }
                            vVar.F(i11 - vVar.f166b);
                        }
                    }
                }
            }
            return;
        }
    }
}

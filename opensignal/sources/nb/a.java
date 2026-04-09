package nb;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f17442c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f17443d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final fb.f f17444a = new fb.f();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f17445b = new StringBuilder();

    public static String a(fb.f fVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i10 = fVar.f8801b;
        int i11 = fVar.f8802c;
        while (i10 < i11 && !z10) {
            char c4 = (char) fVar.f8800a[i10];
            if ((c4 < 'A' || c4 > 'Z') && ((c4 < 'a' || c4 > 'z') && !((c4 >= '0' && c4 <= '9') || c4 == '#' || c4 == '-' || c4 == '.' || c4 == '_'))) {
                z10 = true;
            } else {
                i10++;
                sb2.append(c4);
            }
        }
        fVar.z(i10 - fVar.f8801b);
        return sb2.toString();
    }

    public static String b(fb.f fVar, StringBuilder sb2) {
        c(fVar);
        if (fVar.a() == 0) {
            return null;
        }
        String strA = a(fVar, sb2);
        if (!"".equals(strA)) {
            return strA;
        }
        char cO = (char) fVar.o();
        StringBuilder sb3 = new StringBuilder(1);
        sb3.append(cO);
        return sb3.toString();
    }

    public static void c(fb.f fVar) {
        while (true) {
            for (boolean z10 = true; fVar.a() > 0 && z10; z10 = false) {
                int i10 = fVar.f8801b;
                byte[] bArr = fVar.f8800a;
                byte b2 = bArr[i10];
                char c4 = (char) b2;
                if (c4 == '\t' || c4 == '\n' || c4 == '\f' || c4 == '\r' || c4 == ' ') {
                    fVar.z(1);
                } else {
                    int i11 = fVar.f8802c;
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
                            fVar.z(i11 - fVar.f8801b);
                        }
                    }
                }
            }
            return;
        }
    }
}

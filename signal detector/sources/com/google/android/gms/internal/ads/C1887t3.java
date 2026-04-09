package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.t3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1887t3 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f16844c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f16845d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final C2036vr f16846a = new C2036vr();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f16847b = new StringBuilder();

    public static void a(C2036vr c2036vr) {
        while (true) {
            for (boolean z6 = true; c2036vr.B() > 0 && z6; z6 = false) {
                int i = c2036vr.f17355b;
                byte[] bArr = c2036vr.f17354a;
                byte b5 = bArr[i];
                char c6 = (char) b5;
                if (c6 == '\t' || c6 == '\n' || c6 == '\f' || c6 == '\r' || c6 == ' ') {
                    c2036vr.G(1);
                } else {
                    int i3 = c2036vr.f17356c;
                    if (i + 2 <= i3) {
                        int i6 = i + 1;
                        if (b5 == 47) {
                            int i7 = i + 2;
                            if (bArr[i6] == 42) {
                                while (true) {
                                    int i8 = i7 + 1;
                                    if (i8 >= i3) {
                                        break;
                                    }
                                    if (((char) bArr[i7]) == '*' && ((char) bArr[i8]) == '/') {
                                        i3 = i7 + 2;
                                        i7 = i3;
                                    } else {
                                        i7 = i8;
                                    }
                                }
                                c2036vr.G(i3 - c2036vr.f17355b);
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

    public static String b(C2036vr c2036vr, StringBuilder sb) {
        a(c2036vr);
        if (c2036vr.B() == 0) {
            return null;
        }
        String strC = c(c2036vr, sb);
        if (!strC.isEmpty()) {
            return strC;
        }
        char cK = (char) c2036vr.K();
        StringBuilder sb2 = new StringBuilder(String.valueOf(cK).length());
        sb2.append(cK);
        return sb2.toString();
    }

    public static String c(C2036vr c2036vr, StringBuilder sb) {
        boolean z6;
        char c6;
        sb.setLength(0);
        int i = c2036vr.f17355b;
        int i3 = c2036vr.f17356c;
        loop0: while (true) {
            for (false; i < i3 && !z6; true) {
                c6 = (char) c2036vr.f17354a[i];
                z6 = (c6 < 'A' || c6 > 'Z') && (c6 < 'a' || c6 > 'z') && !((c6 >= '0' && c6 <= '9') || c6 == '#' || c6 == '-' || c6 == '.' || c6 == '_');
            }
            sb.append(c6);
            i++;
        }
        c2036vr.G(i - c2036vr.f17355b);
        return sb.toString();
    }
}

package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u7 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f17104c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f17105d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final sk0 f17106a = new sk0();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f17107b = new StringBuilder();

    public static void a(sk0 sk0Var) {
        while (true) {
            for (boolean z3 = true; sk0Var.B() > 0 && z3; z3 = false) {
                int i4 = sk0Var.f16447b;
                byte[] bArr = sk0Var.f16446a;
                byte b10 = bArr[i4];
                char c9 = (char) b10;
                if (c9 == '\t' || c9 == '\n' || c9 == '\f' || c9 == '\r' || c9 == ' ') {
                    sk0Var.G(1);
                } else {
                    int i10 = sk0Var.f16448c;
                    if (i4 + 2 <= i10) {
                        int i11 = i4 + 1;
                        if (b10 == 47) {
                            int i12 = i4 + 2;
                            if (bArr[i11] == 42) {
                                while (true) {
                                    int i13 = i12 + 1;
                                    if (i13 >= i10) {
                                        break;
                                    }
                                    if (((char) bArr[i12]) == '*' && ((char) bArr[i13]) == '/') {
                                        i10 = i12 + 2;
                                        i12 = i10;
                                    } else {
                                        i12 = i13;
                                    }
                                }
                                sk0Var.G(i10 - sk0Var.f16447b);
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

    public static String b(sk0 sk0Var, StringBuilder sb2) {
        a(sk0Var);
        if (sk0Var.B() == 0) {
            return null;
        }
        String strC = c(sk0Var, sb2);
        if (!strC.isEmpty()) {
            return strC;
        }
        char cK = (char) sk0Var.K();
        StringBuilder sb3 = new StringBuilder(String.valueOf(cK).length());
        sb3.append(cK);
        return sb3.toString();
    }

    public static String c(sk0 sk0Var, StringBuilder sb2) {
        boolean z3;
        char c9;
        sb2.setLength(0);
        int i4 = sk0Var.f16447b;
        int i10 = sk0Var.f16448c;
        loop0: while (true) {
            for (false; i4 < i10 && !z3; true) {
                c9 = (char) sk0Var.f16446a[i4];
                z3 = (c9 < 'A' || c9 > 'Z') && (c9 < 'a' || c9 > 'z') && !((c9 >= '0' && c9 <= '9') || c9 == '#' || c9 == '-' || c9 == '.' || c9 == '_');
            }
            sb2.append(c9);
            i4++;
        }
        sk0Var.G(i4 - sk0Var.f16447b);
        return sb2.toString();
    }
}

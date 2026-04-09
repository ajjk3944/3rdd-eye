package com.yandex.mobile.ads.impl;

import c9.C2092m;
import g0.C4356c;
import ia.C4468d;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class rh0 {

    /* renamed from: j, reason: collision with root package name */
    private static final char[] f32642j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    private final String f32643a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32644b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32645c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32646d;

    /* renamed from: e, reason: collision with root package name */
    private final int f32647e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f32648f;

    /* renamed from: g, reason: collision with root package name */
    private final String f32649g;

    /* renamed from: h, reason: collision with root package name */
    private final String f32650h;
    private final boolean i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f32651a;

        /* renamed from: d, reason: collision with root package name */
        private String f32654d;

        /* renamed from: f, reason: collision with root package name */
        private final ArrayList f32656f;

        /* renamed from: g, reason: collision with root package name */
        private ArrayList f32657g;

        /* renamed from: h, reason: collision with root package name */
        private String f32658h;

        /* renamed from: b, reason: collision with root package name */
        private String f32652b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f32653c = "";

        /* renamed from: e, reason: collision with root package name */
        private int f32655e = -1;

        /* renamed from: com.yandex.mobile.ads.impl.rh0$a$a, reason: collision with other inner class name */
        public static final class C0417a {
            private C0417a() {
            }

            public static final int a(String str, int i, int i10) throws NumberFormatException {
                try {
                    int i11 = Integer.parseInt(b.a(str, i, i10, "", false, false, false, false, 248));
                    if (1 > i11 || i11 >= 65536) {
                        return -1;
                    }
                    return i11;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public static final int b(String str, int i, int i10) {
                while (i < i10) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == '[') {
                        do {
                            i++;
                            if (i < i10) {
                            }
                        } while (str.charAt(i) != ']');
                    } else if (cCharAt == ':') {
                        return i;
                    }
                    i++;
                }
                return i10;
            }

            public static final int c(String str, int i, int i10) {
                if (i10 - i < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i);
                if ((kotlin.jvm.internal.l.h(cCharAt, 97) < 0 || kotlin.jvm.internal.l.h(cCharAt, 122) > 0) && (kotlin.jvm.internal.l.h(cCharAt, 65) < 0 || kotlin.jvm.internal.l.h(cCharAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i++;
                    if (i >= i10) {
                        return -1;
                    }
                    char cCharAt2 = str.charAt(i);
                    if ('a' > cCharAt2 || cCharAt2 >= '{') {
                        if ('A' > cCharAt2 || cCharAt2 >= '[') {
                            if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            public static final int d(String str, int i, int i10) {
                int i11 = 0;
                while (i < i10) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i11++;
                    i++;
                }
                return i11;
            }

            public /* synthetic */ C0417a(int i) {
                this();
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f32656f = arrayList;
            arrayList.add("");
        }

        public final rh0 a() {
            ArrayList arrayList;
            String str = this.f32651a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strA = b.a(this.f32652b, 0, 0, false, 7);
            String strA2 = b.a(this.f32653c, 0, 0, false, 7);
            String str2 = this.f32654d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int i = this.f32655e;
            if (i == -1) {
                String str3 = this.f32651a;
                kotlin.jvm.internal.l.c(str3);
                i = str3.equals("http") ? 80 : str3.equals("https") ? 443 : -1;
            }
            ArrayList arrayList2 = this.f32656f;
            int i10 = i;
            ArrayList arrayList3 = new ArrayList(C2092m.T(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(b.a((String) it.next(), 0, 0, false, 7));
            }
            ArrayList<String> arrayList4 = this.f32657g;
            if (arrayList4 != null) {
                ArrayList arrayList5 = new ArrayList(C2092m.T(arrayList4, 10));
                for (String str4 : arrayList4) {
                    arrayList5.add(str4 != null ? b.a(str4, 0, 0, true, 3) : null);
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            String str5 = this.f32658h;
            return new rh0(str, strA, strA2, str2, i10, arrayList3, arrayList, str5 != null ? b.a(str5, 0, 0, false, 7) : null, toString());
        }

        public final ArrayList b() {
            return this.f32656f;
        }

        public final a c() {
            this.f32653c = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            return this;
        }

        public final a d() {
            String strReplaceAll;
            String str = this.f32654d;
            if (str != null) {
                Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
                kotlin.jvm.internal.l.e(patternCompile, "compile(...)");
                strReplaceAll = patternCompile.matcher(str).replaceAll("");
                kotlin.jvm.internal.l.e(strReplaceAll, "replaceAll(...)");
            } else {
                strReplaceAll = null;
            }
            this.f32654d = strReplaceAll;
            int size = this.f32656f.size();
            for (int i = 0; i < size; i++) {
                ArrayList arrayList = this.f32656f;
                arrayList.set(i, b.a((String) arrayList.get(i), 0, 0, "[]", true, true, false, false, 227));
            }
            ArrayList arrayList2 = this.f32657g;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    String str2 = (String) arrayList2.get(i10);
                    arrayList2.set(i10, str2 != null ? b.a(str2, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
                }
            }
            String str3 = this.f32658h;
            this.f32658h = str3 != null ? b.a(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
            return this;
        }

        public final void e(String str) {
            kotlin.jvm.internal.l.f(str, "<set-?>");
            this.f32653c = str;
        }

        public final void f(String str) {
            kotlin.jvm.internal.l.f(str, "<set-?>");
            this.f32652b = str;
        }

        public final void g(String str) {
            this.f32654d = str;
        }

        public final void h(String str) {
            this.f32651a = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 303
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rh0.a.toString():java.lang.String");
        }

        public final a b(String host) {
            kotlin.jvm.internal.l.f(host, "host");
            String strA = uf0.a(b.a(host, 0, 0, false, 7));
            if (strA == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(host));
            }
            this.f32654d = strA;
            return this;
        }

        public final a c(String scheme) {
            kotlin.jvm.internal.l.f(scheme, "scheme");
            if (scheme.equalsIgnoreCase("http")) {
                this.f32651a = "http";
                return this;
            }
            if (!scheme.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(scheme));
            }
            this.f32651a = "https";
            return this;
        }

        public final a e() {
            this.f32652b = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            return this;
        }

        public final void b(int i) {
            this.f32655e = i;
        }

        public final void d(String str) {
            this.f32658h = str;
        }

        public final void a(String str) {
            String strA;
            this.f32657g = (str == null || (strA = b.a(str, 0, 0, " \"'<>#", true, false, true, false, 211)) == null) ? null : b.b(strA);
        }

        public final a a(rh0 rh0Var, String str) throws NumberFormatException, EOFException {
            int iA;
            boolean z10;
            boolean z11;
            char c10;
            String input = str;
            kotlin.jvm.internal.l.f(input, "input");
            int iA2 = t82.a(0, input.length(), input);
            int iB = t82.b(iA2, input.length(), input);
            int iC = C0417a.c(input, iA2, iB);
            boolean z12 = true;
            if (iC != -1) {
                if (y9.n.Z(iA2, input, "https:", true)) {
                    this.f32651a = "https";
                    iA2 += 6;
                } else if (y9.n.Z(iA2, input, "http:", true)) {
                    this.f32651a = "http";
                    iA2 += 5;
                } else {
                    String strSubstring = input.substring(0, iC);
                    kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + strSubstring + "'");
                }
            } else if (rh0Var != null) {
                this.f32651a = rh0Var.k();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int iD = C0417a.d(input, iA2, iB);
            char c11 = '?';
            char c12 = '\\';
            char c13 = '/';
            char c14 = '#';
            if (iD < 2 && rh0Var != null && kotlin.jvm.internal.l.b(rh0Var.k(), this.f32651a)) {
                this.f32652b = rh0Var.f();
                this.f32653c = rh0Var.b();
                this.f32654d = rh0Var.g();
                this.f32655e = rh0Var.i();
                this.f32656f.clear();
                this.f32656f.addAll(rh0Var.d());
                if (iA2 == iB || input.charAt(iA2) == '#') {
                    a(rh0Var.e());
                }
                z10 = true;
            } else {
                int i = iA2 + iD;
                boolean z13 = false;
                boolean z14 = false;
                while (true) {
                    iA = t82.a(i, iB, input, "@/\\?#");
                    char cCharAt = iA != iB ? input.charAt(iA) : (char) 65535;
                    if (cCharAt == 65535 || cCharAt == c14 || cCharAt == c13 || cCharAt == c12 || cCharAt == c11) {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (!z13) {
                            int iA3 = t82.a(input, ':', i, iA);
                            z11 = z12;
                            String strA = b.a(input, i, iA3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            if (z14) {
                                strA = B4.g.o(this.f32652b, "%40", strA);
                            }
                            this.f32652b = strA;
                            if (iA3 != iA) {
                                iA = iA;
                                this.f32653c = b.a(str, iA3 + 1, iA, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                                z13 = z11;
                            } else {
                                iA = iA;
                            }
                            input = str;
                            z14 = z11;
                        } else {
                            z11 = z12;
                            input = str;
                            this.f32653c = B4.g.o(this.f32653c, "%40", b.a(input, i, iA, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240));
                        }
                        i = iA + 1;
                        z12 = z11;
                        c12 = '\\';
                        c13 = '/';
                        c14 = '#';
                        c11 = '?';
                    }
                }
                z10 = z12;
                int iB2 = C0417a.b(input, i, iA);
                int i10 = iB2 + 1;
                if (i10 < iA) {
                    this.f32654d = uf0.a(b.a(input, i, iB2, false, 4));
                    int iA4 = C0417a.a(input, i10, iA);
                    this.f32655e = iA4;
                    if (iA4 == -1) {
                        String strSubstring2 = input.substring(i10, iA);
                        kotlin.jvm.internal.l.e(strSubstring2, "substring(...)");
                        throw new IllegalArgumentException(("Invalid URL port: \"" + strSubstring2 + "\"").toString());
                    }
                } else {
                    this.f32654d = uf0.a(b.a(input, i, iB2, false, 4));
                    String str2 = this.f32651a;
                    kotlin.jvm.internal.l.c(str2);
                    this.f32655e = b.a(str2);
                }
                if (this.f32654d == null) {
                    String strSubstring3 = input.substring(i, iB2);
                    kotlin.jvm.internal.l.e(strSubstring3, "substring(...)");
                    throw new IllegalArgumentException(("Invalid URL host: \"" + strSubstring3 + "\"").toString());
                }
                iA2 = iA;
            }
            int iA5 = t82.a(iA2, iB, input, "?#");
            if (iA2 != iA5) {
                char cCharAt2 = input.charAt(iA2);
                if (cCharAt2 != '/' && cCharAt2 != '\\') {
                    this.f32656f.set(r3.size() - 1, "");
                } else {
                    this.f32656f.clear();
                    this.f32656f.add("");
                    iA2++;
                }
                while (iA2 < iA5) {
                    int iA6 = t82.a(iA2, iA5, input, "/\\");
                    boolean z15 = iA6 < iA5 ? z10 : false;
                    String strA2 = b.a(input, iA2, iA6, " \"<>^`{}|/\\?#", true, false, false, false, 240);
                    if (!kotlin.jvm.internal.l.b(strA2, ".")) {
                        boolean z16 = z10;
                        if (!y9.n.U(strA2, "%2e", z16)) {
                            if (!kotlin.jvm.internal.l.b(strA2, "..") && !y9.n.U(strA2, "%2e.", z16) && !y9.n.U(strA2, ".%2e", z16) && !y9.n.U(strA2, "%2e%2e", z16)) {
                                ArrayList arrayList = this.f32656f;
                                if (((CharSequence) arrayList.get(arrayList.size() - (z16 ? 1 : 0))).length() == 0) {
                                    ArrayList arrayList2 = this.f32656f;
                                    arrayList2.set(arrayList2.size() - (z16 ? 1 : 0), strA2);
                                } else {
                                    this.f32656f.add(strA2);
                                }
                                if (z15) {
                                    this.f32656f.add("");
                                }
                            } else {
                                if (((String) this.f32656f.remove(r2.size() - 1)).length() == 0 && !this.f32656f.isEmpty()) {
                                    this.f32656f.set(r2.size() - 1, "");
                                } else {
                                    this.f32656f.add("");
                                }
                            }
                        }
                    }
                    iA2 = z15 ? iA6 + 1 : iA6;
                    z10 = true;
                }
            }
            if (iA5 >= iB || input.charAt(iA5) != '?') {
                c10 = '#';
            } else {
                c10 = '#';
                int iA7 = t82.a(input, '#', iA5, iB);
                this.f32657g = b.b(b.a(input, iA5 + 1, iA7, " \"'<>#", true, false, true, false, 208));
                iA5 = iA7;
            }
            if (iA5 < iB && input.charAt(iA5) == c10) {
                this.f32658h = b.a(input, iA5 + 1, iB, "", true, false, false, true, 176);
            }
            return this;
        }

        public final a a(int i) {
            if (1 <= i && i < 65536) {
                this.f32655e = i;
                return this;
            }
            throw new IllegalArgumentException(C4356c.h(i, "unexpected port: ").toString());
        }
    }

    public static final class b {
        private b() {
        }

        public static String a(String str, int i, int i10, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, int i11) throws EOFException {
            int i12;
            int i13;
            int i14 = (i11 & 1) != 0 ? 0 : i;
            int length = (i11 & 2) != 0 ? str.length() : i10;
            boolean z14 = (i11 & 8) != 0 ? false : z10;
            boolean z15 = (i11 & 16) != 0 ? false : z11;
            boolean z16 = (i11 & 32) != 0 ? false : z12;
            boolean z17 = (i11 & 64) == 0 ? z13 : false;
            kotlin.jvm.internal.l.f(str, "<this>");
            kotlin.jvm.internal.l.f(encodeSet, "encodeSet");
            int iCharCount = i14;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                int i15 = 32;
                int i16 = 43;
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z17) || y9.q.c0(encodeSet, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z14 || (z15 && ((i13 = iCharCount + 2) >= length || str.charAt(iCharCount) != '%' || t82.a(str.charAt(iCharCount + 1)) == -1 || t82.a(str.charAt(i13)) == -1)))) || (iCodePointAt == 43 && z16)))) {
                    C4468d c4468d = new C4468d();
                    c4468d.Q0(i14, iCharCount, str);
                    C4468d c4468d2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = str.codePointAt(iCharCount);
                        if (!z14 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 == i16 && z16) {
                                c4468d.R0(z14 ? "+" : "%2B");
                            } else if (iCodePointAt2 < i15 || iCodePointAt2 == 127 || ((iCodePointAt2 >= 128 && !z17) || y9.q.c0(encodeSet, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z14 || (z15 && ((i12 = iCharCount + 2) >= length || str.charAt(iCharCount) != '%' || t82.a(str.charAt(iCharCount + 1)) == -1 || t82.a(str.charAt(i12)) == -1)))))) {
                                if (c4468d2 == null) {
                                    c4468d2 = new C4468d();
                                }
                                c4468d2.S0(iCodePointAt2);
                                while (!c4468d2.K()) {
                                    byte b10 = c4468d2.readByte();
                                    c4468d.C0(37);
                                    c4468d.C0(rh0.f32642j[((b10 & 255) >> 4) & 15]);
                                    c4468d.C0(rh0.f32642j[b10 & 15]);
                                }
                            } else {
                                c4468d.S0(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i15 = 32;
                        i16 = 43;
                    }
                    return c4468d.p0();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i14, length);
            kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
            return strSubstring;
        }

        public static ArrayList b(String str) {
            kotlin.jvm.internal.l.f(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iF0 = y9.q.f0(str, '&', i, 4);
                if (iF0 == -1) {
                    iF0 = str.length();
                }
                int iF02 = y9.q.f0(str, '=', i, 4);
                if (iF02 == -1 || iF02 > iF0) {
                    String strSubstring = str.substring(i, iF0);
                    kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i, iF02);
                    kotlin.jvm.internal.l.e(strSubstring2, "substring(...)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iF02 + 1, iF0);
                    kotlin.jvm.internal.l.e(strSubstring3, "substring(...)");
                    arrayList.add(strSubstring3);
                }
                i = iF0 + 1;
            }
            return arrayList;
        }

        public /* synthetic */ b(int i) {
            this();
        }

        public static int a(String scheme) {
            kotlin.jvm.internal.l.f(scheme, "scheme");
            if (scheme.equals("http")) {
                return 80;
            }
            return scheme.equals("https") ? 443 : -1;
        }

        public static String a(String str, int i, int i10, boolean z10, int i11) {
            int i12;
            if ((i11 & 1) != 0) {
                i = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = str.length();
            }
            if ((i11 & 4) != 0) {
                z10 = false;
            }
            kotlin.jvm.internal.l.f(str, "<this>");
            int iCharCount = i;
            while (iCharCount < i10) {
                char cCharAt = str.charAt(iCharCount);
                if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                    C4468d c4468d = new C4468d();
                    c4468d.Q0(i, iCharCount, str);
                    while (iCharCount < i10) {
                        int iCodePointAt = str.codePointAt(iCharCount);
                        if (iCodePointAt == 37 && (i12 = iCharCount + 2) < i10) {
                            int iA = t82.a(str.charAt(iCharCount + 1));
                            int iA2 = t82.a(str.charAt(i12));
                            if (iA != -1 && iA2 != -1) {
                                c4468d.C0((iA << 4) + iA2);
                                iCharCount = Character.charCount(iCodePointAt) + i12;
                            } else {
                                c4468d.S0(iCodePointAt);
                                iCharCount += Character.charCount(iCodePointAt);
                            }
                        } else if (iCodePointAt == 43 && z10) {
                            c4468d.C0(32);
                            iCharCount++;
                        } else {
                            c4468d.S0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return c4468d.p0();
                }
                iCharCount++;
            }
            String strSubstring = str.substring(i, i10);
            kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
            return strSubstring;
        }
    }

    public rh0(String scheme, String username, String password, String host, int i, ArrayList pathSegments, ArrayList arrayList, String str, String url) {
        kotlin.jvm.internal.l.f(scheme, "scheme");
        kotlin.jvm.internal.l.f(username, "username");
        kotlin.jvm.internal.l.f(password, "password");
        kotlin.jvm.internal.l.f(host, "host");
        kotlin.jvm.internal.l.f(pathSegments, "pathSegments");
        kotlin.jvm.internal.l.f(url, "url");
        this.f32643a = scheme;
        this.f32644b = username;
        this.f32645c = password;
        this.f32646d = host;
        this.f32647e = i;
        this.f32648f = arrayList;
        this.f32649g = str;
        this.f32650h = url;
        this.i = scheme.equals("https");
    }

    public final String b() {
        if (this.f32645c.length() == 0) {
            return "";
        }
        String strSubstring = this.f32650h.substring(y9.q.f0(this.f32650h, ':', this.f32643a.length() + 3, 4) + 1, y9.q.f0(this.f32650h, '@', 0, 6));
        kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String c() {
        int iF0 = y9.q.f0(this.f32650h, '/', this.f32643a.length() + 3, 4);
        String str = this.f32650h;
        String strSubstring = this.f32650h.substring(iF0, t82.a(iF0, str.length(), str, "?#"));
        kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final ArrayList d() {
        int iF0 = y9.q.f0(this.f32650h, '/', this.f32643a.length() + 3, 4);
        String str = this.f32650h;
        int iA = t82.a(iF0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iF0 < iA) {
            int i = iF0 + 1;
            int iA2 = t82.a(this.f32650h, '/', i, iA);
            String strSubstring = this.f32650h.substring(i, iA2);
            kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iF0 = iA2;
        }
        return arrayList;
    }

    public final String e() {
        if (this.f32648f == null) {
            return null;
        }
        int iF0 = y9.q.f0(this.f32650h, '?', 0, 6) + 1;
        String str = this.f32650h;
        String strSubstring = this.f32650h.substring(iF0, t82.a(str, '#', iF0, str.length()));
        kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof rh0) && kotlin.jvm.internal.l.b(((rh0) obj).f32650h, this.f32650h);
    }

    public final String f() {
        if (this.f32644b.length() == 0) {
            return "";
        }
        int length = this.f32643a.length() + 3;
        String str = this.f32650h;
        String strSubstring = this.f32650h.substring(length, t82.a(length, str.length(), str, ":@"));
        kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String g() {
        return this.f32646d;
    }

    public final boolean h() {
        return this.i;
    }

    public final int hashCode() {
        return this.f32650h.hashCode();
    }

    public final int i() {
        return this.f32647e;
    }

    public final String j() throws EOFException {
        a aVarA;
        try {
            aVarA = new a().a(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVarA = null;
        }
        kotlin.jvm.internal.l.c(aVarA);
        return aVarA.e().c().a().f32650h;
    }

    public final String k() {
        return this.f32643a;
    }

    public final URI l() {
        String strSubstring;
        a aVar = new a();
        aVar.h(this.f32643a);
        aVar.f(f());
        aVar.e(b());
        aVar.g(this.f32646d);
        aVar.b(this.f32647e != b.a(this.f32643a) ? this.f32647e : -1);
        aVar.b().clear();
        aVar.b().addAll(d());
        aVar.a(e());
        if (this.f32649g == null) {
            strSubstring = null;
        } else {
            strSubstring = this.f32650h.substring(y9.q.f0(this.f32650h, '#', 0, 6) + 1);
            kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
        }
        aVar.d(strSubstring);
        String input = aVar.d().toString();
        try {
            return new URI(input);
        } catch (URISyntaxException e4) {
            try {
                Pattern patternCompile = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                kotlin.jvm.internal.l.e(patternCompile, "compile(...)");
                kotlin.jvm.internal.l.f(input, "input");
                String strReplaceAll = patternCompile.matcher(input).replaceAll("");
                kotlin.jvm.internal.l.e(strReplaceAll, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll);
                kotlin.jvm.internal.l.c(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e4);
            }
        }
    }

    public final URL m() {
        try {
            return new URL(this.f32650h);
        } catch (MalformedURLException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final String toString() {
        return this.f32650h;
    }
}

package U9;

import c9.C2092m;
import ia.C4468d;
import java.io.EOFException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* compiled from: HttpUrl.kt */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: k, reason: collision with root package name */
    public static final char[] f12711k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f12712a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12713b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12714c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12715d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12716e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f12717f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f12718g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12719h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f12720j;

    /* compiled from: HttpUrl.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f12721a;

        /* renamed from: d, reason: collision with root package name */
        public String f12724d;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f12726f;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList f12727g;

        /* renamed from: h, reason: collision with root package name */
        public String f12728h;

        /* renamed from: b, reason: collision with root package name */
        public String f12722b = "";

        /* renamed from: c, reason: collision with root package name */
        public String f12723c = "";

        /* renamed from: e, reason: collision with root package name */
        public int f12725e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f12726f = arrayList;
            arrayList.add("");
        }

        public final t a() {
            ArrayList arrayList;
            String str = this.f12721a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strC = b.c(0, 0, 7, this.f12722b);
            String strC2 = b.c(0, 0, 7, this.f12723c);
            String str2 = this.f12724d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = b();
            ArrayList arrayList2 = this.f12726f;
            ArrayList arrayList3 = new ArrayList(C2092m.T(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(b.c(0, 0, 7, (String) it.next()));
            }
            ArrayList<String> arrayList4 = this.f12727g;
            if (arrayList4 != null) {
                ArrayList arrayList5 = new ArrayList(C2092m.T(arrayList4, 10));
                for (String str3 : arrayList4) {
                    arrayList5.add(str3 != null ? b.c(0, 0, 3, str3) : null);
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            String str4 = this.f12728h;
            return new t(str, strC, strC2, str2, iB, arrayList3, arrayList, str4 != null ? b.c(0, 0, 7, str4) : null, toString());
        }

        public final int b() {
            int i = this.f12725e;
            if (i != -1) {
                return i;
            }
            String str = this.f12721a;
            kotlin.jvm.internal.l.c(str);
            if (str.equals("http")) {
                return 80;
            }
            return str.equals("https") ? 443 : -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x013a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(U9.t r19, java.lang.String r20) {
            /*
                Method dump skipped, instructions count: 941
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: U9.t.a.c(U9.t, java.lang.String):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f12721a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f12722b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.f12723c
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.f12722b
                r0.append(r1)
                java.lang.String r1 = r6.f12723c
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.f12723c
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.f12724d
                if (r1 == 0) goto L63
                boolean r1 = y9.q.c0(r1, r2)
                if (r1 == 0) goto L5e
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f12724d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L63
            L5e:
                java.lang.String r1 = r6.f12724d
                r0.append(r1)
            L63:
                int r1 = r6.f12725e
                r3 = -1
                if (r1 != r3) goto L6c
                java.lang.String r1 = r6.f12721a
                if (r1 == 0) goto L91
            L6c:
                int r1 = r6.b()
                java.lang.String r4 = r6.f12721a
                if (r4 == 0) goto L8b
                java.lang.String r5 = "http"
                boolean r5 = r4.equals(r5)
                if (r5 == 0) goto L7f
                r3 = 80
                goto L89
            L7f:
                java.lang.String r5 = "https"
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L89
                r3 = 443(0x1bb, float:6.21E-43)
            L89:
                if (r1 == r3) goto L91
            L8b:
                r0.append(r2)
                r0.append(r1)
            L91:
                java.util.ArrayList r1 = r6.f12726f
                java.lang.String r2 = "<this>"
                kotlin.jvm.internal.l.f(r1, r2)
                int r2 = r1.size()
                r3 = 0
            L9d:
                if (r3 >= r2) goto Lb0
                r4 = 47
                r0.append(r4)
                java.lang.Object r4 = r1.get(r3)
                java.lang.String r4 = (java.lang.String) r4
                r0.append(r4)
                int r3 = r3 + 1
                goto L9d
            Lb0:
                java.util.ArrayList r1 = r6.f12727g
                if (r1 == 0) goto Lc1
                r1 = 63
                r0.append(r1)
                java.util.ArrayList r1 = r6.f12727g
                kotlin.jvm.internal.l.c(r1)
                U9.t.b.e(r1, r0)
            Lc1:
                java.lang.String r1 = r6.f12728h
                if (r1 == 0) goto Lcf
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f12728h
                r0.append(r1)
            Lcf:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.l.e(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: U9.t.a.toString():java.lang.String");
        }
    }

    /* compiled from: HttpUrl.kt */
    public static final class b {
        public static String a(int i, int i10, int i11, String str, String str2) throws EOFException {
            int i12 = (i11 & 1) != 0 ? 0 : i;
            int length = (i11 & 2) != 0 ? str.length() : i10;
            boolean z10 = (i11 & 8) == 0;
            boolean z11 = (i11 & 16) == 0;
            boolean z12 = (i11 & 32) == 0;
            boolean z13 = (i11 & 64) == 0;
            kotlin.jvm.internal.l.f(str, "<this>");
            int iCharCount = i12;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                int i13 = 32;
                int i14 = 128;
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || y9.q.c0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z10 || (z11 && !b(iCharCount, length, str)))) || (iCodePointAt == 43 && z12)))) {
                    C4468d c4468d = new C4468d();
                    c4468d.Q0(i12, iCharCount, str);
                    C4468d c4468d2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = str.codePointAt(iCharCount);
                        if (!z10 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 == 43 && z12) {
                                c4468d.R0(z10 ? "+" : "%2B");
                            } else if (iCodePointAt2 < i13 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i14 && !z13) || y9.q.c0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z10 || (z11 && !b(iCharCount, length, str)))))) {
                                if (c4468d2 == null) {
                                    c4468d2 = new C4468d();
                                }
                                c4468d2.S0(iCodePointAt2);
                                while (!c4468d2.K()) {
                                    byte b10 = c4468d2.readByte();
                                    c4468d.C0(37);
                                    char[] cArr = t.f12711k;
                                    c4468d.C0(cArr[((b10 & 255) >> 4) & 15]);
                                    c4468d.C0(cArr[b10 & 15]);
                                }
                            } else {
                                c4468d.S0(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i13 = 32;
                        i14 = 128;
                    }
                    return c4468d.p0();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i12, length);
            kotlin.jvm.internal.l.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public static boolean b(int i, int i10, String str) {
            int i11 = i + 2;
            return i11 < i10 && str.charAt(i) == '%' && V9.b.q(str.charAt(i + 1)) != -1 && V9.b.q(str.charAt(i11)) != -1;
        }

        public static String c(int i, int i10, int i11, String str) {
            int i12;
            if ((i11 & 1) != 0) {
                i = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = str.length();
            }
            boolean z10 = (i11 & 4) == 0;
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
                            int iQ = V9.b.q(str.charAt(iCharCount + 1));
                            int iQ2 = V9.b.q(str.charAt(i12));
                            if (iQ == -1 || iQ2 == -1) {
                                c4468d.S0(iCodePointAt);
                                iCharCount += Character.charCount(iCodePointAt);
                            } else {
                                c4468d.C0((iQ << 4) + iQ2);
                                iCharCount = Character.charCount(iCodePointAt) + i12;
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
            kotlin.jvm.internal.l.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public static ArrayList d(String str) {
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
                    kotlin.jvm.internal.l.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i, iF02);
                    kotlin.jvm.internal.l.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iF02 + 1, iF0);
                    kotlin.jvm.internal.l.e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i = iF0 + 1;
            }
            return arrayList;
        }

        public static void e(ArrayList arrayList, StringBuilder sb) {
            kotlin.jvm.internal.l.f(arrayList, "<this>");
            v9.e eVarN = v9.h.N(v9.h.O(0, arrayList.size()), 2);
            int i = eVarN.f47096b;
            int i10 = eVarN.f47097c;
            int i11 = eVarN.f47098d;
            if ((i11 <= 0 || i > i10) && (i11 >= 0 || i10 > i)) {
                return;
            }
            while (true) {
                String str = (String) arrayList.get(i);
                String str2 = (String) arrayList.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i == i10) {
                    return;
                } else {
                    i += i11;
                }
            }
        }
    }

    public t(String scheme, String str, String str2, String host, int i, ArrayList arrayList, ArrayList arrayList2, String str3, String str4) {
        kotlin.jvm.internal.l.f(scheme, "scheme");
        kotlin.jvm.internal.l.f(host, "host");
        this.f12712a = scheme;
        this.f12713b = str;
        this.f12714c = str2;
        this.f12715d = host;
        this.f12716e = i;
        this.f12717f = arrayList;
        this.f12718g = arrayList2;
        this.f12719h = str3;
        this.i = str4;
        this.f12720j = scheme.equals("https");
    }

    public final String a() {
        if (this.f12714c.length() == 0) {
            return "";
        }
        int length = this.f12712a.length() + 3;
        String str = this.i;
        String strSubstring = str.substring(y9.q.f0(str, ':', length, 4) + 1, y9.q.f0(str, '@', 0, 6));
        kotlin.jvm.internal.l.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f12712a.length() + 3;
        String str = this.i;
        int iF0 = y9.q.f0(str, '/', length, 4);
        String strSubstring = str.substring(iF0, V9.b.e(iF0, str.length(), str, "?#"));
        kotlin.jvm.internal.l.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f12712a.length() + 3;
        String str = this.i;
        int iF0 = y9.q.f0(str, '/', length, 4);
        int iE = V9.b.e(iF0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iF0 < iE) {
            int i = iF0 + 1;
            int iF = V9.b.f(str, '/', i, iE);
            String strSubstring = str.substring(i, iF);
            kotlin.jvm.internal.l.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iF0 = iF;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f12718g == null) {
            return null;
        }
        String str = this.i;
        int iF0 = y9.q.f0(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iF0, V9.b.f(str, '#', iF0, str.length()));
        kotlin.jvm.internal.l.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.f12713b.length() == 0) {
            return "";
        }
        int length = this.f12712a.length() + 3;
        String str = this.i;
        String strSubstring = str.substring(length, V9.b.e(length, str.length(), str, ":@"));
        kotlin.jvm.internal.l.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t) && kotlin.jvm.internal.l.b(((t) obj).i, this.i);
    }

    public final a f() {
        a aVar = new a();
        String scheme = this.f12712a;
        aVar.f12721a = scheme;
        aVar.f12722b = e();
        aVar.f12723c = a();
        aVar.f12724d = this.f12715d;
        kotlin.jvm.internal.l.f(scheme, "scheme");
        int i = scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1;
        int i10 = this.f12716e;
        aVar.f12725e = i10 != i ? i10 : -1;
        ArrayList arrayList = aVar.f12726f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        aVar.f12727g = strD != null ? b.d(b.a(0, 0, 211, strD, " \"'<>#")) : null;
        if (this.f12719h != null) {
            String str = this.i;
            strSubstring = str.substring(y9.q.f0(str, '#', 0, 6) + 1);
            kotlin.jvm.internal.l.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        aVar.f12728h = strSubstring;
        return aVar;
    }

    public final a g(String link) {
        kotlin.jvm.internal.l.f(link, "link");
        try {
            a aVar = new a();
            aVar.c(this, link);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String h() {
        a aVarG = g("/...");
        kotlin.jvm.internal.l.c(aVarG);
        aVarG.f12722b = b.a(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
        aVarG.f12723c = b.a(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
        return aVarG.a().i;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final URI i() {
        String strReplaceAll;
        a aVarF = f();
        String str = aVarF.f12724d;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            kotlin.jvm.internal.l.e(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str).replaceAll("");
            kotlin.jvm.internal.l.e(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        aVarF.f12724d = strReplaceAll;
        ArrayList arrayList = aVarF.f12726f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, b.a(0, 0, 227, (String) arrayList.get(i), "[]"));
        }
        ArrayList arrayList2 = aVarF.f12727g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                String str2 = (String) arrayList2.get(i10);
                arrayList2.set(i10, str2 != null ? b.a(0, 0, 195, str2, "\\^`{|}") : null);
            }
        }
        String str3 = aVarF.f12728h;
        aVarF.f12728h = str3 != null ? b.a(0, 0, 163, str3, " \"#<>\\^`{|}") : null;
        String string = aVarF.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e4) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                kotlin.jvm.internal.l.e(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                kotlin.jvm.internal.l.e(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                kotlin.jvm.internal.l.e(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e4);
            }
        }
    }

    public final String toString() {
        return this.i;
    }
}

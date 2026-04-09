package com.mbridge.msdk.thrid.okhttp;

import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Marker;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: j, reason: collision with root package name */
    private static final char[] f18034j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    final String f18035a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18036b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18037c;

    /* renamed from: d, reason: collision with root package name */
    final String f18038d;

    /* renamed from: e, reason: collision with root package name */
    final int f18039e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f18040f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final List<String> f18041g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private final String f18042h;

    /* renamed from: i, reason: collision with root package name */
    private final String f18043i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        String f18044a;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        String f18047d;

        /* renamed from: f, reason: collision with root package name */
        final List<String> f18049f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        List<String> f18050g;

        /* renamed from: h, reason: collision with root package name */
        @Nullable
        String f18051h;

        /* renamed from: b, reason: collision with root package name */
        String f18045b = "";

        /* renamed from: c, reason: collision with root package name */
        String f18046c = "";

        /* renamed from: e, reason: collision with root package name */
        int f18048e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f18049f = arrayList;
            arrayList.add("");
        }

        private boolean c(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        public a a(int i10) {
            if (i10 > 0 && i10 <= 65535) {
                this.f18048e = i10;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i10);
        }

        public a b(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strA = a(str, 0, str.length());
            if (strA != null) {
                this.f18047d = strA;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public a d() {
            int size = this.f18049f.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f18049f.set(i10, s.a(this.f18049f.get(i10), "[]", true, true, false, true));
            }
            List<String> list = this.f18050g;
            if (list != null) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str = this.f18050g.get(i11);
                    if (str != null) {
                        this.f18050g.set(i11, s.a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f18051h;
            if (str2 != null) {
                this.f18051h = s.a(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a e(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.f18046c = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public a f(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.f18044a = "http";
                return this;
            }
            if (str.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
                this.f18044a = HttpRequest.DEFAULT_SCHEME;
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + str);
        }

        public a g(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.f18045b = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f18044a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f18045b.isEmpty() || !this.f18046c.isEmpty()) {
                sb.append(this.f18045b);
                if (!this.f18046c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f18046c);
                }
                sb.append('@');
            }
            String str2 = this.f18047d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f18047d);
                    sb.append(']');
                } else {
                    sb.append(this.f18047d);
                }
            }
            if (this.f18048e != -1 || this.f18044a != null) {
                int iB = b();
                String str3 = this.f18044a;
                if (str3 == null || iB != s.a(str3)) {
                    sb.append(':');
                    sb.append(iB);
                }
            }
            s.b(sb, this.f18049f);
            if (this.f18050g != null) {
                sb.append('?');
                s.a(sb, this.f18050g);
            }
            if (this.f18051h != null) {
                sb.append('#');
                sb.append(this.f18051h);
            }
            return sb.toString();
        }

        private void c() {
            if (!this.f18049f.remove(r0.size() - 1).isEmpty() || this.f18049f.isEmpty()) {
                this.f18049f.add("");
            } else {
                this.f18049f.set(r0.size() - 1, "");
            }
        }

        private static int e(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i10);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public a a(@Nullable String str) {
            this.f18050g = str != null ? s.d(s.a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public s a() {
            if (this.f18044a != null) {
                if (this.f18047d != null) {
                    return new s(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public int b() {
            int i10 = this.f18048e;
            return i10 != -1 ? i10 : s.a(this.f18044a);
        }

        private static int b(String str, int i10, int i11) throws NumberFormatException {
            int i12;
            try {
                i12 = Integer.parseInt(s.a(str, i10, i11, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (i12 <= 0 || i12 > 65535) {
                return -1;
            }
            return i12;
        }

        private static int c(String str, int i10, int i11) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == ':') {
                    return i10;
                }
                if (cCharAt == '[') {
                    do {
                        i10++;
                        if (i10 < i11) {
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            return i11;
        }

        private static int f(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        public a a(@Nullable s sVar, String str) throws NumberFormatException {
            int iA;
            String str2;
            int i10;
            String str3;
            String str4 = str;
            int iB = com.mbridge.msdk.thrid.okhttp.internal.c.b(str4, 0, str4.length());
            int iC = com.mbridge.msdk.thrid.okhttp.internal.c.c(str4, iB, str4.length());
            int iE = e(str4, iB, iC);
            if (iE != -1) {
                if (str4.regionMatches(true, iB, "https:", 0, 6)) {
                    this.f18044a = HttpRequest.DEFAULT_SCHEME;
                    iB += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, iB, "http:", 0, 5)) {
                        this.f18044a = "http";
                        iB += 5;
                    } else {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str4.substring(0, iE) + "'");
                    }
                }
            } else if (sVar != null) {
                this.f18044a = sVar.f18035a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int iF = f(str4, iB, iC);
            char c10 = '#';
            if (iF < 2 && sVar != null && sVar.f18035a.equals(this.f18044a)) {
                this.f18045b = sVar.f();
                this.f18046c = sVar.b();
                this.f18047d = sVar.f18038d;
                this.f18048e = sVar.f18039e;
                this.f18049f.clear();
                this.f18049f.addAll(sVar.d());
                if (iB == iC || str4.charAt(iB) == '#') {
                    a(sVar.e());
                }
                str2 = str4;
            } else {
                int i11 = iB + iF;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str4, i11, iC, "@/\\?#");
                    char cCharAt = iA != iC ? str4.charAt(iA) : (char) 65535;
                    if (cCharAt == 65535 || cCharAt == c10 || cCharAt == '/' || cCharAt == '\\' || cCharAt == '?') {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (!z10) {
                            int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str4, i11, iA, ':');
                            String strA = s.a(str, i11, iA2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                strA = this.f18045b + "%40" + strA;
                            }
                            this.f18045b = strA;
                            if (iA2 != iA) {
                                i10 = iA;
                                this.f18046c = s.a(str, iA2 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            } else {
                                i10 = iA;
                            }
                            str3 = str;
                            z11 = true;
                        } else {
                            i10 = iA;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.f18046c);
                            sb.append("%40");
                            str3 = str;
                            sb.append(s.a(str3, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f18046c = sb.toString();
                        }
                        i11 = i10 + 1;
                        str4 = str3;
                        c10 = '#';
                    }
                }
                str2 = str4;
                int i12 = i11;
                int iC2 = c(str2, i12, iA);
                int i13 = iC2 + 1;
                if (i13 < iA) {
                    this.f18047d = a(str2, i12, iC2);
                    int iB2 = b(str2, i13, iA);
                    this.f18048e = iB2;
                    if (iB2 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i13, iA) + '\"');
                    }
                } else {
                    this.f18047d = a(str2, i12, iC2);
                    this.f18048e = s.a(this.f18044a);
                }
                if (this.f18047d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i12, iC2) + '\"');
                }
                iB = iA;
            }
            int iA3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str2, iB, iC, "?#");
            d(str2, iB, iA3);
            if (iA3 < iC && str2.charAt(iA3) == '?') {
                int iA4 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str2, iA3, iC, '#');
                this.f18050g = s.d(s.a(str2, iA3 + 1, iA4, " \"'<>#", true, false, true, true, null));
                iA3 = iA4;
            }
            if (iA3 < iC && str2.charAt(iA3) == '#') {
                this.f18051h = s.a(str2, iA3 + 1, iC, "", true, false, false, false, null);
            }
            return this;
        }

        private void d(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.f18049f;
                list.set(list.size() - 1, "");
            } else {
                this.f18049f.clear();
                this.f18049f.add("");
                i10++;
            }
            int i12 = i10;
            while (i12 < i11) {
                int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i12, i11, "/\\");
                boolean z10 = iA < i11;
                String str2 = str;
                a(str2, i12, iA, z10, true);
                if (z10) {
                    i12 = iA + 1;
                    str = str2;
                } else {
                    str = str2;
                    i12 = iA;
                }
            }
        }

        private boolean d(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void a(String str, int i10, int i11, boolean z10, boolean z11) {
            String strA = s.a(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, true, null);
            if (c(strA)) {
                return;
            }
            if (d(strA)) {
                c();
                return;
            }
            if (this.f18049f.get(r11.size() - 1).isEmpty()) {
                this.f18049f.set(r11.size() - 1, strA);
            } else {
                this.f18049f.add(strA);
            }
            if (z10) {
                this.f18049f.add("");
            }
        }

        private static String a(String str, int i10, int i11) {
            return com.mbridge.msdk.thrid.okhttp.internal.c.a(s.a(str, i10, i11, false));
        }
    }

    public s(a aVar) {
        this.f18035a = aVar.f18044a;
        this.f18036b = a(aVar.f18045b, false);
        this.f18037c = a(aVar.f18046c, false);
        this.f18038d = aVar.f18047d;
        this.f18039e = aVar.b();
        this.f18040f = a(aVar.f18049f, false);
        List<String> list = aVar.f18050g;
        this.f18041g = list != null ? a(list, true) : null;
        String str = aVar.f18051h;
        this.f18042h = str != null ? a(str, false) : null;
        this.f18043i = aVar.toString();
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
    }

    public String b() {
        if (this.f18037c.isEmpty()) {
            return "";
        }
        return this.f18043i.substring(this.f18043i.indexOf(58, this.f18035a.length() + 3) + 1, this.f18043i.indexOf(64));
    }

    public String c() {
        int iIndexOf = this.f18043i.indexOf(47, this.f18035a.length() + 3);
        String str = this.f18043i;
        return this.f18043i.substring(iIndexOf, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), "?#"));
    }

    public List<String> d() {
        int iIndexOf = this.f18043i.indexOf(47, this.f18035a.length() + 3);
        String str = this.f18043i;
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iA) {
            int i10 = iIndexOf + 1;
            int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f18043i, i10, iA, '/');
            arrayList.add(this.f18043i.substring(i10, iA2));
            iIndexOf = iA2;
        }
        return arrayList;
    }

    @Nullable
    public String e() {
        if (this.f18041g == null) {
            return null;
        }
        int iIndexOf = this.f18043i.indexOf(63) + 1;
        String str = this.f18043i;
        return this.f18043i.substring(iIndexOf, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), '#'));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof s) && ((s) obj).f18043i.equals(this.f18043i);
    }

    public String f() {
        if (this.f18036b.isEmpty()) {
            return "";
        }
        int length = this.f18035a.length() + 3;
        String str = this.f18043i;
        return this.f18043i.substring(length, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, length, str.length(), ":@"));
    }

    public String g() {
        return this.f18038d;
    }

    public boolean h() {
        return this.f18035a.equals(HttpRequest.DEFAULT_SCHEME);
    }

    public int hashCode() {
        return this.f18043i.hashCode();
    }

    public a i() {
        a aVar = new a();
        aVar.f18044a = this.f18035a;
        aVar.f18045b = f();
        aVar.f18046c = b();
        aVar.f18047d = this.f18038d;
        aVar.f18048e = this.f18039e != a(this.f18035a) ? this.f18039e : -1;
        aVar.f18049f.clear();
        aVar.f18049f.addAll(d());
        aVar.a(e());
        aVar.f18051h = a();
        return aVar;
    }

    public int j() {
        return this.f18039e;
    }

    @Nullable
    public String k() {
        if (this.f18041g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        a(sb, this.f18041g);
        return sb.toString();
    }

    public String l() {
        return c("/...").g("").e("").a().toString();
    }

    public String m() {
        return this.f18035a;
    }

    public URI n() {
        String string = i().d().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public String toString() {
        return this.f18043i;
    }

    public static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    @Nullable
    public a c(String str) {
        try {
            return new a().a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb.append('/');
            sb.append(list.get(i10));
        }
    }

    @Nullable
    public s e(String str) {
        a aVarC = c(str);
        if (aVarC != null) {
            return aVarC.a();
        }
        return null;
    }

    public static List<String> d(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iIndexOf = str.indexOf(38, i10);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i10);
            if (iIndexOf2 != -1 && iIndexOf2 <= iIndexOf) {
                arrayList.add(str.substring(i10, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            } else {
                arrayList.add(str.substring(i10, iIndexOf));
                arrayList.add(null);
            }
            i10 = iIndexOf + 1;
        }
        return arrayList;
    }

    public static s b(String str) {
        return new a().a(null, str).a();
    }

    @Nullable
    public String a() {
        if (this.f18042h == null) {
            return null;
        }
        return this.f18043i.substring(this.f18043i.indexOf(35) + 1);
    }

    public static String a(String str, boolean z10) {
        return a(str, 0, str.length(), z10);
    }

    private List<String> a(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? a(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String a(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                cVar.a(str, i10, i12);
                a(cVar, str, i12, i11, z10);
                return cVar.p();
            }
        }
        return str.substring(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.mbridge.msdk.thrid.okio.c r5, java.lang.String r6, int r7, int r8, boolean r9) {
        /*
        L0:
            if (r7 >= r8) goto L42
            int r0 = r6.codePointAt(r7)
            r1 = 37
            if (r0 != r1) goto L2d
            int r1 = r7 + 2
            if (r1 >= r8) goto L2d
            int r2 = r7 + 1
            char r2 = r6.charAt(r2)
            int r2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(r2)
            char r3 = r6.charAt(r1)
            int r3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(r3)
            r4 = -1
            if (r2 == r4) goto L39
            if (r3 == r4) goto L39
            int r7 = r2 << 4
            int r7 = r7 + r3
            r5.writeByte(r7)
            r7 = r1
            goto L3c
        L2d:
            r1 = 43
            if (r0 != r1) goto L39
            if (r9 == 0) goto L39
            r1 = 32
            r5.writeByte(r1)
            goto L3c
        L39:
            r5.f(r0)
        L3c:
            int r0 = java.lang.Character.charCount(r0)
            int r7 = r7 + r0
            goto L0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.s.a(com.mbridge.msdk.thrid.okio.c, java.lang.String, int, int, boolean):void");
    }

    public static boolean a(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i10 + 1)) != -1 && com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i12)) != -1;
    }

    public static String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z10 && (!z11 || a(str, iCharCount, i11)))) && (iCodePointAt != 43 || !z12)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                cVar.a(str, i10, iCharCount);
                a(cVar, str, iCharCount, i11, str2, z10, z11, z12, z13, charset);
                return cVar.p();
            }
        }
        return str.substring(i10, i11);
    }

    public static void a(com.mbridge.msdk.thrid.okio.c cVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        com.mbridge.msdk.thrid.okio.c cVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z12) {
                    cVar.a(z10 ? Marker.ANY_NON_NULL_MARKER : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z10 && (!z11 || a(str, i10, i11)))))) {
                    cVar.f(iCodePointAt);
                } else {
                    if (cVar2 == null) {
                        cVar2 = new com.mbridge.msdk.thrid.okio.c();
                    }
                    if (charset != null && !charset.equals(com.mbridge.msdk.thrid.okhttp.internal.c.f17635j)) {
                        cVar2.a(str, i10, Character.charCount(iCodePointAt) + i10, charset);
                    } else {
                        cVar2.f(iCodePointAt);
                    }
                    while (!cVar2.f()) {
                        byte b10 = cVar2.readByte();
                        cVar.writeByte(37);
                        char[] cArr = f18034j;
                        cVar.writeByte((int) cArr[((b10 & 255) >> 4) & 15]);
                        cVar.writeByte((int) cArr[b10 & 15]);
                    }
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static String a(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, charset);
    }

    public static String a(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }
}

package ou;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class t {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f19967a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19968b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19969c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19970d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19971e;

    /* renamed from: f, reason: collision with root package name */
    public final List f19972f;

    /* renamed from: g, reason: collision with root package name */
    public final String f19973g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19974h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f19975i;

    public t(String str, String str2, String str3, String str4, int i10, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        br.l.e(str, "scheme");
        br.l.e(str4, "host");
        this.f19967a = str;
        this.f19968b = str2;
        this.f19969c = str3;
        this.f19970d = str4;
        this.f19971e = i10;
        this.f19972f = arrayList2;
        this.f19973g = str5;
        this.f19974h = str6;
        this.f19975i = str.equals("https");
    }

    public final String a() {
        if (this.f19969c.length() == 0) {
            return "";
        }
        int length = this.f19967a.length() + 3;
        String str = this.f19974h;
        String strSubstring = str.substring(tt.l.A0(str, ':', length, 4) + 1, tt.l.A0(str, '@', 0, 6));
        br.l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f19967a.length() + 3;
        String str = this.f19974h;
        int iA0 = tt.l.A0(str, '/', length, 4);
        String strSubstring = str.substring(iA0, pu.b.g(str, iA0, str.length(), "?#"));
        br.l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f19967a.length() + 3;
        String str = this.f19974h;
        int iA0 = tt.l.A0(str, '/', length, 4);
        int iG = pu.b.g(str, iA0, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iA0 < iG) {
            int i10 = iA0 + 1;
            int iF = pu.b.f(str, '/', i10, iG);
            String strSubstring = str.substring(i10, iF);
            br.l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iA0 = iF;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f19972f == null) {
            return null;
        }
        String str = this.f19974h;
        int iA0 = tt.l.A0(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iA0, pu.b.f(str, '#', iA0, str.length()));
        br.l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.f19968b.length() == 0) {
            return "";
        }
        int length = this.f19967a.length() + 3;
        String str = this.f19974h;
        String strSubstring = str.substring(length, pu.b.g(str, length, str.length(), ":@"));
        br.l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t) && br.l.a(((t) obj).f19974h, this.f19974h);
    }

    public final String f() {
        ee.x xVar;
        try {
            xVar = new ee.x(1);
            xVar.f(this, "/...");
        } catch (IllegalArgumentException unused) {
            xVar = null;
        }
        br.l.b(xVar);
        xVar.f8167d = b.b("", 0, " \"':;<=>@[]^`{}|/\\?#", 0, 251);
        xVar.f8168e = b.b("", 0, " \"':;<=>@[]^`{}|/\\?#", 0, 251);
        return xVar.b().f19974h;
    }

    public final URI g() {
        String strSubstring;
        String strReplaceAll;
        ee.x xVar = new ee.x(1);
        ArrayList arrayList = (ArrayList) xVar.f8170g;
        String str = this.f19967a;
        xVar.f8166c = str;
        xVar.f8167d = e();
        xVar.f8168e = a();
        xVar.f8169f = this.f19970d;
        br.l.e(str, "scheme");
        int i10 = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i11 = this.f19971e;
        xVar.f8165b = i11 != i10 ? i11 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        xVar.f8171h = strD != null ? b.f(b.b(strD, 0, " \"'<>#", 0, 211)) : null;
        if (this.f19973g == null) {
            strSubstring = null;
        } else {
            String str2 = this.f19974h;
            strSubstring = str2.substring(tt.l.A0(str2, '#', 0, 6) + 1);
            br.l.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        xVar.f8172i = strSubstring;
        String str3 = (String) xVar.f8169f;
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            br.l.d(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str3).replaceAll("");
            br.l.d(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        xVar.f8169f = strReplaceAll;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.set(i12, b.b((String) arrayList.get(i12), 0, "[]", 0, 227));
        }
        ArrayList arrayList2 = (ArrayList) xVar.f8171h;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                String str4 = (String) arrayList2.get(i13);
                arrayList2.set(i13, str4 != null ? b.b(str4, 0, "\\^`{|}", 0, 195) : null);
            }
        }
        String str5 = (String) xVar.f8172i;
        xVar.f8172i = str5 != null ? b.b(str5, 0, " \"#<>\\^`{|}", 0, 163) : null;
        String string = xVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e4) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                br.l.d(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                br.l.d(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                br.l.d(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e4);
            }
        }
    }

    public final int hashCode() {
        return this.f19974h.hashCode();
    }

    public final String toString() {
        return this.f19974h;
    }
}

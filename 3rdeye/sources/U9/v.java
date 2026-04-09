package U9;

import N7.B8;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MediaType.kt */
/* loaded from: classes3.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f12729d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f12730e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f12731a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12732b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f12733c;

    /* compiled from: MediaType.kt */
    public static final class a {
        public static v a(String str) {
            kotlin.jvm.internal.l.f(str, "<this>");
            Matcher matcher = v.f12729d.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(androidx.work.s.e("No subtype found for: \"", str, '\"').toString());
            }
            String strGroup = matcher.group(1);
            kotlin.jvm.internal.l.e(strGroup, "typeSubtype.group(1)");
            Locale US = Locale.US;
            kotlin.jvm.internal.l.e(US, "US");
            String lowerCase = strGroup.toLowerCase(US);
            kotlin.jvm.internal.l.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            kotlin.jvm.internal.l.e(strGroup2, "typeSubtype.group(2)");
            kotlin.jvm.internal.l.e(strGroup2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = v.f12730e.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    kotlin.jvm.internal.l.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    throw new IllegalArgumentException(B8.j(sb, str, '\"').toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (y9.n.a0(strGroup4, "'", false) && y9.n.T(strGroup4, "'") && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        kotlin.jvm.internal.l.e(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new v(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
        }

        public static v b(String str) {
            kotlin.jvm.internal.l.f(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public v(String str, String str2, String[] strArr) {
        this.f12731a = str;
        this.f12732b = str2;
        this.f12733c = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.f12733c;
        int i = 0;
        int iP = B7.d.p(0, strArr.length - 1, 2);
        if (iP < 0) {
            str = null;
            break;
        }
        while (!y9.n.U(strArr[i], "charset", true)) {
            if (i == iP) {
                str = null;
                break;
            }
            i += 2;
        }
        str = strArr[i + 1];
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v) && kotlin.jvm.internal.l.b(((v) obj).f12731a, this.f12731a);
    }

    public final int hashCode() {
        return this.f12731a.hashCode();
    }

    public final String toString() {
        return this.f12731a;
    }
}

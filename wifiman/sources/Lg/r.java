package Lg;

import Kg.d;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
abstract class r {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f11811a = Pattern.compile("^((.*)\\._)?_?(.*)\\._sub\\._([^.]*)\\._([^.]*)\\.(.*)\\.?$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f11812b = Pattern.compile("^((.*)?\\._)?([^.]*)\\._([^.]*)\\.(.*)\\.?$");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f11813c = Pattern.compile("^([^.]*)\\.(.*)\\.?$");

    static Map a(String str, String str2, String str3) {
        Map mapB = b(str);
        mapB.put(d.a.Instance, str2);
        mapB.put(d.a.Subtype, str3);
        return q.N(mapB);
    }

    static Map b(String str) {
        String strSubstring;
        String strC;
        String str2;
        String strC2;
        String lowerCase = str.toLowerCase();
        String strC3 = "";
        if (lowerCase.contains("in-addr.arpa") || lowerCase.contains("ip6.arpa")) {
            int iIndexOf = lowerCase.contains("in-addr.arpa") ? lowerCase.indexOf("in-addr.arpa") : lowerCase.indexOf("ip6.arpa");
            String strH0 = q.h0(str.substring(0, iIndexOf));
            strSubstring = str.substring(iIndexOf);
            lowerCase = "";
            strC = lowerCase;
            strC3 = strH0;
            str2 = strC;
        } else {
            Matcher matcher = f11811a.matcher(lowerCase);
            if (matcher.matches()) {
                strC3 = c(str, matcher, 2);
                String strC4 = c(str, matcher, 3);
                strC2 = c(str, matcher, 4);
                strC = c(str, matcher, 5);
                strSubstring = c(str, matcher, 6);
                str2 = strC4;
            } else {
                Matcher matcher2 = f11812b.matcher(lowerCase);
                if (matcher2.matches()) {
                    String strC5 = c(str, matcher2, 2);
                    strC2 = c(str, matcher2, 3);
                    String strC6 = c(str, matcher2, 4);
                    strSubstring = c(str, matcher2, 5);
                    str2 = "";
                    strC = strC6;
                    strC3 = strC5;
                } else {
                    Matcher matcher3 = f11813c.matcher(lowerCase);
                    if (matcher3.matches()) {
                        String strC7 = c(str, matcher3, 1);
                        strSubstring = c(str, matcher3, 2);
                        str2 = "";
                        strC = str2;
                        strC3 = strC7;
                        lowerCase = strC;
                    } else {
                        strSubstring = "";
                        str2 = strSubstring;
                        strC = str2;
                    }
                }
            }
            lowerCase = strC2;
        }
        return q.P(strC3, q.h0(lowerCase), strC, q.h0(strSubstring), str2);
    }

    private static String c(String str, Matcher matcher, int i10) {
        return matcher.start(i10) != -1 ? str.substring(matcher.start(i10), matcher.end(i10)) : "";
    }
}

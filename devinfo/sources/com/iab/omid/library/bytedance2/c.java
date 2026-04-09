package com.iab.omid.library.bytedance2;

import com.iab.omid.library.bytedance2.utils.g;
import d.h;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f21039a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f21040b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f21041c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f21042d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f21043e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f21044f = Pattern.compile("<(html)( [^>]*?)?/>", 2);
    private static final Pattern g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    public static String a(String str, String str2) {
        g.a(str, "HTML is null or empty");
        int[][] iArrA = a(str);
        StringBuilder sb2 = new StringBuilder(r5.c.f(str.length(), 16, str2));
        if (!b(str, sb2, f21040b, str2, iArrA) && !a(str, sb2, f21039a, str2, iArrA) && !b(str, sb2, f21042d, str2, iArrA) && !a(str, sb2, f21041c, str2, iArrA) && !b(str, sb2, f21044f, str2, iArrA) && !a(str, sb2, f21043e, str2, iArrA) && !a(str, sb2, g, str2, iArrA)) {
            return str2.concat(str);
        }
        return sb2.toString();
    }

    public static String b(String str, String str2) {
        return a(str2, h.t("<script type=\"text/javascript\">", str, "</script>"));
    }

    private static boolean a(int i4, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i4 >= iArr2[0] && i4 <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i4 = 0;
        while (matcher.find(i4)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!a(iStart, iArr)) {
                sb2.append(str.substring(0, matcher.end()));
                sb2.append(str2);
                sb2.append(str.substring(matcher.end()));
                return true;
            }
            i4 = iEnd;
        }
        return false;
    }

    private static int[][] a(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            int iIndexOf = str.indexOf("<!--", i4);
            if (iIndexOf >= 0) {
                int iIndexOf2 = str.indexOf("-->", iIndexOf);
                if (iIndexOf2 >= 0) {
                    arrayList.add(new int[]{iIndexOf, iIndexOf2});
                    i4 = iIndexOf2 + 3;
                } else {
                    arrayList.add(new int[]{iIndexOf, length});
                }
            }
            i4 = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance((Class<?>) Integer.TYPE, 0, 2));
    }

    private static boolean b(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i4 = 0;
        while (matcher.find(i4)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!a(iStart, iArr)) {
                sb2.append(str.substring(0, matcher.end() - 2));
                sb2.append(">");
                sb2.append(str2);
                sb2.append("</");
                sb2.append(matcher.group(1));
                sb2.append(">");
                sb2.append(str.substring(matcher.end()));
                return true;
            }
            i4 = iEnd;
        }
        return false;
    }
}

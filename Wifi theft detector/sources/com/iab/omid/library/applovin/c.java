package com.iab.omid.library.applovin;

import com.iab.omid.library.applovin.utils.g;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f12206a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f12207b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f12208c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f12209d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f12210e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f12211f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f12212g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    public static String a(String str, String str2) {
        g.a(str, "HTML is null or empty");
        int[][] iArrA = a(str);
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + 16);
        if (!b(str, sb, f12207b, str2, iArrA) && !a(str, sb, f12206a, str2, iArrA) && !b(str, sb, f12209d, str2, iArrA) && !a(str, sb, f12208c, str2, iArrA) && !b(str, sb, f12211f, str2, iArrA) && !a(str, sb, f12210e, str2, iArrA) && !a(str, sb, f12212g, str2, iArrA)) {
            return str2 + str;
        }
        return sb.toString();
    }

    public static String b(String str, String str2) {
        return a(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    private static boolean a(int i10, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i10 >= iArr2[0] && i10 <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i10 = 0;
        while (matcher.find(i10)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!a(iStart, iArr)) {
                sb.append(str.substring(0, matcher.end() - 2));
                sb.append(">");
                sb.append(str2);
                sb.append("</");
                sb.append(matcher.group(1));
                sb.append(">");
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i10 = iEnd;
        }
        return false;
    }

    private static boolean a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i10 = 0;
        while (matcher.find(i10)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!a(iStart, iArr)) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i10 = iEnd;
        }
        return false;
    }

    private static int[][] a(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int iIndexOf = str.indexOf("<!--", i10);
            if (iIndexOf >= 0) {
                int iIndexOf2 = str.indexOf("-->", iIndexOf);
                if (iIndexOf2 >= 0) {
                    arrayList.add(new int[]{iIndexOf, iIndexOf2});
                    i10 = iIndexOf2 + 3;
                } else {
                    arrayList.add(new int[]{iIndexOf, length});
                }
            }
            i10 = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance((Class<?>) Integer.TYPE, 0, 2));
    }
}

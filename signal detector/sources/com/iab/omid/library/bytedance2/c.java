package com.iab.omid.library.bytedance2;

import A.f;
import com.iab.omid.library.bytedance2.utils.g;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f18640a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f18641b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f18642c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f18643d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f18644e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f18645f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f18646g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    public static String a(String str, String str2) {
        g.a(str, "HTML is null or empty");
        int[][] iArrA = a(str);
        StringBuilder sb = new StringBuilder(AbstractC2763b.b(str.length(), 16, str2));
        if (!b(str, sb, f18641b, str2, iArrA) && !a(str, sb, f18640a, str2, iArrA) && !b(str, sb, f18643d, str2, iArrA) && !a(str, sb, f18642c, str2, iArrA) && !b(str, sb, f18645f, str2, iArrA) && !a(str, sb, f18644e, str2, iArrA) && !a(str, sb, f18646g, str2, iArrA)) {
            return str2.concat(str);
        }
        return sb.toString();
    }

    public static String b(String str, String str2) {
        return a(str2, f.m("<script type=\"text/javascript\">", str, "</script>"));
    }

    private static boolean a(int i, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i >= iArr2[0] && i <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (!a(iStart, iArr)) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = iEnd;
        }
        return false;
    }

    private static int[][] a(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int iIndexOf = str.indexOf("<!--", i);
            if (iIndexOf >= 0) {
                int iIndexOf2 = str.indexOf("-->", iIndexOf);
                if (iIndexOf2 >= 0) {
                    arrayList.add(new int[]{iIndexOf, iIndexOf2});
                    i = iIndexOf2 + 3;
                } else {
                    arrayList.add(new int[]{iIndexOf, length});
                }
            }
            i = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance((Class<?>) Integer.TYPE, 0, 2));
    }

    private static boolean b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
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
            i = iEnd;
        }
        return false;
    }
}

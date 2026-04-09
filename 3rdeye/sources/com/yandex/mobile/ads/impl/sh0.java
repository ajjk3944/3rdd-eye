package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class sh0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f33067a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f33068b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f33069c = 0;

    public static long a(String str, String str2) throws NumberFormatException {
        long j4;
        if (TextUtils.isEmpty(str)) {
            j4 = -1;
        } else {
            try {
                j4 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                rs0.b("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j4;
        }
        Matcher matcher = f33067a.matcher(str2);
        if (!matcher.matches()) {
            return j4;
        }
        try {
            String strGroup = matcher.group(2);
            strGroup.getClass();
            long j10 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            strGroup2.getClass();
            long j11 = (j10 - Long.parseLong(strGroup2)) + 1;
            if (j4 < 0) {
                return j11;
            }
            if (j4 == j11) {
                return j4;
            }
            rs0.d("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j4, j11);
        } catch (NumberFormatException unused2) {
            rs0.b("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j4;
        }
    }

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f33068b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }
}

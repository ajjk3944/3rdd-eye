package com.yandex.mobile.ads.impl;

import N7.C1154e9;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class qw0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f32367b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f32368c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f32369d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final String f32370a;

    public static final class a {
        public static qw0 a(String str) {
            kotlin.jvm.internal.l.f(str, "<this>");
            Matcher matcher = qw0.f32367b.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(C1154e9.i("No subtype found for: \"", str, "\"").toString());
            }
            String strGroup = matcher.group(1);
            kotlin.jvm.internal.l.e(strGroup, "group(...)");
            Locale US = Locale.US;
            kotlin.jvm.internal.l.e(US, "US");
            kotlin.jvm.internal.l.e(strGroup.toLowerCase(US), "toLowerCase(...)");
            String strGroup2 = matcher.group(2);
            kotlin.jvm.internal.l.e(strGroup2, "group(...)");
            kotlin.jvm.internal.l.e(strGroup2.toLowerCase(US), "toLowerCase(...)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = qw0.f32368c.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    String strSubstring = str.substring(iEnd);
                    kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
                    StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    throw new IllegalArgumentException(B4.f.c(sb, str, "\"").toString());
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
                        kotlin.jvm.internal.l.e(strGroup4, "substring(...)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new qw0(str, (String[]) arrayList.toArray(new String[0]));
        }
    }

    private qw0(String str) {
        this.f32370a = str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qw0) && kotlin.jvm.internal.l.b(((qw0) obj).f32370a, this.f32370a);
    }

    public final int hashCode() {
        return this.f32370a.hashCode();
    }

    public final String toString() {
        return this.f32370a;
    }

    public /* synthetic */ qw0(String str, String[] strArr) {
        this(str);
    }
}

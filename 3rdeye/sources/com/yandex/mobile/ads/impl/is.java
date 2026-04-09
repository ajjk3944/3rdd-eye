package com.yandex.mobile.ads.impl;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes3.dex */
public final class is {

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f28847j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f28848k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f28849l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f28850m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f28851n = 0;

    /* renamed from: a, reason: collision with root package name */
    private final String f28852a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28853b;

    /* renamed from: c, reason: collision with root package name */
    private final long f28854c;

    /* renamed from: d, reason: collision with root package name */
    private final String f28855d;

    /* renamed from: e, reason: collision with root package name */
    private final String f28856e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f28857f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f28858g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f28859h;
    private final boolean i;

    public static final class a {
        private static int a(int i, int i10, String str, boolean z10) {
            while (i < i10) {
                char cCharAt = str.charAt(i);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                    return i;
                }
                i++;
            }
            return i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:126:0x0272  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x027c A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:150:0x01ba A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.util.List a(com.yandex.mobile.ads.impl.rh0 r37, com.yandex.mobile.ads.impl.kf0 r38) {
            /*
                Method dump skipped, instructions count: 658
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.is.a.a(com.yandex.mobile.ads.impl.rh0, com.yandex.mobile.ads.impl.kf0):java.util.List");
        }

        private static long a(int i, String str) throws NumberFormatException {
            int iA = a(0, i, str, false);
            Matcher matcher = is.f28850m.matcher(str);
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int iG0 = -1;
            int i13 = -1;
            int i14 = -1;
            while (iA < i) {
                int iA2 = a(iA + 1, i, str, true);
                matcher.region(iA, iA2);
                if (i11 != -1 || !matcher.usePattern(is.f28850m).matches()) {
                    if (i12 != -1 || !matcher.usePattern(is.f28849l).matches()) {
                        if (iG0 != -1 || !matcher.usePattern(is.f28848k).matches()) {
                            if (i10 == -1 && matcher.usePattern(is.f28847j).matches()) {
                                String strGroup = matcher.group(1);
                                kotlin.jvm.internal.l.e(strGroup, "group(...)");
                                i10 = Integer.parseInt(strGroup);
                            }
                        } else {
                            String strGroup2 = matcher.group(1);
                            kotlin.jvm.internal.l.e(strGroup2, "group(...)");
                            Locale US = Locale.US;
                            kotlin.jvm.internal.l.e(US, "US");
                            String lowerCase = strGroup2.toLowerCase(US);
                            kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
                            String strPattern = is.f28848k.pattern();
                            kotlin.jvm.internal.l.e(strPattern, "pattern(...)");
                            iG0 = y9.q.g0(strPattern, lowerCase, 0, false, 6) / 4;
                        }
                    } else {
                        String strGroup3 = matcher.group(1);
                        kotlin.jvm.internal.l.e(strGroup3, "group(...)");
                        i12 = Integer.parseInt(strGroup3);
                    }
                } else {
                    String strGroup4 = matcher.group(1);
                    kotlin.jvm.internal.l.e(strGroup4, "group(...)");
                    i11 = Integer.parseInt(strGroup4);
                    String strGroup5 = matcher.group(2);
                    kotlin.jvm.internal.l.e(strGroup5, "group(...)");
                    i13 = Integer.parseInt(strGroup5);
                    String strGroup6 = matcher.group(3);
                    kotlin.jvm.internal.l.e(strGroup6, "group(...)");
                    i14 = Integer.parseInt(strGroup6);
                }
                iA = a(iA2 + 1, i, str, false);
            }
            if (70 <= i10 && i10 < 100) {
                i10 += 1900;
            }
            if (i10 >= 0 && i10 < 70) {
                i10 += 2000;
            }
            if (i10 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iG0 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i12 || i12 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i11 < 0 || i11 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i14 >= 0 && i14 < 60) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(t82.f33483d);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, i10);
                gregorianCalendar.set(2, iG0 - 1);
                gregorianCalendar.set(5, i12);
                gregorianCalendar.set(11, i11);
                gregorianCalendar.set(12, i13);
                gregorianCalendar.set(13, i14);
                gregorianCalendar.set(14, 0);
                return gregorianCalendar.getTimeInMillis();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private is(String str, String str2, long j4, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f28852a = str;
        this.f28853b = str2;
        this.f28854c = j4;
        this.f28855d = str3;
        this.f28856e = str4;
        this.f28857f = z10;
        this.f28858g = z11;
        this.f28859h = z12;
        this.i = z13;
    }

    public final String e() {
        return this.f28852a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof is)) {
            return false;
        }
        is isVar = (is) obj;
        return kotlin.jvm.internal.l.b(isVar.f28852a, this.f28852a) && kotlin.jvm.internal.l.b(isVar.f28853b, this.f28853b) && isVar.f28854c == this.f28854c && kotlin.jvm.internal.l.b(isVar.f28855d, this.f28855d) && kotlin.jvm.internal.l.b(isVar.f28856e, this.f28856e) && isVar.f28857f == this.f28857f && isVar.f28858g == this.f28858g && isVar.f28859h == this.f28859h && isVar.i == this.i;
    }

    public final String f() {
        return this.f28853b;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        int iA = C4121h3.a(this.f28853b, C4121h3.a(this.f28852a, 527, 31), 31);
        long j4 = this.f28854c;
        return (this.i ? 1231 : 1237) + m6.a(this.f28859h, m6.a(this.f28858g, m6.a(this.f28857f, C4121h3.a(this.f28856e, C4121h3.a(this.f28855d, (((int) (j4 ^ (j4 >>> 32))) + iA) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28852a);
        sb.append('=');
        sb.append(this.f28853b);
        if (this.f28859h) {
            if (this.f28854c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(vv.a(new Date(this.f28854c)));
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.f28855d);
        }
        sb.append("; path=");
        sb.append(this.f28856e);
        if (this.f28857f) {
            sb.append("; secure");
        }
        if (this.f28858g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        return string;
    }

    public /* synthetic */ is(String str, String str2, long j4, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, int i) {
        this(str, str2, j4, str3, str4, z10, z11, z12, z13);
    }
}

package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class z22 extends jy1 {

    /* renamed from: o, reason: collision with root package name */
    private static final Pattern f36151o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f36152p = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: m, reason: collision with root package name */
    private final StringBuilder f36153m = new StringBuilder();

    /* renamed from: n, reason: collision with root package name */
    private final ArrayList<String> f36154n = new ArrayList<>();

    private static long a(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j4 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j10 = (Long.parseLong(strGroup2) * 60000) + j4;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j11 = (Long.parseLong(strGroup3) * 1000) + j10;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j11 += Long.parseLong(strGroup4);
        }
        return j11 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0274, code lost:
    
        return new com.yandex.mobile.ads.impl.a32((com.yandex.mobile.ads.impl.av[]) r2.toArray(new com.yandex.mobile.ads.impl.av[r4]), r3.b());
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015f  */
    @Override // com.yandex.mobile.ads.impl.jy1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.b32 a(byte[] r21, int r22, boolean r23) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.z22.a(byte[], int, boolean):com.yandex.mobile.ads.impl.b32");
    }
}

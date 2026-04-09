package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i7 implements s6 {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f12158d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f12159e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f12160a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12161b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final sk0 f12162c = new sk0();

    public static long a(Matcher matcher, int i4) {
        String strGroup = matcher.group(i4 + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i4 + 2);
        strGroup2.getClass();
        long j8 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i4 + 3);
        strGroup3.getClass();
        long j9 = (Long.parseLong(strGroup3) * 1000) + j8;
        String strGroup4 = matcher.group(i4 + 4);
        if (strGroup4 != null) {
            j9 += Long.parseLong(strGroup4);
        }
        return j9 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0177  */
    @Override // com.google.android.gms.internal.ads.s6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(byte[] r30, int r31, int r32, ca.c r33) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i7.d(byte[], int, int, ca.c):void");
    }
}

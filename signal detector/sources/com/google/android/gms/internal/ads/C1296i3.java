package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.i3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1296i3 implements S2 {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f14654d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f14655e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f14656a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f14657b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final C2036vr f14658c = new C2036vr();

    public static long a(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j6 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j7 = (Long.parseLong(strGroup2) * 60000) + j6;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j8 = (Long.parseLong(strGroup3) * 1000) + j7;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j8 += Long.parseLong(strGroup4);
        }
        return j8 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0198  */
    @Override // com.google.android.gms.internal.ads.S2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(byte[] r31, int r32, int r33, com.google.android.gms.internal.ads.T2 r34) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1296i3.h(byte[], int, int, com.google.android.gms.internal.ads.T2):void");
    }
}

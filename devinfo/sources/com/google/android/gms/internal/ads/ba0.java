package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class ba0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f9638a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f9639b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f9640c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i4, boolean z3, int i10, int i11, int[] iArr, int i12) {
        Object[] objArr = {f9639b[i4], Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(true != z3 ? 'L' : 'H'), Integer.valueOf(i12)};
        String str = bq0.f9768a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i13 = 6;
        while (i13 > 0) {
            int i14 = i13 - 1;
            if (iArr[i14] != 0) {
                break;
            }
            i13 = i14;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb2.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x03fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair b(com.google.android.gms.internal.ads.mx1 r27) {
        /*
            Method dump skipped, instructions count: 2066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ba0.b(com.google.android.gms.internal.ads.mx1):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair c(java.lang.String r8, java.lang.String[] r9, com.google.android.gms.internal.ads.sm1 r10) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ba0.c(java.lang.String, java.lang.String[], com.google.android.gms.internal.ads.sm1):android.util.Pair");
    }
}

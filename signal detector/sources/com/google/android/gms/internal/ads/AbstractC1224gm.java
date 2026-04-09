package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.gm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1224gm {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f14369a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f14370b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f14371c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i, boolean z6, int i3, int i6, int[] iArr, int i7) {
        Object[] objArr = {f14370b[i], Integer.valueOf(i3), Integer.valueOf(i6), Character.valueOf(true != z6 ? 'L' : 'H'), Integer.valueOf(i7)};
        String str = Vt.f12096a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i8 = 6;
        while (i8 > 0) {
            int i9 = i8 - 1;
            if (iArr[i9] != 0) {
                break;
            }
            i8 = i9;
        }
        for (int i10 = 0; i10 < i8; i10++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i10])));
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair b(com.google.android.gms.internal.ads.TP r27) {
        /*
            Method dump skipped, instructions count: 2140
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1224gm.b(com.google.android.gms.internal.ads.TP):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair c(java.lang.String r10, java.lang.String[] r11, com.google.android.gms.internal.ads.HK r12) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1224gm.c(java.lang.String, java.lang.String[], com.google.android.gms.internal.ads.HK):android.util.Pair");
    }
}

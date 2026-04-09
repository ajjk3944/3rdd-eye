package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.StatFs;

/* loaded from: classes3.dex */
public final class xz0 {

    public static final class a {
        public static long a(Context context, long j4, long j10) {
            long availableBlocks;
            kotlin.jvm.internal.l.f(context, "context");
            if (j4 > j10) {
                j4 = j10;
            }
            try {
                StatFs statFs = new StatFs(m10.a(context, "").getAbsolutePath());
                availableBlocks = statFs.getAvailableBlocks() * statFs.getBlockSize();
            } catch (IllegalArgumentException unused) {
                fp0.c(new Object[0]);
                availableBlocks = j4;
            }
            long j11 = 100;
            long j12 = (2 * availableBlocks) / j11;
            long j13 = (availableBlocks * 50) / j11;
            if (j4 > j13) {
                j4 = j13;
            }
            if (j12 <= j10) {
                j10 = j12;
            }
            return j10 < j4 ? j4 : j10;
        }
    }

    public static long a() {
        Runtime runtime = Runtime.getRuntime();
        return Runtime.getRuntime().maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
    }
}

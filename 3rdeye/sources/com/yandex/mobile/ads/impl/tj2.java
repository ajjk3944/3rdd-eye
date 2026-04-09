package com.yandex.mobile.ads.impl;

import android.util.Pair;
import java.util.Map;

/* loaded from: classes3.dex */
public final class tj2 {
    public static Pair<Long, Long> a(b40 b40Var) {
        String str;
        Map<String, String> mapQueryKeyStatus = b40Var.queryKeyStatus();
        if (mapQueryKeyStatus == null) {
            return null;
        }
        long j4 = -9223372036854775807L;
        try {
            str = mapQueryKeyStatus.get("LicenseDurationRemaining");
        } catch (NumberFormatException unused) {
        }
        long j10 = str != null ? Long.parseLong(str) : -9223372036854775807L;
        Long lValueOf = Long.valueOf(j10);
        try {
            String str2 = mapQueryKeyStatus.get("PlaybackDurationRemaining");
            if (str2 != null) {
                j4 = Long.parseLong(str2);
            }
        } catch (NumberFormatException unused2) {
        }
        return new Pair<>(lValueOf, Long.valueOf(j4));
    }
}

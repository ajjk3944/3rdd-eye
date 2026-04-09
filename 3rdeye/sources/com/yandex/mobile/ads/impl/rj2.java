package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class rj2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f32673a = 0;

    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static long a(String str) throws NumberFormatException {
        int i = s82.f32899a;
        String[] strArrSplit = str.split("\\.", 2);
        long j4 = 0;
        for (String str2 : strArrSplit[0].split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)) {
            j4 = (j4 * 60) + Long.parseLong(str2);
        }
        long j10 = j4 * 1000;
        if (strArrSplit.length == 2) {
            j10 += Long.parseLong(strArrSplit[1]);
        }
        return j10 * 1000;
    }
}

package io.appmetrica.analytics.logger.common.impl;

import g0.C4356c;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f42301a = Pattern.compile("[\\p{Space},;]");

    public static int a(Matcher matcher, int i, int i10) {
        if (i10 >= i) {
            int iC = C4356c.c(i10, i, 2, i);
            matcher.region(iC, i10);
            if (matcher.find()) {
                int iStart = matcher.start();
                int iA = a(matcher, iStart + 1, i10);
                return iA == -1 ? iStart : iA;
            }
            matcher.region(i, iC);
            if (matcher.find()) {
                int iStart2 = matcher.start();
                int iA2 = a(matcher, iStart2 + 1, iC);
                return iA2 == -1 ? iStart2 : iA2;
            }
        }
        return -1;
    }
}

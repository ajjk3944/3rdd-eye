package io.sentry;

import java.util.Locale;

/* loaded from: classes.dex */
public enum f2 implements g2 {
    NANOSECOND,
    MICROSECOND,
    MILLISECOND,
    SECOND,
    MINUTE,
    HOUR,
    DAY,
    WEEK;

    @Override // io.sentry.g2
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}

package io.sentry;

import java.util.Locale;

/* loaded from: classes.dex */
public enum e4 {
    STRING,
    BOOLEAN,
    INTEGER,
    DOUBLE;

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}

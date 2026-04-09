package io.sentry;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public enum b5 implements c2 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    @Override // io.sentry.c2
    public void serialize(y2 y2Var, u0 u0Var) throws IOException {
        ((i4.b) y2Var).V(name().toLowerCase(Locale.ROOT));
    }
}

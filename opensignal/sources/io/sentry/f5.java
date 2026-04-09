package io.sentry;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public enum f5 implements c2 {
    TRACE(1),
    DEBUG(5),
    INFO(9),
    WARN(13),
    ERROR(17),
    FATAL(21);

    private final int severityNumber;

    f5(int i10) {
        this.severityNumber = i10;
    }

    public int getSeverityNumber() {
        return this.severityNumber;
    }

    @Override // io.sentry.c2
    public void serialize(y2 y2Var, u0 u0Var) throws IOException {
        ((i4.b) y2Var).V(name().toLowerCase(Locale.ROOT));
    }
}

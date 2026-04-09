package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public enum e implements c2 {
    PORTRAIT,
    LANDSCAPE;

    @Override // io.sentry.c2
    public void serialize(y2 y2Var, u0 u0Var) throws IOException {
        ((i4.b) y2Var).V(toString().toLowerCase(Locale.ROOT));
    }
}

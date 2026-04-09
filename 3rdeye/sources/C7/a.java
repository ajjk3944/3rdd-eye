package C7;

import kotlin.jvm.internal.l;

/* compiled from: Severity.kt */
/* loaded from: classes.dex */
public enum a {
    ERROR,
    WARNING,
    INFO,
    DEBUG,
    VERBOSE;

    public final boolean isAtLeast(a minLevel) {
        l.f(minLevel, "minLevel");
        return ordinal() >= minLevel.ordinal();
    }
}

package defpackage;

import java.util.Locale;
import java.util.Optional;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kp1 extends Exception {
    public kp1(jp1 jp1Var, Exception exc) {
        super(String.format(Locale.US, up1.a("bk0="), Long.valueOf(jp1Var.f)), exc);
        Optional.empty();
        Optional.empty();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public kp1(jp1 jp1Var, ip1 ip1Var, long j) {
        Locale locale = Locale.US;
        Long lValueOf = Long.valueOf(j);
        super(String.format(locale, up1.a("bk3t6gFTc30="), Long.valueOf(jp1Var.f), Long.valueOf(ip1Var.f), lValueOf));
        Optional.of(ip1Var);
        Optional.of(lValueOf);
    }
}

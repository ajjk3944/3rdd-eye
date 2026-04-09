package com.google.android.gms.internal.ads;

import j$.util.Optional;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.c5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0971c5 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public C0971c5(EnumC0917b5 enumC0917b5, EnumC0862a5 enumC0862a5, long j6) {
        Locale locale = Locale.US;
        Long lValueOf = Long.valueOf(j6);
        super(String.format(locale, AbstractC1404k5.a("bk3t6gFTc30="), Long.valueOf(enumC0917b5.f13311a), Long.valueOf(enumC0862a5.f13068a), lValueOf));
        Optional.of(enumC0862a5);
        Optional.of(lValueOf);
    }

    public C0971c5(EnumC0917b5 enumC0917b5, Exception exc) {
        super(String.format(Locale.US, AbstractC1404k5.a("bk0="), Long.valueOf(enumC0917b5.f13311a)), exc);
        Optional.empty();
        Optional.empty();
    }
}

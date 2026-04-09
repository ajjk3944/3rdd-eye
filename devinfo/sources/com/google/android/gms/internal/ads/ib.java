package com.google.android.gms.internal.ads;

import j$.util.Optional;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ib extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public ib(hb hbVar, gb gbVar, long j) {
        Locale locale = Locale.US;
        Long lValueOf = Long.valueOf(j);
        super(String.format(locale, qb.a("bk3t6gFTc30="), Long.valueOf(hbVar.f11809a), Long.valueOf(gbVar.f11474a), lValueOf));
        Optional.of(gbVar);
        Optional.of(lValueOf);
    }

    public ib(hb hbVar, Exception exc) {
        super(String.format(Locale.US, qb.a("bk0="), Long.valueOf(hbVar.f11809a)), exc);
        Optional.empty();
        Optional.empty();
    }
}

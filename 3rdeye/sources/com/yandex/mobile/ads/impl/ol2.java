package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;

/* loaded from: classes3.dex */
public final class ol2 implements InstreamAdBreak {

    /* renamed from: a, reason: collision with root package name */
    private final zs f31422a;

    /* renamed from: b, reason: collision with root package name */
    private final ql2 f31423b;

    public /* synthetic */ ol2(zs zsVar) {
        this(zsVar, new ql2());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ol2) && kotlin.jvm.internal.l.b(((ol2) obj).f31422a, this.f31422a);
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreak
    public final InstreamAdBreakPosition getAdBreakPosition() {
        InstreamAdBreakPosition.Type type;
        ql2 ql2Var = this.f31423b;
        at corePosition = this.f31422a.b();
        ql2Var.getClass();
        kotlin.jvm.internal.l.f(corePosition, "corePosition");
        int iOrdinal = corePosition.a().ordinal();
        if (iOrdinal == 0) {
            type = InstreamAdBreakPosition.Type.PERCENTS;
        } else if (iOrdinal == 1) {
            type = InstreamAdBreakPosition.Type.MILLISECONDS;
        } else {
            if (iOrdinal != 2) {
                throw new b9.j();
            }
            type = InstreamAdBreakPosition.Type.POSITION;
        }
        return new InstreamAdBreakPosition(type, corePosition.b());
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreak
    public final String getType() {
        return this.f31422a.e();
    }

    public final int hashCode() {
        return this.f31422a.hashCode();
    }

    public ol2(zs adBreak, ql2 adBreakPositionAdapter) {
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        kotlin.jvm.internal.l.f(adBreakPositionAdapter, "adBreakPositionAdapter");
        this.f31422a = adBreak;
        this.f31423b = adBreakPositionAdapter;
    }
}

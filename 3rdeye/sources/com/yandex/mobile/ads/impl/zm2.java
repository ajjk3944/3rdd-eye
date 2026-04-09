package com.yandex.mobile.ads.impl;

import b9.InterfaceC1997d;

/* loaded from: classes3.dex */
final /* synthetic */ class zm2 implements la2, kotlin.jvm.internal.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ an2 f36552a;

    public zm2(an2 an2Var) {
        this.f36552a = an2Var;
    }

    @Override // com.yandex.mobile.ads.impl.la2
    public final void a(ka2 p02) {
        kotlin.jvm.internal.l.f(p02, "p0");
        an2.a(this.f36552a, p02);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof la2) && (obj instanceof kotlin.jvm.internal.h)) {
            return kotlin.jvm.internal.l.b(getFunctionDelegate(), ((kotlin.jvm.internal.h) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.h
    public final InterfaceC1997d<?> getFunctionDelegate() {
        return new kotlin.jvm.internal.k(1, this.f36552a, an2.class, "trackVerificationNotExecuted", "trackVerificationNotExecuted(Lcom/yandex/mobile/ads/video/playback/tracker/verification/omsdk/error/VerificationNotExecutedException;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}

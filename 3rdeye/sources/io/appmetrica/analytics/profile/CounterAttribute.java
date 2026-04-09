package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C4708j6;
import io.appmetrica.analytics.impl.Jb;
import io.appmetrica.analytics.impl.L6;
import io.appmetrica.analytics.impl.Yn;
import io.appmetrica.analytics.impl.Zb;

/* loaded from: classes3.dex */
public final class CounterAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final L6 f42464a;

    public CounterAttribute(String str, Jb jb, Zb zb) {
        this.f42464a = new L6(str, jb, zb);
    }

    public UserProfileUpdate<? extends Yn> withDelta(double d10) {
        return new UserProfileUpdate<>(new C4708j6(this.f42464a.f39744c, d10));
    }
}

package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C4949se;
import io.appmetrica.analytics.impl.H4;
import io.appmetrica.analytics.impl.Jb;
import io.appmetrica.analytics.impl.L6;
import io.appmetrica.analytics.impl.Li;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.Vk;
import io.appmetrica.analytics.impl.Yn;
import io.appmetrica.analytics.impl.Zb;

/* loaded from: classes3.dex */
public final class NumberAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final L6 f42468a;

    public NumberAttribute(String str, Jb jb, Zb zb) {
        this.f42468a = new L6(str, jb, zb);
    }

    public UserProfileUpdate<? extends Yn> withValue(double d10) {
        return new UserProfileUpdate<>(new C4949se(this.f42468a.f39744c, d10, new Jb(), new N4(new Zb(new H4(100)))));
    }

    public UserProfileUpdate<? extends Yn> withValueIfUndefined(double d10) {
        return new UserProfileUpdate<>(new C4949se(this.f42468a.f39744c, d10, new Jb(), new Vk(new Zb(new H4(100)))));
    }

    public UserProfileUpdate<? extends Yn> withValueReset() {
        return new UserProfileUpdate<>(new Li(1, this.f42468a.f39744c, new Jb(), new Zb(new H4(100))));
    }
}

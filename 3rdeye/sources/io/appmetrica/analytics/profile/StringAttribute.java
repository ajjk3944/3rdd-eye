package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.Fn;
import io.appmetrica.analytics.impl.InterfaceC4804mo;
import io.appmetrica.analytics.impl.InterfaceC4860p2;
import io.appmetrica.analytics.impl.L6;
import io.appmetrica.analytics.impl.Li;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.Tm;
import io.appmetrica.analytics.impl.Um;
import io.appmetrica.analytics.impl.Vk;
import io.appmetrica.analytics.impl.Yn;

/* loaded from: classes3.dex */
public class StringAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final Fn f42469a;

    /* renamed from: b, reason: collision with root package name */
    private final L6 f42470b;

    public StringAttribute(String str, Tm tm, InterfaceC4804mo interfaceC4804mo, InterfaceC4860p2 interfaceC4860p2) {
        this.f42470b = new L6(str, interfaceC4804mo, interfaceC4860p2);
        this.f42469a = tm;
    }

    public UserProfileUpdate<? extends Yn> withValue(String str) {
        L6 l62 = this.f42470b;
        return new UserProfileUpdate<>(new Um(l62.f39744c, str, this.f42469a, l62.f39742a, new N4(l62.f39743b)));
    }

    public UserProfileUpdate<? extends Yn> withValueIfUndefined(String str) {
        L6 l62 = this.f42470b;
        return new UserProfileUpdate<>(new Um(l62.f39744c, str, this.f42469a, l62.f39742a, new Vk(l62.f39743b)));
    }

    public UserProfileUpdate<? extends Yn> withValueReset() {
        L6 l62 = this.f42470b;
        return new UserProfileUpdate<>(new Li(0, l62.f39744c, l62.f39742a, l62.f39743b));
    }
}

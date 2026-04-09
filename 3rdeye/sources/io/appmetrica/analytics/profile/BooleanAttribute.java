package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C4964t3;
import io.appmetrica.analytics.impl.InterfaceC4804mo;
import io.appmetrica.analytics.impl.InterfaceC4860p2;
import io.appmetrica.analytics.impl.L6;
import io.appmetrica.analytics.impl.Li;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.Vk;
import io.appmetrica.analytics.impl.Yn;

/* loaded from: classes3.dex */
public class BooleanAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final L6 f42463a;

    public BooleanAttribute(String str, InterfaceC4804mo interfaceC4804mo, InterfaceC4860p2 interfaceC4860p2) {
        this.f42463a = new L6(str, interfaceC4804mo, interfaceC4860p2);
    }

    public UserProfileUpdate<? extends Yn> withValue(boolean z10) {
        L6 l62 = this.f42463a;
        return new UserProfileUpdate<>(new C4964t3(l62.f39744c, z10, l62.f39742a, new N4(l62.f39743b)));
    }

    public UserProfileUpdate<? extends Yn> withValueIfUndefined(boolean z10) {
        L6 l62 = this.f42463a;
        return new UserProfileUpdate<>(new C4964t3(l62.f39744c, z10, l62.f39742a, new Vk(l62.f39743b)));
    }

    public UserProfileUpdate<? extends Yn> withValueReset() {
        L6 l62 = this.f42463a;
        return new UserProfileUpdate<>(new Li(3, l62.f39744c, l62.f39742a, l62.f39743b));
    }
}

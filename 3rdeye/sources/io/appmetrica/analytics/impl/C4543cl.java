package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.cl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4543cl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final C4799mj f40635a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4943s8 f40636b;

    public C4543cl(ECommerceScreen eCommerceScreen) {
        this(new C4799mj(eCommerceScreen), new C4569dl());
    }

    public final InterfaceC4943s8 a() {
        return this.f40636b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Vf
    public final List<Ni> toProto() {
        return (List) this.f40636b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f40635a + ", converter=" + this.f40636b + '}';
    }

    public C4543cl(C4799mj c4799mj, InterfaceC4943s8 interfaceC4943s8) {
        this.f40635a = c4799mj;
        this.f40636b = interfaceC4943s8;
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* loaded from: classes3.dex */
public final class Yk extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final Sf f40432a;

    /* renamed from: b, reason: collision with root package name */
    public final C4799mj f40433b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4943s8 f40434c;

    public Yk(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        this(new Sf(eCommerceProduct), new C4799mj(eCommerceScreen), new Zk());
    }

    public final InterfaceC4943s8 a() {
        return this.f40434c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Vf
    public final List<Ni> toProto() {
        return (List) this.f40434c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f40432a + ", screen=" + this.f40433b + ", converter=" + this.f40434c + '}';
    }

    public Yk(Sf sf, C4799mj c4799mj, InterfaceC4943s8 interfaceC4943s8) {
        this.f40432a = sf;
        this.f40433b = c4799mj;
        this.f40434c = interfaceC4943s8;
    }
}

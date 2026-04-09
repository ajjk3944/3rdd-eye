package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.al, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4491al extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final Sf f40527a;

    /* renamed from: b, reason: collision with root package name */
    public final Ig f40528b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4943s8 f40529c;

    public C4491al(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        this(new Sf(eCommerceProduct), eCommerceReferrer == null ? null : new Ig(eCommerceReferrer), new C4517bl());
    }

    public final InterfaceC4943s8 a() {
        return this.f40529c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Vf
    public final List<Ni> toProto() {
        return (List) this.f40529c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f40527a + ", referrer=" + this.f40528b + ", converter=" + this.f40529c + '}';
    }

    public C4491al(Sf sf, Ig ig, InterfaceC4943s8 interfaceC4943s8) {
        this.f40527a = sf;
        this.f40528b = ig;
        this.f40529c = interfaceC4943s8;
    }
}

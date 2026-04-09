package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* loaded from: classes3.dex */
public final class D3 extends ECommerceEvent {

    /* renamed from: d, reason: collision with root package name */
    public static final int f39279d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f39280e = 5;

    /* renamed from: a, reason: collision with root package name */
    public final int f39281a;

    /* renamed from: b, reason: collision with root package name */
    public final G3 f39282b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4943s8 f39283c;

    public D3(int i, ECommerceCartItem eCommerceCartItem) {
        this(i, new G3(eCommerceCartItem), new E3());
    }

    public final InterfaceC4943s8 a() {
        return this.f39283c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        int i = this.f39281a;
        return i != 4 ? i != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Vf
    public final List<Ni> toProto() {
        return (List) this.f39283c.fromModel(this);
    }

    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.f39281a + ", cartItem=" + this.f39282b + ", converter=" + this.f39283c + '}';
    }

    public D3(int i, G3 g32, InterfaceC4943s8 interfaceC4943s8) {
        this.f39281a = i;
        this.f39282b = g32;
        this.f39283c = interfaceC4943s8;
    }
}

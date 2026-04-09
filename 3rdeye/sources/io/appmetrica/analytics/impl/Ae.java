package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* loaded from: classes3.dex */
public final class Ae extends ECommerceEvent {

    /* renamed from: d, reason: collision with root package name */
    public static final int f39103d = 6;

    /* renamed from: e, reason: collision with root package name */
    public static final int f39104e = 7;

    /* renamed from: a, reason: collision with root package name */
    public final int f39105a;

    /* renamed from: b, reason: collision with root package name */
    public final Ce f39106b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4943s8 f39107c;

    public Ae(int i, ECommerceOrder eCommerceOrder) {
        this(i, new Ce(eCommerceOrder), new Be());
    }

    public final InterfaceC4943s8 a() {
        return this.f39107c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Vf
    public final List<Ni> toProto() {
        return (List) this.f39107c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.f39105a + ", order=" + this.f39106b + ", converter=" + this.f39107c + '}';
    }

    public Ae(int i, Ce ce, InterfaceC4943s8 interfaceC4943s8) {
        this.f39105a = i;
        this.f39106b = ce;
        this.f39107c = interfaceC4943s8;
    }
}

package io.appmetrica.analytics.ecommerce;

import java.util.List;

/* loaded from: classes3.dex */
public class ECommercePrice {

    /* renamed from: a, reason: collision with root package name */
    private final ECommerceAmount f39020a;

    /* renamed from: b, reason: collision with root package name */
    private List f39021b;

    public ECommercePrice(ECommerceAmount eCommerceAmount) {
        this.f39020a = eCommerceAmount;
    }

    public ECommerceAmount getFiat() {
        return this.f39020a;
    }

    public List<ECommerceAmount> getInternalComponents() {
        return this.f39021b;
    }

    public ECommercePrice setInternalComponents(List<ECommerceAmount> list) {
        this.f39021b = list;
        return this;
    }

    public String toString() {
        return "ECommercePrice{fiat=" + this.f39020a + ", internalComponents=" + this.f39021b + '}';
    }
}

package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ECommerceOrder {

    /* renamed from: a, reason: collision with root package name */
    private final String f39017a;

    /* renamed from: b, reason: collision with root package name */
    private final List f39018b;

    /* renamed from: c, reason: collision with root package name */
    private Map f39019c;

    public ECommerceOrder(String str, List<ECommerceCartItem> list) {
        this.f39017a = str;
        this.f39018b = list;
    }

    public List<ECommerceCartItem> getCartItems() {
        return this.f39018b;
    }

    public String getIdentifier() {
        return this.f39017a;
    }

    public Map<String, String> getPayload() {
        return this.f39019c;
    }

    public ECommerceOrder setPayload(Map<String, String> map) {
        this.f39019c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f39017a + "', cartItems=" + this.f39018b + ", payload=" + this.f39019c + '}';
    }
}

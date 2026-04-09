package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public final class G3 {

    /* renamed from: a, reason: collision with root package name */
    public final Sf f39471a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f39472b;

    /* renamed from: c, reason: collision with root package name */
    public final Lf f39473c;

    /* renamed from: d, reason: collision with root package name */
    public final Ig f39474d;

    public G3(ECommerceCartItem eCommerceCartItem) {
        this(new Sf(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new Lf(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new Ig(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f39471a + ", quantity=" + this.f39472b + ", revenue=" + this.f39473c + ", referrer=" + this.f39474d + '}';
    }

    public G3(Sf sf, BigDecimal bigDecimal, Lf lf, Ig ig) {
        this.f39471a = sf;
        this.f39472b = bigDecimal;
        this.f39473c = lf;
        this.f39474d = ig;
    }
}

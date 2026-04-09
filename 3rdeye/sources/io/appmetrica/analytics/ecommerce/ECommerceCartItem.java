package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.AbstractC4623fo;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public class ECommerceCartItem {

    /* renamed from: a, reason: collision with root package name */
    private final ECommerceProduct f39013a;

    /* renamed from: b, reason: collision with root package name */
    private final BigDecimal f39014b;

    /* renamed from: c, reason: collision with root package name */
    private final ECommercePrice f39015c;

    /* renamed from: d, reason: collision with root package name */
    private ECommerceReferrer f39016d;

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, long j4) {
        this(eCommerceProduct, eCommercePrice, AbstractC4623fo.a(j4));
    }

    public ECommerceProduct getProduct() {
        return this.f39013a;
    }

    public BigDecimal getQuantity() {
        return this.f39014b;
    }

    public ECommerceReferrer getReferrer() {
        return this.f39016d;
    }

    public ECommercePrice getRevenue() {
        return this.f39015c;
    }

    public ECommerceCartItem setReferrer(ECommerceReferrer eCommerceReferrer) {
        this.f39016d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f39013a + ", quantity=" + this.f39014b + ", revenue=" + this.f39015c + ", referrer=" + this.f39016d + '}';
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, double d10) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(AbstractC4623fo.a(d10)));
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, BigDecimal bigDecimal) {
        this.f39013a = eCommerceProduct;
        this.f39014b = bigDecimal;
        this.f39015c = eCommercePrice;
    }
}

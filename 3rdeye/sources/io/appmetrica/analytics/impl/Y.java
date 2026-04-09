package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final BigDecimal f40401a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40402b;

    public Y(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AmountWrapper{amount=");
        sb.append(this.f40401a);
        sb.append(", unit='");
        return B4.f.c(sb, this.f40402b, "'}");
    }

    public Y(BigDecimal bigDecimal, String str) {
        this.f40401a = bigDecimal;
        this.f40402b = str;
    }
}

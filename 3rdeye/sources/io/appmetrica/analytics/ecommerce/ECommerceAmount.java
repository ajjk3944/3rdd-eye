package io.appmetrica.analytics.ecommerce;

import B4.f;
import io.appmetrica.analytics.impl.AbstractC4623fo;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public class ECommerceAmount {

    /* renamed from: a, reason: collision with root package name */
    private final BigDecimal f39011a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39012b;

    public ECommerceAmount(long j4, String str) {
        this(AbstractC4623fo.a(j4), str);
    }

    public BigDecimal getAmount() {
        return this.f39011a;
    }

    public String getUnit() {
        return this.f39012b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECommerceAmount{amount=");
        sb.append(this.f39011a);
        sb.append(", unit='");
        return f.c(sb, this.f39012b, "'}");
    }

    public ECommerceAmount(double d10, String str) {
        this(new BigDecimal(AbstractC4623fo.a(d10)), str);
    }

    public ECommerceAmount(BigDecimal bigDecimal, String str) {
        this.f39011a = bigDecimal;
        this.f39012b = str;
    }
}

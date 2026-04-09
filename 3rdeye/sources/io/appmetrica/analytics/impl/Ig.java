package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* loaded from: classes3.dex */
public final class Ig {

    /* renamed from: a, reason: collision with root package name */
    public final String f39635a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39636b;

    /* renamed from: c, reason: collision with root package name */
    public final C4799mj f39637c;

    public Ig(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C4799mj(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.f39635a + "', identifier='" + this.f39636b + "', screen=" + this.f39637c + '}';
    }

    public Ig(String str, String str2, C4799mj c4799mj) {
        this.f39635a = str;
        this.f39636b = str2;
        this.f39637c = c4799mj;
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Sf {

    /* renamed from: a, reason: collision with root package name */
    public final String f40110a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40111b;

    /* renamed from: c, reason: collision with root package name */
    public final List f40112c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f40113d;

    /* renamed from: e, reason: collision with root package name */
    public final Lf f40114e;

    /* renamed from: f, reason: collision with root package name */
    public final Lf f40115f;

    /* renamed from: g, reason: collision with root package name */
    public final List f40116g;

    public Sf(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new Lf(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() != null ? new Lf(eCommerceProduct.getOriginalPrice()) : null, CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
        return "ProductWrapper{sku='" + this.f40110a + "', name='" + this.f40111b + "', categoriesPath=" + this.f40112c + ", payload=" + this.f40113d + ", actualPrice=" + this.f40114e + ", originalPrice=" + this.f40115f + ", promocodes=" + this.f40116g + '}';
    }

    public Sf(String str, String str2, List list, Map map, Lf lf, Lf lf2, List list2) {
        this.f40110a = str;
        this.f40111b = str2;
        this.f40112c = list;
        this.f40113d = map;
        this.f40114e = lf;
        this.f40115f = lf2;
        this.f40116g = list2;
    }
}

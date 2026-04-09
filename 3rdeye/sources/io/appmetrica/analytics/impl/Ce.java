package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class Ce {

    /* renamed from: a, reason: collision with root package name */
    public final String f39256a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39257b;

    /* renamed from: c, reason: collision with root package name */
    public final List f39258c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f39259d;

    public Ce(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), a(eCommerceOrder.getCartItems()), CollectionUtils.mapCopyOfNullableMap(eCommerceOrder.getPayload()));
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new G3((ECommerceCartItem) it.next()));
        }
        return arrayList;
    }

    public final String toString() {
        return "OrderWrapper{uuid='" + this.f39256a + "', identifier='" + this.f39257b + "', cartItems=" + this.f39258c + ", payload=" + this.f39259d + '}';
    }

    public Ce(String str, String str2, ArrayList arrayList, Map map) {
        this.f39256a = str;
        this.f39257b = str2;
        this.f39258c = arrayList;
        this.f39259d = map;
    }
}

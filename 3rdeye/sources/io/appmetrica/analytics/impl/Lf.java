package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public final class Lf {

    /* renamed from: a, reason: collision with root package name */
    public final Y f39782a;

    /* renamed from: b, reason: collision with root package name */
    public final List f39783b;

    public Lf(ECommercePrice eCommercePrice) {
        this(new Y(eCommercePrice.getFiat()), a(eCommercePrice.getInternalComponents()));
    }

    public static LinkedList a(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ECommerceAmount eCommerceAmount = (ECommerceAmount) it.next();
            linkedList.add(new Y(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public final String toString() {
        return "PriceWrapper{fiat=" + this.f39782a + ", internalComponents=" + this.f39783b + '}';
    }

    public Lf(Y y10, LinkedList linkedList) {
        this.f39782a = y10;
        this.f39783b = linkedList;
    }
}

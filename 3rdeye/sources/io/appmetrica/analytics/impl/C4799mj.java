package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.mj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4799mj {

    /* renamed from: a, reason: collision with root package name */
    public final String f41265a;

    /* renamed from: b, reason: collision with root package name */
    public final List f41266b;

    /* renamed from: c, reason: collision with root package name */
    public final String f41267c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f41268d;

    public C4799mj(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.f41265a + "', categoriesPath=" + this.f41266b + ", searchQuery='" + this.f41267c + "', payload=" + this.f41268d + '}';
    }

    public C4799mj(String str, String str2, List list, Map map) {
        this.f41265a = str;
        this.f41266b = list;
        this.f41267c = str2;
        this.f41268d = map;
    }
}

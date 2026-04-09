package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ECommerceScreen {

    /* renamed from: a, reason: collision with root package name */
    private String f39032a;

    /* renamed from: b, reason: collision with root package name */
    private List f39033b;

    /* renamed from: c, reason: collision with root package name */
    private String f39034c;

    /* renamed from: d, reason: collision with root package name */
    private Map f39035d;

    public List<String> getCategoriesPath() {
        return this.f39033b;
    }

    public String getName() {
        return this.f39032a;
    }

    public Map<String, String> getPayload() {
        return this.f39035d;
    }

    public String getSearchQuery() {
        return this.f39034c;
    }

    public ECommerceScreen setCategoriesPath(List<String> list) {
        this.f39033b = list;
        return this;
    }

    public ECommerceScreen setName(String str) {
        this.f39032a = str;
        return this;
    }

    public ECommerceScreen setPayload(Map<String, String> map) {
        this.f39035d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(String str) {
        this.f39034c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f39032a + "', categoriesPath=" + this.f39033b + ", searchQuery='" + this.f39034c + "', payload=" + this.f39035d + '}';
    }
}

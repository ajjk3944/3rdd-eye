package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ECommerceProduct {

    /* renamed from: a, reason: collision with root package name */
    private final String f39022a;

    /* renamed from: b, reason: collision with root package name */
    private String f39023b;

    /* renamed from: c, reason: collision with root package name */
    private List f39024c;

    /* renamed from: d, reason: collision with root package name */
    private Map f39025d;

    /* renamed from: e, reason: collision with root package name */
    private ECommercePrice f39026e;

    /* renamed from: f, reason: collision with root package name */
    private ECommercePrice f39027f;

    /* renamed from: g, reason: collision with root package name */
    private List f39028g;

    public ECommerceProduct(String str) {
        this.f39022a = str;
    }

    public ECommercePrice getActualPrice() {
        return this.f39026e;
    }

    public List<String> getCategoriesPath() {
        return this.f39024c;
    }

    public String getName() {
        return this.f39023b;
    }

    public ECommercePrice getOriginalPrice() {
        return this.f39027f;
    }

    public Map<String, String> getPayload() {
        return this.f39025d;
    }

    public List<String> getPromocodes() {
        return this.f39028g;
    }

    public String getSku() {
        return this.f39022a;
    }

    public ECommerceProduct setActualPrice(ECommercePrice eCommercePrice) {
        this.f39026e = eCommercePrice;
        return this;
    }

    public ECommerceProduct setCategoriesPath(List<String> list) {
        this.f39024c = list;
        return this;
    }

    public ECommerceProduct setName(String str) {
        this.f39023b = str;
        return this;
    }

    public ECommerceProduct setOriginalPrice(ECommercePrice eCommercePrice) {
        this.f39027f = eCommercePrice;
        return this;
    }

    public ECommerceProduct setPayload(Map<String, String> map) {
        this.f39025d = map;
        return this;
    }

    public ECommerceProduct setPromocodes(List<String> list) {
        this.f39028g = list;
        return this;
    }

    public String toString() {
        return "ECommerceProduct{sku='" + this.f39022a + "', name='" + this.f39023b + "', categoriesPath=" + this.f39024c + ", payload=" + this.f39025d + ", actualPrice=" + this.f39026e + ", originalPrice=" + this.f39027f + ", promocodes=" + this.f39028g + '}';
    }
}

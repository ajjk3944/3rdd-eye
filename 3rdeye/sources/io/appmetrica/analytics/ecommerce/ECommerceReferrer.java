package io.appmetrica.analytics.ecommerce;

/* loaded from: classes3.dex */
public class ECommerceReferrer {

    /* renamed from: a, reason: collision with root package name */
    private String f39029a;

    /* renamed from: b, reason: collision with root package name */
    private String f39030b;

    /* renamed from: c, reason: collision with root package name */
    private ECommerceScreen f39031c;

    public String getIdentifier() {
        return this.f39030b;
    }

    public ECommerceScreen getScreen() {
        return this.f39031c;
    }

    public String getType() {
        return this.f39029a;
    }

    public ECommerceReferrer setIdentifier(String str) {
        this.f39030b = str;
        return this;
    }

    public ECommerceReferrer setScreen(ECommerceScreen eCommerceScreen) {
        this.f39031c = eCommerceScreen;
        return this;
    }

    public ECommerceReferrer setType(String str) {
        this.f39029a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f39029a + "', identifier='" + this.f39030b + "', screen=" + this.f39031c + '}';
    }
}

package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class md1 extends ig<String, String> {

    /* renamed from: a, reason: collision with root package name */
    private final lr1 f30355a;

    public md1(lr1 reviewCountFormatter) {
        kotlin.jvm.internal.l.f(reviewCountFormatter, "reviewCountFormatter");
        this.f30355a = reviewCountFormatter;
    }

    @Override // com.yandex.mobile.ads.impl.ig
    public final ag a(Object obj, String name) {
        String value = (String) obj;
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(value, "value");
        if ("review_count".equals(name)) {
            try {
                value = this.f30355a.a(value);
            } catch (k61 unused) {
            }
        }
        return ig.a(name, "string", value);
    }
}

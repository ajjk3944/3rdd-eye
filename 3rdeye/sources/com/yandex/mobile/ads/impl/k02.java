package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class k02 implements InterfaceC4200t {

    /* renamed from: a, reason: collision with root package name */
    private final String f29458a;

    /* renamed from: b, reason: collision with root package name */
    private final List<n02> f29459b;

    public k02(String actionType, ArrayList items) {
        kotlin.jvm.internal.l.f(actionType, "actionType");
        kotlin.jvm.internal.l.f(items, "items");
        this.f29458a = actionType;
        this.f29459b = items;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4200t
    public final String a() {
        return this.f29458a;
    }

    public final List<n02> c() {
        return this.f29459b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k02)) {
            return false;
        }
        k02 k02Var = (k02) obj;
        return kotlin.jvm.internal.l.b(this.f29458a, k02Var.f29458a) && kotlin.jvm.internal.l.b(this.f29459b, k02Var.f29459b);
    }

    public final int hashCode() {
        return this.f29459b.hashCode() + (this.f29458a.hashCode() * 31);
    }

    public final String toString() {
        return "SocialAction(actionType=" + this.f29458a + ", items=" + this.f29459b + ")";
    }
}

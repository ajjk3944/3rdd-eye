package com.ui.wifiman.ui.component.network;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: com.ui.wifiman.ui.component.network.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5213k {

    /* renamed from: a, reason: collision with root package name */
    private final C5211i f44501a;

    /* renamed from: b, reason: collision with root package name */
    private final List f44502b;

    public C5213k(C5211i initialEndpoint, List items) {
        AbstractC6492s.i(initialEndpoint, "initialEndpoint");
        AbstractC6492s.i(items, "items");
        this.f44501a = initialEndpoint;
        this.f44502b = items;
    }

    public final C5211i a() {
        return this.f44501a;
    }

    public final List b() {
        return this.f44502b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5213k)) {
            return false;
        }
        C5213k c5213k = (C5213k) obj;
        return AbstractC6492s.d(this.f44501a, c5213k.f44501a) && AbstractC6492s.d(this.f44502b, c5213k.f44502b);
    }

    public int hashCode() {
        return (this.f44501a.hashCode() * 31) + this.f44502b.hashCode();
    }

    public String toString() {
        return "Model(initialEndpoint=" + this.f44501a + ", items=" + this.f44502b + ")";
    }
}

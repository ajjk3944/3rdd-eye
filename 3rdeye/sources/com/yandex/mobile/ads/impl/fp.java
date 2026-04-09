package com.yandex.mobile.ads.impl;

import N7.C1154e9;

/* loaded from: classes3.dex */
public final class fp implements InterfaceC4200t {

    /* renamed from: a, reason: collision with root package name */
    private final String f27417a;

    public fp(String actionType) {
        kotlin.jvm.internal.l.f(actionType, "actionType");
        this.f27417a = actionType;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4200t
    public final String a() {
        return this.f27417a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fp) && kotlin.jvm.internal.l.b(this.f27417a, ((fp) obj).f27417a);
    }

    public final int hashCode() {
        return this.f27417a.hashCode();
    }

    public final String toString() {
        return C1154e9.i("CloseAction(actionType=", this.f27417a, ")");
    }
}

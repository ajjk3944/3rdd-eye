package com.yandex.mobile.ads.impl;

import N7.C1154e9;

/* loaded from: classes3.dex */
public final class ra {

    /* renamed from: a, reason: collision with root package name */
    private final String f32569a;

    public ra() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ra) && kotlin.jvm.internal.l.b(this.f32569a, ((ra) obj).f32569a);
    }

    public final int hashCode() {
        String str = this.f32569a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return C1154e9.i("AdditionalInfo(skuId=", this.f32569a, ")");
    }

    public /* synthetic */ ra(int i) {
        this((String) null);
    }

    public ra(String str) {
        this.f32569a = str;
    }
}

package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class dw1 implements pr1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f26507a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26508b;

    public dw1(int i, String type) {
        kotlin.jvm.internal.l.f(type, "type");
        this.f26507a = i;
        this.f26508b = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw1)) {
            return false;
        }
        dw1 dw1Var = (dw1) obj;
        return this.f26507a == dw1Var.f26507a && kotlin.jvm.internal.l.b(this.f26508b, dw1Var.f26508b);
    }

    @Override // com.yandex.mobile.ads.impl.pr1
    public final int getAmount() {
        return this.f26507a;
    }

    @Override // com.yandex.mobile.ads.impl.pr1
    public final String getType() {
        return this.f26508b;
    }

    public final int hashCode() {
        return this.f26508b.hashCode() + (this.f26507a * 31);
    }

    public final String toString() {
        return "SdkReward(amount=" + this.f26507a + ", type=" + this.f26508b + ")";
    }
}

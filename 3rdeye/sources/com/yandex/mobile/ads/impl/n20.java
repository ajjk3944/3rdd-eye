package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class n20 {

    /* renamed from: a, reason: collision with root package name */
    private final o20 f30741a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30742b;

    public n20(o20 type, String assetName) {
        kotlin.jvm.internal.l.f(type, "type");
        kotlin.jvm.internal.l.f(assetName, "assetName");
        this.f30741a = type;
        this.f30742b = assetName;
    }

    public final String a() {
        return this.f30742b;
    }

    public final o20 b() {
        return this.f30741a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n20)) {
            return false;
        }
        n20 n20Var = (n20) obj;
        return this.f30741a == n20Var.f30741a && kotlin.jvm.internal.l.b(this.f30742b, n20Var.f30742b);
    }

    public final int hashCode() {
        return this.f30742b.hashCode() + (this.f30741a.hashCode() * 31);
    }

    public final String toString() {
        return "DivKitAsset(type=" + this.f30741a + ", assetName=" + this.f30742b + ")";
    }
}

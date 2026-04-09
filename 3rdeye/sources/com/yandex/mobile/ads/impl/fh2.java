package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class fh2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f27338a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27339b;

    public fh2(int i, String adUnitId) {
        kotlin.jvm.internal.l.f(adUnitId, "adUnitId");
        this.f27338a = adUnitId;
        this.f27339b = i;
    }

    public final String a() {
        return this.f27338a;
    }

    public final int b() {
        return this.f27339b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh2)) {
            return false;
        }
        fh2 fh2Var = (fh2) obj;
        return kotlin.jvm.internal.l.b(this.f27338a, fh2Var.f27338a) && this.f27339b == fh2Var.f27339b;
    }

    public final int hashCode() {
        return this.f27339b + (this.f27338a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewSizeKey(adUnitId=" + this.f27338a + ", screenOrientation=" + this.f27339b + ")";
    }
}

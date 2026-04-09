package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class iu0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f28864a;

    /* renamed from: b, reason: collision with root package name */
    private final ju0 f28865b;

    public iu0(int i, ju0 mode) {
        kotlin.jvm.internal.l.f(mode, "mode");
        this.f28864a = i;
        this.f28865b = mode;
    }

    public final ju0 a() {
        return this.f28865b;
    }

    public final int b() {
        return this.f28864a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu0)) {
            return false;
        }
        iu0 iu0Var = (iu0) obj;
        return this.f28864a == iu0Var.f28864a && this.f28865b == iu0Var.f28865b;
    }

    public final int hashCode() {
        return this.f28865b.hashCode() + (this.f28864a * 31);
    }

    public final String toString() {
        return "MeasuredSizeSpec(value=" + this.f28864a + ", mode=" + this.f28865b + ")";
    }
}

package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ua0 {

    /* renamed from: a, reason: collision with root package name */
    private final jj0 f33990a;

    public ua0(jj0 jj0Var) {
        this.f33990a = jj0Var;
    }

    public final jj0 a() {
        return this.f33990a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ua0) && kotlin.jvm.internal.l.b(this.f33990a, ((ua0) obj).f33990a);
    }

    public final int hashCode() {
        jj0 jj0Var = this.f33990a;
        if (jj0Var == null) {
            return 0;
        }
        return jj0Var.hashCode();
    }

    public final String toString() {
        return "FeedbackValue(imageValue=" + this.f33990a + ")";
    }
}

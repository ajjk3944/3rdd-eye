package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class kd1 {

    /* renamed from: a, reason: collision with root package name */
    private final d62 f29635a;

    /* renamed from: b, reason: collision with root package name */
    private final a92 f29636b;

    public kd1(d62 notice, a92 validationResult) {
        kotlin.jvm.internal.l.f(notice, "notice");
        kotlin.jvm.internal.l.f(validationResult, "validationResult");
        this.f29635a = notice;
        this.f29636b = validationResult;
    }

    public final d62 a() {
        return this.f29635a;
    }

    public final a92 b() {
        return this.f29636b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd1)) {
            return false;
        }
        kd1 kd1Var = (kd1) obj;
        return kotlin.jvm.internal.l.b(this.f29635a, kd1Var.f29635a) && kotlin.jvm.internal.l.b(this.f29636b, kd1Var.f29636b);
    }

    public final int hashCode() {
        return this.f29636b.hashCode() + (this.f29635a.hashCode() * 31);
    }

    public final String toString() {
        return "NoticeValidationHolder(notice=" + this.f29635a + ", validationResult=" + this.f29636b + ")";
    }
}
